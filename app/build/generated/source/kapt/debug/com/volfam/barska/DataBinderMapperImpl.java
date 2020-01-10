package com.volfam.barska;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.volfam.barska.databinding.ActivityMainBindingImpl;
import com.volfam.barska.databinding.FragmentCreateBindingImpl;
import com.volfam.barska.databinding.FragmentDetailBindingImpl;
import com.volfam.barska.databinding.FragmentFilterBindingImpl;
import com.volfam.barska.databinding.FragmentListBindingImpl;
import com.volfam.barska.databinding.LayoutHeaderBindingImpl;
import com.volfam.barska.databinding.ListItemViewTrainingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCREATE = 2;

  private static final int LAYOUT_FRAGMENTDETAIL = 3;

  private static final int LAYOUT_FRAGMENTFILTER = 4;

  private static final int LAYOUT_FRAGMENTLIST = 5;

  private static final int LAYOUT_LAYOUTHEADER = 6;

  private static final int LAYOUT_LISTITEMVIEWTRAINING = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.volfam.barska.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.volfam.barska.R.layout.fragment_create, LAYOUT_FRAGMENTCREATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.volfam.barska.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.volfam.barska.R.layout.fragment_filter, LAYOUT_FRAGMENTFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.volfam.barska.R.layout.fragment_list, LAYOUT_FRAGMENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.volfam.barska.R.layout.layout_header, LAYOUT_LAYOUTHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.volfam.barska.R.layout.list_item_view_training, LAYOUT_LISTITEMVIEWTRAINING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATE: {
          if ("layout/fragment_create_0".equals(tag)) {
            return new FragmentCreateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILTER: {
          if ("layout/fragment_filter_0".equals(tag)) {
            return new FragmentFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIST: {
          if ("layout/fragment_list_0".equals(tag)) {
            return new FragmentListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTHEADER: {
          if ("layout/layout_header_0".equals(tag)) {
            return new LayoutHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_header is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMVIEWTRAINING: {
          if ("layout/list_item_view_training_0".equals(tag)) {
            return new ListItemViewTrainingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_view_training is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "createViewModel");
      sKeys.put(2, "header");
      sKeys.put(3, "viewModel");
      sKeys.put(4, "training");
      sKeys.put(5, "clickListener");
      sKeys.put(6, "detailViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.volfam.barska.R.layout.activity_main);
      sKeys.put("layout/fragment_create_0", com.volfam.barska.R.layout.fragment_create);
      sKeys.put("layout/fragment_detail_0", com.volfam.barska.R.layout.fragment_detail);
      sKeys.put("layout/fragment_filter_0", com.volfam.barska.R.layout.fragment_filter);
      sKeys.put("layout/fragment_list_0", com.volfam.barska.R.layout.fragment_list);
      sKeys.put("layout/layout_header_0", com.volfam.barska.R.layout.layout_header);
      sKeys.put("layout/list_item_view_training_0", com.volfam.barska.R.layout.list_item_view_training);
    }
  }
}
