package com.codepath.apps.restclienttemplate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\r"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TwitterClient;", "Lcom/codepath/oauth/OAuthBaseClient;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getHomeTimeline", "", "handler", "Lcom/codepath/asynchttpclient/callback/JsonHttpResponseHandler;", "publishTweet", "tweetContent", "", "Companion", "app_debug"})
public final class TwitterClient extends com.codepath.oauth.OAuthBaseClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.codepath.apps.restclienttemplate.TwitterClient.Companion Companion = null;
    private static final com.github.scribejava.apis.TwitterApi REST_API_INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REST_URL = "https://api.twitter.com/1.1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REST_CONSUMER_KEY = "4KxocRp2Wh8RZ9cy1KJEjxGVy";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REST_CONSUMER_SECRET = "EeyJ4vEZN3al7c0C13bMwAY3pGc2RASrampYtvJvnX1kLDHKJf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FALLBACK_URL = "https://codepath.github.io/android-rest-client-template/success.html";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REST_CALLBACK_URL_TEMPLATE = "intent://%s#Intent;action=android.intent.action.VIEW;scheme=%s;package=%s;S.browser_fallback_url=%s;end";
    
    public TwitterClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, null, null, null, null, null);
    }
    
    public final void getHomeTimeline(@org.jetbrains.annotations.NotNull()
    com.codepath.asynchttpclient.callback.JsonHttpResponseHandler handler) {
    }
    
    public final void publishTweet(@org.jetbrains.annotations.NotNull()
    java.lang.String tweetContent, @org.jetbrains.annotations.NotNull()
    com.codepath.asynchttpclient.callback.JsonHttpResponseHandler handler) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TwitterClient$Companion;", "", "()V", "FALLBACK_URL", "", "REST_API_INSTANCE", "Lcom/github/scribejava/apis/TwitterApi;", "kotlin.jvm.PlatformType", "getREST_API_INSTANCE", "()Lcom/github/scribejava/apis/TwitterApi;", "REST_CALLBACK_URL_TEMPLATE", "REST_CONSUMER_KEY", "REST_CONSUMER_SECRET", "REST_URL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final com.github.scribejava.apis.TwitterApi getREST_API_INSTANCE() {
            return null;
        }
    }
}