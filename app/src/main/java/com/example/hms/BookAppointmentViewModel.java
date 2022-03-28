package com.example.hms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookAppointmentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BookAppointmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is book_appointment fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}