package com.volfam.barska.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/volfam/barska/adapters/DataItem;", "", "()V", "id", "", "getId", "()J", "Header", "TrainingItem", "Lcom/volfam/barska/adapters/DataItem$TrainingItem;", "Lcom/volfam/barska/adapters/DataItem$Header;", "app_release"})
public abstract class DataItem {
    
    public abstract long getId();
    
    private DataItem() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/volfam/barska/adapters/DataItem$TrainingItem;", "Lcom/volfam/barska/adapters/DataItem;", "training", "Lcom/volfam/barska/data/Training;", "(Lcom/volfam/barska/data/Training;)V", "id", "", "getId", "()J", "getTraining", "()Lcom/volfam/barska/data/Training;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
    public static final class TrainingItem extends com.volfam.barska.adapters.DataItem {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.volfam.barska.data.Training training = null;
        
        @java.lang.Override()
        public long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.volfam.barska.data.Training getTraining() {
            return null;
        }
        
        public TrainingItem(@org.jetbrains.annotations.NotNull()
        com.volfam.barska.data.Training training) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.volfam.barska.data.Training component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.volfam.barska.adapters.DataItem.TrainingItem copy(@org.jetbrains.annotations.NotNull()
        com.volfam.barska.data.Training training) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/volfam/barska/adapters/DataItem$Header;", "Lcom/volfam/barska/adapters/DataItem;", "headerId", "", "ctx", "Landroid/content/Context;", "(JLandroid/content/Context;)V", "getCtx", "()Landroid/content/Context;", "getHeaderId", "()J", "id", "getId", "label", "", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
    public static final class Header extends com.volfam.barska.adapters.DataItem {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String label = null;
        private final long headerId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context ctx = null;
        
        @java.lang.Override()
        public long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        public final long getHeaderId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getCtx() {
            return null;
        }
        
        public Header(long headerId, @org.jetbrains.annotations.NotNull()
        android.content.Context ctx) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.volfam.barska.adapters.DataItem.Header copy(long headerId, @org.jetbrains.annotations.NotNull()
        android.content.Context ctx) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}