package com.example.parveen.healthconsultantsandnutrition;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class BalanceActivityVideo extends AppCompatActivity {

    VideoView anerobicvideo;
    ImageView m1;
    FloatingActionButton play_pause;
    AnimationDrawable myani;
    TextView videotext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_activity_video);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        m1 = (ImageView) findViewById(R.id.imageView);
        videotext = (TextView) findViewById(R.id.textView);

        int d = getIntent().getExtras().getInt("myvideo");
        play_pause = (FloatingActionButton) findViewById(R.id.play_pause);
        m1.setBackgroundResource(R.drawable.chinupsxmll);
        myani = (AnimationDrawable) m1.getBackground();
        myani.start();
        play_pause.setVisibility(View.INVISIBLE);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myani.isRunning()) {
                    myani.stop();
                    play_pause.setVisibility(View.VISIBLE);


                } else {
                    myani.start();
                    play_pause.setVisibility(View.INVISIBLE);

                }
            }
        });
        if (d == 0) {

            videotext.setText("A handstand is the act of supporting the body in a stable, " +
                              "inverted vertical position by balancing on the hands. In a " +
                              "basic handstand the body is held straight with arms and " +
                             "legs fully extended, with hands spaced approximately shoulder-width apart.");
            m1.setBackgroundResource(R.drawable.balhand);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//
                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);


                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);

                    }
                }
            });
        } else if (d == 1) {
            videotext.setText("If you’re a clumsy person whose lack of balance feels like a curse from the heavens," +
                    " worry not. Balance isn’t necessarily a skill (or lack thereof) you’re stuck with; good balance " +
                    "comes with practice. The dynamic balance step knee-up can help – the “dynamic” part is your moving " +
                    "balance. High-knee exercises are a great way to warm up your muscles and get your blood pumping " +
                    "before your workout,and with practice they can ensure that you stay healthy and injured in your " +
                    "athletic endeavors.");
            m1.setBackgroundResource(R.drawable.kneebal);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//
                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        } else if (d == 2) {
            videotext.setText("Start with your feet together, hands by your side -" +
                    " you should choose which way your will be twisting now " +
                    "(for this step-by-step it will be clockwise)\n" +
                    "Bend your knees and spring up into a jump\n" +
                    "Raise your hands above your head as you jump up to give " +
                    "more upward momentum Lead with your left shoulder and turn" +
                    " your head to the right to twist clockwise\n" +
                    "Engage your core to bring your hips round in the twist\n" +
                    "Once you have twisted 360°, look straight ahead and cushion" +
                    " your landing by bending your knees");
            m1.setBackgroundResource(R.drawable.twistjump);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//
                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        } else if (d == 3) {
            videotext.setText("balance beam. a narrow wooden rail about 16 feet (5 meters) " +
                    "long and 4 inches (10 cm) wide, set horizontally on upright posts about 4 " +
                    "feet (1.2 meters) from the floor, used for performing feats of balancing and " +
                    "demonstrating gymnastic ability.a competitive gymnastic event for women in which" +
                    " such an apparatus is used.");
            m1.setBackgroundResource(R.drawable.beameraw);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//
                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        } else if (d == 4) {
            videotext.setText("Hopscotch is a children's game that can be played with several players or alone. " +
                                "Hopscotch is a popular playground game in which players toss a small object" +
                              " into numbered spaces of a pattern of rectangles outlined on the ground and then " +
                               "hop or jump through the spaces to retrieve the object.");
            m1.setBackgroundResource(R.drawable.hostoch);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        } else if (d == 6) {
            videotext.setText("cross one leg over the other for the big toe stretch." +
                    " Grab your big toe, pull it gently toward you, and hold for 15 to 30 seconds." +
                    " Do this three times, then reverse and do the same with the other foot.\n");
            m1.setBackgroundResource(R.drawable.suqatgiffy);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        } else if (d == 8) {
            videotext.setText("sdgfgdff");
            m1.setBackgroundResource(R.drawable.weightlftan);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        } else if (d == 5) {
            videotext.setText("sdgfgdff");
            m1.setBackgroundResource(R.drawable.situps);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        } else if (d == 7) {
            videotext.setText("sdgfgdff");
            m1.setBackgroundResource(R.drawable.tugofwar);
            myani = (AnimationDrawable) m1.getBackground();
            myani.start();

            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (myani.isRunning()) {
                        myani.stop();
                        play_pause.setVisibility(View.VISIBLE);

                    } else {
                        myani.start();
                        play_pause.setVisibility(View.INVISIBLE);
                    }
                }
            });
        }
    }
}