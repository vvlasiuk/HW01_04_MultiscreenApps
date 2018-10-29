package net.ukr.vlsv.hw01_04_multiscreenapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();

        info.add(new Info(R.drawable.mus_one, R.string.one_mus_name, R.string.one_mus_desc, R.string.one_mus_addr, R.string.one_mus_work, R.string.one_mus_tel, R.string.one_mus_site));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
