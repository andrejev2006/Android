package com.example.andrey.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(View view) {
        String textForToast = "This button will launch: ";
        switch (view.getId()) {
            case R.id.button_main_spotify: textForToast+="spotify"; break;
            case R.id.button_main_scores: textForToast+="scores app"; break;
            case R.id.button_main_library: textForToast+="library app"; break;
            case R.id.button_main_buildbigger: textForToast+="build it bigger app"; break;
            case R.id.button_main_xyzreader: textForToast+="XYZ reader"; break;
            case R.id.button_main_capstone: textForToast+="my capstone project"; break;
            default:
                throw new IllegalStateException("Unknown button clicked.");
        }

        Toast.makeText(this, textForToast, Toast.LENGTH_SHORT).show();
    }
}
