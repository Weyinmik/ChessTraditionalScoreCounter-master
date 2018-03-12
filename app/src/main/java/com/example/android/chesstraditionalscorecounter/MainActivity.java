package com.example.android.chesstraditionalscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Utilized variables for team White and Black scores are declared and initialised to zero (0).
     */
    double scoreWhite = 0;
    double scoreBlack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    /**
     * Helpful for screen rotation, ensures that data is saved when screen rotates horizontally and vertically
     */

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState ( savedInstanceState );
        savedInstanceState.putDouble ( "score for white", scoreWhite );
        savedInstanceState.putDouble ( "score for black", scoreBlack );

    }

    /**
     * Helpful for screen rotation, ensures that data is saved when screen rotates horizontally and vertically
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState ( savedInstanceState );
        if (savedInstanceState != null) {
            scoreWhite = savedInstanceState.getDouble ( "scoreWhite" );
            scoreBlack = savedInstanceState.getDouble ( "scoreBlack" );

        }
    }

    /**
     * TEAM WHITE
     */

    /**
     * This increases the point by 1 when the +1WIN Button in White is clicked
     */
    public void submitWinWhite(View view) {
        scoreWhite = scoreWhite + 1;
        displayForWhite ( scoreWhite );

    }

    /**
     * This increases the points by 0.5 when the 1/2Draw Button in White is clicked
     */
    public void submitDrawWhite(View view) {
        scoreWhite = scoreWhite + 0.5;
        displayForWhite ( scoreWhite );
    }

    /**
     * This increases the point by 0 when the +0LOSS Button in White is clicked
     */
    public void submitLossWhite(View view) {
        scoreWhite = scoreWhite + 0;
        displayForWhite ( scoreWhite );
    }

    /**
     * TEAM BLACK
     */

    /**
     * This increases the point by 1 when the +1WIN Button in Black is clicked
     */
    public void submitWinBlack(View view) {
        scoreBlack = scoreBlack + 1;
        displayForBlack ( scoreBlack );
    }

    /**
     * This increases the point by 0.5 when the +1WIN Button in Black is clicked
     */
    public void submitDrawBlack(View view) {
        scoreBlack = scoreBlack + 0.5;
        displayForBlack ( scoreBlack );
    }

    /**
     * This increases the point by 0 when the +0LOSS Button in Black is clicked
     */
    public void submitLossBlack(View view) {
        scoreBlack = scoreBlack + 0;
        displayForBlack ( scoreBlack );
    }

    /**
     * RESET SCORE FOR BOTH TEAM A AND TEAM B
     */
    public void resetScore(View view) {
        scoreWhite = 0;
        scoreBlack = 0;
        displayForWhite ( scoreWhite );
        displayForBlack ( scoreBlack );
    }


    /**
     * Displays the given score for Team White.
     */
    public void displayForWhite(double score) {
        TextView scoreView = (TextView) findViewById ( R.id.white_score );
        scoreView.setText ( String.valueOf ( score ) );
    }

    /**
     * Displays the given score for Team Black.
     */
    public void displayForBlack(double score) {
        TextView scoreView = (TextView) findViewById ( R.id.black_score );
        scoreView.setText ( String.valueOf ( score ) );
    }
}


