package com.example.cakezone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;


public class event extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button btn1, btn2;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        setTitle("Event Cakes");

        final int[] imgList = new int[]{R.drawable.eg1,R.drawable.eg2,R.drawable.eg3,R.drawable.eg4,R.drawable.eg5,
                R.drawable.eg6,R.drawable.eg7,R.drawable.eg8,R.drawable.eg9,
                R.drawable.eg10,R.drawable.eg11,R.drawable.eg12,R.drawable.eg13,
                R.drawable.eg14,R.drawable.eg15,R.drawable.eg16,R.drawable.eg17,
                R.drawable.eg18};

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
                    i=17;
                }
                imageSwitcher.setImageResource(imgList[i]);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>17){
                    i=0;
                }
                imageSwitcher.setImageResource(imgList[i]);

            }
        });
    }
}
