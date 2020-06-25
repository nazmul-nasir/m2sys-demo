package com.m2sys.demo.view.input;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class InputFragmentProvider {
    @ContributesAndroidInjector
    abstract InputFragment provideInputFragmentFactory();
}
