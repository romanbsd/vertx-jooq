/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.guice.vertx;


import generated.classic.reactive.guice.DefaultCatalog;
import generated.classic.reactive.guice.vertx.tables.Something;
import generated.classic.reactive.guice.vertx.tables.Somethingcomposite;
import generated.classic.reactive.guice.vertx.tables.Somethingwithoutjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Vertx extends SchemaImpl {

    private static final long serialVersionUID = 1150329653;

    /**
     * The reference instance of <code>vertx</code>
     */
    public static final Vertx VERTX = new Vertx();

    /**
     * The table <code>vertx.something</code>.
     */
    public final Something SOMETHING = generated.classic.reactive.guice.vertx.tables.Something.SOMETHING;

    /**
     * The table <code>vertx.somethingComposite</code>.
     */
    public final Somethingcomposite SOMETHINGCOMPOSITE = generated.classic.reactive.guice.vertx.tables.Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * The table <code>vertx.somethingWithoutJson</code>.
     */
    public final Somethingwithoutjson SOMETHINGWITHOUTJSON = generated.classic.reactive.guice.vertx.tables.Somethingwithoutjson.SOMETHINGWITHOUTJSON;

    /**
     * No further instances allowed
     */
    private Vertx() {
        super("vertx", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Something.SOMETHING,
            Somethingcomposite.SOMETHINGCOMPOSITE,
            Somethingwithoutjson.SOMETHINGWITHOUTJSON);
    }
}
