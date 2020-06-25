package com.example.cakezone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;


public class birthday extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button btn1, btn2;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        setTitle("Birthday Cakes");

        final int[] imgList = new int[]{R.drawable.br1,R.drawable.br2,R.drawable.br3,R.drawable.br4,R.drawable.br5,
                R.drawable.br6,R.drawable.br7,R.drawable.br8,R.drawable.br9,
                R.drawable.br10,R.drawable.br11,R.drawable.br12,R.drawable.br13,
                R.drawable.br14,R.drawable.br15,R.drawable.br16,R.drawable.br17,
                R.drawable.br18,R.drawable.br19,R.drawable.br20,R.drawable.br21,
                R.drawable.br22,R.drawable.br23,R.drawable.br24,R.drawable.br25,
                R.drawable.br26,R.drawable.br27,R.drawable.br28,R.drawable.br29,
                R.drawable.br30,R.drawable.br31,R.drawable.br32,R.drawable.br33,
                R.drawable.br34};

        imageSwitcher = findViewById(R.id.img_swi);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);


        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(imgList[i]);
                return imageView;

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if(i<0)
                {
                    i=33;
                }
                imageSwitcher.setImageResource(imgList[i]);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>33){
                    i=0;
                }
                imageSwitcher.setImageResource(imgList[i]);

            }
        });
    }
}
