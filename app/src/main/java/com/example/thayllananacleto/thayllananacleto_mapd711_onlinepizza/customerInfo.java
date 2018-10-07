package com.example.thayllananacleto.thayllananacleto_mapd711_onlinepizza;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class customerInfo extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);
    }


    public void OrderPizza(View view) {

        //Instantiate Intent Class
        Intent intent = new Intent(customerInfo.this, detailsPage.class);

        //Preferences
        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mPreferences.edit();

        EditText etFullName = findViewById(R.id.etFullName);
        EditText etAddress = findViewById(R.id.etAddress);
        EditText etTelephoneNumber = findViewById(R.id.etTelephoneNumber);

        mEditor.putString("fullName", etFullName.getText().toString());
        mEditor.putString("address", etAddress.getText().toString());
        mEditor.putString("contactNumber", etTelephoneNumber.getText().toString());
        mEditor.commit();

        this.startActivity(intent);

    }
}
