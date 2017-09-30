package com.example.basia.gameofcode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

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

        Character jon = new Character("Jon Snow", "Stark", true, "Male", "jon_snow", null);

        try {
            InputStream in= getAssets().open("photos/" + jon.photoPath + ".jpg");
            Bitmap bitmap = BitmapFactory.decodeStream(in);
            photoImageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }

        nameTextView.setText(jon.name);
        houseTextView.setText(jon.house);

    }
}
