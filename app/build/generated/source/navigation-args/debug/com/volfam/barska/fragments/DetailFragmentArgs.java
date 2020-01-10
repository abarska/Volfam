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

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("trainingId")) {
      long trainingId;
      trainingId = bundle.getLong("trainingId");
      __result.arguments.put("trainingId", trainingId);
    } else {
      throw new IllegalArgumentException("Required argument \"trainingId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getTrainingId() {
    return (long) arguments.get("trainingId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("trainingId")) {
      long trainingId = (long) arguments.get("trainingId");
      __result.putLong("trainingId", trainingId);
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
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("trainingId") != that.arguments.containsKey("trainingId")) {
      return false;
    }
    if (getTrainingId() != that.getTrainingId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getTrainingId() ^ (getTrainingId() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "trainingId=" + getTrainingId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(long trainingId) {
      this.arguments.put("trainingId", trainingId);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTrainingId(long trainingId) {
      this.arguments.put("trainingId", trainingId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public long getTrainingId() {
      return (long) arguments.get("trainingId");
    }
  }
}
