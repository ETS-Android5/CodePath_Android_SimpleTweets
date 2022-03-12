package com.codepath.apps.restclienttemplate.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/codepath/apps/restclienttemplate/models/Tweet;", "", "()V", "body", "", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "user", "Lcom/codepath/apps/restclienttemplate/models/User;", "getUser", "()Lcom/codepath/apps/restclienttemplate/models/User;", "setUser", "(Lcom/codepath/apps/restclienttemplate/models/User;)V", "Companion", "app_debug"})
public final class Tweet {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String body = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String createdAt = "";
    @org.jetbrains.annotations.Nullable()
    private com.codepath.apps.restclienttemplate.models.User user;
    @org.jetbrains.annotations.NotNull()
    public static final com.codepath.apps.restclienttemplate.models.Tweet.Companion Companion = null;
    
    public Tweet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codepath.apps.restclienttemplate.models.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.codepath.apps.restclienttemplate.models.User p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/codepath/apps/restclienttemplate/models/Tweet$Companion;", "", "()V", "fromJson", "Lcom/codepath/apps/restclienttemplate/models/Tweet;", "jsonObject", "Lorg/json/JSONObject;", "fromJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codepath.apps.restclienttemplate.models.Tweet fromJson(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject jsonObject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.codepath.apps.restclienttemplate.models.Tweet> fromJsonArray(@org.jetbrains.annotations.NotNull()
        org.json.JSONArray jsonArray) {
            return null;
        }
    }
}