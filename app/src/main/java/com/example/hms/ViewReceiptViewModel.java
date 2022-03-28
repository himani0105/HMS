package com.example.hms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewReceiptViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ViewReceiptViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is view_receipt fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
