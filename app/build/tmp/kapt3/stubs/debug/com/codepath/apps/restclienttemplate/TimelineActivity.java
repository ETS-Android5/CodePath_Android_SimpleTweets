package com.codepath.apps.restclienttemplate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0006\u0010$\u001a\u00020!R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006&"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TimelineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/codepath/apps/restclienttemplate/TweetsAdapter;", "getAdapter", "()Lcom/codepath/apps/restclienttemplate/TweetsAdapter;", "setAdapter", "(Lcom/codepath/apps/restclienttemplate/TweetsAdapter;)V", "client", "Lcom/codepath/apps/restclienttemplate/TwitterClient;", "getClient", "()Lcom/codepath/apps/restclienttemplate/TwitterClient;", "setClient", "(Lcom/codepath/apps/restclienttemplate/TwitterClient;)V", "rvTweets", "Landroidx/recyclerview/widget/RecyclerView;", "getRvTweets", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvTweets", "(Landroidx/recyclerview/widget/RecyclerView;)V", "swipeContainer", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeContainer", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeContainer", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "tweets", "Ljava/util/ArrayList;", "Lcom/codepath/apps/restclienttemplate/models/Tweet;", "getTweets", "()Ljava/util/ArrayList;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "populateHomeTimeline", "Companion", "app_debug"})
public final class TimelineActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.codepath.apps.restclienttemplate.TwitterClient client;
    public androidx.recyclerview.widget.RecyclerView rvTweets;
    public com.codepath.apps.restclienttemplate.TweetsAdapter adapter;
    public androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeContainer;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.codepath.apps.restclienttemplate.models.Tweet> tweets = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.codepath.apps.restclienttemplate.TimelineActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "TimelineActivity";
    
    public TimelineActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codepath.apps.restclienttemplate.TwitterClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    com.codepath.apps.restclienttemplate.TwitterClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRvTweets() {
        return null;
    }
    
    public final void setRvTweets(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codepath.apps.restclienttemplate.TweetsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.codepath.apps.restclienttemplate.TweetsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout getSwipeContainer() {
        return null;
    }
    
    public final void setSwipeContainer(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codepath.apps.restclienttemplate.models.Tweet> getTweets() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void populateHomeTimeline() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TimelineActivity$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}