package com.insurancesolutions.findplace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void proximaTela(View view){

        Intent intent = new Intent(this, Telasobrenos.class);
        startActivity(intent);


    }

    public void proximaTelasup(View view){

        Intent intent = new Intent(this, telasuporte.class);
        startActivity(intent);




    }

    public void proximaTelamap(View view){

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);




    }

}



