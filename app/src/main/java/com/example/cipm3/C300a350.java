package com.example.cipm3;

public class C300a350 {

    String gens;
    String gene;

    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "we ", "they "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "nosotros ", "ellos "};

    String verb[] = {"lead ", "understand ", "watch ", "follow "
            , "stop ", "create ", "speak ", "read ", "allow ",
            "add ", "spend ", "grow ", "open ", "walk ", "win "
    };
    String verb3[] = {"leads ", "understands ", "watches ", "follow s"
            , "stops ", "creates ", "speaks ", "reads ", "allows ",
            "adds ", "spends ", "grows ", "opens ", "walks ", "wins "
    };

    String v1[] = {"dirigo ", "entiendo ", "observo ", "sigo "
            , "detengo ", "creo ", "hablo ", "leo ", "permito ",
            "agrego ", "gasto ", "crezco ", "abro ", "camino ", "gano "
    };

    String v2[] = {"diriges ", "entiendes ", "observas ", "sigues "
            , "detienes ", "cres ", "hablas ", "lees ", "permites ",
            "agregas ", "gastas ", "creces ", "abres ", "caminas ", "ganas "
    };

    String v3[] = {"dirige ", "entiende ", "observa ", "sigue "
            , "detiene ", "cree ", "habla ", "lee ", "permite ",
            "agrega ", "gasta ", "crece ", "abre ", "camina ", "gana "
    };

    String v4[] = {"dirigen ", "entienden ", "observan ", "siguen "
            , "detienen ", "creen ", "hablan ", "leen ", "permiten ",
            "agregan ", "gastan ", "crecen ", "abren ", "caminan ", "ganan "
    };

    String v5[] = {"dirigimos ", "entendemos ", "observamos ", "seguimos "
            , "detenemos ", "creemos ", "hablamos ", "leemos ", "permitimos ",
            "agregamos ", "gastamos ", "crecemos ", "abrimos ", "caminamos ", "ganamos "
    };

    String v1s[] = {"diriga ", "entienda ", "observe ", "siga "
            , "detenga ", "crea ", "hable ", "lea ", "permita ",
            "agregue ", "gaste ", "creszca ", "abra ", "camine ", "gane "
    };
    String v2s[] = {"dirigas ", "entiendas ", "observes ", "sigas "
            , "detengas ", "creas ", "hables ", "leas ", "permitas ",
            "agregues ", "gastes ", "creszcas ", "abras ", "camines ", "ganes "
    };
    String v3s[] = {"diriga ", "entienda ", "observe ", "siga "
            , "detenga ", "crea ", "hable ", "lea ", "permita ",
            "agregue ", "gaste ", "creszca ", "abra ", "camine ", "gane "
    };

    String v4s[] = {"dirigan ", "entiendan ", "observen ", "sigan "
            , "detengan ", "crean ", "hablen ", "lean ", "permitan ",
            "agreguen ", "gasten ", "creszcan ", "abran ", "caminen ", "ganen "
    };
    String v5s[] = {"dirigamos ", "entedamos ", "observemos ", "sigamos "
            , "detengamos ", "creamos ", "hablemos ", "leamos ", "permitamos ",
            "agreguemos ", "gastemos ", "creszcamos ", "abramos ", "caminemos ", "ganemos "
    };

    String be[] = {"am ", "are ", "is ", "is ", "is ", "are ", "are"};
    String ser[] = {"estoy ", "estás ", "está ", "está ", "está ", "estámos ", "están "};
    String seg[] = {"seguro ", "seguro ", "seguro ", "segura ", "seguro ", "seguros ", "seguros "};


    String verbing[] = {"leading ", "understanding ", "walking ", "winning "};
    String verband[] = {"dirigiendo ", "entendiendo ", "caminando ", "ganando "};

    String noun[] = {"body ", "information ", "nothing ", "parent ", "face ",
            "anything ", "others ", "level ", "office ", "door ", "health ", "person ",
            "art ", "war ", "history ", "party ", "result ", "morning ", "reason ",
            "research ", "girl ", "guy ", "food ", "moment ", "air "
    };

    String sustm[] = {"el cuerpo ", "el padre ",
            "otros ", "el nivel ",
            "el arte ",
            "el resultado ", "el chavo ",
            "el momento ", "el aire "
    };
    String nounm[] = {"body ", "parent ", "others ", "level ", "art ", "result ", "guy ", "moment ", "air "};

    String sustf[] = {"la información ", "la nada ", "la cara ", "cualquier cosa ", "la oficina ", "la puerta ",
            "la salud ", "la persona ", "la guerra ", "la historia ", "la fiesta ", "la mañana ", "la razón ", "la investigación "
            , "la niña ", "la comida ",
    };

    String nounf[] = {"information ", "nothing ", "face ", "anything ", "office ", "door ", "health ", "person ", "war ",
            "history ", "party ", "morning ", "reason ", "investigation ", "girl ", "food "
    };


    String adj[] = {"temprano ", "bajo ", "social ", "publico "};
    String adjf[] = {"temprana ", "baja ", "social ", "publica"};
    String adjen[] = {"early ", "low ", "social ", "public "};


    String adve[] = {"ya sea que ", "una vez que "};
    String advs[] = {"whether ", "once "};
    String time[] = {"some time ", "a year ", "a week ", "a day "};
    String tiempo[] = {"algún tiempo ", "un año ", "una semana ", "un día "};


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

    public void beseguro() {
        int b = (int) (Math.random() * pronombres.length);
        gens = pronombres[b] + ser[b] + seg[b];
        gene = pronoun[b] + be[b] + "sure ";
    }

    public void already() {
        int v = (int) (Math.random() * verbing.length);
        int p = (int) (Math.random() * pronombres.length);
        gens = pronombres[p] + "ya " + ser[p] + verband[v];
        gene = pronoun[p] + be[p] + verbing[v] + "already ";
    }

    public void advsverbsgen() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        int ad = (int) (Math.random() * adve.length);
        String temp = pronombres[p];
        switch (temp) {
            case "yo ":
                gens = adve[ad] + pronombres[p] + v1s[v] + "o no";
                gene = advs[ad] + pronoun[p] + verb[v] + "or not";
                break;
            case "tú ":
                gens = adve[ad] + pronombres[p] + v2s[v] + "o no";
                gene = advs[ad] + pronoun[p] + verb[v] + "or not";
                break;
            case "él ":
                gens = adve[ad] + pronombres[p] + v3s[v] + "o no";
                gene = advs[ad] + pronoun[p] + verb3[v] + "or not";
                break;

            case "ella ":
                gens = adve[ad] + pronombres[p] + v3s[v] + "o no";
                gene = advs[ad] + pronoun[p] + verb3[v] + "or not";
                break;
            case "eso ":
                gens = adve[ad] + pronombres[p] + v3s[v] + "o no";
                gene = advs[ad] + pronoun[p] + verb3[v] + "or not";
                break;
            case "ellos ":
                gens = adve[ad] + pronombres[p] + v4s[v] + "o no";
                gene = advs[ad] + pronoun[p] + verb[v];
                break;
            case "nosotros ":
                gens = adve[ad] + pronombres[p] + v5s[v] + "o no";
                gene = advs[ad] + pronoun[p] + verb[v] + "or not";
                break;


        }

    } // conector de adv+ verbo

    public void dentrodemale() {
        int s = (int) (Math.random() * sustm.length);
        int a = (int) (Math.random() * adj.length);
        gens = "dentro de " + sustm[s] + adj[a];
        gene = "within the " + adjen[a] + nounm[s];
    }

    public void dentrodefemale() {
        int s = (int) (Math.random() * sustf.length);
        int a = (int) (Math.random() * adjf.length);
        gens = "dentro de " + sustf[s] + adjf[a];
        gene = "within the " + adjen[a] + nounf[s];
    }

    public void agometh() {
        int t = (int) (Math.random() * time.length);
        gens = "hace " + tiempo[t];
        gene = time[t] + "ago ";
    }


}

