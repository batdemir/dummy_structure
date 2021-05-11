package com.batdemir.dummystructure.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.batdemir.dummystructure.di.repository.RepositoryModule;
import com.batdemir.dummystructure.ui.base.BaseViewModel;

public class MainViewModel extends BaseViewModel {
    private MutableLiveData<String> _data = new MutableLiveData<>();
    public LiveData<String> data = _data;

    public MainViewModel(RepositoryModule repositoryModule) {
        _data.setValue(repositoryModule.getData().get(0));
    }
}
