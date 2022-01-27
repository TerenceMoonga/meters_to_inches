package com.example.meters_to_inches;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText EnterMeters;
    private Button convert;
    private TextView result;
    private View MyBackground;
    private Button Goto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EnterMeters=(EditText)findViewById(R.id.EnterMetersID);
        convert=(Button)findViewById(R.id.ConvertbtnID);
        result=(TextView)findViewById(R.id.result_tvID);
        MyBackground=findViewById(R.id.backgroundID);
        MyBackground.setBackgroundColor(Color.WHITE);
        Goto=(Button)findViewById(R.id.btnTonextActID);

        Goto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this,InchesToMeters.class );
                startActivity(myintent);
            }
        });


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 39.37;
                double product= 0.0;
                if(EnterMeters.getText().toString().equals("")) {
                    result.setText(R.string.error_message);
                    result.setTextColor(Color.RED);
                }else

                {
                    double valueInMeters= Double.parseDouble(EnterMeters.getText().toString());
                    product= multiplier*valueInMeters;
                    result.setTextColor(Color.GRAY);

                    result.setText(Double.toString(product) + "inches " );
                }


            }
        });
    }

}


