package com.example.inclass1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Button1 = (Button)findViewById(R.id.button1);
        Button1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Context context = getApplicationContext();
                        CharSequence text = " Hello, this is my first Android APP!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
        );
    }
}
