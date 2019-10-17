package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class Saved_Dice_Rolls extends AppCompatActivity {
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
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private TextView text8;
    private TextView text9;
    private TextView text10;
    private TextView text11;
    private TextView text12;
    private TextView text13;
    private TextView text14;
    private TextView text15;
    private TextView text16;
    private TextView text17;
    private TextView text18;
    private TextView text19;
    private TextView text20;
    private LinearLayout linearLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved__dice__rolls);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        rolled1 = sharedPref.getInt(getString(R.string.one), 0);
        rolled2 = sharedPref.getInt(getString(R.string.two), 0);
        rolled3 = sharedPref.getInt(getString(R.string.three), 0);
        rolled4 = sharedPref.getInt(getString(R.string.four), 0);
        rolled5 = sharedPref.getInt(getString(R.string.five), 0);
        rolled6 = sharedPref.getInt(getString(R.string.six), 0);
        rolled7 = sharedPref.getInt(getString(R.string.seven), 0);
        rolled8 = sharedPref.getInt(getString(R.string.eight), 0);
        rolled9 = sharedPref.getInt(getString(R.string.nine), 0);
        rolled10 = sharedPref.getInt(getString(R.string.ten), 0);
        rolled11 = sharedPref.getInt(getString(R.string.eleven), 0);
        rolled12 = sharedPref.getInt(getString(R.string.twelve), 0);
        rolled13 = sharedPref.getInt(getString(R.string.thirteen), 0);
        rolled14 = sharedPref.getInt(getString(R.string.fourteen), 0);
        rolled15 = sharedPref.getInt(getString(R.string.fifteen), 0);
        rolled16 = sharedPref.getInt(getString(R.string.sixteen), 0);
        rolled17 = sharedPref.getInt(getString(R.string.seventeen), 0);
        rolled18 = sharedPref.getInt(getString(R.string.eighteen), 0);
        rolled19 = sharedPref.getInt(getString(R.string.nineteen), 0);
        rolled20 = sharedPref.getInt(getString(R.string.twenty), 0);

        text1 = findViewById(R.id.text1);
        text1.setText("1 was rolled " + Integer.toString(rolled1) + " times.");
        text2 = findViewById(R.id.text2);
        text2.setText("2 was rolled " + Integer.toString(rolled2) + " times.");
        text3 = findViewById(R.id.text3);
        text3.setText("3 was rolled " + Integer.toString(rolled3) + " times.");
        text4 = findViewById(R.id.text4);
        text4.setText("4 was rolled " + Integer.toString(rolled4) + " times.");
        text5 = findViewById(R.id.text5);
        text5.setText("5 was rolled " + Integer.toString(rolled5) + " times.");
        text6 = findViewById(R.id.text6);
        text6.setText("6 was rolled " + Integer.toString(rolled6) + " times.");
        text7 = findViewById(R.id.text7);
        text7.setText("7 was rolled " + Integer.toString(rolled7) + " times.");
        text8 = findViewById(R.id.text8);
        text8.setText("8 was rolled " + Integer.toString(rolled8) + " times.");
        text9 = findViewById(R.id.text9);
        text9.setText("9 was rolled " + Integer.toString(rolled9) + " times.");
        text10 = findViewById(R.id.text10);
        text10.setText("10 was rolled " + Integer.toString(rolled10) + " times.");
        text11 = findViewById(R.id.text11);
        text11.setText("11 was rolled " + Integer.toString(rolled11) + " times.");
        text12 = findViewById(R.id.text12);
        text12.setText("12 was rolled " + Integer.toString(rolled12) + " times.");
        text13 = findViewById(R.id.text13);
        text13.setText("13 was rolled " + Integer.toString(rolled13) + " times.");
        text14 = findViewById(R.id.text14);
        text14.setText("14 was rolled " + Integer.toString(rolled14) + " times.");
        text15 = findViewById(R.id.text15);
        text15.setText("15 was rolled " + Integer.toString(rolled15) + " times.");
        text16 = findViewById(R.id.text16);
        text16.setText("16 was rolled " + Integer.toString(rolled16) + " times.");
        text17 = findViewById(R.id.text17);
        text17.setText("17 was rolled " + Integer.toString(rolled17) + " times.");
        text18 = findViewById(R.id.text18);
        text18.setText("18 was rolled " + Integer.toString(rolled18) + " times.");
        text19 = findViewById(R.id.text19);
        text19.setText("19 was rolled " + Integer.toString(rolled19) + " times.");
        text20 = findViewById(R.id.text20);
        text20.setText("20 was rolled " + Integer.toString(rolled20) + " times.");


    }


}
