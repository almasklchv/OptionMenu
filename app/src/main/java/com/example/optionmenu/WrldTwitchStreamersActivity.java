package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import classes.MediaPerson;

public class WrldTwitchStreamersActivity extends AppCompatActivity {
    ArrayList<MediaPerson> wrldTwitchStreamers;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrld_twitch_streamers);
        init();

        ListView wrldTwitchStreamersList = findViewById(R.id.wrldTwitchStreamersList);
        YouTubeAndTwitchAdapter adapter = new YouTubeAndTwitchAdapter(this, wrldTwitchStreamers);
        wrldTwitchStreamersList.setAdapter(adapter);
    }
    
    public void init() {
        wrldTwitchStreamers = new ArrayList<>();
        wrldTwitchStreamers.add(new MediaPerson(1, "Ninja", "17.5 млн"));
        wrldTwitchStreamers.add(new MediaPerson(2, "auronplay", "12 млн"));
        wrldTwitchStreamers.add(new MediaPerson(3, "Rubius", "11.4 млн"));
        wrldTwitchStreamers.add(new MediaPerson(4, "xQcOW", "10 млн"));
        wrldTwitchStreamers.add(new MediaPerson(5, "shroud", "9.9 млн"));
        wrldTwitchStreamers.add(new MediaPerson(6, "TheGrefg", "9.6 млн"));
        wrldTwitchStreamers.add(new MediaPerson(7, "ibai", "9.5 млн"));
        wrldTwitchStreamers.add(new MediaPerson(8, "pokimane", "8.9 млн"));
        wrldTwitchStreamers.add(new MediaPerson(9, "juansguarnizo", "7.3 млн"));
        wrldTwitchStreamers.add(new MediaPerson(10, "tommyinnit", "7 млн"));
    }
}