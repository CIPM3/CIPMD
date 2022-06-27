package com.example.cipm3;


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
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;

public class vocabulary extends AppCompatActivity {
    VideoView vv;
    Spinner spin;
    String selection;
    TextView sptx;
    TextView engtx;
    TextView engtx2;
    TextView resultpr;
    EditText answerinp;
    Button say;
    Button showv;
    Button showb;
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
        setContentView(R.layout.activity_vocabulary);
        spin = findViewById(R.id.spinercult);
        sptx = findViewById(R.id.sptxvprompt);
        engtx = findViewById(R.id.engtxvprompt);
        answerinp = findViewById(R.id.answerinputvocab);
        say = findViewById(R.id.sayv);
        showv = findViewById(R.id.showvidvoc);
        showb = findViewById(R.id.tryav);
        practice = findViewById(R.id.practicev);
        botonhablar = findViewById(R.id.micvbtnspint);
        resultpr = findViewById(R.id.resultvocab);
        vv = findViewById(R.id.vvvocab);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.vocab, android.R.layout.simple_spinner_item);
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
        botonhablar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarentradavoz();
            }
        });

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
                    //checkanswer();
                }
                break;
        }

    }

    public void checkanswer(View vista) {
        v = false;
        String t = engtx.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if (t.equalsIgnoreCase(t2)) {
            resultpr.setText("The Answer is Correct!!");
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
            resultpr.setText("Answer is Incorrect ");
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
                                if (v) return;
                                say.setVisibility(View.INVISIBLE);
                                showb.setVisibility(View.INVISIBLE);

                            }

                            @Override
                            public void onError(String s) {
                            }
                        });

                        ttr.speak("answer is incorrect....the answer is..." + engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet

                        if (ttr.isSpeaking()) {
                            showb.setVisibility(View.VISIBLE);
                            say.setVisibility(View.VISIBLE);

                            showb.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    v = true;
                                }
                            });
                        }

                    }
                }
            });

        }
    }

    // este metodo asocia el spiner con el video correcto
    public void showV(View vista) {

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

    vocabgen gen = new vocabgen();

    public void practice(View v) {
        showb.setVisibility(View.INVISIBLE);
        say.setVisibility(View.INVISIBLE);
        switch (selection) {
            case "0 to 50":
                gen.gencerotofifty();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case "50 to 100":
                gen.fiftohun();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case "100 to 150":
                gen.cientociencin();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "150 to 200":
                gen.C150a200();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "200 to 250":
                gen.C200a250();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "250 to 300":
                gen.C250a300();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "300 to 350":
                gen.C300a350();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case "350 to 400":
                gen.C350a400();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case "400 to 500":
                gen.C400a500();
                answerinp.setText("");
                sptx.setText(gen.gens);
                engtx.setText(gen.gene);
                engtx.setTextColor(Color.WHITE);
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tts.setLanguage(spanish);
                            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                                @Override
                                public void onStart(String s) {
                                }

                                @Override
                                public void onDone(String utteranceId) {


                                    iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías..." + sptx.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

        }
    }

    public void sayA(View vista) {
        tti = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            String t = engtx.getText().toString().trim();

            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    tti.setLanguage(Locale.ENGLISH);
                    tti.speak(t, TextToSpeech.QUEUE_ADD, null);

                }
            }
        });
    }


}