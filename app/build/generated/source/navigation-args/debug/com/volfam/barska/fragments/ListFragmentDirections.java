package com.volfam.barska.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.volfam.barska.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListFragmentDirections {
  private ListFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListFragmentToCreateFragment() {
    return new ActionOnlyNavDirections(R.id.action_listFragment_to_createFragment);
  }

  @NonNull
  public static ActionListFragmentToDetailFragment actionListFragmentToDetailFragment(long trainingId) {
    return new ActionListFragmentToDetailFragment(trainingId);
  }

  @NonNull
  public static ActionListFragmentToFilterFragment actionListFragmentToFilterFragment(int maxPrice) {
    return new ActionListFragmentToFilterFragment(maxPrice);
  }

  public static class ActionListFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListFragmentToDetailFragment(long trainingId) {
      this.arguments.put("trainingId", trainingId);
    }

    @NonNull
    public ActionListFragmentToDetailFragment setTrainingId(long trainingId) {
      this.arguments.put("trainingId", trainingId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("trainingId")) {
        long trainingId = (long) arguments.get("trainingId");
        __result.putLong("trainingId", trainingId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_listFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    public long getTrainingId() {
      return (long) arguments.get("trainingId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListFragmentToDetailFragment that = (ActionListFragmentToDetailFragment) object;
      if (arguments.containsKey("trainingId") != that.arguments.containsKey("trainingId")) {
        return false;
      }
      if (getTrainingId() != that.getTrainingId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (int)(getTrainingId() ^ (getTrainingId() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "trainingId=" + getTrainingId()
          + "}";
    }
  }

  public static class ActionListFragmentToFilterFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListFragmentToFilterFragment(int maxPrice) {
      this.arguments.put("maxPrice", maxPrice);
    }

    @NonNull
    public ActionListFragmentToFilterFragment setMaxPrice(int maxPrice) {
      this.arguments.put("maxPrice", maxPrice);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("maxPrice")) {
        int maxPrice = (int) arguments.get("maxPrice");
        __result.putInt("maxPrice", maxPrice);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_listFragment_to_filterFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMaxPrice() {
      return (int) arguments.get("maxPrice");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListFragmentToFilterFragment that = (ActionListFragmentToFilterFragment) object;
      if (arguments.containsKey("maxPrice") != that.arguments.containsKey("maxPrice")) {
        return false;
      }
      if (getMaxPrice() != that.getMaxPrice()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getMaxPrice();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListFragmentToFilterFragment(actionId=" + getActionId() + "){"
          + "maxPrice=" + getMaxPrice()
          + "}";
    }
  }
}
