package com.abulkalam.custom_arrayadapter;

public class NumberView {
    private int mNumberImageId;
    private String mNumberInDigit;
    private String mNumberInText;

    public NumberView(int mNumberImageId, String mNumberInDigit, String mNumberInText) {
        this.mNumberImageId = mNumberImageId;
        this.mNumberInDigit = mNumberInDigit;
        this.mNumberInText = mNumberInText;
    }

    public int getmNumberImageId() {
        return mNumberImageId;
    }

    public String getmNumberInDigit() {
        return mNumberInDigit;
    }

    public String getmNumberInText() {
        return mNumberInText;
    }
}
