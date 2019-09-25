package com.example.lab3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView Info;
    int counter = 52;
    Random rand;
    int show;
    ImageView image;
    FloatingActionButton Tap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Info = (TextView) findViewById(R.id.tvCard);
        image = (ImageView) findViewById(R.id.imageView);
        Tap = (FloatingActionButton)findViewById(R.id.Tap);


        /************ Default View  ***************/
        Info.setText("Cards Remaining: 52");
        image.setImageResource(R.drawable.red_joker);


        final ArrayList<Integer> cardValues = new ArrayList<Integer>();
        cardValues.add(R.drawable.ace_of_clubs);
        cardValues.add(R.drawable.ace_of_diamonds);
        cardValues.add(R.drawable.ace_of_hearts);
        cardValues.add(R.drawable.ace_of_spades2);
        cardValues.add(R.drawable.king_of_clubs2);
        cardValues.add(R.drawable.king_of_diamonds2);
        cardValues.add(R.drawable.king_of_hearts2);
        cardValues.add(R.drawable.king_of_spades2);
        cardValues.add(R.drawable.queen_of_clubs2);
        cardValues.add(R.drawable.queen_of_diamonds2);
        cardValues.add(R.drawable.queen_of_hearts2);
        cardValues.add(R.drawable.queen_of_spades2);
        cardValues.add(R.drawable.jack_of_clubs2);
        cardValues.add(R.drawable.jack_of_diamonds2);
        cardValues.add(R.drawable.jack_of_hearts2);
        cardValues.add(R.drawable.jack_of_spades2);
        cardValues.add(R.drawable.ten_of_clubs);
        cardValues.add(R.drawable.ten_of_diamonds);
        cardValues.add(R.drawable.ten_of_hearts);
        cardValues.add(R.drawable.ten_of_spades);
        cardValues.add(R.drawable.nine_of_clubs);
        cardValues.add(R.drawable.nine_of_diamonds);
        cardValues.add(R.drawable.nine_of_hearts);
        cardValues.add(R.drawable.nine_of_spades);
        cardValues.add(R.drawable.eight_of_clubs);
        cardValues.add(R.drawable.eight_of_diamonds);
        cardValues.add(R.drawable.eight_of_hearts);
        cardValues.add(R.drawable.eight_of_spades);
        cardValues.add(R.drawable.seven_of_clubs);
        cardValues.add(R.drawable.seven_of_diamonds);
        cardValues.add(R.drawable.seven_of_hearts);
        cardValues.add(R.drawable.seven_of_spades);
        cardValues.add(R.drawable.six_of_clubs);
        cardValues.add(R.drawable.six_of_diamonds);
        cardValues.add(R.drawable.six_of_hearts);
        cardValues.add(R.drawable.six_of_spades);
        cardValues.add(R.drawable.five_of_clubs);
        cardValues.add(R.drawable.five_of_diamonds);
        cardValues.add(R.drawable.five_of_hearts);
        cardValues.add(R.drawable.five_of_spades);
        cardValues.add(R.drawable.four_of_clubs);
        cardValues.add(R.drawable.four_of_diamonds);
        cardValues.add(R.drawable.four_of_hearts);
        cardValues.add(R.drawable.four_of_spades);
        cardValues.add(R.drawable.three_of_clubs);
        cardValues.add(R.drawable.three_of_diamonds);
        cardValues.add(R.drawable.three_of_hearts);
        cardValues.add(R.drawable.three_of_spades);
        cardValues.add(R.drawable.two_of_clubs);
        cardValues.add(R.drawable.two_of_diamonds);
        cardValues.add(R.drawable.two_of_hearts);
        cardValues.add(R.drawable.two_of_spades);



        Tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rand = new Random();
                show = rand.nextInt(counter);

                image.setImageResource(cardValues.get(show));
                counter--;

                Info.setText("Cards remaining : " + counter);

                if (counter == 0) {
                    counter = 52;
                    Info.setText("Remaining Cards : " + counter);
                    image.setImageResource(R.drawable.black_joker);
                }
            }

        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()){
            case R.id.shuffle:
                counter = 52;
                Info.setText("Remaining Cards : " + counter);
                image.setImageResource(R.drawable.black_joker);
                break;
        }



        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.shuffle) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
