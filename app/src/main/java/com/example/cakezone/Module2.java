package com.example.cakezone;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Module2 extends AppCompatActivity {

    CardView photocakes;
    CardView creamcakes;
    CardView fruitcakes;
    CardView shapecakes;
    CardView birthdaycakes;
    CardView eventcakes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);
        photocakes = findViewById(R.id.photo);
        creamcakes = findViewById(R.id.cream);
        fruitcakes = findViewById(R.id.fruit);
        shapecakes = findViewById(R.id.shape);
        birthdaycakes = findViewById(R.id.birthday);
        eventcakes = findViewById(R.id.event);


        photocakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this, "photo cake", Toast.LENGTH_SHORT).show();
                Intent photo = new Intent(Module2.this, photo.class);
                startActivity(photo);


            }
        });

        creamcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this, "cream cake", Toast.LENGTH_SHORT).show();
                Intent cream = new Intent(Module2.this, cream.class);
                startActivity(cream);

            }
        });


        fruitcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this, "fruit cake", Toast.LENGTH_SHORT).show();
                Intent fruit = new Intent(Module2.this, fruit.class);
                startActivity(fruit);

            }
        });

        shapecakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this, "shape cake", Toast.LENGTH_SHORT).show();
                Intent shape = new Intent(Module2.this, shape.class);
                startActivity(shape);
            }
        });

        birthdaycakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this,"birthday cakes",Toast.LENGTH_LONG).show();
                Intent birthday = new Intent(Module2.this, birthday.class);
                startActivity(birthday);
            }
        });

        eventcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this,"Event cakes",Toast.LENGTH_LONG).show();
                Intent event = new Intent(Module2.this, event.class);
                startActivity(event);
            }
        });


    }
}