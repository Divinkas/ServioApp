package com.example.divinkas.servioplacesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.divinkas.servioplacesapp.Adapter.PlaceUnionsAdapter;
import com.example.divinkas.servioplacesapp.Model.PlaceUnions;
import com.example.divinkas.servioplacesapp.Model.SevioAPI_Object;
import com.example.divinkas.servioplacesapp.Retrofit.IPlaceUnions;
import com.example.divinkas.servioplacesapp.Retrofit.RetrofitClient;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvContainerMain;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    IPlaceUnions iPlaceUnions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        rvContainerMain = findViewById(R.id.rvContainerMain);
        rvContainerMain.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = RetrofitClient.getInstance();
        iPlaceUnions = retrofit.create(IPlaceUnions.class);
        loadData();
    }

    private void loadData() {
        compositeDisposable.add(iPlaceUnions.getPlaceUnionsList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SevioAPI_Object>() {
                    @Override
                    public void accept(SevioAPI_Object sevioAPI_object) throws Exception {
                        displayData(sevioAPI_object.getPlaceUnions());
                    }
                }));
    }

    private void displayData(List<PlaceUnions> placeUnionsList) {
        rvContainerMain.setAdapter(new PlaceUnionsAdapter(placeUnionsList, this));
    }

    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }
}
