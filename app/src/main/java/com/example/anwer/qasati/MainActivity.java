package com.example.anwer.qasati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         viewFlipper = findViewById(R.id.slideShow_Flipper);
        int images[] = {R.drawable.imag1 , R.drawable.imag2  , R.drawable.imag3  , R.drawable.imag4 , R.drawable.imag5};
        for (int image:images){
            viewFlipper_slider(image);
        }







    }

    // --------------------------------- Method Control Slider -------------------------------------
    public void viewFlipper_slider(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        //animation
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);


    }

    public void button_Children(View view) {
        startActivity(new Intent(MainActivity.this,children.class));
    }

    public void button_masrahiat(View view) {
        startActivity(new Intent(MainActivity.this,masrahiat.class));
    }

    public void button_rawayat(View view) {
        startActivity(new Intent(MainActivity.this,rawayat.class));
    }

    public void button_rihlat(View view) {
        startActivity(new Intent(MainActivity.this, rihlat.class));
    }

    public void button_shaear(View view) {
        startActivity(new Intent(MainActivity.this , shaear.class));
    }

    public void button_khialEilmiin(View view) {
        startActivity(new Intent(MainActivity.this ,khialEilmiin.class));
    }
}
