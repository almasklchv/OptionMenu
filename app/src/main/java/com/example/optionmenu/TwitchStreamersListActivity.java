package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import classes.MediaPerson;

public class TwitchStreamersListActivity extends AppCompatActivity {
    ArrayList<MediaPerson> twitchStreamers;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitch_streamers_list);
        init();

        ListView twitchStreamersList = findViewById(R.id.twitchStreamersList);
        YouTubeAndTwitchAdapter adapter =
                new YouTubeAndTwitchAdapter(this, twitchStreamers);
        twitchStreamersList.setAdapter(adapter);
    }

    public void init() {
        twitchStreamers = new ArrayList<>();
        twitchStreamers.add(new MediaPerson(1, "buster", "2.8 млн"));
        twitchStreamers.add(new MediaPerson(2, "n3koglai", "2.2 млн"));
        twitchStreamers.add(new MediaPerson(3, "Evelone192", "2 млн"));
        twitchStreamers.add(new MediaPerson(4, "bratishkinoff", "1.9 млн"));
        twitchStreamers.add(new MediaPerson(5, "JesusAVGN", "1.3 млн"));
        twitchStreamers.add(new MediaPerson(6, "deepins02", "1.1 млн"));
        twitchStreamers.add(new MediaPerson(7, "Stray228", "1.1 млн"));
        twitchStreamers.add(new MediaPerson(8, "StarLadder5", "1.1 млн"));
        twitchStreamers.add(new MediaPerson(9, "csgomc_ru", "1 млн"));
        twitchStreamers.add(new MediaPerson(10, "cheatbanned", "1 млн"));
    }
}