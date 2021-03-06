package com.example.dharamvirsingh.hangover;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BLevel_18 extends AppCompatActivity implements View.OnClickListener {

    Button b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z, b1, b2, b3, b4, b5;
    ImageView iv1, iv2, iv3;
    TextView tv1, tv2, tv3, tv5,clock;
    int FLAG = 0;
    ImageButton ib;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blevel_18);
        mp=MediaPlayer.create(this,R.raw.pop);


        clock = (TextView)findViewById(R.id.clock);

        CountDownTimer countDownTimer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                mp.start();


                clock.setText(""+millisUntilFinished/1000);

            }

            @Override
            public void onFinish() {


                final Dialog dialog = new Dialog(BLevel_18.this);
                dialog.setContentView(R.layout.mytimer);
                dialog.setTitle("TIMER");
                dialog.setCancelable(true);
                ImageView iv4 = (ImageView)dialog.findViewById(R.id.iv4);
                dialog.show();
                Button ok = (Button)dialog.findViewById(R.id.ok);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(BLevel_18.this, "Got It..!!", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(BLevel_18.this,Bollywood_List.class);
                        startActivity(i);

                        dialog.cancel();
                    }
                });

            }
        }.start();


        ib = (ImageButton)findViewById(R.id.ib);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        f = (Button) findViewById(R.id.f);
        g = (Button) findViewById(R.id.g);
        h = (Button) findViewById(R.id.h);
        j = (Button) findViewById(R.id.j);
        k = (Button) findViewById(R.id.k);
        l = (Button) findViewById(R.id.l);
        m = (Button) findViewById(R.id.m);
        n = (Button) findViewById(R.id.n);
        p = (Button) findViewById(R.id.p);
        q = (Button) findViewById(R.id.q);
        r = (Button) findViewById(R.id.r);
        s = (Button) findViewById(R.id.s);
        t = (Button) findViewById(R.id.t);
        v = (Button) findViewById(R.id.v);
        w = (Button) findViewById(R.id.w);
        x = (Button) findViewById(R.id.x);
        y = (Button) findViewById(R.id.y);
        z = (Button) findViewById(R.id.z);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv5 = (TextView) findViewById(R.id.tv5);
        iv1 = (ImageView) findViewById(R.id.i1);
        iv2 = (ImageView) findViewById(R.id.i2);
        iv3 = (ImageView) findViewById(R.id.i3);
        tv1.setEnabled(false);
        tv2.setEnabled(false);
        tv3.setEnabled(false);
        tv5.setEnabled(false);
        tv2.setText("");
        tv3.setText("");
        tv5.setText("");
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final Dialog dialog = new Dialog(BLevel_18.this);
                dialog.setContentView(R.layout.mydialog);
                dialog.setTitle("HINT");
                dialog.setCancelable(true);
                ImageView iv4 = (ImageView)dialog.findViewById(R.id.iv4);
                iv4.setImageResource(R.drawable.bigbrother);
                dialog.show();
                Button ok = (Button)dialog.findViewById(R.id.ok);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(BLevel_18.this, "Got It..!!", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.z:
                tv2.setText("Z");
                z.setEnabled(false);
                break;
            case R.id.h:
                tv3.setText("H");
                h.setEnabled(false);
                break;
            case R.id.r:
                tv5.setText("R");
                r.setEnabled(false);
                break;
            default:
                v.setEnabled(false);
                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(500);

                if (FLAG == 0) {
                    onShakeImage();
                    iv1.setVisibility(View.VISIBLE);
                    FLAG = 1;
                } else if (FLAG == 1) {
                    onShakeImage();
                    iv2.setVisibility(View.VISIBLE);
                    FLAG = 2;
                } else if (FLAG == 2) {
                    onShakeImage();
                    iv3.setVisibility(View.VISIBLE);
                    mp.stop();
                    Toast.makeText(BLevel_18.this, "GAME OVER..", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(BLevel_18.this, MainActivity.class);
                    startActivity(i);
                }

        }
        if (tv2.getText().toString().equals("Z")
                & tv3.getText().toString().equals("H")
                & tv5.getText().toString().equals("R")) {

            mp.stop();
            Toast.makeText(BLevel_18.this, "Congratulations..!! Level 18 Completed..!!", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(BLevel_18.this, Bollywood_List.class);
            startActivity(i);

        }
    }
    private void onShakeImage() {
        Animation shake;
        shake = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shake);
        if(FLAG==0)
        {
            iv1.setAnimation(shake);

        }
        else if(FLAG==1)
        {
            iv2.setAnimation(shake);

        }
        else if(FLAG==2)
        {
            iv3.setAnimation(shake);
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mp.stop();
    }
}


