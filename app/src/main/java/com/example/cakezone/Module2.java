package com.example.cakezone;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Module2 extends AppCompatActivity {

    CardView photocakes;
    CardView stepcakes;
    CardView fruitcakes;
    CardView shapecakes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);
        photocakes = findViewById(R.id.photo);
        stepcakes = findViewById(R.id.step);
        fruitcakes = findViewById(R.id.fruit);
        shapecakes = findViewById(R.id.shape);


        photocakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this, "photo cake", Toast.LENGTH_SHORT).show();
                Intent photo = new Intent(Module2.this, photo.class);
                startActivity(photo);


            }
        });

        stepcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Module2.this, "step cake", Toast.LENGTH_SHORT).show();
                Intent step = new Intent(Module2.this, step.class);
                startActivity(step);

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

    }
}