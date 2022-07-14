package com.example.cipm3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Locale;
public class MainTesting extends AppCompatActivity {


    TextToSpeech tts;
    private ImageButton botonhablar;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    EditText answerinput;
    TextView text,texteng;
    String engtxt,inputxt;
    Button startnext,save,seeresults;
    boolean temp;
    Switch aSwitch;



    //p-present,pa-past,mi=might,m-must, vj=verbos juntos
    boolean ps,pc,pp,ppc,pas,pac,pap,papc,fs,fc,fp,fpc,ws,wc,wp,wpc,cs,cc,ccp,cpc,ss,sc,sp,spc,mis,mic,mip,mipc
            ,ms,mc,mp,mpc,cans,canc,pvpp,vj,pregunta,get,thereis,goingto,haveto,usedto,reflx,supp,wyt,wish,comp,superl,formeto
            ;
    DatabaseReference myDbRef= FirebaseDatabase.getInstance().getReference().child("Score");

    //counter positive, counter negative
    int cp=0;
    int cn=0;
    Boolean Automatic;
    Generator gen  = new Generator();
    int number=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_testing);
        botonhablar = findViewById(R.id.btnhablartesting);
        answerinput = findViewById(R.id.answerinputtest);
        text= findViewById(R.id.comodiriastestmain);
        texteng= findViewById(R.id.engtxtx);
        seeresults=findViewById(R.id.ResultsBtn);
        texteng.setVisibility(View.INVISIBLE);
        botonhablar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarentradavoz();
            }
        });
        save= findViewById(R.id.sendinfo);
        aSwitch=findViewById(R.id.switch1);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendInfo();
            }


        });
        save.setVisibility(View.INVISIBLE);


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
                    answerinput.setText(result.get(0));

                }
                break;
        }

    }
    // to do
    // complete metodo de preguntas, el completo y luego el automatico ,
    public void chosenMode(View v){
        if(aSwitch.isChecked()){
            Toast.makeText(this," switch checked automatic under construction", Toast.LENGTH_SHORT).show();
            //   startAuto();
        }else {
            StartComplete();
            Toast.makeText(this,"switch not checked", Toast.LENGTH_SHORT).show();
        }
    }
    public void StartComplete(){
        // number=whatever we get from database
        switch (number){
            case 0:
                answerinput.setText("");
                gen.GenPresSimp2();
                text.setText(gen.gens);
                texteng.setText(gen.gene);
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


                                    // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías  " + text.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
            case 1:
                answerinput.setText("");
                gen.GenPresCont2();
                text.setText(gen.gens);
                texteng.setText(gen.gene);
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


                                    // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías  " + text.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case 2:
                answerinput.setText("");
                gen.GenPresPerf2();
                text.setText(gen.gens);
                texteng.setText(gen.gene);
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


                                    // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías  " + text.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
        }


    }
    public void startAuto(){
        // number=whatever we get from database
        switch (number){
            case 0:
                answerinput.setText("");
                gen.GenPresSimp2();
                text.setText(gen.gens);
                texteng.setText(gen.gene);
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


                                    // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías  " + text.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case 1:
                answerinput.setText("");
                gen.GenPresCont2();
                text.setText(gen.gens);
                texteng.setText(gen.gene);
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


                                    // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías  " + text.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;

            case 2:
                answerinput.setText("");
                gen.GenPresPerf2();
                text.setText(gen.gens);
                texteng.setText(gen.gene);
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


                                    // iniciarentradavoz();
                                }

                                @Override
                                public void onError(String s) {
                                }
                            });
                            tts.speak("como dirías  " + text.getText().toString().trim(), 0, null, "zero");
                        }

                    }
                });
                break;
        }


    }
    public void submitbtn(View vista){
        int cpp=0;
        int cnn=0;
        inputxt=answerinput.getText().toString().trim();
        String v= texteng.getText().toString().trim();
        // as long as cp and cn is raised this if statement is mostly useless
        if(inputxt.equalsIgnoreCase(v)){
            cpp= cp++;
            String s=Integer.toString(cpp);
            Toast.makeText(this, s+" good",Toast.LENGTH_SHORT).show();

        }else {
            cnn=cn++;
            String s2=Integer.toString(cnn);
            Toast.makeText(this,s2+ " bad ",Toast.LENGTH_SHORT).show();
        }

        if(cpp >2 || cnn > 2){
            if(cpp>2) {
                Toast.makeText(this," approved ", Toast.LENGTH_SHORT).show();
                TurnTrue(number);
                number++;
                save.setVisibility(View.VISIBLE);
                cp=0;
                cn=0;
            }else {
                Toast.makeText(this," not approved ", Toast.LENGTH_SHORT).show();
                number++;
                save.setVisibility(View.VISIBLE);
                cp=0;
                cn=0;

            }

        }


    }
    private void TurnTrue(int number) {

        switch (number){
            case 0:
                ps=true;
                break;

            case 1:
                pc=true;

                break;

            case 2:
                pp= true;
                break;


        }

    }
    private void sendInfo() {
        String name;
        name=answerinput.getText().toString().trim();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(name,ps,pc,pp);
        students.add(student);
        myDbRef.setValue(students);
        save.setVisibility(View.INVISIBLE);



    }
    public void change(View v){
        Intent intent= new Intent(this,StructureResults.class);
        startActivity(intent);

    }


}