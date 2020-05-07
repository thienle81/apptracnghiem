package com.example.doancuoiki2.ui.montoan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.doancuoiki2.MainActivity;
import com.example.doancuoiki2.R;
import com.example.doancuoiki2.slide.ScreenSlideActivity;

public class montoanFragment extends Fragment {

    Button toan10,toan11,toan12;
    private montoanViewModel montoanViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Môn Toán");
        montoanViewModel=
                ViewModelProviders.of(this).get(montoanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_montoan, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        montoanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setControl();
        setEvent();
    }

    private void setEvent() {

        toan10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), ScreenSlideActivity.class);
                startActivity(i);
            }
        });

    }

    private void setControl() {
        toan10=(Button)getActivity().findViewById(R.id.toanmuoi);
        toan11=(Button)getActivity().findViewById(R.id.toanmm);
        toan12=(Button)getActivity().findViewById(R.id.toanmh);
    }
}
