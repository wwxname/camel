/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.services;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KubernetesServicesEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "apiVersion": ((KubernetesServicesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsDomain": ((KubernetesServicesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesClient": ((KubernetesServicesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "portName": ((KubernetesServicesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portProtocol": ((KubernetesServicesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((KubernetesServicesEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "labelKey": ((KubernetesServicesEndpoint) target).getConfiguration().setLabelKey(property(camelContext, java.lang.String.class, value)); return true;
        case "labelValue": ((KubernetesServicesEndpoint) target).getConfiguration().setLabelValue(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace": ((KubernetesServicesEndpoint) target).getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "poolSize": ((KubernetesServicesEndpoint) target).getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "resourceName": ((KubernetesServicesEndpoint) target).getConfiguration().setResourceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((KubernetesServicesEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((KubernetesServicesEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((KubernetesServicesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesServicesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KubernetesServicesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionTimeout": ((KubernetesServicesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesServicesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "caCertData": ((KubernetesServicesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "caCertFile": ((KubernetesServicesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertData": ((KubernetesServicesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertFile": ((KubernetesServicesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyAlgo": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyData": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyFile": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyPassphrase": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthToken": ((KubernetesServicesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesServicesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustCerts": ((KubernetesServicesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesServicesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "apiversion": ((KubernetesServicesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsdomain": ((KubernetesServicesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesclient": ((KubernetesServicesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "portname": ((KubernetesServicesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portprotocol": ((KubernetesServicesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((KubernetesServicesEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "labelkey": ((KubernetesServicesEndpoint) target).getConfiguration().setLabelKey(property(camelContext, java.lang.String.class, value)); return true;
        case "labelvalue": ((KubernetesServicesEndpoint) target).getConfiguration().setLabelValue(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace": ((KubernetesServicesEndpoint) target).getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "poolsize": ((KubernetesServicesEndpoint) target).getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "resourcename": ((KubernetesServicesEndpoint) target).getConfiguration().setResourceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((KubernetesServicesEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((KubernetesServicesEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((KubernetesServicesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesServicesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KubernetesServicesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout": ((KubernetesServicesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesServicesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "cacertdata": ((KubernetesServicesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile": ((KubernetesServicesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata": ((KubernetesServicesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile": ((KubernetesServicesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase": ((KubernetesServicesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtoken": ((KubernetesServicesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesServicesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustcerts": ((KubernetesServicesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesServicesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

