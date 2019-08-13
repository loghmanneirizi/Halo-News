package com.neirizi.halonews.data;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface NewsDataSource {
    Single<List<News>> getNews();
    Single<List<News>> getVideoNews();
    Single<List<Banner>> getBanners();
    Completable bookmark(News news);
    Completable unBookmark(News news);
    Single<List<News>> getBookmarkNews();
    Single<News> search(String keyword);
 }
