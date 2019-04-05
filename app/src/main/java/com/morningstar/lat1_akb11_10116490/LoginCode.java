package com.morningstar.lat1_akb11_10116490;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Created Bye
 *
 * NIM     : 10116490
 * Nama    : Muhammad Fajar Maulana
 * Kelas   : IF-11 / AKB-11
 * Tanggal : 4-April-2019
 *
 * */
public class LoginCode extends AppCompatActivity implements View.OnClickListener {

    Button btn_Masuk, btn_BeliKode;
    EditText edt_KodeKeluarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);

        TextView textKebijakan = (TextView) findViewById(R.id.tvDescKetentuan);

        edt_KodeKeluarga = findViewById(R.id.edtKodeKeluarga);

        btn_Masuk = findViewById(R.id.btnMasuk);
        btn_Masuk.setOnClickListener(this);

        btn_BeliKode = findViewById(R.id.btnBeliKode);
        btn_BeliKode.setOnClickListener(this);

        /*
                    Spanned
                    This is the interface for text that has markup objects attached to ranges of it.
                 */

        Spanned html = Html.fromHtml(
                "Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Ketentuan Pengguna</b> Data kami"
        );

        // Set TextView text from html
        textKebijakan.setText(html);
    }

    @Override
    public void onClick(View v) {
        String kk = edt_KodeKeluarga.getText().toString();
        boolean isEmptyFields = false;
        switch (v.getId()) {
            case R.id.btnMasuk:
                if (TextUtils.isEmpty(kk)){
                    isEmptyFields = true;
                    Toast.makeText(getApplicationContext(), "Harap isi dengan Kode Keluarga Anda", Toast.LENGTH_LONG).show();
                }else{
                    Intent moveIntent = new Intent(LoginCode.this, Biodata.class);
                    startActivity(moveIntent);
                }
                break;
            case R.id.btnBeliKode:
                if (TextUtils.isEmpty(kk)){
                    isEmptyFields = true;
                    Toast.makeText(getApplicationContext(), "Harap isi dengan Kode Keluarga Anda", Toast.LENGTH_LONG).show();
                }else{
                    Intent moveIntent = new Intent(LoginCode.this, Biodata.class);
                    startActivity(moveIntent);
                }
                break;
        }
    }
}
