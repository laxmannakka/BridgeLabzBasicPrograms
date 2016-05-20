package com.einfoplanet.nativeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {


    Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        sum=(Button)findViewById(R.id.sum);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first,second;
                first=(EditText)findViewById(R.id.firstNumber);
                second=(EditText)findViewById(R.id.secondNumber);
                int sum=Integer.parseInt(first.getText().toString())+Integer.parseInt(second.getText().toString());
                try{
                    Toast.makeText(SumActivity.this,"Sum is :"+sum,Toast.LENGTH_LONG).show();
                }catch (NumberFormatException exception){
                    Toast.makeText(SumActivity.this,"Incorrect input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
