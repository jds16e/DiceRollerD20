package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private Button saved;
    private int rolled1;
    private int rolled2;
    private int rolled3;
    private int rolled4;
    private int rolled5;
    private int rolled6;
    private int rolled7;
    private int rolled8;
    private int rolled9;
    private int rolled10;
    private int rolled11;
    private int rolled12;
    private int rolled13;
    private int rolled14;
    private int rolled15;
    private int rolled16;
    private int rolled17;
    private int rolled18;
    private int rolled19;
    private int rolled20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView miss = (TextView) findViewById(R.id.critmiss);
        miss.setVisibility(View.INVISIBLE);
        TextView hit = (TextView) findViewById(R.id.crithit);
        hit.setVisibility(View.INVISIBLE);
        rolled1 = 0;
        rolled2 = 0;
        rolled3 = 0;
        rolled4 = 0;
        rolled5 = 0;
        rolled6 = 0;
        rolled7 = 0;
        rolled8 = 0;
        rolled9 = 0;
        rolled10 = 0;
        rolled11 = 0;
        rolled12 = 0;
        rolled13 = 0;
        rolled14 = 0;
        rolled15 = 0;
        rolled16 = 0;
        rolled17 = 0;
        rolled18 = 0;
        rolled19 = 0;
        rolled20 = 0;




        saved = (Button) findViewById(R.id.saved);
        saved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = saved.getContext();
                Intent intent = new Intent(context, Saved_Dice_Rolls.class);
                context.startActivity(intent);

            }
        });








        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rollDice();
            }

        });
    }
    private void rollDice() {
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.roll);
        mediaPlayer.start();

        int randomNumber = rng.nextInt(20) + 1;
        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        switch (randomNumber) {
            case 1:

                rolled1 = sharedPref.getInt(getString(R.string.one), 0);
                rolled1 ++;
                SharedPreferences.Editor editor1 = sharedPref.edit();
                editor1.putInt(getString(R.string.one), rolled1);
                editor1.commit();

                imageViewDice.setImageResource(R.drawable.dice1);
                TextView miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.VISIBLE);
                TextView hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.lose);
                mediaPlayer.start();


                break;
            case 2:

                rolled2 =sharedPref.getInt(getString(R.string.two), 0);
                SharedPreferences.Editor editor2 = sharedPref.edit();
                rolled2++;
                editor2.putInt(getString(R.string.two), rolled2);
                editor2.commit();

                imageViewDice.setImageResource(R.drawable.dice2);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);

                break;

            case 3:
                rolled3 =sharedPref.getInt(getString(R.string.three), 0);
                SharedPreferences.Editor editor3 = sharedPref.edit();
                rolled3++;
                editor3.putInt(getString(R.string.three), rolled3);
                editor3.commit();
                imageViewDice.setImageResource(R.drawable.dice3);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 4:
                rolled4 =sharedPref.getInt(getString(R.string.four), 0);
                SharedPreferences.Editor editor4 = sharedPref.edit();
                rolled4++;
                editor4.putInt(getString(R.string.four), rolled4);
                editor4.commit();
                imageViewDice.setImageResource(R.drawable.dice4);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 5:
                rolled5 =sharedPref.getInt(getString(R.string.five), 0);
                SharedPreferences.Editor editor5 = sharedPref.edit();
                rolled5++;
                editor5.putInt(getString(R.string.five), rolled5);
                editor5.commit();
                imageViewDice.setImageResource(R.drawable.dice5);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 6:
                rolled6 =sharedPref.getInt(getString(R.string.six), 0);
                SharedPreferences.Editor editor6 = sharedPref.edit();
                rolled6++;
                editor6.putInt(getString(R.string.six), rolled6);
                editor6.commit();
                imageViewDice.setImageResource(R.drawable.dice6);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 7:
                rolled7 =sharedPref.getInt(getString(R.string.seven), 0);
                SharedPreferences.Editor editor7 = sharedPref.edit();
                rolled7++;
                editor7.putInt(getString(R.string.seven), rolled7);
                editor7.commit();
                imageViewDice.setImageResource(R.drawable.dice7);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 8:
                rolled8 =sharedPref.getInt(getString(R.string.eight), 0);
                SharedPreferences.Editor editor8 = sharedPref.edit();
                rolled8++;
                editor8.putInt(getString(R.string.eight), rolled8);
                editor8.commit();
                imageViewDice.setImageResource(R.drawable.dice8);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 9:
                rolled9 =sharedPref.getInt(getString(R.string.nine), 0);
                SharedPreferences.Editor editor9 = sharedPref.edit();
                rolled9++;
                editor9.putInt(getString(R.string.nine), rolled9);
                editor9.commit();
                imageViewDice.setImageResource(R.drawable.dice9);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 10:
                rolled10 =sharedPref.getInt(getString(R.string.ten), 0);
                SharedPreferences.Editor editor10 = sharedPref.edit();
                rolled10++;
                editor10.putInt(getString(R.string.ten), rolled10);
                editor10.commit();
                imageViewDice.setImageResource(R.drawable.dice10);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 11:
                rolled11 =sharedPref.getInt(getString(R.string.eleven), 0);
                SharedPreferences.Editor editor11 = sharedPref.edit();
                rolled11++;
                editor11.putInt(getString(R.string.eleven), rolled11);
                editor11.commit();
                imageViewDice.setImageResource(R.drawable.dice11);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 12:
                rolled12 =sharedPref.getInt(getString(R.string.twelve), 0);
                SharedPreferences.Editor editor12 = sharedPref.edit();
                rolled12++;
                editor12.putInt(getString(R.string.twelve), rolled12);
                editor12.commit();
                imageViewDice.setImageResource(R.drawable.dice12);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 13:
                rolled13 =sharedPref.getInt(getString(R.string.thirteen), 0);
                SharedPreferences.Editor editor13 = sharedPref.edit();
                rolled13++;
                editor13.putInt(getString(R.string.thirteen), rolled13);
                editor13.commit();
                imageViewDice.setImageResource(R.drawable.dice13);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 14:
                rolled14 =sharedPref.getInt(getString(R.string.fourteen), 0);
                SharedPreferences.Editor editor14 = sharedPref.edit();
                rolled14++;
                editor14.putInt(getString(R.string.fourteen), rolled14);
                editor14.commit();
                imageViewDice.setImageResource(R.drawable.dice14);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 15:
                rolled15 =sharedPref.getInt(getString(R.string.fifteen), 0);
                SharedPreferences.Editor editor15 = sharedPref.edit();
                rolled15++;
                editor15.putInt(getString(R.string.fifteen), rolled15);
                editor15.commit();
                imageViewDice.setImageResource(R.drawable.dice15);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 16:
                rolled16 =sharedPref.getInt(getString(R.string.sixteen), 0);
                SharedPreferences.Editor editor16 = sharedPref.edit();
                rolled16++;
                editor16.putInt(getString(R.string.sixteen), rolled16);
                editor16.commit();
                imageViewDice.setImageResource(R.drawable.dice16);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 17:
                rolled17 =sharedPref.getInt(getString(R.string.seventeen), 0);
                SharedPreferences.Editor editor17 = sharedPref.edit();
                rolled17++;
                editor17.putInt(getString(R.string.seventeen), rolled17);
                editor17.commit();
                imageViewDice.setImageResource(R.drawable.dice17);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 18:
                rolled18 =sharedPref.getInt(getString(R.string.eighteen), 0);
                SharedPreferences.Editor editor18 = sharedPref.edit();
                rolled18++;
                editor18.putInt(getString(R.string.eighteen), rolled18);
                editor18.commit();
                imageViewDice.setImageResource(R.drawable.dice18);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 19:
                rolled19 =sharedPref.getInt(getString(R.string.nineteen), 0);
                SharedPreferences.Editor editor19 = sharedPref.edit();
                rolled19++;
                editor19.putInt(getString(R.string.nineteen), rolled19);
                editor19.commit();
                imageViewDice.setImageResource(R.drawable.dice19);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 20:
                rolled20 =sharedPref.getInt(getString(R.string.twenty), 0);
                SharedPreferences.Editor editor20 = sharedPref.edit();
                rolled20++;
                editor20.putInt(getString(R.string.twenty), rolled20);
                editor20.commit();
                imageViewDice.setImageResource(R.drawable.dice20);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.VISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.win);
                mediaPlayer.start();
                break;

        }

    }
}
