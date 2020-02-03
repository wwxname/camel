/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.ecs;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ECSComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((ECSComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.ecs.ECSConfiguration.class, value)); return true;
        case "accessKey": ((ECSComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((ECSComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((ECSComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((ECSComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((ECSComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((ECSComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.ecs.ECSConfiguration.class, value)); return true;
        case "accesskey": ((ECSComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((ECSComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((ECSComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((ECSComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((ECSComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

