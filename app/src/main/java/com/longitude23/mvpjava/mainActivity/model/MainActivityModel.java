package com.longitude23.mvpjava.mainActivity.model;

import com.longitude23.mvpjava.mainActivity.presenter.MainActivityPresenterInterface;
import com.longitude23.mvpjava.network.ApiService;
import com.longitude23.mvpjava.network.NetworkCall;
import com.longitude23.mvpjava.network.ResponseCallback;

import java.util.List;

public class MainActivityModel {

    public static void getImageLis(MainActivityPresenterInterface presenterInterface){
        ApiService apiService = new NetworkCall();
        apiService.getImageList(new ResponseCallback<List<ImageModel>>() {
            @Override
            public void onSuccess(List<ImageModel> data) {
                presenterInterface.onResponseImage(data);
            }

            @Override
            public void onError(String errorMessage) {
                presenterInterface.onImageResponseError(errorMessage);
            }
        });
    }
}
