package com.example.cipm3;

public class cerotofifty {
    String articles[] = {"the ", "the ", "the ", "the ", "a ", "a ", "some ", "some "};
    String articulos[] = {"el ", "la ", "los ", "las ", "un ", "una ", "unos ", "unas "};

    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "we ", "they "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "nosotros ", "ellos "};

    String adj[] = {"this ", "his ", "her ", "their ", "that "};
    String adje[] = {"este ", "su ", "su ", "su ", "ese "};


    String prep[] = {"of ", "in ", "to ", "for ", "with ", "on ", "from ", "about "};
    String prepsp[] = {"de ", "en ", "a ", "para ", "con ", "sobre ", "desde ", "acerca de "};

    //verbos base
    String vib[] = {"have ", "say ", "go ", "get ", "make ", "know "};
    String vib3[] = {"has ", "says ", "goes ", "gets ", "makes ", "knows "};
    String verbos[] = {"tener ", "decir ", "ir ", "obtener ", "hacer ", "saber "};

    //presente
    String vib1[] = {"tengo ", "digo ", "voy ", "obtengo ", "hago ", "sé "};
    String vib2[] = {"tienes ", "dices ", "vas ", "obtienes ", "haces ", "sabes "};
    String vib3esp[] = {"tiene ", "dice ", "va ", "obtiene ", "hace ", "sabe "};
    String vib3p[] = {"tienen ", "dicen ", "van ", "obtienen ", "hacen ", "saben "};
    String vibnos[] = {"tenemos ", "dicen ", "vamos ", "obtenemos ", "hacemos ", "sabemos "};

    // hipotetico
    String verbo1hip[] = {"tendría ", "diría ", "iría ", "obtendría ", "haría ", "sabría "};
    String verbo2hip[] = {"tendrías ", "dirías ", "irías ", "obtendrías ", "harías ", "sabrías "};
    String verbo3hip[] = {"tendría ", "diría ", "iría ", "obtendría ", "haría ", "sabría "};
    String verbos4hip[] = {"tendrían ", "dirían ", "irían ", "obtendrían ", "harían ", "sabrían "};
    String verbos5hip[] = {"tendríamos ", "diríamos ", "iríamos ", "obtendríamos ", "haríamos ", "sabríamos "};

    //futuro
    String verbo1f[] = {"tendré ", "diré ", "iré ", "obtendré ", "haré ", "sabré "};
    String verbo2f[] = {"tendrás ", "dirás ", "irás ", "obtendrás ", "harás ", "sabrás "};
    String verbo3f[] = {"tendrá ", "dirá ", "irá ", "obtendrá ", "hará ", "sabrá "};
    String verbos4f[] = {"tendrán ", "dirán ", "irán ", "obtendrán ", "harán ", "sabrán "};
    String verbos5f[] = {"tendrémos ", "dirémos ", "irémos ", "obtendrémos ", "harémos ", "sabrémos "};

    //modales
    String modal[] = {"would ", "will ", "can ", "can ", "can ", "can ", "can ", "can ", "can "};
    String modales[] = {" ", " ", "puedo ", "puedes ", "puede ", "puede ", "puede ", "pueden ", "podemos "};

    //adverbs
    String adv[] = {"what ", "as ", "or ", "but ",};
    String adver[] = {"lo que ", "como ", "o ", "pero "};


    //placeholder nouns
    String sofe[] = {"people ", "history ", "way ", "information"};
    String sofs[] = {"gente ", "historia ", "manera ", "información "};
    String pofs[] = {"mujeres ", "casas ", "maneras ", "coasas "};
    String pofe[] = {"women ", "houses ", "ways ", "things"};


    String soms[] = {"tiempo ", "año ", "niño "};
    String some[] = {"time ", "year ", "boy "};
    String poms[] = {"hombres ", "perros ", "objetos ", "libros "};
    String pome[] = {"men ", "dogs ", "objects ", "books "};
    String noun[] = {"car ", "money ", "friend ", "object ", "phone ", "time "};
    String sust[] = {"carro ", "dinero ", "amigo ", "objeto ", "telefono ", "tiempo"};

    // los del be
    String be[] = {"am ", "are ", "is ", "is ", "is ", "are ", "are "};
    String ser[] = {"soy ", "eres ", "es ", "es ", "son ", "somos "};
    String est[] = {"estoy ", "estas ", "está ", "está ", "está ", "están ", "estamos "};

    // este metodo genera prepossiciones, articulos y objetos
    String ob;
    String eng;

    public void prepartob() {
        int i = (int) (Math.random() * articles.length);
        int ii = (int) (Math.random() * soms.length);
        int iii = (int) (Math.random() * sofs.length);
        int iv = (int) (Math.random() * poms.length);
        int v = (int) (Math.random() * pofs.length);
        int vi = (int) (Math.random() * prep.length);
        String temp = articulos[i];
        switch (temp) {
            case "el ":
                ob = prepsp[vi] + articulos[i] + soms[ii];
                eng = prep[vi] + articles[0] + some[ii];
                break;
            case "la ":
                ob = prepsp[vi] + articulos[i] + sofs[iii];
                eng = prep[vi] + articles[1] + sofe[iii];
                break;
            case "los ":
                ob = prepsp[vi] + articulos[i] + poms[iv];
                eng = prep[vi] + articles[2] + pome[iv];
                break;
            case "las ":
                ob = prepsp[vi] + articulos[i] + pofs[v];
                eng = prep[vi] + articles[3] + pofe[v];
                break;
            case "un ":
                ob = prepsp[vi] + articulos[i] + soms[ii];
                eng = prep[vi] + articles[4] + some[ii];
                break;
            case "una ":
                ob = prepsp[vi] + articulos[i] + sofs[iii];
                eng = prep[vi] + articles[5] + sofe[iii];
                break;
            case "unos ":
                ob = prepsp[vi] + articulos[i] + poms[iv];
                eng = prep[vi] + articles[6] + pome[iv];
                break;
            case "unas ":
                ob = prepsp[vi] + articulos[i] + pofs[v];
                eng = prep[vi] + articles[7] + pofe[v];
                break;


        }


    }

    // pronouns and verbs
    String gens;
    String gene;

    public void pronverb() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + vib1[iv];
                        gene = pronoun[0] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + vib1[iv];
                        gene = pronoun[0] + "don't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + vib2[iv];
                        gene = pronoun[1] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + vib2[iv];
                        gene = pronoun[1] + "don't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + vib3esp[iv];
                        gene = pronoun[2] + vib3[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + vib3esp[iv];
                        gene = pronoun[2] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + vib3esp[iv];
                        gene = pronoun[3] + vib3[iv];
                        break;

                    case 2:
                        gens = pronombres[3] + "no " + vib3esp[iv];
                        gene = pronoun[3] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + vib3esp[iv];
                        gene = pronoun[4] + vib3[iv];
                        break;
                    case 2:
                        gens = pronombres[4] + "no " + vib3esp[iv];
                        gene = pronoun[4] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + vib3p[iv];
                        gene = pronoun[5] + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[5] + "no " + vib3p[iv];
                        gene = pronoun[5] + "don't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + vibnos[iv];
                        gene = pronoun[6] + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[6] + "no " + vibnos[iv];
                        gene = pronoun[6] + "don't " + vib[iv];
                        break;
                }
                break;
        }
    }

    //adjectives
    public void adjmethod() {
        int adjt = (int) (Math.random() * adj.length);
        int i = (int) (Math.random() * sust.length);
        String tempadj = adj[adjt];
        switch (tempadj) {
            case "this ":
                gens = adje[adjt] + sust[i];
                gene = adj[adjt] + noun[i];
                break;
            case "his ":
                gens = adje[adjt] + sust[i] + "(de él)";
                gene = adj[adjt] + noun[i];
                break;

            case "her ":
                gens = adje[adjt] + sust[i] + "(de ella)";
                gene = adj[adjt] + noun[i];
                break;

            case "their ":
                gens = adje[adjt] + sust[i] + "(de ellos)";
                gene = adj[adjt] + noun[i];
                break;

            case "that ":
                gens = adje[adjt] + sust[i];
                gene = adj[adjt] + noun[i];
                break;
        }

    }

    //added adv
    public void advpronverb() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        int ii = (int) (Math.random() * adv.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[0] + vib1[iv];
                        gene = adv[ii] + pronoun[0] + vib[iv];
                        break;
                    case 1:
                        gens = adver[ii] + pronombres[0] + "no " + vib1[iv];
                        gene = adv[ii] + pronoun[0] + "don't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[1] + vib2[iv];
                        gene = adv[ii] + pronoun[1] + vib[iv];
                        break;
                    case 1:
                        gens = adver[ii] + pronombres[1] + "no " + vib2[iv];
                        gene = adv[ii] + pronoun[1] + "don't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = adver[ii] + pronombres[2] + vib3esp[iv];
                        gene = adv[ii] + pronoun[2] + vib3[iv];
                        break;

                    case 1:
                        gens = adver[ii] + pronombres[2] + "no " + vib3esp[iv];
                        gene = adv[ii] + adv[ii] + pronoun[2] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[3] + vib3esp[iv];
                        gene = adv[ii] + adv[ii] + pronoun[3] + vib3[iv];
                        break;

                    case 2:
                        gens = adver[ii] + pronombres[3] + "no " + vib3esp[iv];
                        gene = adv[ii] + adv[ii] + pronoun[3] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[4] + vib3esp[iv];
                        gene = adv[ii] + pronoun[4] + vib3[iv];
                        break;
                    case 2:
                        gens = adver[ii] + pronombres[4] + "no " + vib3esp[iv];
                        gene = adv[ii] + pronoun[4] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[6] + vib3p[iv];
                        gene = adv[ii] + pronoun[6] + vib[iv];
                        break;
                    case 2:
                        gens = adver[ii] + pronombres[6] + "no " + vib3p[iv];
                        gene = adv[ii] + pronoun[6] + "don't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[5] + vibnos[iv];
                        gene = adv[ii] + pronoun[5] + vib[iv];
                        break;
                    case 2:
                        gens = adver[ii] + pronombres[5] + "no " + vibnos[iv];
                        gene = adv[ii] + pronoun[5] + "don't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // los del will
    public void pronverbwill() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + verbo1f[iv];
                        gene = pronoun[0] + "will " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + verbo1f[iv];
                        gene = pronoun[0] + "won't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + verbo2f[iv];
                        gene = pronoun[1] + "will " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + verbo2f[iv];
                        gene = pronoun[1] + "won't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + verbo3f[iv];
                        gene = pronoun[2] + "will " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + verbo3f[iv];
                        gene = pronoun[2] + "won't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + verbo3f[iv];
                        gene = pronoun[3] + "will " + vib[iv];
                        break;

                    case 2:
                        gens = pronombres[3] + "no " + verbo3f[iv];
                        gene = pronoun[3] + "won't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + verbo3f[iv];
                        gene = pronoun[4] + "will " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[4] + "no " + verbo3f[iv];
                        gene = pronoun[4] + "won't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + verbos4f[iv];
                        gene = pronoun[5] + "will " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[5] + "no " + verbos4f[iv];
                        gene = pronoun[5] + "won't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + verbos5f[iv];
                        gene = pronoun[6] + "will " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[6] + "no " + verbos5f[iv];
                        gene = pronoun[6] + "won't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // los del would
    public void pronverbwould() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + verbo1hip[iv];
                        gene = pronoun[0] + "would " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + verbo1hip[iv];
                        gene = pronoun[0] + "wouldn't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + verbo2hip[iv];
                        gene = pronoun[1] + "would " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + verbo2hip[iv];
                        gene = pronoun[1] + "wouldn't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + verbo3hip[iv];
                        gene = pronoun[2] + "would " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + verbo3hip[iv];
                        gene = pronoun[2] + "wouldn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + verbo3hip[iv];
                        gene = pronoun[3] + "would " + vib[iv];
                        break;

                    case 2:
                        gens = pronombres[3] + "no " + verbo3hip[iv];
                        gene = pronoun[3] + "wouldn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + verbo3hip[iv];
                        gene = pronoun[4] + "would " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[4] + "no " + verbo3hip[iv];
                        gene = pronoun[4] + "wouldn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + verbos4hip[iv];
                        gene = pronoun[5] + "would " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[5] + "no " + verbos4hip[iv];
                        gene = pronoun[5] + "wouldn't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + verbos5hip[iv];
                        gene = pronoun[6] + "would " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[6] + "no " + verbos5hip[iv];
                        gene = pronoun[6] + "wouldn't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // los del would
    public void pronverbcan() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + "puedo " + verbos[iv];
                        gene = pronoun[0] + "can " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no puedo " + verbos[iv];
                        gene = pronoun[0] + "can't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + "puedes " + verbos[iv];
                        gene = pronoun[1] + "can " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no puedes " + verbos[iv];
                        gene = pronoun[1] + "can't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + "puede " + verbos[iv];
                        gene = pronoun[2] + "can " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no puede " + verbos[iv];
                        gene = pronoun[2] + "can't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + "puede " + verbos[iv];
                        gene = pronoun[3] + "can " + vib[iv];
                        break;

                    case 2:
                        gens = pronombres[3] + "no puede " + verbos[iv];
                        gene = pronoun[3] + "can't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + "puede " + verbos[iv];
                        gene = pronoun[4] + "can " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[4] + "no puede " + verbos[iv];
                        gene = pronoun[4] + "can't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + "pueden " + verbos[iv];
                        gene = pronoun[5] + "can " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[5] + "no pueden " + verbos[iv];
                        gene = pronoun[5] + "can't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + "podemos " + verbos[iv];
                        gene = pronoun[6] + "can " + vib[iv];
                        break;
                    case 2:
                        gens = pronombres[6] + "no podemos " + verbos[iv];
                        gene = pronoun[6] + "can't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // to be
    public void tobe() {
        int t = (int) (Math.random() * pronombres.length);
        String tempt = pronombres[t];
        int s = (int) (Math.random() * ser.length);
        switch (tempt) {
            case "yo ":
                gens = "yo soy";
                gene = "I am";
                break;

            case "tú ":
                gens = "tú eres";
                gene = "you are";
                break;

            case "él ":
                gens = "él es";
                gene = "he is";
                break;

            case "ella ":
                gens = "ella es";
                gene = "she is";
                break;

            case "eso ":
                gens = "eso es";
                gene = "it is";
                break;

            case "nosotros ":
                gens = "nosotros somos";
                gene = "we are";
                break;

            case "ellos ":
                gens = "ellos son";
                gene = "they are";
                break;
        }

    }


}

