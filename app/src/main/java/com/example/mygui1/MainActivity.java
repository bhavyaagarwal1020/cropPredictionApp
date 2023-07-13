package com.example.mygui1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     TextView abt;
     Button btn;

        btn = findViewById(R.id.btn);
        abt = findViewById(R.id.abt);

        EditText nc, pc, kc, tc, hc, phc, rc;

        nc = findViewById(R.id.nc);
        pc = findViewById(R.id.pc);
        kc = findViewById(R.id.kc);
        tc = findViewById(R.id.tc);
        hc = findViewById(R.id.hc);
        phc = findViewById(R.id.phc);
        rc = findViewById(R.id.rc);


        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1;
                i1 = new Intent(MainActivity.this, Detailofapp.class);
                startActivity(i1);

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  phcc, tcc, hcc, rcc,ncc, pcc, kcc;
                ncc = Double.parseDouble(nc.getText().toString().trim());
                pcc = Double.parseDouble(pc.getText().toString().trim());
                kcc = Double.parseDouble(kc.getText().toString().trim());
                tcc = Double.parseDouble(tc.getText().toString().trim());
                hcc = Double.parseDouble(hc.getText().toString().trim());
                phcc = Double.parseDouble(phc.getText().toString().trim());
                rcc = Double.parseDouble(rc.getText().toString().trim());



                Intent i2;

                i2 = new Intent(MainActivity.this, Predictionpage.class);
                i2.putExtra("Nitrogen Content", ncc);
                i2.putExtra("Phosphorus Content", pcc);
                i2.putExtra("Potassium Content", kcc);
                i2.putExtra("Temperature", tcc);
                i2.putExtra("Humidity", hcc);
                i2.putExtra("pH of soil", phcc);
                i2.putExtra("Rainfall", rcc);

                startActivity(i2);
            }
        });
    }
}