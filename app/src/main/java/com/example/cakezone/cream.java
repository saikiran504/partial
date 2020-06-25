package com.example.cakezone;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;


public class cream extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button btn1, btn2;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cream);
        setTitle("Cream Cakes");

        final int[] imgList = new int[]{R.drawable.cr1,R.drawable.cr2,R.drawable.cr3,R.drawable.cr4,R.drawable.cr5,R.drawable.cr6,
                R.drawable.cr7,R.drawable.cr8,R.drawable.cr9,
                R.drawable.cr10,R.drawable.cr11,R.drawable.cr12,R.drawable.cr13,
                R.drawable.cr14,R.drawable.cr15,R.drawable.cr16,R.drawable.cr17,
                R.drawable.cr18,R.drawable.cr19,R.drawable.cr20,R.drawable.cr21,
                R.drawable.cr22,R.drawable.cr23,R.drawable.cr24,R.drawable.cr25,
                R.drawable.cr26,R.drawable.cr27,R.drawable.cr28,R.drawable.cr29};

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
                    i=28;
                }
                imageSwitcher.setImageResource(imgList[i]);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>28){
                    i=0;
                }
                imageSwitcher.setImageResource(imgList[i]);

            }
        });
    }
}
