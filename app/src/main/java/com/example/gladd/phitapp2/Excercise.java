package com.example.gladd.phitapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Excercise extends AppCompatActivity {

    public TextView goals;
    public TextView Exercise;

    public TextView Exercise1;
    public TextView Exercise2;
    public TextView Exercise3;
    public TextView Exercise4;
    public TextView Exercise5;
    public TextView Exercise6;
    public TextView Note;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);

        goals=(TextView)findViewById(R.id.goals);
        Exercise1=(TextView)findViewById(R.id.Exercise1);
        Exercise2=(TextView)findViewById(R.id.Exercise2);
        Exercise3=(TextView)findViewById(R.id.Exercise3);
        Exercise4=(TextView)findViewById(R.id.Exercise4);
        Exercise5=(TextView)findViewById(R.id.Exercise5);
        Exercise6=(TextView)findViewById(R.id.Exercise6);
        Note=(TextView)findViewById(R.id.Note);
        Intent intent1 = getIntent();
        Bundle extras1= intent1.getExtras();

        String Advice=extras1.getString("Advice");




        if(Advice.substring(0,2).equals("sk"))
        {
           goals.setText("Project Goals: Gain Weight and Add Muscle");



           String Exercise10="Bench Press: 5x5 (5 sets of 5 reps each) (1:30 rest)";
            String Exercise11="High Bar Squat: 5x5 (5 sets of 5 reps each) (gradually increase weight) ";
            String Exercise12="Conventional Deadlift: 5x5 (5 sets of 5 reps each) (gradually increase weight) ";
            String Exercise13="Cable Flys: 3x15 (3 sets of 15 reps)";
            String Exercise14="Walking Lunges: 200m distance with weights (2 sets)";
            String Exercise15="Pull-Ups: 3x15 (3 sets of 15 reps) (assisted if needed) ";

            Exercise1.setText(Exercise10);
            Exercise2.setText(Exercise11);
            Exercise3.setText(Exercise12);
            Exercise4.setText(Exercise13);
            Exercise5.setText(Exercise14);
            Exercise6.setText(Exercise15);
            Note.setText("Note: Make sure to be in caloric surplus for best results");

        }
        if(Advice.substring(0,4).equals("in s")) {
            goals.setText("Project Goals: You've Got A Foundation, Now It's Time To Gain Strength");
            String Exercise10 = "Bench Press: 3x3 (3 sets of 3 reps each) (Heavy weight, Lots of rest)";
            String Exercise11 = "High Bar Squat: 5x3 (5 sets of 3 reps each) (gradually increase weight) ";
            String Exercise12 = "Conventional Deadlift: 5x3 (5 sets of 3 reps each) (gradually increase weight) ";
            String Exercise13 = "Dumbbell Incline Press: 3x10 (3 sets of 10 reps)";
            String Exercise14 = "Leg Press: 3x8 (3 sets of 8 reps)";
            String Exercise15 = "Pull-Ups: 3x15 (3 sets of 15 reps)";
            Exercise1.setText(Exercise10);
            Exercise2.setText(Exercise11);
            Exercise3.setText(Exercise12);
            Exercise4.setText(Exercise13);
            ImageView image3 = (ImageView)findViewById(R.id.image4);
            image3.setImageResource(R.drawable.incline_dumbbell_press_main_4);
            Exercise5.setText(Exercise14);
            ImageView image4 = (ImageView)findViewById(R.id.image5);
            image4.setImageResource(R.drawable.leg_press_machine_04_02);
            Exercise6.setText(Exercise15);
            Note.setText("Note: Make sure to be in a caloric surplus with a diet heavy in protein");


        }
        if(Advice.substring(0,3).equals("out")) {
            goals.setText("Project Goals: Lose Fat, Gain Muscle");

            String Exercise10 = "Bench Press: 5x10 (5 sets of 10 reps each) (Lots Of Reps, Low Rest)";
            String Exercise11 = "High Bar Squat: 5x10 (5 sets of 10 reps each) (Rep It Out!) ";
            String Exercise12 = "Conventional Deadlift: 4x15 (4 sets of 15 reps each) (Keep That Back Straight!) ";
            String Exercise13 = "Cable Flys: 3x15 (3 sets of 15 reps)";
            String Exercise14= "Walking Lunges: 100m (5 sets, minute rest in between)";
            String Exercise15 = "Pull-Ups: 3x15 (3 sets of 15 reps)";
            Exercise1.setText(Exercise10);
            Exercise2.setText(Exercise11);
            Exercise3.setText(Exercise12);
            Exercise4.setText(Exercise13);
            Exercise5.setText(Exercise14);
            Exercise6.setText(Exercise15 );
            Note.setText("Note: Make sure to maintain calories while also having a high protein intake");
        }
        if(Advice.substring(0,3).equals("ave")) {
            goals.setText("Project Goals: Put On A Foundation Of Muscle");

            String Exercise10="Bench Press: 5x5 (5 sets of 5 reps each) (1:30 rest)";
            String Exercise11="High Bar Squat: 5x5 (5 sets of 5 reps each) (gradually increase weight) ";
            String Exercise12="Conventional Deadlift: 5x5 (5 sets of 5 reps each) (gradually increase weight) ";
            String Exercise13="Cable Flys: 3x15 (3 sets of 15 reps)";
            String Exercise14="Walking Lunges: 200m distance with weights (2 sets)";
            String Exercise15="Pull-Ups: 3x15 (3 sets of 15 reps) (assisted if needed) ";

            Exercise1.setText(Exercise10);
            Exercise2.setText(Exercise11);
            Exercise3.setText(Exercise12);
            Exercise4.setText(Exercise13);
            Exercise5.setText(Exercise14);
            Exercise6.setText(Exercise15);
            Note.setText("Note:  Make sure to be in a caloric surplus");
        }
        if(Advice.substring(0,4).equals("in t")) {
            goals.setText("Project Goals: Shred That Last Bit Of Fat");

            String Exercise10 = "Bench Press: 5x10 (5 sets of 10 reps each) (Lots Of Reps, Low Rest)";
            String Exercise11 = "High Bar Squat: 5x10 (5 sets of 10 reps each) (Rep It Out!) ";
            String Exercise12 = "Conventional Deadlift: 4x15 (4 sets of 15 reps each) (Keep That Back Straight!) ";
            String Exercise13 = "Cable Flys: 3x15 (3 sets of 15 reps)";
            String Exercise14 = "Walking Lunges: 100m (5 sets, minute rest in between)";
            String Exercise15 = "Pull-Ups: 3x15 (3 sets of 15 reps)";

            Exercise1.setText(Exercise10);
            Exercise2.setText(Exercise11);
            Exercise3.setText(Exercise12);
            Exercise4.setText(Exercise13);
            Exercise5.setText(Exercise14);
            Exercise6.setText(Exercise15);
            Note.setText("Note: Make sure to be in a caloric deficit while maintaining a high protein intake");
        }

    }
}
