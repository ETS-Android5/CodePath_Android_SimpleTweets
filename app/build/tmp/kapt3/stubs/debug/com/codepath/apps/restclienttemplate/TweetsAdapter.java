package com.codepath.apps.restclienttemplate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TweetsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codepath/apps/restclienttemplate/TweetsAdapter$ViewHolder;", "tweets", "", "Lcom/codepath/apps/restclienttemplate/models/Tweet;", "(Ljava/util/List;)V", "getTweets", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class TweetsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codepath.apps.restclienttemplate.TweetsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.codepath.apps.restclienttemplate.models.Tweet> tweets = null;
    
    public TweetsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codepath.apps.restclienttemplate.models.Tweet> tweets) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.codepath.apps.restclienttemplate.models.Tweet> getTweets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codepath.apps.restclienttemplate.TweetsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codepath.apps.restclienttemplate.TweetsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/codepath/apps/restclienttemplate/TweetsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ivProfileImage", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvProfileImage", "()Landroid/widget/ImageView;", "tvTweetBody", "Landroid/widget/TextView;", "getTvTweetBody", "()Landroid/widget/TextView;", "tvUsername", "getTvUsername", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView ivProfileImage = null;
        private final android.widget.TextView tvUsername = null;
        private final android.widget.TextView tvTweetBody = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.ImageView getIvProfileImage() {
            return null;
        }
        
        public final android.widget.TextView getTvUsername() {
            return null;
        }
        
        public final android.widget.TextView getTvTweetBody() {
            return null;
        }
    }
}