package com.example.rizkypratamaactandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public Button btnBack;
    public TextView txtnama,txtalamat,txtttl,txtemail,txtnohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String nama;
        String alamat;
        String ttl;
        String email;
        String nohp;

       txtnama= findViewById(R.id.txt_nama);
       txtalamat = findViewById(R.id.txt_alamat);
       txtttl = findViewById(R.id.txt_ttl);
       txtemail = findViewById(R.id.txt_email);
       txtnohp = findViewById(R.id.txt_nohp);


        if (savedInstanceState == null) {
            Bundle paket = getIntent().getExtras();
            if (paket == null){
                nama = null;
                alamat = null;
                ttl = null;
                email = null;
                nohp = null;
            }else{
                nama = paket.getString("bawa_data1");
                txtnama.setText(nama);
                alamat = paket.getString("bawa_data2");
                txtalamat.setText(alamat);
                ttl = paket.getString("bawa_data3");
                txtttl.setText(ttl);
                email = paket.getString("bawa_data4");
                txtemail.setText(email);
                nohp = paket.getString("bawa_data5");
                txtnohp.setText(nohp);
            }
        }


        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(itn);

            }
        });


    }
}