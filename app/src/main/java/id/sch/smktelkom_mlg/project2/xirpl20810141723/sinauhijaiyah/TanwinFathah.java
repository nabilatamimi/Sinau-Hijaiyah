package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TanwinFathah extends Activity {

    public ImageView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer can1 = MediaPlayer.create(this, R.raw.can1);
        ImageButton hijaiyah1 = (ImageButton) findViewById(R.id.hijaiyah1);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an1);
                can1.start();
            }
        });

        final MediaPlayer can2 = MediaPlayer.create(this, R.raw.can2);
        ImageButton hijaiyah2 = (ImageButton) findViewById(R.id.hijaiyah2);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an2);
                can2.start();
            }
        });

        final MediaPlayer can3 = MediaPlayer.create(this, R.raw.can3);
        ImageButton hijaiyah3 = (ImageButton) findViewById(R.id.hijaiyah3);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an3);
                can3.start();
            }
        });

        final MediaPlayer can4 = MediaPlayer.create(this, R.raw.can4);
        ImageButton hijaiyah4 = (ImageButton) findViewById(R.id.hijaiyah4);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an4);
                can4.start();
            }
        });

        final MediaPlayer can5 = MediaPlayer.create(this, R.raw.can5);
        ImageButton hijaiyah5 = (ImageButton) findViewById(R.id.hijaiyah5);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an5);
                can5.start();
            }
        });

        final MediaPlayer can6 = MediaPlayer.create(this, R.raw.can6);
        ImageButton hijaiyah6 = (ImageButton) findViewById(R.id.hijaiyah6);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an6);
                can6.start();
            }
        });

        final MediaPlayer can7 = MediaPlayer.create(this, R.raw.can7);
        ImageButton hijaiyah7 = (ImageButton) findViewById(R.id.hijaiyah7);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an7);
                can7.start();
            }
        });

        final MediaPlayer can8 = MediaPlayer.create(this, R.raw.can8);
        ImageButton hijaiyah8 = (ImageButton) findViewById(R.id.hijaiyah8);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an8);
                can8.start();
            }
        });

        final MediaPlayer can9 = MediaPlayer.create(this, R.raw.can9);
        ImageButton hijaiyah9 = (ImageButton) findViewById(R.id.hijaiyah9);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an9);
                can9.start();
            }
        });

        final MediaPlayer can10 = MediaPlayer.create(this, R.raw.can10);
        ImageButton hijaiyah10 = (ImageButton) findViewById(R.id.hijaiyah10);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an10);
                can10.start();
            }
        });

        final MediaPlayer can11 = MediaPlayer.create(this, R.raw.can11);
        ImageButton hijaiyah11 = (ImageButton) findViewById(R.id.hijaiyah11);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an11);
                can11.start();
            }
        });

        final MediaPlayer can12 = MediaPlayer.create(this, R.raw.can12);
        ImageButton hijaiyah12 = (ImageButton) findViewById(R.id.hijaiyah12);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an12);
                can12.start();
            }
        });

        final MediaPlayer can13 = MediaPlayer.create(this, R.raw.can13);
        ImageButton hijaiyah13 = (ImageButton) findViewById(R.id.hijaiyah13);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an13);
                can13.start();
            }
        });

        final MediaPlayer can14 = MediaPlayer.create(this, R.raw.can14);
        ImageButton hijaiyah14 = (ImageButton) findViewById(R.id.hijaiyah14);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an14);
                can14.start();
            }
        });

        final MediaPlayer can15 = MediaPlayer.create(this, R.raw.can15);
        ImageButton hijaiyah15 = (ImageButton) findViewById(R.id.hijaiyah15);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an15);
                can15.start();
            }
        });

        final MediaPlayer can16 = MediaPlayer.create(this, R.raw.can16);
        ImageButton hijaiyah16 = (ImageButton) findViewById(R.id.hijaiyah16);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an16);
                can16.start();
            }
        });

        final MediaPlayer can17 = MediaPlayer.create(this, R.raw.can17);
        ImageButton hijaiyah17 = (ImageButton) findViewById(R.id.hijaiyah17);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an17);
                can17.start();
            }
        });

        final MediaPlayer can18 = MediaPlayer.create(this, R.raw.can18);
        ImageButton hijaiyah18 = (ImageButton) findViewById(R.id.hijaiyah18);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an18);
                can18.start();
            }
        });

        final MediaPlayer can19 = MediaPlayer.create(this, R.raw.can19);
        ImageButton hijaiyah19 = (ImageButton) findViewById(R.id.hijaiyah19);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an19);
                can19.start();
            }
        });

        final MediaPlayer can20 = MediaPlayer.create(this, R.raw.can20);
        ImageButton hijaiyah20 = (ImageButton) findViewById(R.id.hijaiyah20);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an20);
                can20.start();
            }
        });

        final MediaPlayer can21 = MediaPlayer.create(this, R.raw.can21);
        ImageButton hijaiyah21 = (ImageButton) findViewById(R.id.hijaiyah21);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an21);
                can21.start();
            }
        });

        final MediaPlayer can22 = MediaPlayer.create(this, R.raw.can22);
        ImageButton hijaiyah22 = (ImageButton) findViewById(R.id.hijaiyah22);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an22);
                can22.start();
            }
        });

        final MediaPlayer can23 = MediaPlayer.create(this, R.raw.can23);
        ImageButton hijaiyah23 = (ImageButton) findViewById(R.id.hijaiyah23);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an23);
                can23.start();
            }
        });

        final MediaPlayer can24 = MediaPlayer.create(this, R.raw.can24);
        ImageButton hijaiyah24 = (ImageButton) findViewById(R.id.hijaiyah24);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an24);
                can24.start();
            }
        });

        final MediaPlayer can25 = MediaPlayer.create(this, R.raw.can25);
        ImageButton hijaiyah25 = (ImageButton) findViewById(R.id.hijaiyah25);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an25);
                can25.start();
            }
        });

        final MediaPlayer can26 = MediaPlayer.create(this, R.raw.can26);
        ImageButton hijaiyah26 = (ImageButton) findViewById(R.id.hijaiyah26);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an26);
                can26.start();
            }
        });

        final MediaPlayer can27 = MediaPlayer.create(this, R.raw.can27);
        ImageButton hijaiyah27 = (ImageButton) findViewById(R.id.hijaiyah27);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an27);
                can27.start();
            }
        });

        final MediaPlayer can28 = MediaPlayer.create(this, R.raw.can28);
        ImageButton hijaiyah28 = (ImageButton) findViewById(R.id.hijaiyah28);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an28);
                can28.start();
            }
        });

        final MediaPlayer can29 = MediaPlayer.create(this, R.raw.can29);
        ImageButton hijaiyah29 = (ImageButton) findViewById(R.id.hijaiyah29);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an29);
                can29.start();
            }
        });

        final MediaPlayer can30 = MediaPlayer.create(this, R.raw.can30);
        ImageButton hijaiyah30 = (ImageButton) findViewById(R.id.hijaiyah30);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.an30);
                can30.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(TanwinFathah.this, Activity.class);
                startActivity(intentpindah);
            }
        });

    }
}
