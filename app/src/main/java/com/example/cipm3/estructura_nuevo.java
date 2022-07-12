package com.example.cipm3;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Locale;

public class estructura_nuevo extends AppCompatActivity {
    Generator gen = new Generator();
    Generator2 gen2 = new Generator2();

    Spinner spin;
    Spinner spin2;
    TextView txt1;
    TextView txt2;
    String selection;
    String selection2;
    LinearLayout texto_inicial;
    LinearLayout spanish_lay;
    LinearLayout input_lay;
    LinearLayout btn_lay;
    LinearLayout answer_lay;
    LinearLayout resppass;
    LinearLayout respescu;
    LinearLayout respescu2;
    LinearLayout respinc;
    LinearLayout opclay;
    LinearLayout vf;
    TextView btncheck;
    VideoView vv;
    TextView sptx;
    TextView txteng;
    EditText answerinp;
    TextToSpeech tts;
    TextToSpeech ttr;
    TextToSpeech tti;
    TextToSpeech tt1;

    String algosele = "";

    Button btndif1;
    Button btndif2;
    Button btndif3;
    Button btndif4;



    int r;
    public static final int REC_CODE_SPEECH_INPUT = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estructura_nuevo);
        spin = (Spinner) findViewById(R.id.spinuno);
        txt1 = (TextView) findViewById(R.id.textspin1);
        txteng = (TextView) findViewById(R.id.txteng);
        spin2 = (Spinner) findViewById(R.id.spinrango);
        txt2 = (TextView) findViewById(R.id.textspin2);
        vv = (VideoView) findViewById(R.id.videoView1);
        texto_inicial = (LinearLayout) findViewById(R.id.texto_inicial);
        spanish_lay = (LinearLayout) findViewById(R.id.spanish_lay);
        input_lay = (LinearLayout) findViewById(R.id.input_lay);
        btn_lay = (LinearLayout) findViewById(R.id.btn_lay);
        answer_lay = (LinearLayout) findViewById(R.id.answer_lay);
        resppass = (LinearLayout) findViewById(R.id.resppass);
        respescu = (LinearLayout) findViewById(R.id.respescu);
        respescu2 = (LinearLayout) findViewById(R.id.respescu2);
        vf = (LinearLayout) findViewById(R.id.vf);
        respinc = (LinearLayout) findViewById(R.id.respinc);
        opclay = (LinearLayout) findViewById(R.id.opclay);
        btncheck = (TextView) findViewById(R.id.btncheck);
        sptx = (TextView) findViewById(R.id.spanishsentence);
        answerinp = (EditText) findViewById(R.id.answerinput1);

        btndif1 = (Button) findViewById(R.id.dif1);
        btndif2 = (Button) findViewById(R.id.dif2);
        btndif3 = (Button) findViewById(R.id.dif3);
        btndif4 = (Button) findViewById(R.id.dif4);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.structures, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection = spin.getSelectedItem().toString();
                txt1.setText(selection);

                vv.setVisibility(View.GONE);
                vf.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection2 = spin2.getSelectedItem().toString();
                txt2.setText(selection2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==tts.SUCCESS){
                    int lang = tts.setLanguage(Locale.ENGLISH);
                }
            }
        });
    }

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }

    public void chat_maestro(View vista) {
        Intent intento = new Intent(this, chat_maestro.class);
        startActivity(intento);
    }

    public void profile(View vista) {
        Intent intento = new Intent(this, profile.class);
        startActivity(intento);
    }

    public void showV(View vista) {

        vv.setVisibility(View.VISIBLE);
        vf.setVisibility(View.GONE);

        switch (selection) {

            case "Present Simple":
                Uri uri = Uri.parse("http://adrianlealcaldera.com/presentesimple.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Present Continuous":
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/presentecontinuo.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Present Perfect":
                Uri uri2 = Uri.parse("http://adrianlealcaldera.com/presenteperfecto.mp4");
                vv.setVideoURI(uri2);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Present Perfect Continuous":
                Uri uri3 = Uri.parse("http://adrianlealcaldera.com/presenteperfectoconti.mp4");
                vv.setVideoURI(uri3);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Past Simple":
                Uri uri4 = Uri.parse("http://adrianlealcaldera.com/pasadosimple.mp4");
                vv.setVideoURI(uri4);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Past Continuous":
                Uri uri5 = Uri.parse("http://adrianlealcaldera.com/pasadocont.mp4");
                vv.setVideoURI(uri5);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Past Perfect":
                Uri uri6 = Uri.parse("http://adrianlealcaldera.com/pasadoperf.mp4");
                vv.setVideoURI(uri6);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Past Perfect Continuous":
                Uri uri7 = Uri.parse("http://adrianlealcaldera.com/pasadoperfcon.mp4");
                vv.setVideoURI(uri7);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Future Simple":
                Uri uri8 = Uri.parse("http://adrianlealcaldera.com/futurosimp1.mp4");
                vv.setVideoURI(uri8);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Future Continuous":
                Uri uri9 = Uri.parse("http://adrianlealcaldera.com/futuroconti.mp4");
                vv.setVideoURI(uri9);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Future Perfect":
                Uri uri10 = Uri.parse("http://adrianlealcaldera.com/futuroperf.mp4");
                vv.setVideoURI(uri10);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Future Perfect Continuous":
                Uri uri11 = Uri.parse("http://adrianlealcaldera.com/futuroperfcon.mp4");
                vv.setVideoURI(uri11);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Would Simple":
                Uri uri12 = Uri.parse("http://adrianlealcaldera.com/wouldsimp.mp4");
                vv.setVideoURI(uri12);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Would Continuous":
                Uri uri13 = Uri.parse("http://adrianlealcaldera.com/wouldconti.mp4");
                vv.setVideoURI(uri13);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Would Perfect":
                Uri uri14 = Uri.parse("http://adrianlealcaldera.com/wouldperf.mp4");
                vv.setVideoURI(uri14);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Could Simple":
                Uri uri15 = Uri.parse("http://adrianlealcaldera.com/couldsimp.mp4");
                vv.setVideoURI(uri15);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Could Continuous":
                Uri uri16 = Uri.parse("http://adrianlealcaldera.com/couldconti.mp4");
                vv.setVideoURI(uri16);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                Toast.makeText(this, "El could continuous empieza en el minuto 5", Toast.LENGTH_SHORT).show();
                break;

            case "Could Perfect":
                Uri uri17 = Uri.parse("http://adrianlealcaldera.com/couldperf.mp4");
                vv.setVideoURI(uri17);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Could Perfect Continuous":
                Uri uri18 = Uri.parse("http://adrianlealcaldera.com/couldperf.mp4");
                vv.setVideoURI(uri18);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                Toast.makeText(this, "El could perfect continuous empieza en el minuto 5:31", Toast.LENGTH_SHORT).show();
                break;

            case "Might Simple":
                Uri uri19 = Uri.parse("http://adrianlealcaldera.com/modalsimple.mp4");
                vv.setVideoURI(uri19);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Might Continuous":
                Uri uri20 = Uri.parse("http://adrianlealcaldera.com/modalconti.mp4");
                vv.setVideoURI(uri20);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Might Perfect":
                Uri uri21 = Uri.parse("http://adrianlealcaldera.com/modalperf.mp4");
                vv.setVideoURI(uri21);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Might Perfect Continuous":
                Uri uri22 = Uri.parse("http://adrianlealcaldera.com/modalperfcont.mp4");
                vv.setVideoURI(uri22);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Should Simple":
                Uri uri23 = Uri.parse("http://adrianlealcaldera.com/modalsimple.mp4");
                vv.setVideoURI(uri23);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Should Continuous":
                Uri uri24 = Uri.parse("http://adrianlealcaldera.com/modalconti.mp4");
                vv.setVideoURI(uri24);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;
            case "Should Perfect":
                Uri uri25 = Uri.parse("http://adrianlealcaldera.com/modalperf.mp4");
                vv.setVideoURI(uri25);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Should Perfect Continuous":
                Uri uri26 = Uri.parse("http://adrianlealcaldera.com/modalperfcont.mp4");
                vv.setVideoURI(uri26);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Can Simple":
                Uri uri27 = Uri.parse("http://adrianlealcaldera.com/modalsimple.mp4");
                vv.setVideoURI(uri27);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Can Continuous":
                Uri uri28 = Uri.parse("http://adrianlealcaldera.com/modalconti.mp4");
                vv.setVideoURI(uri28);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Must Simple":
                Uri uri29 = Uri.parse("http://adrianlealcaldera.com/modalsimple.mp4");
                vv.setVideoURI(uri29);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Must Continuous":
                Uri uri30 = Uri.parse("http://adrianlealcaldera.com/modalconti.mp4");
                vv.setVideoURI(uri30);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Must Perfect":
                Uri uri31 = Uri.parse("http://adrianlealcaldera.com/modalperf.mp4");
                vv.setVideoURI(uri31);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Must Perfect Continuous":
                Uri uri32 = Uri.parse("http://adrianlealcaldera.com/modalperfcont.mp4");
                vv.setVideoURI(uri32);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Want To":
                Uri uri33 = Uri.parse("https://adrianlealcaldera.com/WantTo.mp4");
                vv.setVideoURI(uri33);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "For To":
                Uri uri34 = Uri.parse("https://adrianlealcaldera.com/ForTo.mp4");
                vv.setVideoURI(uri34);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Be Simple":
                Uri uri35 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri35);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Be Past":
                Uri uri36 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri36);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Be Past Perfect":
                Uri uri37 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri37);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Be Continuous":
                Uri uri38 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri38);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Be Past Continuous":
                Uri uri39 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri39);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Could Be":
                Uri uri40 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri40);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Should Be":
                Uri uri41 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri41);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Would Be":
                Uri uri42 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri42);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Will Be":
                Uri uri43 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri43);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Must Be":
                Uri uri44 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri44);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "There Can Be":
                Uri uri45 = Uri.parse("https://adrianlealcaldera.com/ThereBe.mp4");
                vv.setVideoURI(uri45);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Supposed To Present":
                Uri uri46 = Uri.parse("https://adrianlealcaldera.com/SupposedTo.mp4");
                vv.setVideoURI(uri46);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Supposed To Past":
                Uri uri47 = Uri.parse("https://adrianlealcaldera.com/SupposedTo.mp4");
                vv.setVideoURI(uri47);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Wish Past Simple":
                Uri uri48 = Uri.parse("https://adrianlealcaldera.com/WishPast.mp4");
                vv.setVideoURI(uri48);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Wish Past Perfect":
                Uri uri49 = Uri.parse("https://adrianlealcaldera.com/WishPast.mp4");
                vv.setVideoURI(uri49);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Wish Would":
                Uri uri50 = Uri.parse("https://adrianlealcaldera.com/WishPast.mp4");
                vv.setVideoURI(uri50);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Used To":
                Uri uri51 = Uri.parse("https://adrianlealcaldera.com/UsedTo.mp4");
                vv.setVideoURI(uri51);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Be Used To":
                Uri uri52 = Uri.parse("https://adrianlealcaldera.com/UsedTo.mp4");
                vv.setVideoURI(uri52);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

        }

    }

    public void dificulty1(View vista){
        limpans();
        algosele = "dif1";
        checarischeck();
        mostrar_layout();
        r = 0;

        switch (selection){
            case "Present Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;
            case "Present Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;

            case "Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPassSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPassCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPassPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPassPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Future Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Would Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Could Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Should Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                        
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Might Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                        
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                        
                }
                break;
            case "Might Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Can Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Can Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Must Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Must Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Want To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWantYouTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWantYouTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWantYouTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "For To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenForTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenForTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenForTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Supposed To Present":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedToPresente1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedToPresente1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedToPresente1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Supposed To Past":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedTopasado1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedTopasado1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedTopasado1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Wish Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastSimple1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastSimple1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastSimple1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Would":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishWould1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishWould1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishWould1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Be Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenBeUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                             // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenBeUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenBeUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
        }
    }

    public void dificulty2(View vista){
        limpans();
        algosele = "dif2";
        checarischeck();
        mostrar_layout();
        r = 1;

        switch (selection){
            case "Present Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;
            case "Present Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;

            case "Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Future Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Would Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Could Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Should Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Might Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                }
                break;
            case "Might Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Can Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Can Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Must Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustSimp2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Must Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustCont2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Want To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWantYouTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWantYouTo2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWantYouTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "For To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenForTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenForTo2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenForTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Supposed To Present":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedToPresente1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.supposedtopresente2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedToPresente1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Supposed To Past":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedTopasado1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.supposedtopasado2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedTopasado1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Wish Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastSimple1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastSimple2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastSimple1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastPerf2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Would":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishWould1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishWould2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishWould1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenUsedTo2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Be Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenBeUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenBeUsedTo2();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenBeUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
        }
    }

    public void dificulty3(View vista){
        limpans();
        algosele = "dif3";
        checarischeck();
        mostrar_layout();
        r = 2;

        switch (selection){
            case "Present Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;
            case "Present Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerfCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;

            case "Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPassPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPassPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Future Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutPerfCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Would Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Could Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Should Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Might Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                }
                break;
            case "Might Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerfCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Can Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Can Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Must Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustSimp3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustSimp1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Must Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustCont3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustCont1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Want To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWantYouTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWantYouTo3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWantYouTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "For To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenForTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenForTo3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenForTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Supposed To Present":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedToPresente1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedToPresente3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedToPresente1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Supposed To Past":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedTopasado1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedTopasado3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedTopasado1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Wish Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastSimple1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastSimple3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastSimple1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastPerf3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastPerf1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Would":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishWould1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishWould3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishWould1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenUsedTo3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Be Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenBeUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenBeUsedTo3();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenBeUsedTo1();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
        }
    }

    public void dificulty4(View vista){
        limpans();
        algosele = "dif4";
        checarischeck();
        mostrar_layout();
        r = 3;

        switch (selection){
            case "Present Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresSimp4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresSimp4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresSimp4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Present Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;
            case "Present Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPresPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                                }

                            }

                        });
                        break;
                }
                break;

            case "Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPastSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPastCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPastPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Past Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenPastPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Future Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturoSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturoSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFuturoSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutureCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutureCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFutureCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFuturePerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Future Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenFuturePerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Would Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Would Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Could Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Could Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Should Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Should Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenShouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Might Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Might Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                }
                break;
            case "Might Perfect Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMightPerfCont4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Can Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimpDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanSimpDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanSimpDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Can Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanContDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanContDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenCanContDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Must Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimpDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustSimpDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustSimpDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
            case "Must Continuous":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustContDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustContDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;

                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {
                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenMustContDif4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;

            case "Want To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWantYouTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWantYouTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWantYouTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "For To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenForTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenForTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenForTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Supposed To Present":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedToPresente4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedToPresente4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedToPresente4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Supposed To Past":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedTopasado4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedTopasado4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenSupposedTopasado4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Wish Past Simple":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastSimple4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Past Perfect":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishPastPerf4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Wish Would":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishWould4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishWould4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenWishWould4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;

            case "Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenUsedTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenUsedTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case "Be Used To":
                switch (selection2) {
                    case "0 a 100":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenBeUsedTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenBeUsedTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int i) {
                                Locale spanish = new Locale("es", "MX");
                                if (i == TextToSpeech.SUCCESS) {
                                    int lang = tt1.setLanguage(spanish);
                                    tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                        @Override
                                        public void onStart(String s) {
                                        }

                                        @Override
                                        public void onDone(String utteranceId) {

                                            // iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator3 gen1 = new Generator3();
                                    gen1.GenBeUsedTo4();
                                    sptx.setText(gen1.gens);
                                    txteng.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
        }
    }

    public void checarischeck(){

        if(algosele == "dif1"){
            btndif1.setBackgroundResource(R.drawable.ic_rect_ngulo_btndif);
            btndif1.setTextColor(Color.WHITE);

            btndif2.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif2.setTextColor(Color.parseColor("#407BFB"));
            btndif3.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif3.setTextColor(Color.parseColor("#407BFB"));
            btndif4.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif4.setTextColor(Color.parseColor("#407BFB"));
        }
        if(algosele == "dif2"){
            btndif2.setBackgroundResource(R.drawable.ic_rect_ngulo_btndif);
            btndif2.setTextColor(Color.WHITE);

            btndif1.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif1.setTextColor(Color.parseColor("#407BFB"));
            btndif3.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif3.setTextColor(Color.parseColor("#407BFB"));
            btndif4.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif4.setTextColor(Color.parseColor("#407BFB"));
        }
        if(algosele == "dif3"){
            btndif3.setBackgroundResource(R.drawable.ic_rect_ngulo_btndif);
            btndif3.setTextColor(Color.WHITE);

            btndif1.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif1.setTextColor(Color.parseColor("#407BFB"));
            btndif2.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif2.setTextColor(Color.parseColor("#407BFB"));
            btndif4.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif4.setTextColor(Color.parseColor("#407BFB"));
        }
        if(algosele == "dif4"){
            btndif4.setBackgroundResource(R.drawable.ic_rect_ngulo_btndif);
            btndif4.setTextColor(Color.WHITE);

            btndif1.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif1.setTextColor(Color.parseColor("#407BFB"));
            btndif2.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif2.setTextColor(Color.parseColor("#407BFB"));
            btndif3.setBackgroundResource(R.drawable.ic_rect_ngulo_btnnocheck);
            btndif3.setTextColor(Color.parseColor("#407BFB"));
        }
    }

    public void mostrar_layout(){
        texto_inicial.setVisibility(View.GONE);

        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);
        btn_lay.setVisibility(View.VISIBLE);
    }

    public void checkanswer(View vista) {
        String t = txteng.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
            answerinp.setBackgroundColor(Color.parseColor("#E6FBEB"));
            opclay.setBackgroundColor(Color.parseColor("#E6FBEB"));
            resppass.setVisibility(View.VISIBLE);
            respescu.setVisibility(View.GONE);

            respinc.setVisibility(View.GONE);
            answer_lay.setVisibility(View.GONE);

            btncheck.setText("Chequea tu respuesta");
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        ttr.setLanguage(Locale.ENGLISH);
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {
                            }

                            @Override
                            public void onDone(String utteranceId) {

                            }

                            @Override
                            public void onError(String s) {
                            }
                        });
                        ttr.speak("answer is correct", TextToSpeech.QUEUE_ADD, null, "one");


                    }
                }
            });
        } else {
            answerinp.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));

            resppass.setVisibility(View.GONE);
            respescu.setVisibility(View.GONE);
            respescu2.setVisibility(View.VISIBLE);

            respinc.setVisibility(View.VISIBLE);
            answer_lay.setVisibility(View.VISIBLE);

            btncheck.setText("Intentalo otra vez");
            //if you say stop it returns part of the flow control system
            if (answerinp.getText().toString().trim().equals("stop")) return;
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        txteng.setTextColor(Color.BLACK);
                        if (r == 0) {

                        }
                        if (r == 1) {

                        }
                        if (r == 2) {
                        }
                        ttr.setLanguage(Locale.ENGLISH);
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {

                            }

                            @Override
                            public void onDone(String utteranceId) {


                            }

                            @Override
                            public void onError(String s) {
                            }
                        });

                        ttr.speak("answer is incorrect   the answer is  " + txteng.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet


                    }
                }
            });

        }
    }

    public void speakans(View vista){
        ttr.setLanguage(Locale.ENGLISH);
        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
            @Override
            public void onStart(String s) {

            }

            @Override
            public void onDone(String utteranceId) {


            }

            @Override
            public void onError(String s) {
            }
        });

        ttr.speak(txteng.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
    }

    public void speakdecir(View vista){
          iniciarentradavoz();
    }

    public void limpans(){
        answerinp.setText("");
        answerinp.setBackgroundColor(Color.WHITE);
        opclay.setBackgroundColor(Color.WHITE);

        resppass.setVisibility(View.GONE);
        respescu.setVisibility(View.GONE);

        respinc.setVisibility(View.GONE);
        answer_lay.setVisibility(View.GONE);
    }

    private void iniciarentradavoz() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        try {
            startActivityForResult(intent, REC_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException e) {
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    answerinp.setText(result.get(0));

                }
                break;
        }

    }

}