package com.example.TokoKomputer;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Membuar mark pada tempat tinggal User
        LatLng TempatTinggal = new LatLng(-0.8834549185961647, 119.88073709060355);
        // Custom size marker
        int tinggi = 150;
        int lebar = 90;
        BitmapDrawable bitmapDraw = (BitmapDrawable)getResources().getDrawable(R.drawable.lokasi_faqih);
        Bitmap b = bitmapDraw.getBitmap();
        Bitmap markerKecil = Bitmap.createScaledBitmap(b, lebar, tinggi, false);
        //Masukan Ke Map
        mMap.addMarker(new MarkerOptions().position(TempatTinggal).title("Rumah Saya (Muh. Abdul Faqih F55118082)").snippet("Tempat Tinggal Saya").icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(TempatTinggal, 13.5f));


        LatLng LibraComputerPalu = new LatLng(-0.8850461502086662, 119.88113003408395);
        mMap.addMarker(new MarkerOptions().position(LibraComputerPalu).title("Lokasi Terdekat : Libra Computer Palu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LibraComputerPalu));

        LatLng SaraKomputer = new LatLng(-0.888101908910145, 119.87908837851728);
        mMap.addMarker(new MarkerOptions().position(SaraKomputer).title("Sara Komputer"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SaraKomputer));

        LatLng DreamKomputer = new LatLng(-0.8914239708791241, 119.8748777329625);
        mMap.addMarker(new MarkerOptions().position(DreamKomputer).title("Dream Komputer"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DreamKomputer));

        LatLng SinarMakmurKomputer = new LatLng(-0.8925612853549589, 119.87752032345037);
        mMap.addMarker(new MarkerOptions().position(SinarMakmurKomputer).title("Sinar Makmur Komputer"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SinarMakmurKomputer));

        LatLng MeteorKomputerPalu = new LatLng(-0.8942351153057285, 119.8738456159514);
        mMap.addMarker(new MarkerOptions().position(MeteorKomputerPalu).title("Meteor Komputer Palu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MeteorKomputerPalu));

        LatLng DioKomputerToko = new LatLng(-0.9018694032985507, 119.87176328168152);
        mMap.addMarker(new MarkerOptions().position(DioKomputerToko).title("Dio Komputer Toko"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DioKomputerToko));

        LatLng AyByComputerPalu = new LatLng(-0.904727154008052, 119.88789116459368);
        mMap.addMarker(new MarkerOptions().position(AyByComputerPalu).title("AyBy Computer Palu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AyByComputerPalu));

        mMap.addPolyline(new PolylineOptions().add(
                TempatTinggal,
                new LatLng(-0.8834549185961647, 119.88073709060355),
                new LatLng(-0.8834530173030682, 119.88115180888404),
                new LatLng(-0.8837571930975604, 119.88109008471767),
                new LatLng(-0.884052552178516, 119.88100631620621),
                new LatLng(-0.8848568666999792, 119.88067103545467),
                new LatLng(-0.884973830632481, 119.88088259119775),
                new LatLng(-0.8850461502086662, 119.88113003408395),
                LibraComputerPalu
        ).width(10)
                .color(Color.BLACK)
        );
    }
}