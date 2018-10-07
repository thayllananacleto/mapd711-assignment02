package com.example.thayllananacleto.thayllananacleto_mapd711_onlinepizza;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detailsPage extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        TextView tvOrder = findViewById(R.id.tvOrder);
        tvOrder.setText("You have selected the " + mPreferences.getString("pizzaType", "default") + ". Which size do you want?");
        tvOrder.setText(mPreferences.getString("fullName", "default") + ", thank you for your online order. \n\n" +
                "Your " + mPreferences.getString("pizzaSize", "default") + " " + mPreferences.getString("pizzaType", "default")
                + " pizza order was successfully received and will be delivered in " + mPreferences.getString("address", "default")
                + " soon and your contact number is " + mPreferences.getString("contactNumber", "default") + ".");
    }
}
