package com.example.rizkypratamaactandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText nama,alamat,ttl,email,nohp ;

    public Button btnPindah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.et_sample1);
        alamat = findViewById(R.id.et_sample2);
        ttl = findViewById(R.id.et_sample3);
        email = findViewById(R.id.et_sample4);
        nohp = findViewById(R.id.et_sample5);
        btnPindah = findViewById(R.id.btn_pindah);

        //OnClick untuk berpindah dari act 1 menuju act 2
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), SecondActivity.class);
                itn.putExtra("bawa_data1", nama.getText().toString());
                itn.putExtra("bawa_data2", alamat.getText().toString());
                itn.putExtra("bawa_data3", ttl.getText().toString());
                itn.putExtra("bawa_data4", email.getText().toString());
                itn.putExtra("bawa_data5", nohp.getText().toString());
                startActivity(itn);
                finish();
            }
        });
    }
}