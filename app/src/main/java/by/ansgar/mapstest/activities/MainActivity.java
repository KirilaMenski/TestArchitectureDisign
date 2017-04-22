package by.ansgar.mapstest.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import by.ansgar.mapstest.R;
import by.ansgar.mapstest.fragments.FirstMapFragment;
import by.ansgar.mapstest.fragments.SecondMapFragment;
import by.ansgar.mapstest.utils.FragmentUtils;

public class MainActivity extends AppCompatActivity {

    private ImageView mFirst;
    private ImageView mSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirst = (ImageView) findViewById(R.id.first_map_fragment);
        mSecond = (ImageView) findViewById(R.id.second_map_fragment);

        mFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(MainActivity.this, R.id.main_fragment_container, new FirstMapFragment(), false);
            }
        });

        mSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(MainActivity.this, R.id.main_fragment_container, new SecondMapFragment(), false);
            }
        });

        FragmentUtils.replaceFragment(this, R.id.main_fragment_container, new FirstMapFragment(), false);
    }
}
