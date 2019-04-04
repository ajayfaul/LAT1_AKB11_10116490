package com.morningstar.lat1_akb11_10116490;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 * NIM     : 10116490
 * Nama    : Muhammad Fajar Maulana
 * Kelas   : IF-11 / AKB-11
 * Tanggal : 3-April-2019
 *
 * */
public class LoginCode extends AppCompatActivity implements View.OnClickListener {

    Button btn_Masuk, btn_BeliKode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);

        btn_Masuk = findViewById(R.id.btnMasuk);
        btn_Masuk.setOnClickListener(this);

        btn_BeliKode = findViewById(R.id.btnBeliKode);
        btn_BeliKode.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMasuk:
                Intent moveIntent = new Intent(LoginCode.this, Biodata.class);
                startActivity(moveIntent);
                break;
            case R.id.btnBeliKode:
                Intent moveIntent2 = new Intent(LoginCode.this, Biodata.class);
                startActivity(moveIntent2);
                break;
        }
    }
}
