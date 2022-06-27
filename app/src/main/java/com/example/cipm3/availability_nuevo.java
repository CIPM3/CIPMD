package com.example.cipm3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

public class availability_nuevo extends AppCompatActivity {
    TextView tv;
    TextView textspin1;
    Spinner spin;
    VideoView vv;
    LinearLayout vf;
    String selection;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availability_nuevo);

        tv = findViewById(R.id.txt_view);
        textspin1 = findViewById(R.id.textspin1);
        spin = findViewById(R.id.spinuno);
        vv = findViewById(R.id.vv);
        vf = findViewById(R.id.vf);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.prager,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection = spin.getSelectedItem().toString();
                textspin1.setText(selection);

                vv.setVisibility(View.GONE);
                vf.setVisibility(View.VISIBLE);

                tv.setText("");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void select(View v) {
        vv.setVisibility(View.VISIBLE);
        vf.setVisibility(View.GONE);

        switch (selection) {
            case "Black Fathers":
                texts t = new texts();
                String text = t.BlackFathers;
                SpannableString ss = new SpannableString(text);

                ClickableSpan between = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.between);
                    }
                };
                ClickableSpan children = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.children);
                    }
                };
                ClickableSpan ago = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.ago);
                    }
                };
                ClickableSpan then = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.then);
                    }
                };
                ClickableSpan iasked = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.iasked);
                    }
                };
                ClickableSpan which = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.which);
                    }
                };
                ClickableSpan poses = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.poses);
                    }
                };
                ClickableSpan bigger = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.bigger);
                    }
                };
                ClickableSpan threat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.threat);
                    }
                };
                ClickableSpan withouthmissingabeat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.withouthmissingabeat);
                    }
                };
                ClickableSpan hesaid = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hesaid);
                    }
                };
                ClickableSpan itwas = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.itwas);
                    }
                };
                ClickableSpan who = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.who);
                    }
                };
                ClickableSpan weall = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.weall);
                    }
                };
                ClickableSpan know = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.know);
                    }
                };
                ClickableSpan that = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.that);
                    }
                };
                ClickableSpan growup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.growup);
                    }
                };
                ClickableSpan likely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.likely);
                    }
                };
                ClickableSpan poverty = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.poverty);
                    }
                };
                ClickableSpan dropout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.dropout);
                    }
                };
                ClickableSpan endup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.endup);
                    }
                };
                ClickableSpan even = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.even);
                    }
                };
                ClickableSpan after = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.after);
                    }
                };
                ClickableSpan controlling = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.controlling);
                    }
                };
                ClickableSpan varying = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.varying);
                    }
                };
                ClickableSpan householdincome = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.householdincome);
                    }
                };
                ClickableSpan jail = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.jail);
                    }
                };
                ClickableSpan mostlikely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.mostlikely);
                    }
                };
                ClickableSpan windup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.windup);
                    }
                };
                ClickableSpan eachother = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.eachother);
                    }
                };
                ClickableSpan risen = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.risen);
                    }
                };
                ClickableSpan reached = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.reached);
                    }
                };
                ClickableSpan during = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.during);
                    }
                };
                ClickableSpan marriage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.marriage);
                    }
                };
                ClickableSpan were = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.were);
                    }
                };
                ClickableSpan than = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.than);
                    }
                };
                ClickableSpan raised = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.raised);
                    }
                };
                ClickableSpan both = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.both);
                    }
                };
                ClickableSpan written = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.written);
                    }
                };
                ClickableSpan according = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.according);
                    }
                };
                ClickableSpan outofwedlock = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.outofwedlock);
                    }
                };
                ClickableSpan birth = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.birth);
                    }
                };
                ClickableSpan lessthan = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.lessthan);
                    }
                };
                ClickableSpan over = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.over);
                    }
                };
                ClickableSpan answer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.answer);
                    }
                };
                ClickableSpan found = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.found);
                    }
                };
                ClickableSpan law = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.law);
                    }
                };
                ClickableSpan iff = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.iff);
                    }
                };
                ClickableSpan subsidize = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.subsidize);
                    }
                };
                ClickableSpan undesirable = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.undesirable);
                    }
                };
                ClickableSpan behavior = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.behavior);
                    }
                };
                ClickableSpan youwillget = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.youwillget);
                    }
                };
                ClickableSpan soCalled = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.soCalled);
                    }
                };
                ClickableSpan war = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.war);
                    }
                };
                ClickableSpan began = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.began);
                    }
                };
                ClickableSpan begantoflatline = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.begantoflatline);
                    }
                };
                ClickableSpan from = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.from);
                    }
                };
                ClickableSpan until = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.until);
                    }
                };
                ClickableSpan untilnow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.untilnow);
                    }
                };
                ClickableSpan spent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.spent);
                    }
                };
                ClickableSpan hasspent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hasspent);
                    }
                };
                ClickableSpan tofightpoverty = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.tofightpoverty);
                    }
                };
                ClickableSpan rate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.rate);
                    }
                };
                ClickableSpan hasremainedunchanged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hasremainedunchanged);
                    }
                };
                ClickableSpan haschanged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.haschanged);
                    }
                };
                ClickableSpan dramatically = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.dramatically);
                    }
                };
                ClickableSpan Thatsbecause = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thatsbecause);
                    }
                };
                ClickableSpan generous = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.generous);
                    }
                };
                ClickableSpan ineffect = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.ineffect);
                    }
                };
                ClickableSpan abandon = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.abandon);
                    }
                };
                ClickableSpan traditional = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.traditional);
                    }
                };
                ClickableSpan financial = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.financial);
                    }
                };
                ClickableSpan responsibilities = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.responsibilities);
                    }
                };
                ClickableSpan suchdependency = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.suchdependency);
                    }
                };
                ClickableSpan learnedhelplessness = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.learnedhelplessness);
                    }
                };
                ClickableSpan disincentive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.disincentive);
                    }
                };
                ClickableSpan tryingtohelp = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.tryingtohelp);
                    }
                };
                ClickableSpan poor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.poor);
                    }
                };
                ClickableSpan nonpoor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.nonpoor);
                    }
                };
                ClickableSpan whether = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.whether);
                    }
                };
                ClickableSpan additional = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.additional);
                    }
                };
                ClickableSpan respondents = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.respondents);
                    }
                };
                ClickableSpan oncesaid = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.oncesaid);
                    }
                };
                ClickableSpan headmitted = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.headmitted);
                    }
                };
                ClickableSpan runningwith = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.runningwith);
                    }
                };
                ClickableSpan gangs = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.gangs);
                    }
                };
                ClickableSpan structure = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.structure);
                    }
                };
                ClickableSpan protection = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.protection);
                    }
                };
                ClickableSpan calmyoudown = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.calmyoudown);
                    }
                };
                ClickableSpan theway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.theway);
                    }
                };
                ClickableSpan teachyou = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.teachyou);
                    }
                };
                ClickableSpan howtobe = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.howtobe);
                    }
                };
                ClickableSpan myrough = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.myrough);
                    }
                };
                ClickableSpan growingup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.growingup);
                    }
                };
                ClickableSpan fulltimejobs = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.fulltimejobs);
                    }
                };
                ClickableSpan asa = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.asa);
                    }
                };
                ClickableSpan janitor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.janitor);
                    }
                };
                ClickableSpan also = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.also);
                    }
                };
                ClickableSpan hismid80s = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.hismid80s);
                    }
                };
                ClickableSpan angry = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.angry);
                    }
                };
                ClickableSpan bitter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.bitter);
                    }
                };
                ClickableSpan insisted = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.insisted);
                    }
                };
                ClickableSpan racialsegregation = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.racialsegregation);
                    }
                };
                ClickableSpan yougetoutoflifewhatyouputintoit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.yougetoutoflifewhatyouputintoit);
                    }
                };

                ClickableSpan blamingotherpeople = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.blamingotherpeople);
                    }
                };

                ClickableSpan whatcouldihavedonetochangetheoutcome = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.whatcouldihavedonetochangetheoutcome);
                    }
                };

                ClickableSpan Thisadviceshaped = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thisadviceshaped);
                    }
                };

                ClickableSpan staffsergeant = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.staffsergeant);
                    }
                };
                ClickableSpan jimcrowsouth = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.jimcrowsouth);
                    }
                };
                ClickableSpan fulltime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.fulltime);
                    }
                };
                ClickableSpan somehow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.somehow);
                    }
                };
                ClickableSpan cooked = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.cooked);
                    }
                };
                ClickableSpan andsomehowmanaged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.andsomehowmanaged);
                    }
                };
                ClickableSpan nightschool = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.nightschool);
                    }
                };
                ClickableSpan gethisGED = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.gethisGED);
                    }
                };
                ClickableSpan heran = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.heran);
                    }
                };
                ClickableSpan thelaterapper = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.thelaterapper);
                    }
                };
                ClickableSpan fathersmatter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.fathersmatter);
                    }
                };
                ClickableSpan wehave = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.wehave);
                    }
                };

                int i1 = text.indexOf("between");
                int i2 = text.indexOf("children");
                int i3 = text.indexOf("ago");
                int i4 = text.indexOf("then");
                int i5 = text.indexOf("I asked");
                int i6 = text.indexOf("Which");
                int i7 = text.indexOf("poses");
                int i8 = text.indexOf("bigger");
                int i9 = text.indexOf("threat");
                int i10 = text.indexOf("Without missing a beat");
                int i11 = text.indexOf("he said");
                int i12 = text.indexOf("it was");
                int i13 = text.indexOf("who");
                int i14 = text.indexOf("We all");
                int i15 = text.indexOf("know");
                int i16 = text.indexOf("That");
                int i17 = text.indexOf("grow up");
                int i18 = text.indexOf("likely");
                int i19 = text.indexOf("poverty");
                int i20 = text.indexOf("drop out");
                int i21 = text.indexOf("end up");
                int i22 = text.indexOf("even");
                int i23 = text.indexOf("after");
                int i24 = text.indexOf("controlling");
                int i25 = text.indexOf("varying");
                int i26 = text.indexOf("household income");
                int i27 = text.indexOf("jail");
                int i28 = text.indexOf("most likely");
                int i29 = text.indexOf("wind up");
                int i30 = text.indexOf("each other");
                int i31 = text.indexOf("risen");
                int i32 = text.indexOf("reached");
                int i33 = text.indexOf("during");
                int i34 = text.indexOf("marriage");
                int i35 = text.indexOf("were");
                int i36 = text.indexOf("than");
                int i37 = text.indexOf("raised");
                int i38 = text.indexOf("both");
                int i39 = text.indexOf("written");
                int i40 = text.indexOf("according");
                int i41 = text.indexOf("out-of-wedlock");
                int i42 = text.indexOf("birth");
                int i43 = text.indexOf("less than");
                int i44 = text.indexOf("over");
                int i45 = text.indexOf("answer");
                int i46 = text.indexOf("found");
                int i47 = text.indexOf("law");
                int i48 = text.indexOf("If");
                int i49 = text.indexOf("subsidize");
                int i50 = text.indexOf("undesirable");
                int i51 = text.indexOf("behavior");
                int i52 = text.indexOf("you will get");
                int i53 = text.indexOf("so-called");
                int i54 = text.indexOf("war");
                int i55 = text.indexOf("began");
                int i56 = text.indexOf("began to flat line");
                int i57 = text.indexOf("from");
                int i58 = text.indexOf("until");
                int i59 = text.indexOf("until now");
                int i60 = text.indexOf("spent");
                int i61 = text.indexOf("has spent");
                int i62 = text.indexOf("to fight poverty");
                int i63 = text.indexOf("rate");
                int i64 = text.indexOf("has remained unchanged");
                int i65 = text.indexOf("has changed");
                int i66 = text.indexOf("dramatically");
                int i67 = text.indexOf("That’s because");
                int i68 = text.indexOf("generous");
                int i69 = text.indexOf("in effect");
                int i70 = text.indexOf("abandon");
                int i71 = text.indexOf("traditional");
                int i72 = text.indexOf("financial");
                int i73 = text.indexOf("responsibilities");
                int i74 = text.indexOf("such dependency");
                int i75 = text.indexOf("learned helplessness");
                int i76 = text.indexOf("disincentives");
                int i77 = text.indexOf("trying to help");
                int i78 = text.indexOf("poor");
                int i79 = text.indexOf("non-poor");
                int i80 = text.indexOf("whether");
                int i81 = text.indexOf("additional");
                int i82 = text.indexOf("respondents");
                int i83 = text.indexOf("once said");
                int i84 = text.indexOf("He admitted");
                int i85 = text.indexOf("running with");
                int i86 = text.indexOf("gangs");
                int i87 = text.indexOf("structure");
                int i88 = text.indexOf("protection");
                int i89 = text.indexOf("calm you down");
                int i90 = text.indexOf("the way");
                int i91 = text.indexOf("teach you");
                int i92 = text.indexOf("how to be");
                int i93 = text.indexOf("my rough");
                int i94 = text.indexOf("Growing up");
                int i95 = text.indexOf("full-time jobs");
                int i96 = text.indexOf("as a");
                int i97 = text.indexOf("janitor");
                int i98 = text.indexOf("also");
                int i99 = text.indexOf("his mid-80s");
                int i100 = text.indexOf("angry");
                int i101 = text.indexOf("bitter");
                int i102 = text.indexOf("insisted");
                int i103 = text.indexOf("racial segregation");
                int i104 = text.indexOf("You get out of life what you put into it");

                int i106 = text.indexOf("blaming other people");
                int i107 = text.indexOf("what could I have done to change the outcome");
                int i108 = text.indexOf("This advice shaped");
                int i109 = text.indexOf("staff sergeant");
                int i110 = text.indexOf("Jim Crow South");
                int i111 = text.indexOf("full-time");
                int i112 = text.indexOf("somehow");
                int i113 = text.indexOf("cooked");
                int i114 = text.indexOf("and somehow managed");
                int i115 = text.indexOf("night school");
                int i116 = text.indexOf("get his GED");

                int i118 = text.indexOf("he ran");
                int i119 = text.indexOf("the late rapper");
                int i120 = text.indexOf("Fathers matter");
                int i121 = text.indexOf("we have");

                ss.setSpan(between, i1, i1 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(children, i2, i2 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(ago, i3, i3 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(then, i4, i4 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(iasked, i5, i5 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(which, i6, i6 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(poses, i7, i7 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(bigger, i8, i8 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(threat, i9, i9 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(withouthmissingabeat, i10, i10 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hesaid, i11, i11 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(itwas, i12, i12 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(who, i13, i13 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(weall, i14, i14 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(know, i15, i15 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(that, i16, i16 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(growup, i17, i17 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(likely, i18, i18 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(poverty, i19, i19 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(dropout, i20, i20 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(endup, i21, i21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(even, i22, i22 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(after, i23, i23 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(controlling, i24, i24 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(varying, i25, i25 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(householdincome, i26, i26 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(jail, i27, i27 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(mostlikely, i28, i28 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(windup, i29, i29 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(eachother, i30, i30 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(risen, i31, i31 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(reached, i32, i32 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(during, i33, i33 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(marriage, i34, i34 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(were, i35, i35 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(than, i36, i36 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(raised, i37, i37 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(both, i38, i38 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(written, i39, i39 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(according, i40, i40 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(outofwedlock, i41, i41 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(birth, i42, i42 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(lessthan, i43, i43 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(over, i44, i44 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(answer, i45, i45 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(found, i46, i46 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(law, i47, i47 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(iff, i48, i48 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(subsidize, i49, i49 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(undesirable, i50, i50 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(behavior, i51, i51 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(youwillget, i52, i52 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(soCalled, i53, i53 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(war, i54, i54 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(began, i55, i55 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(begantoflatline, i56, i56 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(from, i57, i57 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(until, i58, i58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(untilnow, i59, i59 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(spent, i60, i60 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hasspent, i61, i61 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(tofightpoverty, i62, i62 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(rate, i63, i63 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hasremainedunchanged, i64, i64 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(haschanged, i65, i65 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(dramatically, i66, i66 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thatsbecause, i67, i67 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(generous, i68, i68 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(ineffect, i69, i69 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(abandon, i70, i70 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(traditional, i71, i71 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(financial, i72, i72 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(responsibilities, i73, i73 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(suchdependency, i74, i74 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(learnedhelplessness, i75, i75 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(disincentive, i76, i76 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(tryingtohelp, i77, i77 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(poor, i78, i78 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(nonpoor, i79, i79 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(whether, i80, i80 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(additional, i81, i81 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(respondents, i82, i82 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(oncesaid, i83, i83 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(headmitted, i84, i84 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(runningwith, i85, i85 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(gangs, i86, i86 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(structure, i87, i87 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(protection, i88, i88 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(calmyoudown, i89, i89 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(theway, i90, i90 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(teachyou, i91, i91 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(howtobe, i92, i92 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(myrough, i93, i93 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(growingup, i94, i94 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(fulltimejobs, i95, i95 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(asa, i96, i96 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(janitor, i97, i97 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(also, i98, i98 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(hismid80s, i99, i99 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(angry, i100, i100 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(bitter, i101, i101 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(insisted, i102, i102 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(racialsegregation, i103, i103 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(yougetoutoflifewhatyouputintoit, i104, i104 + 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                ss.setSpan(blamingotherpeople, i106, i106 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(whatcouldihavedonetochangetheoutcome, i107, i107 + 44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(Thisadviceshaped, i108, i108 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(staffsergeant, i109, i109 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(jimcrowsouth, i110, i110 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(fulltime, i111, i111 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(somehow, i112, i112 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(cooked, i113, i113 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(andsomehowmanaged, i114, i114 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(nightschool, i115, i115 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(gethisGED, i116, i116 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                ss.setSpan(heran, i118, i118 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(thelaterapper, i119, i119 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(fathersmatter, i120, i120 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss.setSpan(wehave, i121, i121 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss);
                tv.setMovementMethod(LinkMovementMethod.getInstance());

                Uri uri = Uri.parse("http://adrianlealcaldera.com/blackfathers.mp4");
                vv.setVideoURI(uri);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Is America Racist?":
                texts t1 = new texts();
                String text1 = t1.isAmericaRacist;
                SpannableString ss1 = new SpannableString(text1);
                ClickableSpan Still = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Still);
                    }
                };
                ClickableSpan Certainly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Certainly);
                    }
                };
                ClickableSpan Thinksso = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thinksso);
                    }
                };
                ClickableSpan That = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.That);
                    }
                };
                ClickableSpan If = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.If);
                    }
                };
                ClickableSpan Doesntthatmean = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doesntthatmean);
                    }
                };
                ClickableSpan So = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.So);
                    }
                };
                ClickableSpan Vote = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Vote);
                    }
                };
                ClickableSpan who2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.who2);
                    }
                };
                ClickableSpan was = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.was);
                    }
                };
                ClickableSpan elected = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.elected);
                    }
                };
                ClickableSpan almost = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.almost);
                    }
                };
                ClickableSpan later = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.later);
                    }
                };
                ClickableSpan thats = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.thats);
                    }
                };
                ClickableSpan only = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.only);
                    }
                };
                ClickableSpan themost = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.themost);
                    }
                };
                ClickableSpan thereare = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.thereare);
                    }
                };
                ClickableSpan take = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.take);
                    }
                };
                ClickableSpan marriage2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.marriage2);
                    }
                };
                ClickableSpan wrote = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.wrote);
                    }
                };
                ClickableSpan viewed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.viewed);
                    }
                };
                ClickableSpan benchmark = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.benchmark);
                    }
                };
                ClickableSpan stage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.stage);
                    }
                };
                ClickableSpan were2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.were2);
                    }
                };
                ClickableSpan until2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.until2);
                    }
                };
                ClickableSpan Galluppoll = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Galluppoll);
                    }
                };
                ClickableSpan Found = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Found);
                    }
                };
                ClickableSpan That2 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.That2);
                    }
                };
                ClickableSpan Of = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Of);
                    }
                };
                ClickableSpan All = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.All);
                    }
                };
                ClickableSpan By = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.By);
                    }
                };
                ClickableSpan Rising = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rising);
                    }
                };
                ClickableSpan Whatabout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whatabout);
                    }
                };
                ClickableSpan Racialprofiling = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Racialprofiling);
                    }
                };
                ClickableSpan Doesntthat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doesntthat);
                    }
                };
                ClickableSpan Remains = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Remains);
                    }
                };
                ClickableSpan Summer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Summer);
                    }
                };
                ClickableSpan Became = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Became);
                    }
                };
                ClickableSpan Groundzero = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Groundzero);
                    }
                };
                ClickableSpan Unarmed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unarmed);
                    }
                };
                ClickableSpan Teenager = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Teenager);
                    }
                };
                ClickableSpan While = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.While);
                    }
                };
                ClickableSpan Cleared = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cleared);
                    }
                };
                ClickableSpan Wrongdoing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wrongdoing);
                    }
                };
                ClickableSpan Citys = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Citys);
                    }
                };
                ClickableSpan Bias = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bias);
                    }
                };
                ClickableSpan Headlinegrabbingstat = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Headlinegrabbingstat);
                    }
                };
                ClickableSpan Gap = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gap);
                    }
                };
                ClickableSpan Those = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Those);
                    }
                };
                ClickableSpan Notsofast = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Notsofast);
                    }
                };
                ClickableSpan Coprise = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Coprise);
                    }
                };
                ClickableSpan Account = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Account);
                    }
                };
                ClickableSpan Bigger = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bigger);
                    }
                };
                ClickableSpan Even = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Even);
                    }
                };
                ClickableSpan Than = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Than);
                    }
                };
                ClickableSpan Pd = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pd);
                    }
                };
                ClickableSpan Cannot = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cannot);
                    }
                };
                ClickableSpan About = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.About);
                    }
                };
                ClickableSpan Withouth = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Withouth);
                    }
                };
                ClickableSpan Though = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Though);
                    }
                };
                ClickableSpan Commit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Commit);
                    }
                };
                ClickableSpan Almost = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Almost);
                    }
                };
                ClickableSpan Always = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Always);
                    }
                };
                ClickableSpan Accordingto = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Accordingto);
                    }
                };
                ClickableSpan Bytheway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bytheway);
                    }
                };
                ClickableSpan Over = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Over);
                    }
                };
                ClickableSpan Twice = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Twice);
                    }
                };
                ClickableSpan Thatmany = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thatmany);
                    }
                };
                ClickableSpan But = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.But);
                    }
                };
                ClickableSpan Same = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Same);
                    }
                };
                ClickableSpan Mostly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mostly);
                    }
                };
                ClickableSpan Unlike = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unlike);
                    }
                };
                ClickableSpan Dispatch = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dispatch);
                    }
                };
                ClickableSpan Whenitcomesto = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whenitcomesto);
                    }
                };
                ClickableSpan Therefore = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Therefore);
                    }
                };
                ClickableSpan Haveafieldday = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Haveafieldday);
                    }
                };
                ClickableSpan Actually = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Actually);
                    }
                };
                ClickableSpan Published = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Published);
                    }
                };
                ClickableSpan Called = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Called);
                    }
                };
                ClickableSpan Outof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Outof);
                    }
                };
                ClickableSpan Drivers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Drivers);
                    }
                };
                ClickableSpan Were = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Were);
                    }
                };
                ClickableSpan Average = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Average);
                    }
                };
                ClickableSpan Likely = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Likely);
                    }
                };
                ClickableSpan Speeding = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Speeding);
                    }
                };
                ClickableSpan Seatbelt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Seatbelt);
                    }
                };
                ClickableSpan Usage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Usage);
                    }
                };
                ClickableSpan Lower = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lower);
                    }
                };
                ClickableSpan Among = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Among);
                    }
                };
                ClickableSpan From = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.From);
                    }
                };
                ClickableSpan Words = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Words);
                    }
                };
                ClickableSpan Becauseof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Becauseof);
                    }
                };
                ClickableSpan Also = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Also);
                    }
                };
                ClickableSpan Higher = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Higher);
                    }
                };
                ClickableSpan Rates = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rates);
                    }
                };
                ClickableSpan Whether = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whether);
                    }
                };
                ClickableSpan Wearing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wearing);
                    }
                };
                ClickableSpan Safety = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Safety);
                    }
                };
                ClickableSpan Thereis = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thereis);
                    }
                };
                ClickableSpan Theleast = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Theleast);
                    }
                };
                ClickableSpan Better = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Better);
                    }
                };
                ClickableSpan Any = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Any);
                    }
                };
                ClickableSpan Greater = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Greater);
                    }
                };


                int iar1 = text1.indexOf("still");
                int iar2 = text1.indexOf("certainly");
                int iar3 = text1.indexOf("thinks so");
                int iar4 = text1.indexOf("that");
                int iar5 = text1.indexOf("if");
                int iar6 = text1.indexOf("doesn’t that mean");
                int iar7 = text1.indexOf("so");
                int iar8 = text1.indexOf("vote");
                int iar9 = text1.indexOf("who");
                int iar10 = text1.indexOf("was");
                int iar11 = text1.indexOf("elected");
                int iar12 = text1.indexOf("almost");
                int iar13 = text1.indexOf("later");
                int iar14 = text1.indexOf("That’s");
                int iar15 = text1.indexOf("only");
                int iar16 = text1.indexOf("the most");
                int iar17 = text1.indexOf("There are");
                int iar18 = text1.indexOf("Take");
                int iar19 = text1.indexOf("marriage");
                int iar20 = text1.indexOf("wrote");
                int iar21 = text1.indexOf("viewed");
                int iar22 = text1.indexOf("benchmark");
                int iar23 = text1.indexOf("stage");
                int iar24 = text1.indexOf("were");
                int iar25 = text1.indexOf("until");
                int iar26 = text1.indexOf("Gallup poll");
                int iar27 = text1.indexOf("found");
                int iar28 = text1.indexOf("that");
                int iar29 = text1.indexOf("of");
                int iar30 = text1.indexOf("all");
                int iar31 = text1.indexOf("by");
                int iar32 = text1.indexOf("rising");
                int iar33 = text1.indexOf("what about");
                int iar34 = text1.indexOf("racial profiling");
                int iar35 = text1.indexOf("Doesn’t that");
                int iar36 = text1.indexOf("remains");
                int iar37 = text1.indexOf("summer");
                int iar38 = text1.indexOf("became");
                int iar39 = text1.indexOf("ground zero");
                int iar40 = text1.indexOf("unarmed");
                int iar41 = text1.indexOf("teenager");
                int iar42 = text1.indexOf("While");
                int iar43 = text1.indexOf("cleared");
                int iar44 = text1.indexOf("wrongdoing");
                int iar45 = text1.indexOf("city’s");
                int iar46 = text1.indexOf("bias");
                int iar47 = text1.indexOf("headline grabbing stat");
                int iar48 = text1.indexOf("gap");
                int iar49 = text1.indexOf("those");
                int iar50 = text1.indexOf("Not so fast");
                int iar51 = text1.indexOf("comprise");
                int iar52 = text1.indexOf("account");
                int iar53 = text1.indexOf("bigger");
                int iar54 = text1.indexOf("even");
                int iar55 = text1.indexOf("than");
                int iar56 = text1.indexOf("PD");
                int iar57 = text1.indexOf("cannot");
                int iar58 = text1.indexOf("about");
                int iar59 = text1.indexOf("without");
                int iar60 = text1.indexOf("Though");
                int iar61 = text1.indexOf("commit");
                int iar62 = text1.indexOf("almost");
                int iar63 = text1.indexOf("always");
                int iar64 = text1.indexOf("according to");
                int iar65 = text1.indexOf("by the way");
                int iar66 = text1.indexOf("over");
                int iar67 = text1.indexOf("twice");
                int iar68 = text1.indexOf("that many");
                int iar69 = text1.indexOf("But");
                int iar70 = text1.indexOf("same");
                int iar71 = text1.indexOf("mostly");
                int iar72 = text1.indexOf("Unlike");
                int iar73 = text1.indexOf("dispatch");
                int iar74 = text1.indexOf("when it comes to");
                int iar75 = text1.indexOf("Therefore");
                int iar76 = text1.indexOf("have a field day");
                int iar77 = text1.indexOf("Actually");
                int iar78 = text1.indexOf("published");
                int iar79 = text1.indexOf("called");
                int iar80 = text1.indexOf("out of");
                int iar81 = text1.indexOf("drivers");
                int iar82 = text1.indexOf("were");
                int iar83 = text1.indexOf("average");
                int iar84 = text1.indexOf("likely");
                int iar85 = text1.indexOf("speeding");
                int iar86 = text1.indexOf("Seatbelt");
                int iar87 = text1.indexOf("usage");
                int iar88 = text1.indexOf("lower");
                int iar89 = text1.indexOf("among");
                int iar90 = text1.indexOf("from");
                int iar91 = text1.indexOf("words");
                int iar92 = text1.indexOf("because of");
                int iar93 = text1.indexOf("also");
                int iar94 = text1.indexOf("higher");
                int iar95 = text1.indexOf("rates");
                int iar96 = text1.indexOf("whether");
                int iar97 = text1.indexOf("wearing");
                int iar98 = text1.indexOf("safety");
                int iar99 = text1.indexOf("there is");
                int iar100 = text1.indexOf("the least");
                int iar101 = text1.indexOf("better");
                int iar102 = text1.indexOf("any");
                int iar103 = text1.indexOf("greater");

                ss1.setSpan(Still, iar1, iar1 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Certainly, iar2, iar2 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Thinksso, iar3, iar3 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(That, iar4, iar4 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(If, iar5, iar5 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Doesntthatmean, iar6, iar6 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(So, iar7, iar7 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Vote, iar8, iar8 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(who2, iar9, iar9 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(was, iar10, iar10 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(elected, iar11, iar11 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(almost, iar12, iar12 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(later, iar13, iar13 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(thats, iar14, iar14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(only, iar15, iar15 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(themost, iar16, iar16 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(thereare, iar17, iar17 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(take, iar18, iar18 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(marriage2, iar19, iar19 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(wrote, iar20, iar20 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(viewed, iar21, iar21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(benchmark, iar22, iar22 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(stage, iar23, iar23 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(were2, iar24, iar24 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(until2, iar25, iar25 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Galluppoll, iar26, iar26 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Found, iar27, iar27 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(That2, iar28, iar28 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Of, iar29, iar29 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(All, iar30, iar30 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(By, iar31, iar31 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Rising, iar32, iar32 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Whatabout, iar33, iar33 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Racialprofiling, iar34, iar34 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Doesntthat, iar35, iar35 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Remains, iar36, iar36 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Summer, iar37, iar37 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Became, iar38, iar38 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Groundzero, iar39, iar39 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Unarmed, iar40, iar40 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Teenager, iar41, iar41 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(While, iar42, iar42 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Cleared, iar43, iar43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Wrongdoing, iar44, iar44 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Citys, iar45, iar45 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Bias, iar46, iar46 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Headlinegrabbingstat, iar47, iar47 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Gap, iar48, iar48 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Those, iar49, iar49 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Notsofast, iar50, iar50 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Coprise, iar51, iar51 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Account, iar52, iar52 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Bigger, iar53, iar53 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Even, iar54, iar54 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Than, iar55, iar55 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Pd, iar56, iar56 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Cannot, iar57, iar57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(About, iar58, iar58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Withouth, iar59, iar59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Though, iar60, iar60 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Commit, iar61, iar61 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Almost, iar62, iar62 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Always, iar63, iar63 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Accordingto, iar64, iar64 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Bytheway, iar65, iar65 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Over, iar66, iar66 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Twice, iar67, iar67 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Thatmany, iar68, iar68 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(But, iar69, iar69 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Same, iar70, iar70 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Mostly, iar71, iar71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Unlike, iar72, iar72 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Dispatch, iar73, iar73 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Whenitcomesto, iar74, iar74 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Therefore, iar75, iar75 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Haveafieldday, iar76, iar76 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Actually, iar77, iar77 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Published, iar78, iar78 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Called, iar79, iar79 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Outof, iar80, iar80 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Drivers, iar81, iar81 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Were, iar82, iar82 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Average, iar83, iar83 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Likely, iar84, iar84 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Speeding, iar85, iar85 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Seatbelt, iar86, iar86 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Usage, iar87, iar87 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Lower, iar88, iar88 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Among, iar89, iar89 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(From, iar90, iar90 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Words, iar91, iar91 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Becauseof, iar92, iar92 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Also, iar93, iar93 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Higher, iar94, iar94 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Rates, iar95, iar95 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Whether, iar96, iar96 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Wearing, iar97, iar97 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Safety, iar98, iar98 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Thereis, iar99, iar99 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Theleast, iar100, iar100 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Better, iar101, iar101 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Any, iar102, iar102 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss1.setSpan(Greater, iar103, iar103 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss1);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                // vid
                Uri uri1 = Uri.parse("http://adrianlealcaldera.com/isamericaracist.mp4");
                vv.setVideoURI(uri1);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Dont Compare Yourself to Others":
                texts t2 = new texts();
                String text2 = t2.DontCompareYourselftoOthers ;
                SpannableString ss2 = new SpannableString(text2);

                ClickableSpan Doyoueverlook = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doyoueverlook);
                    }
                };
                ClickableSpan Iwish = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Iwish);
                    }
                };
                ClickableSpan Everybody = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Everybody);
                    }
                };
                ClickableSpan Bet = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bet);
                    }
                };
                ClickableSpan Compared = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Compared);
                    }
                };
                ClickableSpan Yourself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Yourself);
                    }
                };
                ClickableSpan Do = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Do);
                    }
                };
                ClickableSpan Own = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Own);
                    }
                };
                ClickableSpan Middle = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Middle);
                    }
                };
                ClickableSpan Asbigas = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Asbigas);
                    }
                };
                ClickableSpan Pretty = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pretty);
                    }
                };
                ClickableSpan Hereswhy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hereswhy);
                    }
                };
                ClickableSpan People = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.People);
                    }
                };
                ClickableSpan Whole = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whole);
                    }
                };
                ClickableSpan Trick = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Trick);
                    }
                };
                ClickableSpan HereswhatImean = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.HereswhatImean);
                    }
                };
                ClickableSpan Happiness = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Happiness);
                    }
                };
                ClickableSpan Werebased = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Werebased);
                    }
                };
                ClickableSpan Biggest = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Biggest);
                    }
                };
                ClickableSpan Business = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Business);
                    }
                };
                ClickableSpan Idbemad = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Idbemad);
                    }
                };
                ClickableSpan Whoever = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whoever);
                    }
                };
                ClickableSpan Hebeastme = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hebeastme);
                    }
                };
                ClickableSpan Rich = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rich);
                    }
                };
                ClickableSpan Alot = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Alot);
                    }
                };
                ClickableSpan Like = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Like);
                    }
                };
                ClickableSpan Therewere = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Therewere);
                    }
                };
                ClickableSpan Richer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Richer);
                    }
                };
                ClickableSpan Never = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Never);
                    }
                };
                ClickableSpan Measure = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Measure);
                    }
                };
                ClickableSpan Constitutes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Constitutes);
                    }
                };
                ClickableSpan Success = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Success);
                    }
                };
                ClickableSpan Entertainment = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Entertainment);
                    }
                };
                ClickableSpan Allthrough = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Allthrough);
                    }
                };
                ClickableSpan Career = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Career);
                    }
                };
                ClickableSpan Customers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Customers);
                    }
                };
                ClickableSpan Someday = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someday);
                    }
                };
                ClickableSpan Youllbe = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Youllbe);
                    }
                };
                ClickableSpan Successful = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Successful);
                    }
                };
                ClickableSpan Topguy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Topguy);
                    }
                };
                ClickableSpan Someone = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someone);
                    }
                };
                ClickableSpan Theyre = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Theyre);
                    }
                };
                ClickableSpan Disease = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Disease);
                    }
                };
                ClickableSpan Save = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Save);
                    }
                };
                ClickableSpan Justlike = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Justlike);
                    }
                };
                ClickableSpan Lawyer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Lawyer);
                    }
                };
                ClickableSpan Crazy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Crazy);
                    }
                };
                ClickableSpan Makingaliving = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Makingaliving);
                    }
                };
                ClickableSpan Pursuing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pursuing);
                    }
                };
                ClickableSpan Findingmeaning = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Findingmeaning);
                    }
                };
                ClickableSpan What = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.What);
                    }
                };
                ClickableSpan First = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.First);
                    }
                };
                ClickableSpan Standup = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Standup);
                    }
                };
                ClickableSpan Nobody = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nobody);
                    }
                };
                ClickableSpan Tunedoutcrowds = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Tunedoutcrowds);
                    }
                };
                ClickableSpan Before = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Before);
                    }
                };
                ClickableSpan Jokes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Jokes);
                    }
                };
                ClickableSpan Laughing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Laughing);
                    }
                };
                ClickableSpan about = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.about);
                    }
                };
                ClickableSpan Soldouthouses = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Soldouthouses);
                    }
                };
                ClickableSpan Iwasntplaying = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Iwasntplaying);
                    }
                };
                ClickableSpan Bigpayday = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bigpayday);
                    }
                };
                ClickableSpan Able = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Able);
                    }
                };
                ClickableSpan Their = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Their);
                    }
                };
                ClickableSpan Dark = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dark);
                    }
                };
                ClickableSpan Struggle = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Struggle);
                    }
                };
                ClickableSpan Envy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Envy);
                    }
                };
                ClickableSpan Wentalongwithit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wentalongwithit);
                    }
                };
                ClickableSpan Factor = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Factor);
                    }
                };
                ClickableSpan Sortof = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sortof);
                    }
                };
                ClickableSpan Mixandmatchgame = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mixandmatchgame);
                    }
                };
                ClickableSpan World = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.World);
                    }
                };
                ClickableSpan Heresoneoflifeslittletruths = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Heresoneoflifeslittletruths);
                    }
                };
                ClickableSpan Packagedeal = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Packagedeal);
                    }
                };
                ClickableSpan View = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.View);
                    }
                };
                ClickableSpan Someoneelseslife = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someoneelseslife);
                    }
                };
                ClickableSpan Cheating = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cheating);
                    }
                };
                ClickableSpan Prettycool = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prettycool);
                    }
                };
                ClickableSpan Hangwithhim = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hangwithhim);
                    }
                };
                ClickableSpan Pain = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Pain);
                    }
                };
                ClickableSpan Anybody = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Anybody);
                    }
                };
                ClickableSpan Really = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Really);
                    }
                };
                ClickableSpan Awfulstuff = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Awfulstuff);
                    }
                };
                ClickableSpan Dealwith = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Dealwith);
                    }
                };
                ClickableSpan Battle = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Battle);
                    }
                };
                ClickableSpan Deadrockstars = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deadrockstars);
                    }
                };
                ClickableSpan Hard = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hard);
                    }
                };
                ClickableSpan Faceit = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Faceit);
                    }
                };
                ClickableSpan Sellout = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sellout);
                    }
                };
                ClickableSpan Biggestvenues = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Biggestvenues);
                    }
                };
                ClickableSpan PrimetimeTVshow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.PrimetimeTVshow);
                    }
                };
                ClickableSpan Viewers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Viewers);
                    }
                };
                ClickableSpan Half = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Half);
                    }
                };
                ClickableSpan Myself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Myself);
                    }
                };
                ClickableSpan Imdoingokay = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Imdoingokay);
                    }
                };
                ClickableSpan Try = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Try);
                    }
                };


                int ida1 = text2.indexOf("Do you ever look");
                int ida2 = text2.indexOf("I wish");
                int ida3 = text2.indexOf("Everybody");
                int ida4 = text2.indexOf("bet");
                int ida5 = text2.indexOf("compared");
                int ida6 = text2.indexOf("yourself");
                int ida7 = text2.indexOf("do");
                int ida8 = text2.indexOf("own");
                int ida9 = text2.indexOf("middle");
                int ida10 = text2.indexOf("as big as"); //10
                int ida11 = text2.indexOf("pretty");
                int ida12 = text2.indexOf("Here’s why");
                int ida13 = text2.indexOf("people");
                int ida14 = text2.indexOf("whole");
                int ida15 = text2.indexOf("trick");
                int ida16 = text2.indexOf("Here’s what I mean");

                int ida18 = text2.indexOf("happiness");
                int ida19 = text2.indexOf("were based");
                int ida20 = text2.indexOf("biggest"); //20✓
                int ida21 = text2.indexOf("business");
                int ida22 = text2.indexOf("I’d be mad");
                int ida23 = text2.indexOf("whoever");
                int ida24 = text2.indexOf("He beats me");
                int ida25 = text2.indexOf("rich");
                int ida26 = text2.indexOf("a lot");
                int ida27 = text2.indexOf("like");
                int ida28 = text2.indexOf("there were");
                int ida29 = text2.indexOf("richer");
                int ida30 = text2.indexOf("never");//30✓
                int ida31 = text2.indexOf("measure");
                int ida32 = text2.indexOf("constitutes");
                int ida33 = text2.indexOf("success");
                int ida34 = text2.indexOf("entertainment");
                int ida35 = text2.indexOf("All through");
                int ida36 = text2.indexOf("career");
                int ida37 = text2.indexOf("customers");
                int ida38 = text2.indexOf("someday");
                int ida39 = text2.indexOf("you’ll be");
                int ida40 = text2.indexOf("successful");//40
                int ida41 = text2.indexOf("top guy");
                int ida42 = text2.indexOf("someone");
                int ida43 = text2.indexOf("they’re");
                int ida44 = text2.indexOf("disease");
                int ida45 = text2.indexOf("save");
                int ida46 = text2.indexOf("just like");
                int ida47 = text2.indexOf("lawyer");
                int ida48 = text2.indexOf("crazy");
                int ida49 = text2.indexOf("making a living");
                int ida50 = text2.indexOf("pursuing");//50
                int ida51 = text2.indexOf("finding meaning");
                int ida52 = text2.indexOf("what");
                int ida53 = text2.indexOf("first");
                int ida54 = text2.indexOf("standup");
                int ida55 = text2.indexOf("nobody");
                int ida56 = text2.indexOf("tuned-out crowds");
                int ida57 = text2.indexOf("before");
                int ida58 = text2.indexOf("jokes");
                int ida59 = text2.indexOf("laughing");
                int ida60 = text2.indexOf("about");//60
                int ida61 = text2.indexOf("sold out houses");
                int ida62 = text2.indexOf("I wasn’t playing");
                int ida63 = text2.indexOf("big paydays");
                int ida64 = text2.indexOf("able");
                int ida65 = text2.indexOf("their");
                int ida66 = text2.indexOf("dark");
                int ida67 = text2.indexOf("struggles");
                int ida68 = text2.indexOf("envy");
                int ida69 = text2.indexOf("went along with it");
                int ida70 = text2.indexOf("factor");//70
                int ida71 = text2.indexOf("sort of");
                int ida72 = text2.indexOf("mix-and-match game");
                int ida73 = text2.indexOf("world");
                int ida74 = text2.indexOf("Here’s one of life’s little truths");
                int ida75 = text2.indexOf("package deal");
                int ida76 = text2.indexOf("view");
                int ida77 = text2.indexOf("someone else’s life");
                int ida78 = text2.indexOf("cheating");
                int ida79 = text2.indexOf("pretty cool");
                int ida80 = text2.indexOf("hang with him");
                int ida81 = text2.indexOf("pain");//80
                int ida82 = text2.indexOf("anybody");
                int ida83 = text2.indexOf("really");
                int ida84 = text2.indexOf("awful stuff");
                int ida85 = text2.indexOf("deal with");
                int ida86 = text2.indexOf("battle");
                int ida87 = text2.indexOf("dead rock stars");
                int ida88 = text2.indexOf("hard");
                int ida89 = text2.indexOf("Face it");
                int ida90 = text2.indexOf("sell out");
                int ida91 = text2.indexOf("biggest venues");//90
                int ida92 = text2.indexOf("prime-time TV show");
                int ida93 = text2.indexOf("viewers");
                int ida94 = text2.indexOf("half");
                int ida95 = text2.indexOf("myself");
                int ida96 = text2.indexOf("I’m doing okay");
                int ida97 = text2.indexOf("try");




                ss2.setSpan(Doyoueverlook, ida1, ida1 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Iwish, ida2, ida2 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Everybody, ida3, ida3 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Bet, ida4, ida4 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Compared, ida5, ida5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Yourself, ida6, ida6 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Do, ida7, ida7 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Own, ida8, ida8 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Middle, ida9, ida9 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Asbigas, ida10, ida10 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //10
                ss2.setSpan(Pretty, ida11, ida11 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hereswhy, ida12, ida12 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(People, ida13, ida13 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Whole, ida14, ida14 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Trick, ida15, ida15 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(HereswhatImean, ida16, ida16 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                ss2.setSpan(Happiness, ida18, ida18 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Werebased, ida19, ida19 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Biggest, ida20, ida20 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //20
                ss2.setSpan(Business, ida21, ida21 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Idbemad, ida22, ida22 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Whoever, ida23, ida23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hebeastme, ida24, ida24 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Rich, ida25, ida25 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Alot, ida26, ida26 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Like, ida27, ida27 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Therewere, ida28, ida28 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Richer, ida29, ida29 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Never, ida30, ida30 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Measure, ida31, ida31 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss2.setSpan(Constitutes, ida32, ida32 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Success, ida33, ida33 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Entertainment, ida34, ida34 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Allthrough, ida35, ida35 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Career, ida36, ida36 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Customers, ida37, ida37 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Someday, ida38, ida38 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Youllbe, ida39, ida39 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Successful, ida40, ida40 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss2.setSpan(Topguy, ida41, ida41 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Someone, ida42, ida42 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Theyre, ida43, ida43 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Disease, ida44, ida44 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Save, ida45, ida45 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Justlike, ida46, ida46 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Lawyer, ida47, ida47 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Crazy, ida48, ida48 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Makingaliving, ida49, ida49 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Pursuing, ida50, ida50 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss2.setSpan(Findingmeaning, ida51, ida51 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(What, ida52, ida52 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(First, ida53, ida53 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Standup, ida54, ida54 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Nobody, ida55, ida55 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Tunedoutcrowds, ida56, ida56 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Before, ida57, ida57 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Jokes, ida58, ida58 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Laughing, ida59, ida59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(about, ida60, ida60 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss2.setSpan(Soldouthouses, ida61, ida61 +15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Iwasntplaying, ida62, ida62 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Bigpayday, ida63, ida63 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Able, ida64, ida64 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Their, ida65, ida65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Dark, ida66, ida66 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Struggle, ida67, ida67 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Envy, ida68, ida68 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Wentalongwithit, ida69, ida69 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Factor, ida70, ida70 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss2.setSpan(Sortof, ida71, ida71 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Mixandmatchgame, ida72, ida72 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(World, ida73, ida73 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Heresoneoflifeslittletruths, ida74, ida74 + 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Packagedeal, ida75, ida75 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(View, ida76, ida76 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Someoneelseslife, ida77, ida77 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Cheating, ida78, ida78 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Prettycool, ida79, ida79 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hangwithhim, ida80, ida80 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss2.setSpan(Pain, ida81, ida81 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Anybody, ida82, ida82 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Really, ida83, ida83 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Awfulstuff, ida84, ida84 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Dealwith, ida85, ida85 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Battle, ida86, ida86 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Deadrockstars, ida87, ida87 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Hard, ida88, ida88 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Faceit, ida89, ida89 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Sellout, ida90, ida90 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss2.setSpan(Biggestvenues, ida91, ida91 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(PrimetimeTVshow, ida92, ida92 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Viewers, ida93, ida93 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Half, ida94, ida94 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Myself, ida95, ida95 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Imdoingokay, ida96, ida96 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss2.setSpan(Try, ida97, ida97 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss2);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                // vid
                Uri uri2 = Uri.parse("https://adrianlealcaldera.com/DontCompareYourselftoOthersPrag.mp4");
                vv.setVideoURI(uri2);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

            case "Fix Yourself":
                texts t3 = new texts();
                String text3 = t3.fixyoursel;
                SpannableString ss3 = new SpannableString(text3);

                ClickableSpan Blamingothers = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Blamingothers);
                    }
                };
                ClickableSpan Wasteoftime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wasteoftime);
                    }
                };
                ClickableSpan That3 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.That3);
                    }
                };
                ClickableSpan Learn = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Learn);
                    }
                };
                ClickableSpan Anything = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Anything);
                    }
                };
                ClickableSpan Grow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Grow);
                    }
                };
                ClickableSpan Mature = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mature);
                    }
                };
                ClickableSpan Thus = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thus);
                    }
                };
                ClickableSpan Life = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Life);
                    }
                };
                ClickableSpan Better1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Better1);
                    }
                };//10
                ClickableSpan As = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.As);
                    }
                };
                ClickableSpan Thereare = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thereare);
                    }
                };
                ClickableSpan Attitudes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Attitudes);
                    }
                };
                ClickableSpan Toward = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Toward);
                    }
                };
                ClickableSpan Sorrows = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Sorrows);
                    }
                };
                ClickableSpan Those1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Those1);
                    }
                };
                ClickableSpan First1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.First1);
                    }
                };
                ClickableSpan World1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.World1);
                    }
                };
                ClickableSpan Second = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Second);
                    }
                };
                ClickableSpan Differently = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Differently);
                    }
                };//20
                ClickableSpan Couple = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Couple);
                    }
                };
                ClickableSpan Onthebrink = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Onthebrink);
                    }
                };
                ClickableSpan Theyre1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Theyre1);
                    }
                };
                ClickableSpan Hurt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Hurt);
                    }
                };
                ClickableSpan Angry = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Angry);
                    }
                };
                ClickableSpan Unhappy = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unhappy);
                    }
                };
                ClickableSpan Bitter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bitter);
                    }
                };
                ClickableSpan Husband = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Husband);
                    }
                };
                ClickableSpan Recalls = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Recalls);
                    }
                };
                ClickableSpan Things = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Things);
                    }
                };//30
                ClickableSpan Wife = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wife);
                    }
                };
                ClickableSpan Reasons = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Reasons);
                    }
                };
                ClickableSpan Nolongerlivewithher = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nolongerlivewithher);
                    }
                };
                ClickableSpan Harried = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Harried);
                    }
                };
                ClickableSpan Disillusioned = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Disillusioned);
                    }
                };
                ClickableSpan All1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.All1);
                    }
                };
                ClickableSpan Ways = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Ways);
                    }
                };
                ClickableSpan Letherdown = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Letherdown);
                    }
                };
                ClickableSpan Each = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Each);
                    }
                };
                ClickableSpan Changes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Changes);
                    }
                };//40
                ClickableSpan Prospects = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Prospects);
                    }
                };
                ClickableSpan Grim = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Grim);
                    }
                };
                ClickableSpan Arent = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Arent);
                    }
                };
                ClickableSpan Youre = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Youre);
                    }
                };
                ClickableSpan Cant = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Cant);
                    }
                };
                ClickableSpan Yourself1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Yourself1);
                    }
                };
                ClickableSpan Courage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Courage);
                    }
                };
                ClickableSpan Easier = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Easier);
                    }
                };
                ClickableSpan Muchmore = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Muchmore);
                    }
                };
                ClickableSpan Gratifying = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gratifying);
                    }
                };//50
                ClickableSpan Basest = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Basest);
                    }
                };
                ClickableSpan Desires = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Desires);
                    }
                };
                ClickableSpan Someoneelse = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Someoneelse);
                    }
                };
                ClickableSpan Youthful = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Youthful);
                    }
                };
                ClickableSpan Makingastatement = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Makingastatement);
                    }
                };
                ClickableSpan Against = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Against);
                    }
                };
                ClickableSpan Smashing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Smashing);
                    }
                };
                ClickableSpan Storefront = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Storefront);
                    }
                };
                ClickableSpan Business1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Business1);
                    }
                };
                ClickableSpan Otherthan = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Otherthan);
                    }
                };//60
                ClickableSpan Bring = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Bring);
                    }
                };
                ClickableSpan Harm = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Harm);
                    }
                };
                ClickableSpan Whohavenothingtodo = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whohavenothingtodo);
                    }
                };
                ClickableSpan Guilt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Guilt);
                    }
                };
                ClickableSpan Doubt = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doubt);
                    }
                };
                ClickableSpan Shame = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shame);
                    }
                };
                ClickableSpan Inevitably = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inevitably);
                    }
                };
                ClickableSpan Suppressed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Suppressed);
                    }
                };
                ClickableSpan Beliefs = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Beliefs);
                    }
                };
                ClickableSpan Unchanged = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unchanged);
                    }
                };//70
                ClickableSpan Foster = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Foster);
                    }
                };
                ClickableSpan Anger = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Anger);
                    }
                };
                ClickableSpan Alienation = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Alienation);
                    }
                };
                ClickableSpan Play = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Play);
                    }
                };
                ClickableSpan Characters = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Characters);
                    }
                };
                ClickableSpan Veryhardtime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Veryhardtime);
                    }
                };
                ClickableSpan Profound = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Profound);
                    }
                };
                ClickableSpan Unhappiness = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Unhappiness);
                    }
                };
                ClickableSpan Suffering = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Suffering);
                    }
                };
                ClickableSpan Own1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Own1);
                    }
                };//80
                ClickableSpan Fault = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Fault);
                    }
                };
                ClickableSpan Takenaback = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Takenaback);
                    }
                };
                ClickableSpan If1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.If1);
                    }
                };
                ClickableSpan Herfault = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Herfault);
                    }
                };
                ClickableSpan Shes = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Shes);
                    }
                };
                ClickableSpan Doomed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Doomed);
                    }
                };
                ClickableSpan Herself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Herself);
                    }
                };
                ClickableSpan Seem = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Seem);
                    }
                };
                ClickableSpan Consigned = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Consigned);
                    }
                };
                ClickableSpan Fate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Fate);
                    }
                };//90
                ClickableSpan Mostofus = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Mostofus);
                    }
                };
                ClickableSpan Chance = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Chance);
                    }
                };
                ClickableSpan Questions = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Questions);
                    }
                };
                ClickableSpan Full = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Full);
                    }
                };
                ClickableSpan Advantage = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Advantage);
                    }
                };
                ClickableSpan Answer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Answer);
                    }
                };
                ClickableSpan Try1 = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Try1);
                    }
                };
                ClickableSpan Stopdoing = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Stopdoing);
                    }
                };
                ClickableSpan Wrong = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Wrong);
                    }
                };
                ClickableSpan Waste = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Waste);
                    }
                };//100
                ClickableSpan Inopportunequestioning  = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inopportunequestioning);
                    }
                };
                ClickableSpan Without = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Without);
                    }
                };
                ClickableSpan Enlightening = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Enlightening);
                    }
                };
                ClickableSpan Deflect = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Deflect);
                    }
                };
                ClickableSpan Something = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Something);
                    }
                };
                ClickableSpan Right = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Right);
                    }
                };
                ClickableSpan Payingattention = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Payingattention);
                    }
                };
                ClickableSpan Showuplate = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Showuplate);
                    }
                };
                ClickableSpan Spend = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Spend);
                    }
                };
                ClickableSpan Itsnotamatter = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Itsnotamatter);
                    }
                };//110
                ClickableSpan Some = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Some);
                    }
                };
                ClickableSpan Imposed = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Imposed);
                    }
                };
                ClickableSpan Whatcouldyouputright = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Whatcouldyouputright);
                    }
                };
                ClickableSpan Rightnow = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Rightnow);
                    }
                };
                ClickableSpan Gettoworkontime = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gettoworkontime);
                    }
                };
                ClickableSpan Diligently = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Diligently);
                    }
                };
                ClickableSpan Utilize = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Utilize);
                    }
                };
                ClickableSpan Peaceful = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Peaceful);
                    }
                };
                ClickableSpan Productive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Productive);
                    }
                };
                ClickableSpan Desirable = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Desirable);
                    }
                };//120
                ClickableSpan Weeks = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Weeks);
                    }
                };
                ClickableSpan Months = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Months);
                    }
                };
                ClickableSpan Attentive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Attentive);
                    }
                };
                ClickableSpan Effort = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Effort);
                    }
                };
                ClickableSpan Yourmindwillclear = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Yourmindwillclear);
                    }
                };
                ClickableSpan Less = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Less);
                    }
                };
                ClickableSpan Path = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Path);
                    }
                };
                ClickableSpan Infront = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Infront);
                    }
                };
                ClickableSpan Willshine = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Willshine);
                    }
                };
                ClickableSpan Brightly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Brightly);
                    }
                };//130
                ClickableSpan Gettingyourownway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Gettingyourownway);
                    }
                };
                ClickableSpan Instead = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Instead);
                    }
                };
                ClickableSpan Troubletoyourself = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Troubletoyourself);
                    }
                };
                ClickableSpan Society = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Society);
                    }
                };
                ClickableSpan Suffer = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Suffer);
                    }
                };
                ClickableSpan Thatsthepriceofbeingalive = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Thatsthepriceofbeingalive);
                    }
                };
                ClickableSpan Maybe = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Maybe);
                    }
                };
                ClickableSpan Enough = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Enough);
                    }
                };
                ClickableSpan Burden = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Burden);
                    }
                };
                ClickableSpan Inthatfashion = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inthatfashion);
                    }
                };//140
                ClickableSpan Nobly = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Nobly);
                    }
                };
                ClickableSpan Purpose = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Purpose);
                    }
                };
                ClickableSpan Properway = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Properway);
                    }
                };
                ClickableSpan Fix = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Fix);
                    }
                };
                ClickableSpan Inthatmanner = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Inthatmanner);
                    }
                };
                ClickableSpan Atleast = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Atleast);
                    }
                };
                ClickableSpan Place = new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View view) {
                        Defs d = new Defs();
                        openDialog(d.Place);
                    }
                };

                int ira1 = text3.indexOf("Blaming others");
                int ira2 = text3.indexOf("waste of time");
                int ira3 = text3.indexOf("that");
                int ira4 = text3.indexOf("learn");
                int ira5 = text3.indexOf("anything");
                int ira6 = text3.indexOf("grow");
                int ira7 = text3.indexOf("mature");
                int ira8 = text3.indexOf("Thus");
                int ira9 = text3.indexOf("life");
                int ira10 = text3.indexOf("better");//10
                int ira11 = text3.indexOf("as");
                int ira12 = text3.indexOf("there are");
                int ira13 = text3.indexOf("attitudes");
                int ira14 = text3.indexOf("toward");
                int ira15 = text3.indexOf("sorrows");
                int ira16 = text3.indexOf("Those");
                int ira17 = text3.indexOf("first");
                int ira18 = text3.indexOf("world");
                int ira19 = text3.indexOf("second");
                int ira20 = text3.indexOf("differently");//20
                int ira21 = text3.indexOf("couple");
                int ira22 = text3.indexOf("on the brink");
                int ira23 = text3.indexOf("They’re");
                int ira24 = text3.indexOf("hurt");
                int ira25 = text3.indexOf("angry");
                int ira26 = text3.indexOf("unhappy");
                int ira27 = text3.indexOf("bitter");
                int ira28 = text3.indexOf("husband");
                int ira29 = text3.indexOf("recalls");
                int ira30 = text3.indexOf("things");//30
                int ira31 = text3.indexOf("wife");
                int ira32 = text3.indexOf("reasons");
                int ira33 = text3.indexOf("no longer live with her");
                int ira34 = text3.indexOf("harried");
                int ira35 = text3.indexOf("disillusioned");
                int ira36 = text3.indexOf("all");
                int ira37 = text3.indexOf("ways");
                int ira38 = text3.indexOf("let her down");
                int ira39 = text3.indexOf("Each");
                int ira40 = text3.indexOf("changes");//40
                int ira41 = text3.indexOf("prospects");
                int ira42 = text3.indexOf("grim");
                int ira43 = text3.indexOf("aren’t");
                int ira44 = text3.indexOf("You’re");
                int ira45 = text3.indexOf("can’t");
                int ira46 = text3.indexOf("yourself");
                int ira47 = text3.indexOf("courage");
                int ira48 = text3.indexOf("easier");
                int ira49 = text3.indexOf("much more");
                int ira50 = text3.indexOf("gratifying");//50
                int ira51 = text3.indexOf("basest");
                int ira52 = text3.indexOf("desires");
                int ira53 = text3.indexOf("someone else");
                int ira54 = text3.indexOf("youthful");
                int ira55 = text3.indexOf("making a statement");
                int ira56 = text3.indexOf("against");
                int ira57 = text3.indexOf("smashing");
                int ira58 = text3.indexOf("storefront");
                int ira59 = text3.indexOf("business");
                int ira60 = text3.indexOf("other than");//60
                int ira61 = text3.indexOf("bring");
                int ira62 = text3.indexOf("harm");
                int ira63 = text3.indexOf("who have nothing to do");
                int ira64 = text3.indexOf("guilt");
                int ira65 = text3.indexOf("doubt");
                int ira66 = text3.indexOf("shame");
                int ira67 = text3.indexOf("inevitably");
                int ira68 = text3.indexOf("suppressed");
                int ira69 = text3.indexOf("beliefs");
                int ira70 = text3.indexOf("unchanged");//70
                int ira71 = text3.indexOf("foster");
                int ira72 = text3.indexOf("anger");
                int ira73 = text3.indexOf("alienation");
                int ira74 = text3.indexOf("play");
                int ira75 = text3.indexOf("characters");
                int ira76 = text3.indexOf("very hard time");
                int ira77 = text3.indexOf("profound");
                int ira78 = text3.indexOf("unhappiness");
                int ira79 = text3.indexOf("suffering");
                int ira80 = text3.indexOf("own");//80
                int ira81 = text3.indexOf("fault");
                int ira82 = text3.indexOf("Taken aback");
                int ira83 = text3.indexOf("if");
                int ira84 = text3.indexOf("her fault");
                int ira85 = text3.indexOf("she’s");
                int ira86 = text3.indexOf("doomed");
                int ira87 = text3.indexOf("herself");
                int ira88 = text3.indexOf("seem");
                int ira89 = text3.indexOf("consigned");
                int ira90 = text3.indexOf("fate");//90
                int ira91 = text3.indexOf("most of us");
                int ira92 = text3.indexOf("chance");
                int ira93 = text3.indexOf("questions");
                int ira94 = text3.indexOf("full");
                int ira95 = text3.indexOf("advantage");
                int ira96 = text3.indexOf("answer");
                int ira97 = text3.indexOf("try");
                int ira98 = text3.indexOf("stop doing");
                int ira99 = text3.indexOf("wrong");
                int ira100 = text3.indexOf("waste");//100
                int ira101 = text3.indexOf("Inopportune questioning");
                int ira102 = text3.indexOf("without");
                int ira103 = text3.indexOf("enlightening");
                int ira104 = text3.indexOf("deflect");
                int ira105 = text3.indexOf("something");
                int ira106 = text3.indexOf("right");
                int ira107 = text3.indexOf("paying attention");
                int ira108 = text3.indexOf("show up late");
                int ira109 = text3.indexOf("spend");
                int ira110 = text3.indexOf("It’s not a matter");//110
                int ira111 = text3.indexOf("some");
                int ira112 = text3.indexOf("imposed");
                int ira113 = text3.indexOf("What could you put right");
                int ira114 = text3.indexOf("right now");
                int ira115 = text3.indexOf("Get to work on time");
                int ira116 = text3.indexOf("Diligently");
                int ira117 = text3.indexOf("utilize");
                int ira118 = text3.indexOf("peaceful");
                int ira119 = text3.indexOf("productive");
                int ira120 = text3.indexOf("desirable");//120
                int ira121 = text3.indexOf("weeks");
                int ira122 = text3.indexOf("months");
                int ira123 = text3.indexOf("attentive");
                int ira124 = text3.indexOf("effort");
                int ira125 = text3.indexOf("your mind will clear");
                int ira126 = text3.indexOf("less");
                int ira127 = text3.indexOf("path");
                int ira128 = text3.indexOf("in front");
                int ira129 = text3.indexOf("will shine");
                int ira130 = text3.indexOf("brightly");//130
                int ira131 = text3.indexOf("getting in your own way");
                int ira132 = text3.indexOf("Instead");
                int ira133 = text3.indexOf("trouble to yourself");
                int ira134 = text3.indexOf("society");
                int ira135 = text3.indexOf("suffer");
                int ira136 = text3.indexOf("That’s the price of being alive");
                int ira137 = text3.indexOf("maybe");
                int ira138 = text3.indexOf("enough");
                int ira139 = text3.indexOf("burden");
                int ira140 = text3.indexOf("in that fashion");//140
                int ira141 = text3.indexOf("nobly");
                int ira142 = text3.indexOf("purpose");
                int ira143 = text3.indexOf("proper way");
                int ira144 = text3.indexOf("fix");
                int ira145 = text3.indexOf("in that manner");
                int ira146 = text3.indexOf("at least");
                int ira147 = text3.indexOf("place");

                ss3.setSpan(Blamingothers, ira1, ira1 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Wasteoftime, ira2, ira2 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(That3, ira3, ira3 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Learn, ira4, ira4 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Anything, ira5, ira5 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Grow, ira6, ira6 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Mature, ira7, ira7 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Thus, ira8, ira8 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Life, ira9, ira9 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Better1, ira10, ira10 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//10
                ss3.setSpan(As, ira11, ira11 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Thereare, ira12, ira12 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Attitudes, ira13, ira13 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Toward, ira14, ira14 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Sorrows, ira15, ira15 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Those1, ira16, ira16 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(First1, ira17, ira17 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(World1, ira18, ira18 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Second, ira19, ira19 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Differently, ira20, ira20 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//20
                ss3.setSpan(Couple, ira21, ira21 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Onthebrink, ira22, ira22 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Theyre1, ira23, ira23 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Hurt, ira24, ira24 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Angry, ira25, ira25 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Unhappy, ira26, ira26 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Bitter, ira27, ira27 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Husband, ira28, ira28 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Recalls, ira29, ira29 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Things, ira30, ira30 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//30
                ss3.setSpan(Wife, ira31, ira31 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Reasons, ira32, ira32 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Nolongerlivewithher, ira33, ira33 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Harried, ira34, ira34 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Disillusioned, ira35, ira35 + 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(All1, ira36, ira36 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Ways, ira37, ira37 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Letherdown, ira38, ira38 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Each, ira39, ira39 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Changes, ira40, ira40 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//40
                ss3.setSpan(Prospects, ira41, ira41 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Grim, ira42, ira42 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Arent, ira43, ira43 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Youre, ira44, ira44 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Cant, ira45, ira45 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Yourself1, ira46, ira46 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Courage, ira47, ira47 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Easier, ira48, ira48 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Muchmore, ira49, ira49 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Gratifying, ira50, ira50 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//50
                ss3.setSpan(Basest, ira51, ira51 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Desires, ira52, ira52 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Someoneelse, ira53, ira53 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Youthful, ira54, ira54 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Makingastatement, ira55, ira55 + 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Against, ira56, ira56 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Smashing, ira57, ira57 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Storefront, ira58, ira58 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Business1, ira59, ira59 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Otherthan, ira60, ira60 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//60
                ss3.setSpan(Bring, ira61, ira61 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Harm, ira62, ira62 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Whohavenothingtodo, ira63, ira63 + 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Guilt, ira64, ira64 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Doubt, ira65, ira65 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Shame, ira66, ira66 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Inevitably, ira67, ira67 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Suppressed, ira68, ira68 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Beliefs, ira69, ira69 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Unchanged, ira70, ira70 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//70
                ss3.setSpan(Foster, ira71, ira71 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Anger, ira72, ira72 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Alienation, ira73, ira73 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Play, ira74, ira74 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Characters, ira75, ira75 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Veryhardtime, ira76, ira76 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Profound, ira77, ira77 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Unhappiness, ira78, ira78 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Suffering, ira79, ira79 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Own1, ira80, ira80 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//80
                ss3.setSpan(Fault, ira81, ira81 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Takenaback, ira82, ira82 + 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(If1, ira83, ira83 + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Herfault, ira84, ira84 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Shes, ira85, ira85 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Doomed, ira86, ira86 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Herself, ira87, ira87 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Seem, ira88, ira88 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Consigned, ira89, ira89 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Fate, ira90, ira90 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//90
                ss3.setSpan(Mostofus, ira91, ira91 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Chance, ira92, ira92 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Questions, ira93, ira93 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Full, ira94, ira94 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Advantage, ira95, ira95 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Answer, ira96, ira96 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Try1, ira97, ira97 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Stopdoing, ira98, ira98 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Wrong, ira99, ira99 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Waste, ira100, ira100 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//100
                ss3.setSpan(Inopportunequestioning, ira101, ira101 + 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Without, ira102, ira102 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Enlightening, ira103, ira103 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Deflect, ira104, ira104 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Something, ira105, ira105 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Right, ira106, ira106 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Payingattention, ira107, ira107 + 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Showuplate, ira108, ira108 + 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Spend, ira109, ira109 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Itsnotamatter, ira110, ira110 + 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//110
                ss3.setSpan(Some, ira111, ira111 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Imposed, ira112, ira112 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Whatcouldyouputright, ira113, ira113 + 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Rightnow, ira114, ira114 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Gettoworkontime, ira115, ira115 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Diligently, ira116, ira116 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Utilize, ira117, ira117 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Peaceful, ira118, ira118 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Productive, ira119, ira119 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Desirable, ira120, ira120 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//120
                ss3.setSpan(Weeks, ira121, ira121 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Months, ira122, ira122 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Attentive, ira123, ira123 + 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Effort, ira124, ira124 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Yourmindwillclear, ira125, ira125 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Less, ira126, ira126 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Path, ira127, ira127 + 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Infront, ira128, ira128 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Willshine, ira129, ira129 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Brightly, ira130, ira130 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//130
                ss3.setSpan(Gettingyourownway, ira131, ira131 + 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Instead, ira132, ira132 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Troubletoyourself, ira133, ira133 + 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Society, ira134, ira134 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Suffer, ira135, ira135 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Thatsthepriceofbeingalive, ira136, ira136 + 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Maybe, ira137, ira137 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Enough, ira138, ira138 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Burden, ira139, ira139 + 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Inthatfashion, ira140, ira140 + 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//140
                ss3.setSpan(Nobly, ira141, ira141 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Purpose, ira142, ira142 + 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Properway, ira143, ira143 + 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Fix, ira144, ira144 + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Inthatmanner, ira145, ira145 + 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Atleast, ira146, ira146 + 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                ss3.setSpan(Place, ira147, ira147 + 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                tv.setText(ss3);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                // vid
                Uri uri3 = Uri.parse("https://adrianlealcaldera.com/FixYourself.mp4");
                vv.setVideoURI(uri3);
                vv.setMediaController(new MediaController(this));
                vv.requestFocus();
                vv.start();
                break;

        }
    }

    private void openDialog(String s) {
        Dialog d = new Dialog(s);
        d.show(getSupportFragmentManager(), "");

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
}