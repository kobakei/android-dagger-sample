package com.kskkbys.android_dagger_sample.di;

import android.content.Context;

import com.kskkbys.android_dagger_sample.MainActivity;
import com.kskkbys.android_dagger_sample.helper.PackageNameHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by keisuke on 15/04/24.
 */
@Singleton
@Component(modules = {ContextModule.class, HelperModule.class})
public interface MyComponent {
    Context context();
    PackageNameHelper packageNameHelper();

    void inject(MainActivity target);
}
