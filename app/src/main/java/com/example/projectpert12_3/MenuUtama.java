package com.example.projectpert12_3;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    Button bluassegitiga, babout, bkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_utama);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bluassegitiga = findViewById(R.id.btnsegitiga);;
        babout = findViewById(R.id.btntentang);
        bkeluar = findViewById(R.id.btnkeluar);

        // Navigasi ke Luas Segitiga
        bluassegitiga.setOnClickListener(view -> {
            Intent intent = new Intent(MenuUtama.this, Segitiga.class);
            startActivity(intent);
        });

        babout.setOnClickListener(view -> {
            Intent intent = new Intent(MenuUtama.this, About.class);
            startActivity(intent);
        });

        bkeluar.setOnClickListener(view -> {
            Intent intent = new Intent(MenuUtama.this, MainActivity.class);
            startActivity(intent);
        });
    }
}