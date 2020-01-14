package com.volfam.barska.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FilteredListFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FilteredListFragmentArgs() {
  }

  private FilteredListFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FilteredListFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FilteredListFragmentArgs __result = new FilteredListFragmentArgs();
    bundle.setClassLoader(FilteredListFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("groupArray")) {
      int[] groupArray;
      groupArray = bundle.getIntArray("groupArray");
      __result.arguments.put("groupArray", groupArray);
    }
    if (bundle.containsKey("trainerArray")) {
      int[] trainerArray;
      trainerArray = bundle.getIntArray("trainerArray");
      __result.arguments.put("trainerArray", trainerArray);
    }
    if (bundle.containsKey("placeArray")) {
      int[] placeArray;
      placeArray = bundle.getIntArray("placeArray");
      __result.arguments.put("placeArray", placeArray);
    }
    if (bundle.containsKey("minPrice")) {
      int minPrice;
      minPrice = bundle.getInt("minPrice");
      __result.arguments.put("minPrice", minPrice);
    } else {
      throw new IllegalArgumentException("Required argument \"minPrice\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("maxPrice")) {
      int maxPrice;
      maxPrice = bundle.getInt("maxPrice");
      __result.arguments.put("maxPrice", maxPrice);
    } else {
      throw new IllegalArgumentException("Required argument \"maxPrice\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public int[] getGroupArray() {
    return (int[]) arguments.get("groupArray");
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public int[] getTrainerArray() {
    return (int[]) arguments.get("trainerArray");
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public int[] getPlaceArray() {
    return (int[]) arguments.get("placeArray");
  }

  @SuppressWarnings("unchecked")
  public int getMinPrice() {
    return (int) arguments.get("minPrice");
  }

  @SuppressWarnings("unchecked")
  public int getMaxPrice() {
    return (int) arguments.get("maxPrice");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("groupArray")) {
      int[] groupArray = (int[]) arguments.get("groupArray");
      __result.putIntArray("groupArray", groupArray);
    }
    if (arguments.containsKey("trainerArray")) {
      int[] trainerArray = (int[]) arguments.get("trainerArray");
      __result.putIntArray("trainerArray", trainerArray);
    }
    if (arguments.containsKey("placeArray")) {
      int[] placeArray = (int[]) arguments.get("placeArray");
      __result.putIntArray("placeArray", placeArray);
    }
    if (arguments.containsKey("minPrice")) {
      int minPrice = (int) arguments.get("minPrice");
      __result.putInt("minPrice", minPrice);
    }
    if (arguments.containsKey("maxPrice")) {
      int maxPrice = (int) arguments.get("maxPrice");
      __result.putInt("maxPrice", maxPrice);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    FilteredListFragmentArgs that = (FilteredListFragmentArgs) object;
    if (arguments.containsKey("groupArray") != that.arguments.containsKey("groupArray")) {
      return false;
    }
    if (getGroupArray() != null ? !getGroupArray().equals(that.getGroupArray()) : that.getGroupArray() != null) {
      return false;
    }
    if (arguments.containsKey("trainerArray") != that.arguments.containsKey("trainerArray")) {
      return false;
    }
    if (getTrainerArray() != null ? !getTrainerArray().equals(that.getTrainerArray()) : that.getTrainerArray() != null) {
      return false;
    }
    if (arguments.containsKey("placeArray") != that.arguments.containsKey("placeArray")) {
      return false;
    }
    if (getPlaceArray() != null ? !getPlaceArray().equals(that.getPlaceArray()) : that.getPlaceArray() != null) {
      return false;
    }
    if (arguments.containsKey("minPrice") != that.arguments.containsKey("minPrice")) {
      return false;
    }
    if (getMinPrice() != that.getMinPrice()) {
      return false;
    }
    if (arguments.containsKey("maxPrice") != that.arguments.containsKey("maxPrice")) {
      return false;
    }
    if (getMaxPrice() != that.getMaxPrice()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + java.util.Arrays.hashCode(getGroupArray());
    result = 31 * result + java.util.Arrays.hashCode(getTrainerArray());
    result = 31 * result + java.util.Arrays.hashCode(getPlaceArray());
    result = 31 * result + getMinPrice();
    result = 31 * result + getMaxPrice();
    return result;
  }

  @Override
  public String toString() {
    return "FilteredListFragmentArgs{"
        + "groupArray=" + getGroupArray()
        + ", trainerArray=" + getTrainerArray()
        + ", placeArray=" + getPlaceArray()
        + ", minPrice=" + getMinPrice()
        + ", maxPrice=" + getMaxPrice()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(FilteredListFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int minPrice, int maxPrice) {
      this.arguments.put("minPrice", minPrice);
      this.arguments.put("maxPrice", maxPrice);
    }

    @NonNull
    public FilteredListFragmentArgs build() {
      FilteredListFragmentArgs result = new FilteredListFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setGroupArray(@Nullable int[] groupArray) {
      this.arguments.put("groupArray", groupArray);
      return this;
    }

    @NonNull
    public Builder setTrainerArray(@Nullable int[] trainerArray) {
      this.arguments.put("trainerArray", trainerArray);
      return this;
    }

    @NonNull
    public Builder setPlaceArray(@Nullable int[] placeArray) {
      this.arguments.put("placeArray", placeArray);
      return this;
    }

    @NonNull
    public Builder setMinPrice(int minPrice) {
      this.arguments.put("minPrice", minPrice);
      return this;
    }

    @NonNull
    public Builder setMaxPrice(int maxPrice) {
      this.arguments.put("maxPrice", maxPrice);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public int[] getGroupArray() {
      return (int[]) arguments.get("groupArray");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public int[] getTrainerArray() {
      return (int[]) arguments.get("trainerArray");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public int[] getPlaceArray() {
      return (int[]) arguments.get("placeArray");
    }

    @SuppressWarnings("unchecked")
    public int getMinPrice() {
      return (int) arguments.get("minPrice");
    }

    @SuppressWarnings("unchecked")
    public int getMaxPrice() {
      return (int) arguments.get("maxPrice");
    }
  }
}
