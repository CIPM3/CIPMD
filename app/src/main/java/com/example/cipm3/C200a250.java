package com.example.cipm3;

import android.util.MalformedJsonException;

public class C200a250 {
    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "we ", "they "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "nosotros ", "ellos "};

    String verb[] = {"play ", "run ", "move ", "live ", "point ", "hold ", "bring ",
            "believe ", "must ", "write ", "study "
    };

    String verb3[] = {"plays ", "runs ", "moves ", "lives ", "points ", "holds ", "brings ",
            "believes ", "must ", "writes ", "studies "
    };
    String verb3it[] = {"plays ", "runs ", "moves ", "lives ", "points ", "holds ", "brings ",
            "believes ", "must ", "writes ", "studies ", "happens "
    };

    String v1[] = {"juego ", "corro ", "muevo ", "vivo ", "apunto ", "sostengo ", "traigo ",
            "creo ", "debo ", "escribo ", "estudio "
    };
    String v1s[] = {"juegue ", "corra ", "mueva ", "viva ", "apunte ", "sostenga ", "traiga ",
            "crea ", "deba ", "escriba ", "estudie "
    };
    String v2[] = {"juegas ", "corres ", "mueves ", "vives ", "apuntas ", "sostienes ", "traes ",
            "crees ", "debes ", "escribes ", "estudias "
    };
    String v2s[] = {"juegues ", "corras ", "muevas ", "vivas ", "apuntes ", "sostengas ", "traigas ",
            "creas ", "debas ", "escribas ", "estudies "
    };
    String v3[] = {"juega ", "corre ", "mueve ", "vive ", "apunta ", "sostiene ", "trae ",
            "cree ", "debe ", "escribe ", "estudia "
    };
    String v3s[] = {"juegue ", "corra ", "mueva ", "viva ", "apunte ", "sostienga ", "traiga ",
            "crea ", "deba ", "escriba ", "estudie "
    };
    String v3it[] = {"juegue ", "corra ", "mueva ", "viva ", "apunte ", "sostienga ", "traiga ",
            "crea ", "deba ", "escriba ", "estudie ", "suceda "
    };

    String v4[] = {"juegan ", "corren ", "mueven ", "viven ", "apuntan ", "sostienen ", "traen ",
            "creen ", "deben ", "escriben ", "estudian "
    };
    String v4s[] = {"juegen ", "corran ", "muevan ", "vivan ", "apunten ", "sostengan ", "traigan ",
            "crean ", "deban ", "escriban ", "estudien "
    };

    String v5[] = {"jugamos ", "corremos ", "movemos ", "vivimos ", "apuntamos ", "sostenemos ", "traemos ",
            "creemos ", "debemos ", "escribimos ", "estudiamos "
    };
    String v5s[] = {"jugemos ", "corramos ", "movamos ", "vivamos ", "apuntemos ", "sostengamos ", "traigamos ",
            "creamos ", "debamos ", "escribamos ", "estudiemos "
    };
    String advs[] = {"though ", "after ", "before "};
    String adve[] = {"aun que ", "despues de que ", "antes de que "};

    String nouns[] = {"the government ", "the number ", "the night ", "today ", "the home ",
            "the water ", "the room ", "the mother ", "the area ", "the money ", "the story ", "the fact ", "the month ", "the lot "
            , "the right ", "the book ", "the eye ", "the job ", "the word ", "the business ",
            "the issue ", "the side ", "the kind ", "the head ", "the house "
    };
    String sust[] = {"el gobierno ", "el número ", "la noche ", "hoy ", "el hogar ",
            "el agua ", "el cuarto ", "la madre ", "el área ", "el dinero ", "el cuento ", "el hecho ", "el mes ", "el lote "
            , "el derecho ", "el libro ", "el ojo ", "el empleo ", "la palabra ", "el negocio ",
            "el problema ", "el lado ", "el tipo ", "la cabeza ", "la casa "
    };
    String sustf[] = {"la noche ", "la madre ", "la palabra ", "la cabeza ", "la casa "};
    String sustfeng[] = {"night ", "mother ", "word ", "head ", "house "};
    String sustfpleng[] = {"nights ", "mothers ", "words ", "heads ", "houses ", "waters "};
    String sustfpl[] = {"noches ", "madres ", "palabras ", "cabezas ", "casas ", "aguas "};

    String sustm[] = {"el gobierno ", "el número ", "hoy ", "el hogar ",
            "el agua ", "el cuarto ", "el área ", "el dinero ", "el cuento ", "el hecho ", "el mes ", "el lote "
            , "el derecho ", "el libro ", "el ojo ", "el empleo ", "el negocio ",
            "el problema ", "el lado ", "el tipo "
    };
    String sustmeng[] = {"government ", "number ", "today ", "home ",
            "water ", "room ", "area ", "money ", "story ", "fact ", "month ", "lot "
            , "money ", "book ", "eye ", "job ", "business ",
            "problem ", "side ", "kind "
    };
    String sustmpl[] = {"gobiernos ", "números ", "hogares ", "cuartos ", "areas "};
    String nounmpl[] = {"governments ", "numbers ", "homes ", "rooms ", "areas "};


    String preps[] = {"next to ", "without ", "under ", "far from "};
    String prepo[] = {"al lado de ", "sin ", "debajo de ", "lejos de "};

    String adjsm[] = {"pequeño ", "nacional ", "joven ", "diferente ", "largo ", "negro ", "grande "};
    String adjsf[] = {"pequeña ", "nacional ", "joven ", "diferente ", "larga ", "negra ", "grande "};

    String adjen[] = {"small ", "national ", "young ", "diffrent ", "long ", "black ", "large "};

    String det[] = {"all ", "both ", "a million "};
    String detf[] = {"todas las ", "ambas ", "un millón de "};
    String detm[] = {"todos los ", "ambos ", "un millón de "};
    String gens;
    String gene;
