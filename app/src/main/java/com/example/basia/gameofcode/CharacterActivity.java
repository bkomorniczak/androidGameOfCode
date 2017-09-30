package com.example.basia.gameofcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CharacterActivity extends AppCompatActivity {

    ImageView photoImageView;
    TextView nameTextView;
    TextView houseTextView;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charater);

        photoImageView = (ImageView) findViewById(R.id.photo_imageView);
        nameTextView = (TextView) findViewById(R.id.name_textView);
        houseTextView = (TextView) findViewById(R.id.house_textView);
        saveButton = (Button) findViewById(R.id.save_button);

    }
}
