package com.example.tahasaleem.midterm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;
import android.media.Image;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    // Int variables for card game
    final int numCards = 52;
    private int playerScore = 0;

    // Image array for cards
    Image cards[] = new Image[numCards];
    String fileLocation = new String();

    // Alerts
    AlertDialog.Builder playAgain;

    private TextView scoreText;
    private TextView countDown;
    private TextView pickCardText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
