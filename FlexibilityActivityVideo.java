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

public class FlexibilityActivityVideo extends AppCompatActivity {
    VideoView anerobicvideo;
    ImageView m1;
    FloatingActionButton play_pause;
    AnimationDrawable myani;
    TextView videotext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexibility_activity_video);
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


            videotext.setText("sdgfgdff");
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


            videotext.setText("sdgfgdff");
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


            videotext.setText("sdgfgdff");
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


            videotext.setText("sdgfgdff");
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


            videotext.setText("sdgfgdff");
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


            videotext.setText("sdgfgdff");
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


            videotext.setText("sdgfgdff");
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


            videotext.setText("sdgfgdff");
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
