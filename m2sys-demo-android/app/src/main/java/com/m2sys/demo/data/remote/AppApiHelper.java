package com.m2sys.demo.data.remote;

import com.m2sys.demo.data.model.PicsumResponse;
import com.m2sys.demo.data.remote.api.APIService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class AppApiHelper implements ApiHelper {
    private final APIService apiService;

    @Inject
    public AppApiHelper(APIService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Single<List<PicsumResponse>> getServerImageApiCall(int page, int limit) {
        return apiService.getImagesFromServer(page, limit);
    }
}
