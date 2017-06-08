package id.sch.smktelkom_mlg.project2.xirpl20810141723.sinauhijaiyah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BelajarHarakat extends Activity {

    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_harakat);


        pindah = (ImageButton) findViewById(R.id.fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IntenPindah = new Intent(BelajarHarakat.this, HarakatFathah.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.kasrah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IntenPindah = new Intent(BelajarHarakat.this, HarakatKasrah.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.dhommah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IntenPindah = new Intent(BelajarHarakat.this, HarakatDhommah.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(BelajarHarakat.this, Activity.class);
                startActivity(intentpindah);
            }
        });
    }
}
