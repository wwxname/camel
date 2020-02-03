/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.zookeeper;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ZooKeeperEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "listChildren": ((ZooKeeperEndpoint) target).getConfiguration().setListChildren(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((ZooKeeperEndpoint) target).getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "backoff": ((ZooKeeperEndpoint) target).getConfiguration().setBackoff(property(camelContext, long.class, value)); return true;
        case "bridgeErrorHandler": ((ZooKeeperEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "repeat": ((ZooKeeperEndpoint) target).getConfiguration().setRepeat(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageOnDelete": ((ZooKeeperEndpoint) target).getConfiguration().setSendEmptyMessageOnDelete(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((ZooKeeperEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((ZooKeeperEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "create": ((ZooKeeperEndpoint) target).getConfiguration().setCreate(property(camelContext, boolean.class, value)); return true;
        case "createMode": ((ZooKeeperEndpoint) target).getConfiguration().setCreateMode(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((ZooKeeperEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((ZooKeeperEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ZooKeeperEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "listchildren": ((ZooKeeperEndpoint) target).getConfiguration().setListChildren(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((ZooKeeperEndpoint) target).getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "backoff": ((ZooKeeperEndpoint) target).getConfiguration().setBackoff(property(camelContext, long.class, value)); return true;
        case "bridgeerrorhandler": ((ZooKeeperEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "repeat": ((ZooKeeperEndpoint) target).getConfiguration().setRepeat(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessageondelete": ((ZooKeeperEndpoint) target).getConfiguration().setSendEmptyMessageOnDelete(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((ZooKeeperEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((ZooKeeperEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "create": ((ZooKeeperEndpoint) target).getConfiguration().setCreate(property(camelContext, boolean.class, value)); return true;
        case "createmode": ((ZooKeeperEndpoint) target).getConfiguration().setCreateMode(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((ZooKeeperEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((ZooKeeperEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ZooKeeperEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

