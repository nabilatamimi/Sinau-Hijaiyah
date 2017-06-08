package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HarakatDhommah extends Activity {

    public ImageView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harakat_dhommah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer cu1 = MediaPlayer.create(this, R.raw.cu1);
        ImageButton hijaiyah1 = (ImageButton) findViewById(R.id.hijaiyah1);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u1);
                cu1.start();
            }
        });

        final MediaPlayer cu2 = MediaPlayer.create(this, R.raw.cu2);
        ImageButton hijaiyah2 = (ImageButton) findViewById(R.id.hijaiyah2);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u2);
                cu2.start();
            }
        });

        final MediaPlayer cu3 = MediaPlayer.create(this, R.raw.cu3);
        ImageButton hijaiyah3 = (ImageButton) findViewById(R.id.hijaiyah3);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u3);
                cu3.start();
            }
        });

        final MediaPlayer cu4 = MediaPlayer.create(this, R.raw.cu4);
        ImageButton hijaiyah4 = (ImageButton) findViewById(R.id.hijaiyah4);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u4);
                cu4.start();
            }
        });

        final MediaPlayer cu5 = MediaPlayer.create(this, R.raw.cu5);
        ImageButton hijaiyah5 = (ImageButton) findViewById(R.id.hijaiyah5);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u5);
                cu5.start();
            }
        });

        final MediaPlayer cu6 = MediaPlayer.create(this, R.raw.cu6);
        ImageButton hijaiyah6 = (ImageButton) findViewById(R.id.hijaiyah6);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u6);
                cu6.start();
            }
        });

        final MediaPlayer cu7 = MediaPlayer.create(this, R.raw.cu7);
        ImageButton hijaiyah7 = (ImageButton) findViewById(R.id.hijaiyah7);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u7);
                cu7.start();
            }
        });

        final MediaPlayer cu8 = MediaPlayer.create(this, R.raw.cu8);
        ImageButton hijaiyah8 = (ImageButton) findViewById(R.id.hijaiyah8);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u8);
                cu8.start();
            }
        });

        final MediaPlayer cu9 = MediaPlayer.create(this, R.raw.cu9);
        ImageButton hijaiyah9 = (ImageButton) findViewById(R.id.hijaiyah9);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u9);
                cu9.start();
            }
        });

        final MediaPlayer cu10 = MediaPlayer.create(this, R.raw.cu10);
        ImageButton hijaiyah10 = (ImageButton) findViewById(R.id.hijaiyah10);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u10);
                cu10.start();
            }
        });

        final MediaPlayer cu11 = MediaPlayer.create(this, R.raw.cu11);
        ImageButton hijaiyah11 = (ImageButton) findViewById(R.id.hijaiyah11);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u11);
                cu11.start();
            }
        });

        final MediaPlayer cu12 = MediaPlayer.create(this, R.raw.cu12);
        ImageButton hijaiyah12 = (ImageButton) findViewById(R.id.hijaiyah12);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u12);
                cu12.start();
            }
        });

        final MediaPlayer cu13 = MediaPlayer.create(this, R.raw.cu13);
        ImageButton hijaiyah13 = (ImageButton) findViewById(R.id.hijaiyah13);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u13);
                cu13.start();
            }
        });

        final MediaPlayer cu14 = MediaPlayer.create(this, R.raw.cu14);
        ImageButton hijaiyah14 = (ImageButton) findViewById(R.id.hijaiyah14);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u14);
                cu14.start();
            }
        });

        final MediaPlayer cu15 = MediaPlayer.create(this, R.raw.cu15);
        ImageButton hijaiyah15 = (ImageButton) findViewById(R.id.hijaiyah15);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u15);
                cu15.start();
            }
        });

        final MediaPlayer cu16 = MediaPlayer.create(this, R.raw.cu16);
        ImageButton hijaiyah16 = (ImageButton) findViewById(R.id.hijaiyah16);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u16);
                cu16.start();
            }
        });

        final MediaPlayer cu17 = MediaPlayer.create(this, R.raw.cu17);
        ImageButton hijaiyah17 = (ImageButton) findViewById(R.id.hijaiyah17);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u17);
                cu17.start();
            }
        });

        final MediaPlayer cu18 = MediaPlayer.create(this, R.raw.cu18);
        ImageButton hijaiyah18 = (ImageButton) findViewById(R.id.hijaiyah18);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u18);
                cu18.start();
            }
        });

        final MediaPlayer cu19 = MediaPlayer.create(this, R.raw.cu19);
        ImageButton hijaiyah19 = (ImageButton) findViewById(R.id.hijaiyah19);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u19);
                cu19.start();
            }
        });

        final MediaPlayer cu20 = MediaPlayer.create(this, R.raw.cu20);
        ImageButton hijaiyah20 = (ImageButton) findViewById(R.id.hijaiyah20);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u20);
                cu20.start();
            }
        });

        final MediaPlayer cu21 = MediaPlayer.create(this, R.raw.cu21);
        ImageButton hijaiyah21 = (ImageButton) findViewById(R.id.hijaiyah21);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u21);
                cu21.start();
            }
        });

        final MediaPlayer cu22 = MediaPlayer.create(this, R.raw.cu22);
        ImageButton hijaiyah22 = (ImageButton) findViewById(R.id.hijaiyah22);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u22);
                cu22.start();
            }
        });

        final MediaPlayer cu23 = MediaPlayer.create(this, R.raw.cu23);
        ImageButton hijaiyah23 = (ImageButton) findViewById(R.id.hijaiyah23);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u23);
                cu23.start();
            }
        });

        final MediaPlayer cu24 = MediaPlayer.create(this, R.raw.cu24);
        ImageButton hijaiyah24 = (ImageButton) findViewById(R.id.hijaiyah24);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u24);
                cu24.start();
            }
        });

        final MediaPlayer cu25 = MediaPlayer.create(this, R.raw.cu25);
        ImageButton hijaiyah25 = (ImageButton) findViewById(R.id.hijaiyah25);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u25);
                cu25.start();
            }
        });

        final MediaPlayer cu26 = MediaPlayer.create(this, R.raw.cu26);
        ImageButton hijaiyah26 = (ImageButton) findViewById(R.id.hijaiyah26);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u26);
                cu26.start();
            }
        });

        final MediaPlayer cu27 = MediaPlayer.create(this, R.raw.cu27);
        ImageButton hijaiyah27 = (ImageButton) findViewById(R.id.hijaiyah27);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u27);
                cu27.start();
            }
        });

        final MediaPlayer cu28 = MediaPlayer.create(this, R.raw.cu28);
        ImageButton hijaiyah28 = (ImageButton) findViewById(R.id.hijaiyah28);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u28);
                cu28.start();
            }
        });

        final MediaPlayer cu29 = MediaPlayer.create(this, R.raw.cu29);
        ImageButton hijaiyah29 = (ImageButton) findViewById(R.id.hijaiyah29);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u29);
                cu29.start();
            }
        });

        final MediaPlayer cu30 = MediaPlayer.create(this, R.raw.cu30);
        ImageButton hijaiyah30 = (ImageButton) findViewById(R.id.hijaiyah30);
        preview = (ImageView) findViewById(R.id.previewHijaiyah);
        hijaiyah30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u30);
                cu30.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(HarakatDhommah.this, Activity.class);
                startActivity(intentpindah);
            }
        });

    }
}
