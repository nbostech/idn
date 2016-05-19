package com.nbos.core

class MemberApiModel {
    Long id
    String email
    String firstName
    String lastName
    Long phone
    String description
    String uuid

    List<SocialAccountApiModel> socialAccounts
    List<EmailConnectApiModel> emailConnects
}
