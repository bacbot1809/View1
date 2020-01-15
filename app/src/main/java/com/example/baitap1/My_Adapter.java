package com.example.baitap1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;

public class My_Adapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<Contact> data;
    private LayoutInflater layoutInflater;

    public My_Adapter(Activity activity, ArrayList<Contact> data) {
        this.activity = activity;
        this.data = data;
        layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View v = view;
        if(v==null)
            v = layoutInflater.inflate(R.layout.listitem,null);
        //tham chiếu
        TextView txtID = v.findViewById(R.id.txtId);
        txtID.setText(String.valueOf(data.get(i).getID()));
        TextView txtNAME = v.findViewById(R.id.txtNAME);
        txtNAME.setText(data.get(i).getName());
        TextView txtPhone = v.findViewById(R.id.txtPhone);
        txtPhone.setText(data.get(i).getPhoneNumber());
        final CheckBox cbStatus = v.findViewById(R.id.cbStatus);
        cbStatus.setChecked(Boolean.valueOf(data.get(i).isStatus()));
        cbStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.get(i).setStatus(cbStatus.isChecked());
            }
        });
        return v;
    }
}
