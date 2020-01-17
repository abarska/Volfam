package com.volfam.barska.databinding;
import com.volfam.barska.R;
import com.volfam.barska.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.minus_five_button, 6);
        sViewsWithIds.put(R.id.price_textview, 7);
        sViewsWithIds.put(R.id.plus_five_button, 8);
        sViewsWithIds.put(R.id.share_again_checkbox_label, 9);
        sViewsWithIds.put(R.id.change_button, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.CheckBox) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.dateTextview.setTag(null);
        this.groupTextview.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.placeTextview.setTag(null);
        this.timeTextview.setTag(null);
        this.trainerTextview.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.detailViewModel == variableId) {
            setDetailViewModel((com.volfam.barska.viewmodels.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetailViewModel(@Nullable com.volfam.barska.viewmodels.DetailViewModel DetailViewModel) {
        this.mDetailViewModel = DetailViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.detailViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDetailViewModelTrainingGroup((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDetailViewModelTrainingPlace((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDetailViewModelTrainingTrainer((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDetailViewModelTrainingDateTime((androidx.lifecycle.LiveData<java.lang.Long>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDetailViewModelTrainingGroup(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelTrainingGroup, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelTrainingPlace(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelTrainingPlace, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelTrainingTrainer(androidx.lifecycle.LiveData<java.lang.String> DetailViewModelTrainingTrainer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDetailViewModelTrainingDateTime(androidx.lifecycle.LiveData<java.lang.Long> DetailViewModelTrainingDateTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelTrainingGroup = null;
        java.lang.String detailViewModelTrainingGroupGetValue = null;
        java.lang.Long detailViewModelTrainingDateTimeGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelTrainingPlace = null;
        androidx.lifecycle.LiveData<java.lang.String> detailViewModelTrainingTrainer = null;
        androidx.lifecycle.LiveData<java.lang.Long> detailViewModelTrainingDateTime = null;
        com.volfam.barska.viewmodels.DetailViewModel detailViewModel = mDetailViewModel;
        java.lang.String detailViewModelTrainingTrainerGetValue = null;
        java.lang.String detailViewModelTrainingPlaceGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.trainingGroup
                        detailViewModelTrainingGroup = detailViewModel.getTrainingGroup();
                    }
                    updateLiveDataRegistration(0, detailViewModelTrainingGroup);


                    if (detailViewModelTrainingGroup != null) {
                        // read detailViewModel.trainingGroup.getValue()
                        detailViewModelTrainingGroupGetValue = detailViewModelTrainingGroup.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.trainingPlace
                        detailViewModelTrainingPlace = detailViewModel.getTrainingPlace();
                    }
                    updateLiveDataRegistration(1, detailViewModelTrainingPlace);


                    if (detailViewModelTrainingPlace != null) {
                        // read detailViewModel.trainingPlace.getValue()
                        detailViewModelTrainingPlaceGetValue = detailViewModelTrainingPlace.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.trainingTrainer
                        detailViewModelTrainingTrainer = detailViewModel.getTrainingTrainer();
                    }
                    updateLiveDataRegistration(2, detailViewModelTrainingTrainer);


                    if (detailViewModelTrainingTrainer != null) {
                        // read detailViewModel.trainingTrainer.getValue()
                        detailViewModelTrainingTrainerGetValue = detailViewModelTrainingTrainer.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (detailViewModel != null) {
                        // read detailViewModel.trainingDateTime
                        detailViewModelTrainingDateTime = detailViewModel.getTrainingDateTime();
                    }
                    updateLiveDataRegistration(3, detailViewModelTrainingDateTime);


                    if (detailViewModelTrainingDateTime != null) {
                        // read detailViewModel.trainingDateTime.getValue()
                        detailViewModelTrainingDateTimeGetValue = detailViewModelTrainingDateTime.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.volfam.barska.BindingUtilsKt.setFormattedDate(this.dateTextview, detailViewModelTrainingDateTimeGetValue);
            com.volfam.barska.BindingUtilsKt.setFormattedStartTime(this.timeTextview, detailViewModelTrainingDateTimeGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.volfam.barska.BindingUtilsKt.setGroupWithLabel(this.groupTextview, detailViewModelTrainingGroupGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            com.volfam.barska.BindingUtilsKt.setShortenedPlaceWithLabel(this.placeTextview, detailViewModelTrainingPlaceGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            com.volfam.barska.BindingUtilsKt.setTrainerShortenedWithLabel(this.trainerTextview, detailViewModelTrainingTrainerGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): detailViewModel.trainingGroup
        flag 1 (0x2L): detailViewModel.trainingPlace
        flag 2 (0x3L): detailViewModel.trainingTrainer
        flag 3 (0x4L): detailViewModel.trainingDateTime
        flag 4 (0x5L): detailViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}