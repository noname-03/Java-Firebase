package com.example.java_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void simpan(View view){
        database = FirebaseDatabase.getInstance();
        table = database.getReference("tb_mahasiswa");
        table.setValue("Testing");
        Toast.makeText(MainActivity.this, "Berhasil menyimpan data", Toast.LENGTH_SHORT).show();
    }
}