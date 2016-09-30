package com.example1.hasee.re;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> datas = new ArrayList<>();
    int x = 9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        int y = 10;
        for(int i = 0;i<50;i++){
            datas.add("你好"+i);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyc);
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(new MyAdapter(datas));
    }

    private void init() {

    }
}
