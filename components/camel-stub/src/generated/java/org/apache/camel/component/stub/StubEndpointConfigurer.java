/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.stub;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class StubEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "size": ((StubEndpoint) target).setSize(property(camelContext, int.class, value)); return true;
        case "bridgeErrorHandler": ((StubEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentConsumers": ((StubEndpoint) target).setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "exceptionHandler": ((StubEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((StubEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "limitConcurrentConsumers": ((StubEndpoint) target).setLimitConcurrentConsumers(property(camelContext, boolean.class, value)); return true;
        case "multipleConsumers": ((StubEndpoint) target).setMultipleConsumers(property(camelContext, boolean.class, value)); return true;
        case "pollTimeout": ((StubEndpoint) target).setPollTimeout(property(camelContext, int.class, value)); return true;
        case "purgeWhenStopping": ((StubEndpoint) target).setPurgeWhenStopping(property(camelContext, boolean.class, value)); return true;
        case "blockWhenFull": ((StubEndpoint) target).setBlockWhenFull(property(camelContext, boolean.class, value)); return true;
        case "discardIfNoConsumers": ((StubEndpoint) target).setDiscardIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "discardWhenFull": ((StubEndpoint) target).setDiscardWhenFull(property(camelContext, boolean.class, value)); return true;
        case "failIfNoConsumers": ((StubEndpoint) target).setFailIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((StubEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "offerTimeout": ((StubEndpoint) target).setOfferTimeout(property(camelContext, long.class, value)); return true;
        case "timeout": ((StubEndpoint) target).setTimeout(property(camelContext, long.class, value)); return true;
        case "waitForTaskToComplete": ((StubEndpoint) target).setWaitForTaskToComplete(property(camelContext, org.apache.camel.WaitForTaskToComplete.class, value)); return true;
        case "basicPropertyBinding": ((StubEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "queue": ((StubEndpoint) target).setQueue(property(camelContext, java.util.concurrent.BlockingQueue.class, value)); return true;
        case "synchronous": ((StubEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "size": ((StubEndpoint) target).setSize(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler": ((StubEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers": ((StubEndpoint) target).setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "exceptionhandler": ((StubEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((StubEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "limitconcurrentconsumers": ((StubEndpoint) target).setLimitConcurrentConsumers(property(camelContext, boolean.class, value)); return true;
        case "multipleconsumers": ((StubEndpoint) target).setMultipleConsumers(property(camelContext, boolean.class, value)); return true;
        case "polltimeout": ((StubEndpoint) target).setPollTimeout(property(camelContext, int.class, value)); return true;
        case "purgewhenstopping": ((StubEndpoint) target).setPurgeWhenStopping(property(camelContext, boolean.class, value)); return true;
        case "blockwhenfull": ((StubEndpoint) target).setBlockWhenFull(property(camelContext, boolean.class, value)); return true;
        case "discardifnoconsumers": ((StubEndpoint) target).setDiscardIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "discardwhenfull": ((StubEndpoint) target).setDiscardWhenFull(property(camelContext, boolean.class, value)); return true;
        case "failifnoconsumers": ((StubEndpoint) target).setFailIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((StubEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "offertimeout": ((StubEndpoint) target).setOfferTimeout(property(camelContext, long.class, value)); return true;
        case "timeout": ((StubEndpoint) target).setTimeout(property(camelContext, long.class, value)); return true;
        case "waitfortasktocomplete": ((StubEndpoint) target).setWaitForTaskToComplete(property(camelContext, org.apache.camel.WaitForTaskToComplete.class, value)); return true;
        case "basicpropertybinding": ((StubEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "queue": ((StubEndpoint) target).setQueue(property(camelContext, java.util.concurrent.BlockingQueue.class, value)); return true;
        case "synchronous": ((StubEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

