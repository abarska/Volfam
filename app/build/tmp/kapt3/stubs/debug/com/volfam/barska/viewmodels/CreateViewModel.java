package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\rJ\u001e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u0016J\u000e\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0016J\u0016\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007J\u000e\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u0016J\u0006\u00102\u001a\u00020!R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/volfam/barska/viewmodels/CreateViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "_training", "Lcom/volfam/barska/data/Training;", "getApp", "()Landroid/app/Application;", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "currentTime", "", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "group", "", "place", "price", "repository", "Lcom/volfam/barska/data/TrainingRepository;", "trainer", "training", "getTraining", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "doneNewTraining", "", "getCalendar", "updateDate", "year", "month", "date", "updateGroup", "groupValue", "updatePlace", "placeValue", "updatePrice", "chosenPrice", "updateTime", "hour", "minute", "updateTrainer", "trainerValue", "validateInput", "app_debug"})
public final class CreateViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.volfam.barska.data.TrainingDao trainingDao = null;
    private final com.volfam.barska.data.TrainingRepository repository = null;
    private java.lang.String group;
    private java.lang.String trainer;
    private java.lang.String place;
    private java.lang.String price;
    private java.util.Calendar calendar;
    private long currentTime;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _error = null;
    private final androidx.lifecycle.MutableLiveData<com.volfam.barska.data.Training> _training = null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public CreateViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}