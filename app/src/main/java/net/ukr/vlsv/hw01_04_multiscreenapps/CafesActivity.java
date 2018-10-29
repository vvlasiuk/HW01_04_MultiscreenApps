package net.ukr.vlsv.hw01_04_multiscreenapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CafesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.cafes_one, R.string.one_cafe_name, R.string.one_cafe_desc, R.string.one_cafe_addr, R.string.one_cafe_work, R.string.one_cafe_tel, R.string.one_cafe_site));
        info.add(new Info(R.drawable.cafes_two, R.string.two_cafe_name, R.string.two_cafe_desc, R.string.two_cafe_addr, R.string.two_cafe_work, R.string.two_cafe_tel, R.string.two_cafe_site));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
