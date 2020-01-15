package com.example.baitap1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtName;
    ListView lstContact;
    Button bnThem;
    Button bnXoa;
    CheckBox cbStatus;
    ArrayList<Contact> lstdata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        lstContact = findViewById(R.id.lstContact);
        bnThem = findViewById(R.id.bnThem);
        bnXoa = findViewById(R.id.bnXoa);

        lstdata.add(new Contact(1, "Nguyễn Văn An", "098765431", false));
        lstdata.add(new Contact(2, "Nguyễn Thị Bích", "098647431", false));
        lstdata.add(new Contact(3, "Nguyễn Hải Trần", "092135431", false));
        lstdata.add(new Contact(4, "Nguyễn Văn Chung", "098762131", false));
        lstdata.add(new Contact(5, "Nguyễn Thị Bích", "098647431", false));
        lstdata.add(new Contact(6, "Nguyễn Hải Trần", "092135431", false));
        lstdata.add(new Contact(7, "Nguyễn Văn Chung", "098762131", false));
        lstdata.add(new Contact(8, "Nguyễn Thị Bích", "098647431", false));
        lstdata.add(new Contact(9, "Nguyễn Hải Trần", "092135431", false));
        lstdata.add(new Contact(10, "Nguyễn Văn Chung", "098762131", false));
        lstdata.add(new Contact(11, "Nguyễn Thị Bích", "098647431", false));
        lstdata.add(new Contact(12, "Nguyễn Hải Trần", "092135431", false));
        lstdata.add(new Contact(13, "Nguyễn Văn Chung", "098762131", false));
        final My_Adapter lstadapter = new My_Adapter(this, lstdata);
        lstContact.setAdapter(lstadapter);

        bnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i =lstdata.size()-1;i>=0;i--){
                    if(lstdata.get(i).isStatus() == true)
                        lstdata.remove(i);
                }
                lstadapter.notifyDataSetChanged(); //Load lại dữ liệu
            }
        });

    }
}
