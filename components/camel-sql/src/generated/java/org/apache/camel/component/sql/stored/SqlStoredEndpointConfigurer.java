/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sql.stored;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SqlStoredEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "batch": ((SqlStoredEndpoint) target).setBatch(property(camelContext, boolean.class, value)); return true;
        case "dataSource": ((SqlStoredEndpoint) target).setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "function": ((SqlStoredEndpoint) target).setFunction(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((SqlStoredEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "noop": ((SqlStoredEndpoint) target).setNoop(property(camelContext, boolean.class, value)); return true;
        case "outputHeader": ((SqlStoredEndpoint) target).setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "useMessageBodyForTemplate": ((SqlStoredEndpoint) target).setUseMessageBodyForTemplate(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((SqlStoredEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SqlStoredEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "batch": ((SqlStoredEndpoint) target).setBatch(property(camelContext, boolean.class, value)); return true;
        case "datasource": ((SqlStoredEndpoint) target).setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "function": ((SqlStoredEndpoint) target).setFunction(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((SqlStoredEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "noop": ((SqlStoredEndpoint) target).setNoop(property(camelContext, boolean.class, value)); return true;
        case "outputheader": ((SqlStoredEndpoint) target).setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "usemessagebodyfortemplate": ((SqlStoredEndpoint) target).setUseMessageBodyForTemplate(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((SqlStoredEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SqlStoredEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

