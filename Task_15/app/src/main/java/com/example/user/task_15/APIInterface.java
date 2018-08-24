package com.example.user.task_15;

import android.icu.text.IDNA;

import com.example.user.task_15.listings.CryptoList;
import com.example.user.task_15.retrofit.Info;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface APIInterface {
    @GET("/v1/cryptocurrency/listings/latest?")
    Single<CryptoList> getMarketPairsLatest(@Query("limit") String limit);

    @GET("/v1/cryptocurrency/info")
    Single<Info> getCryptocurrencyInfo(@Query("symbol") String symbol);
}