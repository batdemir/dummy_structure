package com.batdemir.dummystructure.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.batdemir.dummystructure.R;
import com.batdemir.dummystructure.SDK;
import com.batdemir.dummystructure.databinding.ActivityMainBinding;
import com.batdemir.dummystructure.di.factory.MainViewModelFactory;
import com.batdemir.dummystructure.ui.base.BaseActivity;
import com.batdemir.dummystructure.ui.main2.MainActivity2;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel, MainViewModelFactory> {
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected Class<MainViewModel> getViewModel() {
        return MainViewModel.class;
    }

    @Override
    protected MainViewModelFactory getFactory() {
        return SDK.getInstance().getApplicationContainer().mainViewModelFactory;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.setViewModel(viewModel);
        binding.textView.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
    }
}