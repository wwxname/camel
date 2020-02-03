/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.queue;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixQueueComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((AtomixQueueComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.atomix.client.queue.AtomixQueueConfiguration.class, value)); return true;
        case "atomix": ((AtomixQueueComponent) target).setAtomix(property(camelContext, io.atomix.AtomixClient.class, value)); return true;
        case "nodes": ((AtomixQueueComponent) target).setNodes(property(camelContext, java.util.List.class, value)); return true;
        case "configurationUri": ((AtomixQueueComponent) target).setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((AtomixQueueComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((AtomixQueueComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((AtomixQueueComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((AtomixQueueComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.atomix.client.queue.AtomixQueueConfiguration.class, value)); return true;
        case "atomix": ((AtomixQueueComponent) target).setAtomix(property(camelContext, io.atomix.AtomixClient.class, value)); return true;
        case "nodes": ((AtomixQueueComponent) target).setNodes(property(camelContext, java.util.List.class, value)); return true;
        case "configurationuri": ((AtomixQueueComponent) target).setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((AtomixQueueComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((AtomixQueueComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((AtomixQueueComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

