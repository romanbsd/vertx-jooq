/*
 * This file is generated by jOOQ.
 */
package generated.rx.async.regular.tables;


import generated.rx.async.regular.Indexes;
import generated.rx.async.regular.Keys;
import generated.rx.async.regular.Vertx;
import generated.rx.async.regular.tables.records.SomethingwithoutjsonRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class Somethingwithoutjson extends TableImpl<SomethingwithoutjsonRecord> {

    private static final long serialVersionUID = 358604759;

    /**
     * The reference instance of <code>vertx.somethingWithoutJson</code>
     */
    public static final Somethingwithoutjson SOMETHINGWITHOUTJSON = new Somethingwithoutjson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingwithoutjsonRecord> getRecordType() {
        return SomethingwithoutjsonRecord.class;
    }

    /**
     * The column <code>vertx.somethingWithoutJson.someId</code>.
     */
    public final TableField<SomethingwithoutjsonRecord, Integer> SOMEID = createField(DSL.name("someId"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vertx.somethingWithoutJson.someString</code>.
     */
    public final TableField<SomethingwithoutjsonRecord, String> SOMESTRING = createField(DSL.name("someString"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * Create a <code>vertx.somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson() {
        this(DSL.name("somethingWithoutJson"), null);
    }

    /**
     * Create an aliased <code>vertx.somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson(String alias) {
        this(DSL.name(alias), SOMETHINGWITHOUTJSON);
    }

    /**
     * Create an aliased <code>vertx.somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson(Name alias) {
        this(alias, SOMETHINGWITHOUTJSON);
    }

    private Somethingwithoutjson(Name alias, Table<SomethingwithoutjsonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Somethingwithoutjson(Name alias, Table<SomethingwithoutjsonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Somethingwithoutjson(Table<O> child, ForeignKey<O, SomethingwithoutjsonRecord> key) {
        super(child, key, SOMETHINGWITHOUTJSON);
    }

    @Override
    public Schema getSchema() {
        return Vertx.VERTX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SOMETHINGWITHOUTJSON_PRIMARY);
    }

    @Override
    public Identity<SomethingwithoutjsonRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SOMETHINGWITHOUTJSON;
    }

    @Override
    public UniqueKey<SomethingwithoutjsonRecord> getPrimaryKey() {
        return Keys.KEY_SOMETHINGWITHOUTJSON_PRIMARY;
    }

    @Override
    public List<UniqueKey<SomethingwithoutjsonRecord>> getKeys() {
        return Arrays.<UniqueKey<SomethingwithoutjsonRecord>>asList(Keys.KEY_SOMETHINGWITHOUTJSON_PRIMARY);
    }

    @Override
    public Somethingwithoutjson as(String alias) {
        return new Somethingwithoutjson(DSL.name(alias), this);
    }

    @Override
    public Somethingwithoutjson as(Name alias) {
        return new Somethingwithoutjson(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingwithoutjson rename(String name) {
        return new Somethingwithoutjson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingwithoutjson rename(Name name) {
        return new Somethingwithoutjson(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
