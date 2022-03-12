package com.codepath.apps.restclienttemplate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TwitterApplication;", "Landroid/app/Application;", "()V", "myDatabase", "Lcom/codepath/apps/restclienttemplate/MyDatabase;", "getMyDatabase", "()Lcom/codepath/apps/restclienttemplate/MyDatabase;", "setMyDatabase", "(Lcom/codepath/apps/restclienttemplate/MyDatabase;)V", "onCreate", "", "Companion", "app_debug"})
public final class TwitterApplication extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private com.codepath.apps.restclienttemplate.MyDatabase myDatabase;
    @org.jetbrains.annotations.NotNull()
    public static final com.codepath.apps.restclienttemplate.TwitterApplication.Companion Companion = null;
    
    public TwitterApplication() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codepath.apps.restclienttemplate.MyDatabase getMyDatabase() {
        return null;
    }
    
    public final void setMyDatabase(@org.jetbrains.annotations.Nullable()
    com.codepath.apps.restclienttemplate.MyDatabase p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TwitterApplication$Companion;", "", "()V", "getRestClient", "Lcom/codepath/apps/restclienttemplate/TwitterClient;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codepath.apps.restclienttemplate.TwitterClient getRestClient(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}