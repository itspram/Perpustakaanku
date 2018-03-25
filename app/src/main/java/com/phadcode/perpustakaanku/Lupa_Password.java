package com.phadcode.perpustakaanku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Lupa_Password extends AppCompatActivity {
    private ListView listlupapassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa__password);
        listlupapassword = findViewById(R.id.lupapassword1);
        ArrayList<LupaPasswordItem> lupapassword = new ArrayList<>();
        lupapassword.add(new LupaPasswordItem(R.drawable.ic_user,"Gunakan Username atau Email"));
        lupapassword.add(new LupaPasswordItem(R.drawable.ic_user,"Kirim Lewat SMS"));
        lupapassword.add(new LupaPasswordItem(R.drawable.ic_user,"Masuk Melalui Facebook"));
        ListLupaPasswordAdapter lupadapter=new ListLupaPasswordAdapter(this,lupapassword);

        listlupapassword.setAdapter(lupadapter);
    }
}
