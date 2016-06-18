package com.nbos.capi.modules.identity.v0;

public class NewMemberApiModel {
    public MemberApiModel getMember() {
        return member;
    }

    public TokenApiModel getToken() {
        return token;
    }

    MemberApiModel member;
    TokenApiModel token;
}
