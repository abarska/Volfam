package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u000fJ\u0019\u0010#\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020!H\u0014J\u001e\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tJ\u000e\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0018J\u000e\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u0018J\u000e\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u0018J\u0016\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\tJ\u000e\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u0018J\u0006\u00105\u001a\u00020!R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lcom/volfam/barska/viewmodels/CreateViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "app", "Landroid/app/Application;", "(Lcom/volfam/barska/data/TrainingDao;Landroid/app/Application;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "_training", "Lcom/volfam/barska/data/Training;", "getApp", "()Landroid/app/Application;", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "currentTime", "", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "group", "", "place", "price", "trainer", "training", "getTraining", "viewModelJob", "Lkotlinx/coroutines/Job;", "doneNewTraining", "", "getCalendar", "insertIntoDatabase", "(Lcom/volfam/barska/data/Training;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "updateDate", "year", "month", "date", "updateGroup", "groupValue", "updatePlace", "placeValue", "updatePrice", "chosenPrice", "updateTime", "hour", "minute", "updateTrainer", "trainerValue", "validateInput", "app_release"})
public final class CreateViewModel extends androidx.lifecycle.AndroidViewModel {
    private java.lang.String group;
    private java.lang.String trainer;
    private java.lang.String place;
    private java.lang.String price;
    private java.util.Calendar calendar;
    private long currentTime;
    private kotlinx.coroutines.Job viewModelJob;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _error = null;
    private final androidx.lifecycle.MutableLiveData<com.volfam.barska.data.Training> _training = null;
    private final com.volfam.barska.data.TrainingDao trainingDao = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.volfam.barska.data.Training> getTraining() {
        return null;
    }
    
    public final void updateGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupValue) {
    }
    
    public final void updateTrainer(@org.jetbrains.annotations.NotNull()
    java.lang.String trainerValue) {
    }
    
    public final void updatePlace(@org.jetbrains.annotations.NotNull()
    java.lang.String placeValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getCalendar() {
        return null;
    }
    
    public final void updateDate(int year, int month, int date) {
    }
    
    public final void updateTime(int hour, int minute) {
    }
    
    public final void updatePrice(@org.jetbrains.annotations.NotNull()
    java.lang.String chosenPrice) {
    }
    
    public final void validateInput() {
    }
    
    public final void doneNewTraining() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public CreateViewModel(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.TrainingDao trainingDao, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}