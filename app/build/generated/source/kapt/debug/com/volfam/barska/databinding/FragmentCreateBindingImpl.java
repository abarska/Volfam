package com.volfam.barska.databinding;
import com.volfam.barska.R;
import com.volfam.barska.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCreateBindingImpl extends FragmentCreateBinding implements com.volfam.barska.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.training_date_picker, 11);
        sViewsWithIds.put(R.id.group_textview, 12);
        sViewsWithIds.put(R.id.group_radio_group, 13);
        sViewsWithIds.put(R.id.trainer_textview, 14);
        sViewsWithIds.put(R.id.trainer_radio_group, 15);
        sViewsWithIds.put(R.id.place_textview, 16);
        sViewsWithIds.put(R.id.place_radio_group, 17);
        sViewsWithIds.put(R.id.training_start_time_picker, 18);
        sViewsWithIds.put(R.id.price_edittext, 19);
        sViewsWithIds.put(R.id.submit_button, 20);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCreateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentCreateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioGroup) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.RadioButton) bindings[8]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.RadioGroup) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.EditText) bindings[19]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.RadioGroup) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.DatePicker) bindings[11]
            , (android.widget.TimePicker) bindings[18]
            );
        this.didrikhsonaRadioButton.setTag(null);
        this.familyRadioButton.setTag(null);
        this.girlsRadioButton.setTag(null);
        this.kuznechnayaRadioButton.setTag(null);
        this.lightRadioButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mediumRadioButton.setTag(null);
        this.noTrainerRadioButton.setTag(null);
        this.peresypRadioButton.setTag(null);
        this.smugiljovRadioButton.setTag(null);
        this.sokolovskayaRadioButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.volfam.barska.generated.callback.OnClickListener(this, 8);
        mCallback6 = new com.volfam.barska.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.volfam.barska.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.volfam.barska.generated.callback.OnClickListener(this, 2);
        mCallback10 = new com.volfam.barska.generated.callback.OnClickListener(this, 10);
        mCallback9 = new com.volfam.barska.generated.callback.OnClickListener(this, 9);
        mCallback7 = new com.volfam.barska.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.volfam.barska.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.volfam.barska.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.volfam.barska.generated.callback.OnClickListener(this, 1);
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
        if (BR.createViewModel == variableId) {
            setCreateViewModel((com.volfam.barska.viewmodels.CreateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCreateViewModel(@Nullable com.volfam.barska.viewmodels.CreateViewModel CreateViewModel) {
        this.mCreateViewModel = CreateViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.createViewModel);
        super.requestRebind();
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
        com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.didrikhsonaRadioButton.setOnClickListener(mCallback9);
            com.volfam.barska.BindingUtilsKt.setShortenedPlace(this.didrikhsonaRadioButton, didrikhsonaRadioButton.getResources().getString(R.string.place_label_didrikhsona));
            this.familyRadioButton.setOnClickListener(mCallback4);
            this.girlsRadioButton.setOnClickListener(mCallback3);
            this.kuznechnayaRadioButton.setOnClickListener(mCallback8);
            com.volfam.barska.BindingUtilsKt.setShortenedPlace(this.kuznechnayaRadioButton, kuznechnayaRadioButton.getResources().getString(R.string.place_label_kuznechnaya));
            this.lightRadioButton.setOnClickListener(mCallback1);
            this.mediumRadioButton.setOnClickListener(mCallback2);
            this.noTrainerRadioButton.setOnClickListener(mCallback7);
            this.peresypRadioButton.setOnClickListener(mCallback10);
            com.volfam.barska.BindingUtilsKt.setShortenedPlace(this.peresypRadioButton, peresypRadioButton.getResources().getString(R.string.place_label_peresyp));
            this.smugiljovRadioButton.setOnClickListener(mCallback5);
            this.sokolovskayaRadioButton.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updatePlace(kuznechnayaRadioButton.getResources().getString(R.string.place_label_kuznechnaya));
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updateTrainer(sokolovskayaRadioButton.getResources().getString(R.string.trainer_label_sokolovskaya));
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updateGroup(familyRadioButton.getResources().getString(R.string.group_label_family));
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updateGroup(mediumRadioButton.getResources().getString(R.string.group_label_medium));
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updatePlace(peresypRadioButton.getResources().getString(R.string.place_label_peresyp));
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updatePlace(didrikhsonaRadioButton.getResources().getString(R.string.place_label_didrikhsona));
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updateTrainer(noTrainerRadioButton.getResources().getString(R.string.no_trainer_label));
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updateTrainer(smugiljovRadioButton.getResources().getString(R.string.trainer_label_smugilev));
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updateGroup(girlsRadioButton.getResources().getString(R.string.group_label_girls));
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // createViewModel
                com.volfam.barska.viewmodels.CreateViewModel createViewModel = mCreateViewModel;
                // createViewModel != null
                boolean createViewModelJavaLangObjectNull = false;



                createViewModelJavaLangObjectNull = (createViewModel) != (null);
                if (createViewModelJavaLangObjectNull) {



                    createViewModel.updateGroup(lightRadioButton.getResources().getString(R.string.group_label_light));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): createViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}