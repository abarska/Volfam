package com.volfam.barska;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0005\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0007\u00a8\u0006\u0016"}, d2 = {"setFormattedDate", "", "Landroid/widget/TextView;", "date", "", "(Landroid/widget/TextView;Ljava/lang/Long;)V", "setFormattedDateTime", "setFormattedGroupPrice", "training", "Lcom/volfam/barska/data/Training;", "setFormattedStartTime", "setGroupWithLabel", "group", "", "setPlaceWithBreakline", "place", "setShortenedPlace", "setShortenedPlaceWithLabel", "setTrainerImage", "Landroid/widget/ImageView;", "trainer", "setTrainerShortenedWithLabel", "app_release"})
public final class BindingUtilsKt {
    
    @androidx.databinding.BindingAdapter(value = {"trainer_image"})
    public static final void setTrainerImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setTrainerImage, @org.jetbrains.annotations.Nullable()
    java.lang.String trainer) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"formatted_date_time"})
    public static final void setFormattedDateTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFormattedDateTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"group_with_label"})
    public static final void setGroupWithLabel(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setGroupWithLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String group) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"trainer_shortened_with_label"})
    public static final void setTrainerShortenedWithLabel(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTrainerShortenedWithLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String trainer) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"formatted_date"})
    public static final void setFormattedDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFormattedDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"formatted_start_time"})
    public static final void setFormattedStartTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFormattedStartTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"formatted_group_price"})
    public static final void setFormattedGroupPrice(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFormattedGroupPrice, @org.jetbrains.annotations.Nullable()
    com.volfam.barska.data.Training training) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"place_shortened_with_label"})
    public static final void setShortenedPlaceWithLabel(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setShortenedPlaceWithLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String place) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"shortened_place"})
    public static final void setShortenedPlace(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setShortenedPlace, @org.jetbrains.annotations.Nullable()
    java.lang.String place) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"place_with_breakline"})
    public static final void setPlaceWithBreakline(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setPlaceWithBreakline, @org.jetbrains.annotations.Nullable()
    java.lang.String place) {
    }
}