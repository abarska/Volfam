package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/volfam/barska/viewmodels/FilteredListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "app", "Landroid/app/Application;", "groups", "", "", "trainers", "places", "minPrice", "", "maxPrice", "startDate", "", "endDate", "(Lcom/volfam/barska/data/TrainingDao;Landroid/app/Application;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIJJ)V", "getApp", "()Landroid/app/Application;", "repository", "Lcom/volfam/barska/data/TrainingRepository;", "selectedTrainings", "Landroidx/lifecycle/LiveData;", "Lcom/volfam/barska/data/Training;", "getSelectedTrainings", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class FilteredListViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.volfam.barska.data.TrainingRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> selectedTrainings = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getSelectedTrainings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public FilteredListViewModel(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.TrainingDao trainingDao, @org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> trainers, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> places, int minPrice, int maxPrice, long startDate, long endDate) {
        super(null);
    }
}