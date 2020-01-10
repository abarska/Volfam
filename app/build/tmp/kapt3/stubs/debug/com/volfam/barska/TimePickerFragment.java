package com.volfam.barska;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/volfam/barska/TimePickerFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "currentTime", "", "detailViewModel", "Lcom/volfam/barska/viewmodels/DetailViewModel;", "(JLcom/volfam/barska/viewmodels/DetailViewModel;)V", "calendar", "Ljava/util/Calendar;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onTimeSet", "", "view", "Landroid/widget/TimePicker;", "hourOfDay", "", "minute", "app_debug"})
public final class TimePickerFragment extends androidx.fragment.app.DialogFragment implements android.app.TimePickerDialog.OnTimeSetListener {
    private final java.util.Calendar calendar = null;
    private final long currentTime = 0L;
    private final com.volfam.barska.viewmodels.DetailViewModel detailViewModel = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.NotNull()
    android.widget.TimePicker view, int hourOfDay, int minute) {
    }
    
    public TimePickerFragment(long currentTime, @org.jetbrains.annotations.NotNull()
    com.volfam.barska.viewmodels.DetailViewModel detailViewModel) {
        super();
    }
}