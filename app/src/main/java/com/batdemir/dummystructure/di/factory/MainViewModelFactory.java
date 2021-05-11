package com.batdemir.dummystructure.di.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.batdemir.dummystructure.di.repository.RepositoryModule;
import com.batdemir.dummystructure.ui.main.MainViewModel;

public class MainViewModelFactory implements ViewModelProvider.Factory {
    private final RepositoryModule repositoryModule;

    public MainViewModelFactory(RepositoryModule repositoryModule) {
        this.repositoryModule = repositoryModule;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainViewModel(repositoryModule);
    }
}
