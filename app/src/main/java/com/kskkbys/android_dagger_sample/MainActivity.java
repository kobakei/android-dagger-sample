package com.kskkbys.android_dagger_sample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.kskkbys.android_dagger_sample.di.ContextModule;
import com.kskkbys.android_dagger_sample.di.DaggerMyComponent;
import com.kskkbys.android_dagger_sample.di.HelperModule;
import com.kskkbys.android_dagger_sample.di.MyComponent;
import com.kskkbys.android_dagger_sample.helper.ToastHelper;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {

    @Inject
    ToastHelper mToastHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // コンポーネントを作成
        MyComponent component = DaggerMyComponent.builder().contextModule(new ContextModule(this)).build();

        // 使い方１：コンポーネントからインスタンスを取得するパターン
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(component.packageNameHelper().getVersionName());

        // 使い方２：injectで@Injectがついた変数にインスタンスをセットする
        component.inject(this);
        mToastHelper.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
