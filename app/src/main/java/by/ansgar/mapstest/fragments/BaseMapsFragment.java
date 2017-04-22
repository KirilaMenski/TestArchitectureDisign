package by.ansgar.mapstest.fragments;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import by.ansgar.mapstest.R;

/**
 * Created by kirila on 22.4.17.
 */

public class BaseMapsFragment extends Fragment {

    public static final long INTERVAL = 5000;
    public static final long FASTEST_INTERVAL = 3000;

    protected GoogleMap mGoogleMap;
    protected Marker mMarker;
    protected MapView mMapView;
    protected GoogleApiClient mGoogleApiClient;
    protected LocationRequest mLocationRequest;
    protected LatLng mLatLng;

    protected void initMapView(View view, @Nullable Bundle savedInstance, OnMapReadyCallback onMapReadyCallback) {
        mMapView = (MapView) view.findViewById(R.id.map_view);
        mMapView.setClickable(true);
        mMapView.setFocusable(true);
        mMapView.setDuplicateParentStateEnabled(false);
        mMapView.onCreate(savedInstance);
        mMapView.onResume();
        MapsInitializer.initialize(getActivity().getApplicationContext());
        mMapView.getMapAsync(onMapReadyCallback);
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
