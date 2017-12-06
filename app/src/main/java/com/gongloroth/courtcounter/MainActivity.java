package com.gongloroth.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private final int THREE_POINTS = 3;
    private final int TWO_POINTS = 2;
    private final int FREE_THROW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus2PointsA(View view){
        scoreTeamA +=TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void plus3PointsA(View view){
        scoreTeamA +=THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowA(View view){
        scoreTeamA +=FREE_THROW;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given scoreTeamB for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus2PointsB(View view){
        scoreTeamB +=TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void plus3PointsB(View view){
        scoreTeamB +=THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View view){
        scoreTeamB +=FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
