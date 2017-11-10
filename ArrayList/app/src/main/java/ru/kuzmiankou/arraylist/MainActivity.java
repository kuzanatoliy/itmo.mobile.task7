package ru.kuzmiankou.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] food = {"Piza","Fri","Hamburger", "Cheeseburger", "Twister"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView foodList = (ListView) findViewById(R.id.foodList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, food);
        foodList.setAdapter(adapter);
    }
}
