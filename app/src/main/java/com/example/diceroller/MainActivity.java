package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView miss = (TextView) findViewById(R.id.critmiss);
        miss.setVisibility(View.INVISIBLE);
        TextView hit = (TextView) findViewById(R.id.crithit);
        hit.setVisibility(View.INVISIBLE);





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
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                TextView miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.VISIBLE);
                TextView hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.lose);
                mediaPlayer.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                hit = (TextView) findViewById(R.id.crithit);
                hit.setVisibility(View.INVISIBLE);
                miss = (TextView) findViewById(R.id.critmiss);
                miss.setVisibility(View.INVISIBLE);
                break;
            case 20:
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
