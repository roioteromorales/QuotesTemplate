package com.roisoftstudio.frasesdetemplate;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

import com.roisoftstudio.frasesdetemplate.infrastructure.DaggerMainComponent;
import com.roisoftstudio.frasesdetemplate.infrastructure.MainComponent;

public class QuotesTemplateApplication extends Application {

    private MainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mainComponent = DaggerMainComponent.create();
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }

    @VisibleForTesting
    public void setComponent(MainComponent mainComponent) {
        this.mainComponent = mainComponent;
    }
}

