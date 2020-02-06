/*
 * This file is generated by jOOQ.
 */
package generated.cf.async.regular.tables.daos;


import generated.cf.async.regular.enums.SomethingSomeenum;
import generated.cf.async.regular.tables.Something;
import generated.cf.async.regular.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO;
import io.github.jklingsporn.vertx.jooq.completablefuture.async.AsyncCompletableFutureQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingDao extends AbstractAsyncVertxDAO<SomethingRecord, generated.cf.async.regular.tables.pojos.Something, Integer, CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>>, CompletableFuture<generated.cf.async.regular.tables.pojos.Something>, CompletableFuture<Integer>, CompletableFuture<Integer>> implements io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO<SomethingRecord,generated.cf.async.regular.tables.pojos.Something,Integer> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param vertx the vertx instance
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingDao(Configuration configuration, io.vertx.core.Vertx vertx, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(Something.SOMETHING, generated.cf.async.regular.tables.pojos.Something.class, new AsyncCompletableFutureQueryExecutor<SomethingRecord,generated.cf.async.regular.tables.pojos.Something,Integer>(configuration,vertx,delegate,generated.cf.async.regular.tables.pojos.Something::new, Something.SOMETHING));
    }

    @Override
    protected Integer getId(generated.cf.async.regular.tables.pojos.Something object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values));
    }

    /**
     * Find records that have <code>someHugeNumber IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomehugenumber(List<Long> values) {
        return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values));
    }

    /**
     * Find records that have <code>someSmallNumber IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomesmallnumber(List<Short> values) {
        return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values));
    }

    /**
     * Find records that have <code>someRegularNumber IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomeregularnumber(List<Integer> values) {
        return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values));
    }

    /**
     * Find records that have <code>someDouble IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomedouble(List<Double> values) {
        return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values));
    }

    /**
     * Find records that have <code>someEnum IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomeenum(List<SomethingSomeenum> values) {
        return findManyByCondition(Something.SOMETHING.SOMEENUM.in(values));
    }

    /**
     * Find records that have <code>someJsonObject IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values));
    }

    /**
     * Find records that have <code>someJsonArray IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySomejsonarray(List<JsonArray> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values));
    }

    /**
     * Find records that have <code>someTimestamp IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.async.regular.tables.pojos.Something>> findManyBySometimestamp(List<LocalDateTime> values) {
        return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values));
    }

    @Override
    public AsyncCompletableFutureQueryExecutor<SomethingRecord,generated.cf.async.regular.tables.pojos.Something,Integer> queryExecutor(){
        return (AsyncCompletableFutureQueryExecutor<SomethingRecord,generated.cf.async.regular.tables.pojos.Something,Integer>) super.queryExecutor();
    }

    @Override
    protected java.util.function.Function<Object,Integer> keyConverter(){
        return lastId -> Integer.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).intValue());
    }
}
