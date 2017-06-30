package com.example.yuecheng.day9_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    int start = 1;
    int end = 12;


    int start_pos = 1;
    final int discrete = 1;
    int value [] = {1,2,3,4,5,6,7,8,9,10,11,12};
    int result[];

    ArrayList<Integer> table = new ArrayList<Integer>();

        table.add(1);
        table.add(2);
        table.add(3);
        table.add(4);
        table.add(5);
        table.add(6);
        table.add(7);
        table.add(8);
        table.add(9);
        table.add(10);
        table.add(11);
        table.add(12);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lView = (ListView) findViewById(R.id.listview1);  


        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_expandable_list_item_1, table);  
        lView.setAdapter(adapter);  


        start = 1;
        end = 12;
        start_pos = 1;

        SeekBar sb = (SeekBar) findViewById(R.id.seekBar1);
        sb.setProgress(start_pos);


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        };

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {  

        Log.i("Hello ", table.get(i)); 
    }

    });
}













}
