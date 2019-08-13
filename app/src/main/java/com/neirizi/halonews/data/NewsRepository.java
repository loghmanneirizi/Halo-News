package com.neirizi.halonews.data;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

public class NewsRepository implements NewsDataSource {
    private LocalDataSource localDataSource = new LocalDataSource();
    private CloudDataSource cloudDataSource = new CloudDataSource();

    @Override
    public Single<List<News>> getNews() {
        return cloudDataSource.getNews();
    }

    @Override
    public Single<List<News>> getVideoNews() {
        return cloudDataSource.getVideoNews();
    }

    @Override
    public Single<List<Banner>> getBanners() {
        return cloudDataSource.getBanners();
    }

    @Override
    public Completable bookmark(News news) {
        return localDataSource.bookmark(news);
    }

    @Override
    public Completable unBookmark(News news) {
        return localDataSource.unBookmark(news);
    }

    @Override
    public Single<List<News>> getBookmarkNews() {
        return localDataSource.getBookmarkNews();
    }

    @Override
    public Single<News> search(String keyword) {
        return localDataSource.search(keyword);
    }
}
