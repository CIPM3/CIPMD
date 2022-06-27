package com.example.cipm3;

public class C400a500 {
    String gens;
    String gene;
    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "we ", "they "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "nosotros ", "ellos "};
    String sustm[] = {"el mercado ", "el hogar ", "el interés ",
            "el curso ", "el efecto ", "el campo ", "el desarrollo ",
            "el rol ", "el esfuerzo ", "el corazón ",
            "el líder ", "el policia ", "el precio ", "el hijo ",
            "el pueblito ", "el camino ", "el brazo ",
    };
    String sustf[] = {"la nación ", "la universidad ", "la muerte ", "alguna persona ", "la clase ", "la tasa ", "la droga ",
            "la luz ", "la voz ", "la esposa ", "la decisión ", "la esperanza ", "la vista ", "la relación ", "la mente "
    };

    String nounm[] = {"market ", "home ", "interest ", "course ", "effect ", "field ", "development ", "role ", "effort ", "heart ",
            "leader ", "police officer ", "price ", "son ", "town ", "road ", "arm "
    };
    String nounf[] = {"nation ", "college ", "death ", "someone ", "class ", "rate ", "drug ", "light ", "voice ", "wife ", "decision ", "hope ",
            "view ", "relationship ", "mind "
    };

    String adj[] = {"local ", "hard ", "former ", "major ", "better ", "economic ", "strong ",
            "possible ", "whole ", "free ", "millitary ", "true ", "federal "};
    String adje[] = {"local ", "difícil ", "antiguo ", "mayor ", "mejor ", "economico ", "fuerte ",
            "posible ", "completo ", "gratis ", "militar ", "verdadero ", "federal "};

    String adjef[] = {"local ", "dificil ", "antigua ", "mayor ", "mejor ", "economica ", "fuerte ",
            "posible", "completa ", "gratis ", "militar ", "verdadera ", "federal "
    };

    String p[] = {"behind ", "according to "};
    String pe[] = {"atras de ", "según "};

    String verb[] = {"serve ", "die ", "send ", "expect ", "sense ",
            "build ", "stay ", "fail ", "plan ", "cut ", "reach ",
            "remain ", "use ", "control ", "raise ", "care for ", "pass ", "sell ",
            "require ", "report ", "decide ", "show ", "pull ", "return ", "explain ",
            "carry ", "drive ", "kill ", "break ", "thank ", "recieve ", "value "
    };
    String verb3[] = {"serves ", "dies ", "sends ", "expects ", "senses ",
            "builds ", "stays ", "fails ", "plans ", "cuts ", "reaches ",
            "remains ", "uses ", "controls ", "raises ", "cares for ", "passes ", "sells ",
            "requires ", "reports ", "decides ", "shows ", "pulls ", "returns ", "explains ",
            "carries ", "drives ", "kills ", "breaks ", "thanks ", "recieves ", "values "
    };

    String v1[] = {"sirvo ", "muero ", "envio ", "espero ", "presiento ", "construyo ", "me quedo ",
            "fracaso ", "planeo ", "corto ", "alcanzo ", "sigo siendo ", "uso ", "controlo ", "crio ", "cuido ",
            "paso ", "vendo ", "requiero ", "reporto ", "decido ", "muestro ", "jalo ", "regreso ", "explico ",
            "cargo ", "conduzco ", "mato ", "quiebro ", "agradezco ", "recivo ", "valoro "
    };
    String v2[] = {"sirves ", "mueres ", "envias ", "esperas ", "presientes ", "construyes ", "te quedas ",
            "fracasas ", "planeas ", "cortas ", "alcanzas ", "sigues siendo ", "usas ", "controlas ", "crias ", "cuidas ",
            "pasas ", "vendes ", "requieres ", "reportas ", "decides ", "muestras ", "jalas ", "regresas ", "explicas ",
            "cargas ", "conduces ", "matas ", "quiebras ", "agradeces ", "recibes ", "valoras "
    };

    String v3[] = {"sirve ", "muere ", "envia ", "espera ", "presiente ", "construye ", "se queda ",
            "fracasa ", "planea ", "corta ", "alcanza ", "sigue siendo ", "usa ", "controla ", "cria ", "cuida ",
            "pasa ", "vende ", "requiere ", "reporta ", "decide ", "muestra ", "jala ", "regresa ", "explica ",
            "carga ", "conduce ", "mata ", "quiebra ", "agradece ", "recibe ", "valora "
    };
    String v4[] = {"sirven ", "mueren ", "envian ", "esperan ", "presienten ", "construyen ", "se quedan ",
            "fracasan ", "planean ", "cortan ", "alcanzan ", "siguen siendo ", "usan ", "controlan ", "crian ", "cuidan ",
            "pasan ", "venden ", "requieren ", "reportan ", "deciden ", "muestran ", "jalan ", "regresan ", "explican ",
            "cargan ", "conducen ", "matan ", "quiebran ", "agradecen ", "reciben ", "valoran "
    };
    String v5[] = {"servimos ", "morimos ", "enviamos ", "esperamos ", "presentimos ", "construimos ", "nos quedamos ",
            "fracasamos ", "planeamos ", "cortamos ", "alcanzamos ", "seguimos siendo ", "usamos ", "controlamos ", "criamos ", "cuidamos ",
            "pasamos ", "vendemos ", "requerimos ", "reportamos ", "decidimos ", "mostramos ", "jalamos ", "regresamos ", "explicamos ",
            "cargamos ", "conducimos ", "matamos ", "quebramos ", "agradecemos ", "recibimos ", "valoramos "
    };

    String ad[] = {"perhaps ", "sometimes "};
    String adv[] = {"quiza ", "aveces "};

    public void adjnf() {
        int n = (int) (Math.random() * sustf.length);
        int a = (int) (Math.random() * adjef.length);
        gens = sustf[n] + adjef[a];
        gene = "the " + adj[a] + nounf[n];

    }

    public void adjnm() {
        int n = (int) (Math.random() * sustm.length);
        int a = (int) (Math.random() * adje.length);
        gens = sustm[n] + adje[a];
        gene = "the " + adj[a] + nounm[n];

    }

    public void prpadjnm() {
        int n = (int) (Math.random() * sustm.length);
        int a = (int) (Math.random() * adje.length);
        int pp = (int) (Math.random() * p.length);
        gens = pe[pp] + sustm[n] + adje[a];
        gene = p[pp] + "the " + adj[a] + nounm[n];

    }

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

    public void verbsgenprep() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        int a = (int) (Math.random() * ad.length);
        String temp = pronombres[p];
        switch (temp) {

            case "yo ":
                gens = pronombres[p] + adv[a] + v1[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;
            case "tú ":
                gens = pronombres[p] + adv[a] + v2[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;
            case "él ":
                gens = pronombres[p] + adv[a] + v3[v];
                gene = pronoun[p] + ad[a] + verb3[v];
                break;

            case "ella ":
                gens = pronombres[p] + adv[a] + v3[v];
                gene = pronoun[p] + ad[a] + verb3[v];
                break;
            case "eso ":
                gens = pronombres[p] + adv[a] + v3[v];
                gene = pronoun[p] + ad[a] + verb3[v];
                break;
            case "ellos ":
                gens = pronombres[p] + adv[a] + v4[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;
            case "nosotros ":
                gens = pronombres[p] + adv[a] + v5[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;


        }

    } // verbo y pronombre


}