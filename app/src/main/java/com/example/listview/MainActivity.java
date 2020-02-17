package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public ListView listView;
    public String[] fruitNames={"Apple","Orange","Banana","Watermelon","Kiwi","Grapes","Mango","Cucumbers","Bluebarry","Cherry","Apricot","Guava","Dates"};
    public String[] fruitsDescription={"this is apple","this is orange","this is banana","this is watermelon","this is kiwi","this is grapes","this is mango","this is cucumbers","this is blueberry","this is cherry",
                                       "this is apricot","this is guava","this is dates"};
    public Integer[] imageId={R.drawable.apple,R.drawable.orange,R.drawable.banana,R.drawable.watermelon,R.drawable.kiwi,R.drawable.grapes,R.drawable.mango,R.drawable.cucumbers,R.drawable.blueberry,
                              R.drawable.cherry,R.drawable.apricot,R.drawable.guava,R.drawable.dates};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        listView=findViewById ( R.id.activity_main_list_view);

        AdapterListView adapterListView=new AdapterListView ( this,fruitNames,fruitsDescription,imageId );
        listView.setAdapter ( adapterListView );

    }
}
