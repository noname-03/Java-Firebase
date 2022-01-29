package com.example.java_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference table;
    EditText kodeMK, namaMK ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi
        kodeMK = findViewById(R.id.Idtxt);
        namaMK = findViewById(R.id.Nametxt);
    }
    public void simpan(View view){
        database = FirebaseDatabase.getInstance(); //mecari database
        table = database.getReference("tb_mahasiswa"); //mencari table

        String kode = kodeMK.getText().toString();
        String nama = namaMK.getText().toString();

        DataHandler handler = new DataHandler(kode, nama);
        table.child(kode).setValue(handler);
//        table.setValue("Fadil");
        Toast.makeText(MainActivity.this, "Berhasil menyimpan data", Toast.LENGTH_SHORT).show();
    }
}