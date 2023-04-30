package com.example.a10120211latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DoneActivity extends AppCompatActivity {
    //    29 April 2023
    //    10120211 - Arif Rachmat Darmawan - IF6
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        bindExtra();
    }

    private void bindExtra() {
        Intent intent = getIntent();
        name = intent.getStringExtra(BiodataActivity.ID_EXTRA_MSG);
        TextView txtNama = (TextView) findViewById(R.id.txtDoneTitle);
        txtNama.setText("Beres! Sekarang " + name + " udah bisa ngecek penggunaan HP " + name + " tiap hari buat bantu " + name + " ngatur waktu :)");
    }
}