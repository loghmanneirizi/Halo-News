package com.neirizi.halonews.base;

import android.content.Context;

public interface BaseView {
    void setProgressIndicator(boolean shouldShow);

    void showError(String error);

    Context context();
}
