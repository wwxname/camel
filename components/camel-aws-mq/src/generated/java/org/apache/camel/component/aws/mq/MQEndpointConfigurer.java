/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.mq;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MQEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "accessKey": ((MQEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonMqClient": ((MQEndpoint) target).getConfiguration().setAmazonMqClient(property(camelContext, com.amazonaws.services.mq.AmazonMQ.class, value)); return true;
        case "lazyStartProducer": ((MQEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((MQEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.mq.MQOperations.class, value)); return true;
        case "proxyHost": ((MQEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((MQEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyProtocol": ((MQEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((MQEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((MQEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((MQEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((MQEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesskey": ((MQEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonmqclient": ((MQEndpoint) target).getConfiguration().setAmazonMqClient(property(camelContext, com.amazonaws.services.mq.AmazonMQ.class, value)); return true;
        case "lazystartproducer": ((MQEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((MQEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.mq.MQOperations.class, value)); return true;
        case "proxyhost": ((MQEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((MQEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol": ((MQEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((MQEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((MQEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((MQEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((MQEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

