package com.example.cipm3;


import org.jetbrains.annotations.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
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
import android.widget.Toast;
import android.widget.VideoView;


import java.util.ArrayList;
import java.util.Locale;

public class estructuras extends AppCompatActivity {
    Spinner spin;
    String selection;
    Generator gen = new Generator();
    TextView sptx;
    boolean v;
    TextView engtx;
    TextView engtx2;
    TextView resultpr;
    EditText answerinp;
    TextToSpeech tts;
    TextToSpeech ttr;
    TextToSpeech tti;
    TextToSpeech tt1;
    Button show;
    Button showv;
    Button say;
    VideoView vv;
    Spinner spin2;
    String selection2;
    Generator2 gen2;


    int r;

    private ImageButton botonhablar;
    public static final int REC_CODE_SPEECH_INPUT = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estructuras);
        spin = (Spinner) findViewById(R.id.spinercult);
        spin2 = findViewById(R.id.spinerrango);
        sptx = (TextView) findViewById(R.id.spanishsentence);
        engtx = (TextView) findViewById(R.id.engtransprompt);
        engtx2 = (TextView) findViewById(R.id.engtext2);
        answerinp = (EditText) findViewById(R.id.answerinput);
        resultpr = (TextView) findViewById(R.id.resulttxt);
        vv = (VideoView) findViewById(R.id.videoView);
        showv = findViewById(R.id.showv);
        botonhablar = findViewById(R.id.voicebtn);
        show = findViewById(R.id.showb);
        say = findViewById(R.id.sayb);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.structures, android.R.layout.simple_spinner_item);
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
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.rango, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection2 = spin2.getSelectedItem().toString();
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

    public void dificulty2(View vista) {
        r = 1;

        switch (selection) {
            //debugeado
            case "Present Simple":
                switch (selection2) {
                    case "0 a 100":
                        gen.generate2();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);

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

                    case "100 a 200":
                        Generator2 gen1 = new Generator2();
                        gen1.GenPastSimple();
                        answerinp.setText("");
                        sptx.setText(gen1.gens);
                        engtx.setText(gen1.gene);

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
                break;
            // debugeado
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.generatepresentecontinuo();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.generatepresentecontinuo();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenerarPresentePerfecto();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenerarPresentePerfecto();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenerarPresentePerfectoContinuo();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenerarPresentePerfectoContinuo();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastContinuo();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastContinuo();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutureSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutureSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutureCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutureCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldSimple();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfect();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfectCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimp();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanSimp();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimp();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustSimp();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustCont();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWantYouTo2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWantYouTo2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "En Desarrollo", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenForTo2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenForTo2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedToPresente2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedTopasado2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastSimple2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastPerf2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishWould2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
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

                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenBeUsedTo2();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                                }

                            }
                        });
                        break;
                    case "100 a 200":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    case "200 a 300":
                        Toast.makeText(this, "Opcion no disponible", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;


        }
    }

    public void dificulty2() {
        r = 1;

        switch (selection) {
            case "Present Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.generate2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Present Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.generatepresentecontinuo();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;
            case "Present Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenerarPresentePerfecto();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;
            case "Present Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenerarPresentePerfectoContinuo();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;
            case "Past Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenPastSimple();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Past Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenPastContinuo();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Past Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenPastPerfect();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Past Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenPastPerfectCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Future Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenFutureSimple();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Future Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenFutureCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Future Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenFuturePerfect();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Future Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenFuturePerfectCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Would Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWouldSimple();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Would Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWouldCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Would Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWouldPerfect();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Would Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWouldPerfectCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Could Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenCouldSimple();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Could Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenCouldCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Could Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenCouldPerfect();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Could Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenCouldPerfectCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Might Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMightSimple();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Might Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMightCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Might Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMightPerfect();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Might Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMightPerfectCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Should Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenShouldSimple();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Should Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenShouldCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Should Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenShouldPerfect();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Should Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenShouldPerfectCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Can Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenCanSimp();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Can Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenCanCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Must Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMustSimp();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Must Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMustCont();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");


                        }

                    }

                });
                break;

            case "Want To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWantYouTo2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;

            case "For To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenForTo2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;


            case "Supposed To Present":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenSupposedToPresente2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;

            case "Supposed To Past":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenSupposedTopasado2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;

            case "Wish Past Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWishPastSimple2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;

            case "Wish Past Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWishPastPerf2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;

            case "Wish Would":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWishWould2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;

            case "Used To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenUsedTo2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;

            case "Be Used To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenBeUsedTo2();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);

                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }

                    }
                });
                break;
        }
    }

    public void dificulty3(View v) {
        r = 2;
        switch (selection) {
            case "Present Simple":
                switch (selection2) {
                    case "0 a 100":
                        gen.generate23();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);

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

                    case "100 a 200":
                        Generator2 gen1 = new Generator2();
                        gen1.generate23();
                        answerinp.setText("");
                        sptx.setText(gen1.gens);
                        engtx.setText(gen1.gene);

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
                break;
            // debugeado
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutureSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutureSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutureContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutureContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldSimpleDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfectDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfectDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfectContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfectContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustSimpDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustContDif3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWantYouTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWantYouTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenForTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenForTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedToPresente3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedToPresente3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedTopasado3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedTopasado3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastSimple3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastSimple3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastPerf3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastPerf3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishWould3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishWould3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenUsedTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenBeUsedTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenBeUsedTo3();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
        }
    }

    public void dificulty3() {
        r = 2;
        switch (selection) {
            case "Present Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.generate23();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Present Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPresContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Present Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPresPerfDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);



                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Present Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPresPerfContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Past Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPastSimpleDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Past Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPastContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Past Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPastPerfDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Past Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPastPerfContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;

            case "Future Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenFutureSimpleDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Future Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenFutureContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Future Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenFuturePerfDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Future Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenFuturePerfContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Would Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWouldSimpDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Would Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWouldContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Would Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWouldPerfDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Would Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWouldPerfContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Could Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCouldSimpleDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Could Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCouldContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Could Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCouldPerfDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Could Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCouldPerfContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Should Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenShouldSimpleDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Should Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenShouldContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Should Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenShouldPerfectDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Should Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenShouldPerfectContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Might Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenMightSimpDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Might Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenMightContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Might Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenMightPerfDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Might Perfect Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenMightPerfContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Can Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCanSimpDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Can Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCanContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Must Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenMustSimpDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Must Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenMustContDif3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Want To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWantYouTo3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "For To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenForTo3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;

            case "Supposed To Present":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenSupposedToPresente3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Supposed To Past":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenSupposedTopasado3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Wish Past Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWishPastSimple3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Wish Past Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWishPastPerf3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Wish Would":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWishWould3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Used To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenUsedTo3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Be Used To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenBeUsedTo3();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
        }

    }

    public void dificulty4(View vista) {
        r = 3;
        switch (selection) {
            case "Present Simple":
                switch (selection2) {
                    case "0 a 100":
                        gen.GenPresSimp4();
                        answerinp.setText("");
                        sptx.setText(gen.gens);
                        engtx.setText(gen.gene);

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

                    case "100 a 200":
                        Generator2 gen1 = new Generator2();
                        gen1.GenPresSimp4();
                        answerinp.setText("");
                        sptx.setText(gen1.gens);
                        engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPresPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPresPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenPastPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenPastPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturoSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturoSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFutureCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFutureCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenFuturePerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenFuturePerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMightPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMightPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenShouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenShouldPerfCont4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);

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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanSimpDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanSimpDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenCanContDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenCanContDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustSimpDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustSimpDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenMustContDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenMustContDif4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWantYouTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWantYouTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenForTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenForTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedToPresente4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedToPresente4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenSupposedTopasado4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenSupposedTopasado4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastSimple4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishPastPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishPastPerf4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenWishWould4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenWishWould4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenUsedTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator gen1 = new Generator();
                                    gen1.GenBeUsedTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
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
                                            iniciarentradavoz();
                                        }

                                        @Override
                                        public void onError(String s) {
                                        }
                                    });
                                    Generator2 gen1 = new Generator2();
                                    gen1.GenBeUsedTo4();
                                    sptx.setText(gen1.gens);
                                    engtx.setText(gen1.gene);
                                    answerinp.setText("");
                                    tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                                }
                            }
                        });
                        break;
                }
                break;
        }
    } //SV 120622

    public void dificulty4() {
        r = 3;
        switch (selection) {
            case "Present Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenPresSimp4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Can Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCanSimpDif4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Can Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenCanContDif4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Must Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMustSimpDif4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }
                    }
                });
                break;
            case "Must Continuous":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenMustContDif4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }
                    }
                });
                break;
            case "Want To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenWantYouTo4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }
                    }
                });
                break;
            case "For To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {
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
                            Generator gen1 = new Generator();
                            gen1.GenForTo4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");

                        }
                    }
                });
                break;

            case "Supposed To Present":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenSupposedToPresente4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Supposed To Past":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenSupposedTopasado4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Wish Past Simple":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWishPastSimple4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Wish Past Perfect":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWishPastPerf4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Wish Would":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenWishWould4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Used To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenUsedTo4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
            case "Be Used To":
                tt1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        Locale spanish = new Locale("es", "MX");
                        if (i == TextToSpeech.SUCCESS) {
                            int lang = tt1.setLanguage(spanish);
                            tt1.setOnUtteranceProgressListener(new UtteranceProgressListener() {

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
                            Generator gen1 = new Generator();
                            gen1.GenBeUsedTo4();
                            sptx.setText(gen1.gens);
                            engtx.setText(gen1.gene);
                            engtx2.setText(gen1.gene2);


                            answerinp.setText("");
                            tt1.speak("como dirías..." + sptx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "one");
                        }

                    }
                });
                break;
        }

    } //SV 060622

    public void checkanswer(View vista) {
        v = false;
        String t = engtx.getText().toString().trim();
        String t3 = engtx2.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if (t.equalsIgnoreCase(t2) || t3.equalsIgnoreCase(t2)) {
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

                                //    switch (r) {
                                //      case 0:
                                //          dificulty1();
                                //           break;
                                //       case 1:
                                //          dificulty2();
                                //         break;
                                //     case 2:
                                //         dificulty3();
                                //         break;

                                // }


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
            if (answerinp.getText().toString().trim().equals("stop")) return;
            resultpr.setText("Answer is Incorrect ");
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        engtx.setTextColor(Color.BLACK);
                        if (r == 0) {

                        }
                        if (r == 1) {

                        }
                        ttr.setLanguage(Locale.ENGLISH);
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {

                            }

                            @Override
                            public void onDone(String utteranceId) {
                                if (v) return;
                                say.setVisibility(View.INVISIBLE);
                                show.setVisibility(View.INVISIBLE);

                                //    switch (r) {
                                //      case 0:
                                //          dificulty1();
                                //           break;
                                //       case 1:
                                //          dificulty2();
                                //         break;
                                //     case 2:
                                //         dificulty3();
                                //         break;

                                // }

                            }

                            @Override
                            public void onError(String s) {
                            }
                        });

                        ttr.speak("answer is incorrect....the answer is..." + engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet

                        if (ttr.isSpeaking()) {
                            show.setVisibility(View.VISIBLE);
                            say.setVisibility(View.VISIBLE);

                            show.setOnClickListener(new View.OnClickListener() {
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

    public void checkanswer() {
        v = false;
        String t = engtx.getText().toString().trim();
        String t3 = engtx2.getText().toString().trim();
        String t2 = answerinp.getText().toString().trim();
        if (t.equalsIgnoreCase(t2) || t3.equalsIgnoreCase(t2)) {
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

                                switch (r) {
                                    case 0:
                                        dificulty2();
                                        break;
                                    case 1:
                                        dificulty3();
                                        break;

                                }


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
            if (answerinp.getText().toString().trim().equals("stop")) return;
            resultpr.setText("Answer is Incorrect ");
            ttr = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        engtx.setTextColor(Color.BLACK);
                        if (r == 0) {

                        }
                        if (r == 1) {

                        }
                        if (r == 2) {
                            engtx2.setTextColor(Color.BLACK);
                        }
                        ttr.setLanguage(Locale.ENGLISH);
                        ttr.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            @Override
                            public void onStart(String s) {

                            }

                            @Override
                            public void onDone(String utteranceId) {
                                if (v) return;
                                say.setVisibility(View.INVISIBLE);
                                show.setVisibility(View.INVISIBLE);

                                switch (r) {
                                    case 0:
                                        dificulty2();
                                        break;
                                    case 1:
                                        dificulty3();
                                        break;
                                }

                            }

                            @Override
                            public void onError(String s) {
                            }
                        });

                        ttr.speak("answer is incorrect   the answer is  " + engtx.getText().toString().trim(), TextToSpeech.QUEUE_ADD, null, "string");
                        //trying to enable them when ttr is speaking if clickable return so they can try again and hear answer, not done
                        //with this yet

                        if (ttr.isSpeaking()) {
                            show.setVisibility(View.VISIBLE);
                            say.setVisibility(View.VISIBLE);

                            show.setOnClickListener(new View.OnClickListener() {
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

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void grammar(View v) {
        //agarra tu respuesta
        String t = answerinp.getText().toString().trim();
        //la quiebra en partes
        String partes[] = t.split(" ");
        //inicia la variable de control
        String control = "";
        //forma una frase clave con meta palabras dependiendo de la palabra dada en el answerinput
        for (int i = 0; i < partes.length; i++) {
            control = control + whatAmI(partes[i] + " ");
        }
        //toma esa meta oración y te dice qeu esta bien o por que esta mal
        switch (control) {
            case "pronoun verbt ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // I eat
                break;
            case "pronoun verbi ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // I go
                break;
            case "pronoun linking ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                //I am
                break;
            case "pronoun verbt3 ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // he eats
                break;
            case "pronoun verbi3 ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                //she goes
                break;
            case "pronoun linking3 ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                //  he is
                break;
            case "pronoun linking1 ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // I am
                break;
            case "article noun verbt3 ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // the boy eats
                break;
            case "article noun verbi3 ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // the car goes
                break;
            case "article noun linking3 ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                //the car is
                break;
            case "article nouns verbt3p ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // the boys eat
                break;
            case "article nouns verbi3p ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                // the cars go
                break;
            case "article nouns linking3p ":
                Toast.makeText(this, "you did it !" + control, Toast.LENGTH_SHORT).show();
                //the cars are
                break;


            default:
                Toast.makeText(this, "default" + control, Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private String whatAmI(String parte) {
        String code = "no such word";
        //pregunta en que array cae tu palabra y le asigna una meta palabra
        switch (parte) {
            case "the":
                return "article";
            case "a":
                return "article";
            case "an":
                return "article";
            case "some":
                return "article";
            case "I":
                return "pronoun1";
            case "you":
                return "pronoun2";
            case "he":
                return "pronoun3";
            case "she":
                return "pronoun3";
            case "it":
                return "pronoun3";
            case "we":
                return "pronoun4";
            case "they":
                return "pronoun5";


        }

        return code;
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

    public void sayA() {
        tti = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            String t = engtx.getText().toString().trim();

            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    tti.setLanguage(Locale.ENGLISH);

                    tti.speak(t, 0, null, null);

                }
            }
        });
    }

    public void showV(View vista) {

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REC_CODE_SPEECH_INPUT:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    answerinp.setText(result.get(0));
                    // checkanswer();

                    //dificulty2();


                }
                break;
        }

    }
}

