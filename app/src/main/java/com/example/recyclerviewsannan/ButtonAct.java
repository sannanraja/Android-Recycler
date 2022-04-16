package com.example.recyclerviewsannan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAct extends AppCompatActivity {
Button buttonAct;
TextView textData,textData1,textData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        buttonAct= findViewById(R.id.button);
        textData=findViewById(R.id.textData);
        textData1=findViewById(R.id.textData1);
        textData2=findViewById(R.id.textData2);



        buttonAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivityForm.class);
                startActivity(i);
            }
        });
        Intent i =getIntent();
        String getTeamname=i.getStringExtra("teamName");
        String geteditteamlocations=i.getStringExtra("editTeamlocations");
        String getplayingyear=i.getStringExtra("editplayingyear");
        textData.setText("Welcome "+getTeamname);
        textData1.setText("Welcome "+geteditteamlocations);
        textData2.setText("Welcome "+getplayingyear);



    }
}