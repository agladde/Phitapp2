package com.example.gladd.phitapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity{
    MainActivity a= new MainActivity();
    public TextView Bodyfat;
    public TextView LeanBody;
    public TextView BFP;
    public TextView results;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_bmi);




        Intent intent = getIntent();
         Bundle extras= intent.getExtras();
        String gender = extras.getString("gender");
        final int height = extras.getInt("height",0);
        final double weight = extras.getDouble("weight",0);
        final double waist = extras.getDouble("waist",0);
        final double wrist = extras.getDouble("wrist",0);
        final double forearm = extras.getDouble("forearm",0);
        final double hip = extras.getDouble("hip",0);

         gender=gender.toLowerCase();
        Bodyfat=(TextView) findViewById(R.id.Bodyfat);
        LeanBody=(TextView)findViewById(R.id.LeanBody);
        BFP=(TextView)findViewById(R.id.BFP);
        results=(TextView)findViewById(R.id.results);
        button1=(Button)findViewById(R.id.button1);
        double leanbodymass=0.0;
        if(gender.equals("male"))
        {
             leanbodymass= ((weight*1.082) + 94.42)-(waist*4.15);
        }
        else if(gender.equals("female"))
        {
             leanbodymass= ((weight*.732)+8.987)+(wrist/3.14)-(waist*.157)-(hip*.249)+(forearm*.434);
        }
        double bodyfatweight=weight-leanbodymass;
        double bodyfatpercent=(bodyfatweight*100)/weight;
        double bmi=(weight*703)/(height*height);

        String bodyfatpercentString= String.format("%.2f", bodyfatpercent);
        String leanbodymassString= String.format("%.2f", leanbodymass);
       String bmiString= String.format("%.2f", bmi);


         Bodyfat.setText("Your BMI Is: "+ bmiString);
        LeanBody.setText("Your Lean Body Mass Is: "+ leanbodymassString);
        BFP.setText("Your Body Fat Percentage Is: " + bodyfatpercentString +"%");

       boolean isunderweight=false;
       if(height>(((12.0/42.0)*(weight-98))+61))
       {
           isunderweight=true;
       }

       boolean ishealthyweight=false;
        if (height>(11.0/56.0)*(weight-210)+77 && isunderweight==false)
       {
           ishealthyweight=true;
       }
        boolean isoverweight=false;

        if (height>((19.0/112.0)*(weight-266))+79 && ishealthyweight==false && isunderweight==false)
        {
           isunderweight=true;
       }
       boolean isobese=false;
       if(!isunderweight && !ishealthyweight && !isoverweight)
       {
           isobese=true;
       }
       boolean isAthletic=false;
       if(gender.equals("male"))
           if(bodyfatpercent>6 && bodyfatpercent<=13)
               isAthletic=true;
       if(gender.equals("female"))
           if(bodyfatpercent>13 && bodyfatpercent<=20)
                isAthletic=true;

       boolean isFit=false;
        if(gender.equals("male"))
            if(bodyfatpercent>13 && bodyfatpercent<=17)
                isFit=true;

        if(gender.equals("female"))
            if(bodyfatpercent>20 && bodyfatpercent<=24)
                isFit=true;

        boolean isAverage=false;
        if(gender.equals("male"))
            if(bodyfatpercent>17 && bodyfatpercent<=25)
                isAverage=true;
        if(gender.equals("female"))
            if(bodyfatpercent>24 && bodyfatpercent<=31)
                isAverage=true;

        boolean isUnhealthy=false;
        if(gender.equals("male"))
            if(bodyfatpercent>25 )
                isUnhealthy=true;
        if(gender.equals("female"))
            if(bodyfatpercent>31)
                isUnhealthy=true;

        String advice=" ";

        if(isAthletic && isUnhealthy)
            advice="skinny. We advise that you bulk!";
        if((ishealthyweight && isAthletic) || (ishealthyweight && isFit))
            advice="in shape. Let's get bigger!";
        if((isoverweight && isUnhealthy) || (isobese && isUnhealthy))
            advice="out of shape. Let's change that!";
        if(ishealthyweight && isAverage)
            advice="average. Lets bulk and add some muscle!";
        if((isAthletic&&(isoverweight || isobese)) || (isFit && (isobese || isoverweight)))
            advice="in terrific shape. Let's get lean baby!";
        if(advice.length()<2)
            advice="average. Lets bulk and add some muscle!";

        results.setText("Based on the results, you are " + advice);

        final String advice1=advice;
     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             Intent intent1=new Intent(BMI.this,Excercise.class);
             Bundle extras1= new Bundle();



             extras1.putString("Advice",advice1.substring(0,4));

             intent1.putExtras(extras1);
             startActivity(intent1);


         }
     });




        Bodyfat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();








            }
        });



    }

}
