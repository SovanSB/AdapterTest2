package com.habr25less.adaptertest2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhoneModelAdapter adapter = new PhoneModelAdapter(getApplicationContext(), createList());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public List<PhoneModel> createList() {
        List<PhoneModel> list = new ArrayList<PhoneModel>();
        list.add(new PhoneModel("Iphone", 1, 113451235));
        list.add(new PhoneModel("Samsung", 2, 6666666));
        list.add(new PhoneModel("THL", 3, 1417763567));
        list.add(new PhoneModel("Nokia", 4, 99999999));
        list.add(new PhoneModel("Nokia", 4, 99999999));
        list.add(new PhoneModel("Nokia", 4, 99999999));
        list.add(new PhoneModel("Nokia", 4, 99999999));
        list.add(new PhoneModel("Nokia", 4, 99999999));
        return list;
    }
}
