package io.github.jklingsporn.vertx.jooq.classic.async;

import io.github.jklingsporn.vertx.jooq.shared.internal.QueryExecutor;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import io.vertx.ext.sql.UpdateResult;
import org.jooq.InsertResultStep;
import org.jooq.Query;
import org.jooq.ResultQuery;
import org.jooq.UpdatableRecord;
import org.jooq.conf.ParamType;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by jensklingsporn on 07.02.18.
 */
public class AsyncClassicQueryExecutor<R extends UpdatableRecord<R>,P,T> extends AsyncClassicGenericQueryExecutor implements QueryExecutor<R,T,Future<List<P>>,Future<P>,Future<Integer>,Future<T>> {

    private final Function<JsonObject,P> pojoMapper;

    public AsyncClassicQueryExecutor(AsyncSQLClient delegate, Function<JsonObject, P> pojoMapper) {
        super(delegate);
        this.pojoMapper = pojoMapper;
    }


    @Override
    public Future<List<P>> findMany(ResultQuery<R> query) {
        return findManyJson(query).map(ls -> ls.stream().map(pojoMapper).collect(Collectors.toList()));
    }

    @Override
    public Future<P> findOne(ResultQuery<R> query) {
        return findOneJson(query).map(val -> val == null?null:pojoMapper.apply(val));
    }

    @Override
    public Future<Integer> execute(Query query) {
        return getConnection().compose(sqlConnection -> {
            log("Execute", () -> query.getSQL(ParamType.INLINED));
            Future<Integer> future = Future.future();
            sqlConnection.updateWithParams(
                    query.getSQL(),
                    getBindValues(query),
                    this.<UpdateResult,Integer>executeAndClose(UpdateResult::getUpdated,
                            sqlConnection,
                            future)
            );
            return future;
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    public Future<T> insertReturning(InsertResultStep<R> query, Function<Object, T> keyMapper) {
        return getConnection().compose(sqlConnection->{
            log("Insert Returning", ()-> query.getSQL(ParamType.INLINED));
            Future<Object> future = Future.future();
            sqlConnection.update(
                    query.getSQL(ParamType.INLINED),
                    this.<UpdateResult,Object>executeAndClose(res -> res.getKeys().getLong(0),
                            sqlConnection,
                            future)
            );
            return future.map(keyMapper);
        });
    }

}
