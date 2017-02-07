package com.roisoftstudio.frasesdetemplate.infrastructure;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class MainModule {

    @Provides
    @Singleton
    public Retrofit provideRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://roisoftstudio.com:18080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

//    @Provides
//    @Singleton
//    public AnimalService provideAnimalService(Retrofit retrofit) {
//        return retrofit.create(AnimalService.class);
//    }

}
