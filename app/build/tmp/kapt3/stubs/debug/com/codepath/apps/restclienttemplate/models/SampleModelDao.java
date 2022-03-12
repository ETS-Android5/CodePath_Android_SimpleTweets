package com.codepath.apps.restclienttemplate.models;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J%\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\t\"\u0004\u0018\u00010\u0003H\'\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/codepath/apps/restclienttemplate/models/SampleModelDao;", "", "byId", "Lcom/codepath/apps/restclienttemplate/models/SampleModel;", "id", "", "insertModel", "", "sampleModels", "", "([Lcom/codepath/apps/restclienttemplate/models/SampleModel;)V", "recentItems", "", "app_debug"})
public abstract interface SampleModelDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM SampleModel WHERE id = :id")
    public abstract com.codepath.apps.restclienttemplate.models.SampleModel byId(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM SampleModel ORDER BY ID DESC LIMIT 300")
    public abstract java.util.List<com.codepath.apps.restclienttemplate.models.SampleModel> recentItems();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertModel(@org.jetbrains.annotations.NotNull()
    com.codepath.apps.restclienttemplate.models.SampleModel... sampleModels);
}