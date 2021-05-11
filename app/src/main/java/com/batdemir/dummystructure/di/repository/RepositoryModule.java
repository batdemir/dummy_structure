package com.batdemir.dummystructure.di.repository;

import com.batdemir.dummystructure.di.local.LocalDataSource;
import com.batdemir.dummystructure.di.remote.RemoteDataSource;

import java.util.ArrayList;
import java.util.List;

public class RepositoryModule {
    private final LocalDataSource localDataSource;
    private final RemoteDataSource remoteDataSource;

    public RepositoryModule(LocalDataSource localDataSource, RemoteDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    public List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add(localDataSource.getData());
        data.add(remoteDataSource.getData());
        return data;
    }
}
