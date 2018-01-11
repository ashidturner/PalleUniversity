package com.example.coffees.palleuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{

    YouTubePlayerView youtube;
    String youTubeId = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        youtube = (YouTubePlayerView) findViewById(R.id.youtubeView);
        youtube.initialize("AIzaSyD_0Sy6Z1OG0qg_Bvr_iw2cF5i1far0rdI",this);
        Intent in = getIntent();
        Bundle b = in.getExtras();
        youTubeId = b.getString("youTubeId");
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.loadVideo("https://www.youtube.com/result?search_query="+youTubeId);
    }
}
