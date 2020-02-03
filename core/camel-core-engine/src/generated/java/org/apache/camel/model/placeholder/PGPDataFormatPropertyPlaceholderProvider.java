/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.dataformat.PGPDataFormat;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class PGPDataFormatPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public PGPDataFormatPropertyPlaceholderProvider(Object obj) {
        PGPDataFormat definition = (PGPDataFormat) obj;

        readPlaceholders.put("keyUserid", definition::getKeyUserid);
        writePlaceholders.put("keyUserid", definition::setKeyUserid);
        readPlaceholders.put("signatureKeyUserid", definition::getSignatureKeyUserid);
        writePlaceholders.put("signatureKeyUserid", definition::setSignatureKeyUserid);
        readPlaceholders.put("password", definition::getPassword);
        writePlaceholders.put("password", definition::setPassword);
        readPlaceholders.put("signaturePassword", definition::getSignaturePassword);
        writePlaceholders.put("signaturePassword", definition::setSignaturePassword);
        readPlaceholders.put("keyFileName", definition::getKeyFileName);
        writePlaceholders.put("keyFileName", definition::setKeyFileName);
        readPlaceholders.put("signatureKeyFileName", definition::getSignatureKeyFileName);
        writePlaceholders.put("signatureKeyFileName", definition::setSignatureKeyFileName);
        readPlaceholders.put("signatureKeyRing", definition::getSignatureKeyRing);
        writePlaceholders.put("signatureKeyRing", definition::setSignatureKeyRing);
        readPlaceholders.put("provider", definition::getProvider);
        writePlaceholders.put("provider", definition::setProvider);
        readPlaceholders.put("signatureVerificationOption", definition::getSignatureVerificationOption);
        writePlaceholders.put("signatureVerificationOption", definition::setSignatureVerificationOption);
        readPlaceholders.put("id", definition::getId);
        writePlaceholders.put("id", definition::setId);
    }

    @Override
    public Map<String, Supplier<String>> getReadPropertyPlaceholderOptions(CamelContext camelContext) {
        return readPlaceholders;
    }

    @Override
    public Map<String, Consumer<String>> getWritePropertyPlaceholderOptions(CamelContext camelContext) {
        return writePlaceholders;
    }

}

