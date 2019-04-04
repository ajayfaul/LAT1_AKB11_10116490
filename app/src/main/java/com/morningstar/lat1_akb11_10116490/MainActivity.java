package com.morningstar.lat1_akb11_10116490;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 * Created Bye
 *
 * NIM     : 10116490
 * Nama    : Muhammad Fajar Maulana
 * Kelas   : IF-11 / AKB-11
 * Tanggal : 3-April-2019
 *
 * */
public class MainActivity extends AppCompatActivity {

    Button btn_Mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_Mulai = (Button) findViewById(R.id.btnMulai);
        btn_Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginCode.class);
                startActivity(i);
            }
        });
    }

}
