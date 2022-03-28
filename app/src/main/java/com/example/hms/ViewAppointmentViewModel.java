package com.example.hms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewAppointmentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViewAppointmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is view_appointment fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}