package com.example.cakezone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;


public class fruit extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button btn1, btn2;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        setTitle("fruit Cakes");

        final int[] imgList = new int[]{R.drawable.fr1,R.drawable.fr2,R.drawable.fr3,R.drawable.fr4,R.drawable.fr5,
                R.drawable.fr6,R.drawable.fr7,R.drawable.fr8,R.drawable.fr9,
                R.drawable.fr10,R.drawable.fr11,R.drawable.fr12,R.drawable.fr13,
                R.drawable.fr14,R.drawable.fr15,R.drawable.fr16,R.drawable.fr17};

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
                    i=16;
                }
                imageSwitcher.setImageResource(imgList[i]);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>16){
                    i=0;
                }
                imageSwitcher.setImageResource(imgList[i]);

            }
        });
    }
}
