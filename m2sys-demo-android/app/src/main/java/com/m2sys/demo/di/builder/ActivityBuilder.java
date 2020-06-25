package com.m2sys.demo.di.builder;

import com.m2sys.demo.view.input.InputFragmentProvider;
import com.m2sys.demo.view.main.MainActivity;
import com.m2sys.demo.view.output.OutputFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = {
            InputFragmentProvider.class,
            OutputFragmentProvider.class})
    abstract MainActivity bindMainActivity();
}
