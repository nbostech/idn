package com.nbos.core


class OAuthClientApiModel {

    Long id
    String clientName
    String tenantId
    String clientId
    String clientSecret
    Boolean revoked = false

    Integer accessTokenValiditySeconds
    Integer refreshTokenValiditySeconds

    List<String> authorities;
    List<String> authorizedGrantTypes;
    List<String> resourceIds;
    List<String> scopes;
    List<String> redirectUris;
}
