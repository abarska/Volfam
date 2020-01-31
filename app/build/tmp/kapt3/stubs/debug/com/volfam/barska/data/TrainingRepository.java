package com.volfam.barska.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\\\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nJ\u0011\u0010\u001a\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\nJ\u0019\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/volfam/barska/data/TrainingRepository;", "", "trainingDao", "Lcom/volfam/barska/data/TrainingDao;", "(Lcom/volfam/barska/data/TrainingDao;)V", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "key", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTrainings", "Landroidx/lifecycle/LiveData;", "", "Lcom/volfam/barska/data/Training;", "getFilteredTrainings", "groups", "", "trainers", "places", "minPrice", "", "maxPrice", "startDate", "endDate", "getMaxPrice", "getTraining", "insert", "training", "(Lcom/volfam/barska/data/Training;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public final class TrainingRepository {
    private final com.volfam.barska.data.TrainingDao trainingDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.Training training, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.Training training, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.volfam.barska.data.Training> getTraining(long key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getAllTrainings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getFilteredTrainings(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> trainers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> places, int minPrice, int maxPrice, long startDate, long endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMaxPrice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(long key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public TrainingRepository(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.TrainingDao trainingDao) {
        super();
    }
}