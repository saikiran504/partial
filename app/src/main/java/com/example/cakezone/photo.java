package com.example.cakezone;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;


public class photo extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button btn1, btn2;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        setTitle("Shape Cakes");

        final int[] imgList = new int[]{R.drawable.ph1,R.drawable.ph2,R.drawable.ph3,R.drawable.ph4,R.drawable.ph5,
                R.drawable.ph6,R.drawable.ph7,R.drawable.ph8,R.drawable.ph9,
                R.drawable.ph10,R.drawable.ph11,R.drawable.ph12,R.drawable.ph13,
                R.drawable.ph14,R.drawable.ph15,R.drawable.ph16,R.drawable.ph17,
                R.drawable.ph18,R.drawable.ph19,R.drawable.ph20,R.drawable.ph21,
                R.drawable.ph22,R.drawable.ph23,
                R.drawable.ph24,R.drawable.ph25,R.drawable.ph26,R.drawable.ph27};

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
