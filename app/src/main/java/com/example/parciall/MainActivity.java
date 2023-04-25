package com.example.parciall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt_Insert, txt_Result;
    Button btn_mostrar;

    private numero numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Insert = findViewById(R.id.txt_Insert);
        txt_Result = findViewById(R.id.txt_Result);
        btn_mostrar = findViewById(R.id.btn_mostrar);
        numero = (numero) getIntent().getSerializableExtra("num");



        btn_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = txt_Insert.getText().toString();

                txt_Result.setText(num);
            }
        });
    }

}