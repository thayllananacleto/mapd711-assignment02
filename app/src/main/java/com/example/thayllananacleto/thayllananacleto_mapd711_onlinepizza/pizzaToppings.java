package com.example.thayllananacleto.thayllananacleto_mapd711_onlinepizza;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pizzaToppings extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_toppings);
    }

    public void checkout(View view) {

        //Instantiate Intent Class
        Intent intent = new Intent(pizzaToppings.this, customerInfo.class);

        this.startActivity(intent);

    }
}
