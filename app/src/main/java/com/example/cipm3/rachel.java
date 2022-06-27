package com.example.cipm3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Locale;

public class rachel extends AppCompatActivity {
    VideoView vv;
    String selection;
    Spinner spin;
    TextView tv1, tv2, tv3, tv4, tv5;
    EditText ai1, ai2, ai3, ai4, ai5;
    String r1, r2, r3, r4, r5;
    String temp;
    int control;
    public static final int REC_CODE_SPEECH_INPUT = 100;
    private ImageButton botonhablar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rachel);
        vv = findViewById(R.id.videorachel);
        spin = findViewById(R.id.spinerachel);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        ai1 = findViewById(R.id.ai1);
        ai2 = findViewById(R.id.ai2);
        ai3 = findViewById(R.id.ai3);
        ai4 = findViewById(R.id.ai4);
        ai5 = findViewById(R.id.ai5);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.rachel, android.R.layout.simple_spinner_item);
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
    public void showv(View vista) {
        switch (selection) {
            case "Steve Jobs 1":
                // video completo con los 5 diferentes temas
                Uri uri = Uri.parse("http://adrianlealcaldera.com/billburrstevejobsclip1.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                clickbb1();
                break;

        }
    }
    // click para el video de bill burr 1
    public void clickbb1() {
        SpannableString ss = new SpannableString("1.");
        ClickableSpan txtone = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                control = 1;
                r1 = "actually nerd jesus died in the last year right steve jobs";
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/bb1.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(rachel.this));
                vv.requestFocus();
                vv.start();

            }
        };
        ss.setSpan(txtone, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(ss);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        // second one
        SpannableString ss2 = new SpannableString("2.");
        ClickableSpan txt2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                //what the click does
                control = 2;
                r2 = "yeah he died right i know i know a lot of nerds here tonight";
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/bb2.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(rachel.this));
                vv.requestFocus();
                vv.start();
            }
        };
        //makes it clickable
        ss2.setSpan(txt2, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2.setText(ss2);
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        // third
        SpannableString ss3 = new SpannableString("3.");
        ClickableSpan txt3 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                control = 3;
                r3 = "i know you sad";
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/bb3.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(rachel.this));
                vv.requestFocus();
                vv.start();
            }
        };
        ss3.setSpan(txt3, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3.setText(ss3);
        tv3.setMovementMethod(LinkMovementMethod.getInstance());
        //fourth
        SpannableString ss4 = new SpannableString("4.");
        ClickableSpan txt4 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                control = 4;
                r4 = "I didn't get it";
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/bb4.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(rachel.this));
                vv.requestFocus();
                vv.start();
            }
        };
        ss4.setSpan(txt4, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv4.setText(ss4);
        tv4.setMovementMethod(LinkMovementMethod.getInstance());
        // fifth
        SpannableString ss5 = new SpannableString("5.");
        ClickableSpan txt5 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                control = 5;
                r5 = "I didn't get the big deal they made about that guy";
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/bb5.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(rachel.this));
                vv.requestFocus();
                vv.start();
            }
        };
        ss5.setSpan(txt5, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv5.setText(ss5);
        tv5.setMovementMethod(LinkMovementMethod.getInstance());

    }
    public void showExp(View view) {
        switch (selection) {
            case "Steve Jobs 1":
                switch (control) {
                    case 1:
                        Uri uri = Uri.parse("http://adrianlealcaldera.com/expbb1.mp4");
                        vv.setVideoURI(uri);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 2:
                        Uri uri1 = Uri.parse("http://adrianlealcaldera.com/expbb2.mp4");
                        vv.setVideoURI(uri1);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 3:
                        Uri uri2 = Uri.parse("http://adrianlealcaldera.com/expbb3.mp4");
                        vv.setVideoURI(uri2);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;

                    case 4:
                        Uri uri3 = Uri.parse("http://adrianlealcaldera.com/expbb4.mp4");
                        vv.setVideoURI(uri3);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                    case 5:
                        Uri uri4 = Uri.parse("http://adrianlealcaldera.com/expbb5.mp4");
                        vv.setVideoURI(uri4);
                        vv.setMediaController(new MediaController(this));
                        vv.requestFocus();
                        vv.start();
                        break;
                }
                break;
        }
    }
    public void checkA(View view) {
        switch (control) {
            case 1:
                temp = ai1.getText().toString();
                if (temp.equalsIgnoreCase(r1)) {
                    ai1.setTextColor(Color.GREEN);
                } else {
                    ai1.setTextColor(Color.RED);
                }
                break;

            case 2:
                temp = ai2.getText().toString();
                if (temp.equalsIgnoreCase(r2)) {
                    ai2.setTextColor(Color.GREEN);
                } else {
                    ai2.setTextColor(Color.RED);
                }
                break;

            case 3:
                temp = ai3.getText().toString();
                if (temp.equalsIgnoreCase(r3)) {
                    ai3.setTextColor(Color.GREEN);
                } else {
                    ai3.setTextColor(Color.RED);
                }
                break;

            case 4:
                temp = ai4.getText().toString();
                if (temp.equalsIgnoreCase(r4)) {
                    ai4.setTextColor(Color.GREEN);
                } else {
                    ai4.setTextColor(Color.RED);
                }
                break;

            case 5:
                temp = ai5.getText().toString();
                if (temp.equalsIgnoreCase(r5)) {
                    ai5.setTextColor(Color.GREEN);
                } else {
                    ai5.setTextColor(Color.RED);
                }
                break;
        }
    }
    public void hablar(View vista) {
        iniciarentradavoz();
    }
    public void showAnswers(View view) {
        switch (control) {
            case 1:
                ai1.setText(r1);
                break;

            case 2:
                ai2.setText(r2);
                break;

            case 3:
                ai3.setText(r3);
                break;

            case 4:
                ai4.setText(r4);
                break;

            case 5:
                ai5.setText(r5);
                break;
        }
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
                    switch (control) {
                        case 1:
                            ai1.setText(result.get(0));
                            break;
                        case 2:
                            ai2.setText(result.get(0));
                            break;
                        case 3:
                            ai3.setText(result.get(0));
                            break;
                        case 4:
                            ai4.setText(result.get(0));
                            break;
                        case 5:
                            ai5.setText(result.get(0));
                            break;
                    }

                    // checkanswer();
                    //dificulty2();


                }
                break;
        }

    }


}