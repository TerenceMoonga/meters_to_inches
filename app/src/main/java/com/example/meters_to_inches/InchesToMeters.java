package com.example.meters_to_inches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InchesToMeters extends AppCompatActivity {
    private EditText enterInMeters;
    private Button ConvertTOinches;
    private TextView result;
    private  double enteredInches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches_to_meters);
        enterInMeters=(EditText)findViewById(R.id.enterinInchesID);
        ConvertTOinches=(Button)findViewById(R.id.ConvertTometrsBtnID);
        result=(TextView)findViewById(R.id.inchresultID);
        ConvertTOinches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!enterInMeters.getText().toString().equals("")){
                    enteredInches=Double.parseDouble(enterInMeters.getText().toString());
                    double valuetomultiply=0.0254;
                    double formula=0.0;
                    formula=enteredInches*valuetomultiply;
                    result.setText(Double.toString(formula)+"Meters");
                }else {
                    Toast.makeText(InchesToMeters.this,R.string.error_msgfromsecondactivty,Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}