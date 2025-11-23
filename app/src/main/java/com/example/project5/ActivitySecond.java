package com.example.project5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivitySecond extends AppCompatActivity {
    private TextView textHitung, textHasil;
    String Hitung;
    double Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        textHitung = findViewById(R.id.textHitung);
        textHasil = findViewById(R.id.textHasil);

        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.EXTRA_HITUNG)) {
            Hitung = intent.getStringExtra(MainActivity.EXTRA_HITUNG);
            textHitung.setText(Hitung + "=");
        }
        if (intent.hasExtra(MainActivity.EXTRA_HASIL)) {
            Hasil = intent.getDoubleExtra(MainActivity.EXTRA_HASIL, 0);
            if (Hitung.contains("/")) {
                textHasil.setText(Hasil + "");
            } else {
                textHasil.setText((int) Hasil + "");
            }
        }
    }
}
