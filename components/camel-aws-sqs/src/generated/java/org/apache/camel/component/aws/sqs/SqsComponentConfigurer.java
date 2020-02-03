/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.sqs;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SqsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((SqsComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.sqs.SqsConfiguration.class, value)); return true;
        case "accessKey": ((SqsComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((SqsComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((SqsComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((SqsComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((SqsComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((SqsComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((SqsComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.sqs.SqsConfiguration.class, value)); return true;
        case "accesskey": ((SqsComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((SqsComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((SqsComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((SqsComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((SqsComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((SqsComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

