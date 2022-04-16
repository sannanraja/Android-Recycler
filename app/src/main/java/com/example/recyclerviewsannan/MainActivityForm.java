package com.example.recyclerviewsannan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class MainActivityForm extends AppCompatActivity {
EditText editText,editText2,editText3;
Button btn;
    String editteamnames,editTeamlocations,editplayingyear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);

        editText=findViewById(R.id.teamNames);
        editText2=findViewById(R.id.teamLocations);

        editText3=findViewById(R.id.playingYear);
        btn=findViewById(R.id.submit);

        editteamnames=editText.getText().toString();
        editTeamlocations=editText2.getText().toString();
        editplayingyear= editText3.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GotoActivityMain();
            }
        });


    }

    private void GotoActivityMain() {
        Intent i = new Intent(this,ButtonAct.class);
        i.putExtra("teamName",editteamnames);
        i.putExtra("editTeamlocations",editTeamlocations);
        i.putExtra("editplayingyear",editplayingyear);
        startActivity(i);
    }
}