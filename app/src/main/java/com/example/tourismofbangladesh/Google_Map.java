package com.example.tourismofbangladesh;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Google_Map extends FragmentActivity implements OnMapReadyCallback {

    String s=null;
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google__map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle bundl1=getIntent().getExtras();
        if(bundl1!=null)
        {
            s=bundl1.getString("name2");

        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sydney;
        if(s.equals("Khan"))
        {
            sydney = new LatLng(22.784842, 89.579641);
        }

        if(s.equals("Khan_Tank"))
        {
            sydney = new LatLng(22.784842, 89.579641);
        }

        if(s.equals("Shipyard"))
        {
            sydney = new LatLng(22.788559, 89.581145);
        }

        if(s.equals("Mazar"))
        {
            sydney = new LatLng(23.895976, 89.153045);
        }
        else
        {
            sydney = new LatLng(23.719263, 90.388943);
        }


        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Khan Jahan Ali Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
