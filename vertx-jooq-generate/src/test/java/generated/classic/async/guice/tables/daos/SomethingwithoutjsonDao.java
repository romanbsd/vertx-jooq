/*
 * This file is generated by jOOQ.
*/
package generated.classic.async.guice.tables.daos;


import generated.classic.async.guice.tables.Somethingwithoutjson;
import generated.classic.async.guice.tables.records.SomethingwithoutjsonRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.async.AbstractAsyncVertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class SomethingwithoutjsonDao extends AbstractAsyncVertxDAO<SomethingwithoutjsonRecord, generated.classic.async.guice.tables.pojos.Somethingwithoutjson, Integer, Future<List<generated.classic.async.guice.tables.pojos.Somethingwithoutjson>>, Future<generated.classic.async.guice.tables.pojos.Somethingwithoutjson>, Future<Integer>, Future<Integer>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingwithoutjsonRecord,generated.classic.async.guice.tables.pojos.Somethingwithoutjson,Integer> {
    @javax.inject.Inject

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingwithoutjsonDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON, generated.classic.async.guice.tables.pojos.Somethingwithoutjson.class, new AsyncClassicQueryExecutor<SomethingwithoutjsonRecord,generated.classic.async.guice.tables.pojos.Somethingwithoutjson,Integer>(delegate,generated.classic.async.guice.tables.pojos.Somethingwithoutjson::new, Somethingwithoutjson.SOMETHINGWITHOUTJSON), configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.classic.async.guice.tables.pojos.Somethingwithoutjson object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.guice.tables.pojos.Somethingwithoutjson>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING.in(values));
    }

    @Override
    protected java.util.function.Function<Object,Integer> keyConverter(){
        return lastId -> Integer.valueOf(((Long)lastId).intValue());
    }
}
