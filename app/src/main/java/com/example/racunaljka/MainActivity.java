package com.example.racunaljka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText IznosUEvri,KursEvra;
    TextView IznosUDinari;

    EditText IznosUDol,KursDol;
    TextView IznosUDolUdin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IznosUEvri=(EditText) findViewById(R.id.editTextNumberDecimal);
        KursEvra=(EditText) findViewById(R.id.editTextNumberDecimal3);
        IznosUDinari=(TextView) findViewById(R.id.textView3);

        IznosUDol=(EditText) findViewById(R.id.editTextNumberDecimal2);
        KursDol=(EditText) findViewById(R.id.editTextNumberDecimal4);
        IznosUDolUdin=(TextView) findViewById(R.id.textView4);
    }

    public void onClickUDIN(View view){
        double rez=Double.parseDouble(String.valueOf(IznosUEvri.getText()))*Double.parseDouble(String.valueOf(KursEvra.getText()));
        IznosUDinari.setText(String.valueOf(rez));

    }

    public void onClickUDOL(View view){
        double rez=Double.parseDouble(String.valueOf(IznosUDol.getText()))+Double.parseDouble(String.valueOf(KursDol.getText()));
        IznosUDolUdin.setText(String.valueOf(rez));

    }
}