package com.morningstar.lat1_akb11_10116490;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
 * Created bye
 *
 * NIM     : 10116490
 * Nama    : Muhammad Fajar Maulana
 * Kelas   : IF-11 / AKB-11
 * Tanggal : 4-April-2019
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
                Intent intent = new Intent(Sayhai.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });
    }
}
