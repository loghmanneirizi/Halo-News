package com.neirizi.halonews.home;

import com.neirizi.halonews.base.BasePresenter;
import com.neirizi.halonews.base.BaseView;
import com.neirizi.halonews.data.Banner;
import com.neirizi.halonews.data.News;

import java.util.List;

public interface HomeContract {
    interface View extends BaseView {
        void showNews(List<News> news);

        void showBanners(List<Banner> banners);
    }

    interface Presenter extends BasePresenter<View> {
        void getBanners();

        void getNewsList();
    }
}
