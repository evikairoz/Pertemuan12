package com.example.projectpert12_3;

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
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    Button bhapus, bhitung;
    EditText edalas, edtinggi, edhasil;
    TextView thasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segitiga);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // inisialisasi
        edalas = findViewById(R.id.editAlas);
        edtinggi = findViewById(R.id.edittinggi);
        edhasil = findViewById(R.id.edithasil);
        thasil = findViewById(R.id.texthasil);
        bhapus = findViewById(R.id.btnhapus);
        bhitung =  findViewById(R.id.btnhitung);

        bhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // nilai dr edit text
                String alasstr = edalas.getText().toString();
                String tinggistr = edtinggi.getText().toString();

                // cek input apakah kosong
                if(!alasstr.isEmpty() && !tinggistr.isEmpty())
                {
                    // konversi double ke string
                    double alas = Double.parseDouble(alasstr);
                    double tinggi = Double.parseDouble(tinggistr);

                    // hitung luas segitiga
                    double luas = 0.5 * alas * tinggi;

                    // tampilkan hasil
                    edhasil.setText(String.valueOf(luas));
                } else {
                    // input kosong
                    edhasil.setText("Mohon Masukkan alas dan tinggi");
                }
            }
        });
        bhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edalas.setText("");
                edtinggi.setText("");

            }
        });


    }
}