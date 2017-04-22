package by.ansgar.mapstest.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import by.ansgar.mapstest.R;

/**
 * Created by kirila on 22.4.17.
 */

public class FirstMapFragment extends BaseCallbacks {

    TextView mTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_map, container, false);
        mTextView = (TextView) view.findViewById(R.id.tv_first);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), getString(R.string.first_fragment), Toast.LENGTH_SHORT).show();
            }
        });
        initMapView(view, savedInstanceState, this);
        return view;
    }

}
