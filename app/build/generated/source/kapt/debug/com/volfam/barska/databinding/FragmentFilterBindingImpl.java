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
        sViewsWithIds.put(R.id.smugiljov_checkbox, 1);
        sViewsWithIds.put(R.id.sokolovskaya_checkbox, 2);
        sViewsWithIds.put(R.id.no_trainer_checkbox, 3);
        sViewsWithIds.put(R.id.light_checkbok, 4);
        sViewsWithIds.put(R.id.medium_checkbox, 5);
        sViewsWithIds.put(R.id.girls_checkbox, 6);
        sViewsWithIds.put(R.id.family_checkbox, 7);
        sViewsWithIds.put(R.id.kuznechnaya_checkbox, 8);
        sViewsWithIds.put(R.id.didrikhsona_checkbox, 9);
        sViewsWithIds.put(R.id.peresyp_checkbox, 10);
        sViewsWithIds.put(R.id.price_range_textview, 11);
        sViewsWithIds.put(R.id.price_range_bar, 12);
        sViewsWithIds.put(R.id.submit_button, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[9]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.CheckBox) bindings[6]
            , (android.widget.CheckBox) bindings[8]
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.CheckBox) bindings[10]
            , (com.edmodo.rangebar.RangeBar) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.ImageView) bindings[13]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
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