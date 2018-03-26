/*
 * This file is generated by jOOQ.
*/
package generated.rx.async.regular.tables.daos;


import generated.rx.async.regular.tables.Somethingcomposite;
import generated.rx.async.regular.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.async.AbstractAsyncVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;


import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.async.AsyncRXQueryExecutor;
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
public class SomethingcompositeDao extends AbstractAsyncVertxDAO<SomethingcompositeRecord, generated.rx.async.regular.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, Single<List<generated.rx.async.regular.tables.pojos.Somethingcomposite>>, Single<Optional<generated.rx.async.regular.tables.pojos.Somethingcomposite>>, Single<Integer>, Single<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<SomethingcompositeRecord,generated.rx.async.regular.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingcompositeDao(Configuration configuration,io.vertx.reactivex.ext.asyncsql.AsyncSQLClient delegate) {
        super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.rx.async.regular.tables.pojos.Somethingcomposite.class, new AsyncRXQueryExecutor<SomethingcompositeRecord,generated.rx.async.regular.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(delegate,generated.rx.async.regular.tables.pojos.Somethingcomposite::new, Somethingcomposite.SOMETHINGCOMPOSITE), configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(generated.rx.async.regular.tables.pojos.Somethingcomposite object) {
        return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
    }

    /**
     * Find records that have <code>someSecondId IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.async.regular.tables.pojos.Somethingcomposite>> findManyBySomesecondid(List<Integer> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
    }

    /**
     * Find records that have <code>someJsonObject IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.async.regular.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
    }

    @Override
    public Single<Record2<Integer, Integer>> insertReturningPrimary(generated.rx.async.regular.tables.pojos.Somethingcomposite pojo){
        return Single.<Record2<Integer, Integer>>error(new UnsupportedOperationException("PK not numeric"));
    }
}
