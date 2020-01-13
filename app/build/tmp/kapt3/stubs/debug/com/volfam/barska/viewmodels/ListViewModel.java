package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*J\u0011\u0010,\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0011\u0010.\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\b\u0010/\u001a\u00020*H\u0014J\u0006\u00100\u001a\u00020*J\u0006\u00101\u001a\u00020*J\u000e\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u000eJ\u0006\u00104\u001a\u00020*J\u000e\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/volfam/barska/viewmodels/ListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "app", "Landroid/app/Application;", "groups", "", "", "trainers", "places", "(Lcom/volfam/barska/data/TrainingDao;Landroid/app/Application;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "_navigateToDetailFragment", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToFilterFragment", "", "getApp", "()Landroid/app/Application;", "isFiltered", "", "()Z", "setFiltered", "(Z)V", "listHasNoData", "Landroidx/lifecycle/LiveData;", "getListHasNoData", "()Landroidx/lifecycle/LiveData;", "navigateToDetailFragment", "getNavigateToDetailFragment", "navigateToFilterFragment", "getNavigateToFilterFragment", "rowsInTable", "getRowsInTable", "trainings", "Lcom/volfam/barska/data/Training;", "getTrainings", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "clearData", "", "clearFilters", "clearInBackground", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaxPriceInBackground", "onCleared", "onFilterFragmentNavigated", "onFilterMenuItemClicked", "onTrainingClicked", "trainingId", "onTrainingDetailNavigated", "updateIsFiltered", "newValue", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> trainings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> rowsInTable = null;
    private boolean isFiltered;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> listHasNoData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _navigateToDetailFragment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _navigateToFilterFragment = null;
    private final com.volfam.barska.data.TrainingDao trainingDao = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getTrainings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getRowsInTable() {
        return null;
    }
    
    public final boolean isFiltered() {
        return false;
    }
    
    public final void setFiltered(boolean p0) {
    }
    
    public final void updateIsFiltered(boolean newValue) {
    }
    
    public final void clearFilters() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getListHasNoData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getNavigateToDetailFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getNavigateToFilterFragment() {
        return null;
    }
    
    public final void onTrainingClicked(long trainingId) {
    }
    
    public final void onTrainingDetailNavigated() {
    }
    
    public final void onFilterMenuItemClicked() {
    }
    
    public final void onFilterFragmentNavigated() {
    }
    
    public final void clearData() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.TrainingDao trainingDao, @org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> trainers, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> places) {
        super(null);
    }
}