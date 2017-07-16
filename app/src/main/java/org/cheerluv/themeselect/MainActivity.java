package org.cheerluv.themeselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.*;
import android.view.*;



public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.bgchange1);
        Button btn2 = (Button)findViewById(R.id.bgchange2);
        Button btn3 = (Button)findViewById(R.id.bgchange3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        layout=(LinearLayout)findViewById(R.id.layout);


    }

    public void onClick(View v){
        if(v.getId()==R.id.bgchange1){
            layout.setBackgroundResource(R.drawable.home);
        }
        else if(v.getId()==R.id.bgchange2) {
            layout.setBackgroundResource(R.drawable.sky);
        }
        else if(v.getId()==R.id.bgchange3){
            layout.setBackgroundResource(R.drawable.sea);
        }
    }

}
