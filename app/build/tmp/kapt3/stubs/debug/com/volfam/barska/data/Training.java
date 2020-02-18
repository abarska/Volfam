package com.volfam.barska.data;

import java.lang.System;

@androidx.room.Entity(tableName = "volfam_training_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\nH\u00c6\u0003JE\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\nH\u00d6\u0001J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R \u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\"\u0010&\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R\"\u0010)\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\"\u0010,\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0013\u00a8\u0006D"}, d2 = {"Lcom/volfam/barska/data/Training;", "", "trainingId", "", "group", "", "trainer", "place", "date", "price", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "amountCollected", "getAmountCollected", "()Ljava/lang/Integer;", "setAmountCollected", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDate", "()J", "setDate", "(J)V", "extraExpensesAmount", "getExtraExpensesAmount", "setExtraExpensesAmount", "extraExpensesComment", "getExtraExpensesComment", "()Ljava/lang/String;", "setExtraExpensesComment", "(Ljava/lang/String;)V", "extraIncomesAmount", "getExtraIncomesAmount", "setExtraIncomesAmount", "extraIncomesComment", "getExtraIncomesComment", "setExtraIncomesComment", "getGroup", "setGroup", "numberOfPlayers", "getNumberOfPlayers", "setNumberOfPlayers", "paidForGym", "getPaidForGym", "setPaidForGym", "paidToTrainer", "getPaidToTrainer", "setPaidToTrainer", "getPlace", "setPlace", "getPrice", "()I", "setPrice", "(I)V", "getTrainer", "setTrainer", "getTrainingId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Training {
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_number_of_players")
    private java.lang.Integer numberOfPlayers;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_amount_collected")
    private java.lang.Integer amountCollected;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_paid_to_trainer")
    private java.lang.Integer paidToTrainer;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_paid_for_gym")
    private java.lang.Integer paidForGym;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_extra_incomes_amount")
    private java.lang.Integer extraIncomesAmount;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_extra_incomes_comment")
    private java.lang.String extraIncomesComment;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_extra_expenses_amount")
    private java.lang.Integer extraExpensesAmount;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @androidx.room.ColumnInfo(name = "volfam_training_column_extra_expenses_comment")
    private java.lang.String extraExpensesComment;
    @androidx.room.ColumnInfo(name = "volfam_training_column_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long trainingId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "volfam_training_column_group")
    private java.lang.String group;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "volfam_training_column_trainer")
    private java.lang.String trainer;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "volfam_training_column_place")
    private java.lang.String place;
    @androidx.room.ColumnInfo(name = "volfam_training_column_date")
    private long date;
    @androidx.room.ColumnInfo(name = "volfam_training_column_price")
    private int price;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumberOfPlayers() {
        return null;
    }
    
    public final void setNumberOfPlayers(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAmountCollected() {
        return null;
    }
    
    public final void setAmountCollected(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPaidToTrainer() {
        return null;
    }
    
    public final void setPaidToTrainer(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPaidForGym() {
        return null;
    }
    
    public final void setPaidForGym(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExtraIncomesAmount() {
        return null;
    }
    
    public final void setExtraIncomesAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtraIncomesComment() {
        return null;
    }
    
    public final void setExtraIncomesComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExtraExpensesAmount() {
        return null;
    }
    
    public final void setExtraExpensesAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtraExpensesComment() {
        return null;
    }
    
    public final void setExtraExpensesComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getTrainingId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroup() {
        return null;
    }
    
    public final void setGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrainer() {
        return null;
    }
    
    public final void setTrainer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlace() {
        return null;
    }
    
    public final void setPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public final void setPrice(int p0) {
    }
    
    public Training(long trainingId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String trainer, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String place, @androidx.annotation.NonNull()
    long date, @androidx.annotation.NonNull()
    int price) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.volfam.barska.data.Training copy(long trainingId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String trainer, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String place, @androidx.annotation.NonNull()
    long date, @androidx.annotation.NonNull()
    int price) {
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