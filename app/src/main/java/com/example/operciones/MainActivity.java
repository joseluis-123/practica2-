package com.example.operciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
EditText n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1= (EditText)findViewById(R.id.edtNumero1);
        n2= (EditText)findViewById(R.id.edtNumero1);
        Button suma = (Button) findViewById(R.id.btnSuma);
        Button resta = (Button) findViewById(R.id.btnResta);
        Button mul = (Button) findViewById(R.id.btnMul);
        Button div = (Button) findViewById(R.id.btnDiv);
        final TextView res = (TextView)findViewById(R.id.textResultado);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                res.setText("Resultado"+(num1+num2));
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                res.setText("Resultado"+(num1-num2));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                res.setText("Resultado"+(num1*num2));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                res.setText("Resultado"+(num1/num2));
            }
        });


    }
}