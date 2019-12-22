package com.example.pet_details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class PetPage extends AppCompatActivity {
    ImageView petImageView;
    TextView petTextView;
    public static final String TAG = PetPage.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_page);

        Intent intent = getIntent();
        String PetType = intent.getStringExtra("pet");
        Log.d(TAG, PetType);

        //set page attributes to dog attributes

        PetType petType = new PetType(PetType);

        petImageView = (ImageView) findViewById(R.id.petImage);
        petTextView = (TextView) findViewById(R.id.petText);

        petImageView.setImageResource(petType.setImage(PetType));
        petTextView.setText(petType.setText(PetType));



    }






}
