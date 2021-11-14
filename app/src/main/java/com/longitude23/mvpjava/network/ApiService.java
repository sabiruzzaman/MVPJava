package com.longitude23.mvpjava.network;

import com.longitude23.mvpjava.mainActivity.model.ImageModel;

import java.util.List;

public interface ApiService {

    void getImageList(ResponseCallback<List<ImageModel>> responseCallback);

}
