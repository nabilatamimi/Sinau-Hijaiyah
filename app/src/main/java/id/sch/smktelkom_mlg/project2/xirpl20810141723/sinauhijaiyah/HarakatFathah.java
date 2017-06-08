package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HarakatFathah extends Activity {

    public ImageView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harakat_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer ca1 = MediaPlayer.create(this, R.raw.ca1);
        ImageButton hijaiyah1 = (ImageButton) findViewById(R.id.hijaiyah1);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a1);
                ca1.start();
            }
        });

        final MediaPlayer ca2 = MediaPlayer.create(this, R.raw.ca2);
        ImageButton hijaiyah2 = (ImageButton) findViewById(R.id.hijaiyah2);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a2);
                ca2.start();
            }
        });

        final MediaPlayer ca3 = MediaPlayer.create(this, R.raw.ca3);
        ImageButton hijaiyah3 = (ImageButton) findViewById(R.id.hijaiyah3);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a3);
                ca3.start();
            }
        });

        final MediaPlayer ca4 = MediaPlayer.create(this, R.raw.ca4);
        ImageButton hijaiyah4 = (ImageButton) findViewById(R.id.hijaiyah4);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a4);
                ca4.start();
            }
        });

        final MediaPlayer ca5 = MediaPlayer.create(this, R.raw.ca5);
        ImageButton hijaiyah5 = (ImageButton) findViewById(R.id.hijaiyah5);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a5);
                ca5.start();
            }
        });

        final MediaPlayer ca6 = MediaPlayer.create(this, R.raw.ca6);
        ImageButton hijaiyah6 = (ImageButton) findViewById(R.id.hijaiyah6);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a6);
                ca6.start();
            }
        });

        final MediaPlayer ca7 = MediaPlayer.create(this, R.raw.ca7);
        ImageButton hijaiyah7 = (ImageButton) findViewById(R.id.hijaiyah7);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a7);
                ca7.start();
            }
        });

        final MediaPlayer ca8 = MediaPlayer.create(this, R.raw.ca8);
        ImageButton hijaiyah8 = (ImageButton) findViewById(R.id.hijaiyah8);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a8);
                ca8.start();
            }
        });

        final MediaPlayer ca9 = MediaPlayer.create(this, R.raw.ca9);
        ImageButton hijaiyah9 = (ImageButton) findViewById(R.id.hijaiyah9);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a9);
                ca9.start();
            }
        });

        final MediaPlayer ca10 = MediaPlayer.create(this, R.raw.ca10);
        ImageButton hijaiyah10 = (ImageButton) findViewById(R.id.hijaiyah10);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a10);
                ca10.start();
            }
        });

        final MediaPlayer ca11 = MediaPlayer.create(this, R.raw.ca11);
        ImageButton hijaiyah11 = (ImageButton) findViewById(R.id.hijaiyah11);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a11);
                ca11.start();
            }
        });

        final MediaPlayer ca12 = MediaPlayer.create(this, R.raw.ca12);
        ImageButton hijaiyah12 = (ImageButton) findViewById(R.id.hijaiyah12);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a12);
                ca12.start();
            }
        });

        final MediaPlayer ca13 = MediaPlayer.create(this, R.raw.ca13);
        ImageButton hijaiyah13 = (ImageButton) findViewById(R.id.hijaiyah13);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a13);
                ca13.start();
            }
        });

        final MediaPlayer ca14 = MediaPlayer.create(this, R.raw.ca14);
        ImageButton hijaiyah14 = (ImageButton) findViewById(R.id.hijaiyah14);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a14);
                ca14.start();
            }
        });

        final MediaPlayer ca15 = MediaPlayer.create(this, R.raw.ca15);
        ImageButton hijaiyah15 = (ImageButton) findViewById(R.id.hijaiyah15);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a15);
                ca15.start();
            }
        });

        final MediaPlayer ca16 = MediaPlayer.create(this, R.raw.ca16);
        ImageButton hijaiyah16 = (ImageButton) findViewById(R.id.hijaiyah16);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a16);
                ca16.start();
            }
        });

        final MediaPlayer ca17 = MediaPlayer.create(this, R.raw.ca17);
        ImageButton hijaiyah17 = (ImageButton) findViewById(R.id.hijaiyah17);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a17);
                ca17.start();
            }
        });

        final MediaPlayer ca18 = MediaPlayer.create(this, R.raw.ca18);
        ImageButton hijaiyah18 = (ImageButton) findViewById(R.id.hijaiyah18);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a18);
                ca18.start();
            }
        });

        final MediaPlayer ca19 = MediaPlayer.create(this, R.raw.ca19);
        ImageButton hijaiyah19 = (ImageButton) findViewById(R.id.hijaiyah19);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a19);
                ca19.start();
            }
        });

        final MediaPlayer ca20 = MediaPlayer.create(this, R.raw.ca20);
        ImageButton hijaiyah20 = (ImageButton) findViewById(R.id.hijaiyah20);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a20);
                ca20.start();
            }
        });

        final MediaPlayer ca21 = MediaPlayer.create(this, R.raw.ca21);
        ImageButton hijaiyah21 = (ImageButton) findViewById(R.id.hijaiyah21);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a21);
                ca21.start();
            }
        });

        final MediaPlayer ca22 = MediaPlayer.create(this, R.raw.ca22);
        ImageButton hijaiyah22 = (ImageButton) findViewById(R.id.hijaiyah22);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a22);
                ca22.start();
            }
        });

        final MediaPlayer ca23 = MediaPlayer.create(this, R.raw.ca23);
        ImageButton hijaiyah23 = (ImageButton) findViewById(R.id.hijaiyah23);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a23);
                ca23.start();
            }
        });

        final MediaPlayer ca24 = MediaPlayer.create(this, R.raw.ca24);
        ImageButton hijaiyah24 = (ImageButton) findViewById(R.id.hijaiyah24);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a24);
                ca24.start();
            }
        });

        final MediaPlayer ca25 = MediaPlayer.create(this, R.raw.ca25);
        ImageButton hijaiyah25 = (ImageButton) findViewById(R.id.hijaiyah25);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a25);
                ca25.start();
            }
        });

        final MediaPlayer ca26 = MediaPlayer.create(this, R.raw.ca26);
        ImageButton hijaiyah26 = (ImageButton) findViewById(R.id.hijaiyah26);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a26);
                ca26.start();
            }
        });

        final MediaPlayer ca27 = MediaPlayer.create(this, R.raw.ca27);
        ImageButton hijaiyah27 = (ImageButton) findViewById(R.id.hijaiyah27);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a27);
                ca27.start();
            }
        });

        final MediaPlayer ca28 = MediaPlayer.create(this, R.raw.ca28);
        ImageButton hijaiyah28 = (ImageButton) findViewById(R.id.hijaiyah28);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a28);
                ca28.start();
            }
        });

        final MediaPlayer ca29 = MediaPlayer.create(this, R.raw.ca29);
        ImageButton hijaiyah29 = (ImageButton) findViewById(R.id.hijaiyah29);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a29);
                ca29.start();
            }
        });

        final MediaPlayer ca30 = MediaPlayer.create(this, R.raw.ca30);
        ImageButton hijaiyah30 = (ImageButton) findViewById(R.id.hijaiyah30);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a30);
                ca30.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(HarakatFathah.this, Activity.class);
                startActivity(intentpindah);
            }
        });

    }
}
