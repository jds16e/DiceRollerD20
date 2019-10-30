package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import java.util.Random

class MainActivity : AppCompatActivity() {
    private var imageViewDice: ImageView? = null
    private val rng = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miss = findViewById<View>(R.id.critmiss) as TextView
        miss.visibility = View.INVISIBLE
        val hit = findViewById<View>(R.id.crithit) as TextView
        hit.visibility = View.INVISIBLE





        imageViewDice = findViewById(R.id.image_view_dice)
        imageViewDice!!.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        var mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.roll)
        mediaPlayer.start()

        val randomNumber = rng.nextInt(20) + 1
        when (randomNumber) {
            1 -> {
                imageViewDice!!.setImageResource(R.drawable.dice1)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.visibility = View.VISIBLE
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.visibility = View.INVISIBLE
                mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.lose)
                mediaPlayer.start()
            }
            2 -> {
                imageViewDice!!.setImageResource(R.drawable.dice2)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            3 -> {
                imageViewDice!!.setImageResource(R.drawable.dice3)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            4 -> {
                imageViewDice!!.setImageResource(R.drawable.dice4)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            5 -> {
                imageViewDice!!.setImageResource(R.drawable.dice5)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            6 -> {
                imageViewDice!!.setImageResource(R.drawable.dice6)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            7 -> {
                imageViewDice!!.setImageResource(R.drawable.dice7)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            8 -> {
                imageViewDice!!.setImageResource(R.drawable.dice8)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            9 -> {
                imageViewDice!!.setImageResource(R.drawable.dice9)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            10 -> {
                imageViewDice!!.setImageResource(R.drawable.dice10)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            11 -> {
                imageViewDice!!.setImageResource(R.drawable.dice11)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            12 -> {
                imageViewDice!!.setImageResource(R.drawable.dice12)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            13 -> {
                imageViewDice!!.setImageResource(R.drawable.dice13)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            14 -> {
                imageViewDice!!.setImageResource(R.drawable.dice14)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            15 -> {
                imageViewDice!!.setImageResource(R.drawable.dice15)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            16 -> {
                imageViewDice!!.setImageResource(R.drawable.dice16)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            17 -> {
                imageViewDice!!.setImageResource(R.drawable.dice17)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            18 -> {
                imageViewDice!!.setImageResource(R.drawable.dice18)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            19 -> {
                imageViewDice!!.setImageResource(R.drawable.dice19)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.INVISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
            }
            20 -> {
                imageViewDice!!.setImageResource(R.drawable.dice20)
                var hit = findViewById<View>(R.id.crithit) as TextView
                hit.setVisibility(View.VISIBLE)
                var miss = findViewById<View>(R.id.critmiss) as TextView
                miss.setVisibility(View.INVISIBLE)
                mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.win)
                mediaPlayer.start()
            }
        }
    }
}
