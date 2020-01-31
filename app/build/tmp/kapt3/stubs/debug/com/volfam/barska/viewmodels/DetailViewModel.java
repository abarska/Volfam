package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\u0006\u0010\'\u001a\u00020\u0013J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\nJ\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\nJ\u000e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\nR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u00128F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0015\u00a8\u00060"}, d2 = {"Lcom/volfam/barska/viewmodels/DetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "key", "", "(Landroid/app/Application;J)V", "_trainingDateTime", "Landroidx/lifecycle/MutableLiveData;", "_trainingGroup", "", "_trainingPlace", "_trainingPrice", "", "_trainingTrainer", "repository", "Lcom/volfam/barska/data/TrainingRepository;", "training", "Landroidx/lifecycle/LiveData;", "Lcom/volfam/barska/data/Training;", "getTraining", "()Landroidx/lifecycle/LiveData;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "trainingDateTime", "getTrainingDateTime", "trainingGroup", "getTrainingGroup", "trainingPlace", "getTrainingPlace", "trainingPrice", "getTrainingPrice", "trainingTrainer", "getTrainingTrainer", "addFiveToPrice", "", "deleteTraining", "initObservableValues", "substractFiveFromPrice", "updateTraining", "updateTrainingGroup", "group", "updateTrainingPlace", "place", "updateTrainingTime", "timeInMillis", "updateTrainingTrainer", "trainer", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.volfam.barska.data.TrainingDao trainingDao = null;
    private final com.volfam.barska.data.TrainingRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.volfam.barska.data.Training> training = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _trainingDateTime = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _trainingGroup = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _trainingTrainer = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _trainingPlace = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _trainingPrice = null;
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
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, long key) {
        super(null);
    }
}