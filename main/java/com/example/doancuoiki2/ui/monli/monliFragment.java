package com.example.doancuoiki2.ui.monli;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.doancuoiki2.MainActivity;
import com.example.doancuoiki2.R;

public class monliFragment extends Fragment {

    private monliViewModel monliViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Môn Lí");
        monliViewModel =
                ViewModelProviders.of(this).get(monliViewModel.class);
        View root = inflater.inflate(R.layout.fragment_monli, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        monliViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
