package com.volfam.barska.databinding;
import com.volfam.barska.R;
import com.volfam.barska.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFilterBindingImpl extends FragmentFilterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.smugiljov_checkbox, 5);
        sViewsWithIds.put(R.id.sokolovskaya_checkbox, 6);
        sViewsWithIds.put(R.id.no_trainer_checkbox, 7);
        sViewsWithIds.put(R.id.light_checkbok, 8);
        sViewsWithIds.put(R.id.medium_checkbox, 9);
        sViewsWithIds.put(R.id.girls_checkbox, 10);
        sViewsWithIds.put(R.id.family_checkbox, 11);
        sViewsWithIds.put(R.id.price_range_textview, 12);
        sViewsWithIds.put(R.id.price_range_bar, 13);
        sViewsWithIds.put(R.id.date_range_picker, 14);
        sViewsWithIds.put(R.id.submit_button, 15);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.savvi.rangedatepicker.CalendarPickerView) bindings[14]
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.CheckBox) bindings[11]
            , (android.widget.CheckBox) bindings[10]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.CheckBox) bindings[8]
            , (android.widget.CheckBox) bindings[9]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.CheckBox) bindings[4]
            , (com.edmodo.rangebar.RangeBar) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.CheckBox) bindings[6]
            , (android.widget.ImageView) bindings[15]
            );
        this.didrikhsonaCheckbox.setTag(this.didrikhsonaCheckbox.getResources().getString(com.volfam.barska.R.string.place_label));
        this.kuznechnayaCheckbox.setTag(this.kuznechnayaCheckbox.getResources().getString(com.volfam.barska.R.string.place_label));
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.peresypCheckbox.setTag(this.peresypCheckbox.getResources().getString(com.volfam.barska.R.string.place_label));
        this.pushkinskayaCheckbox.setTag(this.pushkinskayaCheckbox.getResources().getString(com.volfam.barska.R.string.place_label));
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.filterViewModel == variableId) {
            setFilterViewModel((com.volfam.barska.viewmodels.FilterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFilterViewModel(@Nullable com.volfam.barska.viewmodels.FilterViewModel FilterViewModel) {
        this.mFilterViewModel = FilterViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.volfam.barska.BindingUtilsKt.setShortenedPlace(this.didrikhsonaCheckbox, didrikhsonaCheckbox.getResources().getString(R.string.place_label_didrikhsona));
            com.volfam.barska.BindingUtilsKt.setShortenedPlace(this.kuznechnayaCheckbox, kuznechnayaCheckbox.getResources().getString(R.string.place_label_kuznechnaya));
            com.volfam.barska.BindingUtilsKt.setShortenedPlace(this.peresypCheckbox, peresypCheckbox.getResources().getString(R.string.place_label_peresyp));
            com.volfam.barska.BindingUtilsKt.setShortenedPlace(this.pushkinskayaCheckbox, pushkinskayaCheckbox.getResources().getString(R.string.place_label_pushkinskaya));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): filterViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}