package com.example.prisoners_new.main_board.ui.conditions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConditionsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ConditionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Conditions fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}