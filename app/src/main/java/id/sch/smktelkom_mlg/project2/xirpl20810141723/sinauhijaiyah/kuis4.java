package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class kuis4 extends Activity {

    public ImageView preview;
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis4);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton can23 = (ImageButton) findViewById(R.id.kuis3);
        preview = (ImageView) findViewById(R.id.hasil);
        can23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.yes);
            }
        });

        final MediaPlayer can10 = MediaPlayer.create(this, R.raw.salah);
        ImageButton salah1 = (ImageButton) this.findViewById(R.id.kuis1);
        salah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                can10.start();
            }
        });

        final MediaPlayer can17 = MediaPlayer.create(this, R.raw.salah);
        ImageButton salah2 = (ImageButton) this.findViewById(R.id.kuis2);
        salah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                can17.start();
            }
        });

        final MediaPlayer play = MediaPlayer.create(this, R.raw.can23);
        ImageButton player = (ImageButton) this.findViewById(R.id.playkuis);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.next);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(kuis4.this, kuis5.class);
                startActivity(intentpindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(kuis4.this, kuis3.class);
                startActivity(intentpindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(kuis4.this, Activity.class);
                startActivity(intentpindah);
            }
        });

    }
}
