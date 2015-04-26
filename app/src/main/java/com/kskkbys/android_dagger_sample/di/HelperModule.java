package com.kskkbys.android_dagger_sample.di;

import android.content.Context;

import com.kskkbys.android_dagger_sample.helper.PackageNameHelper;
import com.kskkbys.android_dagger_sample.helper.ToastHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by keisuke on 15/04/24.
 */
@Module
public class HelperModule {
    @Singleton
    @Provides
    PackageNameHelper providePackageNameHelper(Context context) {
        return new PackageNameHelper(context);
    }

    @Singleton
    @Provides
    ToastHelper provideToastHelper(Context context) {
        return new ToastHelper(context);
    }
}
