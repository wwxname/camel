/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.ddbstream;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DdbStreamEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "amazonDynamoDbStreamsClient": ((DdbStreamEndpoint) target).getConfiguration().setAmazonDynamoDbStreamsClient(property(camelContext, com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams.class, value)); return true;
        case "bridgeErrorHandler": ((DdbStreamEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "iteratorType": ((DdbStreamEndpoint) target).getConfiguration().setIteratorType(property(camelContext, com.amazonaws.services.dynamodbv2.model.ShardIteratorType.class, value)); return true;
        case "maxResultsPerRequest": ((DdbStreamEndpoint) target).getConfiguration().setMaxResultsPerRequest(property(camelContext, int.class, value)); return true;
        case "proxyHost": ((DdbStreamEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((DdbStreamEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyProtocol": ((DdbStreamEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((DdbStreamEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((DdbStreamEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sequenceNumberProvider": ((DdbStreamEndpoint) target).getConfiguration().setSequenceNumberProvider(property(camelContext, org.apache.camel.component.aws.ddbstream.SequenceNumberProvider.class, value)); return true;
        case "exceptionHandler": ((DdbStreamEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((DdbStreamEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((DdbStreamEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "basicPropertyBinding": ((DdbStreamEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DdbStreamEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((DdbStreamEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((DdbStreamEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((DdbStreamEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((DdbStreamEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((DdbStreamEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((DdbStreamEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((DdbStreamEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((DdbStreamEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((DdbStreamEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((DdbStreamEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((DdbStreamEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((DdbStreamEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((DdbStreamEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((DdbStreamEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "accessKey": ((DdbStreamEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((DdbStreamEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "amazondynamodbstreamsclient": ((DdbStreamEndpoint) target).getConfiguration().setAmazonDynamoDbStreamsClient(property(camelContext, com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams.class, value)); return true;
        case "bridgeerrorhandler": ((DdbStreamEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "iteratortype": ((DdbStreamEndpoint) target).getConfiguration().setIteratorType(property(camelContext, com.amazonaws.services.dynamodbv2.model.ShardIteratorType.class, value)); return true;
        case "maxresultsperrequest": ((DdbStreamEndpoint) target).getConfiguration().setMaxResultsPerRequest(property(camelContext, int.class, value)); return true;
        case "proxyhost": ((DdbStreamEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((DdbStreamEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol": ((DdbStreamEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((DdbStreamEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle": ((DdbStreamEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sequencenumberprovider": ((DdbStreamEndpoint) target).getConfiguration().setSequenceNumberProvider(property(camelContext, org.apache.camel.component.aws.ddbstream.SequenceNumberProvider.class, value)); return true;
        case "exceptionhandler": ((DdbStreamEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((DdbStreamEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((DdbStreamEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "basicpropertybinding": ((DdbStreamEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DdbStreamEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((DdbStreamEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((DdbStreamEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((DdbStreamEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((DdbStreamEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((DdbStreamEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((DdbStreamEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((DdbStreamEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((DdbStreamEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((DdbStreamEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((DdbStreamEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((DdbStreamEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((DdbStreamEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((DdbStreamEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((DdbStreamEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "accesskey": ((DdbStreamEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((DdbStreamEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

