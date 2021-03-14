package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        //Inflate your view
        setContentView(R.layout.activity_main);

        //Get references to UI widget
        final ListView myListView = (ListView)findViewById(R.id.myListView);

        final EditText myEditText = (EditText)findViewById(R.id.myEditText);

        final Button addButton = (Button)findViewById(R.id.addbutton);

        //Create the ArrayList and the ArrayAdapter
        final ArrayList<String> todoItems = new ArrayList<String>();

        final ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);

        //Bind the listview to the array adapter
        myListView.setAdapter(aa);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todoItems.add(0, myEditText.getText().toString().toString());

                myEditText.setText("buu");
                aa.notifyDataSetChanged();
            }
        });


        }


    }
