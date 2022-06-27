package com.example.cipm3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import im.crisp.client.Crisp;

public class MainActivity extends AppCompatActivity {
    Button info;
    Button livech;
    //Prefs prefs;
    Button btn;
    TextView txt;/**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Crisp.configure(getApplicationContext(), "9793b001-eb11-4714-bfde-c26c83361406");
        Prefs prefs = new Prefs(this);
        prefs = new Prefs(this);

        txt = findViewById(R.id.itemName);
        btn = findViewById(R.id.itemPrice);
        if (prefs.getPremium()==1){
            //Give the user all the premium features
            //hide ads if you are showing ads
            txt.setText("Your Subscription is Active");
            Log.d("tag","inside yes active suscription");

        } else if (prefs.getPremium()==0){
            //remove user all the premium features
            //show ads to the user
            txt.setText("No active Subscription");
            Log.d("tag","inside no active suscription");
        }


        btn.setOnClickListener(view -> {
            startActivity(new Intent(this,StoreActivity.class));
        });

    }

    private void gotoURl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    public void structures(View vista) {
        Intent intento = new Intent(this, estructuras.class);
        startActivity(intento);
    }

    public void vocabulary(View vista) {
        Intent intento = new Intent(this, vocabulary.class);
        startActivity(intento);

    }

    public void availability(View vista) {
        Intent intento = new Intent(this, availability.class);
        startActivity(intento);

    }

    //billing
    /*public void test(View vist){
        Intent intent = new Intent(this, MainTesting.class);
        startActivity(intent);
    }*/

    public void Cultura(View vista) {
        Intent intento = new Intent(this, Culture.class);
        startActivity(intento);
    }
    public void Test(View vista) {
        Intent intento = new Intent(this, MainTesting.class);
        startActivity(intento);
    }

    public void ConInt(View vista) {
        Intent intento = new Intent(this, rachel.class);
        startActivity(intento);
    }

    public void premium(View vist) {
        Intent intent = new Intent(this, StoreActivity.class);
        startActivity(intent);
    }

    public void profile(View vist) {
        Intent crispIntent = new Intent(this, profile.class);
        startActivity(crispIntent);
    }

    public void chat_maestro(View vist) {
        Intent crispIntent = new Intent(this, chat_maestro.class);
        startActivity(crispIntent);
    }

    public void masinfo(View vist) {
        gotoURl("https://www.facebook.com/olympusgroupmx");
    }

    //Provisonal ventanas de eleccion
    public void chose_est(View vista) {
        Intent intento = new Intent(this, estructura_nuevo.class);
        startActivity(intento);
    }

    public void chose_vocab(View vista) {
        Intent intento = new Intent(this, vocabulary_nuevo.class);
        startActivity(intento);
    }

    public void chose_cultura(View vista) {
        Intent intento = new Intent(this, cultura_nuevo.class);
        startActivity(intento);
    }

    public void chose_aval(View vista) {
        Intent intento = new Intent(this, availability_nuevo.class);
        startActivity(intento);
    }

    public void chose_conscis(View vista) {
        Intent intento = new Intent(this, conscisousinterference_nuevo.class);
        startActivity(intento);
    }

    public void chose_spa_int(View vista) {
        Intent intento = new Intent(this, SpanishInt.class);
        startActivity(intento);
    }

    //cambios

}