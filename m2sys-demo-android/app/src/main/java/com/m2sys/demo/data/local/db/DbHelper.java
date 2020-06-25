package com.m2sys.demo.data.local.db;

import com.m2sys.demo.data.model.Url;

import java.util.List;

import io.reactivex.Observable;

public interface DbHelper {
    Observable<List<Url>> getAllUrls();

    Observable<Boolean> saveUrl(final Url url);

    Observable<Boolean> deleteUrl(final Url url);

    Observable<Boolean> saveUrlList(List<Url> urls);
}
