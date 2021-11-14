package com.longitude23.mvpjava.network;

public interface ResponseCallback <T> {

    void onSuccess(T data);
    void onError(String errorMessage);

}
