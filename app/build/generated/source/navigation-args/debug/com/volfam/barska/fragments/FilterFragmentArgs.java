package com.volfam.barska.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FilterFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FilterFragmentArgs() {
  }

  private FilterFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FilterFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FilterFragmentArgs __result = new FilterFragmentArgs();
    bundle.setClassLoader(FilterFragmentArgs.class.getClassLoader());
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
  public int getMaxPrice() {
    return (int) arguments.get("maxPrice");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
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
    FilterFragmentArgs that = (FilterFragmentArgs) object;
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
    result = 31 * result + getMaxPrice();
    return result;
  }

  @Override
  public String toString() {
    return "FilterFragmentArgs{"
        + "maxPrice=" + getMaxPrice()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(FilterFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int maxPrice) {
      this.arguments.put("maxPrice", maxPrice);
    }

    @NonNull
    public FilterFragmentArgs build() {
      FilterFragmentArgs result = new FilterFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMaxPrice(int maxPrice) {
      this.arguments.put("maxPrice", maxPrice);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getMaxPrice() {
      return (int) arguments.get("maxPrice");
    }
  }
}
