package com.m2sys.demo.view.main;

import com.m2sys.demo.data.DataManager;
import com.m2sys.demo.utils.rx.SchedulerProvider;
import com.m2sys.demo.view.base.BaseViewModel;

public class MainViewModel extends BaseViewModel {
    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
