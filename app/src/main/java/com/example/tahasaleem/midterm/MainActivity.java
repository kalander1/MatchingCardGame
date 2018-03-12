package com.example.tahasaleem.midterm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;
import android.media.Image;
import android.widget.ImageButton;



import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    // Int variables for card game
    final int numCards = 52;
    private int playerScore = 0;

    // Image array for cards
    int cards[] = new int[] {R.drawable.card_1c, R.drawable.card_1d, R.drawable.card_1h, R.drawable.card_1s, R.drawable.card_2c, R.drawable.card_2d, R.drawable.card_2h, R.drawable.card_2s,
                                            R.drawable.card_3c, R.drawable.card_3d, R.drawable.card_3h, R.drawable.card_3s, R.drawable.card_4c,R.drawable.card_4d,R.drawable.card_4h,R.drawable.card_4s,
                                            R.drawable.card_5c, R.drawable.card_5d, R.drawable.card_5h, R.drawable.card_5s, R.drawable.card_6c, R.drawable.card_6d, R.drawable.card_6h, R.drawable.card_6s,
                                            R.drawable.card_7c, R.drawable.card_7d, R.drawable.card_7h, R.drawable.card_7s};
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

    private void loopCards()
    {
        for (int i = 0; i < numCards ; i++)
        {
            cards[i] = 
        }
    }
}
