package com.example.thayllananacleto.thayllananacleto_mapd711_onlinepizza;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class pizzaSizes extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_sizes);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        TextView tvPizzaType = findViewById(R.id.tvSelectedType);
        tvPizzaType.setText("You have selected the " + mPreferences.getString("pizzaType", "default") + ". Which size do you want?");

    }

    public void nextActivity(View view) {

        //Instantiate Intent Class
        Intent intent = new Intent(pizzaSizes.this, pizzaToppings.class);

        //Preferences
        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mPreferences.edit();
        radioGroup = findViewById(R.id.radioGroup);
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        mEditor.putString("pizzaSize", radioButton.getText().toString());
        mEditor.commit();

        this.startActivity(intent);

    }
}
