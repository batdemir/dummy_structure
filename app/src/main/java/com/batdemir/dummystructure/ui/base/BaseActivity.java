package com.batdemir.dummystructure.ui.base;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

public abstract class BaseActivity<B extends ViewDataBinding, V extends BaseViewModel, F extends ViewModelProvider.Factory> extends AppCompatActivity {
    protected B binding;
    protected V viewModel;
    protected F factory;

    protected abstract @LayoutRes
    int getLayout();

    protected abstract Class<V> getViewModel();

    protected abstract F getFactory();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    protected void init() {
        binding = DataBindingUtil.setContentView(this, getLayout());
        viewModel = new ViewModelProvider(this, getFactory()).get(getViewModel());
    }
}
