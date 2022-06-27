package com.example.cipm3;

public class C150a200 {

    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "we ", "they "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "nosotros ", "ellos "};

    String verb[] = {"put ", "keep ", "let ", "begin ", "seem ", "help ", "talk ",
            "turn ", "start ", "show ", "start ", "place ", "hear ",
            "work ", "play "
    };
    String verb3[] = {"puts ", "keeps ", "lets ", "begins ", "seems ", "helps ", "talks ",
            "turns ", "starts ", "shows ", "starts ", "places ", "hears ",
            "works ", "plays "
    };

    String v1[] = {"pongo ", "mantengo ", "dejo ", "comienzo ", "parezco ", "ayudo ", "platico ",
            "volteo ", "empiezo ", "muestro ", "empiezo ", "coloco ", "oigo ",
            "trabajo ", "juego "
    };

    String v2[] = {"pones ", "mantienes ", "dejas ", "comienzas ", "pareces ", "ayudas ", "platicas ",
            "volteas ", "empiezas ", "muestras ", "empiezas ", "colocas ", "oyes ",
            "trabajas ", "juegas "
    };


    String v3[] = {"pone ", "mantiene ", "deja ", "comienza ", "parece ", "ayuda ", "platica ",
            "voltea ", "empieza ", "muestra ", "empieza ", "coloca ", "oye ",
            "trabaja ", "juega "
    };
    String v4[] = {"ponen ", "mantienen ", "dejan ", "comienzan ", "parecen ", "ayudan ", "platican ",
            "voltean ", "empiezan ", "muestran ", "empiezan ", "colocan ", "oyen ",
            "trabajan ", "juegan "
    };

    String v5[] = {"ponemos ", "mantenemos ", "dejamos ", "comenzamos ", "parecemos ", "ayudamos ", "platicamos ",
            "volteamos ", "empezamos ", "mostramos ", "empezamos ", "colocamos ", "oímos ",
            "trabajamos ", "jugamos "
    };
    String adj[] = {"old ", "great ", "big ", "american ",};
    String adjm[] = {"viejos ", "grandiosos ", "grandes ", "americanos "};
    String adjf[] = {"viejas ", "grandiosas ", "grandes ", "americanas "};
    String ne[] = {"students ", "groups ", "countries ",
            "problems ", "parts ", "hands ", "cases ", "weeks ",
            "companies ", "systems ", "governments "};

    String nsp[] = {"los estudiantes ", "los grupos ", "los países ", "los problemas ", "las partes ", "las manos ", "los casos ",
            "las semanas ", "las compañía ", "los sistemas ", "los gobiernos "
    };

    String ns[] = {"el estudiante ", "el grupo ", "el país ", "el problema ", "la parte ", "la mano ", "el caso ",
            "la semana ", "la compañia ", "el sistema ", "el gobierno "
    };

    String nes[] = {"the student ", "the group ", "the country ", "the problem ", "the part ",
            "the hand ", "the case ", "the week ",
            "the company ", "the system ", "the government "
    };
    String nse[] = {"student ", "group ", "country ", "problem ", "part ", "hand ", "case ", "week ",
            "company ", "system ", "government "};
    String nss[] = {"estudiante ", "grupo ", "país ", "problema ", "parte ", "mano ", "caso ", "semana ",
            "compañia ", "sistema ", "gobierno "};
    String nssp[] = {"estudiantes ", "grupos ", "países ", "problemas ", "partes ", "manos ", "casos ", "semanas ",
            "compañía ", "sistemas ", "gobiernos "};
    String adv[] = {"why ", "where ", "while "};
    String advsp[] = {"la razon por la cual ", "donde ", "mientras "};
    String det[] = {"such ", "most ", "few "};
    String dete[] = {"tales ", "la mayoría de ", "pocos "};
    String prpe[] = {"on ", "about ", "against "};
    String prep[] = {"sobre ", "acerca de ", "en contra de "};
    String se[] = {"the same ", "few ", "such "};
    String ss[] = {"los mismos ", "pocos ", "tales "};
    String ssf[] = {"las mismas ", "pocas ", "tales "};
    String e[] = {"every ", "most "};
    String em[] = {"todos ", "la mayoría de "};
    String ef[] = {"todas ", "la mayoría de "};
    String nspm[] = {"los estudiantes ", "los grupos ", "los países ", "los problemas ", "los casos ", "los sistemas ", "los gobiernos "};
    String nspf[] = {"las partes ", "las manos ", "las semanas ", "las compañía "};
    String gens;
    String gene;


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

    public void adjn() {
        int ad = (int) (Math.random() * adj.length);
        int nen = (int) (Math.random() * ne.length);
        String temp = ne[nen];

        switch (temp) {
            case "students ":
                gens = "los estudiantes " + adjm[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "groups ":
                gens = "los grupos " + adjm[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "countries ":
                gens = "los países " + adjm[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "problems ":
                gens = "los problemas " + adjm[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "parts ":
                gens = "las partes " + adjf[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "hands ":
                gens = "las manos " + adjf[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "cases ":
                gens = "los casos " + adjm[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "weeks ":
                gens = "las semanas " + adjf[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "companies ":
                gens = "las compañía " + adjf[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "systems ":
                gens = "los sistemas " + adjm[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

            case "governments ":
                gens = "los gobiernos " + adjm[ad];
                gene = "the " + adj[ad] + ne[nen];
                break;

        }

    }// adjetivo y noun

    public void verbsgenadv() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        int ad = (int) (Math.random() * adv.length);
        String temp = pronombres[p];

        switch (temp) {

            case "yo ":
                gens = advsp[ad] + pronombres[p] + v1[v];
                gene = adv[ad] + pronoun[p] + verb[v];
                break;
            case "tú ":
                gens = advsp[ad] + pronombres[p] + v2[v];
                gene = adv[ad] + pronoun[p] + verb[v];
                break;
            case "él ":
                gens = advsp[ad] + pronombres[p] + v3[v];
                gene = adv[ad] + pronoun[p] + verb3[v];
                break;

            case "ella ":
                gens = advsp[ad] + pronombres[p] + v3[v];
                gene = adv[ad] + pronoun[p] + verb3[v];
                break;
            case "eso ":
                gens = advsp[ad] + pronombres[p] + v3[v];
                gene = adv[ad] + pronoun[p] + verb3[v];
                break;
            case "ellos ":
                gens = advsp[ad] + pronombres[p] + v4[v];
                gene = adv[ad] + pronoun[p] + verb[v];
                break;
            case "nosotros ":
                gens = advsp[ad] + pronombres[p] + v5[v];
                gene = adv[ad] + pronoun[p] + verb[v];
                break;


        }

    } // adverb noun verb

    public void detmeth() {
        int prp = (int) (Math.random() * prpe.length);
        int n = (int) (Math.random() * ne.length);
        gens = prep[prp] + ns[n];
        gene = prpe[prp] + nes[n];
    } // prepositions nouns

    public void meth4() {
        int n = (int) (Math.random() * nss.length);
        int s = (int) (Math.random() * ss.length);
        String temp = nssp[n];
        switch (temp) {

            case "estudiantes ":
                gens = ss[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "grupos ":
                gens = ss[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "países ":
                gens = ss[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "problemas ":
                gens = ss[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "partes ":
                gens = ssf[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "manos ":
                gens = ssf[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "casos ":
                gens = ss[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "semanas ":
                gens = ssf[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "compañía ":
                gens = ssf[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "sistemas ":
                gens = ss[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
            case "gobiernos ":
                gens = ss[s] + nssp[n];
                gene = se[s] + ne[n];
                break;
        }

    }

    public void mostmeth() {
        int i = (int) (Math.random() * nsp.length);
        gens = "la mayoría de " + nsp[i];
        gene = "most " + ne[i];
    }

    public void eachmeth() {
        int i = (int) (Math.random() * nss.length);
        gens = "cada " + nss[i];
        gene = "each " + nse[i];
    }


}

