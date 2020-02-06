/*
 * This file is generated by jOOQ.
 */
package generated.cf.jdbc.guice.vertx;


import generated.cf.jdbc.guice.vertx.tables.Something;
import generated.cf.jdbc.guice.vertx.tables.Somethingcomposite;
import generated.cf.jdbc.guice.vertx.tables.records.SomethingRecord;
import generated.cf.jdbc.guice.vertx.tables.records.SomethingcompositeRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>VERTX</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<SomethingRecord, Integer> IDENTITY_SOMETHING = Identities0.IDENTITY_SOMETHING;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SomethingRecord> SYS_PK_10250 = UniqueKeys0.SYS_PK_10250;
    public static final UniqueKey<SomethingcompositeRecord> SYS_PK_10254 = UniqueKeys0.SYS_PK_10254;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<SomethingRecord, Integer> IDENTITY_SOMETHING = Internal.createIdentity(Something.SOMETHING, Something.SOMETHING.SOMEID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<SomethingRecord> SYS_PK_10250 = Internal.createUniqueKey(Something.SOMETHING, "SYS_PK_10250", Something.SOMETHING.SOMEID);
        public static final UniqueKey<SomethingcompositeRecord> SYS_PK_10254 = Internal.createUniqueKey(Somethingcomposite.SOMETHINGCOMPOSITE, "SYS_PK_10254", Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID);
    }
}
