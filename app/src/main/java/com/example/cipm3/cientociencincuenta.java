package com.example.cipm3;

import android.telephony.RadioAccessSpecifier;

public class cientociencincuenta {

    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "ellos ", "nosotros "};
    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "they ", "we "};

    String verbs[] = {"tell ", "work ", "call ", "last ", "ask ", "need ", "feel ",
            "leave ", "own ", "try "};

    String verbs3[] = {"tells ", "works ", "calls ", "lasts ", "asks ", "needs ", "feels ",
            "leaves ", "owns ", "tries "};

    String verbos[] = {"comentar ", "trabajar ", "llamar ", "durar ", "preguntar ",
            "necesitar ", "sentir ", "dejar ", "poseer ", "intentar "};
    String verbsub1[] = {"comente ", "trabaje ", "llame ", "dure ", "pregunte ", "necesite ", "sienta ", "deje ", "posea ", "intente "};
    String verbsub2[] = {"comentes ", "trabajes ", "llames ", "dures ", "preguntes ", "necesites ", "sientas ", "dejes ", "poseas ", "intentes "};
    String verbsub3[] = {"comente ", "trabaje ", "llame ", "dure ", "pregunte ", "necesite ", "sienta ", "deje ", "posea ", "intente "};
    String verbsub4[] = {"comenten ", "trabajen ", "llamen ", "duren ", "pregunten ", "necesiten ", "sientan ", "dejen ", "posean ", "intenten "};
    String verbsub5[] = {"comentemos ", "trabajemos ", "llamemos ", "duremos ", "preguntemos ", "necesitemos ", "sintamos ", "dejemos ", "poseamos ", "intentemos "};


    String verbos1[] = {"comento ", "trabajo ", "llamo ", "duro ", "pregunto ",
            "necesito ", "siento ", "dejo ", "poseo ", "intento "};

    String verbos2[] = {"comentas ", "trabajas ", "llamas ", "duras ", "preguntas ",
            "necesitas ", "sientes ", "dejas ", "posees ", "intentas "};

    String verbos3[] = {"comenta ", "trabaja ", "llama ", "dura ", "pregunta ",
            "necesita ", "siente ", "deja ", "posee ", "intenta "};

    String verbos4[] = {"comentan ", "trabajan ", "llaman ", "duran ", "preguntan ",
            "necesitan ", "sienten ", "dejan ", "poseen ", "intentan "};

    String verbos5[] = {"comentamos ", "trabajamos ", "llamamos ", "duramos ", "preguntamos ",
            "necesitamos ", "sentimos ", "dejamos ", "poseemos ", "intentamos "};

    String mod[] = {"may ", "should "};
    String deb[] = {"debería ", "deberías ", "debería ", "debería ", "deberían ", "deberíamos "};

    String adv[] = {"never ", "still ", "really "};
    String adve[] = {"nunca ", "todavia ", "realmente "};

    String bec[] = {"me convierto ", "te conviertes ", "se convierte ", "se convierte ", "se convierte ", "se convierten ", "nos convertimos"};
    String become[] = {"become ", "become ", "becomes ", "becomes ", "becomes ", "become ", "become "};

    String adveng[] = {"only ", "even ", "those ", "good ", "through ", "three ", "between "};
    String advsp[] = {"solamente ", "incluso ", "esas ", "buenas ", "mediante ", "tres ", "entre "};
    String advspm[] = {"solamente ", "incluso ", "esos ", "buenos ", "mediante ", "tres ", "entre "};
    String plurn[] = {"women ", "children ", "lives ", "worlds ", "states ", "schools ", "families "};
    String plurs[] = {"mujeres ", "niños ", "vidas ", "mundos ", "estados ", "escuelas ", "familias "};
    String prep[] = {"another ", "any "};
    String prepf[] = {"otro ", "cualquier "};
    String prepm[] = {"otra ", "cualquier "};
    String sp[] = {"woman ", "child ", "back ", "life ", "world ", "state ", "school ", "family "};
    String sps[] = {"mujer ", "niño ", "espalda ", "vida ", "mundo ", "estado ", "escuela ", "familia "};


    String gens;
    String gene;

    public void verbhuntofif() {
        int i = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verbos.length);
        int a = (int) (Math.random() * adve.length);
        String temp = pronombres[i];
        switch (temp) {
            case "yo ":
                gens = pronombres[i] + adve[a] + verbos1[v];
                gene = pronoun[i] + adv[a] + verbs[v];
                break;

            case "tú ":
                gens = pronombres[i] + adve[a] + verbos2[v];
                gene = pronoun[i] + adv[a] + verbs[v];
                break;

            case "él ":
                gens = pronombres[i] + adve[a] + verbos3[v];
                gene = pronoun[i] + adv[a] + verbs3[v];
                break;

            case "ella ":
                gens = pronombres[i] + adve[a] + verbos3[v];
                gene = pronoun[i] + adv[a] + verbs3[v];
                break;

            case "eso ":
                gens = pronombres[i] + adve[a] + verbos3[v];
                gene = pronoun[i] + adv[a] + verbs3[v];
                break;

            case "nosotros ":
                gens = pronombres[i] + adve[a] + verbos5[v];
                gene = pronoun[i] + adv[a] + verbs[v];
                break;

            case "ellos ":
                gens = pronombres[i] + adve[a] + verbos4[v];
                gene = pronoun[i] + adv[a] + verbs[v];
                break;


        }

    }

    public void become() {
        int p = (int) (Math.random() * pronombres.length);
        gens = pronombres[p] + bec[p];
        gene = pronoun[p] + become[p];

    }

    public void maymeth() {
        int i = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verbos.length);
        int a = (int) (Math.random() * mod.length);
        String temp = pronombres[i];
        switch (temp) {

            case "yo ":
                gens = "puede que " + pronombres[0] + verbsub1[v];
                gene = pronoun[i] + "may " + verbs[v];
                break;
            case "tú ":
                gens = "puede que " + pronombres[1] + verbsub2[v];
                gene = pronoun[i] + "may " + verbs[v];
                break;
            case "él ":
                gens = "puede que " + pronombres[2] + verbsub3[v];
                gene = pronoun[i] + "may " + verbs[v];
                break;
            case "ella ":
                gens = "puede que " + pronombres[3] + verbsub3[v];
                gene = pronoun[i] + "may " + verbs[v];
                break;
            case "eso ":
                gens = "puede que " + pronombres[4] + verbsub3[v];
                gene = pronoun[i] + "may " + verbs[v];
                break;
            case "ellos ":
                gens = "puede que " + pronombres[5] + verbsub4[v];
                gene = pronoun[i] + "may " + verbs[v];
                break;
            case "nosotros ":
                gens = "puede que " + pronombres[6] + verbsub5[v];
                gene = pronoun[i] + "may " + verbs[v];
                break;

        }


    }

    public void shouldmeth() {
        int i = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verbos.length);
        int a = (int) (Math.random() * deb.length);
        String temp = pronombres[i];

        switch (temp) {

            case "yo ":
                gens = pronombres[i] + "debería " + verbos[v];
                gene = pronoun[i] + "should " + verbs[v];
                break;

            case "tú ":
                gens = pronombres[i] + "deberías " + verbos[v];
                gene = pronoun[i] + "should " + verbs[v];
                break;

            case "él ":
                gens = pronombres[i] + "debería " + verbos[v];
                gene = pronoun[i] + "should " + verbs[v];
                break;

            case "ella ":
                gens = pronombres[i] + "debería " + verbos[v];
                gene = pronoun[i] + "should " + verbs[v];
                break;

            case "eso ":
                gens = pronombres[i] + "debería " + verbos[v];
                gene = pronoun[i] + "should " + verbs[v];
                break;

            case "ellos ":
                gens = pronombres[i] + "deberían " + verbos[v];
                gene = pronoun[i] + "should " + verbs[v];
                break;
            case "nosotros ":
                gens = pronombres[i] + "deberíamos " + verbos[v];
                gene = pronoun[i] + "should " + verbs[v];
                break;
        }

    }

    public void advermeth() {
        int pn = (int) (Math.random() * plurn.length);
        int ad = (int) (Math.random() * advsp.length);
        String temp = plurn[pn];
        switch (temp) {

            case "women ":
                gens = advsp[ad] + plurs[pn];
                gene = adveng[ad] + plurn[pn];

                break;

            case "children ":
                gens = advspm[ad] + plurs[pn];
                gene = adveng[ad] + plurn[pn];

                break;


            case "lives ":
                gens = advsp[ad] + plurs[pn];
                gene = adveng[ad] + plurn[pn];

                break;

            case "worlds ":
                gens = advspm[ad] + plurs[pn];
                gene = adveng[ad] + plurn[pn];

                break;

            case "states ":
                gens = advspm[ad] + plurs[pn];
                gene = adveng[ad] + plurn[pn];
                break;

            case "schools ":
                gens = advsp[ad] + plurs[pn];
                gene = adveng[ad] + plurn[pn];

                break;

            case "families ":
                gens = advsp[ad] + plurs[pn];
                gene = adveng[ad] + plurn[pn];

                break;


        }

    }

    public void prepmeth() {
        int p = (int) (Math.random() * prep.length);
        int s = (int) (Math.random() * sp.length);
        String temp = sp[s];
        switch (temp) {

            case "woman ":
                gens = prepm[p] + sps[s];
                gene = prep[p] + sp[s];
                break;

            case "child ":
                gens = prepf[p] + sps[s];
                gene = prep[p] + sp[s];
                break;

            case "back ":
                gens = prepm[p] + sps[s];
                gene = prep[p] + sp[s];
                break;

            case "life ":
                gens = prepm[p] + sps[s];
                gene = prep[p] + sp[s];
                break;

            case "world ":
                gens = prepf[p] + sps[s];
                gene = prep[p] + sp[s];
                break;

            case "state ":
                gens = prepf[p] + sps[s];
                gene = prep[p] + sp[s];
                break;

            case "school ":
                gens = prepm[p] + sps[s];
                gene = prep[p] + sp[s];
                break;

            case "family ":
                gens = prepm[p] + sps[s];
                gene = prep[p] + sp[s];
                break;
        }


    }


}








