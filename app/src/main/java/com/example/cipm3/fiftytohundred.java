package com.example.cipm3;

public class fiftytohundred {

    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "ellos ", "nosotros "};
    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "they ", "we "};

    String verbi[] = {"think ", "see ", "come ", "look"};
    String verbt[] = {"take ", "use ", "give ", "find ", "want "};

    String vi1[] = {"pienso ", "veo ", "vengo ", "miro "};
    String vi2[] = {"piensas ", "ves ", "vienes ", "miras "};
    String vi3[] = {"piensa ", "ve ", "viene ", "mira "};
    String vi4[] = {"piensan ", "ven ", "vienen ", "miran "};
    String vi5[] = {"pensamos ", "vemos ", "venimos ", "miramos "};


    String vt1[] = {"tomo ", "uso ", "doy ", "encuentro ", "quiero "};
    String vt2[] = {"tomas ", "usas ", "das ", "encuentras ", "quieres "};
    String vt3[] = {"toma ", "usa ", "da ", "encuentra ", "quiere "};
    String vt4[] = {"toman ", "usan ", "dan ", "encuentran ", "quieren "};
    String vt5[] = {"tomamos ", "usamos ", "damos ", "encontramos ", "queremos "};

    String adv[] = {"when ", "because ", "how ", "so "};
    String adve[] = {"cuando ", "porque ", "como ", "así que "};

    String prp[] = {"with ", "for ", "out of ", "into "};
    String prpo[] = {"con ", "para ", "fuera de ", "dentro de "};

    String obj[] = {"him ", "them ", "me ", "her ", "one ", "the time ", "the thing ", "us "};
    String objj[] = {"el ", "ellos ", "mi ", "ella ", "uno ", "el tiempo ", "la cosa ", "nosotros "};

    String plad[] = {"there ", "here ", "now ", "also ", "well ", "then "};
    String lugad[] = {"ahí ", "aquí ", "ahora ", "también ", "bien ", "entonces "};


    String nouns[] = {"years ", "days ", "men ",};
    String sust[] = {"años ", "dias ", "hombres ",};

    String adj[] = {"muchos ", "mas ", "dos ", "estos ", "nuestros ", "sus ", "otros ", "tu ", "nuevos ", "primeros ", "algunos ", "solo ", "cuales "};
    String adjeng[] = {"many ", "more ", "two ", "these ", "our ", "its ", "other ", "your ", "new ", "first ", "some ", "just ", "which "};

    String gens;
    String gene;

    // adjetivos y sustantivos
    public void adjpro() {
        int n = (int) (Math.random() * nouns.length);
        int a = (int) (Math.random() * adj.length);
        gens = adj[a] + sust[n];
        gene = adjeng[a] + nouns[n];
    }

    // adv+pronombre+verbtrans
    public void adprotran() {
        int p = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vt1.length);
        int ad = (int) (Math.random() * adv.length);
        String temp = pronombres[p];
        int iii = (int) (Math.random() * 2);
        switch (temp) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = adve[ad] + pronombres[0] + vt1[iv];
                        gene = adv[ad] + pronoun[0] + verbt[iv];
                        break;
                    case 1:
                        gens = adve[ad] + pronombres[0] + "no " + vt1[iv];
                        gene = adv[ad] + pronoun[0] + "don't " + verbt[iv];
                        break;
                }
                break;

            case "tú ":
                switch (iii) {
                    case 0:
                        gens = adve[ad] + pronombres[1] + vt2[iv];
                        gene = adv[ad] + pronoun[1] + verbt[iv];
                        break;
                    case 1:
                        gens = adve[ad] + pronombres[1] + "no " + vt2[iv];
                        gene = adv[ad] + pronoun[1] + "don't " + verbt[iv];
                        break;
                }
                break;

            case "él ":
                switch (iii) {
                    case 0:
                        gens = adve[ad] + pronombres[2] + vt3[iv];
                        gene = adv[ad] + pronoun[2] + verbt[iv].trim() + "s";
                        break;
                    case 1:
                        gens = adve[ad] + pronombres[2] + "no " + vt3[iv];
                        gene = adv[ad] + pronoun[2] + "doesn't " + verbt[iv];
                        break;
                }

                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = adve[ad] + pronombres[3] + vt3[iv];
                        gene = adv[ad] + pronoun[3] + verbt[iv].trim() + "s";
                        break;
                    case 1:
                        gens = adve[ad] + pronombres[3] + "no " + vt3[iv];
                        gene = adv[ad] + pronoun[3] + "doesn't " + verbt[iv];
                        break;
                }

                break;

            case "eso ":
                switch (iii) {
                    case 0:
                        gens = adve[ad] + pronombres[4] + vt3[iv];
                        gene = adv[ad] + pronoun[4] + verbt[iv].trim() + "s";
                        break;
                    case 1:
                        gens = adve[ad] + pronombres[4] + "no " + vt3[iv];
                        gene = adv[ad] + pronoun[4] + "doesn't " + verbt[iv];
                        break;
                }

                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = adve[ad] + pronombres[6] + vt5[iv];
                        gene = adv[ad] + pronoun[6] + verbt[iv];
                        break;
                    case 1:
                        gens = adve[ad] + pronombres[6] + "no " + vt5[iv];
                        gene = adv[ad] + pronoun[6] + "don't " + verbt[iv];
                        break;
                }

                break;

            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = adve[ad] + pronombres[5] + vt4[iv];
                        gene = adv[ad] + pronoun[5] + verbt[iv];
                        break;
                    case 1:
                        gens = adve[ad] + pronombres[5] + "no " + vt4[iv];
                        gene = adv[ad] + pronoun[5] + "don't " + verbt[iv];
                        break;
                }

                break;


        }


    }

    // peposiciones y pronombres de objeto
    public void prpproob() {
        int i = (int) (Math.random() * prp.length);
        int ii = (int) (Math.random() * obj.length);
        gens = prpo[i] + objj[ii];
        gene = prp[i] + obj[ii];

    }

    //intrans
    public void intransvplacead() {
        int p = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vi1.length);
        int ad = (int) (Math.random() * lugad.length);
        String temp = pronombres[p];
        int iii = (int) (Math.random() * 2);
        switch (temp) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + vi1[iv] + lugad[ad];
                        gene = pronoun[0] + verbi[iv] + plad[ad];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + vi1[iv] + lugad[ad];
                        gene = pronoun[0] + "don't " + verbi[iv] + plad[ad];
                        break;
                }
                break;

            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + vi2[iv] + lugad[ad];
                        gene = pronoun[1] + verbi[iv] + plad[ad];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + vi2[iv] + lugad[ad];
                        gene = pronoun[1] + "don't " + verbi[iv] + plad[ad];
                        break;
                }
                break;

            case "él ":
                switch (iii) {
                    case 0:
                        gens = pronombres[2] + vi3[iv] + lugad[ad];
                        gene = pronoun[2] + verbi[iv].trim() + "s" + plad[ad];
                        break;
                    case 1:
                        gens = pronombres[2] + "no " + vi3[iv] + lugad[ad];
                        gene = pronoun[2] + "doesn't " + verbi[iv] + plad[ad];
                        break;
                }

                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + vi3[iv] + lugad[ad];
                        gene = pronoun[3] + verbi[iv].trim() + "s" + plad[ad];
                        break;
                    case 1:
                        gens = pronombres[3] + "no " + vi3[iv] + lugad[ad];
                        gene = pronoun[3] + "doesn't " + verbi[iv] + plad[ad];
                        break;
                }

                break;

            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + vi3[iv] + lugad[ad];
                        gene = pronoun[4] + verbi[iv].trim() + "s" + plad[ad];
                        break;
                    case 1:
                        gens = pronombres[4] + "no " + vi3[iv] + lugad[ad];
                        gene = pronoun[4] + "doesn't " + verbi[iv] + plad[ad];
                        break;
                }

                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + vi5[iv] + lugad[ad];
                        gene = pronoun[6] + verbi[iv] + plad[ad];
                        break;
                    case 1:
                        gens = pronombres[6] + "no " + vi5[iv] + lugad[ad];
                        gene = pronoun[6] + "don't " + verbi[iv] + plad[ad];
                        break;
                }

                break;

            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + vi4[iv] + lugad[ad];
                        gene = pronoun[5] + verbi[iv] + plad[ad];
                        break;
                    case 1:
                        gens = pronombres[5] + "no " + vi4[iv] + lugad[ad];
                        gene = pronoun[5] + "don't " + verbi[iv] + plad[ad];
                        break;
                }

                break;


        }


    }


}
