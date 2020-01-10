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
        super(bindingComponent, root, 0
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
                mDirtyFlags = 0x4L;
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
        if (BR.training == variableId) {
            setTraining((com.volfam.barska.data.Training) variable);
        }
        else if (BR.detailViewModel == variableId) {
            setDetailViewModel((com.volfam.barska.viewmodels.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTraining(@Nullable com.volfam.barska.data.Training Training) {
        this.mTraining = Training;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.training);
        super.requestRebind();
    }
    public void setDetailViewModel(@Nullable com.volfam.barska.viewmodels.DetailViewModel DetailViewModel) {
        this.mDetailViewModel = DetailViewModel;
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
        java.lang.String trainingTrainer = null;
        com.volfam.barska.data.Training training = mTraining;
        java.lang.String trainingPlace = null;
        java.lang.String trainingGroup = null;
        long trainingDate = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (training != null) {
                    // read training.trainer
                    trainingTrainer = training.getTrainer();
                    // read training.place
                    trainingPlace = training.getPlace();
                    // read training.group
                    trainingGroup = training.getGroup();
                    // read training.date
                    trainingDate = training.getDate();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.volfam.barska.BindingUtilsKt.setFormattedDate(this.dateTextview, trainingDate);
            com.volfam.barska.BindingUtilsKt.setGroupWithLabel(this.groupTextview, trainingGroup);
            com.volfam.barska.BindingUtilsKt.setShortenedPlaceWithLabel(this.placeTextview, trainingPlace);
            com.volfam.barska.BindingUtilsKt.setFormattedStartTime(this.timeTextview, trainingDate);
            com.volfam.barska.BindingUtilsKt.setTrainerShortenedWithLabel(this.trainerTextview, trainingTrainer);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): training
        flag 1 (0x2L): detailViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}