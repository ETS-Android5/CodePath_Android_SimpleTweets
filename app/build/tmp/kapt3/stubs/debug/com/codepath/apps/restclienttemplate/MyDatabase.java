package com.codepath.apps.restclienttemplate;

import java.lang.System;

@androidx.room.Database(entities = {com.codepath.apps.restclienttemplate.models.SampleModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codepath/apps/restclienttemplate/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "sampleModelDao", "Lcom/codepath/apps/restclienttemplate/models/SampleModelDao;", "Companion", "app_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.codepath.apps.restclienttemplate.MyDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "MyDatabase";
    
    public MyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.codepath.apps.restclienttemplate.models.SampleModelDao sampleModelDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/codepath/apps/restclienttemplate/MyDatabase$Companion;", "", "()V", "NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}