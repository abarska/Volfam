package com.volfam.barska.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u001e\u0010\'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nJ\u0018\u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0016\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006-"}, d2 = {"Lcom/volfam/barska/viewmodels/FilterViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_priceRangeText", "Landroidx/lifecycle/MutableLiveData;", "", "_setOfGroups", "", "", "_setOfPlaces", "_setOfTrainers", "getApp", "()Landroid/app/Application;", "arrayOfGroups", "", "getArrayOfGroups", "()[I", "arrayOfPlaces", "getArrayOfPlaces", "arrayOfTrainers", "getArrayOfTrainers", "value", "maxPrice", "getMaxPrice", "()I", "setMaxPrice", "(I)V", "minPrice", "getMinPrice", "setMinPrice", "priceRangeText", "Landroidx/lifecycle/LiveData;", "getPriceRangeText", "()Landroidx/lifecycle/LiveData;", "addValue", "", "tag", "modifySet", "action", "removeValue", "updatePrice", "left", "right", "app_debug"})
public final class FilterViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.util.Set<java.lang.Integer> _setOfTrainers = null;
    private final java.util.Set<java.lang.Integer> _setOfGroups = null;
    private final java.util.Set<java.lang.Integer> _setOfPlaces = null;
    private int minPrice;
    private int maxPrice;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _priceRangeText = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getArrayOfTrainers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getArrayOfGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getArrayOfPlaces() {
        return null;
    }
    
    public final void modifySet(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String value, int action) {
    }
    
    private final void addValue(java.lang.String tag, java.lang.String value) {
    }
    
    private final void removeValue(java.lang.String tag, java.lang.String value) {
    }
    
    public final int getMinPrice() {
        return 0;
    }
    
    private final void setMinPrice(int value) {
    }
    
    public final int getMaxPrice() {
        return 0;
    }
    
    private final void setMaxPrice(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPriceRangeText() {
        return null;
    }
    
    public final void updatePrice(int left, int right) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public FilterViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}