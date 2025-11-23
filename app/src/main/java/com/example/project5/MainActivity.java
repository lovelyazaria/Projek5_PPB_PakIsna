package com.example.project5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editBil1, editBil2;
    public static final String EXTRA_HITUNG = "HITUNG";
    public static final String EXTRA_HASIL = "HASIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editBil1 = findViewById(R.id.editBil1);
        editBil2 = findViewById(R.id.editBil2);
    }

    public void tambah(View view) {
        int bil1 = Integer.parseInt(editBil1.getText().toString());
        int bil2 = Integer.parseInt(editBil2.getText().toString());
        int hasil = bil1 + bil2;
        openSecond (bil1+"+"+bil2, hasil);
    }
    public void kurang(View view) {
        int bil1 = Integer.parseInt(editBil1.getText().toString());
        int bil2 = Integer.parseInt(editBil2.getText().toString());
        int hasil = bil1 - bil2;
        openSecond (bil1+"-"+bil2, hasil);
    }

    public void kali(View view) {
        int bil1 = Integer.parseInt(editBil1.getText().toString());
        int bil2 = Integer.parseInt(editBil2.getText().toString());
        int hasil = bil1 * bil2;
        openSecond (bil1+"*"+bil2, hasil);
    }

    public void bagi(View view) {
        int bil1 = Integer.parseInt(editBil1.getText().toString());
        int bil2 = Integer.parseInt(editBil2.getText().toString());
        int hasil = bil1 / bil2;
        openSecond (bil1+"/"+bil2, hasil);
    }
    private void openSecond(String hitung, double hasil) {
        Intent intent = new Intent (this, ActivitySecond.class);
        intent.putExtra(EXTRA_HITUNG, hitung);
        intent.putExtra(EXTRA_HASIL, hasil);
        startActivity(intent);
    }
}