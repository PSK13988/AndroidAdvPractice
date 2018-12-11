package com.pankaj.androidadvpractice.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.pankaj.androidadvpractice.MainActivity;
import com.pankaj.androidadvpractice.R;

public class CustomDialog extends DialogFragment {
    private static final String TAG = "CustomDialog";
    private Button btnOK, btnCancel;
    private EditText edtInput;

    public interface OutputListener {
        void sendOutput(String output);
    }

    private OutputListener outputListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            outputListener = (OutputListener) getActivity();
        } catch (ClassCastException e) {
            try {
                outputListener = (OutputListener) getTargetFragment();
            } catch (ClassCastException e1) {
                Log.d(TAG, "onAttach: ClassCastException" + e.getMessage());
            }
            Log.d(TAG, "onAttach: ClassCastException" + e.getMessage());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_custom, container, false);
        btnOK = (Button) view.findViewById(R.id.btnOK);
        btnCancel = (Button) view.findViewById(R.id.btnCancel);
        edtInput = (EditText) view.findViewById(R.id.edtInput);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = edtInput.getText().toString();
                if (!output.equals("")) {
                    // Easy way
                    //((MainActivity) getActivity()).txtOutput.setText(output);

                    // Best practise
                    outputListener.sendOutput(output);
                }
                dismiss();
            }
        });
        return view;
    }
}
