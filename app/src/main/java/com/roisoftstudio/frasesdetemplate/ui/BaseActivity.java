package com.roisoftstudio.frasesdetemplate.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.roisoftstudio.frasesdetemplate.QuotesTemplateApplication;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeDagger();
    }

    private void initializeDagger() {
        QuotesTemplateApplication app = (QuotesTemplateApplication) getApplication();
        app.getMainComponent().inject(this);
    }

}
