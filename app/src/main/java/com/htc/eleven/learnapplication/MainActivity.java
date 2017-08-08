package com.htc.eleven.learnapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv = null;
    private EditText editText = null;
    private Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("MainActivity onCreate() !");

        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.text_view);

        tv.setText(getApp().getData());

        editText = (EditText) findViewById(R.id.mytext);

        button = (Button) findViewById(R.id.btnSave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApp().setData("当前存储的数据: " + editText.getText().toString());
                tv.setText(getApp().getData());
            }
        });

    }

    public App getApp() {

        return (App) getApplicationContext();
    }
}
