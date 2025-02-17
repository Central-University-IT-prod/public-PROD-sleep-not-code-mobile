package com.example.data.api

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.cookies.AcceptAllCookiesStorage
import io.ktor.client.plugins.cookies.ConstantCookiesStorage
import io.ktor.client.plugins.cookies.HttpCookies
import io.ktor.http.Cookie
import io.ktor.serialization.gson.gson

object ApiConstants {

    private const val BASE_URL = "https://post-pulse.ru/api"
    const val LOGIN_URL = "$BASE_URL/access/login"
    const val LIST_CHANNELS_URL = "$BASE_URL/channels"
    const val LIST_DRAFTS_URL = "$BASE_URL/posts/draft"
    const val SENT_MOBILE_TOKEN_URL = "$BASE_URL/access/mobile_token"
    const val UPDATE_POST_URL = "$BASE_URL/posts"
    const val LIST_SCHEDULE_URL = "$BASE_URL/posts/scheduled"
    const val LIST_SEND_URL = "$BASE_URL/posts/sent"

    val httpClient = HttpClient(OkHttp){
        install(ContentNegotiation){
            gson()
        }
        install(HttpCookies) {
            storage = AcceptAllCookiesStorage()
        }
    }

}