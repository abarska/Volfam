package com.volfam.barska.databinding;
import com.volfam.barska.R;
import com.volfam.barska.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemViewTrainingBindingImpl extends ListItemViewTrainingBinding implements com.volfam.barska.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemViewTrainingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListItemViewTrainingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            );
        this.dateTextview.setTag(null);
        this.groupTextview.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.placeTextview.setTag(null);
        this.trainerIcon.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.volfam.barska.generated.callback.OnClickListener(this, 1);
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
        if (BR.clickListener == variableId) {
            setClickListener((com.volfam.barska.adapters.TrainingClickListener) variable);
        }
        else if (BR.training == variableId) {
            setTraining((com.volfam.barska.data.Training) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable com.volfam.barska.adapters.TrainingClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setTraining(@Nullable com.volfam.barska.data.Training Training) {
        this.mTraining = Training;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.training);
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
        java.lang.String trainingTrainer = null;
        long trainingDate = 0;
        com.volfam.barska.adapters.TrainingClickListener clickListener = mClickListener;
        com.volfam.barska.data.Training training = mTraining;
        java.lang.String trainingPlace = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (training != null) {
                    // read training.trainer
                    trainingTrainer = training.getTrainer();
                    // read training.date
                    trainingDate = training.getDate();
                    // read training.place
                    trainingPlace = training.getPlace();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.volfam.barska.BindingUtilsKt.setFormattedDateTime(this.dateTextview, trainingDate);
            com.volfam.barska.BindingUtilsKt.setFormattedGroupPrice(this.groupTextview, training);
            com.volfam.barska.BindingUtilsKt.setPlaceWithBreakline(this.placeTextview, trainingPlace);
            com.volfam.barska.BindingUtilsKt.setTrainerImage(this.trainerIcon, trainingTrainer);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback12);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        com.volfam.barska.adapters.TrainingClickListener clickListener = mClickListener;
        // training
        com.volfam.barska.data.Training training = mTraining;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onClick(training);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): training
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}