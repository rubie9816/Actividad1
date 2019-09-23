package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.RED);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ConstraintLayout bgElement =
                        findViewById(R.id.activity_main);
                int color =
                        ((ColorDrawable)
                                bgElement.getBackground()).getColor();
                if (color == Color.RED)
                    bgElement.setBackgroundColor(Color.BLUE);
                else
                    bgElement.setBackgroundColor(Color.RED);
            }

        });
    }
}
