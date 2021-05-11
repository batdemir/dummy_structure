package com.batdemir.dummystructure.di;

import android.content.Context;

import com.batdemir.dummystructure.di.factory.MainViewModelFactory;
import com.batdemir.dummystructure.di.factory.MainViewModelFactory2;
import com.batdemir.dummystructure.di.local.LocalDataSource;
import com.batdemir.dummystructure.di.remote.RemoteDataSource;
import com.batdemir.dummystructure.di.repository.RepositoryModule;

public class ApplicationContainer {
    public final Context context;

    public ApplicationContainer(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    private LocalDataSource localDataSource = new LocalDataSource();
    private RemoteDataSource remoteDataSource = new RemoteDataSource();
    private RepositoryModule repositoryModule = new RepositoryModule(localDataSource, remoteDataSource);
    public MainViewModelFactory mainViewModelFactory = new MainViewModelFactory(repositoryModule);
    public MainViewModelFactory2 mainViewModelFactory2 = new MainViewModelFactory2(repositoryModule);
}