// falta like y always

    public void verbsgen() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        String temp = pronombres[p];
        switch (temp) {
            case "yo ":
                gens = pronombres[p] + v1[v];
                gene = pronoun[p] + verb[v];
                break;
            case "tú ":
                gens = pronombres[p] + v2[v];
                gene = pronoun[p] + verb[v];
                break;
            case "él ":
                gens = pronombres[p] + v3[v];
                gene = pronoun[p] + verb3[v];
                break;

            case "ella ":
                gens = pronombres[p] + v3[v];
                gene = pronoun[p] + verb3[v];
                break;
            case "eso ":
                gens = pronombres[p] + v3[v];
                gene = pronoun[p] + verb3[v];
                break;
            case "ellos ":
                gens = pronombres[p] + v4[v];
                gene = pronoun[p] + verb[v];
                break;
            case "nosotros ":
                gens = pronombres[p] + v5[v];
                gene = pronoun[p] + verb[v];
                break;


        }


    } // verbo y pronombre

    public void advsverbsgen() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        int ad = (int) (Math.random() * adve.length);
        String temp = pronombres[p];
        switch (temp) {
            case "yo ":
                gens = adve[ad] + pronombres[p] + v1s[v];
                gene = advs[ad] + pronoun[p] + verb[v];
                break;
            case "tú ":
                gens = adve[ad] + pronombres[p] + v2s[v];
                gene = advs[ad] + pronoun[p] + verb[v];
                break;
            case "él ":
                gens = adve[ad] + pronombres[p] + v3s[v];
                gene = advs[ad] + pronoun[p] + verb3[v];
                break;

            case "ella ":
                gens = adve[ad] + pronombres[p] + v3s[v];
                gene = advs[ad] + pronoun[p] + verb3[v];
                break;
            case "eso ":
                gens = adve[ad] + pronombres[p] + v3it[v];
                gene = advs[ad] + pronoun[p] + verb3it[v];
                break;
            case "ellos ":
                gens = adve[ad] + pronombres[p] + v4s[v];
                gene = advs[ad] + pronoun[p] + verb[v];
                break;
            case "nosotros ":
                gens = adve[ad] + pronombres[p] + v5s[v];
                gene = advs[ad] + pronoun[p] + verb[v];
                break;


        }

    } // conector de adv+ verbo

    public void prepnoun() {
        int p = (int) (Math.random() * prepo.length);
        int n = (int) (Math.random() * nouns.length);
        gens = prepo[p] + sust[n];
        gene = preps[p] + nouns[n];
    }

    public void adjnounmale() {
        int n = (int) (Math.random() * sustm.length);
        int a = (int) (Math.random() * adjsm.length);
        gens = sustm[n] + adjsm[a];
        gene = "the " + adjen[a] + sustmeng[n];

    }

    public void adjnounfemale() {
        int n = (int) (Math.random() * sustf.length);
        int a = (int) (Math.random() * adjsm.length);
        gens = sustf[n] + adjsf[a];
        gene = "the " + adjen[a] + sustfeng[n];

    }

    public void detf() {
        int d = (int) (Math.random() * det.length);
        int n = (int) (Math.random() * sustfpl.length);
        gens = detf[d] + sustfpl[n];
        gene = det[d] + sustfpleng[n];

    }

    public void detm() {
        int d = (int) (Math.random() * det.length);
        int n = (int) (Math.random() * nounmpl.length);
        gens = detm[d] + sustmpl[n];
        gene = det[d] + nounmpl[n];

    }


}