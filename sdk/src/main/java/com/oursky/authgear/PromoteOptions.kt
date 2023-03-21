package com.oursky.authgear

data class PromoteOptions @JvmOverloads constructor(
    /**
     * Redirection URI to which the response will be sent after authorization.
     */
    var redirectUri: String,
    /**
     * OAuth 2.0 state value.
     */
    var state: String? = null,
    /**
     * Custom state.
     */
    var xState: String? = null,
    /**
     * UI locale tags
     */
    var uiLocales: List<String>? = null,
    /**
     * Theme override
     */
    var colorScheme: ColorScheme? = null,
    /**
     * WeChat redirect uri is needed when integrating WeChat login
     * The wechatRedirectURI will be called when user click the login with WeChat button
     */
    var wechatRedirectURI: String? = null
)
