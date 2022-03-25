package com.cookandroid.project4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox cEn, cCl, cRo;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-7");

        cEn = (CheckBox) findViewById(R.id.cEn);
        cCl = (CheckBox) findViewById(R.id.cCl);
        cRo = (CheckBox) findViewById(R.id.cRo);
        btn = (Button) findViewById(R.id.btn);

        cEn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cEn.isChecked() == true)
                    btn.setEnabled(true);
                else
                    btn.setEnabled(false);
            }
        });

        cCl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cCl.isChecked() == true)
                    btn.setClickable(true);
                else
                    btn.setClickable(false);
            }
        });

        cRo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cRo.isChecked() == true)
                    btn.setRotation(45);
                else
                    btn.setRotation(0);
            }
        });
    }
}