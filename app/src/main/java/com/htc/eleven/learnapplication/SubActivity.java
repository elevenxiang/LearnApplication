package com.htc.eleven.learnapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {


    private Button button = null;
    private TextView tv;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

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
