package com.example.cipm3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

public class Culture extends AppCompatActivity {
    VideoView vv;
    Spinner spin;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView text10;
    TextView text11;
    TextView text12;

    Button get;
    String selection;
    boolean clip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);
        vv = findViewById(R.id.vvcult);
        spin = findViewById(R.id.spinercult);
        text1 = findViewById(R.id.text1);
        text1.setVisibility(View.INVISIBLE);
        text2 = findViewById(R.id.text22);
        text2.setVisibility(View.INVISIBLE);
        text3 = findViewById(R.id.text3);
        text3.setVisibility(View.INVISIBLE);
        text4 = findViewById(R.id.text4);
        text4.setVisibility(View.INVISIBLE);
        text5 = findViewById(R.id.text5);
        text5.setVisibility(View.INVISIBLE);
        text6 = findViewById(R.id.text6);
        text6.setVisibility(View.INVISIBLE);
        text7 = findViewById(R.id.text7);
        text7.setVisibility(View.INVISIBLE);
        text8 = findViewById(R.id.text8);
        text8.setVisibility(View.INVISIBLE);
        text9 = findViewById(R.id.text9);
        text9.setVisibility(View.INVISIBLE);
        text10 = findViewById(R.id.text10);
        text10.setVisibility(View.INVISIBLE);
        text11 = findViewById(R.id.text11);
        text11.setVisibility(View.INVISIBLE);
        text12 = findViewById(R.id.text12);
        text12.setVisibility(View.INVISIBLE);
        get = findViewById(R.id.getbtn);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cultura, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection = spin.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    //showV
    public void showv(View vista){
        Button getbtn=(Button)findViewById(R.id.getbtn);
        if(vv.isPlaying()){
            vv.stopPlayback();
            if(clip){
                text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
                text6.setText("");
                text7.setText("");
                text8.setText("");
                text9.setText("");
                text10.setText("");
                text11.setText("");
                text12.setText("");
            }
            switch (selection){
                case "Moonlight Explanation 1":
                    clip=false;
                    getbtn.setVisibility(View.INVISIBLE);
                    Uri uri = Uri.parse("http://adrianlealcaldera.com/moonlightexp.mp4");
                    vv.setVideoURI(uri);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    break;

                case "Moonlight Clip 1":
                    clip=true;
                    Uri uri1 = Uri.parse("http://adrianlealcaldera.com/moonlightclip.mp4");
                    vv.setVideoURI(uri1);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Rick and Morty Explanation 2":
                    clip=false;
                    Uri uri2 = Uri.parse("http://adrianlealcaldera.com/rickandmortyexp.mp4");
                    vv.setVideoURI(uri2);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Rick and Morty Clip 2":
                    clip=true;
                    Uri uri2dos = Uri.parse("http://adrianlealcaldera.com/riackandmortyclip.mp4");
                    vv.setVideoURI(uri2dos);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Do You Want Pepsi Explanation 3":
                    clip=false;
                    Uri uri3 = Uri.parse("http://adrianlealcaldera.com/doyouwantpepsiExp1.mp4");
                    vv.setVideoURI(uri3);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Do You Want Pepsi Clip 3":
                    clip=true;
                    Uri uri3tres = Uri.parse("http://adrianlealcaldera.com/doyouwantpepsiClip.mp4");
                    vv.setVideoURI(uri3tres);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
                case "Sangre Por Sangre Foodline Explanation 4":
                    clip=false;
                    Uri uri4 = Uri.parse("http://adrianlealcaldera.com/sangrexsangrefoodlineExp.mp4");
                    vv.setVideoURI(uri4);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Sangre Por Sangre Foodline Clip 4":
                    clip=true;
                    Uri uri4cuatro = Uri.parse("http://adrianlealcaldera.com/sangrexsangrefoodlineClip.mp4");
                    vv.setVideoURI(uri4cuatro);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
                case "Sangre Por Sangre Watch El Paisaje Explanation 5":
                    clip=false;
                    Uri uri5 = Uri.parse("http://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeExp.mp4");
                    vv.setVideoURI(uri5);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Sangre Por Sangre Watch El Paisaje Clip 5":
                    clip=true;
                    Uri uri5cinco = Uri.parse("http://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeClip.mp4");
                    vv.setVideoURI(uri5cinco);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
                case "Training Day Rabbit Has The Gun Explanation 6":
                    clip=false;
                    Uri uri6 = Uri.parse("http://adrianlealcaldera.com/trainingdayrabbithasthegunExp.mp4");
                    vv.setVideoURI(uri6);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Training Day Rabbit Has The Gun Clip 6":
                    clip=true;
                    Uri uri6seis = Uri.parse("http://adrianlealcaldera.com/trainingdayrabbithasthegunClip.mp4");
                    vv.setVideoURI(uri6seis);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Hancock Train Explanation 7":
                    clip=false;
                    Uri uri7 = Uri.parse("http://adrianlealcaldera.com/hancocktrainExp.mp4");
                    vv.setVideoURI(uri7);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Hancock Train Clip 7":
                    clip=true;
                    Uri uri7siete = Uri.parse("http://adrianlealcaldera.com/hancocktrainClip.mp4");
                    vv.setVideoURI(uri7siete);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Malcom in the Middle Teacher Explanation 8":
                    clip=false;
                    Uri uri8 = Uri.parse("http://adrianlealcaldera.com/malconinthemiddleteacherExp.mp4");
                    vv.setVideoURI(uri8);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Malcom in the Middle Teacher Clip 8":
                    clip=true;
                    Uri uri8ocho = Uri.parse("http://adrianlealcaldera.com/malconinthemiddleteacherClip.mp4");
                    vv.setVideoURI(uri8ocho);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Sangre Por Sangre Comedor Explanation 9":
                    clip=false;
                    Uri uri9 = Uri.parse("http://adrianlealcaldera.com/sangrexsangre(comedor)Exp.mp4");
                    vv.setVideoURI(uri9);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Sangre Por Sangre Comedor Clip 9":
                    clip=true;
                    Uri uri9nueve = Uri.parse("http://adrianlealcaldera.com/sangrexsangre(comedor)Clip.mp4");
                    vv.setVideoURI(uri9nueve);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Dave Chapelle Man Rape Explanation 10":
                    clip=false;
                    Uri uri10 = Uri.parse("http://adrianlealcaldera.com/davechapelle(man%20rape)Exp.mp4");
                    vv.setVideoURI(uri10);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Dave Chapelle Man Rape Clip 10":
                    clip=true;
                    Uri uri10diez = Uri.parse("http://adrianlealcaldera.com/davechapelle(man%20rape)Clip.mp4");
                    vv.setVideoURI(uri10diez);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                //luis R

                case "Análisis de cultura Gringa y Frases Coloquiales 2 Explanation 11":
                    clip=false;
                    Uri uri11 = Uri.parse("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Exp.mp4");
                    vv.setVideoURI(uri11);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Análisis de cultura Gringa y Frases Coloquiales 2 Clip 11":
                    clip=true;
                    Uri uri11once = Uri.parse("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Clip.mp4");
                    vv.setVideoURI(uri11once);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Boys in the Hood Explanation 12":
                    clip=false;
                    Uri uri12 = Uri.parse("https://adrianlealcaldera.com/BoyzntheHoodExp.mp4");
                    vv.setVideoURI(uri12);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Boys in the Hood Clip 12":
                    clip=true;
                    Uri uri12doce = Uri.parse("https://adrianlealcaldera.com/BoyzntheHoodClip.mp4");
                    vv.setVideoURI(uri12doce);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Cultura y Fonética Explanation 13":
                    clip=false;
                    Uri uri13 = Uri.parse("https://adrianlealcaldera.com/CulturayFone%CC%81ticaExp.mp4");
                    vv.setVideoURI(uri13);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Cultura y Fonética Clip 13":
                    clip=true;
                    Uri uri13trece = Uri.parse("https://adrianlealcaldera.com/CulturayFone%CC%81ticaClip.mp4");
                    vv.setVideoURI(uri13trece);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
            }
        }else{
            if(clip){
                text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
                text6.setText("");
                text7.setText("");
                text8.setText("");
                text9.setText("");
                text10.setText("");
                text11.setText("");
                text12.setText("");
            }
            switch (selection){
                case "Moonlight Explanation 1":
                    clip=false;
                    getbtn.setVisibility(View.INVISIBLE);
                    Uri uri = Uri.parse("http://adrianlealcaldera.com/moonlightexp.mp4");
                    vv.setVideoURI(uri);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();

                    break;

                case "Moonlight Clip 1":
                    clip=true;
                    Uri uri1 = Uri.parse("http://adrianlealcaldera.com/moonlightclip.mp4");
                    vv.setVideoURI(uri1);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Rick and Morty Explanation 2":
                    clip=false;
                    Uri uri2 = Uri.parse("http://adrianlealcaldera.com/rickandmortyexp.mp4");
                    vv.setVideoURI(uri2);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Rick and Morty Clip 2":
                    clip=true;
                    Uri uri2dos = Uri.parse("http://adrianlealcaldera.com/riackandmortyclip.mp4");
                    vv.setVideoURI(uri2dos);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Do You Want Pepsi Explanation 3":
                    clip=false;
                    Uri uri3 = Uri.parse("http://adrianlealcaldera.com/doyouwantpepsiExp1.mp4");
                    vv.setVideoURI(uri3);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Do You Want Pepsi Clip 3":
                    clip=true;
                    Uri uri3tres = Uri.parse("http://adrianlealcaldera.com/doyouwantpepsiClip.mp4");
                    vv.setVideoURI(uri3tres);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
                case "Sangre Por Sangre Foodline Explanation 4":
                    clip=false;
                    Uri uri4 = Uri.parse("http://adrianlealcaldera.com/sangrexsangrefoodlineExp.mp4");
                    vv.setVideoURI(uri4);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Sangre Por Sangre Foodline Clip 4":
                    clip=true;
                    Uri uri4cuatro = Uri.parse("http://adrianlealcaldera.com/sangrexsangrefoodlineClip.mp4");
                    vv.setVideoURI(uri4cuatro);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
                case "Sangre Por Sangre Watch El Paisaje Explanation 5":
                    clip=false;
                    Uri uri5 = Uri.parse("http://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeExp.mp4");
                    vv.setVideoURI(uri5);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Sangre Por Sangre Watch El Paisaje Clip 5":
                    clip=true;
                    Uri uri5cinco = Uri.parse("http://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeClip.mp4");
                    vv.setVideoURI(uri5cinco);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
                case "Training Day Rabbit Has The Gun Explanation 6":
                    clip=false;
                    Uri uri6 = Uri.parse("http://adrianlealcaldera.com/trainingdayrabbithasthegunExp.mp4");
                    vv.setVideoURI(uri6);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Training Day Rabbit Has The Gun Clip 6":
                    clip=true;
                    Uri uri6seis = Uri.parse("http://adrianlealcaldera.com/trainingdayrabbithasthegunClip.mp4");
                    vv.setVideoURI(uri6seis);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Hancock Train Explanation 7":
                    clip=false;
                    Uri uri7 = Uri.parse("http://adrianlealcaldera.com/hancocktrainExp.mp4");
                    vv.setVideoURI(uri7);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Hancock Train Clip 7":
                    clip=true;
                    Uri uri7siete = Uri.parse("http://adrianlealcaldera.com/hancocktrainClip.mp4");
                    vv.setVideoURI(uri7siete);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Malcom in the Middle Teacher Explanation 8":
                    clip=false;
                    Uri uri8 = Uri.parse("http://adrianlealcaldera.com/malconinthemiddleteacherExp.mp4");
                    vv.setVideoURI(uri8);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Malcom in the Middle Teacher Clip 8":
                    clip=true;
                    Uri uri8ocho = Uri.parse("http://adrianlealcaldera.com/malconinthemiddleteacherClip.mp4");
                    vv.setVideoURI(uri8ocho);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Sangre Por Sangre Comedor Explanation 9":
                    clip=false;
                    Uri uri9 = Uri.parse("http://adrianlealcaldera.com/sangrexsangre(comedor)Exp.mp4");
                    vv.setVideoURI(uri9);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Sangre Por Sangre Comedor Clip 9":
                    clip=true;
                    Uri uri9nueve = Uri.parse("http://adrianlealcaldera.com/sangrexsangre(comedor)Clip.mp4");
                    vv.setVideoURI(uri9nueve);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Dave Chapelle Man Rape Explanation 10":
                    clip=false;
                    Uri uri10 = Uri.parse("http://adrianlealcaldera.com/davechapelle(man%20rape)Exp.mp4");
                    vv.setVideoURI(uri10);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Dave Chapelle Man Rape Clip 10":
                    clip=true;
                    Uri uri10diez = Uri.parse("http://adrianlealcaldera.com/davechapelle(man%20rape)Clip.mp4");
                    vv.setVideoURI(uri10diez);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                //luis R
                case "Análisis de cultura Gringa y Frases Coloquiales 2 Explanation 11":
                    clip=false;
                    Uri uri11 = Uri.parse("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Exp.mp4");
                    vv.setVideoURI(uri11);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Análisis de cultura Gringa y Frases Coloquiales 2 Clip 11":
                    clip=true;
                    Uri uri11once = Uri.parse("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Clip.mp4");
                    vv.setVideoURI(uri11once);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Boys in the Hood Explanation 12":
                    clip=false;
                    Uri uri12 = Uri.parse("https://adrianlealcaldera.com/BoyzntheHoodExp.mp4");
                    vv.setVideoURI(uri12);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Boys in the Hood Clip 12":
                    clip=true;
                    Uri uri12doce = Uri.parse("https://adrianlealcaldera.com/BoyzntheHoodClip.mp4");
                    vv.setVideoURI(uri12doce);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;

                case "Cultura y Fonética Explanation 13":
                    clip=false;
                    Uri uri13 = Uri.parse("https://adrianlealcaldera.com/CulturayFone%CC%81ticaExp.mp4");
                    vv.setVideoURI(uri13);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.INVISIBLE);
                    break;

                case "Cultura y Fonética Clip 13":
                    clip=true;
                    Uri uri13trece = Uri.parse("https://adrianlealcaldera.com/CulturayFone%CC%81ticaClip.mp4");
                    vv.setVideoURI(uri13trece);
                    vv.setMediaController(new MediaController(this));
                    vv.requestFocus();
                    vv.start();
                    getbtn.setVisibility(View.VISIBLE);
                    break;
            }
        }
    }

    //getPos
    public void getpos(View vista){
        switch (selection){
            case "Moonlight Clip 1":

                //Ain't no refund
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>36000&& g<38000){
                        String txt1 = "Ain't no refund";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(36000);

                            }
                        };
                        ss.setSpan(txtone,0,15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //Thought you was on vacation
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>36000&& g<38000){
                        String txt2 = "Thought you was on vacation";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(36000);

                            }
                        };
                        ss2.setSpan(txtwo,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }




                }
                //How peanut working out
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>48000&& g<50000){
                        String txt3 = "How peanut working out";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtthree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(48000);
                            }
                        };
                        ss3.setSpan(txtthree,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }




                }
                //I got him in check
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>50000&& g<52000){
                        String txt4 = "I got him in check";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtfour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) { vv.seekTo(50000); }
                        };
                        ss4.setSpan(txtfour,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //I ain´t go let that go down
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>62800&& g<65000 || g>70000&& g<73000 ){
                        String txt5 = "I ain´t go let that go down";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtfive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) { vv.seekTo(62800); }
                        };
                        ss5.setSpan(txtfive,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //What´s up
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>93000 && g<95600){
                        String txt6 = "What´s up";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);

                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtsix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(93000); }
                        };
                        ss6.setSpan(txtsix,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //it´s all good
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>96000 && g<96700 || g>103000 && g<105000 ){
                        String txt7 = "it´s all good";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);

                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtseven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(96000); }
                        };
                        ss7.setSpan(txtseven,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //What are you doing
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>97000 && g<99000 ){
                        String txt8 = "What are you doing";
                        text8.setVisibility(View.VISIBLE);
                        text8.setText(txt8);

                        SpannableString ss8= new SpannableString(txt8);
                        ClickableSpan txteight= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(97000); }
                        };
                        ss8.setSpan(txteight,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text8.setText(ss8);
                        text8.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //What is wrong with you
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>107000 && g<108000 ){
                        String txt9 = "What is wrong with you";
                        text9.setVisibility(View.VISIBLE);
                        text9.setText(txt9);

                        SpannableString ss9= new SpannableString(txt9);
                        ClickableSpan txtnine= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(107000); }
                        };
                        ss9.setSpan(txtnine,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text9.setText(ss9);
                        text9.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //Get the fuck out of here
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>115000 && g<116000 ){
                        String txt10 = "Get the fuck out of here";
                        text10.setVisibility(View.VISIBLE);
                        text10.setText(txt10);

                        SpannableString ss10= new SpannableString(txt10);
                        ClickableSpan txtTen= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(115000); }
                        };
                        ss10.setSpan(txtTen,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text10.setText(ss10);
                        text10.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //Have you ever
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>179000 && g<180200 ){
                        String txt11 = "Have you ever";
                        text11.setVisibility(View.VISIBLE);
                        text11.setText(txt11);

                        SpannableString ss11= new SpannableString(txt11);
                        ClickableSpan txteleven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(179000); }
                        };
                        ss11.setSpan(txteleven,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text11.setText(ss11);
                        text11.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }

                break;
            case "Rick and Morty Clip 2":

                //what's up
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>1000 && g<2000){
                        String txt1 = "what's up";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(100);

                            }
                        };
                        ss.setSpan(txtone,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //no can do
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>5000 && g<7000){
                        String txt2 = "no can do";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txttwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(5000);

                            }
                        };
                        ss2.setSpan(txttwo,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //when i feel like it
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>16000 && g<17500){
                        String txt3 = "when i feel like it";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtthree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(16000);

                            }
                        };
                        ss3.setSpan(txtthree,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you need to chill out
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>18000 && g<20000){
                        String txt4 = "you need to chill out";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtfour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(18000);

                            }
                        };
                        ss4.setSpan(txtfour,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //tryna - (trying to)
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>22000 && g<24000){
                        String txt5 = "tryna - (trying to)";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtfive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(21000);

                            }
                        };
                        ss5.setSpan(txtfive,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you know what
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>24000 && g<25000){
                        String txt6 = "you know what";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtsix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(24000);

                            }
                        };
                        ss6.setSpan(txtsix,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //hanging out
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>26000 && g<28000){
                        String txt7 = "hanging out";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);
                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtseven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(26000);

                            }
                        };
                        ss7.setSpan(txtseven,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you're overthinking it
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>54000 && g<58000){
                        String txt8 = "you're overthinking it";
                        text8.setVisibility(View.VISIBLE);
                        text8.setText(txt8);
                        SpannableString ss8= new SpannableString(txt8);
                        ClickableSpan txteight= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(54000);

                            }
                        };
                        ss8.setSpan(txteight,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text8.setText(ss8);
                        text8.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //get your shit together
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>104000 && g<106000){
                        String txt9 = "get your shit together";
                        text9.setVisibility(View.VISIBLE);
                        text9.setText(txt9);
                        SpannableString ss9= new SpannableString(txt9);
                        ClickableSpan txtnine= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(104000);

                            }
                        };
                        ss9.setSpan(txtnine,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text9.setText(ss9);
                        text9.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //to be into
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>4000 && g<5000){
                        String txt10 = "to be into";
                        text10.setVisibility(View.VISIBLE);
                        text10.setText(txt10);
                        SpannableString ss10= new SpannableString(txt10);
                        ClickableSpan txtten= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(4000);

                            }
                        };
                        ss10.setSpan(txtten,0,10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text10.setText(ss10);
                        text10.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Do You Want Pepsi Clip 3":

                //is there anything else a can get for you
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>0 && g<2000){
                        String txt1 = "is there anything else a can get for you";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(100);

                            }
                        };
                        ss.setSpan(txtone,0,40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //ain't got no
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>6000 && g<7000){
                        String txt2 = "ain't got no";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(6000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //do you want
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>7000 && g<8000){
                        String txt3 = "do you want";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThre= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(7000);

                            }
                        };
                        ss3.setSpan(txtThre,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i was just wondering
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>15000 && g<16000){
                        String txt4 = "i was just wondering";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFourth= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(15000);

                            }
                        };
                        ss4.setSpan(txtFourth,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //might as well
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>16000 && g<17000){
                        String txt5 = "might as well";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(16000);

                            }
                        };
                        ss5.setSpan(txtFive,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you fell me
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>17000 && g<18000){
                        String txt6 = "you fell me";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(17000);

                            }
                        };
                        ss6.setSpan(txtSix,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //is there a problem
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>28000 && g<30000){
                        String txt7 = "is there a problem";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);
                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtSeven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(28000);

                            }
                        };
                        ss7.setSpan(txtSeven,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i didn't want
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>31000 && g<32000){
                        String txt8 = "i didn't want";
                        text8.setVisibility(View.VISIBLE);
                        text8.setText(txt8);
                        SpannableString ss8= new SpannableString(txt8);
                        ClickableSpan txtEight= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(31000);

                            }
                        };
                        ss8.setSpan(txtEight,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text8.setText(ss8);
                        text8.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //why would you
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>33000 && g<35000 || g>36000 && g<37000){
                        String txt9 = "why would you";
                        text9.setVisibility(View.VISIBLE);
                        text9.setText(txt9);
                        SpannableString ss9= new SpannableString(txt9);
                        ClickableSpan txtNine= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(33000);

                            }
                        };
                        ss9.setSpan(txtNine,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text9.setText(ss9);
                        text9.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;
            case "Sangre Por Sangre Foodline Clip 4":

                //you aint going to no prom soon
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>8000 && g<10000){
                        String txt1 = "you ain't going to no prom soon";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(8000);

                            }
                        };
                        ss.setSpan(txtone,0,31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //aint nothing but
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>15000 && g<16000){
                        String txt2 = "ain't nothing but";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(15000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i aint no muslim
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>25000 && g<27000){
                        String txt3 = "i ain't no muslim";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(25000);

                            }
                        };
                        ss3.setSpan(txtThree,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i aint no moving
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>31000 && g<33000){
                        String txt4 = "i ain't no moving";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFourth= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(31000);

                            }
                        };
                        ss4.setSpan(txtFourth,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //there is a ray of sunshine
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>61000 && g<63000){
                        String txt5 = "there is a ray of sunshine";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(61000);

                            }
                        };
                        ss5.setSpan(txtFive,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i aint buying whats mine
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>132000 && g<134000){
                        String txt6 = "i ain't buying what's mine";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(132000);

                            }
                        };
                        ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you've getting by with that shit
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>155000 && g<158000){
                        String txt7 = "you've getting by with that shit";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);
                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtSeven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(155000);

                            }
                        };
                        ss7.setSpan(txtSeven,0,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Sangre Por Sangre Watch El Paisaje Clip 5":

                //i'm here to jack you up
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>23000 && g<25000){
                        String txt1 = "i'm here to jack you up";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(23000);

                            }
                        };
                        ss.setSpan(txtone,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //what do you want to do
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>42000 && g<44000){
                        String txt2 = "what do you want to do";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(42000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you gotta pay your dues
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>45000 && g<47000){
                        String txt3 = "you gotta pay your dues";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(45000);

                            }
                        };
                        ss3.setSpan(txtThree,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you wanna throw down
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>48000 && g<50000){
                        String txt4 = "you wanna throw down";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFourth= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(48000);

                            }
                        };
                        ss4.setSpan(txtFourth,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //catch you on the rebound
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>82000 && g<85000){
                        String txt5 = "catch you on the rebound";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(82000);

                            }
                        };
                        ss5.setSpan(txtFive,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //should't done that
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>135000 && g<137000){
                        String txt6 = "should't done that";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(135000);

                            }
                        };
                        ss6.setSpan(txtSix,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Training Day Rabbit Has The Gun Clip 6":

                //is no fun
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>12000 && g<14000){
                        String txt1 = "is no fun";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(12000);

                            }
                        };
                        ss.setSpan(txtone,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //who want to get paid
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>32000 && g<34000 || g>35000 && g<37000){
                        String txt2 = "who want to get paid";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(32000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i'm glad to hear that
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>49000 && g<51000){
                        String txt3 = "i'm glad to hear that";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(49000);

                            }
                        };
                        ss3.setSpan(txtThree,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //what are you gonna do
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>57000 && g<59000){
                        String txt4 = "what are you gonna do";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(57000);

                            }
                        };
                        ss4.setSpan(txtFour,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //there it is
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>67000 && g<69000){
                        String txt5 = "there it is";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(67000);

                            }
                        };
                        ss5.setSpan(txtFive,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //havent ever - ain't never
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>73000 && g<75000){
                        String txt6 = "haven't ever - ain't never";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(73000);

                            }
                        };
                        ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you get me twisted
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>118000 && g<120000){
                        String txt7 = "you get me twisted";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);
                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtSeven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(118000);

                            }
                        };
                        ss7.setSpan(txtSeven,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //ain't got it in you
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>139000 && g<141000 || g>176000 && g<178000){
                        String txt8 = "ain't got it in you";
                        text8.setVisibility(View.VISIBLE);
                        text8.setText(txt8);
                        SpannableString ss8= new SpannableString(txt8);
                        ClickableSpan txtEigth= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(176000);

                            }
                        };
                        ss8.setSpan(txtEigth,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text8.setText(ss8);
                        text8.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //ima get - i'm going to get
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>152000 && g<154000 || g>155000 && g<157000 || g>173000 && g<174000 || g>175000 && g<177000){
                        String txt9 = "ima get - i'm going to get";
                        text9.setVisibility(View.VISIBLE);
                        text9.setText(txt9);
                        SpannableString ss9= new SpannableString(txt9);
                        ClickableSpan txtNine= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(152000);

                            }
                        };
                        ss9.setSpan(txtNine,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text9.setText(ss9);
                        text9.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you ain't go
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>156000 && g<158000 || g>158000 && g<160000 ){
                        String txt10 = "you ain't go";
                        text10.setVisibility(View.VISIBLE);
                        text10.setText(txt10);
                        SpannableString ss10= new SpannableString(txt10);
                        ClickableSpan txtTen= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(156000);

                            }
                        };
                        ss10.setSpan(txtTen,0,12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text10.setText(ss10);
                        text10.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Hancock Train Clip 7":

                //i'm on my way
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>1000 && g<3000){
                        String txt1 = "i'm on my way";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(1000);

                            }
                        };
                        ss.setSpan(txtone,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i'll see you in about
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>15000 && g<18000){
                        String txt2 = "i'll see you in about";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(15000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //are you alright
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>76000 && g<78000){
                        String txt3 = "i'll see you in about";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(76000);

                            }
                        };
                        ss3.setSpan(txtThree,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //you're the one who/that
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>126000 && g<129000){
                        String txt4 = "you're the one who/that";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(126000);

                            }
                        };
                        ss4.setSpan(txtFour,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //why didn't you just
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>126000 && g<129000){
                        String txt5 = "why didn't you just";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(126000);

                            }
                        };
                        ss5.setSpan(txtFive,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //coulda shoulda - could/should have
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>175000 && g<178000){
                        String txt6 = "coulda shoulda - could/should have";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(175000);

                            }
                        };
                        ss6.setSpan(txtSix,0,34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Malcom in the Middle Teacher Clip 8":

                //you're nothing but a
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>0 && g<2000){
                        String txt1 = "you're nothing but a";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(0);

                            }
                        };
                        ss.setSpan(txtone,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //took you long enough
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>9000 && g<10000){
                        String txt2 = "took you long enough";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(9000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i've been trynna / trying to
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>11000 && g<13000){
                        String txt3 = "i've been trynna / trying to";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(9000);

                            }
                        };
                        ss3.setSpan(txtThree,0,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //what do you want
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>18000 && g<20000){
                        String txt4 = "what do you want";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(18000);

                            }
                        };
                        ss4.setSpan(txtFour,0,16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //it's just a bunch of
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>32000 && g<34000){
                        String txt5 = "it's just a bunch of";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(32000);

                            }
                        };
                        ss5.setSpan(txtFive,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //rub somebody the wrong way
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>88000 && g<90000){
                        String txt6 = "rub somebody the wrong way";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(88000);

                            }
                        };
                        ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Sangre Por Sangre Comedor Clip 9":

                //you wanna buy
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>17000 && g<19000){
                        String txt1 = "you wanna buy";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(17000);

                            }
                        };
                        ss.setSpan(txtone,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //get your hands off
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>26000 && g<28000){
                        String txt2 = "get your hands off";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(26000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //give it to one of my
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>120000 && g<123000){
                        String txt3 = "give it to one of my";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(120000);

                            }
                        };
                        ss3.setSpan(txtThree,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //i'm gonna have to
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>200000 && g<203000){
                        String txt4 = "i'm gonna have to";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(200000);

                            }
                        };
                        ss4.setSpan(txtFour,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //what's the matter
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>205000 && g<206000){
                        String txt5 = "what's the matter";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(205000);

                            }
                        };
                        ss5.setSpan(txtFive,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //ain't you ever
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>207000 && g<209000){
                        String txt6 = "ain't you ever";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(207000);

                            }
                        };
                        ss6.setSpan(txtSix,0,14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //what are you looking for
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>260000 && g<262000){
                        String txt7 = "what are you looking for";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);
                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtSeven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(260000);

                            }
                        };
                        ss7.setSpan(txtSeven,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Dave Chapelle Man Rape Clip 10":

                //i'm one of those people
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>1000 && g<3000 || g>13000 && g<15000){
                        String txt1 = "i'm one of those people";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(1000);

                            }
                        };
                        ss.setSpan(txtone,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //and i'm scared to live
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>6000 && g<8000 || g>20000 && g<22000){
                        String txt2 = "and i'm scared to live";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(6000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Análisis de cultura Gringa y Frases Coloquiales 2 Clip 11":

                //If ther is some firing Going on✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>1000 && g<3000){
                        String txt1 = "If ther is some firing Going on";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(1000);

                            }
                        };
                        ss.setSpan(txtone,0,31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //We first So we pretty much expect it✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>3000 && g<7000){
                        String txt2 = "We first So we pretty much expect it";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(3000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //I know what im Talking about✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>7600 && g<9000){
                        String txt3 = "I know what im Talking about";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(7600);

                            }
                        };
                        ss3.setSpan(txtThree,0,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //I done had a lot of jobs✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>8900 && g<10000){
                        String txt4 = "I done had a lot of jobs";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(8900);

                            }
                        };
                        ss4.setSpan(txtFour,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //Got into✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>10000 && g<12000){
                        String txt5 = "Got into";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(10000);

                            }
                        };
                        ss5.setSpan(txtFive,0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //Out of them✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>15000 && g<16500){
                        String txt6 = "Out of them";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(15000);

                            }
                        };
                        ss6.setSpan(txtSix,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Boys in the Hood Clip 12":

                //What’s wrong with you✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>12000 && g<14000){
                        String txt1 = "What’s wrong with you";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(12000);

                            }
                        };
                        ss.setSpan(txtone,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //What the fuck are you looking at✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>15000  && g<17000){
                        String txt2 = "What the fuck are you looking at";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(15000);

                            }
                        };
                        ss2.setSpan(txtTwo,0,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //I’m Still trying to find out “Tryna”✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>16800 && g<19000){
                        String txt3 = "I’m Still trying to find out “Tryna”";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(16800);

                            }
                        };
                        ss3.setSpan(txtThree,0,36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //We got a problem here?✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>21000 && g<23000){
                        String txt4 = "We got a problem here?";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(21000);

                            }
                        };
                        ss4.setSpan(txtFour,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //Start some shit✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>55000 && g<57000){
                        String txt5 = "Start some shit";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(55000);

                            }
                        };
                        ss5.setSpan(txtFive,0,15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //That’s why fool be getting shot all the time✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>61000 && g<63000){
                        String txt6 = "That’s why fool be getting shot all the time";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(61000);

                            }
                        };
                        ss6.setSpan(txtSix,0,44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //Tryna show how hard they is✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>64000 && g<66000){
                        String txt7 = "Tryna show how hard they is";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);
                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtSeven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(64000);

                            }
                        };
                        ss7.setSpan(txtSeven,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //You be doing that shit, too✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>69000 && g<72000){
                        String txt8 = "You be doing that shit, too";
                        text8.setVisibility(View.VISIBLE);
                        text8.setText(txt8);
                        SpannableString ss8= new SpannableString(txt8);
                        ClickableSpan txtEigth= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(69000);

                            }
                        };
                        ss8.setSpan(txtEigth,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text8.setText(ss8);
                        text8.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }
                //I’m getting the fuck out of LA✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>102000 && g<106000){
                        String txt9 = "I’m getting the fuck out of LA";
                        text9.setVisibility(View.VISIBLE);
                        text9.setText(txt9);
                        SpannableString ss9= new SpannableString(txt9);
                        ClickableSpan txtNine= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(102000);

                            }
                        };
                        ss9.setSpan(txtNine,0,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text9.setText(ss9);
                        text9.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                }

                break;

            case "Cultura y Fonética Clip 13":

                //Look man I don’t mean no disrespect or nothing G✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>150 && g<2080){
                        String txt1 = "Look man I don’t mean no disrespect or nothing G";
                        text1.setVisibility(View.VISIBLE);
                        text1.setText(txt1);
                        SpannableString ss= new SpannableString(txt1);
                        ClickableSpan txtone= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(150);

                            }
                        };
                        ss.setSpan(txtone,0,48, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text1.setText(ss);
                        text1.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //I’m just trying to see✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>2250 && g<3000){
                        String txt2 = "I’m just trying to see";
                        text2.setVisibility(View.VISIBLE);
                        text2.setText(txt2);
                        SpannableString ss2= new SpannableString(txt2);
                        ClickableSpan txtTwo= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(2250);

                            }
                        };
                        ss2.setSpan(txtTwo,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text2.setText(ss2);
                        text2.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //If can get a little bro✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>3050 && g<3450){
                        String txt3 = "If can get a little bro";
                        text3.setVisibility(View.VISIBLE);
                        text3.setText(txt3);
                        SpannableString ss3= new SpannableString(txt3);
                        ClickableSpan txtThree= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(3050);

                            }
                        };
                        ss3.setSpan(txtThree,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text3.setText(ss3);
                        text3.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //You can’t get nothing man✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>4000 && g<5000){
                        String txt4 = "You can’t get nothing man";
                        text4.setVisibility(View.VISIBLE);
                        text4.setText(txt4);
                        SpannableString ss4= new SpannableString(txt4);
                        ClickableSpan txtFour= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(4000);

                            }
                        };
                        ss4.setSpan(txtFour,0,25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text4.setText(ss4);
                        text4.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //You know what time it is✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>5000 && g<6000){
                        String txt5 = "You know what time it is";
                        text5.setVisibility(View.VISIBLE);
                        text5.setText(txt5);
                        SpannableString ss5= new SpannableString(txt5);
                        ClickableSpan txtFive= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(5000);

                            }
                        };
                        ss5.setSpan(txtFive,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text5.setText(ss5);
                        text5.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //I keep looking out for you✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>6900 && g<7500){
                        String txt6 = "I keep looking out for you";
                        text6.setVisibility(View.VISIBLE);
                        text6.setText(txt6);
                        SpannableString ss6= new SpannableString(txt6);
                        ClickableSpan txtSix= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(6900);

                            }
                        };
                        ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text6.setText(ss6);
                        text6.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //Just a little something man✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>8000 && g<8800){
                        String txt7 = "Just a little something man";
                        text7.setVisibility(View.VISIBLE);
                        text7.setText(txt7);
                        SpannableString ss7= new SpannableString(txt7);
                        ClickableSpan txtSeven= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(8000);

                            }
                        };
                        ss7.setSpan(txtSeven,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text7.setText(ss7);
                        text7.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //All my soothing cost a little something✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>9000 && g<10800){
                        String txt8 = "All my soothing cost a little something";
                        text8.setVisibility(View.VISIBLE);
                        text8.setText(txt8);
                        SpannableString ss8= new SpannableString(txt8);
                        ClickableSpan txtEigth= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(9000);

                            }
                        };
                        ss8.setSpan(txtEigth,0,39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text8.setText(ss8);
                        text8.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //If you ain’t got it get to stepping✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>11000 && g<12070){
                        String txt9 = "If you ain’t got it get to stepping";
                        text9.setVisibility(View.VISIBLE);
                        text9.setText(txt9);
                        SpannableString ss9= new SpannableString(txt9);
                        ClickableSpan txtNine= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(11000);

                            }
                        };
                        ss9.setSpan(txtNine,0,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text9.setText(ss9);
                        text9.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
                //I am not fixing to repeat myself✓
                if(clip){
                    int g=  vv.getCurrentPosition();
                    if(g>13050 && g<14000){
                        String txt10 = "I am not fixing to repeat myself";
                        text10.setVisibility(View.VISIBLE);
                        text10.setText(txt10);
                        SpannableString ss10= new SpannableString(txt10);
                        ClickableSpan txtTen= new ClickableSpan() {
                            @Override
                            public void onClick(@NonNull View view) {
                                vv.seekTo(13050);

                            }
                        };
                        ss10.setSpan(txtTen,0,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                        text10.setText(ss10);
                        text10.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }

                break;
        }
    }

    //showans
    public void showans(View vista){
        switch (selection){
            case "Moonlight Clip 1":
                if(clip){
                    //Ain't no refund
                    String txt1 = "Ain't no refund";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(36000);

                        }
                    };
                    ss.setSpan(txtone,0,15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());
                    //Thought you was on vacation
                    String txt2 = "Thought you was on vacation";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(36000);

                        }
                    };
                    ss2.setSpan(txtwo,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());
                    //How peanut working out
                    String txt3 = "How peanut working out";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtthree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(48000);
                        }
                    };
                    ss3.setSpan(txtthree,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());
                    //I got him in check
                    String txt4 = "I got him in check";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtfour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) { vv.seekTo(50000); }
                    };
                    ss4.setSpan(txtfour,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());
                    //I ain´t go let that go down
                    String txt5 = "I ain´t go let that go down";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtfive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) { vv.seekTo(62800); }
                    };
                    ss5.setSpan(txtfive,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());
                    //What´s up
                    String txt6 = "What´s up";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);

                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtsix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(93000); }
                    };
                    ss6.setSpan(txtsix,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());
                    //it´s all good
                    String txt7 = "it´s all good";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);

                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtseven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(96000); }
                    };
                    ss7.setSpan(txtseven,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());
                    //What are you doing
                    String txt8 = "What are you doing";
                    text8.setVisibility(View.VISIBLE);
                    text8.setText(txt8);

                    SpannableString ss8= new SpannableString(txt8);
                    ClickableSpan txteight= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(97000); }
                    };
                    ss8.setSpan(txteight,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text8.setText(ss8);
                    text8.setMovementMethod(LinkMovementMethod.getInstance());
                    //What is wrong with you
                    String txt9 = "What is wrong with you";
                    text9.setVisibility(View.VISIBLE);
                    text9.setText(txt9);

                    SpannableString ss9= new SpannableString(txt9);
                    ClickableSpan txtnine= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(107000); }
                    };
                    ss9.setSpan(txtnine,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text9.setText(ss9);
                    text9.setMovementMethod(LinkMovementMethod.getInstance());
                    //Get the fuck out of here
                    String txt10 = "Get the fuck out of here";
                    text10.setVisibility(View.VISIBLE);
                    text10.setText(txt10);

                    SpannableString ss10= new SpannableString(txt10);
                    ClickableSpan txtTen= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(115000); }
                    };
                    ss10.setSpan(txtTen,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text10.setText(ss10);
                    text10.setMovementMethod(LinkMovementMethod.getInstance());
                    //Have you ever
                    String txt11 = "Have you ever";
                    text11.setVisibility(View.VISIBLE);
                    text11.setText(txt11);

                    SpannableString ss11= new SpannableString(txt11);
                    ClickableSpan txteleven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(179000); }
                    };
                    ss11.setSpan(txteleven,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text11.setText(ss11);
                    text11.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Rick and Morty Clip 2":
                if(clip){
                    String txt1 = "what's up";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(100);

                        }
                    };
                    ss.setSpan(txtone,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt2 = "no can do";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txttwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(5000);

                        }
                    };
                    ss2.setSpan(txttwo,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt3 = "when i feel like it";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtthree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(16000);

                        }
                    };
                    ss3.setSpan(txtthree,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt4 = "you need to chill out";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtfour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(18000);

                        }
                    };
                    ss4.setSpan(txtfour,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt5 = "tryna - (trying to)";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtfive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(21000);

                        }
                    };
                    ss5.setSpan(txtfive,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt6 = "you know what";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtsix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(24000);

                        }
                    };
                    ss6.setSpan(txtsix,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt7 = "hanging out";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);
                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtseven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(26000);

                        }
                    };
                    ss7.setSpan(txtseven,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt8 = "you're overthinking it";
                    text8.setVisibility(View.VISIBLE);
                    text8.setText(txt8);
                    SpannableString ss8= new SpannableString(txt8);
                    ClickableSpan txteight= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(54000);

                        }
                    };
                    ss8.setSpan(txteight,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text8.setText(ss8);
                    text8.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt9 = "get your shit together";
                    text9.setVisibility(View.VISIBLE);
                    text9.setText(txt9);
                    SpannableString ss9= new SpannableString(txt9);
                    ClickableSpan txtnine= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(104000);

                        }
                    };
                    ss9.setSpan(txtnine,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text9.setText(ss9);
                    text9.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt10 = "to be into";
                    text10.setVisibility(View.VISIBLE);
                    text10.setText(txt10);
                    SpannableString ss10= new SpannableString(txt10);
                    ClickableSpan txtten= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(4000);

                        }
                    };
                    ss10.setSpan(txtten,0,10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text10.setText(ss10);
                    text10.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Do You Want Pepsi Clip 3":
                if(clip){
                    String txt1 = "is there anything else a can get for you";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(100);

                        }
                    };
                    ss.setSpan(txtone,0,40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt2 = "ain't got no";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(6000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt3 = "do you want";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThre= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(7000);

                        }
                    };
                    ss3.setSpan(txtThre,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt4 = "i was just wondering";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFourth= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(15000);

                        }
                    };
                    ss4.setSpan(txtFourth,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt5 = "might as well";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(16000);

                        }
                    };
                    ss5.setSpan(txtFive,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt6 = "you fell me";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(17000);

                        }
                    };
                    ss6.setSpan(txtSix,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt7 = "is there a problem";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);
                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtSeven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(28000);

                        }
                    };
                    ss7.setSpan(txtSeven,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt8 = "i didn't want";
                    text8.setVisibility(View.VISIBLE);
                    text8.setText(txt8);
                    SpannableString ss8= new SpannableString(txt8);
                    ClickableSpan txtEight= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(31000);

                        }
                    };
                    ss8.setSpan(txtEight,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text8.setText(ss8);
                    text8.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt9 = "why would you";
                    text9.setVisibility(View.VISIBLE);
                    text9.setText(txt9);
                    SpannableString ss9= new SpannableString(txt9);
                    ClickableSpan txtNine= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(33000);

                        }
                    };
                    ss9.setSpan(txtNine,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text9.setText(ss9);
                    text9.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Sangre Por Sangre Foodline Clip 4":
                if(clip){
                    String txt1 = "you ain't going to no prom soon";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(8000);

                        }
                    };
                    ss.setSpan(txtone,0,31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt2 = "ain't nothing but";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(15000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt3 = "i ain't no muslim";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(25000);

                        }
                    };
                    ss3.setSpan(txtThree,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt4 = "i ain't no moving";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFourth= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(31000);

                        }
                    };
                    ss4.setSpan(txtFourth,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt5 = "there is a ray of sunshine";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(61000);

                        }
                    };
                    ss5.setSpan(txtFive,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt6 = "i ain't buying what's mine";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(132000);

                        }
                    };
                    ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt7 = "you've getting by with that shit";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);
                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtSeven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(155000);

                        }
                    };
                    ss7.setSpan(txtSeven,0,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Sangre Por Sangre Watch El Paisaje Clip 5":
                if(clip){
                    String txt1 = "i'm here to jack you up";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(23000);

                        }
                    };
                    ss.setSpan(txtone,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt2 = "what do you want to do";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(42000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt3 = "you gotta pay your dues";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(45000);

                        }
                    };
                    ss3.setSpan(txtThree,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt4 = "you wanna throw down";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFourth= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(48000);

                        }
                    };
                    ss4.setSpan(txtFourth,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt5 = "catch you on the rebound";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(82000);

                        }
                    };
                    ss5.setSpan(txtFive,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt6 = "should't done that";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(135000);

                        }
                    };
                    ss6.setSpan(txtSix,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Training Day Rabbit Has The Gun Clip 6":
                if(clip){
                    String txt1 = "is no fun";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(12000);

                        }
                    };
                    ss.setSpan(txtone,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt2 = "who want to get paid";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(32000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt3 = "i'm glad to hear that";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(49000);

                        }
                    };
                    ss3.setSpan(txtThree,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt4 = "what are you gonna do";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(57000);

                        }
                    };
                    ss4.setSpan(txtFour,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt5 = "there it is";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(67000);

                        }
                    };
                    ss5.setSpan(txtFive,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt6 = "haven't ever - ain't never";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(73000);

                        }
                    };
                    ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt7 = "you get me twisted";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);
                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtSeven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(118000);

                        }
                    };
                    ss7.setSpan(txtSeven,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt8 = "ain't got it in you";
                    text8.setVisibility(View.VISIBLE);
                    text8.setText(txt8);
                    SpannableString ss8= new SpannableString(txt8);
                    ClickableSpan txtEigth= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(176000);

                        }
                    };
                    ss8.setSpan(txtEigth,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text8.setText(ss8);
                    text8.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt9 = "ima get - i'm going to get";
                    text9.setVisibility(View.VISIBLE);
                    text9.setText(txt9);
                    SpannableString ss9= new SpannableString(txt9);
                    ClickableSpan txtNine= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(152000);

                        }
                    };
                    ss9.setSpan(txtNine,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text9.setText(ss9);
                    text9.setMovementMethod(LinkMovementMethod.getInstance());
                    String txt10 = "you ain't go";
                    text10.setVisibility(View.VISIBLE);
                    text10.setText(txt10);
                    SpannableString ss10= new SpannableString(txt10);
                    ClickableSpan txtTen= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(156000);

                        }
                    };
                    ss10.setSpan(txtTen,0,12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text10.setText(ss10);
                    text10.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Hancock Train Clip 7":
                if(clip){
                    String txt1 = "i'm on my way";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(1000);

                        }
                    };
                    ss.setSpan(txtone,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt2 = "i'll see you in about";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(15000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt3 = "i'll see you in about";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(76000);

                        }
                    };
                    ss3.setSpan(txtThree,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt4 = "you're the one who/that";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(126000);

                        }
                    };
                    ss4.setSpan(txtFour,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt5 = "why didn't you just";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(126000);

                        }
                    };
                    ss5.setSpan(txtFive,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt6 = "coulda shoulda - could/should have";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(175000);

                        }
                    };
                    ss6.setSpan(txtSix,0,34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());



                }
                break;

            case "Malcom in the Middle Teacher Clip 8":
                if(clip){
                    String txt1 = "you're nothing but a";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(0);

                        }
                    };
                    ss.setSpan(txtone,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt2 = "took you long enough";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(9000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt3 = "i've been trynna / trying to";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(9000);

                        }
                    };
                    ss3.setSpan(txtThree,0,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt4 = "what do you want";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(18000);

                        }
                    };
                    ss4.setSpan(txtFour,0,16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt5 = "it's just a bunch of";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(32000);

                        }
                    };
                    ss5.setSpan(txtFive,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt6 = "rub somebody the wrong way";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(88000);

                        }
                    };
                    ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Sangre Por Sangre Comedor Clip 9":
                if(clip){
                    String txt1 = "you wanna buy";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(17000);

                        }
                    };
                    ss.setSpan(txtone,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt2 = "get your hands off";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(26000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt3 = "give it to one of my";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(120000);

                        }
                    };
                    ss3.setSpan(txtThree,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt4 = "i'm gonna have to";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(200000);

                        }
                    };
                    ss4.setSpan(txtFour,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt5 = "what's the matter";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(205000);

                        }
                    };
                    ss5.setSpan(txtFive,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt6 = "ain't you ever";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(207000);

                        }
                    };
                    ss6.setSpan(txtSix,0,14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());

                    String txt7 = "what are you looking for";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);
                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtSeven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(260000);

                        }
                    };
                    ss7.setSpan(txtSeven,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Dave Chapelle Man Rape Clip 10":
                if(clip){
                    //i'm one of those people
                    String txt1 = "i'm one of those people";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(1000);

                        }
                    };
                    ss.setSpan(txtone,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());

                    //and i'm scared to live
                    String txt2 = "and i'm scared to live";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(6000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;

            case "Análisis de cultura Gringa y Frases Coloquiales 2 Clip 11":
                if(clip){
                    //If ther is some firing Going on
                    String txt1 = "If ther is some firing Going on";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(1000);

                        }
                    };
                    ss.setSpan(txtone,0,31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());

                    //We first So we pretty much expect it
                    String txt2 = "We first So we pretty much expect it";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(3000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());

                    //I know what im Talking about
                    String txt3 = "I know what im Talking about";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(7600);

                        }
                    };
                    ss3.setSpan(txtThree,0,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());

                    //I done had a lot of jobs
                    String txt4 = "I done had a lot of jobs";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(8900);

                        }
                    };
                    ss4.setSpan(txtFour,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());

                    //Got into
                    String txt5 = "Got into";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(10000);

                        }
                    };
                    ss5.setSpan(txtFive,0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());

                    //Out of them
                    String txt6 = "Out of them";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(15000);

                        }
                    };
                    ss6.setSpan(txtSix,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());

                }
                break;

            case "Boys in the Hood Clip 12":
                if(clip){
                    //What’s wrong with you✓
                    String txt1 = "What’s wrong with you";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(12000);

                        }
                    };
                    ss.setSpan(txtone,0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());

                    //What the fuck are you looking at✓
                    String txt2 = "What the fuck are you looking at";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(15000);

                        }
                    };
                    ss2.setSpan(txtTwo,0,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());

                    //I’m Still trying to find out "Tryna"✓
                    String txt3 = "I’m Still trying to find out “Tryna”";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(16800);

                        }
                    };
                    ss3.setSpan(txtThree,0,36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());

                    //We got a problem here?✓
                    String txt4 = "We got a problem here?";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(21000);

                        }
                    };
                    ss4.setSpan(txtFour,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());

                    //Start some shit✓
                    String txt5 = "Start some shit";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(55000);

                        }
                    };
                    ss5.setSpan(txtFive,0,15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());

                    //That’s why fool be getting shot all the time✓
                    String txt6 = "That’s why fool be getting shot all the time";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(61000);

                        }
                    };
                    ss6.setSpan(txtSix,0,44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());

                    //Tryna show how hard they is
                    String txt7 = "Tryna show how hard they is";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);
                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtSeven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(64000);

                        }
                    };
                    ss7.setSpan(txtSeven,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());

                    //You be doing that shit, too
                    String txt8 = "You be doing that shit, too";
                    text8.setVisibility(View.VISIBLE);
                    text8.setText(txt8);
                    SpannableString ss8= new SpannableString(txt8);
                    ClickableSpan txtEigth= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(69000);

                        }
                    };
                    ss8.setSpan(txtEigth,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text8.setText(ss8);
                    text8.setMovementMethod(LinkMovementMethod.getInstance());

                    //I’m getting the fuck out of LA
                    String txt9 = "I’m getting the fuck out of LA";
                    text9.setVisibility(View.VISIBLE);
                    text9.setText(txt9);
                    SpannableString ss9= new SpannableString(txt9);
                    ClickableSpan txtNine= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(102000);

                        }
                    };
                    ss9.setSpan(txtNine,0,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text9.setText(ss9);
                    text9.setMovementMethod(LinkMovementMethod.getInstance());

                }
                break;

            case "Cultura y Fonética Clip 13":
                if(clip){
                    //Look man I don’t mean no disrespect or nothing G✓
                    String txt1 = "Look man I don’t mean no disrespect or nothing G";
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(txt1);
                    SpannableString ss= new SpannableString(txt1);
                    ClickableSpan txtone= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(150);

                        }
                    };
                    ss.setSpan(txtone,0,48, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text1.setText(ss);
                    text1.setMovementMethod(LinkMovementMethod.getInstance());

                    //I’m just trying to see✓
                    String txt2 = "I’m just trying to see";
                    text2.setVisibility(View.VISIBLE);
                    text2.setText(txt2);
                    SpannableString ss2= new SpannableString(txt2);
                    ClickableSpan txtTwo= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(2250);

                        }
                    };
                    ss2.setSpan(txtTwo,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text2.setText(ss2);
                    text2.setMovementMethod(LinkMovementMethod.getInstance());

                    //If can get a little bro✓
                    String txt3 = "If can get a little bro";
                    text3.setVisibility(View.VISIBLE);
                    text3.setText(txt3);
                    SpannableString ss3= new SpannableString(txt3);
                    ClickableSpan txtThree= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(3050);

                        }
                    };
                    ss3.setSpan(txtThree,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text3.setText(ss3);
                    text3.setMovementMethod(LinkMovementMethod.getInstance());

                    //You can’t get nothing man✓
                    String txt4 = "You can’t get nothing man";
                    text4.setVisibility(View.VISIBLE);
                    text4.setText(txt4);
                    SpannableString ss4= new SpannableString(txt4);
                    ClickableSpan txtFour= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(4000);

                        }
                    };
                    ss4.setSpan(txtFour,0,25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text4.setText(ss4);
                    text4.setMovementMethod(LinkMovementMethod.getInstance());

                    //You know what time it is✓
                    String txt5 = "You know what time it is";
                    text5.setVisibility(View.VISIBLE);
                    text5.setText(txt5);
                    SpannableString ss5= new SpannableString(txt5);
                    ClickableSpan txtFive= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(5000);

                        }
                    };
                    ss5.setSpan(txtFive,0,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text5.setText(ss5);
                    text5.setMovementMethod(LinkMovementMethod.getInstance());

                    //I keep looking out for you✓
                    String txt6 = "I keep looking out for you";
                    text6.setVisibility(View.VISIBLE);
                    text6.setText(txt6);
                    SpannableString ss6= new SpannableString(txt6);
                    ClickableSpan txtSix= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(6900);

                        }
                    };
                    ss6.setSpan(txtSix,0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text6.setText(ss6);
                    text6.setMovementMethod(LinkMovementMethod.getInstance());

                    //Just a little something man✓
                    String txt7 = "Just a little something man";
                    text7.setVisibility(View.VISIBLE);
                    text7.setText(txt7);
                    SpannableString ss7= new SpannableString(txt7);
                    ClickableSpan txtSeven= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(8000);

                        }
                    };
                    ss7.setSpan(txtSeven,0,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text7.setText(ss7);
                    text7.setMovementMethod(LinkMovementMethod.getInstance());

                    //All my soothing cost a little something✓
                    String txt8 = "All my soothing cost a little something";
                    text8.setVisibility(View.VISIBLE);
                    text8.setText(txt8);
                    SpannableString ss8= new SpannableString(txt8);
                    ClickableSpan txtEigth= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(9000);

                        }
                    };
                    ss8.setSpan(txtEigth,0,39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text8.setText(ss8);
                    text8.setMovementMethod(LinkMovementMethod.getInstance());

                    //If you ain’t got it get to stepping✓
                    String txt9 = "If you ain’t got it get to stepping";
                    text9.setVisibility(View.VISIBLE);
                    text9.setText(txt9);
                    SpannableString ss9= new SpannableString(txt9);
                    ClickableSpan txtNine= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(11000);

                        }
                    };
                    ss9.setSpan(txtNine,0,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text9.setText(ss9);
                    text9.setMovementMethod(LinkMovementMethod.getInstance());

                    //I am not fixing to repeat myself✓
                    String txt10 = "I am not fixing to repeat myself";
                    text10.setVisibility(View.VISIBLE);
                    text10.setText(txt10);
                    SpannableString ss10= new SpannableString(txt10);
                    ClickableSpan txtTen= new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View view) {
                            vv.seekTo(13050);

                        }
                    };
                    ss10.setSpan(txtTen,0,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                    text10.setText(ss10);
                    text10.setMovementMethod(LinkMovementMethod.getInstance());

                }
                break;

        }
    }
}