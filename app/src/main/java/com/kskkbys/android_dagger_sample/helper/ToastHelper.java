package com.kskkbys.android_dagger_sample.helper;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by keisuke on 15/04/27.
 */
public class ToastHelper {

    private Context mContext;

    public ToastHelper(Context context) {
        mContext = context;
    }

    public void show() {
        Toast.makeText(mContext, "Hello!", Toast.LENGTH_SHORT).show();
    }
}
