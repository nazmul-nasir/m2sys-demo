package com.m2sys.demo.view.output;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class OutputFragmentProvider {
    @ContributesAndroidInjector
    abstract OutputFragment provideOutputFragmentFactory();
}
