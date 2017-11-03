package com.Company.MuseumUn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnClick(View view) {
        try {
            btn = (Button) view;
            switch (btn.getId()) {
                case R.id.nextActivity:
                    intent = new Intent(MainActivity.this, HallActivity.class);
                    startActivity(intent);
                    finish();
                    break;
                case R.id.myAbout:
                    intent = new Intent(MainActivity.this, About.class);
                    startActivity(intent);
                    break;
                case R.id.instruction:
                    intent = new Intent(MainActivity.this, Instructions.class);
                    startActivity(intent);
                    finish();
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {

        }
    }
}