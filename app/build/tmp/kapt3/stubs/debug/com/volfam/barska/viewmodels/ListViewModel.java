package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\tJ\u0006\u0010!\u001a\u00020\u001dR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/volfam/barska/viewmodels/ListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "app", "Landroid/app/Application;", "(Lcom/volfam/barska/data/TrainingDao;Landroid/app/Application;)V", "_navigateToDetailFragment", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToFilterFragment", "", "getApp", "()Landroid/app/Application;", "navigateToDetailFragment", "Landroidx/lifecycle/LiveData;", "getNavigateToDetailFragment", "()Landroidx/lifecycle/LiveData;", "navigateToFilterFragment", "getNavigateToFilterFragment", "repository", "Lcom/volfam/barska/data/TrainingRepository;", "trainings", "", "Lcom/volfam/barska/data/Training;", "getTrainings", "clearData", "Lkotlinx/coroutines/Job;", "onFilterFragmentNavigated", "", "onFilterMenuItemClicked", "onTrainingClicked", "trainingId", "onTrainingDetailNavigated", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.volfam.barska.data.TrainingRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> trainings = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _navigateToDetailFragment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _navigateToFilterFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getTrainings() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onFilterMenuItemClicked() {
        return null;
    }
    
    public final void onFilterFragmentNavigated() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job clearData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.TrainingDao trainingDao, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}