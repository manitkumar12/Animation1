package com.grademojo.animation1;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    Boolean aBoolean;
    ImageView a, b,c;

    Button aa,bb,cc,dd;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        a= (ImageView) findViewById(R.id.imag1);
        b= (ImageView)findViewById(R.id.imag2);
        c= (ImageView)findViewById(R.id.imag3);
        aa=(Button)findViewById(R.id.zoom);
        bb=(Button)findViewById(R.id.slide);
        cc=(Button)findViewById(R.id.fade);
        dd=(Button)findViewById(R.id.rotate);

        aBoolean=false;


        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aBoolean){
                    return;
                }




                YoYo.with(Techniques.RotateIn)
                        .duration(400)
                        .playOn(a);
                YoYo.with(Techniques.RotateIn)
                        .duration(400)
                        .playOn(b);
                YoYo.with(Techniques.RotateIn)
                        .duration(400)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                aBoolean=true;
                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                aBoolean=false;
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(c);
            }
        });


        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (aBoolean){
                    return;
                }
                YoYo.with(Techniques.ZoomIn)
                        .duration(500)
                        .playOn(a);

                YoYo.with(Techniques.ZoomInLeft)
                        .duration(500)
                        .playOn(b);

                YoYo.with(Techniques.ZoomInUp)
                        .duration(500)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                aBoolean=true;
                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                aBoolean=false;
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(c);

            }
        });


        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aBoolean){
                    return;
                }

                YoYo.with(Techniques.SlideInDown)
                        .duration(500)
                        .playOn(a);

                YoYo.with(Techniques.SlideInRight)
                        .duration(500)
                        .playOn(b);

                YoYo.with(Techniques.SlideOutLeft)
                        .duration(500)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                aBoolean=true;
                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                aBoolean=false;
                            }


                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(c);
            }
        });


        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aBoolean){
                    return;
                }

                YoYo.with(Techniques.FadeOutLeft)
                        .duration(500)
                        .playOn(a);

                YoYo.with(Techniques.FadeIn)
                        .duration(500)
                        .playOn(b);

                YoYo.with(Techniques.FadeInRight)
                        .duration(500)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                aBoolean=true;
                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                aBoolean=false;

                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(c);
            }
        });



    }
}

