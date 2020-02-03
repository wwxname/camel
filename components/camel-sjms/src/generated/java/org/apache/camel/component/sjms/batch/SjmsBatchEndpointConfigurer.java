/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms.batch;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SjmsBatchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "aggregationStrategy": ((SjmsBatchEndpoint) target).setAggregationStrategy(property(camelContext, org.apache.camel.AggregationStrategy.class, value)); return true;
        case "allowNullBody": ((SjmsBatchEndpoint) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((SjmsBatchEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "completionInterval": ((SjmsBatchEndpoint) target).setCompletionInterval(property(camelContext, int.class, value)); return true;
        case "completionPredicate": ((SjmsBatchEndpoint) target).setCompletionPredicate(property(camelContext, java.lang.String.class, value)); return true;
        case "completionSize": ((SjmsBatchEndpoint) target).setCompletionSize(property(camelContext, int.class, value)); return true;
        case "completionTimeout": ((SjmsBatchEndpoint) target).setCompletionTimeout(property(camelContext, int.class, value)); return true;
        case "consumerCount": ((SjmsBatchEndpoint) target).setConsumerCount(property(camelContext, int.class, value)); return true;
        case "eagerCheckCompletion": ((SjmsBatchEndpoint) target).setEagerCheckCompletion(property(camelContext, boolean.class, value)); return true;
        case "includeAllJMSXProperties": ((SjmsBatchEndpoint) target).setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "mapJmsMessage": ((SjmsBatchEndpoint) target).setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "pollDuration": ((SjmsBatchEndpoint) target).setPollDuration(property(camelContext, int.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((SjmsBatchEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((SjmsBatchEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SjmsBatchEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "asyncStartListener": ((SjmsBatchEndpoint) target).setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((SjmsBatchEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "headerFilterStrategy": ((SjmsBatchEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "jmsKeyFormatStrategy": ((SjmsBatchEndpoint) target).setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "keepAliveDelay": ((SjmsBatchEndpoint) target).setKeepAliveDelay(property(camelContext, int.class, value)); return true;
        case "messageCreatedStrategy": ((SjmsBatchEndpoint) target).setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "recoveryInterval": ((SjmsBatchEndpoint) target).setRecoveryInterval(property(camelContext, int.class, value)); return true;
        case "synchronous": ((SjmsBatchEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeoutCheckerExecutorService": ((SjmsBatchEndpoint) target).setTimeoutCheckerExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "aggregationstrategy": ((SjmsBatchEndpoint) target).setAggregationStrategy(property(camelContext, org.apache.camel.AggregationStrategy.class, value)); return true;
        case "allownullbody": ((SjmsBatchEndpoint) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((SjmsBatchEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "completioninterval": ((SjmsBatchEndpoint) target).setCompletionInterval(property(camelContext, int.class, value)); return true;
        case "completionpredicate": ((SjmsBatchEndpoint) target).setCompletionPredicate(property(camelContext, java.lang.String.class, value)); return true;
        case "completionsize": ((SjmsBatchEndpoint) target).setCompletionSize(property(camelContext, int.class, value)); return true;
        case "completiontimeout": ((SjmsBatchEndpoint) target).setCompletionTimeout(property(camelContext, int.class, value)); return true;
        case "consumercount": ((SjmsBatchEndpoint) target).setConsumerCount(property(camelContext, int.class, value)); return true;
        case "eagercheckcompletion": ((SjmsBatchEndpoint) target).setEagerCheckCompletion(property(camelContext, boolean.class, value)); return true;
        case "includealljmsxproperties": ((SjmsBatchEndpoint) target).setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "mapjmsmessage": ((SjmsBatchEndpoint) target).setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "pollduration": ((SjmsBatchEndpoint) target).setPollDuration(property(camelContext, int.class, value)); return true;
        case "sendemptymessagewhenidle": ((SjmsBatchEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((SjmsBatchEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SjmsBatchEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "asyncstartlistener": ((SjmsBatchEndpoint) target).setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((SjmsBatchEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy": ((SjmsBatchEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "jmskeyformatstrategy": ((SjmsBatchEndpoint) target).setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "keepalivedelay": ((SjmsBatchEndpoint) target).setKeepAliveDelay(property(camelContext, int.class, value)); return true;
        case "messagecreatedstrategy": ((SjmsBatchEndpoint) target).setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "recoveryinterval": ((SjmsBatchEndpoint) target).setRecoveryInterval(property(camelContext, int.class, value)); return true;
        case "synchronous": ((SjmsBatchEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeoutcheckerexecutorservice": ((SjmsBatchEndpoint) target).setTimeoutCheckerExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
            default: return false;
        }
    }

}

