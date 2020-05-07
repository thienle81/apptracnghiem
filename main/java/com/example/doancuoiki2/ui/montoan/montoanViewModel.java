package com.example.doancuoiki2.ui.montoan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class montoanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public montoanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("CHỌN LỚP NÀO BẠN");
    }

    public LiveData<String> getText() {
        return mText;
    }
}