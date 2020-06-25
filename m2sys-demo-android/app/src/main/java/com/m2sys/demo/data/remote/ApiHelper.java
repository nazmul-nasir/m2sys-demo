package com.m2sys.demo.data.remote;

import com.m2sys.demo.data.model.PicsumResponse;

import java.util.List;

import io.reactivex.Single;

public interface ApiHelper {
    Single<List<PicsumResponse>> getServerImageApiCall(int page, int limit);
}
