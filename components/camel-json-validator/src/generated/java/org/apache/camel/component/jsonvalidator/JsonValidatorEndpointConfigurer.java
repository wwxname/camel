/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jsonvalidator;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JsonValidatorEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "contentCache": ((JsonValidatorEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "failOnNullBody": ((JsonValidatorEndpoint) target).setFailOnNullBody(property(camelContext, boolean.class, value)); return true;
        case "failOnNullHeader": ((JsonValidatorEndpoint) target).setFailOnNullHeader(property(camelContext, boolean.class, value)); return true;
        case "headerName": ((JsonValidatorEndpoint) target).setHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((JsonValidatorEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((JsonValidatorEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "errorHandler": ((JsonValidatorEndpoint) target).setErrorHandler(property(camelContext, org.apache.camel.component.jsonvalidator.JsonValidatorErrorHandler.class, value)); return true;
        case "schemaLoader": ((JsonValidatorEndpoint) target).setSchemaLoader(property(camelContext, org.apache.camel.component.jsonvalidator.JsonSchemaLoader.class, value)); return true;
        case "synchronous": ((JsonValidatorEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "contentcache": ((JsonValidatorEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "failonnullbody": ((JsonValidatorEndpoint) target).setFailOnNullBody(property(camelContext, boolean.class, value)); return true;
        case "failonnullheader": ((JsonValidatorEndpoint) target).setFailOnNullHeader(property(camelContext, boolean.class, value)); return true;
        case "headername": ((JsonValidatorEndpoint) target).setHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((JsonValidatorEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((JsonValidatorEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "errorhandler": ((JsonValidatorEndpoint) target).setErrorHandler(property(camelContext, org.apache.camel.component.jsonvalidator.JsonValidatorErrorHandler.class, value)); return true;
        case "schemaloader": ((JsonValidatorEndpoint) target).setSchemaLoader(property(camelContext, org.apache.camel.component.jsonvalidator.JsonSchemaLoader.class, value)); return true;
        case "synchronous": ((JsonValidatorEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

