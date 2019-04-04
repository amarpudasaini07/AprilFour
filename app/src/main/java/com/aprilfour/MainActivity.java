package com.aprilfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvout;
    private Button click;
    private String[] strarray={"Ram","Shyam","X.7123","8132","T-Rex"};
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvout=findViewById(R.id.textview);
        click=findViewById(R.id.btnclick);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvout.setText(strarray[counter]);
                if (counter<strarray.length-1){
                    counter++;
                }
                else
                {
                    counter=0;
                }
            }
        });


    }
}
