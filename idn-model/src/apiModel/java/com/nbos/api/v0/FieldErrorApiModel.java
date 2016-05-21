package com.nbos.api.v0;


public class FieldErrorApiModel extends RestMessage {
    public String getObjectName() {
        return objectName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    String objectName;
    String propertyName;
}
