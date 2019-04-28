package com.example.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userh = findViewById(R.id.userheight);
                EditText userw = findViewById(R.id.userweight);
                TextView userr = findViewById(R.id.userbmi);

                double hh = Double.parseDouble(userh.getText().toString());
                double ww = Double.parseDouble(userw.getText().toString());

                double message = ww/(hh*hh);

                userr.setText(Double.toString(message));
            }
        });




    }


}
