package com.longitude23.mvpjava.network;

import com.longitude23.mvpjava.mainActivity.model.ImageModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("v2/list")
    Call<List<ImageModel>> getImageList();
}
