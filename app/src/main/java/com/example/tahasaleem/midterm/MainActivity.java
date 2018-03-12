package com.example.tahasaleem.midterm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.Window;
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
    int cards[] = new int[] {R.drawable.card_1c, R.drawable.card_1d, R.drawable.card_1h, R.drawable.card_1s, R.drawable.card_2c, R.drawable.card_2d, R.drawable.card_2h, R.drawable.card_2s,
                                            R.drawable.card_3c, R.drawable.card_3d, R.drawable.card_3h, R.drawable.card_3s, R.drawable.card_4c,R.drawable.card_4d,R.drawable.card_4h,R.drawable.card_4s,
                                            R.drawable.card_5c, R.drawable.card_5d, R.drawable.card_5h, R.drawable.card_5s, R.drawable.card_6c, R.drawable.card_6d, R.drawable.card_6h, R.drawable.card_6s,
                                            R.drawable.card_7c, R.drawable.card_7d, R.drawable.card_7h, R.drawable.card_7s, R.drawable.card_8c, R.drawable.card_8d, R.drawable.card_8h, R.drawable.card_8s,
                                            R.drawable.card_9c, R.drawable.card_9d, R.drawable.card_9h, R.drawable.card_9s, R.drawable.card_10c, R.drawable.card_10d, R.drawable.card_10h, R.drawable.card_10s,
                                            R.drawable.card_11c,R.drawable.card_11d, R.drawable.card_11h, R.drawable.card_11s, R.drawable.card_12c, R.drawable.card_12d, R.drawable.card_12h, R.drawable.card_12s,
                                            R.drawable.card_13c, R.drawable.card_13d, R.drawable.card_13h, R.drawable.card_13s};

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

        //Card Buttons
        ImageButton cardOne = (ImageButton) findViewById(R.id.card1);
        cardOneLsn cOne = new cardOneLsn();
        cardOne.setOnClickListener(cOne);

        ImageButton cardTwo = (ImageButton) findViewById(R.id.card2);
        cardTwoLsn cTwo = new cardTwoLsn();
        cardTwo.setOnClickListener(cTwo);

        ImageButton cardThree = (ImageButton) findViewById(R.id.card3);
        cardThreeLsn cThree = new cardThreeLsn();
        cardThree.setOnClickListener(cThree);

        ImageButton cardFour = (ImageButton) findViewById(R.id.card4);
        cardFourLsn cFour = new cardFourLsn();
        cardFour.setOnClickListener(cFour);

        ImageButton cardFive = (ImageButton) findViewById(R.id.card5);
        cardFiveLsn cFive = new cardFiveLsn();
        cardFive.setOnClickListener(cFive);

        ImageButton cardSix = (ImageButton) findViewById(R.id.card6);
        cardSixLsn cSix = new cardSixLsn();
        cardSix.setOnClickListener(cSix);

        ImageButton cardSeven = (ImageButton) findViewById(R.id.card7);
        cardSevenLsn cSeven = new cardSevenLsn();
        cardSeven.setOnClickListener(cSeven);

        ImageButton cardEight = (ImageButton) findViewById(R.id.card8);
        cardEightLsn cEight = new cardEightLsn();
        cardEight.setOnClickListener(cEight);

        ImageButton cardNine = (ImageButton) findViewById(R.id.card9);
        cardNineLsn cNine = new cardNineLsn();
        cardNine.setOnClickListener(cNine);

        ImageButton cardTen = (ImageButton) findViewById(R.id.card10);
        cardTenLsn cTen = new cardTenLsn();
        cardTen.setOnClickListener(cTen);

        ImageButton cardEleven = (ImageButton) findViewById(R.id.card11);
        cardElevenLsn cEleven = new cardElevenLsn();
        cardEleven.setOnClickListener(cEleven);

        ImageButton cardTwelve = (ImageButton) findViewById(R.id.card12);
        cardTwelveLsn cTwelve = new cardTwelveLsn();
        cardTwelve.setOnClickListener(cTwelve);

        ImageButton cardThirteen = (ImageButton) findViewById(R.id.card13);
        cardThirteenLsn cThirteen = new cardThirteenLsn();
        cardThirteen.setOnClickListener(cThirteen);

        ImageButton cardFourteen = (ImageButton) findViewById(R.id.card14);
        cardFourteenLsn cFourteen = new cardFourteenLsn();
        cardFourteen.setOnClickListener(cFourteen);

        ImageButton cardFifteen = (ImageButton) findViewById(R.id.card15);
        cardFifteenLsn cFifteen = new cardFifteenLsn();
        cardFifteen.setOnClickListener(cFifteen);

        ImageButton cardSixteen = (ImageButton) findViewById(R.id.card16);
        cardSixteenLsn cSixteen = new cardSixteenLsn();
        cardSixteen.setOnClickListener(cSixteen);
    }



    //Buttons Listeners
    private class cardOneLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardTwoLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardThreeLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardFourLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardFiveLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardSixLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardSevenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardEightLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardNineLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardTenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardElevenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardTwelveLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardThirteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardFourteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardFifteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }
    private class cardSixteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {

        }
    }

    private void loopCards()
    {
        for (int i = 0; i < numCards ; i++)
        {
            
        }
    }
}
