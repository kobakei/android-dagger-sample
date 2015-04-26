package com.kskkbys.android_dagger_sample.helper;

import android.content.Context;

/**
 * Created by keisuke on 15/04/24.
 */
public class PackageNameHelper {

    private Context mContext;

    public PackageNameHelper(Context context) {
        this.mContext = context;
    }

    public String getVersionName() {
        return mContext.getPackageName();
    }
}
