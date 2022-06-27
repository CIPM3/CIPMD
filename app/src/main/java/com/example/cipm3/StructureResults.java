package com.example.cipm3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class StructureResults extends AppCompatActivity {
    Button show ;
    TextView psresult;
    private  TextView ps;
    private ListView lv;
    String estructuras[];
    String booleanos[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure_results);
        FirebaseDatabase databse = FirebaseDatabase.getInstance();
        DatabaseReference reference = databse.getReference("Score"  );
        show= findViewById(R.id.showResultsBtn);
        lv = findViewById(R.id.listview);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        GenericTypeIndicator<ArrayList<Student>> t = new GenericTypeIndicator<ArrayList<Student>>() {
                        };
                        ArrayList<Student> students = snapshot.getValue(t);
                        //String value = String.valueOf(students.get(0).presentsimple);
                        estructuras = new String[]{"Presente Simple "+": "+ String.valueOf(students.get(0).presentsimple), "Presente Continuo"+": "+
                                String.valueOf(students.get(0).presenteContinuo)};

                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(StructureResults.this,
                                R.layout.list,estructuras
                        );
                        lv.setAdapter(adapter);
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }


}