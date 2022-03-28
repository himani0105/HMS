package com.example.hms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrescriptionViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PrescriptionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is prescription fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}