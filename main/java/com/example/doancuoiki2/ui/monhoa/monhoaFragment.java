package com.example.doancuoiki2.ui.monhoa;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.doancuoiki2.MainActivity;
import com.example.doancuoiki2.R;

public class monhoaFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Môn Hóa");

        return inflater.inflate(R.layout.fragment_monhoa, container,false);



    }
}
