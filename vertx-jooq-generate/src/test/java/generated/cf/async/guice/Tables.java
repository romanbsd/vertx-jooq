/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.guice;


import generated.cf.async.guice.tables.Something;
import generated.cf.async.guice.tables.Somethingcomposite;
import generated.cf.async.guice.tables.Somethingwithoutjson;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>something</code>.
     */
    public static final Something SOMETHING = generated.cf.async.guice.tables.Something.SOMETHING;

    /**
     * The table <code>somethingComposite</code>.
     */
    public static final Somethingcomposite SOMETHINGCOMPOSITE = generated.cf.async.guice.tables.Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * The table <code>somethingWithoutJson</code>.
     */
    public static final Somethingwithoutjson SOMETHINGWITHOUTJSON = generated.cf.async.guice.tables.Somethingwithoutjson.SOMETHINGWITHOUTJSON;
}