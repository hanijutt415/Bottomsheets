package com.example.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class bottom_sheet extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
    ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bottom_sheet, container, false);


        Button algo_button = v.findViewById(R.id.algo_button);
        Button course_button = v.findViewById(R.id.course_button);

        algo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Algorithm Shared", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        course_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Course Shared", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });
        return v;
    }
}