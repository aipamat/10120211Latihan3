package com.example.a10120211latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BiodataActivity extends AppCompatActivity {
    private String nameBioData;
    public static final String ID_EXTRA_MSG = "com.example.a10120211latihan3.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        EditText edtNama = (EditText) findViewById(R.id.edtBiodataName);
        Button button = (Button) findViewById(R.id.btnBiodataNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameBioData = edtNama.getText().toString();
                if (isStringEmpty(nameBioData)) {
                    Toast.makeText(BiodataActivity.this, "Nama kamu kosong!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), DoneActivity.class);
                    intent.putExtra(ID_EXTRA_MSG, nameBioData);
                    startActivity(intent);
                }
            }
        });
    }

    public static boolean isStringEmpty(String str) {
        return "".equals(str);
    }
}