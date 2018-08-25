package com.codex.foysal.medipast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    //---------------------------------------------- Menu ---------------------------------------------------------------------------------


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        switch (id)
        {
            case R.id.action_home:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuDoctorList:
                Toast.makeText(this, "Doctor List", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuAddDoctor:
                Toast.makeText(this, "Add Doctor", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuUpdateDoctor:
                Toast.makeText(this, "update doctor", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuAddMedicalHistory:
                Toast.makeText(this, "add medical history", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuMedicalHistory:
                Toast.makeText(this, "Medical History", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuAboutUs:
                Toast.makeText(this, "This app made by CodeX", Toast.LENGTH_SHORT).show();
                break;
                }

        return super.onOptionsItemSelected(item);
    }
}
