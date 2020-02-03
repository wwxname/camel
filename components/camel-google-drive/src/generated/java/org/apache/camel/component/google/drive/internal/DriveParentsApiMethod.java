
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.drive.Drive.Parents;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.drive.Drive$Parents
 */
public enum DriveParentsApiMethod implements ApiMethod {

    DELETE(
        com.google.api.services.drive.Drive.Parents.Delete.class,
        "delete",
        arg("fileId", String.class),
        arg("parentId", String.class)),

    GET(
        com.google.api.services.drive.Drive.Parents.Get.class,
        "get",
        arg("fileId", String.class),
        arg("parentId", String.class)),

    INSERT(
        com.google.api.services.drive.Drive.Parents.Insert.class,
        "insert",
        arg("fileId", String.class),
        arg("content", com.google.api.services.drive.model.ParentReference.class)),

    LIST(
        com.google.api.services.drive.Drive.Parents.List.class,
        "list",
        arg("fileId", String.class));

    

    private final ApiMethod apiMethod;

    private DriveParentsApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Parents.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
