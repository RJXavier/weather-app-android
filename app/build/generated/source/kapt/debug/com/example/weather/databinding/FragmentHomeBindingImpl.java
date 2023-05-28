package com.example.weather.databinding;
import com.example.weather.R;
import com.example.weather.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.pb_loading, 1);
        sViewsWithIds.put(R.id.cardView, 2);
        sViewsWithIds.put(R.id.et_get_city_name, 3);
        sViewsWithIds.put(R.id.iv_weather_bg, 4);
        sViewsWithIds.put(R.id.tv_city_name, 5);
        sViewsWithIds.put(R.id.tv_day_max_temp, 6);
        sViewsWithIds.put(R.id.tv_day_min_temp, 7);
        sViewsWithIds.put(R.id.tv_temp, 8);
        sViewsWithIds.put(R.id.tv_weather_type, 9);
        sViewsWithIds.put(R.id.black_bar, 10);
        sViewsWithIds.put(R.id.tv_date_time, 11);
        sViewsWithIds.put(R.id.tv_feels_like, 12);
        sViewsWithIds.put(R.id.tv_pressure, 13);
        sViewsWithIds.put(R.id.textView5, 14);
        sViewsWithIds.put(R.id.imageView, 15);
        sViewsWithIds.put(R.id.tv_humidity, 16);
        sViewsWithIds.put(R.id.textView6, 17);
        sViewsWithIds.put(R.id.imageView2, 18);
        sViewsWithIds.put(R.id.tv_wind_speed, 19);
        sViewsWithIds.put(R.id.textView7, 20);
        sViewsWithIds.put(R.id.imageView3, 21);
        sViewsWithIds.put(R.id.imageView4, 22);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[19]
            );
        this.mainLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}