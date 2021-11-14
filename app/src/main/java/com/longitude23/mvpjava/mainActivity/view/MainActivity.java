package com.longitude23.mvpjava.mainActivity.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.example.mvpjava.R;
import com.longitude23.mvpjava.mainActivity.adapters.ImageAdapter;
import com.longitude23.mvpjava.mainActivity.model.ImageModel;
import com.longitude23.mvpjava.mainActivity.presenter.MainActivityPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityViewInterface {

    private MainActivityPresenter mainActivityPresenter;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityPresenter = new MainActivityPresenter(this);

        gridView = findViewById(R.id.imageGridViewId);

        mainActivityPresenter.callImageNetwork();

    }

    @Override
    public void onImageResponse(List<ImageModel> imageModelList) {
        gridView.setAdapter(new ImageAdapter(MainActivity.this, imageModelList));
    }

    @Override
    public void onImageResponseError(String errorMessage) {
        Log.i("onImageLoadError", "onImageResponseError: " + errorMessage);
    }
}