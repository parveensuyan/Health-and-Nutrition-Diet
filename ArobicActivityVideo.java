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

public class ArobicActivityVideo extends AppCompatActivity {
    ImageView m1;
    FloatingActionButton play_pause;
    AnimationDrawable myani;
    TextView videotext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arobic_activity_video);
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


            videotext.setText("Sometimes overlooked as a form of exercise, walking can help you build stamina, burn excess calories and give you a healthier heart. ...");
            m1.setBackgroundResource(R.drawable.walkinggiiffy);
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
        }

        if (d == 1) {


            videotext.setText("Cycling, also called bicycling or biking, is the use of bicycles for transport, recreation, exercise or sport. " +
                    "Persons engaged in cycling are referred to as \"cyclists\", \"bikers\", or less commonly, as \"bicyclists\".");
            m1.setBackgroundResource(R.drawable.cyclingiffy);
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
        }

        if (d == 2) {


            videotext.setText("The Freestyle Stroke.\n" +
                    "Breaststroke.\n" +
                    "The Butterfly Stroke.\n" +
                    "Backstroke.\n" +
                    "Sidestroke.\n" +
                    "Elementary Backstroke.");
            m1.setBackgroundResource(R.drawable.swimgiffy);
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
        }

        if (d == 3) {


            videotext.setText("Start by walking for 15-20 minutes a day 3-4 times a week.\n" +
                    "Gradually increase the pace of your walking until jogging becomes the next logical step.");
            m1.setBackgroundResource(R.drawable.jogginggiffy);
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
        }

        if (d == 4) {


            videotext.setText("Begin moving your arms more dramatically back and forth, \" +\n" +
                    "                    \"\" +\n" +
                    "                    \"and then bring them in front of you slightly to intensify your workout. \" +\n" +
                    "                    \"This dance move continues to warm up your muscles and increases your heart rate. \" +\n" +
                    "                    \"Perform this basic aerobic step for a few minutes, then begin to alternate the \" +\n" +
                    "                    \"move with other basic steps.");
            m1.setBackgroundResource(R.drawable.dancingarbcgiffy);
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

        }
        if (d == 5) {


            videotext.setText(" Turn your whole body and pivot your feet on ALL PUNCHES EXCEPT THE JAB.\n" +
                    "            Maintain your stance and balance for better power and mobility.\n" +
                    "            Make sure the non-punching hand is defending the other side of your body.\n" +
                    "                    Exhale sharply on every shot.");
            m1.setBackgroundResource(R.drawable.boxing);
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
        }
        if (d == 6) {


            videotext.setText("Stand with your feet together and your hands down by your side.\n" +
                    "In one motion jump your feet out to the side and raise your arms above your head.\n" +
                    "Immediately reverse that motion by jumping back to the starting position.");
            m1.setBackgroundResource(R.drawable.jumpingjack);
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
        }
        if (d == 7) {


            videotext.setText("Burns an average of 500 calories an hour (some estimates reach 810)\n" +
                    "Targets your arms, shoulders, abs, thighs, and butt in one workout\n" +
                    "It's an amazing stress release ");
            m1.setBackgroundResource(R.drawable.kickboxing);
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
        }


        if (d == 8) {


            videotext.setText("Serve – starting a rally by hitting the ball (underarm or overarm) against the front wall. Let – if your swing is impeded by your opponent, a let is called and neither player wins a point. ... " +
                    "If the ball hits this line or below then it's out.");
            m1.setBackgroundResource(R.drawable.rocketgiffy);
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


    }
    }

}
