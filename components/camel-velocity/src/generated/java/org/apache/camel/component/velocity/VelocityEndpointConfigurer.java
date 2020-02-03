/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.velocity;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VelocityEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "contentCache": ((VelocityEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "encoding": ((VelocityEndpoint) target).setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((VelocityEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loaderCache": ((VelocityEndpoint) target).setLoaderCache(property(camelContext, boolean.class, value)); return true;
        case "propertiesFile": ((VelocityEndpoint) target).setPropertiesFile(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((VelocityEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((VelocityEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "contentcache": ((VelocityEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "encoding": ((VelocityEndpoint) target).setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((VelocityEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loadercache": ((VelocityEndpoint) target).setLoaderCache(property(camelContext, boolean.class, value)); return true;
        case "propertiesfile": ((VelocityEndpoint) target).setPropertiesFile(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((VelocityEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((VelocityEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

