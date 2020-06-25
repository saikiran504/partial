package com.example.cakezone;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;


public class shape extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button btn1, btn2;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
        setTitle("Shape Cakes");

        final int[] imgList = new int[]{R.drawable.sh1,R.drawable.sh2,R.drawable.sh3,R.drawable.sh4,R.drawable.sh5,
                R.drawable.sh6,R.drawable.sh7,R.drawable.sh8,R.drawable.sh9,
                R.drawable.sh10,R.drawable.sh11,R.drawable.sh12,R.drawable.sh13,
                R.drawable.sh14,R.drawable.sh15,R.drawable.sh16,R.drawable.sh17,
                R.drawable.sh18,R.drawable.sh19,R.drawable.sh20,R.drawable.sh21,
                R.drawable.sh22,R.drawable.sh23};

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
                    i=22;
                }
                imageSwitcher.setImageResource(imgList[i]);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>22){
                    i=0;
                }
                imageSwitcher.setImageResource(imgList[i]);

            }
        });
    }
}
