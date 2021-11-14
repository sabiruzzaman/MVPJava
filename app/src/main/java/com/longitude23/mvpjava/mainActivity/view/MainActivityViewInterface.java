package com.longitude23.mvpjava.mainActivity.view;

import com.longitude23.mvpjava.mainActivity.model.ImageModel;

import java.util.List;

public interface MainActivityViewInterface {

    void onImageResponse(List<ImageModel> imageModelList);
    void onImageResponseError(String errorMessage);
}
