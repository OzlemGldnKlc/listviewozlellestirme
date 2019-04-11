package com.example.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView liste;
    List<gidalar> gidalar= new ArrayList<gidalar>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gidalar.add(new gidalar("üzüm",2.0));
        gidalar.add(new gidalar("elma",3.0));
        gidalar.add(new gidalar("armut",3.0));



       liste = (ListView) findViewById(R.id.listview);

       OzelAdaptor adaptor=new OzelAdaptor(this,gidalar);
       liste.setAdapter(adaptor);

        //final String[] gidalar = {"Meyveler", "Sebzeler", "Yemişler"};

       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, gidalar);

        //liste.setAdapter(adapter);

       // liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           // @Override
           // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(MainActivity.this,gidalar[position]+" seçtiniz",Toast.LENGTH_LONG).show();

            //}
       /// });


    }
}
