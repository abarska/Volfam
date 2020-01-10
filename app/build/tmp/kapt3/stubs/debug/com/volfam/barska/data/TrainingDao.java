package com.volfam.barska.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J>\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\'J\b\u0010\u0010\u001a\u00020\u0011H\'J\b\u0010\u0012\u001a\u00020\u0011H\'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\'\u00a8\u0006\u0017"}, d2 = {"Lcom/volfam/barska/data/TrainingDao;", "", "clearAll", "", "delete", "key", "", "getAllTrainings", "Landroidx/lifecycle/LiveData;", "", "Lcom/volfam/barska/data/Training;", "getAllTrainingsWithArgs", "groups", "", "trainers", "places", "getMaxPrice", "", "getRows", "getTraining", "insert", "training", "update", "app_debug"})
public abstract interface TrainingDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.Training training);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.volfam.barska.data.Training training);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM volfam_training_table WHERE volfam_training_column_id = :key")
    public abstract androidx.lifecycle.LiveData<com.volfam.barska.data.Training> getTraining(long key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM volfam_training_table ORDER BY volfam_training_column_date DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getAllTrainings();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM volfam_training_table WHERE volfam_training_column_group IN (:groups) AND volfam_training_column_trainer IN (:trainers) AND volfam_training_column_place IN (:places) ORDER BY volfam_training_column_date DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.volfam.barska.data.Training>> getAllTrainingsWithArgs(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> trainers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> places);
    
    @androidx.room.Query(value = "SELECT COUNT (volfam_training_column_id) FROM volfam_training_table")
    public abstract int getRows();
    
    @androidx.room.Query(value = "SELECT MAX (volfam_training_column_price) FROM volfam_training_table")
    public abstract int getMaxPrice();
    
    @androidx.room.Query(value = "DELETE FROM volfam_training_table")
    public abstract void clearAll();
    
    @androidx.room.Query(value = "DELETE FROM volfam_training_table WHERE volfam_training_column_id = :key")
    public abstract void delete(long key);
}