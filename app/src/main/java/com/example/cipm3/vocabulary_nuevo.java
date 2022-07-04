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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Locale;

public class vocabulary_nuevo extends AppCompatActivity {

    VideoView vv;
    LinearLayout vf;
    LinearLayout opclay;
    LinearLayout resppass;
    LinearLayout respescu;
    LinearLayout respinc;
    LinearLayout answer_lay;
    LinearLayout spanish_lay;
    LinearLayout input_lay;
    LinearLayout btn_check_lay;
    LinearLayout btn_emp_lay;
    LinearLayout btn_cont_lay;
    LinearLayout txt_exp;
    Spinner spin;
    String selection;
    TextView sptx;
    TextView engtx;
    EditText answerinp;
    TextView textspin1;
    Button practice;
    TextToSpeech ttr;
    TextToSpeech tts;
    TextToSpeech tti;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    private ImageButton botonhablar;
    boolean v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_nuevo);

        textspin1 = findViewById(R.id.textspin1);
        spin = findViewById(R.id.spinuno);
        vf = findViewById(R.id.vf);
        vv = findViewById(R.id.vv);

        sptx = findViewById(R.id.spanishsentence);
        engtx = findViewById(R.id.txteng);
        answerinp = findViewById(R.id.answerinput1);
        opclay = findViewById(R.id.opclay);

        resppass = findViewById(R.id.resppass);
        respescu = findViewById(R.id.respescu);
        respinc = findViewById(R.id.respinc);
        answer_lay = findViewById(R.id.answer_lay);
        spanish_lay = findViewById(R.id.spanish_lay);
        input_lay = findViewById(R.id.input_lay);
        btn_check_lay = findViewById(R.id.btn_check_lay);
        btn_emp_lay = findViewById(R.id.btn_emp_lay);
        btn_cont_lay = findViewById(R.id.btn_cont_lay);
        txt_exp = findViewById(R.id.txt_exp);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.vocab, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection = spin.getSelectedItem().toString();
                textspin1.setText(selection);

                vf.setVisibility(View.VISIBLE);
                vv.setVisibility(View.GONE);

                txt_exp.setVisibility(View.VISIBLE);
                btn_emp_lay.setVisibility(View.VISIBLE);

                spanish_lay.setVisibility(View.GONE);
                input_lay.setVisibility(View.GONE);

                btn_check_lay.setVisibility(View.GONE);
                btn_cont_lay.setVisibility(View.GONE);

                resppass.setVisibility(View.GONE);
                respescu.setVisibility(View.GONE);
                respinc.setVisibility(View.GONE);

                answerinp.setBackgroundColor(Color.WHITE);
                opclay.setBackgroundColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    vocabgen gen = new vocabgen();
    //
    public void showV(View vista) {

        vf.setVisibility(View.GONE);
        vv.setVisibility(View.VISIBLE);

        switch (selection) {

            case "0 to 50":
                Uri uri = Uri.parse("http://adrianlealcaldera.com/vocablowq.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "50 to 100":
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/51a100.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "100 to 150":
                Uri uri2 = Uri.parse("http://adrianlealcaldera.com/100a150.mp4");
                vv.setVideoURI(uri2);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "150 to 200":
                Uri uri3 = Uri.parse("http://adrianlealcaldera.com/151-200.mp4");
                vv.setVideoURI(uri3);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "200 to 250":
                Uri uri4 = Uri.parse("http://adrianlealcaldera.com/200a250.mp4");
                vv.setVideoURI(uri4);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "250 to 300":
                Uri uri5 = Uri.parse("http://adrianlealcaldera.com/250a300.mp4");
                vv.setVideoURI(uri5);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "300 to 350":
                Uri uri6 = Uri.parse("http://adrianlealcaldera.com/300-350.mp4");
                vv.setVideoURI(uri6);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "350 to 400":
                Uri uri7 = Uri.parse("http://adrianlealcaldera.com/350a400bq.mp4");
                vv.setVideoURI(uri7);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "400 to 500":
                Uri uri8 = Uri.parse("http://adrianlealcaldera.com/400a500lq.mp4");
                vv.setVideoURI(uri8);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;


        }

    }

    public void practice(View v) {
        txt_exp.setVisibility(View.GONE);
        btn_emp_lay.setVisibility(View.GONE);

        spanish_lay.setVisibility(View.VISIBLE);
        input_lay.setVisibility(View.VISIBLE);

        btn_check_lay.setVisibility(View.VISIBLE);
        btn_cont_lay.setVisibility(View.VISIBLE);
        answer_lay.setVisibility(View.GONE);

        resppass.setVisibility(View.GONE);
        respescu.setVisibility(View.GONE);
        respinc.setVisibility(View.GONE);

        answerinp.setBackgroundColor(Color.WHITE);
        opclay.setBackgroundColor(Color.WHITE);

        switch (selection) {
            case "0 to 50":
                gen.gencerotofifty();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);


                break;

            case "50 to 100":
                gen.fiftohun();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;

            case "100 to 150":
                gen.cientociencin();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;
            case "150 to 200":
                gen.C150a200();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;
            case "200 to 250":
                gen.C200a250();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;
            case "250 to 300":
                gen.C250a300();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;
            case "300 to 350":
                gen.C300a350();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;

            case "350 to 400":
                gen.C350a400();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;
            case "400 to 500":
                gen.C400a500();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);

                
                break;

        }
    }

    public void checkanswer(View vista) {
        v = false;
        String t = engtx.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
            answerinp.setBackgroundColor(Color.parseColor("#E6FBEB"));
            opclay.setBackgroundColor(Color.parseColor("#E6FBEB"));

            resppass.setVisibility(View.VISIBLE);
            respescu.setVisibility(View.VISIBLE);
            respinc.setVisibility(View.GONE);

            answer_lay.setVisibility(View.GONE);

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

            //if you say stop it returns part of the flow control system
            // if(answerinp.getText().toString().trim().equals("stop")) return;
            answerinp.setBackgroundColor(Color.parseColor("#FEE6E6"));
            opclay.setBackgroundColor(Color.parseColor("#FEE6E6"));

            resppass.setVisibility(View.GONE);
            respescu.setVisibility(View.VISIBLE);
            respinc.setVisibility(View.VISIBLE);

            answer_lay.setVisibility(View.VISIBLE);
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        engtx.setTextColor(Color.BLACK);
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

                        ttr.speak("answer is incorrect....the answer is..." + engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
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

        ttr.speak(engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
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

    public void hablar(View vista){
        iniciarentradavoz();
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