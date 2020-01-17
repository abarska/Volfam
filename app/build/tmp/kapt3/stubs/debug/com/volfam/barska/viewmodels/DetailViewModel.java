package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010$\u001a\u00020%J\u0011\u0010&\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020%J\u0006\u0010)\u001a\u00020%J\b\u0010*\u001a\u00020%H\u0014J\u0006\u0010+\u001a\u00020%J\u0019\u0010,\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u0013J\u000e\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\fJ\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\fJ\u000e\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\fR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/volfam/barska/viewmodels/DetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "app", "Landroid/app/Application;", "key", "", "(Lcom/volfam/barska/data/TrainingDao;Landroid/app/Application;J)V", "_trainingDateTime", "Landroidx/lifecycle/MutableLiveData;", "_trainingGroup", "", "_trainingPlace", "_trainingPrice", "", "_trainingTrainer", "training", "Landroidx/lifecycle/LiveData;", "Lcom/volfam/barska/data/Training;", "getTraining", "()Landroidx/lifecycle/LiveData;", "trainingDateTime", "getTrainingDateTime", "trainingGroup", "getTrainingGroup", "trainingPlace", "getTrainingPlace", "trainingPrice", "getTrainingPrice", "trainingTrainer", "getTrainingTrainer", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "addFiveToPrice", "", "deleteInBackgroung", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTraining", "initObservableValues", "onCleared", "substractFiveFromPrice", "updateInBackground", "(Lcom/volfam/barska/data/Training;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTraining", "updateTrainingGroup", "group", "updateTrainingPlace", "place", "updateTrainingTime", "timeInMillis", "updateTrainingTrainer", "trainer", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.volfam.barska.data.Training> training = null;
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _trainingDateTime = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _trainingGroup = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _trainingTrainer = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _trainingPlace = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _trainingPrice = null;
    private final com.volfam.barska.data.TrainingDao trainingDao = null;
    private final long key = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.volfam.barska.data.Training> getTraining() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTrainingDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTrainingGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTrainingTrainer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTrainingPlace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTrainingPrice() {
        return null;
    }
    
    public final void initObservableValues() {
    }
    
    public final void updateTrainingTime(long timeInMillis) {
    }
    
    public final void updateTrainingGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String group) {
    }
    
    public final void updateTrainingTrainer(@org.jetbrains.annotations.NotNull()
    java.lang.String trainer) {
    }
    
    public final void updateTrainingPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String place) {
    }
    
    public final void addFiveToPrice() {
    }
    
    public final void substractFiveFromPrice() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.volfam.barska.data.Training updateTraining() {
        return null;
    }
    
    public final void deleteTraining() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.TrainingDao trainingDao, @org.jetbrains.annotations.NotNull()
    android.app.Application app, long key) {
        super(null);
    }
}