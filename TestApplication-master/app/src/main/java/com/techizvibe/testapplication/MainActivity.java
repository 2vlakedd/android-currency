package com.techizvibe.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Currency1,Currency2;
    Button btnClickHere,Button01;
    TextView textName,TextView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Currency1 = (EditText) findViewById(R.id.Currency1);
        btnClickHere = (Button) findViewById(R.id.btnClickHere);
        textName = (TextView) findViewById(R.id.textName);
        Currency2 = (EditText) findViewById(R.id.Currency2);
        Button01 = (Button) findViewById(R.id.Button01);
        TextView01 = (TextView) findViewById(R.id.TextView01);

        btnClickHere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = Currency1.getText().toString();
                textName.setText(50.76 * name);
                String name1 = Currency2.getText().toString();
                textName.setText(0.45 * name1);
                	
            }
        });
    }
}
