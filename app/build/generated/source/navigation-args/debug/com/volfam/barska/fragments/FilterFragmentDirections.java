package com.volfam.barska.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.volfam.barska.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FilterFragmentDirections {
  private FilterFragmentDirections() {
  }

  @NonNull
  public static ActionFilterFragmentToListFragment actionFilterFragmentToListFragment() {
    return new ActionFilterFragmentToListFragment();
  }

  public static class ActionFilterFragmentToListFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFilterFragmentToListFragment() {
    }

    @NonNull
    public ActionFilterFragmentToListFragment setGroupArray(@Nullable int[] groupArray) {
      this.arguments.put("groupArray", groupArray);
      return this;
    }

    @NonNull
    public ActionFilterFragmentToListFragment setTrainerArray(@Nullable int[] trainerArray) {
      this.arguments.put("trainerArray", trainerArray);
      return this;
    }

    @NonNull
    public ActionFilterFragmentToListFragment setPlaceArray(@Nullable int[] placeArray) {
      this.arguments.put("placeArray", placeArray);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_filterFragment_to_listFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFilterFragmentToListFragment that = (ActionFilterFragmentToListFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFilterFragmentToListFragment(actionId=" + getActionId() + "){"
          + "groupArray=" + getGroupArray()
          + ", trainerArray=" + getTrainerArray()
          + ", placeArray=" + getPlaceArray()
          + "}";
    }
  }
}
