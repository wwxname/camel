/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.irc;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class IrcEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "autoRejoin": ((IrcEndpoint) target).getConfiguration().setAutoRejoin(property(camelContext, boolean.class, value)); return true;
        case "channels": ((IrcEndpoint) target).getConfiguration().setChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "commandTimeout": ((IrcEndpoint) target).getConfiguration().setCommandTimeout(property(camelContext, long.class, value)); return true;
        case "keys": ((IrcEndpoint) target).getConfiguration().setKeys(property(camelContext, java.lang.String.class, value)); return true;
        case "namesOnJoin": ((IrcEndpoint) target).getConfiguration().setNamesOnJoin(property(camelContext, boolean.class, value)); return true;
        case "nickname": ((IrcEndpoint) target).getConfiguration().setNickname(property(camelContext, java.lang.String.class, value)); return true;
        case "persistent": ((IrcEndpoint) target).getConfiguration().setPersistent(property(camelContext, boolean.class, value)); return true;
        case "realname": ((IrcEndpoint) target).getConfiguration().setRealname(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((IrcEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((IrcEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((IrcEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((IrcEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((IrcEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "colors": ((IrcEndpoint) target).getConfiguration().setColors(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((IrcEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "onJoin": ((IrcEndpoint) target).getConfiguration().setOnJoin(property(camelContext, boolean.class, value)); return true;
        case "onKick": ((IrcEndpoint) target).getConfiguration().setOnKick(property(camelContext, boolean.class, value)); return true;
        case "onMode": ((IrcEndpoint) target).getConfiguration().setOnMode(property(camelContext, boolean.class, value)); return true;
        case "onNick": ((IrcEndpoint) target).getConfiguration().setOnNick(property(camelContext, boolean.class, value)); return true;
        case "onPart": ((IrcEndpoint) target).getConfiguration().setOnPart(property(camelContext, boolean.class, value)); return true;
        case "onPrivmsg": ((IrcEndpoint) target).getConfiguration().setOnPrivmsg(property(camelContext, boolean.class, value)); return true;
        case "onQuit": ((IrcEndpoint) target).getConfiguration().setOnQuit(property(camelContext, boolean.class, value)); return true;
        case "onReply": ((IrcEndpoint) target).getConfiguration().setOnReply(property(camelContext, boolean.class, value)); return true;
        case "onTopic": ((IrcEndpoint) target).getConfiguration().setOnTopic(property(camelContext, boolean.class, value)); return true;
        case "nickPassword": ((IrcEndpoint) target).getConfiguration().setNickPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((IrcEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslContextParameters": ((IrcEndpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "trustManager": ((IrcEndpoint) target).getConfiguration().setTrustManager(property(camelContext, org.schwering.irc.lib.ssl.SSLTrustManager.class, value)); return true;
        case "username": ((IrcEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "autorejoin": ((IrcEndpoint) target).getConfiguration().setAutoRejoin(property(camelContext, boolean.class, value)); return true;
        case "channels": ((IrcEndpoint) target).getConfiguration().setChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "commandtimeout": ((IrcEndpoint) target).getConfiguration().setCommandTimeout(property(camelContext, long.class, value)); return true;
        case "keys": ((IrcEndpoint) target).getConfiguration().setKeys(property(camelContext, java.lang.String.class, value)); return true;
        case "namesonjoin": ((IrcEndpoint) target).getConfiguration().setNamesOnJoin(property(camelContext, boolean.class, value)); return true;
        case "nickname": ((IrcEndpoint) target).getConfiguration().setNickname(property(camelContext, java.lang.String.class, value)); return true;
        case "persistent": ((IrcEndpoint) target).getConfiguration().setPersistent(property(camelContext, boolean.class, value)); return true;
        case "realname": ((IrcEndpoint) target).getConfiguration().setRealname(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((IrcEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((IrcEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((IrcEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((IrcEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((IrcEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "colors": ((IrcEndpoint) target).getConfiguration().setColors(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((IrcEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "onjoin": ((IrcEndpoint) target).getConfiguration().setOnJoin(property(camelContext, boolean.class, value)); return true;
        case "onkick": ((IrcEndpoint) target).getConfiguration().setOnKick(property(camelContext, boolean.class, value)); return true;
        case "onmode": ((IrcEndpoint) target).getConfiguration().setOnMode(property(camelContext, boolean.class, value)); return true;
        case "onnick": ((IrcEndpoint) target).getConfiguration().setOnNick(property(camelContext, boolean.class, value)); return true;
        case "onpart": ((IrcEndpoint) target).getConfiguration().setOnPart(property(camelContext, boolean.class, value)); return true;
        case "onprivmsg": ((IrcEndpoint) target).getConfiguration().setOnPrivmsg(property(camelContext, boolean.class, value)); return true;
        case "onquit": ((IrcEndpoint) target).getConfiguration().setOnQuit(property(camelContext, boolean.class, value)); return true;
        case "onreply": ((IrcEndpoint) target).getConfiguration().setOnReply(property(camelContext, boolean.class, value)); return true;
        case "ontopic": ((IrcEndpoint) target).getConfiguration().setOnTopic(property(camelContext, boolean.class, value)); return true;
        case "nickpassword": ((IrcEndpoint) target).getConfiguration().setNickPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((IrcEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters": ((IrcEndpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "trustmanager": ((IrcEndpoint) target).getConfiguration().setTrustManager(property(camelContext, org.schwering.irc.lib.ssl.SSLTrustManager.class, value)); return true;
        case "username": ((IrcEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

