package com.example.hp.mvpexample.http;

import com.example.hp.mvpexample.http.apimodel.Twitch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface TwitchApi {
    @GET("games/top")
    Call<Twitch> getTopGames();
}
