/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nagios;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NagiosEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "connectionTimeout": ((NagiosEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "lazyStartProducer": ((NagiosEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sendSync": ((NagiosEndpoint) target).setSendSync(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((NagiosEndpoint) target).getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "basicPropertyBinding": ((NagiosEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((NagiosEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "encryption": ((NagiosEndpoint) target).getConfiguration().setEncryption(property(camelContext, com.googlecode.jsendnsca.encryption.Encryption.class, value)); return true;
        case "password": ((NagiosEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "connectiontimeout": ((NagiosEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "lazystartproducer": ((NagiosEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sendsync": ((NagiosEndpoint) target).setSendSync(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((NagiosEndpoint) target).getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding": ((NagiosEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((NagiosEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "encryption": ((NagiosEndpoint) target).getConfiguration().setEncryption(property(camelContext, com.googlecode.jsendnsca.encryption.Encryption.class, value)); return true;
        case "password": ((NagiosEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

