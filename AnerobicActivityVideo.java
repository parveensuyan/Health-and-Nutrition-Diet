package com.example.parveen.healthconsultantsandnutrition;

import android.app.SearchManager;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

public class AnerobicActivityVideo extends AppCompatActivity {
    VideoView anerobicvideo;
    ImageView m1;
    FloatingActionButton play_pause;
    AnimationDrawable myani;
    TextView videotext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anerobic_activity_video);
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

            videotext.setText("The chin-up (also known as a chin or chinup) " + "is a strength training exercise. People frequently do this exercise with the intention of strengthening " + "muscles such as the latissimus dorsi and biceps," +
                    " which extend the shoulder and flex the elbow, respectively.");

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
            videotext.setText("Jump on the balls of your feet with your body fairly erect. " +
                    "Your heels should not touch the ground, and your elbows " +
                    "should be near your sides with your wrists doing the work, " +
                    "not your arms.Continue for several minutes. Once you feel " +
                    "comfortable with the motion,continue to the next step.");
            m1.setBackgroundResource(R.drawable.jumpinf_anerobic);
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
            videotext.setText("A common method of muscular strength training, isometric exercise or" +
                    " isometrics are a type of exercise in which the joint angle and the muscle length " +
                    "do not change during contraction.");
            m1.setBackgroundResource(R.drawable.isometeric);
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
            videotext.setText("Get into a high plank position. Place your hands firmly on the ground, " +
                    "directly under shoulders.Lower your body. Begin to lower your body—keeping your back " +
                    "flat and eyes focused about three feet in front of you to keep a neutral neck—until your " +
                    "chest grazes the floor. ...\n" +
                    "Push back up.");
            m1.setBackgroundResource(R.drawable.pushupsani);
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
            videotext.setText("Sprinting, or running at high speeds for short intervals, " +
                    "can be exhilarating and fun. ... few minutes after every " +
                    "sprinting workout doing some light exercise,The idea is to" +
                    " get as far as you can in as few long steps as possible.");
            m1.setBackgroundResource(R.drawable.spritgiffy);
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
            videotext.setText("Stand with your feet slightly wider than hip-width apart," +
                    " back straight, shoulders down, toes pointed slightly out. " +
                    " Keeping your back straight, lower your body down and back as " +
                    "if you are sitting down into a chair,until your thighs are " +
                    "parallel to the ground (or as close to parallel as possible).");
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
            videotext.setText("Weight training is a common type of strength training for " +
                    "developing the strength and size of skeletal muscles.It utilizes" +
                    "the force of gravity in the form of weighted bars, dumbbells or " +
                    "weight stacksf");
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
            videotext.setText("Lie on your back with your knees bent and you feet flat on the floor.\n" +
                    "Place your finger tips behind your ears.\n" +
                    "Pull your shoulder blades back so your elbows are out to the side.\n" +
                    "Brace your abs and then raise your body up towards your knees, shoulders should be lifted of the floor.");
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
            videotext.setText("Lay out the rope. In tug of war, opposing player or " +
                    "teams will pull on a rope until one of the teams or players " +
                    "    succeeds at pulling the majority of the rope over to one side." +
                    " To get started, all you need to do is take your rope and lay it " +
                    "out in a straight line on the ground.");
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
    }}



