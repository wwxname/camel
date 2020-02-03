/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.spark;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SparkComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "rdd": ((SparkComponent) target).setRdd(property(camelContext, org.apache.spark.api.java.JavaRDDLike.class, value)); return true;
        case "rddCallback": ((SparkComponent) target).setRddCallback(property(camelContext, org.apache.camel.component.spark.RddCallback.class, value)); return true;
        case "basicPropertyBinding": ((SparkComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((SparkComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "rdd": ((SparkComponent) target).setRdd(property(camelContext, org.apache.spark.api.java.JavaRDDLike.class, value)); return true;
        case "rddcallback": ((SparkComponent) target).setRddCallback(property(camelContext, org.apache.camel.component.spark.RddCallback.class, value)); return true;
        case "basicpropertybinding": ((SparkComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((SparkComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

