package com.example.coffees.palleuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
    }

    public void clicked(View view) {
        Intent in = new Intent(Subjects.this,Chapters.class);
        switch(view.getId()){
            case R.id.linear1:
                in.putExtra("linearId",1);
                break;
            case R.id.linear2:
                in.putExtra("linearId",2);
                break;
            case R.id.linear3:
                in.putExtra("linearId",3);
                break;
        }
        startActivity(in);
    }
}
