package com.oursky.authgear.data.oauth

import com.oursky.authgear.UserInfo
import com.oursky.authgear.oauth.OIDCConfiguration
import com.oursky.authgear.oauth.OIDCTokenRequest
import com.oursky.authgear.oauth.OIDCTokenResponse

/**
 * A thread-safe oauth repository.
 */
internal interface OauthRepo {
    var endpoint: String?
    fun getOIDCConfiguration(): OIDCConfiguration
    fun oidcTokenRequest(request: OIDCTokenRequest): OIDCTokenResponse
    fun oidcUserInfoRequest(accessToken: String): UserInfo
}