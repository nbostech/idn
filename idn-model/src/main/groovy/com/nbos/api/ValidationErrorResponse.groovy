package com.nbos.api

/**
 * Created by vineeln on 9/2/15.
 */
class ValidationErrorResponse {

    List<FieldErrorApiModel> errors

    public ValidationErrorResponse() {
    }

/*
    public ValidationErrorResponse( Errors errors ) {
        this()
        this.errors = errors.allErrors.collect {
            new FieldErrorApiModel(it.field, it.code, it.arguments)
        }
    }

    public ValidationErrorResponse( List<FieldErrorApiModel> errors ){
        this.errors = errors
    }
*/
}
