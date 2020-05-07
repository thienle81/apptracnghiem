package com.example.doancuoiki2.ui.trangchu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class trangchuViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public trangchuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("CHÀO MỪNG BẠN ĐẾN VỚI ỨNG DỤNG TRẮC NGHIỆM");
    }

    public LiveData<String> getText() {
        return mText;
    }
}