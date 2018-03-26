/*
 * This file is generated by jOOQ.
*/
package generated.cf.jdbc.regular.vertx.tables.daos;


import generated.cf.jdbc.regular.vertx.tables.Somethingcomposite;
import generated.cf.jdbc.regular.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO;
import io.github.jklingsporn.vertx.jooq.completablefuture.jdbc.JDBCCompletableFutureQueryExecutor;
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
public class SomethingcompositeDao extends AbstractVertxDAO<SomethingcompositeRecord, generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, CompletableFuture<List<generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite>>, CompletableFuture<generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite>, CompletableFuture<Integer>, CompletableFuture<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO<SomethingcompositeRecord,generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public SomethingcompositeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite.class, new JDBCCompletableFutureQueryExecutor<SomethingcompositeRecord,generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite.class,configuration,vertx), configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite object) {
        return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
    }

    /**
     * Find records that have <code>SOMESECONDID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite>> findManyBySomesecondid(List<Integer> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
    }

    /**
     * Find records that have <code>SOMEJSONOBJECT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.jdbc.regular.vertx.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
    }
}
