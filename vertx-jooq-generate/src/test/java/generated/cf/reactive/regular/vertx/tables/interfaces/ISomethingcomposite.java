/*
 * This file is generated by jOOQ.
 */
package generated.cf.reactive.regular.vertx.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISomethingcomposite extends VertxPojo, Serializable {

    /**
     * Setter for <code>vertx.somethingComposite.someId</code>.
     */
    public ISomethingcomposite setSomeid(Integer value);

    /**
     * Getter for <code>vertx.somethingComposite.someId</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>vertx.somethingComposite.someSecondId</code>.
     */
    public ISomethingcomposite setSomesecondid(Integer value);

    /**
     * Getter for <code>vertx.somethingComposite.someSecondId</code>.
     */
    public Integer getSomesecondid();

    /**
     * Setter for <code>vertx.somethingComposite.someJsonObject</code>.
     */
    public ISomethingcomposite setSomejsonobject(JsonObject value);

    /**
     * Getter for <code>vertx.somethingComposite.someJsonObject</code>.
     */
    public JsonObject getSomejsonobject();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISomethingcomposite
     */
    public void from(generated.cf.reactive.regular.vertx.tables.interfaces.ISomethingcomposite from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISomethingcomposite
     */
    public <E extends generated.cf.reactive.regular.vertx.tables.interfaces.ISomethingcomposite> E into(E into);

    @Override
    public default ISomethingcomposite fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setSomeid(json.getInteger("someId"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("someId","java.lang.Integer",e);
        }
        try {
            setSomesecondid(json.getInteger("someSecondId"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("someSecondId","java.lang.Integer",e);
        }
        try {
            setSomejsonobject(json.getJsonObject("someJsonObject"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("someJsonObject","io.vertx.core.json.JsonObject",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("someId",getSomeid());
        json.put("someSecondId",getSomesecondid());
        json.put("someJsonObject",getSomejsonobject());
        return json;
    }

}
