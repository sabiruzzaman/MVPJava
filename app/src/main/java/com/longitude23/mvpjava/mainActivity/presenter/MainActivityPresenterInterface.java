package com.longitude23.mvpjava.mainActivity.presenter;

import com.longitude23.mvpjava.mainActivity.model.ImageModel;

import java.util.List;

public interface MainActivityPresenterInterface {
    void onResponseImage(List<ImageModel> imageModelList);
    void onImageResponseError(String message);
}
