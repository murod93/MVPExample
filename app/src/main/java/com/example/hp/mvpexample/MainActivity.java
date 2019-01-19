package com.example.hp.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.mvpexample.http.TwitchApi;
import com.example.hp.mvpexample.http.apimodel.Top;
import com.example.hp.mvpexample.http.apimodel.Twitch;
import com.example.hp.mvpexample.root.App;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Inject
    TwitchApi twitchApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).getComponent().inject(this);

        Call<Twitch> call = twitchApi.getTopGames();

        call.enqueue(new Callback<Twitch>() {
            @Override
            public void onResponse(Call<Twitch> call, Response<Twitch> response) {
                List<Top> gameList = response.body().getTop();

                for (Top top : gameList){
                    System.out.println(top.getGame().getName());
                }
            }

            @Override
            public void onFailure(Call<Twitch> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
