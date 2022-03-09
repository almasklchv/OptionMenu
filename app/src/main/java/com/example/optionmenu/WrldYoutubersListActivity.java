package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import classes.MediaPerson;

public class WrldYoutubersListActivity extends AppCompatActivity {
    ArrayList<MediaPerson> wrldYoutubers;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrld_youtubers_list);
        init();

        ListView wrldYoutubersList = findViewById(R.id.WrldYoutubersList);
        YouTubeAndTwitchAdapter adapter =
                new YouTubeAndTwitchAdapter(this, wrldYoutubers);
        wrldYoutubersList.setAdapter(adapter);
    }

    public void init() {
        wrldYoutubers = new ArrayList<>();
        wrldYoutubers.add(new MediaPerson(1, "T-Series", "210 млн"));
        wrldYoutubers.add(new MediaPerson(2, "Cocomelon - Nursery Rhymes", "130 млн"));
        wrldYoutubers.add(new MediaPerson(3, "SET India", "128 млн"));
        wrldYoutubers.add(new MediaPerson(4, "PewDiePie", "111 млн"));
        wrldYoutubers.add(new MediaPerson(5, "MrBeast", "91.5 млн"));
        wrldYoutubers.add(new MediaPerson(6, "✿ Kids Diana Show", "91.4 млн"));
        wrldYoutubers.add(new MediaPerson(7, "Like Nastya", "88.5 млн"));
        wrldYoutubers.add(new MediaPerson(8, "WWE", "86.2 млн"));
        wrldYoutubers.add(new MediaPerson(9, "Zee Music Company", "82.1 млн"));
        wrldYoutubers.add(new MediaPerson(10, "Vlad and Niki", "79.7 млн"));
    }
}