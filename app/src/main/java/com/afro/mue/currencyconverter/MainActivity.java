package com.afro.mue.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view){

        EditText dollarField = (EditText) findViewById(R.id.shillingField);


        Double shillingAmount = Double.parseDouble(dollarField.getText().toString());

        Double dollarAmount = shillingAmount * 102.65;

        Toast.makeText(getApplicationContext(), dollarAmount.toString() + " Dollars", Toast.LENGTH_LONG.show);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
