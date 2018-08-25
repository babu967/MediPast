package com.codex.foysal.medipast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button doctorList, addDoctor, updateDoctor, addMedicalHistory, viewMedicalHistory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        doctorList=findViewById(R.id.doctorListButton);
        addDoctor=findViewById(R.id.addDoctorButton);
        updateDoctor=findViewById(R.id.updateDoctorButton);
        addMedicalHistory=findViewById(R.id.addMedicalHistoryButton);
        viewMedicalHistory=findViewById(R.id.medicalHistoryButton);

//--------------------------------------------Show Doctor List  ------------------------------------------------------------------

        doctorList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//-------------------------------------------  Add Doctor info --------------------------------------------------------------------

        addDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//-------------------------------------------- Update Doctor info ------------------------------------------------------------------

        updateDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//--------------------------------------------Add Medical History -------------------------------------------------------------------

        addMedicalHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


//------------------------------------------ View Medical History ---------------------------------------------------------------------

        viewMedicalHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }
}
