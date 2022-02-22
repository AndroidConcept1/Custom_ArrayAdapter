package com.abulkalam.custom_arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NumberViewAdapter extends ArrayAdapter<NumberView> {
    public NumberViewAdapter(@NonNull Context context, ArrayList<NumberView> arrayList) {
        super(context, 0 , arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View currentItemView = convertView;

       if (currentItemView == null){
           currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.customlistview,parent, false);

       }
       NumberView currentNumberPosition = getItem(position);

        ImageView numberImage = currentItemView.findViewById(R.id.imageView);
        assert currentNumberPosition != null;
        numberImage.setImageResource(currentNumberPosition.getmNumberImageId());

        TextView textView1 =currentItemView.findViewById((R.id.textView1));
        textView1.setText(currentNumberPosition.getmNumberInDigit());

        TextView textView2 =currentItemView.findViewById((R.id.textView2));
        textView2.setText(currentNumberPosition.getmNumberInText());

        return currentItemView;
    }
}
