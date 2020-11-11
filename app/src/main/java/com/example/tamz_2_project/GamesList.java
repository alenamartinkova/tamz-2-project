package com.example.tamz_2_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class GamesList extends AppCompatActivity {
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu_games, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.panda:
                this.myIntent = new Intent(this, MainActivity.class);
                startActivity(this.myIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void chooseGame(View view) {
        switch(view.getId()) {
            case R.id.button:
                this.myIntent = new Intent(this, PandaBanActivity.class);
                this.myIntent.putExtra("level", '1');
                startActivity(this.myIntent);
                break;
            case R.id.button2:
                this.myIntent = new Intent(this, FlightGameActivity.class);
                startActivity(this.myIntent);
                break;
        }
    }
}