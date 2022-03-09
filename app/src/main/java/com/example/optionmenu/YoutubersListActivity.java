package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import classes.MediaPerson;

public class YoutubersListActivity extends AppCompatActivity {
    ArrayList<MediaPerson> youtubers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubers_list);
        init();

        ListView youtubersList = findViewById(R.id.YoutubersList);
        YouTubeAndTwitchAdapter adapter =
                new YouTubeAndTwitchAdapter(this, youtubers);
        youtubersList.setAdapter(adapter);
    }

    public void init() {
        youtubers = new ArrayList<>();
        youtubers.add(new MediaPerson(1, "✿ Kids Diana Show", "91.3 млн"));
        youtubers.add(new MediaPerson(2, "Like Nastya", "88.5 млн"));
        youtubers.add(new MediaPerson(3, "A4", "38.6 млн"));
        youtubers.add(new MediaPerson(4, "Get Movies", "38.5 млн"));
        youtubers.add(new MediaPerson(5, "Маша и Медведь", "37.2 млн"));
        youtubers.add(new MediaPerson(6, "Masha and The Bear", "32.4 млн"));
        youtubers.add(new MediaPerson(7, "Mister Max", "22.5 млн"));
        youtubers.add(new MediaPerson(8, "Miss Katy", "21.2 млн"));
        youtubers.add(new MediaPerson(9, "SlivkiShow", "19.8 млн"));
        youtubers.add(new MediaPerson(10, "Мирошка ТВ", "18 млн"));
    }
}