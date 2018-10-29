package net.ukr.vlsv.hw01_04_multiscreenapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomOnClickListener(R.id.hotel, HotelActivity.class);
        setCustomOnClickListener(R.id.cafes, CafesActivity.class);
        setCustomOnClickListener(R.id.fam_attract, FamAttrActivity.class);
        setCustomOnClickListener(R.id.museums, MuseumsActivity.class);
    }
    public void setCustomOnClickListener(int resourceID, final Class className) {
        View view = findViewById(resourceID);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), className);
                        startActivity(intent);
                    }
                }
        );
    }

}
