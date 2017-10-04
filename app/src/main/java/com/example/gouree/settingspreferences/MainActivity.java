package com.example.gouree.settingspreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view)
    {
        //intent
        Intent intent =new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }

    public void read(View view)
    {
        //show the values of changed names
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String str = pref.getString("example_text","xxx");
        Toast.makeText(this, "value-->"+str, Toast.LENGTH_SHORT).show();


    }
}
