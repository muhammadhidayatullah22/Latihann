package com.example.latihann;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText val1,val2;

    TextView hasil;

    Button button,button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        hasil = findViewById(R.id.hasil);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inp1 = val1.getText().toString().trim();
                String inp2 = val2.getText().toString().trim();

                if (inp1.isEmpty() || inp2.isEmpty()){
                    Toast.makeText(MainActivity.this, "INPUT ANGKA!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double value1 = Double.parseDouble(val1.getText().toString());
                double value2 = Double.parseDouble(val2.getText().toString());
                double result = value1 + value2;
                hasil.setText(String.valueOf(result));

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inp1 = val1.getText().toString().trim();
                String inp2 = val2.getText().toString().trim();

                if (inp1.isEmpty() || inp2.isEmpty()){
                    Toast.makeText(MainActivity.this, "INPUT ANGKA!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double value1 = Double.parseDouble(val1.getText().toString());
                double value2 = Double.parseDouble(val2.getText().toString());
                double result = value1 - value2;
                hasil.setText(String.valueOf(result));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inp1 = val1.getText().toString().trim();
                String inp2 = val2.getText().toString().trim();

                if (inp1.isEmpty() || inp2.isEmpty()){
                    Toast.makeText(MainActivity.this, "INPUT ANGKA!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double value1 = Double.parseDouble(val1.getText().toString());
                double value2 = Double.parseDouble(val2.getText().toString());
                double result = value1 / value2;
                hasil.setText(String.valueOf(result));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inp1 = val1.getText().toString().trim();
                String inp2 = val2.getText().toString().trim();

                if (inp1.isEmpty() || inp2.isEmpty()){
                    Toast.makeText(MainActivity.this, "INPUT ANGKA!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double value1 = Double.parseDouble(val1.getText().toString());
                double value2 = Double.parseDouble(val2.getText().toString());
                double result = value1 * value2;
                hasil.setText(String.valueOf(result));
            }


        });
    }
}