package com.example.anikaitsingh.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private int count;
    private TextView counterText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting initial values
        counterText = (TextView) this.findViewById(R.id.showCount);
        count = 0;
    }


    public void reset(View view) {
        Toast t = Toast.makeText(getApplicationContext(), getString(R.string.toast), Toast.LENGTH_SHORT);
        t.show();
        count = 0;
        changeCount(count);
    }

    public void countUp(View view) {
        changeCount(++count);
    }

    public void changeCount(int num){
        if(counterText != null){
            counterText.setText(num + "");
        }
    }
}
