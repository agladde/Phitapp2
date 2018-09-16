package com.example.gladd.phitapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    String gender;
    int height;
    double weight,waist,hip,forearm,wrist;
    EditText GenderIn;
    EditText WeightIn;
    EditText HeightIn;
    EditText WaistIn;
    EditText WristIn;
    EditText ForearmIn;
    EditText HipIn;
    Button SubmitButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BMI a = new BMI();

        GenderIn = (EditText)findViewById(R.id.GenderIn);
        WeightIn = (EditText)findViewById(R.id.WeightIn);
        HeightIn = (EditText)findViewById(R.id.HeightIn);
        WaistIn = (EditText)findViewById(R.id.WaistIn);
        WristIn = (EditText)findViewById(R.id.WristIn);
        ForearmIn = (EditText)findViewById(R.id.ForearmIn);
        HipIn = (EditText)findViewById(R.id.Hipin);
        SubmitButton = (Button) findViewById(R.id.SubmitButton);

        SubmitButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                gender = GenderIn.getText().toString();
                height = Integer.parseInt(HeightIn.getText().toString());
                weight = Double.parseDouble(WeightIn.getText().toString());
                waist = Double.parseDouble(WaistIn.getText().toString());
                wrist = Double.parseDouble(WristIn.getText().toString());
                forearm = Double.parseDouble(ForearmIn.getText().toString());
                hip = Double.parseDouble(HipIn.getText().toString());

                Intent intent = new Intent(MainActivity.this, BMI.class);
                Bundle extras= new Bundle();
                extras.putString("gender", gender);
                extras.putInt("height", height);
                extras.putDouble("weight", weight);
                extras.putDouble("waist", waist);
                extras.putDouble("wrist", wrist);
                extras.putDouble("forearm", forearm);
                extras.putDouble("hip", hip);

            intent.putExtras(extras);
                startActivity(intent);
            }






        }
        );
    }


}


