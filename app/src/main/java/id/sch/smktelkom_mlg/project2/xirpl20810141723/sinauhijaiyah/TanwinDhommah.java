package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TanwinDhommah extends Activity {

    public ImageView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_dhommah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer cun1 = MediaPlayer.create(this, R.raw.cun1);
        ImageButton hijaiyah1 = (ImageButton) findViewById(R.id.hijaiyah1);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un1);
                cun1.start();
            }
        });

        final MediaPlayer cun2 = MediaPlayer.create(this, R.raw.cun2);
        ImageButton hijaiyah2 = (ImageButton) findViewById(R.id.hijaiyah2);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un2);
                cun2.start();
            }
        });

        final MediaPlayer cun3 = MediaPlayer.create(this, R.raw.cun3);
        ImageButton hijaiyah3 = (ImageButton) findViewById(R.id.hijaiyah3);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un3);
                cun3.start();
            }
        });

        final MediaPlayer cun4 = MediaPlayer.create(this, R.raw.cun4);
        ImageButton hijaiyah4 = (ImageButton) findViewById(R.id.hijaiyah4);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un4);
                cun4.start();
            }
        });

        final MediaPlayer cun5 = MediaPlayer.create(this, R.raw.cun5);
        ImageButton hijaiyah5 = (ImageButton) findViewById(R.id.hijaiyah5);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un5);
                cun5.start();
            }
        });

        final MediaPlayer cun6 = MediaPlayer.create(this, R.raw.cun6);
        ImageButton hijaiyah6 = (ImageButton) findViewById(R.id.hijaiyah6);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un6);
                cun6.start();
            }
        });

        final MediaPlayer cun7 = MediaPlayer.create(this, R.raw.cun7);
        ImageButton hijaiyah7 = (ImageButton) findViewById(R.id.hijaiyah7);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un7);
                cun7.start();
            }
        });

        final MediaPlayer cun8 = MediaPlayer.create(this, R.raw.cun8);
        ImageButton hijaiyah8 = (ImageButton) findViewById(R.id.hijaiyah8);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un8);
                cun8.start();
            }
        });

        final MediaPlayer cun9 = MediaPlayer.create(this, R.raw.cun9);
        ImageButton hijaiyah9 = (ImageButton) findViewById(R.id.hijaiyah9);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un9);
                cun9.start();
            }
        });

        final MediaPlayer cun10 = MediaPlayer.create(this, R.raw.cun10);
        ImageButton hijaiyah10 = (ImageButton) findViewById(R.id.hijaiyah10);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un10);
                cun10.start();
            }
        });

        final MediaPlayer cun11 = MediaPlayer.create(this, R.raw.cun11);
        ImageButton hijaiyah11 = (ImageButton) findViewById(R.id.hijaiyah11);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un11);
                cun11.start();
            }
        });

        final MediaPlayer cun12 = MediaPlayer.create(this, R.raw.cun12);
        ImageButton hijaiyah12 = (ImageButton) findViewById(R.id.hijaiyah12);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un12);
                cun12.start();
            }
        });

        final MediaPlayer cun13 = MediaPlayer.create(this, R.raw.cun13);
        ImageButton hijaiyah13 = (ImageButton) findViewById(R.id.hijaiyah13);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un13);
                cun13.start();
            }
        });

        final MediaPlayer cun14 = MediaPlayer.create(this, R.raw.cun14);
        ImageButton hijaiyah14 = (ImageButton) findViewById(R.id.hijaiyah14);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un14);
                cun14.start();
            }
        });

        final MediaPlayer cun15 = MediaPlayer.create(this, R.raw.cun15);
        ImageButton hijaiyah15 = (ImageButton) findViewById(R.id.hijaiyah15);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un15);
                cun15.start();
            }
        });

        final MediaPlayer cun16 = MediaPlayer.create(this, R.raw.cun16);
        ImageButton hijaiyah16 = (ImageButton) findViewById(R.id.hijaiyah16);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un16);
                cun16.start();
            }
        });

        final MediaPlayer cun17 = MediaPlayer.create(this, R.raw.cun17);
        ImageButton hijaiyah17 = (ImageButton) findViewById(R.id.hijaiyah17);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un17);
                cun17.start();
            }
        });

        final MediaPlayer cun18 = MediaPlayer.create(this, R.raw.cun18);
        ImageButton hijaiyah18 = (ImageButton) findViewById(R.id.hijaiyah18);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un18);
                cun18.start();
            }
        });

        final MediaPlayer cun19 = MediaPlayer.create(this, R.raw.cun19);
        ImageButton hijaiyah19 = (ImageButton) findViewById(R.id.hijaiyah19);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un19);
                cun19.start();
            }
        });

        final MediaPlayer cun20 = MediaPlayer.create(this, R.raw.cun20);
        ImageButton hijaiyah20 = (ImageButton) findViewById(R.id.hijaiyah20);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un20);
                cun20.start();
            }
        });

        final MediaPlayer cun21 = MediaPlayer.create(this, R.raw.cun21);
        ImageButton hijaiyah21 = (ImageButton) findViewById(R.id.hijaiyah21);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un21);
                cun21.start();
            }
        });

        final MediaPlayer cun22 = MediaPlayer.create(this, R.raw.cun22);
        ImageButton hijaiyah22 = (ImageButton) findViewById(R.id.hijaiyah22);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un22);
                cun22.start();
            }
        });

        final MediaPlayer cun23 = MediaPlayer.create(this, R.raw.cun23);
        ImageButton hijaiyah23 = (ImageButton) findViewById(R.id.hijaiyah23);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un23);
                cun23.start();
            }
        });

        final MediaPlayer cun24 = MediaPlayer.create(this, R.raw.cun24);
        ImageButton hijaiyah24 = (ImageButton) findViewById(R.id.hijaiyah24);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un24);
                cun24.start();
            }
        });

        final MediaPlayer cun25 = MediaPlayer.create(this, R.raw.cun25);
        ImageButton hijaiyah25 = (ImageButton) findViewById(R.id.hijaiyah25);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un25);
                cun25.start();
            }
        });

        final MediaPlayer cun26 = MediaPlayer.create(this, R.raw.cun26);
        ImageButton hijaiyah26 = (ImageButton) findViewById(R.id.hijaiyah26);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un26);
                cun26.start();
            }
        });

        final MediaPlayer cun27 = MediaPlayer.create(this, R.raw.cun27);
        ImageButton hijaiyah27 = (ImageButton) findViewById(R.id.hijaiyah27);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un27);
                cun27.start();
            }
        });

        final MediaPlayer cun28 = MediaPlayer.create(this, R.raw.cun28);
        ImageButton hijaiyah28 = (ImageButton) findViewById(R.id.hijaiyah28);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un28);
                cun28.start();
            }
        });

        final MediaPlayer cun29 = MediaPlayer.create(this, R.raw.cun29);
        ImageButton hijaiyah29 = (ImageButton) findViewById(R.id.hijaiyah29);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un29);
                cun29.start();
            }
        });

        final MediaPlayer cun30 = MediaPlayer.create(this, R.raw.cun30);
        ImageButton hijaiyah30 = (ImageButton) findViewById(R.id.hijaiyah30);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.un30);
                cun30.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(TanwinDhommah.this, Activity.class);
                startActivity(intentpindah);
            }
        });

    }
}
