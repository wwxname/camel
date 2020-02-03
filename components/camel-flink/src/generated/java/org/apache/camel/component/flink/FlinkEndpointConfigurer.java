/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.flink;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FlinkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "collect": ((FlinkEndpoint) target).setCollect(property(camelContext, boolean.class, value)); return true;
        case "dataSet": ((FlinkEndpoint) target).setDataSet(property(camelContext, org.apache.flink.api.java.DataSet.class, value)); return true;
        case "dataSetCallback": ((FlinkEndpoint) target).setDataSetCallback(property(camelContext, org.apache.camel.component.flink.DataSetCallback.class, value)); return true;
        case "dataStream": ((FlinkEndpoint) target).setDataStream(property(camelContext, org.apache.flink.streaming.api.datastream.DataStream.class, value)); return true;
        case "dataStreamCallback": ((FlinkEndpoint) target).setDataStreamCallback(property(camelContext, org.apache.camel.component.flink.DataStreamCallback.class, value)); return true;
        case "lazyStartProducer": ((FlinkEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((FlinkEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((FlinkEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "collect": ((FlinkEndpoint) target).setCollect(property(camelContext, boolean.class, value)); return true;
        case "dataset": ((FlinkEndpoint) target).setDataSet(property(camelContext, org.apache.flink.api.java.DataSet.class, value)); return true;
        case "datasetcallback": ((FlinkEndpoint) target).setDataSetCallback(property(camelContext, org.apache.camel.component.flink.DataSetCallback.class, value)); return true;
        case "datastream": ((FlinkEndpoint) target).setDataStream(property(camelContext, org.apache.flink.streaming.api.datastream.DataStream.class, value)); return true;
        case "datastreamcallback": ((FlinkEndpoint) target).setDataStreamCallback(property(camelContext, org.apache.camel.component.flink.DataStreamCallback.class, value)); return true;
        case "lazystartproducer": ((FlinkEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((FlinkEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((FlinkEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

