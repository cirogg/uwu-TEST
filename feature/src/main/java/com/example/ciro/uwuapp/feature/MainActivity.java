package com.example.ciro.uwuapp.feature;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final PackageManager wappPM = getPackageManager();


        final Button botonUwu = findViewById(R.id.cmduwu);
        botonUwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoUwu = "uwu";
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.putExtra(Intent.EXTRA_TEXT,textoUwu);
                whatsappIntent.setType("text/plain");
              //PackageInfo wappPI = wappPM.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                whatsappIntent.setPackage("com.whatsapp");
               // whatsappIntent.setPackage("com.whatsapp");
                startActivity(whatsappIntent);
                /*try{

                    whatsappIntent.setPackage("com.whatsapp");
                    startActivity(whatsappIntent);

                }catch (ActivityNotFoundException ex){
                    Toast.makeText(MainActivity.this, "Whastapp No Instalado", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }





}
