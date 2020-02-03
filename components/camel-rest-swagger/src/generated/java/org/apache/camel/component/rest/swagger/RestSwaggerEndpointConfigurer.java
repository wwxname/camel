/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest.swagger;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestSwaggerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "basePath": ((RestSwaggerEndpoint) target).setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "componentName": ((RestSwaggerEndpoint) target).setComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": ((RestSwaggerEndpoint) target).setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((RestSwaggerEndpoint) target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((RestSwaggerEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "produces": ((RestSwaggerEndpoint) target).setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((RestSwaggerEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((RestSwaggerEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "sslContextParameters": ((RestSwaggerEndpoint) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "basepath": ((RestSwaggerEndpoint) target).setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "componentname": ((RestSwaggerEndpoint) target).setComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": ((RestSwaggerEndpoint) target).setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((RestSwaggerEndpoint) target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((RestSwaggerEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "produces": ((RestSwaggerEndpoint) target).setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((RestSwaggerEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((RestSwaggerEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters": ((RestSwaggerEndpoint) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
            default: return false;
        }
    }

}

