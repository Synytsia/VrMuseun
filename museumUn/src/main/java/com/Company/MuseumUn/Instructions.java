package com.Company.MuseumUn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Instructions extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);

    }

    public void backOf(View v){
        Intent intent = new Intent(Instructions.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
