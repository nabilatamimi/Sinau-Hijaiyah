package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BelajarTanwin extends Activity {

    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_tanwin);


        pindah = (ImageButton) findViewById(R.id.ftain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IntenPindah = new Intent(BelajarTanwin.this, TanwinFathah.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.ktain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IntenPindah = new Intent(BelajarTanwin.this, TanwinKasrah.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.dtain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IntenPindah = new Intent(BelajarTanwin.this, TanwinDhommah.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(BelajarTanwin.this, Activity.class);
                startActivity(intentpindah);
            }
        });
    }
}
