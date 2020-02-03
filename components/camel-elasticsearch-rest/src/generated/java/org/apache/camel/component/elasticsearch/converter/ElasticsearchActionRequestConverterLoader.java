/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elasticsearch.converter;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class ElasticsearchActionRequestConverterLoader implements TypeConverterLoader {

    public ElasticsearchActionRequestConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest.class, java.lang.Object.class, false,
            (type, exchange, value) -> org.apache.camel.component.elasticsearch.converter.ElasticsearchActionRequestConverter.toDeleteIndexRequest(value, exchange));
        addTypeConverter(registry, org.elasticsearch.action.bulk.BulkRequest.class, java.lang.Object.class, false,
            (type, exchange, value) -> org.apache.camel.component.elasticsearch.converter.ElasticsearchActionRequestConverter.toBulkRequest(value, exchange));
        addTypeConverter(registry, org.elasticsearch.action.delete.DeleteRequest.class, java.lang.Object.class, false,
            (type, exchange, value) -> org.apache.camel.component.elasticsearch.converter.ElasticsearchActionRequestConverter.toDeleteRequest(value, exchange));
        addTypeConverter(registry, org.elasticsearch.action.get.GetRequest.class, java.lang.Object.class, false,
            (type, exchange, value) -> org.apache.camel.component.elasticsearch.converter.ElasticsearchActionRequestConverter.toGetRequest(value, exchange));
        addTypeConverter(registry, org.elasticsearch.action.index.IndexRequest.class, java.lang.Object.class, false,
            (type, exchange, value) -> org.apache.camel.component.elasticsearch.converter.ElasticsearchActionRequestConverter.toIndexRequest(value, exchange));
        addTypeConverter(registry, org.elasticsearch.action.search.SearchRequest.class, java.lang.Object.class, false,
            (type, exchange, value) -> org.apache.camel.component.elasticsearch.converter.ElasticsearchActionRequestConverter.toSearchRequest(value, exchange));
        addTypeConverter(registry, org.elasticsearch.action.update.UpdateRequest.class, java.lang.Object.class, false,
            (type, exchange, value) -> org.apache.camel.component.elasticsearch.converter.ElasticsearchActionRequestConverter.toUpdateRequest(value, exchange));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
