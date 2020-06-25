package com.m2sys.demo.di.module;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.m2sys.demo.data.AppDataManager;
import com.m2sys.demo.data.DataManager;
import com.m2sys.demo.data.local.db.AppDatabase;
import com.m2sys.demo.data.local.db.AppDbHelper;
import com.m2sys.demo.data.local.db.DbHelper;
import com.m2sys.demo.data.local.pref.AppPreferencesHelper;
import com.m2sys.demo.data.local.pref.PreferencesHelper;
import com.m2sys.demo.data.remote.ApiHelper;
import com.m2sys.demo.data.remote.AppApiHelper;
import com.m2sys.demo.di.DatabaseInfo;
import com.m2sys.demo.di.PreferenceInfo;
import com.m2sys.demo.utils.AppConstants;
import com.m2sys.demo.utils.rx.AppSchedulerProvider;
import com.m2sys.demo.utils.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@DatabaseInfo String dbName, Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, dbName).fallbackToDestructiveMigration()
                .build();
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }
    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return "Demo-App";
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }
}
