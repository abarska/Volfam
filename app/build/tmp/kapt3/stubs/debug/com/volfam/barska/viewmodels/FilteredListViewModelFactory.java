package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u0010\u001a\u0002H\u0011\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014H\u0016\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/volfam/barska/viewmodels/FilteredListViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "application", "Landroid/app/Application;", "groups", "", "", "trainers", "places", "minPrice", "", "maxPrice", "(Lcom/volfam/barska/data/TrainingDao;Landroid/app/Application;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class FilteredListViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final com.volfam.barska.data.TrainingDao trainingDao = null;
    private final android.app.Application application = null;
    private final java.util.List<java.lang.String> groups = null;
    private final java.util.List<java.lang.String> trainers = null;
    private final java.util.List<java.lang.String> places = null;
    private final java.lang.Integer minPrice = null;
    private final java.lang.Integer maxPrice = null;
    
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public FilteredListViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.TrainingDao trainingDao, @org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> trainers, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> places, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxPrice) {
        super();
    }
}