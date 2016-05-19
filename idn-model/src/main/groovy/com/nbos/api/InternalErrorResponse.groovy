package com.nbos.api
/**
 * Created by vineeln on 9/3/15.
 */
class InternalErrorResponse extends RestMessage {

    public InternalErrorResponse(String code, def args) {
        super(code, args)
    }
}
