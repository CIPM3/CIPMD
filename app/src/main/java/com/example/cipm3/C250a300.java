package com.example.cipm3;

public class C250a300 {

    String gens;
    String gene;
    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "we ", "they "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "nosotros ", "ellos "};

    String verb[] = {"provide ", "sit ", "stand ", "lose ",
            "pay ", "meet ", "continue ", "set ", "learn ",
            "change ", "include "
    };
    String verb3[] = {"provides ", "sits ", "stands ", "loses ",
            "pays ", "meets ", "continues ", "sets ", "learns ",
            "changes ", "includes "
    };

    String v1[] = {"proveo ", "me siento ", "me paro ", "pierdo ",
            "pago ", "conozco ", "continuo ", "establezco ", "aprendo ",
            "cambio ", "incluyo "
    };

    String v2[] = {"provees ", "te sientas ", "te paras ", "pierdes ",
            "pagas ", "conoces ", "continuas ", "estableces ", "aprendes ",
            "cambias ", "incluyes "
    };
    String v3[] = {"provee ", "se sienta ", "se para ", "pierde ",
            "paga ", "conoce ", "continua ", "establece ", "aprende ",
            "cambia ", "incluye "
    };
    String v4[] = {"proveen ", "se sientan ", "se paran ", "pierden ",
            "pagan ", "conocen ", "continuan ", "establecen ", "aprenden ",
            "cambian ", "incluyen "
    };
    String v5[] = {"proveemos ", "nos sentamos ", "nos paramos ", "perdemos ",
            "pagamos ", "conocemos ", "continuamos ", "establecemos ", "aprendemos ",
            "cambiamos ", "incluimos "
    };

    String noun[] = {"the service ", "the friend ", "the father ", "the power ",
            "the hour ", "the game ", "the line ", "the end ", "the member ", "the law ",
            "the car ", "the city ", "the name ", "the team ", "the minute ", "the idea ",
            "the comunity ", "the president "
    };
    String sust[] = {"el servicio ", "el amigo ", "el padre ", "el poder ", "la hora ",
            "el juego ", "la linea ", "el fin ", "el miembro ", "la ley ", "el carro ", "la ciudad ",
            "el nombre ", "el equipo ", "el minuto ", "la idea ", "la comunidad ", "el presidente "
    };

    String prp[] = {"around ", "away from ", "among "};
    String prep[] = {"al rededor de ", "lejos de ", "entre "};

    String adv[] = {"often ", "almost ", "always "};
    String adve[] = {"seguido ", "casi ", "siempre "};

    String nounp[] = {"services ", "friends ", "powers ", "games"};
    String nounpm[] = {"servicios ", "amigos ", "poderes ", "juegos "};

    String adjm[] = {"los mejores ", "varios ", "cinco ", "importantes "};
    String adjme[] = {"the best ", "several ", "five", "important "};

    String adjsp[] = {"politico ", "blanco ", "real ", "malo "};
    String adjen[] = {"political ", "white ", "real ", "bad "};

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

    public void verbsadvgen() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        int ad = (int) (Math.random() * adv.length);
        String temp = pronombres[p];

        switch (temp) {

            case "yo ":
                gens = pronombres[p] + adve[ad] + v1[v];
                gene = pronoun[p] + adv[ad] + verb[v];
                break;
            case "tú ":
                gens = pronombres[p] + adve[ad] + v2[v];
                gene = pronoun[p] + adv[ad] + verb[v];
                break;
            case "él ":
                gens = pronombres[p] + adve[ad] + v3[v];
                gene = pronoun[p] + adv[ad] + verb3[v];
                break;

            case "ella ":
                gens = pronombres[p] + adve[ad] + v3[v];
                gene = pronoun[p] + adv[ad] + verb3[v];
                break;
            case "eso ":
                gens = pronombres[p] + adve[ad] + v3[v];
                gene = pronoun[p] + adv[ad] + verb3[v];
                break;
            case "ellos ":
                gens = pronombres[p] + adve[ad] + v4[v];
                gene = pronoun[p] + adv[ad] + verb[v];
                break;
            case "nosotros ":
                gens = pronombres[p] + adve[ad] + v5[v];
                gene = pronoun[p] + adv[ad] + verb[v];
                break;


        }

    } // verbo y pronombre

    public void prepn() {
        int p = (int) (Math.random() * prep.length);
        int s = (int) (Math.random() * sust.length);
        gens = prep[p] + sust[s];
        gene = prp[p] + noun[s];
    }

    public void adjnm() {
        int a = (int) (Math.random() * adjm.length);
        int p = (int) (Math.random() * nounp.length);
        gens = adjm[a] + nounpm[p];
        gene = adjme[a] + nounp[p];
    }

    public void least() {
        int a = (int) (Math.random() * adjsp.length);
        gens = "el menos " + adjsp[a];
        gene = "the least " + adjen[a];
    }


}
