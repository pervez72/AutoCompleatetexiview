package com.example.autocompleatetexiview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private String[] country_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_name=getResources().getStringArray(R.array.countries_array);

        autoCompleteTextView=findViewById(R.id.autoCompleteID);
                                                                                //android defult layout use
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,country_name);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               String value= autoCompleteTextView.getText().toString();
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_SHORT).show();

            }
        });


    }
}