package com.phadcode.perpustakaanku;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by APEX on 24/03/2018.
 */

public class ListLupaPasswordAdapter extends ArrayAdapter<LupaPasswordItem> {
    public ListLupaPasswordAdapter(@NonNull Activity context, @NonNull ArrayList<LupaPasswordItem> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.lupa_password,parent,false);
        }
        LupaPasswordItem current = getItem(position);
        TextView lupapassword = view.findViewById(R.id.textmenu);
        ImageView iconpassword = view.findViewById(R.id.icon1);

        lupapassword.setText(current.getText());
        iconpassword.setImageResource(current.getIcon());
        return view;
    }
}
