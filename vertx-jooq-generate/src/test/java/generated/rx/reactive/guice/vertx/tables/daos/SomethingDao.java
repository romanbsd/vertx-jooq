/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.guice.vertx.tables.daos;


import generated.rx.reactive.guice.vertx.enums.Someenum;
import generated.rx.reactive.guice.vertx.tables.Something;
import generated.rx.reactive.guice.vertx.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.reactivepg.ReactiveRXQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class SomethingDao extends AbstractReactiveVertxDAO<SomethingRecord, generated.rx.reactive.guice.vertx.tables.pojos.Something, Integer, Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>>, Single<Optional<generated.rx.reactive.guice.vertx.tables.pojos.Something>>, Single<Integer>, Single<Integer>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<SomethingRecord,generated.rx.reactive.guice.vertx.tables.pojos.Something,Integer> {
    @javax.inject.Inject

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public SomethingDao(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
        super(Something.SOMETHING, generated.rx.reactive.guice.vertx.tables.pojos.Something.class, new ReactiveRXQueryExecutor<SomethingRecord,generated.rx.reactive.guice.vertx.tables.pojos.Something,Integer>(configuration,delegate,generated.rx.reactive.guice.vertx.tables.mappers.RowMappers.getSomethingMapper()));
    }

    @Override
    protected Integer getId(generated.rx.reactive.guice.vertx.tables.pojos.Something object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomestring(Collection<String> values) {
        return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values));
    }

    /**
     * Find records that have <code>someHugeNumber IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomehugenumber(Collection<Long> values) {
        return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values));
    }

    /**
     * Find records that have <code>someSmallNumber IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomesmallnumber(Collection<Short> values) {
        return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values));
    }

    /**
     * Find records that have <code>someRegularNumber IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomeregularnumber(Collection<Integer> values) {
        return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values));
    }

    /**
     * Find records that have <code>someDouble IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomedouble(Collection<Double> values) {
        return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values));
    }

    /**
     * Find records that have <code>someEnum IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomeenum(Collection<Someenum> values) {
        return findManyByCondition(Something.SOMETHING.SOMEENUM.in(values));
    }

    /**
     * Find records that have <code>someJsonObject IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomejsonobject(Collection<JsonObject> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values));
    }

    /**
     * Find records that have <code>someJsonArray IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySomejsonarray(Collection<JsonArray> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values));
    }

    /**
     * Find records that have <code>someTimestamp IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.reactive.guice.vertx.tables.pojos.Something>> findManyBySometimestamp(Collection<LocalDateTime> values) {
        return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values));
    }

    @Override
    public ReactiveRXQueryExecutor<SomethingRecord,generated.rx.reactive.guice.vertx.tables.pojos.Something,Integer> queryExecutor(){
        return (ReactiveRXQueryExecutor<SomethingRecord,generated.rx.reactive.guice.vertx.tables.pojos.Something,Integer>) super.queryExecutor();
    }
}
