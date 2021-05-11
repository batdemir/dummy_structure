package com.batdemir.dummystructure.ui.main2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.batdemir.dummystructure.di.repository.RepositoryModule;
import com.batdemir.dummystructure.ui.base.BaseViewModel;

public class MainViewModel2 extends BaseViewModel {
    private MutableLiveData<String> _data = new MutableLiveData<>();
    public LiveData<String> data = _data;

    public MainViewModel2(RepositoryModule repositoryModule) {
        _data.setValue(repositoryModule.getData().get(1));
    }
}
