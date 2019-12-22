package com.example.pet_details;

import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Resources;


import org.w3c.dom.Text;

public class PetType {
    private String petName;

    //constructor to construct different pets as per requirement
    public PetType(String petName) {
        this.petName = petName;
    }
/*
    private ImageView petImage;
    private TextView petText ;

   public void setPetImage(ImageView petImage) {
        this.petImage = petImage;
    }

    public void setPetText(TextView petText) {
        this.petText = petText;
    }

    public ImageView getPetImage() {
        return petImage;
    }

    public TextView getPetText() {
        return petText;
    }*/

    public int setImage(String petType){
        switch (petType){
            case "Dog":
                return R.drawable.dogs;
            case "Cat":
            return R.drawable.cat;
            case "Bat":
                return R.drawable.bat;
            default:
                return R.drawable.ic_launcher_background;
        }
    }


    public int setText(String petType){
        switch (petType){
            case "Dog":
                return R.string.DogDescription;
            case "Cat":
            return R.string.CatDescription;
            case "Bat":
                return R.string.BatDescription;
            default:
                return R.string.Nothing;
        }
    }
        }


