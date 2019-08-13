package com.neirizi.halonews.data;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface EnglishApiService {
    @GET("")
    Single<List<News>> getNews();

    @GET("")
    Single<List<News>> getVideoNews();

    @GET("")
    Single<List<Banner>> getBanners();
}
