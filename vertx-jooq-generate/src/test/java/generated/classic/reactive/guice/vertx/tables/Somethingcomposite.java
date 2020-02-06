/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.guice.vertx.tables;


import generated.classic.reactive.guice.vertx.Keys;
import generated.classic.reactive.guice.vertx.Vertx;
import generated.classic.reactive.guice.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.JsonObjectConverter;
import io.vertx.core.json.JsonObject;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Somethingcomposite extends TableImpl<SomethingcompositeRecord> {

    private static final long serialVersionUID = 315979618;

    /**
     * The reference instance of <code>vertx.somethingComposite</code>
     */
    public static final Somethingcomposite SOMETHINGCOMPOSITE = new Somethingcomposite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingcompositeRecord> getRecordType() {
        return SomethingcompositeRecord.class;
    }

    /**
     * The column <code>vertx.somethingComposite.someId</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMEID = createField(DSL.name("someId"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vertx.somethingComposite.someSecondId</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMESECONDID = createField(DSL.name("someSecondId"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vertx.somethingComposite.someJsonObject</code>.
     */
    public final TableField<SomethingcompositeRecord, JsonObject> SOMEJSONOBJECT = createField(DSL.name("someJsonObject"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "", new JsonObjectConverter());

    /**
     * Create a <code>vertx.somethingComposite</code> table reference
     */
    public Somethingcomposite() {
        this(DSL.name("somethingComposite"), null);
    }

    /**
     * Create an aliased <code>vertx.somethingComposite</code> table reference
     */
    public Somethingcomposite(String alias) {
        this(DSL.name(alias), SOMETHINGCOMPOSITE);
    }

    /**
     * Create an aliased <code>vertx.somethingComposite</code> table reference
     */
    public Somethingcomposite(Name alias) {
        this(alias, SOMETHINGCOMPOSITE);
    }

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Somethingcomposite(Table<O> child, ForeignKey<O, SomethingcompositeRecord> key) {
        super(child, key, SOMETHINGCOMPOSITE);
    }

    @Override
    public Schema getSchema() {
        return Vertx.VERTX;
    }

    @Override
    public UniqueKey<SomethingcompositeRecord> getPrimaryKey() {
        return Keys.SOMETHINGCOMPOSITE_PKEY;
    }

    @Override
    public List<UniqueKey<SomethingcompositeRecord>> getKeys() {
        return Arrays.<UniqueKey<SomethingcompositeRecord>>asList(Keys.SOMETHINGCOMPOSITE_PKEY);
    }

    @Override
    public Somethingcomposite as(String alias) {
        return new Somethingcomposite(DSL.name(alias), this);
    }

    @Override
    public Somethingcomposite as(Name alias) {
        return new Somethingcomposite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingcomposite rename(String name) {
        return new Somethingcomposite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingcomposite rename(Name name) {
        return new Somethingcomposite(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, JsonObject> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
