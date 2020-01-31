package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\u0006\u0010\'\u001a\u00020\u0015J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\fJ\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\fJ\u000e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0007J\u000e\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\fR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0017\u00a8\u00060"}, d2 = {"Lcom/volfam/barska/viewmodels/DetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "app", "Landroid/app/Application;", "key", "", "(Lcom/volfam/barska/data/TrainingDao;Landroid/app/Application;J)V", "_trainingDateTime", "Landroidx/lifecycle/MutableLiveData;", "_trainingGroup", "", "_trainingPlace", "_trainingPrice", "", "_trainingTrainer", "repository", "Lcom/volfam/barska/data/TrainingRepository;", "training", "Landroidx/lifecycle/LiveData;", "Lcom/volfam/barska/data/Training;", "getTraining", "()Landroidx/lifecycle/LiveData;", "trainingDateTime", "getTrainingDateTime", "trainingGroup", "getTrainingGroup", "trainingPlace", "getTrainingPlace", "trainingPrice", "getTrainingPrice", "trainingTrainer", "getTrainingTrainer", "addFiveToPrice", "", "deleteTraining", "initObservableValues", "substractFiveFromPrice", "updateTraining", "updateTrainingGroup", "group", "updateTrainingPlace", "place", "updateTrainingTime", "timeInMillis", "updateTrainingTrainer", "trainer", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.AndroidViewModel {
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
    com.volfam.barska.data.TrainingDao trainingDao, @org.jetbrains.annotations.NotNull()
    android.app.Application app, long key) {
        super(null);
    }
}