package com.morningstar.pretest_akb11_10116490;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
 * NIM     : 10116490
 * Nama    : Muhammad Fajar Maulana
 * Kelas   : IF-11 / AKB-11
 * Tanggal : 3-April-2019
 *
 * */
public class Sayhai extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String nama;
    TextView textSayHai;
    Button btn_SayHai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhai);

        textSayHai = (TextView) findViewById(R.id.txtSayhai);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        textSayHai.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunan HP mu tiap hari buat bantu kamu ngatur waktu :)");

        btn_SayHai = (Button) findViewById(R.id.Oke);
        btn_SayHai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sayhai.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
