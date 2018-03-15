/*
*  Andre Reano 101075780
*  Taha Saleem 100803048
* */

package com.example.tahasaleem.midterm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.Window;
import android.widget.Toast;
import android.widget.ImageView;
import android.media.Image;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    // Int variables for card game
    final int numCards = 52;
    private int playerScore = 0;
    public int countClick = 0;
    int[] selected = new int[2];
    // List variables
    List<Integer> cardsList = new ArrayList<Integer>();
    List<Integer> dupList = new ArrayList<Integer>();

    //TextView times = (TextView) findViewById(R.id.time);


    // Image array for cards
    int cards[] = new int[] {               R.drawable.card_1c, R.drawable.card_1d, R.drawable.card_1h, R.drawable.card_1s, R.drawable.card_2c, R.drawable.card_2d, R.drawable.card_2h, R.drawable.card_2s,
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
    private int score = 0;



    //Buttons Dec
    ImageButton cardTwo;
    ImageButton cardOne;
    ImageButton cardThree;
    ImageButton cardFour;
    ImageButton cardFive;
    ImageButton cardSix;
    ImageButton cardSeven;
    ImageButton cardEight;
    ImageButton cardNine;
    ImageButton cardTen;
    ImageButton cardEleven;
    ImageButton cardTwelve;
    ImageButton cardThirteen;
    ImageButton cardFourteen;
    ImageButton cardFifteen;
    ImageButton cardSixteen;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Card Buttons
        cardOne = (ImageButton) findViewById(R.id.card1);
        cardOneLsn cOne = new cardOneLsn();
        cardOne.setOnClickListener(cOne);

        cardTwo = (ImageButton) findViewById(R.id.card2);
        cardTwoLsn cTwo = new cardTwoLsn();
        cardTwo.setOnClickListener(cTwo);

        cardThree = (ImageButton) findViewById(R.id.card3);
        cardThreeLsn cThree = new cardThreeLsn();
        cardThree.setOnClickListener(cThree);

        cardFour = (ImageButton) findViewById(R.id.card4);
        cardFourLsn cFour = new cardFourLsn();
        cardFour.setOnClickListener(cFour);

        cardFive = (ImageButton) findViewById(R.id.card5);
        cardFiveLsn cFive = new cardFiveLsn();
        cardFive.setOnClickListener(cFive);

        cardSix = (ImageButton) findViewById(R.id.card6);
        cardSixLsn cSix = new cardSixLsn();
        cardSix.setOnClickListener(cSix);

        cardSeven = (ImageButton) findViewById(R.id.card7);
        cardSevenLsn cSeven = new cardSevenLsn();
        cardSeven.setOnClickListener(cSeven);

        cardEight = (ImageButton) findViewById(R.id.card8);
        cardEightLsn cEight = new cardEightLsn();
        cardEight.setOnClickListener(cEight);

        cardNine = (ImageButton) findViewById(R.id.card9);
        cardNineLsn cNine = new cardNineLsn();
        cardNine.setOnClickListener(cNine);

        cardTen = (ImageButton) findViewById(R.id.card10);
        cardTenLsn cTen = new cardTenLsn();
        cardTen.setOnClickListener(cTen);

        cardEleven = (ImageButton) findViewById(R.id.card11);
        cardElevenLsn cEleven = new cardElevenLsn();
        cardEleven.setOnClickListener(cEleven);

        cardTwelve = (ImageButton) findViewById(R.id.card12);
        cardTwelveLsn cTwelve = new cardTwelveLsn();
        cardTwelve.setOnClickListener(cTwelve);

        cardThirteen = (ImageButton) findViewById(R.id.card13);
        cardThirteenLsn cThirteen = new cardThirteenLsn();
        cardThirteen.setOnClickListener(cThirteen);

        cardFourteen = (ImageButton) findViewById(R.id.card14);
        cardFourteenLsn cFourteen = new cardFourteenLsn();
        cardFourteen.setOnClickListener(cFourteen);

        cardFifteen = (ImageButton) findViewById(R.id.card15);
        cardFifteenLsn cFifteen = new cardFifteenLsn();
        cardFifteen.setOnClickListener(cFifteen);

        cardSixteen = (ImageButton) findViewById(R.id.card16);
        cardSixteenLsn cSixteen = new cardSixteenLsn();
        cardSixteen.setOnClickListener(cSixteen);

        scoreText = (TextView) findViewById(R.id.score);
        loopCards();
        loopDup();
    }




    //Buttons Listeners
    private class cardOneLsn implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            cardOne.setImageResource(cardsList.get(0));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(0);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(0);
               if(selected[0]==selected[1])
               {
                   score += 10;
                   scoreText.setText(String.valueOf(score));
                   countClick=0;
               }
               else {
                   countClick = 0;
                   cardOne.setImageResource(R.drawable.cardback);
               }
            }
        }
    }
    private class cardTwoLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
          //  cardTwo.setImageResource(cardsList.get(1));
            cardTwo.setImageResource(dupList.get(0));
            if(countClick == 0)
            {
                selected[countClick]=dupList.get(0);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(0);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardTwo.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardThreeLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardThree.setImageResource(cardsList.get(1));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(1);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(1);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardThree.setImageResource(R.drawable.cardback);
                }
            }
        }

    }
    private class cardFourLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardFour.setImageResource(dupList.get(1));
            if(countClick == 0)
            {
                selected[countClick]=dupList.get(1);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(1);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardFour.setImageResource(R.drawable.cardback);
                }
            }

        }
    }
    private class cardFiveLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardFive.setImageResource(cardsList.get(2));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(2);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(2);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardFive.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardSixLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardSix.setImageResource(dupList.get(2));
            if(countClick == 0)
            {
                selected[countClick]=dupList.get(2);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(2);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardSix.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardSevenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardSeven.setImageResource(cardsList.get(3));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(3);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(3);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardSeven.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardEightLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardEight.setImageResource(dupList.get(3));
            if(countClick == 0)
            {
                selected[countClick]=dupList.get(3);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(3);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardEight.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardNineLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardNine.setImageResource(cardsList.get(4));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(4);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(4);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardNine.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardTenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardTen.setImageResource(dupList.get(4));

            if(countClick == 0)
            {
                selected[countClick]=dupList.get(4);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(4);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardTen.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardElevenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardEleven.setImageResource(cardsList.get(5));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(5);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(5);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardEleven.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardTwelveLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardTwelve.setImageResource(dupList.get(5));
            if(countClick == 0)
            {
                selected[countClick]=dupList.get(5);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(5);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardTwelve.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardThirteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardThirteen.setImageResource(cardsList.get(6));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(6);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(6);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardThirteen.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardFourteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardFourteen.setImageResource(dupList.get(6));
            if(countClick == 0)
            {
                selected[countClick]=dupList.get(6);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(6);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardFourteen.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardFifteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardFifteen.setImageResource(cardsList.get(7));
            if(countClick == 0)
            {
                selected[countClick]=cardsList.get(7);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = cardsList.get(7);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardFifteen.setImageResource(R.drawable.cardback);
                }
            }
        }
    }
    private class cardSixteenLsn implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            cardSixteen.setImageResource(dupList.get(7));
            if(countClick == 0)
            {
                selected[countClick]=dupList.get(7);
                countClick++;
            }
            else if(countClick == 1)
            {
                selected[countClick] = dupList.get(7);
                if(selected[0]==selected[1])
                {
                    score += 10;
                    scoreText.setText(String.valueOf(score));
                    countClick=0;
                }
                else {
                    countClick = 0;
                    cardSixteen.setImageResource(R.drawable.cardback);
                }
            }
        }
    }

    public void loopCards()
    {

        for(int i=0; i<cards.length; i++)
        {
            cardsList.add(cards[i]);
        }
        Collections.shuffle(cardsList);



    }
    public void loopDup()
    {
        for(int x=0; x<8;x++)
        {
            dupList.add(cardsList.get(x));
        }
        Collections.shuffle(dupList);

    }



}
