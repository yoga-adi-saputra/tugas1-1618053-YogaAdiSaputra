package com.example.praktikum_1_intent;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Luas  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luas);

        final EditText edit_alas = (EditText) findViewById(R.id.setalas);
        final EditText edit_tinggi = (EditText) findViewById(R.id.settinggi);
        final EditText txt_hasil = (EditText) findViewById(R.id.sethasil);
        final Button hasil = (Button) findViewById(R.id.btn_hitung);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1 = Double.parseDouble(edit_alas.getText().toString());
                Double v2 = Double.parseDouble(edit_tinggi.getText().toString());
                Double perhitungan = 0.5*v1*v2;
                txt_hasil.setText(Double.toString(perhitungan));
            }
        });
    }
}
