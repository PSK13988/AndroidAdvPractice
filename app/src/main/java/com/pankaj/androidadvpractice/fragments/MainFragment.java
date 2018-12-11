package com.pankaj.androidadvpractice.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.pankaj.androidadvpractice.R;
import com.pankaj.androidadvpractice.dialog.CustomDialog;

public class MainFragment extends Fragment implements CustomDialog.OutputListener {
    private Button btnClickMe;
    private TextView txtOutput;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        btnClickMe = (Button) view.findViewById(R.id.btnClickMe);
        txtOutput = (TextView) view.findViewById(R.id.txtOutput);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog customDialog = new CustomDialog();
                customDialog.setTargetFragment(MainFragment.this, 1);
                customDialog.show(getFragmentManager(), "CustomDialog");
            }
        });

        return view;
    }

    @Override
    public void sendOutput(String output) {
        txtOutput.setText(output);
    }
}
