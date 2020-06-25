package com.m2sys.demo.data;

import com.m2sys.demo.data.local.db.DbHelper;
import com.m2sys.demo.data.local.pref.PreferencesHelper;
import com.m2sys.demo.data.model.PicsumResponse;
import com.m2sys.demo.data.model.Url;
import com.m2sys.demo.data.remote.ApiHelper;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public interface DataManager extends DbHelper, PreferencesHelper, ApiHelper {
    Observable<List<Url>> getAllUrls();

    Observable<Boolean> saveUrl(Url url);

    Observable<Boolean> deleteUrl(Url url);

    Observable<Boolean> saveUrlList(List<Url> urls);

    Single<List<PicsumResponse>> getServerImageApiCall(int page, int limit);
}
