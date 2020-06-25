package com.m2sys.demo.di.component;

import android.app.Application;

import com.m2sys.demo.DemoApp;
import com.m2sys.demo.data.remote.api.RetrofitApiClient;
import com.m2sys.demo.di.builder.ActivityBuilder;
import com.m2sys.demo.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class, RetrofitApiClient.class})
public interface AppComponent {

    void inject(DemoApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
