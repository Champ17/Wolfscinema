package com.app.banuelos.wolfscinema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerText = (TextView) findViewById(R.id.answerText);
        answerText.setText("Replay is hazy, try again tomorrow");
    }
}
