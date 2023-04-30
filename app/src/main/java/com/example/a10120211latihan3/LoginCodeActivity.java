package com.example.a10120211latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginCodeActivity extends AppCompatActivity {
    //    29 April 2023
    //    10120211 - Arif Rachmat Darmawan - IF6
private String code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
        TextView txtAgree = (TextView) findViewById(R.id.txtCheckCodeAgree);
        txtAgree.setText(Html.fromHtml(getString(R.string.check_code_text_agreement)));
        EditText edtInputCode = (EditText) findViewById(R.id.edtInputCode);
        Button btnCheck = (Button) findViewById(R.id.btnCheckCode);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = edtInputCode.getText().toString();
                if (isStringEmpty(code)){
                    Toast.makeText(LoginCodeActivity.this, "Kode kamu kosong!", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(getApplicationContext(), BiodataActivity.class));
                }
            }
        });
    }
    public static boolean isStringEmpty(String str) {
        return "".equals(str);
    }
}