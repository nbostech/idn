package com.nbos.api

/**
 * Created by vineeln on 2/21/16.
 */
class ForbiddenResponse extends RestMessage {

    public ForbiddenResponse(String code, def args) {
        super(code,args)
    }
}
