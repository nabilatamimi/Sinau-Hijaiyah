package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BelajarHijaiyah extends Activity {

    public ImageView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_hijaiyah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer ch1 = MediaPlayer.create(this, R.raw.ch1);
        ImageButton hijaiyah1 = (ImageButton) findViewById(R.id.hijaiyah1);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h1);
                ch1.start();
            }
        });

        final MediaPlayer ch2 = MediaPlayer.create(this, R.raw.ch2);
        ImageButton hijaiyah2 = (ImageButton) findViewById(R.id.hijaiyah2);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h2);
                ch2.start();
            }
        });

        final MediaPlayer ch3 = MediaPlayer.create(this, R.raw.ch3);
        ImageButton hijaiyah3 = (ImageButton) findViewById(R.id.hijaiyah3);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h3);
                ch3.start();
            }
        });

        final MediaPlayer ch4 = MediaPlayer.create(this, R.raw.ch4);
        ImageButton hijaiyah4 = (ImageButton) findViewById(R.id.hijaiyah4);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h4);
                ch4.start();
            }
        });

        final MediaPlayer ch5 = MediaPlayer.create(this, R.raw.ch5);
        ImageButton hijaiyah5 = (ImageButton) findViewById(R.id.hijaiyah5);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h5);
                ch5.start();
            }
        });

        final MediaPlayer ch6 = MediaPlayer.create(this, R.raw.ch6);
        ImageButton hijaiyah6 = (ImageButton) findViewById(R.id.hijaiyah6);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h6);
                ch6.start();
            }
        });

        final MediaPlayer ch7 = MediaPlayer.create(this, R.raw.ch7);
        ImageButton hijaiyah7 = (ImageButton) findViewById(R.id.hijaiyah7);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h7);
                ch7.start();
            }
        });

        final MediaPlayer ch8 = MediaPlayer.create(this, R.raw.ch8);
        ImageButton hijaiyah8 = (ImageButton) findViewById(R.id.hijaiyah8);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h8);
                ch8.start();
            }
        });

        final MediaPlayer ch9 = MediaPlayer.create(this, R.raw.ch9);
        ImageButton hijaiyah9 = (ImageButton) findViewById(R.id.hijaiyah9);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h9);
                ch9.start();
            }
        });

        final MediaPlayer ch10 = MediaPlayer.create(this, R.raw.ch10);
        ImageButton hijaiyah10 = (ImageButton) findViewById(R.id.hijaiyah10);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h10);
                ch10.start();
            }
        });

        final MediaPlayer ch11 = MediaPlayer.create(this, R.raw.ch11);
        ImageButton hijaiyah11 = (ImageButton) findViewById(R.id.hijaiyah11);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h11);
                ch11.start();
            }
        });

        final MediaPlayer ch12 = MediaPlayer.create(this, R.raw.ch12);
        ImageButton hijaiyah12 = (ImageButton) findViewById(R.id.hijaiyah12);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h12);
                ch12.start();
            }
        });

        final MediaPlayer ch13 = MediaPlayer.create(this, R.raw.ch13);
        ImageButton hijaiyah13 = (ImageButton) findViewById(R.id.hijaiyah13);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h13);
                ch13.start();
            }
        });

        final MediaPlayer ch14 = MediaPlayer.create(this, R.raw.ch14);
        ImageButton hijaiyah14 = (ImageButton) findViewById(R.id.hijaiyah14);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h14);
                ch14.start();
            }
        });

        final MediaPlayer ch15 = MediaPlayer.create(this, R.raw.ch15);
        ImageButton hijaiyah15 = (ImageButton) findViewById(R.id.hijaiyah15);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h15);
                ch15.start();
            }
        });

        final MediaPlayer ch16 = MediaPlayer.create(this, R.raw.ch16);
        ImageButton hijaiyah16 = (ImageButton) findViewById(R.id.hijaiyah16);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h16);
                ch16.start();
            }
        });

        final MediaPlayer ch17 = MediaPlayer.create(this, R.raw.ch17);
        ImageButton hijaiyah17 = (ImageButton) findViewById(R.id.hijaiyah17);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h17);
                ch17.start();
            }
        });

        final MediaPlayer ch18 = MediaPlayer.create(this, R.raw.ch18);
        ImageButton hijaiyah18 = (ImageButton) findViewById(R.id.hijaiyah18);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h18);
                ch18.start();
            }
        });

        final MediaPlayer ch19 = MediaPlayer.create(this, R.raw.ch19);
        ImageButton hijaiyah19 = (ImageButton) findViewById(R.id.hijaiyah19);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h19);
                ch19.start();
            }
        });

        final MediaPlayer ch20 = MediaPlayer.create(this, R.raw.ch20);
        ImageButton hijaiyah20 = (ImageButton) findViewById(R.id.hijaiyah20);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h20);
                ch20.start();
            }
        });

        final MediaPlayer ch21 = MediaPlayer.create(this, R.raw.ch21);
        ImageButton hijaiyah21 = (ImageButton) findViewById(R.id.hijaiyah21);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h21);
                ch21.start();
            }
        });

        final MediaPlayer ch22 = MediaPlayer.create(this, R.raw.ch22);
        ImageButton hijaiyah22 = (ImageButton) findViewById(R.id.hijaiyah22);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h22);
                ch22.start();
            }
        });

        final MediaPlayer ch23 = MediaPlayer.create(this, R.raw.ch23);
        ImageButton hijaiyah23 = (ImageButton) findViewById(R.id.hijaiyah23);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h23);
                ch23.start();
            }
        });

        final MediaPlayer ch24 = MediaPlayer.create(this, R.raw.ch24);
        ImageButton hijaiyah24 = (ImageButton) findViewById(R.id.hijaiyah24);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h24);
                ch24.start();
            }
        });

        final MediaPlayer ch25 = MediaPlayer.create(this, R.raw.ch25);
        ImageButton hijaiyah25 = (ImageButton) findViewById(R.id.hijaiyah25);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h25);
                ch25.start();
            }
        });

        final MediaPlayer ch26 = MediaPlayer.create(this, R.raw.ch26);
        ImageButton hijaiyah26 = (ImageButton) findViewById(R.id.hijaiyah26);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h26);
                ch26.start();
            }
        });

        final MediaPlayer ch27 = MediaPlayer.create(this, R.raw.ch27);
        ImageButton hijaiyah27 = (ImageButton) findViewById(R.id.hijaiyah27);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h27);
                ch27.start();
            }
        });

        final MediaPlayer ch28 = MediaPlayer.create(this, R.raw.ch28);
        ImageButton hijaiyah28 = (ImageButton) findViewById(R.id.hijaiyah28);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h28);
                ch28.start();
            }
        });

        final MediaPlayer ch29 = MediaPlayer.create(this, R.raw.ch29);
        ImageButton hijaiyah29 = (ImageButton) findViewById(R.id.hijaiyah29);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h29);
                ch29.start();
            }
        });

        final MediaPlayer ch30 = MediaPlayer.create(this, R.raw.ch30);
        ImageButton hijaiyah30 = (ImageButton) findViewById(R.id.hijaiyah30);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.h30);
                ch30.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(BelajarHijaiyah.this, Activity.class);
                startActivity(intentpindah);
            }
        });

    }
}
