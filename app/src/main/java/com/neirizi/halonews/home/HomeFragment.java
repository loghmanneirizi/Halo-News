package com.neirizi.halonews.home;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.neirizi.halonews.R;
import com.neirizi.halonews.base.BaseFragment;
import com.neirizi.halonews.data.Banner;
import com.neirizi.halonews.data.News;
import com.neirizi.halonews.data.NewsRepository;

import java.util.List;

public class HomeFragment extends BaseFragment implements HomeContract.View {
    private HomeContract.Presenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new HomePresenter(new NewsRepository());
    }

    @Override
    public void showNews(List<News> news) {

    }

    @Override
    public void showBanners(List<Banner> banners) {

    }

    @Override
    public void setProgressIndicator(boolean shouldShow) {

    }

    @Override
    public void showError(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();

    }

    @Override
    public Context context() {
        return getActivity();
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.attachView(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.detachView();
    }

    @Override
    public void setupViews() {

    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_home;
    }
}
