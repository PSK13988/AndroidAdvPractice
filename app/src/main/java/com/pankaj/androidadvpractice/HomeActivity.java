package com.pankaj.androidadvpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private Button btnActivityToFragment, btnDialogFragmentToFragment, btnRecyclerView, btnViewPager, btnBottomMenu, btnEsignature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnActivityToFragment = (Button) findViewById(R.id.btnActivityToFragment);
        btnDialogFragmentToFragment = (Button) findViewById(R.id.btnDialogFragmentToFragment);
        btnRecyclerView = (Button) findViewById(R.id.btnRecyclerView);
        btnViewPager = (Button) findViewById(R.id.btnViewPager);
        btnBottomMenu = (Button) findViewById(R.id.btnBottomMenu);
        btnEsignature = (Button) findViewById(R.id.btnEsignature);

        btnActivityToFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

        btnDialogFragmentToFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Main1Activity.class));
            }
        });

        btnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Main2Activity.class));
            }
        });

        btnViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ViewPagerActivity.class));
            }
        });

        btnBottomMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, BottomMenuActivity.class));
            }
        });

        btnEsignature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ESignatureActivity.class));
            }
        });
    }
}
