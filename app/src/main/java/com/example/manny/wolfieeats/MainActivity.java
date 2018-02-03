package com.example.manny.wolfieeats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);

        //mTextMessage = (TextView) findViewById(R.id.message);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.simply_xy_plot);
                // Code here executes on main thread after user presses button
            }
        });
       // BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
       // navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void testReaction(View view) {
        //System.out.println("Hello World!");
        Intent intent = new Intent(this,SimpleXYPlotActivity.class);
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        //setContentView(R.layout.simply_xy_plot);
    }

}
