package com.batdemir.dummystructure.ui.main2;

import android.content.Intent;
import android.os.Bundle;

import com.batdemir.dummystructure.R;
import com.batdemir.dummystructure.SDK;
import com.batdemir.dummystructure.databinding.ActivityMain2Binding;
import com.batdemir.dummystructure.di.factory.MainViewModelFactory2;
import com.batdemir.dummystructure.ui.base.BaseActivity;
import com.batdemir.dummystructure.ui.main.MainActivity;

public class MainActivity2 extends BaseActivity<ActivityMain2Binding, MainViewModel2, MainViewModelFactory2> {
    @Override
    protected int getLayout() {
        return R.layout.activity_main2;
    }

    @Override
    protected Class<MainViewModel2> getViewModel() {
        return MainViewModel2.class;
    }

    @Override
    protected MainViewModelFactory2 getFactory() {
        return SDK.getInstance().getApplicationContainer().mainViewModelFactory2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.setViewModel(viewModel);
        binding.textView.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}