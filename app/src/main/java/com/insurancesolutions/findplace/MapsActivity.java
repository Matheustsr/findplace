package com.insurancesolutions.findplace;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

        // Marcador panificadora
        LatLng sydney = new LatLng(-8.077062, -34.921934);

        mMap.addMarker(
                new MarkerOptions().position( sydney )
                .title("Panificadora Pais e Filhos - (81) 3428-2063 ")
        );

        // Marcador mercadinho mini preço
        LatLng marcador2 = new LatLng(-8.076594, -34.922107);

        mMap.addMarker(
                new MarkerOptions().position( marcador2 )
                        .title("Mercadinho Mini Preço - (81) 9.8632-6324 ")
        );

        // Marcador escola
        LatLng marcador3 = new LatLng(-8.077878, -34.921511);

        mMap.addMarker(
                new MarkerOptions().position( marcador3 )
                        .title("Escola Pátria Unida - (81) 3447-0633 ")
        );

        // Marcador bar do cal
        LatLng marcador4 = new LatLng(-8.074288, -34.922544);

        mMap.addMarker(
                new MarkerOptions().position( marcador4 )
                        .title("Bar Do Cal ")
        );

        // Marcador granja
        LatLng marcador5 = new LatLng(-8.075218, -34.924328);

        mMap.addMarker(
                new MarkerOptions().position( marcador5 )
                        .title("Granja Padre Cícero - (81) 3428-1245 ")
        );

        // Marcador escola
        LatLng marcador6 = new LatLng(-8.072302, -34.922797);

        mMap.addMarker(
                new MarkerOptions().position( marcador6 )
                        .title("Escola Presidente Arthur da Costa e Silva - (81) 9.8835-1612 ")
        );

        // Marcador maximo tec
        LatLng marcador7 = new LatLng(-8.078389, -34.921872);

        mMap.addMarker(
                new MarkerOptions().position( marcador7 )
                        .title("Maximo Tecnologia - (81) 9.8835-1612 ")
        );

        // Marcador lava jato
        LatLng marcador8 = new LatLng(-8.079197, -34.919841);

        mMap.addMarker(
                new MarkerOptions().position( marcador8 )
                        .title("Lava Jato do André - (81) 9.8830-3275 ")
        );

        // Marcador esquinão
        LatLng marcador9 = new LatLng(-8.076716, -34.922604);

        mMap.addMarker(
                new MarkerOptions().position( marcador9 )
                        .title("Esquinão das Frutas - (81) 3445-0995 ")
        );

        // Marcador armazem
        LatLng marcador10 = new LatLng(-8.075990, -34.922917);

        mMap.addMarker(
                new MarkerOptions().position( marcador10 )
                        .title("Armazém Tangará Ltda - (81) 3428-5216 ")
        );

        // Marcador lanchonete
        LatLng marcador11 = new LatLng(-8.075056, -34.923090);

        mMap.addMarker(
                new MarkerOptions().position( marcador11 )
                        .title("Lanchonete e Hamburgueria")
        );


        LatLng marcador12 = new LatLng(-8.075218, -34.924328);

        mMap.addMarker(
                new MarkerOptions().position( marcador12 )
                        .title("Lanchonete e Hamburgueria - (81) 3428-1245 ")
        );

        // Marcador  roda gas
        LatLng marcador13 = new LatLng(-8.076418, -34.923256);

        mMap.addMarker(
                new MarkerOptions().position( marcador13 )
                        .title("Roda Gás - (81) 3447-0892 ")
        );

        // Marcador  connect
        LatLng marcador14 = new LatLng(-8.075218, -34.923205);

        mMap.addMarker(
                new MarkerOptions().position( marcador14 )
                        .title("Connect Fibra - (81) 4042-3051 ")
        );

        // Marcador lipe surf
        LatLng marcador15 = new LatLng(-8.077184,   -34.922678);

        mMap.addMarker(
                new MarkerOptions().position( marcador15 )
                        .title("Lipe surf - (81) 3447-1115 ")
        );

        mMap.moveCamera(
                CameraUpdateFactory.newLatLngZoom(sydney, 16)
        );

    }
}
