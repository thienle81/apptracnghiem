package com.example.doancuoiki2.ui.trangchu;

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

public class trangchuFragment extends Fragment {

    private trangchuViewModel trangchuViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Trang Chủ");
        trangchuViewModel =
                ViewModelProviders.of(this).get(trangchuViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trangchu, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        trangchuViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
