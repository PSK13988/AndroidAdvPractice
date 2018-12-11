package com.pankaj.androidadvpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pankaj.androidadvpractice.dialog.CustomDialog;

public class MainActivity extends AppCompatActivity implements CustomDialog.OutputListener {
    private static final String TAG = "MainActivity";
    private Button btnClickMe;
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickMe = (Button) findViewById(R.id.btnClickMe);
        txtOutput = (TextView) findViewById(R.id.txtOutput);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog customDialog = new CustomDialog();
                customDialog.show(getSupportFragmentManager(), "CustomDialog");
            }
        });
    }

    @Override
    public void sendOutput(String output) {
        txtOutput.setText(output);
    }
}
