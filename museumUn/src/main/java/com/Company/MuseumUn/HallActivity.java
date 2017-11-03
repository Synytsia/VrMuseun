package com.Company.MuseumUn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HallActivity extends AppCompatActivity {

    Button roomselection;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void OnClick(View view) {
        try {
            roomselection = (Button) view;
            intent = new Intent(HallActivity.this, com.google.unity.GoogleUnityActivity.class);
            // в ключ hall пихаем название нужной картинки
            intent.putExtra("hall", view.getTag().toString());
            startActivity(intent);
            finish();

        } catch (Exception ex) {

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home)
            startActivity(new Intent(HallActivity.this, MainActivity.class));
        return super.onOptionsItemSelected(item);

    }
}
