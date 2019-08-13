package com.neirizi.halonews.data;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class CloudDataSource implements NewsDataSource {
    private EnglishApiService englishApiService;

    public CloudDataSource() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        englishApiService = retrofit.create(EnglishApiService.class);

    }

    @Override
    public Single<List<News>> getNews() {
        return englishApiService.getNews();
    }

    @Override
    public Single<List<News>> getVideoNews() {
        return englishApiService.getVideoNews();
    }

    @Override
    public Single<List<Banner>> getBanners() {
        return englishApiService.getBanners();
    }

    @Override
    public Completable bookmark(News news) {
        return null;
    }

    @Override
    public Completable unBookmark(News news) {
        return null;
    }

    @Override
    public Single<List<News>> getBookmarkNews() {
        return null;
    }

    @Override
    public Single<News> search(String keyword) {
        return null;
    }
}
