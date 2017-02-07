package com.roisoftstudio.frasesdetemplate.infrastructure;

import com.roisoftstudio.frasesdetemplate.ui.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules = MainModule.class) public interface MainComponent {

  void inject(BaseActivity activity);
//  void inject(AnimalAddActivity activity);
}
