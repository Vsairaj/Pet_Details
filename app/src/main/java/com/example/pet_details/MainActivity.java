package com.example.pet_details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private String petName;
    private Button Dog, Cat, Bat, Sheep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dog = (Button) findViewById(R.id.OKButton);
        Cat = (Button) findViewById(R.id.OKButton2);
        Bat = (Button) findViewById(R.id.OKButton3);
        Sheep = (Button) findViewById(R.id.OKButton4);


            Dog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getBaseContext(), PetPage.class);
                    intent.putExtra("pet","Dog");
                    startActivity(intent);
                }
            });

        Cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), PetPage.class);
                intent.putExtra("pet","Cat");
                startActivity(intent);
            }
        });
        Sheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), PetPage.class);
                intent.putExtra("pet","Sheep");
                startActivity(intent);
            }
        });
        Bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), PetPage.class);
                intent.putExtra("pet","Bat");
                startActivity(intent);
            }
        });
        }







    }





