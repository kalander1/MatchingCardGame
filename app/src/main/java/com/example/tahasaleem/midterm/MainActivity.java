package com.example.tahasaleem.midterm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


=======
import android.widget.TextView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;
import android.media.Image;
>>>>>>> 4172f59409b6036f4c8f8d8ed3ea23c28816eed9


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
}
