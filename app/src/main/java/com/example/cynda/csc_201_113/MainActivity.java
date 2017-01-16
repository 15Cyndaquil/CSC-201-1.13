package com.example.cynda.csc_201_113;

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

        final Button calculateBT = (Button) findViewById(R.id.calculateBT);

        final TextView yTV = (TextView) findViewById(R.id.yTV);
        final TextView xTV = (TextView) findViewById(R.id.xTV);
        final TextView errorTV = (TextView) findViewById(R.id.errorTV);

        final EditText aET = (EditText) findViewById(R.id.aET);
        final EditText bET = (EditText) findViewById(R.id.bET);
        final EditText cET = (EditText) findViewById(R.id.cET);
        final EditText dET = (EditText) findViewById(R.id.dET);
        final EditText eET = (EditText) findViewById(R.id.eET);
        final EditText fET = (EditText) findViewById(R.id.fET);

        calculateBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double a, b, c, d, e, f, x, y, testA, testC;
                try{
                    a = Double.parseDouble(aET.getText().toString());
                    b = Double.parseDouble(bET.getText().toString());
                    c = Double.parseDouble(cET.getText().toString());
                    d = Double.parseDouble(dET.getText().toString());
                    e = Double.parseDouble(eET.getText().toString());
                    f = Double.parseDouble(fET.getText().toString());

                    x = ((e*d)-(b*f))/((a*d)-(b*c));
                    y = ((a*f)-(e*c))/((a*d)-(b*c));

                    testC =((c*x)+(d*y));
                    testA =((a*x)+(b*y));

                    yTV.setText("Y= "+Double.toString(y));
                    xTV.setText("X= "+Double.toString(x));

                }catch(NumberFormatException i){System.out.println("Error");}
            }
        });
     }
}
