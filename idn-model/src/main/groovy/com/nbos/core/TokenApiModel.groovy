package com.nbos.core


class TokenApiModel {
    String scope
    Long expires_in
    String token_type
    String refresh_token
    String access_token

/*
    public TokenApiModel(OAuth2AccessToken token) {
        this.scope = token.scope.join(",")
        this.expires_in = token.expiresIn
        this.token_type = token.tokenType
        this.refresh_token = token.refreshToken.value
        this.access_token = token.value
    }
*/
}
