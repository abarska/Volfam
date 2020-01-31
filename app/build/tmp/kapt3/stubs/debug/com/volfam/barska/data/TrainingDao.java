package com.volfam.barska.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\'J^\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\'J\u0011\u0010\u0017\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/volfam/barska/data/TrainingDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "key", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTrainings", "Landroidx/lifecycle/LiveData;", "", "Lcom/volfam/barska/data/Training;", "getFilteredTrainings", "groups", "", "trainers", "places", "minPrice", "", "maxPrice", "startDate", "endDate", "getMaxPrice", "getTraining", "insert", "training", "(Lcom/volfam/barska/data/Training;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface TrainingDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.Training training, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.Training training, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM volfam_training_table WHERE volfam_training_column_id = :key")
    public abstract androidx.lifecycle.LiveData<com.volfam.barska.data.Training> getTraining(long key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM volfam_training_table ORDER BY volfam_training_column_date DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getAllTrainings();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM volfam_training_table WHERE volfam_training_column_group IN (:groups) AND volfam_training_column_trainer IN (:trainers) AND volfam_training_column_place IN (:places) AND volfam_training_column_price BETWEEN (:minPrice) AND (:maxPrice)AND volfam_training_column_date BETWEEN (:startDate) AND (:endDate)ORDER BY volfam_training_column_date DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getFilteredTrainings(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> trainers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> places, int minPrice, int maxPrice, long startDate, long endDate);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT MAX (volfam_training_column_price) FROM volfam_training_table")
    public abstract java.lang.Object getMaxPrice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM volfam_training_table")
    public abstract java.lang.Object clearAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM volfam_training_table WHERE volfam_training_column_id = :key")
    public abstract java.lang.Object delete(long key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}