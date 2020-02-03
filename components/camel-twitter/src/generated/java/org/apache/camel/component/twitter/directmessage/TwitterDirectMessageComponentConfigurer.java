/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.directmessage;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TwitterDirectMessageComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "accessToken": ((TwitterDirectMessageComponent) target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "accessTokenSecret": ((TwitterDirectMessageComponent) target).setAccessTokenSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerKey": ((TwitterDirectMessageComponent) target).setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerSecret": ((TwitterDirectMessageComponent) target).setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyHost": ((TwitterDirectMessageComponent) target).setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyUser": ((TwitterDirectMessageComponent) target).setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyPassword": ((TwitterDirectMessageComponent) target).setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyPort": ((TwitterDirectMessageComponent) target).setHttpProxyPort(property(camelContext, int.class, value)); return true;
        case "basicPropertyBinding": ((TwitterDirectMessageComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((TwitterDirectMessageComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((TwitterDirectMessageComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesstoken": ((TwitterDirectMessageComponent) target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "accesstokensecret": ((TwitterDirectMessageComponent) target).setAccessTokenSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerkey": ((TwitterDirectMessageComponent) target).setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumersecret": ((TwitterDirectMessageComponent) target).setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyhost": ((TwitterDirectMessageComponent) target).setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyuser": ((TwitterDirectMessageComponent) target).setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword": ((TwitterDirectMessageComponent) target).setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport": ((TwitterDirectMessageComponent) target).setHttpProxyPort(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding": ((TwitterDirectMessageComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((TwitterDirectMessageComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((TwitterDirectMessageComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

