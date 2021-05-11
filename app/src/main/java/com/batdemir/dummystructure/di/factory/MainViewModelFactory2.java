package com.batdemir.dummystructure.di.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.batdemir.dummystructure.di.repository.RepositoryModule;
import com.batdemir.dummystructure.ui.main2.MainViewModel2;

public class MainViewModelFactory2 implements ViewModelProvider.Factory {
    private final RepositoryModule repositoryModule;

    public MainViewModelFactory2(RepositoryModule repositoryModule) {
        this.repositoryModule = repositoryModule;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainViewModel2(repositoryModule);
    }
}
