/*
 * This file is generated by jOOQ.
 */
package generated.classic.async.guice.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum SomethingSomeenum implements EnumType {

    FOO("FOO"),

    BAR("BAR"),

    BAZ("BAZ");

    private final String literal;

    private SomethingSomeenum(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "something_someEnum";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
