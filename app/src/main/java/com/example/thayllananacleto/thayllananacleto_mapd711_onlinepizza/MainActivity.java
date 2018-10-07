package com.example.thayllananacleto.thayllananacleto_mapd711_onlinepizza;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.pizzamenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        {

            //Instantiate Intent Class
            Intent intent = new Intent(MainActivity.this, pizzaSizes.class);
            
            //Preferences
            mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            mEditor = mPreferences.edit();
            
            //handle menu items
            switch (item.getItemId())
            {
                case R.id.item1:
                    mEditor.putString("pizzaType", "Meat Supreme");
                    mEditor.commit();
                    break;
                case R.id.item2:
                    mEditor.putString("pizzaType", "Super Hawaiian");
                    mEditor.commit();
                    break;
                case R.id.item3:
                    mEditor.putString("pizzaType", "Veggie");
                    mEditor.commit();
                    break;
                case R.id.item4:
                    mEditor.putString("pizzaType", "Mediterranean");
                    mEditor.commit();
                    break;
                case R.id.item5:
                    mEditor.putString("pizzaType", "Cheddar Supreme");
                    mEditor.commit();
                    break;
            }
            
            this.startActivity(intent);
            return true;
        }
        
    }

}
