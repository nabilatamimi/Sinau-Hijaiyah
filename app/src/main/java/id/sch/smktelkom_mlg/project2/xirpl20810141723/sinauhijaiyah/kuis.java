package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class kuis extends Activity {

    public ImageView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton ch30 = (ImageButton) findViewById(R.id.kuis3);
        preview = (ImageView) findViewById(R.id.hasil);
        ch30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.yes);
            }
        });

        final MediaPlayer ch9 = MediaPlayer.create(this, R.raw.salah);
        ImageButton salah1 = (ImageButton) this.findViewById(R.id.kuis1);
        salah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch9.start();
            }
        });

        final MediaPlayer ch11 = MediaPlayer.create(this, R.raw.salah);
        ImageButton salah2 = (ImageButton) this.findViewById(R.id.kuis2);
        salah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch11.start();
            }
        });

        final MediaPlayer play = MediaPlayer.create(this, R.raw.ch30);
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
                Intent intentpindah = new Intent(kuis.this, kuis1.class);
                startActivity(intentpindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(kuis.this, Activity.class);
                startActivity(intentpindah);
            }
        });

    }
}
