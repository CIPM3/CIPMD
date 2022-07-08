package com.example.cipm3;

public class Nobles2 {

    //vnb verbos nobles top 100
    String vnb[] = {"replace ", "send ", "smell ", "attract ", "throw ", "acquire ", "incorporate ",
            "organize ", "establish ", "approve ", "use ", "enjoy ", "protect ", "develop ",
            "remember ", "choose ", "forget ", "accept "
    };

    // verbos nobles base spanish
    String vnbs[] = {"reemplazar ", "enviar ", "oler ", "atraer ", "arrojar ", "adquirir ",
            "incorporar ", "organizar ", "establecer ", "aprobar ", "usar ", "disfrutar ",
            "proteger ", "desarrollar ", "recordar ", "escoger ", "olvidar ", "aceptar "
    };

    //vnb verbos nobles top 100  tercera persona inglés
    String vnb3[] = {"replaces ", "sends ", "smells ", "attracts ", "throws ", "acquires ", "incorporates ",
            "organizes ", "establishes ", "approves ", "uses ", "enjoys ", "protects ", "develops ",
            "remembers ", "chooses ", "forgets ", "accepts "
    };

    //vnb verbos nobles top 100  primera persona esp
    String vn1[] = {"reemplazo ", "envío ", "huelo ", "atraigo ", "arrojo ", "adquiero ",
            "incorporo ", "organizo ", "establezco ", "apruebo ", "uso ", "disfruto ",
            "protejo ", "desarrollo ", "recuerdo ", "escojo ", "olvido ", "acepto "
    };

    //vnb verbos nobles top 100  segunda persona esp
    String vn2[] = {"reemplazas ", "envías ", "hueles ", "atraes ", "arrojas ", "adquieres ",
            "incorporas ", "organizas ", "estableces ", "apruebas ", "usas ", "disfrutas ",
            "proteges ", "desarrollas ", "recuerdas ", "escoges ", "olvidas ", "aceptas "
    };

    //vnb verbos nobles top 100  tercera persona esp
    String vn3[] = {"reemplaza ", "envía ", "huele ", "atrae ", "arroja ", "adquiere ",
            "incorpora ", "organiza ", "establece ", "aprueba ", "usa ", "disfruta ",
            "protege ", "desarrolla ", "recuerda ", "escoge ", "olvida ", "acepta "
    };

    //vnb verbos nobles top 100  cuarta persona esp ellos
    String vn4[] = {"reemplazan ", "envían ", "huelen ", "atraen ", "arrojan ", "adquieren ",
            "incorporan ", "organizan ", "establecen ", "aprueban ", "usan ", "disfrutan ",
            "protegen ", "desarrollan ", "recuerdan ", "escogen ", "olvidan ", "aceptan "
    };


    //vnb verbos nobles top 100  quinta persona esp nosotros
    String vn5[] = {"reemplazamos ", "enviamos ", "olemos ", "atraemos ", "arrojamos ", "adquirimos ",
            "incorporamos ", "organizamos ", "establecemos ", "aprobamos ", "usamos ", "disfrutamos ",
            "protegemos ", "desarrollamos ", "recordamos ", "escogemos ", "olvidamos ", "aceptamos "
    };

    //pasados (agregado wish SV 060422)
    String ps1wish[] = {"reemplazara ", "enviara ", "oliera ", "atrajera ", "arrojara ", "adquiriera ",
            "incorporara ", "organizara ", "estableciera ", "aprobara ", "usara ", "disfrutara ",
            "protegiera ", "desarrollara ", "recordara ", "escogiera ", "olvidara ", "aceptara "
    };
    String ps2wish[] = {"reemplazaras ", "enviaras ", "olieras ", "atrajeras ", "arrojaras ", "adquirieras ",
            "incorporaras ", "organizaras ", "establecieras ", "aprobaras ", "usaras ", "disfrutaras ",
            "protegieras ", "desarrollaras ", "recordaras ", "escogieras ", "olvidaras ", "aceptaras "
    };
    String ps3wish[] = {"reemplazara ", "enviara ", "oliera ", "atrajera ", "arrojara ", "adquiriera ",
            "incorporara ", "organizara ", "estableciera ", "aprobara ", "usara ", "disfrutara ",
            "protegiera ", "desarrollara ", "recordara ", "escogiera ", "olvidara ", "aceptara "
    };
    String ps4wish[] = {"reemplazaran ", "enviaran ", "olieran ", "atrajeran ", "arrojaran ", "adquirieran ",
            "incorporaran ", "organizaran ", "establecieran ", "aprobaran ", "usaran ", "discfrutaran ",
            "protegieran ", "desarrollaran ", "recordaran ", "escogieran ", "olvidaran ", "aceptaran "
    };
    String ps5wish[] = {"reemplazáramos ", "enviáramos ", "olieramos ", "atrajeramos ", "arrojáramos ",
            "adquirieramos ", "incorporáramos ", "organizáramos ", "establecieramos ", "aprobaramos ",
            "usáramos ", "disfrutáramos ", "protegieramos ", "desarrolláramos ", "recordáramos ",
            "escogiéramos ", "olvidáramos ", "aceptaramos "
    };

    // nouns nobles top 100
    String nnobles[] = {"news ", "the news ", "the growth ", "the marriage ", "the user ", "the combination ",
            "the failure ", "the meaning ", "the medicine ", "the philosophy ", "the teacher ", "the communication ",
            "the night ", "the chemistry ", "the disease ", "the disks ", "the energy ", "the nation ",
            "the road ", "the role ", "the soup ", "the location ", "the success ", "the addition ",
            "the apartment ", "the education ", "the math ", "the moment ", "the painting ", "the attention ",
            "the decision ", "the event ", "the property ", "the student ", "the wood ",
            "the competition ", "the distribution ", "the entretainment ", "the office ", "the population ",
            "the president ", "the unit ", "the category ", "the cigarrette ", "the context ", "the introduction ",
            "the oportunity ", "the performance ", "the driver ", "the flight ", "the lenght ", "the magazine ",
            "the relationship ", "the teachings ", "the cell ", "the dealer ", "the debate ", "the finding ",
            "the lake ", "the member ", "the message ", "the phone ", "the scene ", "the appearance ",
            "the association ", "the concept ", "the customer ", "the death ", "the discussion ", "the housing ",
            "the inflation ", "the insurance ", "the woman ", "the advice ", "the blood ", "the effort ",
            "the expression ", "the importance ", "the opinion ", "the payment ", "the reality ",
            "the responsability ", "the situation ", "the skill ", "the statement ", "the wealth ", "the application ",
            "the city ", "the county ", "the depth ", "the estate ", "the foundation ", "the grandmother ",
            "the heart ", "the prespective ", "the photo ", "the recipie ", "the studio "
    };


    // nouns nobles espa;ol top 100
    String nnoblesesp[] = {"noticias ", "las noticias ", "el crecimiento ", "el matrimonio ", "a el usuario ", "la combinación ", "el fracaso ",
            "el significado ", "la medicina ", "la filosofía ", "el maestro ", "la comunciación ", "la noche ", "la quimica ",
            "la enfermedad ", "el disco ", "la energia ", "la nación ", "el camino ", "el rol ", "la sopa ", "la ubicación ", "el éxito ",
            "la suma ", "el departamento ", "la educación ", "las matematicas ", "el momento ", "la pintura ", "la atención ",
            "la desición ", "el evento ", "la propiedad ", "a el estudiante ", "la madera ", "la comptetencia ", "la distribución ",
            "el entretenimiento ", "la oficina ", "a la población ", "a el presidente ", "la unidad ", "la categoría ", "el cigarro ",
            "el contexto ", "la introducción ", "la oportunidad ", "el desempeño ", "a el conductor ", "el vuelo ", "la longitud ", "la revista ",
            "la relación ", "las enseñanzas ", "la celula ", "a el distribuidor ", "el debate ", "el hallazgo ", "el lago ", "a el miembro ",
            "el mensaje ", "el teléfono ", "la escena ", "la apariencia ", "la asociación ", "el concepto ", "a el cliente ", "la muerte ",
            "la discución ", "la vivienda ", "la inflanción ", "la aseguranza ", "a la mujer ", "el consejo ", "la sangre ", "el esfuerzo ",
            "la expresión ", "la importancia ", "la opinión ", "el pago ", "la realidad ", "la responsabilidad ", "la situación ", "la habilidad ",
            "la declaración ", "la riqueza ", "la aplicación ", "la ciudad ", "el país ", "la profunidad ", "el estado ", "la fundación ",
            "a la abuela ", "el corazón ", "la prespectiva ", "la foto ", "la receta ", "el estudio "
    };

    // nouns nobles ing m
    String nnoblesM[] ={"the growth ", "the marriage ", "the user ", "the failure ","the meaning ", "the teacher ", "the disks ",
            "the road ", "the role ", "the success ", "the apartment ", "the moment ", "the event ", "the student ", "the entretainment ",
            "the president ", "the cigarrette ", "the context ", "the performance ", "the driver ", "the flight ", "the dealer ", "the debate ",
            "the finding ", "the lake ", "the member ", "the message ", "the phone ", "the concept ", "the customer ", "the advice ",
            "the effort ", "the payment ", "the county ", "the estate ", "the heart ", "the studio "
    };

    // nouns nobles ing F
    String nnoblesF[] ={"the news ", "the combination ", "the medicine ", "the philosophy ", "the communication ", "the night ", "the chemistry ",
            "the disease ", "the energy ", "the nation ", "the soup ", "the location ", "the addition ", "the education ", "the math ", "the painting ",
            "the attention ", "the decision ", "the property ", "the wood ", "the competition ", "the distribution ", "the office ", "the population ",
            "the unit ", "the category ", "the introduction ", "the oportunity ", "the lenght ", "the magazine ", "the relationship ", "the teachings ",
            "the cell ", "the scene ", "the appearance ", "the association ", "the death ", "the discussion ", "the housing ", "the inflation ",
            "the insurance ", "the woman ", "the blood ", "the expression ", "the importance ", "the opinion ", "the reality ", "the responsability ",
            "the situation ", "the skill ", "the statement ", "the wealth ", "the application ", "the city ", "the depth ", "the foundation ",
            "the grandmother ", "the prespective ", "the photo ", "the recipie "
    };

    // nouns nobles espa M
    String nnoblesespM[] = {"el crecimiento ", "el matrimonio ", "a el usuario ", "el fracaso ", "el significado ", "el maestro ",
            "el disco ", "el camino ", "el rol ", "el éxito ", "el departamento ", "el momento ", "el evento ", "a el estudiante ",
            "el entretenimiento ", "a el presidente ", "el cigarro ", "el contexto ", "el desempeño ", "a el conductor ", "el vuelo ",
            "a el distribuidor ", "el debate ", "el hallazgo ", "el lago ", "a el miembro ", "el mensaje ", "el teléfono ", "el concepto ",
            "a el cliente ", "el consejo ", "el esfuerzo ", "el pago ", "el país ", "el estado ", "el corazón ", "el estudio "
    };

    // nouns nobles espa F
    String nnoblesespF[] ={"las noticias ", "la combinación ", "la medicina ", "la filosofía ", "la comunciación ", "la noche ", "la quimica ",
            "la enfermedad ", "la energia ", "la nación ", "la sopa ", "la ubicación ", "la suma ", "la educación ", "las matematicas ",
            "la pintura ", "la atención ", "la desición ", "la propiedad ", "la madera ", "la comptetencia ", "la distribución ","la oficina ",
            "a la población ", "la unidad ", "la categoría ", "la introducción ", "la oportunidad ", "la longitud ", "la revista ",
            "la relación ", "las enseñanzas ", "la celula ", "la escena ", "la apariencia ", "la asociación ", "la muerte ", "la discución ",
            "la vivienda ", "la inflanción ", "la aseguranza ", "a la mujer ", "la sangre ", "la expresión ", "la importancia ", "la opinión ",
            "la realidad ", "la responsabilidad ", "la situación ", "la habilidad ", "la declaración ", "la riqueza ", "la aplicación ",
            "la ciudad ", "la profunidad ", "la fundación ", "a la abuela ", "la prespectiva ", "la foto ", "la receta "
    };
    String ps1; // esta la uso para primera persona esp
    String ps1eng;
    String ps2;
    String ps2eng;
    String ps3;
    String ps3eng;
    String ps3ella;
    String ps3she;
    String ps3eso;
    String ps3it;
    String ps4;
    String ps4eng;
    String ps5;
    String ps5eng;
    String ps1eng2;
    String ps2eng2;
    String ps3eng2;
    String ps3she2;
    String ps3iteng2;
    String ps4eng2;
    String ps5eng2;

    int v = (int) (Math.random() * vnb.length);
    int n = (int) (Math.random() * nnobles.length);
    int neg = (int) (Math.random() * 2);
    String palabras;


    //ya en negativo
    public void generarnoblespresentesimple() {

        switch (neg) {
            case 0:
                ps1 = "yo " + vn1[v] + nnoblesesp[n];
                ps1eng = "I " + vnb[v] + nnobles[n];

                ps2 = "tú " + vn2[v] + nnoblesesp[n];
                ps2eng = "you " + vnb[v] + nnobles[n];

                ps3 = "él " + vnb3[v] + nnoblesesp[n];
                ps3eng = "he " + vnb[v] + nnobles[n];

                ps3ella = "ella " + vnb3[v] + nnoblesesp[n];
                ps3she = "she " + vnb[v] + nnobles[n];

                ps3eso = "eso " + vnb3[v] + nnoblesesp[n];
                ps3it = "it " + vnb[v] + nnobles[n];

                ps4 = "ellos " + vn4[v] + nnoblesesp[n];
                ps4eng = "they " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + vn5[v] + nnoblesesp[n];
                ps5eng = "we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v] + nnoblesesp[n];
                ps1eng = "I " + "don't " + vnb[v] + nnobles[n];

                ps2 = "tú " + "no " + vn2[v] + nnoblesesp[n];
                ps2eng = "you " + "don't " + vnb[v] + nnobles[n];

                ps3 = "él " + "no " + vnb3[v] + nnoblesesp[n];
                ps3eng = "he " + "doesn't " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "no " + vnb3[v] + nnoblesesp[n];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "no " + vnb3[v] + nnoblesesp[n];
                ps3it = "it " + "doesn't " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "no " + vn4[v] + nnoblesesp[n];
                ps4eng = "they " + "don't " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "no " + vn5[v] + nnoblesesp[n];
                ps5eng = "we " + "don't " + vnb[v] + nnobles[n];
                break;

        }
    } //neg


    //vnb verbos nobles top 100 in past
    String vnbp[] = {"replaced ", "sent ", "smelled ", "attracted ", "threw ", "acquired ", "incorporated ",
            "organized ", "established ", "approved ", "used ", "enjoyed ", "protected ", "developed ",
            "remembered ", "chose ", "forgot ", "accepted "
    };

    //pasado simple primera persona uno (preterito)
    String ps1pre[] = {"reemplacé ", "envié ", "olí ", "atraje ", "arrojé ", "adquirí ",
            "incorporé ", "organicé ", "establecí ", "aprobé ", "usé ", "disfruté ",
            "protegí ", "desarrollé ", "recordé ", "escogí ", "olvidé ", "acepté "
    };

    //pasado simple primera persona 2 (imperfecto)
    String ps1imp[] = {"reemplazaba ", "enviaba ", "olía ", "atraía ", "arrojaba ", "adquiría ",
            "incorporaba ", "organizaba ", "establecía ", "aprobaba ", "usaba ", "disfrutaba ",
            "protegía ", "desarrollaba ", "recordaba ", "escogía ", "olvidaba ", "aceptaba "
    };

    //pasado simple segunda persona preterito
    String ps2pre[] = {"reemplazaste ", "enviaste ", "oliste ", "atrajiste ", "arrojaste ",
            "adquiriste ", "incorporaste ", "organizaste ", "estableciste ", "aprobaste ", "usaste ",
            "disfrutaste ", "protegiste ", "desarrollaste ", "recordaste ", "escogiste ",
            "olvidaste ", "aceptaste "
    };

    //pasado simple segunda persona imperfecto
    String ps2imp[] = {"reemplazabas ", "enviabas ", "olías ", "atraías ", "arrojabas ", "adquirías ",
            "incorporabas ", "organizabas ", "establecías ", "aprobabas ", "usabas ", "disfrutabas ",
            "protegías ", "desarrollabas ", "recordabas ", "escogías ", "olvidabas ", "aceptabas "
    };

    //pasado simple tercera persona preterito
    String ps3p[] = {"reemplazó ", "envió ", "olió ", "atrajo ", "arrojó ", "adquirió ",
            "incorporó ", "organizó ", "estableció ", "aprobó ", "usó ", "disfrutó ",
            "protegió ", "desarrolló ", "recordó ", "escogió ", "olvidó ", "aceptó "
    };

    //pasado simple tercera persona imperfecto
    String ps3imp[] = {"reemplazaba ", "enviaba ", "olía ", "atraía ", "arrojaba ", "adquiría ",
            "incorporaba ", "organizaba ", "establecía ", "aprobaba ", "usaba ", "disfrutaba ",
            "protegía ", "desarrollaba ", "recordaba ", "escogía ", "olvidaba ", "aceptaba "
    };

    //verbos nobles cuarta persona (ellos) pasado preterito
    String vn4p[] = {"reemplazaron ", "enviaron ", "olieron ", "atrajeron ", "arrojaron ",
            "adquirieron ", "incorporaron ", "organizaron ", "establecieron ", "aprobaron ", "usaron ",
            "disfrutaron ", "protegieron ", "desarrollaron ", "recordaron ", "escogieron ",
            "olvidaron ", "aceptaron "
    };


    //verbos nobles cuarta persona (ellos) pasado imperfecto
    String vn4imp[] = {"reemplazaban ", "enviaban ", "olían ", "atraían ", "arrojaban ",
            "adquirían ", "incorporaban ", "organizaban ", "establecían ", "aprobaban ", "usaban ",
            "disfrutaban ", "protegían ", "desarrollaban ", "recordaban ", "escogían ",
            "olvidaban ", "aceptaban "
    };

    // verbos nosotros pasado preterito
    String vn5p[] = {"reemplazamos ", "enviamos ", "olimos ", "atrajimos ", "arrojamos ",
            "adquirimos ", "incorporamos ", "organizamos ", "establecimos ", "aprobamos ", "usamos ",
            "disfrutamos ", "protegimos ", "desarrollamos ", "recordamos ", "escogimos ", "olvidamos ",
            "aceptamos "
    };

    // verbos nosotros pasado imperfecto
    String vn5imp[] = {"reemplazábamos ", "enviábamos ", "olíamos ", "atraíamos ", "arrojábamos ",
            "adquiríamos ", "incorporábamos ", "organizábamos ", "establecíamos ", "aprobábamos ",
            "usábamos ", "disfrutábamos ", "protegíamos ", "desarrollábamos ", "recordábamos ",
            "escogíamos ", "olvidábamos ", "aceptábamos "
    };

    // pasado simple preterito e imperfecto, aparentemente ya la hice negativo
    public void generarpasadosimp() {

        int sr = (int) (Math.random() * 2);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo " + ps1pre[v] + nnoblesesp[n];
                    ps1eng = "I " + vnbp[v] + nnobles[n];

                    ps2 = "tú " + ps2pre[v] + nnoblesesp[n];
                    ps2eng = "you " + vnbp[v] + nnobles[n];

                    ps3 = "él " + ps3p[v] + nnoblesesp[n];
                    ps3eng = "he " + vnbp[v] + nnobles[n];

                    ps3ella = "ella " + ps3p[v] + nnoblesesp[n];
                    ps3she = "she " + vnbp[v] + nnobles[n];

                    ps3eso = "eso " + ps3p[v] + nnoblesesp[n];
                    ps3it = "it " + vnbp[v] + nnobles[n];

                    ps4 = "ellos " + vn4p[v] + nnoblesesp[n];
                    ps4eng = "they " + vnbp[v] + nnobles[n];

                    ps5 = "nosotros " + vn5p[v] + nnoblesesp[n];
                    ps5eng = "we " + vnbp[v] + nnobles[n];
                } else {
                    ps1 = "yo " + ps1imp[v] + nnoblesesp[n];
                    ps1eng = "I " + vnbp[v] + nnobles[n];

                    ps2 = "tú " + ps2imp[v] + nnoblesesp[n];
                    ps2eng = "you " + vnbp[v] + nnobles[n];

                    ps3 = "él " + ps3imp[v] + nnoblesesp[n];
                    ps3eng = "he " + vnbp[v] + nnobles[n];

                    ps3ella = "ella " + ps3imp[v] + nnoblesesp[n];
                    ps3she = "she " + vnbp[v] + nnobles[n];

                    ps3eso = "eso " + ps3imp[v] + nnoblesesp[n];
                    ps3it = "it " + vnbp[v] + nnobles[n];

                    ps4 = "ellos " + vn4imp[v] + nnoblesesp[n];
                    ps4eng = "they " + vnbp[v] + nnobles[n];

                    ps5 = "nosotros " + vn5imp[v] + nnoblesesp[n];
                    ps5eng = "we " + vnbp[v] + nnobles[n];
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no " + ps1pre[v] + nnoblesesp[n];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n];

                    ps2 = "tú " + "no " + ps2pre[v] + nnoblesesp[n];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n];

                    ps3 = "él " + "no " + ps3p[v] + nnoblesesp[n];
                    ps3eng = "he " + "din't " + vnb[v] + nnobles[n];

                    ps3ella = "ella " + "no " + ps3p[v] + nnoblesesp[n];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n];

                    ps3eso = "eso " + "no " + ps3p[v] + nnoblesesp[n];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n];

                    ps4 = "ellos " + "no " + vn4p[v] + nnoblesesp[n];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n];

                    ps5 = "nosotros " + "no " + vn5p[v] + nnoblesesp[n];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "yo " + "no " + ps1imp[v] + nnoblesesp[n];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n];

                    ps2 = "tú " + "no " + ps2imp[v] + nnoblesesp[n];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n];

                    ps3 = "él " + "no " + ps3imp[v] + nnoblesesp[n];
                    ps3eng = "he " + "didn't " + vnb[v] + nnobles[n];

                    ps3ella = "ella " + "no " + ps3imp[v] + nnoblesesp[n];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n];

                    ps3eso = "eso " + "no " + ps3imp[v] + nnoblesesp[n];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n];

                    ps4 = "ellos " + "no " + vn4imp[v] + nnoblesesp[n];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n];

                    ps5 = "nosotros " + "no " + vn5imp[v] + nnoblesesp[n];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n];
                }
                break;
        }
    }


    //vnb verbos nobles top 100 continuo
    String vnbc[] = {"replacing ", "sending ", "smelling ", "attracting ", "throwing ",
            "acquiring ", "incorporating ", "organizing ", "establishing ", "approving ", "using ",
            "enjoying ", "protecting ", "developing ", "remembering ", "choosing ", "forgetting ",
            "accepting "
    };

    //vnb verbos nobles top 100 continuo spanish
    String vnbcs[] = {"reemplazando ", "enviando ", "oliendo ", "atrayendo ", "arrojando ",
            "adquiriendo ", "incorporando ", "organizando ", "estableciendo ", "aprobando ",
            "usando ", "disfrutando ", "protegiendo ", "desarrollando ", "recordando ", "escogiendo ",
            "olvidando ", "aceptando "};


    //ya estaá en pasado
    public void generarpresentecontinuo() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estoy " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "am " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "are " + vnbc[v] + nnobles[n];

                ps3 = "él " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "is " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "is " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "is " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "están " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "are " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "estamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "are " + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "yo " + "no " + "estoy " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "am " + "not " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "no " + "estás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "are " + "not " + vnbc[v] + nnobles[n];

                ps3 = "él " + "no " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "is " + "not " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "no " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "is " + "not " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "no " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "is " + "not " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "están " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "are not " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "estamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "are not " + vnbc[v] + nnobles[n];
                break;
        }
    }


    //verbos participios inglés
    String vpeng[] = {"replaced ", "sent ", "smelled ", "attracted ", "thrown ", "acquired ",
            "incorporated ", "organized ", "established ", "approved ", "used ", "enjoyed ",
            "protected ", "developed ", "remembered ", "chosen ", "forgotten ",
            "accepted "
    };

    //verbos participios inglés M
    String vpengM[] = {"replaced ", "sent ", "smelled ", "attracted ", "thrown ", "acquired ",
            "incorporated ", "organized ", "established ", "approved ", "used ", "enjoyed ",
            "protected ", "developed ", "remembered ", "chosen ", "forgotten ",
            "accepted "
    };

    //verbos participios inglés F
    String vpengF[] = {"replaced ", "sent ", "smelled ", "attracted ", "thrown ", "acquired ",
            "incorporated ", "organized ", "established ", "approved ", "used ", "enjoyed ",
            "protected ", "developed ", "remembered ", "chosen ", "forgotten ",
            "accepted "
    };

    //vnb verbos participios  spanish
    String vpsp[] = {"reemplazado ", "enviado ", "olido ", "atraído ", "arrojado ", "adquirido ",
            "incorporado ", "organizado ", "establecido ", "aprobado ", "usado ", "disfrutado ",
            "protegido ", "desarrollado ", "recordado ", "escogido ", "olvidado ", "aceptado "
    };

    //vnb verbos participios  spanish M
    String vpspM[] = {"reemplazado ", "enviado ", "olido ", "atraído ", "arrojado ", "adquirido ",
            "incorporado ", "organizado ", "establecido ", "aprobado ", "usado ", "disfrutado ",
            "protegido ", "desarrollado ", "recordado ", "escogido ", "olvidado ", "aceptado "
    };

    //vnb verbos participios  spanish F
    String vpspF[] = {"reemplazada ", "enviada ", "olida ", "atraída ", "arrojada ", "adquirida ",
            "incorporada ", "organizada ", "establecida ", "aprobada ", "usada ", "disfrutada ",
            "protegida ", "desarrollada ", "recordada ", "escogida ", "olvidada ", "aceptada "
    };


    public void generarpresenteperfecto() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "has " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "has " + vpeng[v] + nnobles[n];

                ps3ella = "ella " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "has " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "has " + vpeng[v] + nnobles[n];

                ps4 = "ellos " + "han " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros " + "hemos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "he " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "haven't " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "has " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "haven't " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "hasn't " + vpeng[v] + nnobles[n];

                ps3ella = "ella no " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "hasn't " + vpeng[v] + nnobles[n];

                ps3eso = "eso no " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "hasn't " + vpeng[v] + nnobles[n];

                ps4 = "ellos no " + "han " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "haven't " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no " + "hemos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "haven't " + vpeng[v] + nnobles[n];

                break;
        }


    }  // ya en negativo

    public void generarprsenteperfectocontinuo() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "has estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "has been " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "has been " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "has been " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "han estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "hemos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "have not been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "has estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "have not been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "has not been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "has not been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "has not been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "han estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "have not been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "have not been " + vnbc[v] + nnobles[n];

                break;
        }
    } // ya en negativo

    public void pasadocontinuo() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "was " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estabas " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "were " + vnbc[v] + nnobles[n];

                ps3 = "él " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "was " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "was " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "was " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "estaban " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "were " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "estabamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "were " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "was not " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "estabas " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "were not " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "was not " + vnbc[v] + nnobles[n];

                ps3ella = "ella no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "was not " + vnbc[v] + nnobles[n];

                ps3eso = "eso no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "was not " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "estaban " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "were not " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "estabamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "were not " + vnbc[v] + nnobles[n];
                break;
        }


    } // negativo ya

    public void pasadoperfecto() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habia " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "had " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "habias " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "had " + vpeng[v] + nnobles[n];

                ps3 = "él " + "habia " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "had " + vpeng[v] + nnobles[n];

                ps3ella = "ella " + "habia " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "had " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "habia " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "had " + vpeng[v] + nnobles[n];

                ps4 = "ellos " + "habian " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "had " + vpeng[v] + nnobles[n];

                ps5 = "nosotros " + "habiamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "had " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "habia " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "had not " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "habias " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "had not " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "habia " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "had not " + vpeng[v] + nnobles[n];

                ps3ella = "ella no " + "habia " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "had not " + vpeng[v] + nnobles[n];

                ps3eso = "eso no " + "habia " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "had not " + vpeng[v] + nnobles[n];

                ps4 = "ellos no " + "habian " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "had not " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no " + "habiamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "had not " + vpeng[v] + nnobles[n];

                break;
        }


    } // negativo ya

    public void pasadoperfectocontinuo() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "had been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "had been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "had been " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "had been " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "had been " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "habían estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "had been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "habíamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "had been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "had not been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "had not been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "had not been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "had not been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "had not been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "habían estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "had not been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "had not been " + vnbc[v] + nnobles[n];
                break;
        }

    } // negativo

// hay que hacer aqui abajo los verbos en futuro en sus diferentes personas


    // verbos nobles primera persona futuro
    String vn1f[] = {"reemplazaré ", "enviaré ", "oleré ", "atraeré ", "arrojaré ", "adquiriré ",
            "incorporaré ", "organizaré ", "estableceré ", "aprobaré ", "usaré ", "disfrutaré ",
            "protegeré ", "desarrollaré ", "recordaré ", "escogeré ", "olvidaré ", "aceptaré "
    };

    // verbos nobles segunda persona futuro
    String vn2f[] = {"reemplazarás ", "enviarás ", "olerás ", "atraerás ", "arrojarás ", "adquirirás ",
            "incorporarás ", "organizarás ", "establecerás ", "aprobarás ", "usarás ", "disfrutarás ",
            "protegerás ", "desarrollarás ", "recordarás ", "escogerás ", "olvidarás ", "aceptarás "
    };


    // verbos nobles tercera persona futuro
    String vn3f[] = {"reemplazará ", "enviará ", "olerá ", "atraerá ", "arrojará ", "adquirirá ",
            "incorporará ", "organizará ", "establecerá ", "aprobará ", "usará ", "disfrutará ",
            "protegerá ", "desarrollará ", "recordará ", "escogerá ", "olvidará ", "aceptará "
    };


    // verbos nobles cuarta persona futuro
    String vn4f[] = {"reemplazarán ", "enviarán ", "olerán ", "atraerán ", "arrojarán ", "adquirirán ",
            "incorporarán ", "organizarán ", "establecerán ", "aprobarán ", "usarán ", "disfrutarán ",
            "protegerán ", "desarrollarán ", "recordarán ", "escogerán ", "olvidarán ", "aceptarán "
    };


    // verbos nobles quinta persona futuro
    String vn5f[] = {"reemplazaremos ", "enviaremos ", "oleremos ", "atraeremos ", "arrojaremos ",
            "adquiriremos ", "incorporaremos ", "organizaremos ", "estableceremos ", "aprobaremos ",
            "usaremos ", "disfrutaremos ", "protegeremos ", "desarrollaremos ", "recordaremos ",
            "escogeremos ", "olvidaremos ", "aceptaremos "
    };


    public void futurosimple() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1f[v] + nnoblesesp[n];
                ps1eng = "I " + "will " + vnb[v] + nnobles[n];

                ps2 = "tú " + vn2f[v] + nnoblesesp[n];
                ps2eng = "you " + "will " + vnb[v] + nnobles[n];

                ps3 = "él " + vn3f[v] + nnoblesesp[n];
                ps3eng = "he " + "will " + vnb[v] + nnobles[n];

                ps3ella = "ella " + vn3f[v] + nnoblesesp[n];
                ps3she = "she " + "will " + vnb[v] + nnobles[n];

                ps3eso = "eso " + vn3f[v] + nnoblesesp[n];
                ps3it = "it " + "will " + vnb[v] + nnobles[n];

                ps4 = "ellos " + vn4f[v] + nnoblesesp[n];
                ps4eng = "they " + "will " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + vn5f[v] + nnoblesesp[n];
                ps5eng = "we " + "will " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + vn1f[v] + nnoblesesp[n];
                ps1eng = "I " + "won't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + vn2f[v] + nnoblesesp[n];
                ps2eng = "you " + "won't " + vnb[v] + nnobles[n];

                ps3 = "él no " + vn3f[v] + nnoblesesp[n];
                ps3eng = "he " + "won't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + vn3f[v] + nnoblesesp[n];
                ps3she = "she " + "won't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + vn3f[v] + nnoblesesp[n];
                ps3it = "it " + "won't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + vn4f[v] + nnoblesesp[n];
                ps4eng = "they " + "won't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + vn5f[v] + nnoblesesp[n];
                ps5eng = "we " + "won't " + vnb[v] + nnobles[n];
                break;
        }
    } // neg

    public void futurocont() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaré " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "will " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estarás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "will " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "estará " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "will be " + vnbc[v] + nnobles[n];

                ps3ella = "ella estará " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "will be " + vnbc[v] + nnobles[n];

                ps3eso = "eso estará " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "will be " + vnbc[v] + nnobles[n];

                ps4 = "ellos estarán " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "will be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros estarémos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "will be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "won't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "estarás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "won't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "estará " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "won't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no estará " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "won't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no estará " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "won't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no estarán " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "won't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no estarémos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "won't be " + vnbc[v] + nnobles[n];
                break;
        }

    } // neg

    public void futuroperf() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "will have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "habrás " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "will have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "habrá " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "will have " + vpeng[v] + nnobles[n];

                ps3ella = "ella habrá " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "will have " + vpeng[v] + nnobles[n];

                ps3eso = "eso habrá " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "will have " + vpeng[v] + nnobles[n];

                ps4 = "ellos habrán " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "will have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros habrémos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "will have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "won't have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "habrás " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "won't have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "habrá " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "won't have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no habrá " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "won't have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no habrá " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "won't have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no habrán " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "won't have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no habrémos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "won't have " + vpeng[v] + nnobles[n];

                break;
        }

    }  // neg

    public void futuroperfcont() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "will have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "habrás estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "will have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "will have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "will have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "will have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos habrán estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "will have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros habrémos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "will have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "won't have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "habrás estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "won't have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "won't have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "won't have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "won't have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no habrán estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "won't have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no habrémos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "won't have been " + vnbc[v] + nnobles[n];
                break;
        }


    } // neg

    // aqui abajo van los modales
    // verbos nobles primera persona would
    String vn1w[] = {"reemplazaría ", "enviaría ", "olería ", "atraería ", "arrojaría ",
            "adquiriría ", "incorporaría ", "organizaría ", "establecería ", "aprobaría ",
            "usaría ", "disfrutaría ", "protegería ", "desarrollaría ", "recordaría ",
            "escogería ", "olvidaría ", "aceptaría "
    };


    // verbos nobles segunda persona would
    String vn2w[] = {"reemplazarías ", "enviarías ", "olerías ", "atraerías ", "arrojarías ",
            "adquirirías ", "incorporarías ", "organizarías ", "establecerías ", "aprobarías ",
            "usarías ", "disfrutarías ", "protegerías ", "desarrollarías ", "recordarías ",
            "escogerías ", "olvidarías ", "aceptarías "
    };


    // verbos nobles tercera persona would
    String vn3w[] = {"reemplazaría ", "enviaría ", "olería ", "atraería ", "arrojaría ",
            "adquiriría ", "incorporaría ", "organizaría ", "establecería ", "aprobaría ",
            "usaría ", "disfrutaría ", "protegería ", "desarrollaría ", "recordaría ",
            "escogería ", "olvidaría ", "aceptaría "
    };


    // verbos nobles cuarta persona would
    String vn4w[] = {"reemplazarían ", "enviarían ", "olerían ", "atraerían ", "arrojarían ",
            "adquirirían ", "incorporarían ", "organizarían ", "establecerían ", "aprobarían ",
            "usarían ", "disfrutarían ", "protegerían ", "desarrollarían ", "recordarían ",
            "escogerían ", "olvidarían ", "aceptarían "
    };


    // verbos nobles quinta persona would
    String vn5w[] = {"reemplazaríamos ", "enviaríamos ", "oleríamos ", "atraeríamos ", "arrojaríamos ",
            "adquiriríamos ", "incorporaríamos ", "organizaríamos ", "estableceríamos ", "aprobaríamos ",
            "usaríamos ", "disfrutaríamos ", "protegeríamos ", "desarrollaríamos ", "recordaríamos ",
            "escogeríamos ", "olvidaríamos ", "aceptaríamos "
    };


    // aqui estan los del would
    public void generarwouldsimple() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1w[v] + nnoblesesp[n];
                ps1eng = "I " + "would " + vnb[v] + nnobles[n];

                ps2 = "tú " + vn2w[v] + nnoblesesp[n];
                ps2eng = "you " + "would " + vnb[v] + nnobles[n];

                ps3 = "él " + vn3w[v] + nnoblesesp[n];
                ps3eng = "he " + "would " + vnb[v] + nnobles[n];

                ps3ella = "ella " + vn3w[v] + nnoblesesp[n];
                ps3she = "she " + "would " + vnb[v] + nnobles[n];

                ps3eso = "eso " + vn3w[v] + nnoblesesp[n];
                ps3it = "it " + "would " + vnb[v] + nnobles[n];

                ps4 = "ellos " + vn4w[v] + nnoblesesp[n];
                ps4eng = "they " + "would " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + vn5w[v] + nnoblesesp[n];
                ps5eng = "we " + "would " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + vn1w[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + vn2w[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't " + vnb[v] + nnobles[n];

                ps3 = "él no " + vn3w[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + vn3w[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + vn3w[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + vn4w[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + vn5w[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't " + vnb[v] + nnobles[n];
                break;
        }
    }  // neg

    public void generarwouldcont() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "would " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estarías " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "would " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "would be " + vnbc[v] + nnobles[n];

                ps3ella = "ella estaría " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "would be " + vnbc[v] + nnobles[n];

                ps3eso = "eso estaría " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "would be " + vnbc[v] + nnobles[n];

                ps4 = "ellos estaría " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "would be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros estaríamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "would be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "estarías " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no estaría " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no estaría " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no estarían " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no estaríamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't be " + vnbc[v] + nnobles[n];
                break;
        }
    }  // neg

    public void genwouldperf() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "would have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "would have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "would have " + vpeng[v] + nnobles[n];

                ps3ella = "ella hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "would have " + vpeng[v] + nnobles[n];

                ps3eso = "eso hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "would have " + vpeng[v] + nnobles[n];

                ps4 = "ellos hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "would have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "would have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't have " + vpeng[v] + nnobles[n];
                break;
        }
    }  // neg

    public void genwouldperfcon() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "would have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "hubieras estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "would have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "would have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "would have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "would have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos hubieran estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "would have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros hubieramos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "would have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "hubieras estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no hubieran estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no hubieramos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't have been " + vnbc[v] + nnobles[n];
                break;
        }

    } // neg

    // aqui estan los del could
    public void gencouldsimp() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "podría " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "could " + vnb[v] + nnobles[n];

                ps2 = "tú " + "podrías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "could " + vnb[v] + nnobles[n];

                ps3 = "él " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "could " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "could " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "could " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "podrían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "could " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "podríamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "could " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "podrías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't " + vnb[v] + nnobles[n];

                ps3 = "él no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "podrían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "podríamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't " + vnb[v] + nnobles[n];
                break;
        }
    } // neg

    public void generarcouldcont() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "could " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "podrías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "could " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "could be " + vnbc[v] + nnobles[n];

                ps3ella = "ella podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "could be " + vnbc[v] + nnobles[n];

                ps3eso = "eso podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "could be " + vnbc[v] + nnobles[n];

                ps4 = "ellos podrían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "could be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros podríamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "could be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "podrías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no podrían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no podríamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't be " + vnbc[v] + nnobles[n];
                break;
        }
    } // neg

    public void gencouldperf() {
        switch (neg) {

            case 0:
                ps1 = "yo " + "pude haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "could have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "pudiste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "could have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "could have " + vpeng[v] + nnobles[n];

                ps3ella = "ella pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "could have " + vpeng[v] + nnobles[n];

                ps3eso = "eso pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "could have " + vpeng[v] + nnobles[n];

                ps4 = "ellos pudieron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "could have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros pudimos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "could have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "pude haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "pudiste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no pudieron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no pudimos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't have " + vpeng[v] + nnobles[n];

                break;
        }

    }  // neg

    public void gencouldperfcont() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "pude haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "could have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "could have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "could have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "could have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "could have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos pudieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "could have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "could have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no pudieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't have been " + vnbc[v] + nnobles[n];
                break;
        }

    }  // neg

    // aqui van los del should
    public void genshoudlsimp() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debería " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "should " + vnb[v] + nnobles[n];

                ps2 = "tú " + "deberías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "should " + vnb[v] + nnobles[n];

                ps3 = "él " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "should " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "should " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "should " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "deberían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "should " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "deberíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "should " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "should not " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "deberías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "should not " + vnb[v] + nnobles[n];

                ps3 = "él no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "should not " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "should not " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "should not " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "deberían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "should not " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "deberíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "should not " + vnb[v] + nnobles[n];
                break;
        }
    }  // neg

    public void genshouldcont() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "should " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "deberías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "should " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "should be " + vnbc[v] + nnobles[n];

                ps3ella = "ella debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "should be " + vnbc[v] + nnobles[n];

                ps3eso = "eso debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "should be " + vnbc[v] + nnobles[n];

                ps4 = "ellos deberían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "should be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros deberíamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "should be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "should not " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "deberías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "should not " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "should not be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "should not be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "should not be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no deberían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "should not be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no deberíamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "should not be " + vnbc[v] + nnobles[n];
                break;
        }
    } // neg

    public void genshouldper() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "should have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "debíste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "should have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "should have " + vpeng[v] + nnobles[n];

                ps3ella = "ella debío haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "should have " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "should have " + vpeng[v] + nnobles[n];

                ps4 = "ellos debíeron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "should have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros debímos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "should have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debí haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "should not have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "debíste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "should not have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "should not have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no debío haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "should not have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "should not have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no debíeron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "should not have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no debímos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "should not have " + vpeng[v] + nnobles[n];
                break;
        }
    } // neg

    public void genshouldperfcont() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "should have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "should have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "should have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "should have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "should have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos debieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "should have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "should have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "should not have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "should not have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "should not have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "should not have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "should not have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no debieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "should not have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "should not have been " + vnbc[v] + nnobles[n];
                break;
        }


    } // neg

// aqui van los del might

    //vnb verbos nobles top 100  primera persona  y tercera, esp subjuntivos
    String vn1y3subj[] = {"reemplace ", "envíe ", "huela ", "atraiga ", "arroje ", "adquiera ",
            "incorpore ", "organice ", "establezca ", "apruebe ", "use ", "disfrute ", "proteja ",
            "desarrolle ", "recuerde ", "escoja ", "olvide ", "acepte "
    };

    // verbos nobles segunda persona subjuntivo
    String vn2subj[] = {"reemplaces ", "envíes ", "huelas ", "atraigas ", "arrojes ", "adquieras ",
            "incorpores ", "organices ", "establezcas ", "apruebes ", "uses ", "disfrutes ",
            "protejas ", "desarrolles ", "recuerdes ", "escojas ", "olvides ", "aceptes "
    };

    //vnb verbos nobles top 100  cuarta persona esp subjuntivos
    String vn4subj[] = {"reemplacen ", "envíen ", "huelan ", "atraigan ", "arrojen ", "adquieran ",
            "incorporen ", "organicen ", "establezcan ", "aprueben ", "usen ", "disfruten ",
            "protejan ", "desarrollen ", "recuerden ", "escojan ", "olviden ", "acepten "
    };

    //vnb verbos nobles nosotros subjuntivo
    String vn5subj[] = {"reemplacemos ", "enviemos ", "olamos ", "atraigamos ", "arrojemos ",
            "adquiramos ", "incorporemos ", "organicemos ", "establezcamos ", "aprobemos ",
            "usemos ", "disfrutemos ", "protejamos ", "desarrollemos ", "recordemos ", "escojamos ",
            "olvidemos ", "aceptemos "
    };

    // los del might
    public void genmightsimp() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = "I " + "might " + vnb[v] + nnobles[n];

                ps2 = "tú " + "quiza " + vn2subj[v] + nnoblesesp[n];
                ps2eng = "you " + "might " + vnb[v] + nnobles[n];

                ps3 = "él " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = "he " + "might " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps3she = "she " + "might " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps3it = "it " + "might " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "quiza " + vn4subj[v] + nnoblesesp[n];
                ps4eng = "they " + "might " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "quiza " + vn5subj[v] + nnoblesesp[n];
                ps5eng = "we " + "might " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = "I " + "might not " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "quiza " + vn2subj[v] + nnoblesesp[n];
                ps2eng = "you " + "might not " + vnb[v] + nnobles[n];

                ps3 = "él no " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = "he " + "might not " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps3she = "she " + "might not " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "quiza " + vn1y3subj[v] + nnoblesesp[n];
                ps3it = "it " + "might not " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "quiza " + vn4subj[v] + nnoblesesp[n];
                ps4eng = "they " + "might not " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "quiza " + vn5subj[v] + nnoblesesp[n];
                ps5eng = "we " + "might not " + vnb[v] + nnobles[n];
                break;
        }
    }  // neg

    public void genmightcont() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "quiza esté " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quiza estés " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quiza esté " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might be " + vnbc[v] + nnobles[n];

                ps3ella = "ella quiza esté " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might be " + vnbc[v] + nnobles[n];

                ps3eso = "eso quiza esté " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might be " + vnbc[v] + nnobles[n];

                ps4 = "ellos quiza estén " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros quiza estemos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "quiza no esté " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might not " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quiza no estés " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might not " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quiza no esté " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might not be " + vnbc[v] + nnobles[n];

                ps3ella = "ella quiza no esté " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might not be " + vnbc[v] + nnobles[n];

                ps3eso = "eso quiza no esté " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might not be " + vnbc[v] + nnobles[n];

                ps4 = "ellos quiza no estén " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might not be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros quiza no estemos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might not be " + vnbc[v] + nnobles[n];
                break;
        }
    } // neg

    public void genmightperf() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "quiza haya " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "might have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "quiza hayas " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "might have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "quiza haya " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "might have " + vpeng[v] + nnobles[n];

                ps3ella = "ella quiza haya " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "might have " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "quiza haya " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "might have " + vpeng[v] + nnobles[n];

                ps4 = "ellos quiza hayan " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "might have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros quiza hayamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "might have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "quiza no haya " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "might not have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "quiza no hayas " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "might not have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "quiza no haya " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "might not have " + vpeng[v] + nnobles[n];

                ps3ella = "ella quiza no haya " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "might not have " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "quiza no haya " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "might not have " + vpeng[v] + nnobles[n];

                ps4 = "ellos quiza no hayan " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "might not have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros quiza no hayamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "might not have " + vpeng[v] + nnobles[n];
                break;
        }
    } // neg

    public void genmightperfcont() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "quiza haya estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quiza hayas estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quiza haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella quiza haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso quiza haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos quiza hayan estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "quiza hayamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "quiza no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might not have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quiza no hayas estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might not have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quiza no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might not have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella quiza no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might not have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso quiza no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might not have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos quiza no hayan estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might not have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "quiza no hayamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might not have been " + vnbc[v] + nnobles[n];
                break;
        }


    } // neg

    // aqui van los del can
    public void gencansimp() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "can " + vnb[v] + nnobles[n];

                ps2 = "tú " + "puedes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "can " + vnb[v] + nnobles[n];

                ps3 = "él " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "can " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "can " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "can " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "pueden " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "can " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "podemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "can " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "puedo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "can't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "puedes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "can't " + vnb[v] + nnobles[n];

                ps3 = "él no " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "can't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "can't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "can't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "pueden " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "can't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "podemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "can't  " + vnb[v] + nnobles[n];
                break;
        }

    }  //neg

    public void gencancont() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "can " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "puedes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "can " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "can be " + vnbc[v] + nnobles[n];

                ps3ella = "ella puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "can be " + vnbc[v] + nnobles[n];

                ps3eso = "eso puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "can be " + vnbc[v] + nnobles[n];

                ps4 = "ellos pueden estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "can be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros podemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "can be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "puedo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "can't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "puedes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "can't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "can't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "can't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "can't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos pueden estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "can't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros podemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "can't be " + vnbc[v] + nnobles[n];
                break;
        }

    }       // neg

    // los del must
    public void genmustsimp() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "must " + vnb[v] + nnobles[n];

                ps2 = "tú " + "debes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "must " + vnb[v] + nnobles[n];

                ps3 = "él " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "must " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "must " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "must " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "deben " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "must " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "debemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "must " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "must not " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "debes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "must not " + vnb[v] + nnobles[n];

                ps3 = "él no " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "must not " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "must not " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "must no " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "deben " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "must not " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "debemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "must not " + vnb[v] + nnobles[n];

                break;
        }
    }  // neg

    public void genmustcont() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "must " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "debes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "must " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "must be " + vnbc[v] + nnobles[n];

                ps3ella = "ella debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "must be " + vnbc[v] + nnobles[n];

                ps3eso = "eso debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "must be " + vnbc[v] + nnobles[n];

                ps4 = "ellos deben estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "must be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros debemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "must be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "must not " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "debes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "must not " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "must not be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "must not be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "must not be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no deben estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "must not be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no debemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "must not be " + vnbc[v] + nnobles[n];

                break;
        }
    } // neg

    // Supposed to DIF 1
    // se supone que tiene que pasar cases 2 y 3
    // se supone que va a pasar cases 4 y 5

    //int vc= (int)(Math.random()*6);

    //--------------------------------------------------------
    //with,at,during,until,in,on, by,without,near,around
    //aqui abajo empieza el boton dificultad tres, estos prnombres
    //de arriba son mas o menos los que le quedan a todos los nobles
    //hay que hacer una lista de frases preposicionales que queden bien
    //con cada uno de los diferentes tipo de verbos, para no solo agregar
    //adverbios de frequencia o manera, también las frases
    //preposicionales , incluso tal vez para dif 4
//these should go right after the subject
    String advfrequ[] = {"siempre ", "constantemente ", "frecuentemente ",
            "generalmente ",
            "normalmente ", "ocacionalmente ", "seguido ", "raramente ",
            "regularmente ",
            "regularmente ", "usualmente ", "felizmente ", "temprano ", "tarde ", "diariamente ",
            "perfectamente ", "facilmente ", "cuidadosamente ", "abiertamente ",
            "finalmente ", "peligrosamente ", "desesperadamente ", "ocasionalmente ",
            "seguido ", "calmadamente "
    };
    String frequadv[] = {"always ", "constantly ", "frequently ", "generally ",

            "normally ", "occasionally ", "often ", "rarely ", "regularly ",
            "regularly ",
            "usually ", "happily ", "early ", "late ", "daily ",
            "perfectly ", "easily ", "carefully ",
            "openly ", "finally ", "dangerouslly ", "desperately ",
            "occasionally ", "often ", "calmly "
    };

// eliminated seldom , better, sometimes, infrequentemente

    // ya está en negativo
    int r = (int) (Math.random() * advfrequ.length);
    int negg = (int) (Math.random() * 2);

    // presentes dificultad 3 nobles, abstractos, oo,people
    public void generarnoblespresentesimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo " + vn1[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + vnb[v] + nnobles[n] + frequadv[r];

                ps2 = "tú " + vn2[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + vnb[v] + nnobles[n] + frequadv[r];

                ps3 = "él " + vnb3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + vnb[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella " + vnb3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + vnb[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso " + vnb3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + vnb[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos " + vn4[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros " + vn5[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                ps2 = "tú " + "no " + vn2[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3 = "él " + "no " + vnb3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella " + "no " + vnb3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso " + "no " + vnb3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos " + "no " + vn4[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros " + "no " + vn5[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                break;


        }

    }
    public void GenNoblePresContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estoy " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I am "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I am " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you are "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you are " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he is "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he is " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she is "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she is " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it is "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it is " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "están " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they are "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they are " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "estamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we are "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we are " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estoy " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I'm not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I'm not " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "estás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you're not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you're not " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he's not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he's not " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she's not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she's not " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it's not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it's not " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no " + "están " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they're not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they're not " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "estamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we're not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we're not " + vnbc[v] + nnobles[n] + frequadv[r];

                break;

        }

    }
    public void GenNoblePresPerfDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "he " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "has " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he has "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he has " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she has "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she has " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it has "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it has " + vpeng[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "han " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "hemos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:

                ps1 = "yo no " + "he " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I haven't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "has " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you haven't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he hasn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he hasn't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she hasn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she hasn't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it hasn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it hasn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "han " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they haven't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "hemos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we haven't " + vpeng[v] + nnobles[n] + frequadv[r];

                break;

        }

    }
    public void GenPresPerfContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "he estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "has estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "ha estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he has "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he has " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she has "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "she has " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it has "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "he has " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "han estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "hemos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "has estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "ha estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he hasn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he hasn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she hasn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she hasn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it hasn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it hasn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no " + "han estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                break;
        }

    }

    //pasados
    public void GenPastSimpleDif3() {
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo "  + ps1pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps1eng2 = "I " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps2 = "tú "  + ps2pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps2eng2 = "you " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps3 = "él "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3eng2 = "he " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3ella = "ella "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3eso = "eso "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps4 = "ellos "  + vn4p[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps5 = "nosotros "  + vn5p[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + frequadv[r];

                } else {
                    ps1 = "yo "  + ps1imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps2 = "tú "  + ps2imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps3 = "él "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3eng = "he " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3ella = "ella "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she "  + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3eso = "eso "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it "  + vnbp[v] + nnobles[n] + frequadv[r];

                    ps4 = "ellos "  + vn4imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they "  + vnbp[v] + nnobles[n] + frequadv[r];

                    ps5 = "nosotros "  + vn5imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we "  + vnbp[v] + nnobles[n] + frequadv[r];
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no "  + ps1pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps2 = "tú " + "no "  + ps2pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps3 = "él " + "no "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he " + "din't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps3ella = "ella " + "no "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps3eso = "eso " + "no "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps4 = "ellos " + "no "  + vn4p[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps5 = "nosotros " + "no "  + vn5p[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                } else {
                    ps1 = "yo " + "no "  + ps1imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps1eng2 = "I " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps2 = "tú " + "no "  + ps2imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps2eng2 = "you " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps3 = "él " + "no "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps3eng2 = "he " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps3ella = "ella " + "no "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps3she2 = "she " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps3eso = "eso " + "no "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps3iteng2 = "it " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps4 = "ellos " + "no "  + vn4imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps4eng2 = "they " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps5 = "nosotros " + "no "  + vn5imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps5eng2 = "we " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];

                }
                break;
        }
    }
    public void GenNoblePastContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I was " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estabas " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you were "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you were " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he was " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she was " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it was " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "estaban " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they were "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they were " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "estábamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we were "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we were " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "estabas " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you weren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you weren't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "estaban " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they weren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they weren't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "estábamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we weren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we weren't " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenNoblePastPerfDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "habías " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "habían " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "habíamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we had " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I had not "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I had not " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "habías " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you had not "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you had not " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he had not "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he had not " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she had not "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she had not " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it had not "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it had not " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "habían " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they had not "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they had not " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "habíamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we had not "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we had not " + vpeng[v] + nnobles[n] + frequadv[r];

                break;


        }

    }
    public void GenPastPerfContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "habías estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "había estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "habían estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I had not "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I had not " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "habías estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you had not "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you had not " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "había estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he had not "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he had not " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she had not "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she had not " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it had not "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it had not " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no " + "habían estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they had not "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they had not " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we had not "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we had not " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //futuros
    public void GenerarNoblesFuturoSimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + vn1f[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + vn2f[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + vn3f[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + vn3f[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + vn3f[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + vn4f[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + vn5f[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no " + vn2f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no " + vn3f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no " + vn3f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no " + vn3f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no " + vn4f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no " + vn5f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "won't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenNobleFutureContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaré " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estarás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "estarán " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "estaremos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "estarás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "estarán " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "estaremos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenNobleFuturePerfDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "habré " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "habrás " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "habrán " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "habremos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "habrás " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "habrán " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "habremos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenFuturePerfContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "habré estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "habrás estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "habrán estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "habremos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "habrás estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "habrán estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "habremos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //would
    public void GenerarNoblesWouldSimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + vn1w[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + vn2w[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + vn3w[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would " + vnb[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + vn3w[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would " + vnb[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + vn3w[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would " + vnb[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + vn4w[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + vn5w[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng = "we would " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no " + vn2w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no " + vn3w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no " + vn3w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no " + vn3w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no " + vn4w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no " + vn5w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleWouldContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estarías " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "estarían " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "estaríamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "estarías " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "estarían " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "estaríamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleWouldPerfDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng = "you wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng = "we wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleWouldPerfContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "hubieras estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "hubiera estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "hubieran estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "hubieramos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "hubieras estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "hubiera estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "hubieran estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "hubieramos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //could
    public void GenerarNoblesCouldSimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I could " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú podrias " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you could " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he could " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she could " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it could " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos podrian " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they could " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podriamos " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we could " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no podrias " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no podria " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no podrian " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no podriamos " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleCouldContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú podrías "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos podrían "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podríamos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no podrías " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no podrían " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no podríamos " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleCouldPerfDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo pude " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú pudiste " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos pudieron " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros pudimos  " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no pude " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no pudiste " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él no pudo " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no pudo " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no pudo " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no pudieron " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no pudimos " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenCouldPerfContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "we couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "we couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "they couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "they couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //should
    public void GenerarNoblesShouldSimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú deberías "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deberían "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros deberíamos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should " + vnb[v] + nnobles[n] + frequadv[r];
                break;
            case 1:
                ps1 = "yo " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps2 = "tú " + "no deberías " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3 = "él " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos " + "no deberían " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros " + "no deberíamos " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];
                break;
        }
    }
    public void GenNobleShouldContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú deberías "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deberían "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros deberíamos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no deberías " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no deberían " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no deberíamos " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleShouldPerfDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo debí "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú debiste "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él debió "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debió "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debió "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos debieron "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros debimos  "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no debí " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no debiste " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no debió " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no debió " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no debió " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no debieron " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no debimos " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenShouldPerfContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "debí haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "debiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "debieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "debimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "debieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //might
    public void GenerarNoblesMightSimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I might " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá " + vn2subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you might " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he might " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she might " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it might " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá " + vn4subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they might " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá " + vn5subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we might " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "quizá no " + vn2subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "quizá no " + vn4subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "quizá no " + vn5subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "might not " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleMightContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá "  + "estés " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá "  + "estén " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá "  + "estemos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú quizá no "  + "estés " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá no "  + "estén " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá no "  + "estemos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleMightPerfDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá "  + "hayas " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she = "she might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá "  + "hayan " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng = "they might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá  "  + "hayamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng = "we might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                break;
            case 1:
                ps1 = "yo quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá no "  + "hayas " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá no "  + "hayan " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá no "  + "hayamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                break;
        }
    }
    public void GenNobleMightPerfContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá "  + "hayas estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá "  + "hayan estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;

            case 1:
                ps1 = "yo quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá no "  + "hayas estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá no "  + "hayan estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá no "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    // can y must simp y cont
    public void GenerarNoblesCanSimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I can " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú puedes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you can " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he can " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she can " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it can " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos pueden "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they can " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng = "we can " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no puedo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no puedes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no pueden "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no podemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "can't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenNobleCanContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenerarNoblesMustSimple3() {
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I must " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú debes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you must " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he must " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she must " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it must " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deben "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they must " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros debemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we must " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no debo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I " + "must not "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "must not " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no debes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you " + "must not "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "must not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he " + "must not "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "must not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she " + "must not "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "must not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it " + "must not "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "must not " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no deben "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they " + "must not "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "must not " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no debemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we " + "must not "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "must not " + vnb[v] + nnobles[n] + frequadv[r];
                break;
        }
    }
    public void GenNobleMustContDif3() {
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I must not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I must not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you must not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you must not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he must not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he must not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she must not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she must not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it must not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it must not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they must not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they must not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we must not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we must not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }


    //want to dificultad 2
    public void WantYouTo2() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he want ", "she want ", "it want ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you doesn't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we doesn't want ", "they doesn't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "eso no quiere ", "ella no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1 = wtsjs[0] + wtobj1s[rn1] + nnoblesesp[n];
                ps1eng = wtsj[0] + wtobj1[rn1] + nnobles[n];

                ps2 = wtsjs[1] + wtobj2s[rn1] + nnoblesesp[n];
                ps2eng = wtsj[1] + wtobj2[rn1] + nnobles[n];

                ps3 = wtsjs[2] + wtobj3s[rn1] + nnoblesesp[n];
                ps3eng = wtsj[2] + wtobj3[rn1] + nnobles[n];

                ps3ella = wtsjs[3] + wtobj4s[rn1] + nnoblesesp[n];
                ps3she = wtsj[3] + wtobj4[rn1] + nnobles[n];

                ps3eso = wtsjs[4] + wtobj5s[rn1] + nnoblesesp[n];
                ps3it = wtsj[4] + wtobj5[rn1] + nnobles[n];

                ps4 = wtsjs[6] + wtobj6s[rn2] + nnoblesesp[n];
                ps4eng = wtsj[6] + wtobj6[rn2] + nnobles[n];

                ps5 = wtsjs[5] + wtobj7s[rn1] + nnoblesesp[n];
                ps5eng = wtsj[5] + wtobj7[rn1] + nnobles[n];
                break;
            case 1:
                ps1 = wtsjsn[0] + wtobj1s[rn1] + nnoblesesp[n];
                ps1eng = wtsjn[0] + wtobj1[rn1] + nnobles[n];

                ps2 = wtsjsn[1] + wtobj2s[rn1] + nnoblesesp[n];
                ps2eng = wtsjn[1] + wtobj2[rn1] + nnobles[n];

                ps3 = wtsjsn[2] + wtobj3s[rn1] + nnoblesesp[n];
                ps3eng = wtsjn[2] + wtobj3[rn1] + nnobles[n];

                ps3ella = wtsjsn[3] + wtobj4s[rn1] + nnoblesesp[n];
                ps3she = wtsjn[3] + wtobj4[rn1] + nnobles[n];

                ps3eso = wtsjsn[4] + wtobj5s[rn1] + nnoblesesp[n];
                ps3it = wtsjn[4] + wtobj5[rn1] + nnobles[n];

                ps4 = wtsjsn[6] + wtobj6s[rn2] + nnoblesesp[n];
                ps4eng = wtsjn[6] + wtobj6[rn2] + nnobles[n];

                ps5 = wtsjsn[5] + wtobj7s[rn1] + nnoblesesp[n];
                ps5eng = wtsjn[5] + wtobj7[rn1] + nnobles[n];
                break;
        }
    }

    //for to dificultad 2
    public void ForSubTo2() {
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1 = ftsjs[0] + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = ftsj[0] + vnb[v] + nnobles[n];

                ps2 = ftsjs[1] + vn2subj[v] + nnoblesesp[n];
                ps2eng = ftsj[1] + vnb[v] + nnobles[n];

                ps3 = ftsjs[2] + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = ftsj[2] + vnb[v] + nnobles[n];

                ps3ella = ftsjs[3] + vn1y3subj[v] + nnoblesesp[n];
                ps3she = ftsj[3] + vnb[v] + nnobles[n];

                ps3eso = ftsjs[4] + vn1y3subj[v] + nnoblesesp[n];
                ps3it = ftsj[4] + vnb[v] + nnobles[n];

                ps4 = ftsjs[5] + vn4subj[v] + nnoblesesp[n];
                ps4eng = ftsj[5] + vnb[v] + nnobles[n];

                ps5 = ftsjs[6] + vn5subj[v] + nnoblesesp[n];
                ps5eng = ftsj[6] + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = ftsjsn[0] + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = ftsjn[0] + vnb[v] + nnobles[n];

                ps2 = ftsjsn[1] + vn2subj[v] + nnoblesesp[n];
                ps2eng = ftsjn[1] + vnb[v] + nnobles[n];

                ps3 = ftsjsn[2] + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = ftsjn[2] + vnb[v] + nnobles[n];

                ps3ella = ftsjsn[3] + vn1y3subj[v] + nnoblesesp[n];
                ps3she = ftsjn[3] + vnb[v] + nnobles[n];

                ps3eso = ftsjsn[4] + vn1y3subj[v] + nnoblesesp[n];
                ps3it = ftsjn[4] + vnb[v] + nnobles[n];

                ps4 = ftsjsn[5] + vn4subj[v] + nnoblesesp[n];
                ps4eng = ftsjn[5] + vnb[v] + nnobles[n];

                ps5 = ftsjsn[6] + vn5subj[v] + nnoblesesp[n];
                ps5eng = ftsjn[6] + vnb[v] + nnobles[n];
                break;
        }
    }

    //there be Simple
    public void ThereBe2(){
        Intrans2 it = new Intrans2();

        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there is ","there are ",
        };

        //subject in spanish
        String tbsjs[] = {
                "hay ", "hay ",
        };

        //subject in eng negative
        String tbsjn[] = {
                "there is no ","there are no ",
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no hay ", "no hay ",
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + "to " + nnobles[n];

                ps2 = tbsjs[1] + it.poms[rnpome] + "para " + nnoblesesp[n];
                ps2eng = tbsj[1] + it.pome[rnpome] + "to " + nnobles[n];


                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + "to " + nnobles[n];

                ps2 = tbsjsn[1] + it.poms[rnpome] + "para " + nnoblesesp[n];
                ps2eng = tbsjn[1] + it.pome[rnpome] + "to " + nnobles[n];


                break;
        }

    }//PD 04/04/2022

    //there be pasado
    public void ThereBePast2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there was ","there were "
        };

        //subject in spanish
        String tbsjs[] = {
                "había ","había "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there was no ","there were no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no había ","no había "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }


    }//PD 04/04/2022

    //there be past perf
    public void ThereBePastPerf2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there has to be ","there have to be "
        };

        //subject in spanish
        String tbsjs[] = {
                "tiene que haber ","tiene que haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there has to be no ","there have to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no tiene que haber ","no tiene que haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }
    }//PD 04/04/2022

    //there be Continous
    public void ThereBeContinuous2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there is going to be ","there are going to be "
        };

        //subject in spanish
        String tbsjs[] = {
                "va a haber ","van a haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there is going to be no ","there are going to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no va a haber ","no van a haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }
    }//PD 05/04/2022

    //there be Past Continous
    public void ThereBePastContinuous2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there was going to be ","there were going to be  "
        };

        //subject in spanish
        String tbsjs[] = {
                "iba a haber ","iban a haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there was going to be no ","there were going to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no iba a haber ","no iban a haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }
    }//PD 05/04/2022

    //there be Could
    public void ThereCouldBe2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there could be "
        };

        //subject in spanish
        String tbsjs[] = {
                "podría haber ","podrían haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there could be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no podría haber ","no podrían haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 05/04/2022

    //there be Should
    public void ThereShouldBe2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there should be "
        };

        //subject in spanish
        String tbsjs[] = {
                "debería haber ","deberían haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there should be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no debería haber ","no deberían haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 06/04/2022

    //there be Would
    public void ThereWouldBe2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there would be "
        };

        //subject in spanish
        String tbsjs[] = {
                "habría ","habrían "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there would be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no habría ","no habrían "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 06/04/2022

    //there be Will
    public void ThereWillBe2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there will be "
        };

        //subject in spanish
        String tbsjs[] = {
                "habrá ","habrán "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there will be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no habrá ","no habrán "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 06/04/2022

    //there must be
    public void ThereMustBe2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there must be "
        };

        //subject in spanish
        String tbsjs[] = {
                "debe haber ","deben haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there must be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no debe haber ","no deben haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 07/04/2022

    //there can be
    public void ThereCanBe2(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there can be "
        };

        //subject in spanish
        String tbsjs[] = {
                "puede haber ","pueden haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there can be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no puede haber ","no pueden haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 07/04/2022

    //pasive causitive simple
    public void PasiveCause2() {
        int neg = (int) (Math.random() * 4);
        int nesp = (int) (Math.random() * nnoblesM.length);
        int nesp2 = (int) (Math.random() * nnoblesM.length);
        int nvpspm = (int) (Math.random() * vpspM.length);
        int nvpspf = (int) (Math.random() * vpspF.length);
        int nvpengf = (int) (Math.random() * vpengF.length);
        int cCeng = (int) (Math.random() * 2);

        //Pasive Cause subject esp
        String pcsj[] = {"yo ", "tú ", "él ", "ella ", "eso ", "ellos ", "nosotros "};

        //Pasive Cause subject eng
        String pcsjeng[] = {"I ", "you ", "he ", "she ", "it ", "they ", "we "};

        //Pasive Cause Cause eng
        String pcCeng[] = {"have ", "get "};

        //Pasive Cause Cause eng
        String pcCesp[] = {"hago que ", "haces que ","hace que ","hace que ","hace que "
                ,"hacen que ","hacemos que "};


        switch (neg) {
            //Masculino Positivo
            case 0:
                ps1 = pcsj[0] + pcCesp[0] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps1eng = pcsjeng[0] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps2 = pcsj[1] + pcCesp[1] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps2eng = pcsjeng[1] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps3 = pcsj[2] + pcCesp[2] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps3eng = pcsjeng[2] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps3ella = pcsj[3] + pcCesp[3] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps3she = pcsjeng[3] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps3eso = pcsj[4] + pcCesp[4] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps3it = pcsjeng[4] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps4 = pcsj[5] + pcCesp[5] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps4eng = pcsjeng[5] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps5 = pcsj[6] + pcCesp[6] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps5eng = pcsjeng[6] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];
                break;
            //Masculino Negativo
            case 1:
                ps1 = pcsj[0] + "no " + pcCesp[0] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por " + nnoblesespM[nesp2];
                ps1eng = pcsjeng[0] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps2 = pcsj[1] + "no " + pcCesp[1] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps2eng = pcsjeng[1] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps3 = pcsj[2] + "no " + pcCesp[2] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps3eng = pcsjeng[2] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps3ella = pcsj[3] + "no " + pcCesp[3] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps3she = pcsjeng[3] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps3eso = pcsj[4] + "no " + pcCesp[4] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps3it = pcsjeng[4] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps4 = pcsj[5] + "no " + pcCesp[5] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps4eng = pcsjeng[5] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];

                ps5 = pcsj[6] + "no " + pcCesp[6] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp2];
                ps5eng = pcsjeng[6] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[v] + "by " + nnoblesM[nesp2];
                break;
            //Femenino Positivo
            case 2:
                ps1 = pcsj[0] + pcCesp[0] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps1eng = pcsjeng[0] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps2 = pcsj[1] + pcCesp[1] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps2eng = pcsjeng[1] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps3 = pcsj[2] + pcCesp[2] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps3eng = pcsjeng[2] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps3ella = pcsj[3] + pcCesp[3] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps3she = pcsjeng[3] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps3eso = pcsj[4] + pcCesp[4] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps3it = pcsjeng[4] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps4 = pcsj[5] + pcCesp[5] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps4eng = pcsjeng[5] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps5 = pcsj[6] + pcCesp[6] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps5eng = pcsjeng[6] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];
                break;
            //Femenino Negativo
            case 3:
                ps1 = pcsj[0] + "no " + pcCesp[0] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps1eng = pcsjeng[0] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps2 = pcsj[1] + "no " + pcCesp[1] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps2eng = pcsjeng[1] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps3 = pcsj[2] + "no " + pcCesp[2] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps3eng = pcsjeng[2] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps3ella = pcsj[3] + "no " + pcCesp[3] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps3she = pcsjeng[3] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps3eso = pcsj[4] + "no " + pcCesp[4] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps3it = pcsjeng[4] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps4 = pcsj[5] + "no " + pcCesp[5] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps4eng = pcsjeng[5] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];

                ps5 = pcsj[6] + "no " + pcCesp[6] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp2];
                ps5eng = pcsjeng[6] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpengf] + "by " + nnoblesF[nesp2];
                break;

        }
    }//LR 12/04/2022



    // Supposed to
    // se supone que tiene que pasar cases 2 y 3
    // se supone que va a pasar cases 4 y 5

    int vc= (int)(Math.random()*6);
    public void supposedtopres() {

        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v] + nnoblesesp[n];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que " + vn2[v] + nnoblesesp[n];
                ps2eng = "you're supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él " + vnb3[v] + nnoblesesp[n];
                ps3eng = "he's supposed to " + vnb[v] + nnobles[n];

                ps3ella = "Se supone que ella " + vnb3[v] + nnoblesesp[n];
                ps3she = "she's supposed to " + vnb[v] + nnobles[n];

                ps3eso = "Se supone que eso " + vnb3[v] + nnoblesesp[n];
                ps3it = "it's supposed to " + vnb[v] + nnobles[n];

                ps4 = "se supone que " + vn4[v] + nnoblesesp[n];
                ps4eng = "they're supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que " + vn5[v] + nnoblesesp[n];
                ps5eng = "we're supposed to " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v] + nnoblesesp[n];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no " + vn2[v] + nnoblesesp[n];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no " + vnb3[v] + nnoblesesp[n];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no " + vnb3[v] + nnoblesesp[n];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no " + vnb3[v] + nnoblesesp[n];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n];

                ps4 = "se supone que no " + vn4[v] + nnoblesesp[n];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no " + vn5[v] + nnoblesesp[n];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que tienes que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you're supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él tiene que " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he's supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella tiene que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she's supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso tiene que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it's supposed to ' " + vnb[v] + nnobles[n];

                ps4 = "se supone que tienen que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they're supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que tenemos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we're supposed to " + vnb[v] + nnobles[n];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no tienes que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no tiene que  " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no tiene que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no tiene que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n];

                ps4 = "se supone que no tienen que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no tenemos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n];
                break;

            case 4:
                ps1 = "se supone que voy a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que vas a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él va a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella va a " + vnbs[v] + nnoblesesp[n];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso va a " + vnbs[v] + nnoblesesp[n];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n];

                ps4 = "se supone que van a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que vamos a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n];
                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no vas a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no va a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no va a " + vnbs[v] + nnoblesesp[n];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no va a " + vnbs[v] + nnoblesesp[n];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n];

                ps4 = "se supone que no van a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no vamos a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n];
                break;

        }
    } //SergioVazquez 250322

    public void supposedtopast() {

        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v] + nnoblesesp[n];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que tú " + ps2imp[v] + nnoblesesp[n];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él " + ps3imp[v] + nnoblesesp[n];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n];

                ps3ella = "Se supone que ella " + ps3imp[v] + nnoblesesp[n];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n];

                ps3eso = "Se supone que eso " + ps3imp[v] + nnoblesesp[n];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que " + vn4imp[v] + nnoblesesp[n];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que " + vn5imp[v] + nnoblesesp[n];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v] + nnoblesesp[n];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no " + ps2imp[v] + nnoblesesp[n];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no " + ps3imp[v] + nnoblesesp[n];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no " + ps3imp[v] + nnoblesesp[n];
                ps3she = "she wasn't supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no " + ps3imp[v] + nnoblesesp[n];
                ps3it = "it wasn't supposed to " + vnb[v] + nnobles[n];

                ps4 = "se supone que no " + vn4imp[v] + nnoblesesp[n];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no " + vn5imp[v] + nnoblesesp[n];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que tenías que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él tenía que " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n];

                ps3ella = "Se supone que ella tenía que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n];

                ps3eso = "Se supone que eso tenía que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que tenían que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que teníamos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que no tenías que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él no tenía que " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he wasn't supposed to " + vnb3[v] + nnobles[n];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que no tenían que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no teníamos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que ibas a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él iba a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n];

                ps3ella = "Se supone que ella iba a " + vnbs[v] + nnoblesesp[n];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n];

                ps3eso = "Se supone que eso iba a " + vnbs[v] + nnoblesesp[n];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que iban a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que ibamos a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que no ibas a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él no iba a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he wasn't supposed to " + vnb3[v] + nnobles[n];

                ps3ella = "Se supone que ella no iba a " + vnbs[v] + nnoblesesp[n];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n];

                ps3eso = "Se supone que eso no iba a " + vnbs[v] + nnoblesesp[n];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que no iban a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no ibamos a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n];
                break;
        }
    } //SergioVazquez 250322

    //Wish Past Simple Dif 2
    public void WishPastSimpDif2() {

        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish " + "I " + vnbp[v] + nnobles[n];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish " + "you " + vnbp[v] + nnobles[n];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish " + "he " + vnbp[v] + nnobles[n];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish " + "she " + vnbp[v] + nnobles[n];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish " + "it " + vnbp[v] + nnobles[n];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish " + "they " + vnbp[v] + nnobles[n];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish " + "we " + vnbp[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish I didn't " + vnb[v] + nnobles[n];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish you didn't " + vnb[v] + nnobles[n];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish he didn't " + vnb[v] + nnobles[n];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish she didn't " + vnb[v] + nnobles[n];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish it didn't " + vnb[v] + nnobles[n];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish they didn't " + vnb[v] + nnobles[n];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish we didn't " + vnb[v] + nnobles[n];

                break;
        }
    }

    public void WishPastPerfDif2() {

        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I wish I had " + vpeng[v] + nnobles[n];

                ps2 = "Ojalá tú hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "I wish you had " + vpeng[v] + nnobles[n];

                ps3 = "Ojalá él hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "I wish he had " + vpeng[v] + nnobles[n];

                ps3ella = "Ojalá ella hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "I wish she had " + vpeng[v] + nnobles[n];

                ps3eso = "Ojalá eso hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "I wish it had " +  vpeng[v] + nnobles[n];

                ps4 = "Ojalá ellos hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "I wish they had " + vpeng[v] + nnobles[n];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "I wish we had " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I wish I hadn´t " + vpeng[v] + nnobles[n];

                ps2 = "Ojalá tú no hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "I wish you hadn´t " + vpeng[v] + nnobles[n];

                ps3 = "Ojalá él no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "I wish he hadn´t " + vpeng[v] + nnobles[n];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "I wish she hadn´t " + vpeng[v] + nnobles[n];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "I wish it hadn´t " + vpeng[v] + nnobles[n];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "I wish they hadn´t " + vpeng[v] + nnobles[n];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "I wish we hadn´t " + vpeng[v] + nnobles[n];

                break;


        }
    }

    public void WishWouldDif2() {

        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish I would " + vnb[v] + nnobles[n];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish you would " + vnb[v] + nnobles[n];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish he would " + vnb[v] + nnobles[n];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish she would " + vnb[v] + nnobles[n];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish it would " +  vnb[v] + nnobles[n];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish they would " + vnb[v] + nnobles[n];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish we would " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish I wouldn´t " + vnb[v] + nnobles[n];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish you wouldn´t " + vnb[v] + nnobles[n];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish he wouldn´t " + vnb[v] + nnobles[n];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish she wouldn´t " + vnb[v] + nnobles[n];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish it wouldn´t " + vnb[v] + nnobles[n];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish they wouldn´t " + vnb[v] + nnobles[n];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish we wouldn´t " + vnb[v] + nnobles[n];

                break;



        }
    }

    // USED TO DIF 2
    public void UsedToDif2() {
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I used to " + vnb[v] + nnobles[n];

                ps2 = "Tú solías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You used to " + vnb[v] + nnobles[n];

                ps3 = "Él solía " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He used to " + vnb[v] + nnobles[n];

                ps3ella = "Ella solía " + vnbs[v] + nnoblesesp[n];
                ps3she = "She used to " + vnb[v] + nnobles[n];

                ps3eso = "Eso solía " + vnbs[v] + nnoblesesp[n];
                ps3it = "It used to " + vnb[v] + nnobles[n];

                ps4 = "Ellos solían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They used to " + vnb[v] + nnobles[n];

                ps5 = "Nosotros solíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We used to " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I didn't use to " + vnb[v] + nnobles[n];

                ps2 = "Tú no solías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You didn't use to " + vnb[v] + nnobles[n];

                ps3 = "Él no solía " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He didn't use to " + vnb[v] + nnobles[n];

                ps3ella = "Ella no solía " + vnbs[v] + nnoblesesp[n];
                ps3she = "she didn't use to " + vnb[v] + nnobles[n];

                ps3eso = "Eso no solía " + vnbs[v] + nnoblesesp[n];
                ps3it = "It didn't use to ' " + vnb[v] + nnobles[n];

                ps4 = "Ellos no solían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They didn't use to " + vnb[v] + nnobles[n];

                ps5 = "Nosotros no solíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We didn't use to " + vnb[v] + nnobles[n];
                break;

        }
    } //SergioVazquez 120422

    // BE USED TO DIF 2
    public void BeUsedToDif2() {
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm used to " + vnbc[v] + nnobles[n];

                ps2 = "Tu estás acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You're used to " + vnbc[v] + nnobles[n];

                ps3 = "Él está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He's used to " + vnbc[v] + nnobles[n];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v] + nnoblesesp[n];
                ps3she = "She's used to " + vnbc[v] + nnobles[n];

                ps3eso = "Eso está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3it = "It's used to " + vnbc[v] + nnobles[n];

                ps4 = "Ellos están acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They're used to " + vnbc[v] + nnobles[n];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We're used to " + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm not used to " + vnbc[v] + nnobles[n];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You're not used to " + vnbc[v] + nnobles[n];

                ps3 = "Él no está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He's not used to " + vnbc[v] + nnobles[n];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v] + nnoblesesp[n];
                ps3she = "She's not used to " + vnbc[v] + nnobles[n];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3it = "It's not used to " + vnbc[v] + nnobles[n];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They're not used to " + vnbc[v] + nnobles[n];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We're not used to " + vnbc[v] + nnobles[n];
                break;
        }
    } //SergioVazquez 130422

    //Dificultad 3

    //want to dificultad 3
    public void WantYouTo3() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he want ", "she wants ", "it want ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you doesn't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we doesn't want ", "they doesn't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "eso no quiere ", "ella no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1 = wtsjs[0] + wtobj1s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = wtsj[0] + wtobj1[rn1] + nnobles[n] + frequadv[radv];

                ps2 = wtsjs[1] + wtobj2s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = wtsj[1] + wtobj2[rn1] + nnobles[n] + frequadv[radv];

                ps3 = wtsjs[2] + wtobj3s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = wtsj[2] + wtobj3[rn1] + nnobles[n] + frequadv[radv];

                ps3ella = wtsjs[3] + wtobj4s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3she = wtsj[3] + wtobj4[rn1] + nnobles[n] + frequadv[radv];

                ps3eso = wtsjs[4] + wtobj5s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3it = wtsj[4] + wtobj5[rn1] + nnobles[n] + frequadv[radv];

                ps4 = wtsjs[6] + wtobj6s[rn2] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = wtsj[6] + wtobj6[rn2] + nnobles[n] + frequadv[radv];

                ps5 = wtsjs[5] + wtobj7s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = wtsj[5] + wtobj7[rn1] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = wtsjsn[0] + wtobj1s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = wtsjn[0] + wtobj1[rn1] + nnobles[n] + frequadv[radv];

                ps2 = wtsjsn[1] + wtobj2s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = wtsjn[1] + wtobj2[rn1] + nnobles[n] + frequadv[radv];

                ps3 = wtsjsn[2] + wtobj3s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = wtsjn[2] + wtobj3[rn1] + nnobles[n] + frequadv[radv];

                ps3ella = wtsjsn[3] + wtobj4s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3she = wtsjn[3] + wtobj4[rn1] + nnobles[n] + frequadv[radv];

                ps3eso = wtsjsn[4] + wtobj5s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3it = wtsjn[4] + wtobj5[rn1] + nnobles[n] + frequadv[radv];

                ps4 = wtsjsn[6] + wtobj6s[rn2] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = wtsjn[6] + wtobj6[rn2] + nnobles[n] + frequadv[radv];

                ps5 = wtsjsn[5] + wtobj7s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = wtsjn[5] + wtobj7[rn1] + nnobles[n] + frequadv[radv];
                break;
        }
    }//LR 21/04/2022

    //for to dificultad 3
    public void ForSubTo3() {
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1 = ftsjs[0] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = ftsj[0] + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = ftsjs[1] + vn2subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = ftsj[1] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = ftsjs[2] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = ftsj[2] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = ftsjs[3] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = ftsj[3] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = ftsjs[4] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = ftsj[4] + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = ftsjs[5] + vn4subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = ftsj[5] + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = ftsjs[6] + vn5subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = ftsj[6] + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = ftsjsn[0] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = ftsjn[0] + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = ftsjsn[1] + vn2subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = ftsjn[1] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = ftsjsn[2] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = ftsjn[2] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = ftsjsn[3] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = ftsjn[3] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = ftsjsn[4] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = ftsjn[4] + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = ftsjsn[5] + vn4subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = ftsjn[5] + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = ftsjsn[6] + vn5subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = ftsjn[6] + vnb[v] + nnobles[n] + frequadv[radv];
                break;
        }
    }//LR 21/04/2022

    //there be Simple
    public void ThereBe3(){
        Intrans2 it = new Intrans2();

        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there is ","there are ",
        };

        //subject in spanish
        String tbsjs[] = {
                "hay ", "hay ",
        };

        //subject in eng negative
        String tbsjn[] = {
                "there is no ","there are no ",
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no hay ", "no hay ",
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsj[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsjn[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
        }

    }//LR 21/04/2022

    //there be pasado
    public void ThereBePast3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there was ","there were "
        };

        //subject in spanish
        String tbsjs[] = {
                "había ","había "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there was no ","there were no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no había ","no había "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsj[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsjn[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
        }


    }//LR 21/04/2022

    //there be past perf
    public void ThereBePastPerf3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there has to be ","there have to be "
        };

        //subject in spanish
        String tbsjs[] = {
                "tiene que haber ","tiene que haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there has to be no ","there have to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no tiene que haber ","no tiene que haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsj[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsjn[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
        }
    }//LR 21/04/2022

    //there be Continous
    public void ThereBeContinuous3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there is going to be ","there are going to be "
        };

        //subject in spanish
        String tbsjs[] = {
                "va a haber ","van a haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there is going to be no ","there are going to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no va a haber ","no van a haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsj[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + "to " + nnobles[n] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + "para " + nnoblesesp[n] + advfrequ[radv];
                ps2eng = tbsjn[1] + it.pome[rnpome] + "to " + nnobles[n] + frequadv[radv];


                break;
        }
    }//LR 21/04/2022

    //there be Past Continous
    public void ThereBePastContinuous3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there was going to be ","there were going to be  "
        };

        //subject in spanish
        String tbsjs[] = {
                "iba a haber ","iban a haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there was going to be no ","there were going to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no iba a haber ","no iban a haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsj[0] + it.pome[rnpome] + frequadv[radv];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsjn[0] + it.pome[rnpome] + frequadv[radv];
                break;
        }
    }//LR 21/04/2022

    //there be Could
    public void ThereCouldBe3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there could be "
        };

        //subject in spanish
        String tbsjs[] = {
                "podría haber ","podrían haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there could be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no podría haber ","no podrían haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsj[0] + it.pome[rnpome] + frequadv[radv];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsjn[0] + it.pome[rnpome] + frequadv[radv];
                break;
        }
    }//LR 21/04/2022

    //there be Should
    public void ThereShouldBe3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there should be "
        };

        //subject in spanish
        String tbsjs[] = {
                "debería haber ","deberían haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there should be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no debería haber ","no deberían haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsj[0] + it.pome[rnpome] + frequadv[radv];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsjn[0] + it.pome[rnpome] + frequadv[radv];
                break;
        }
    }//LR 21/04/2022

    //there be Would
    public void ThereWouldBe3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there would be "
        };

        //subject in spanish
        String tbsjs[] = {
                "habría ","habrían "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there would be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no habría ","no habrían "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsj[0] + it.pome[rnpome] + frequadv[radv];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsjn[0] + it.pome[rnpome] + frequadv[radv];
                break;
        }
    }//LR 21/04/2022

    //there be Will 7
    public void ThereWillBe3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there will be "
        };

        //subject in spanish
        String tbsjs[] = {
                "habrá ","habrán "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there will be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no habrá ","no habrán "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsj[0] + it.pome[rnpome] + frequadv[radv];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsjn[0] + it.pome[rnpome] + frequadv[radv];
                break;
        }
    }//LR 21/04/2022

    //there must be
    public void ThereMustBe3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there must be "
        };

        //subject in spanish
        String tbsjs[] = {
                "debe haber ","deben haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there must be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no debe haber ","no deben haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsj[0] + it.pome[rnpome] + frequadv[radv];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsjn[0] + it.pome[rnpome] + frequadv[radv];
                break;
        }
    }//LR 22/04/2022

    //there can be
    public void ThereCanBe3(){
        Intrans2 it = new Intrans2();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String tbsj[] = {
                "there can be "
        };

        //subject in spanish
        String tbsjs[] = {
                "puede haber ","pueden haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there can be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no puede haber ","no pueden haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsj[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjs[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsj[0] + it.pome[rnpome] + frequadv[radv];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome] + advfrequ[radv];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome] + frequadv[radv];

                ps2 = tbsjsn[1] + it.poms[rnpome] + advfrequ[radv];
                ps2eng = tbsjn[0] + it.pome[rnpome] + frequadv[radv];
                break;
        }
    }//LR 22/04/2022

    //pasive causitive simple
    public void PasiveCause3() {
        int neg = (int) (Math.random() * 4);
        int nesp = (int) (Math.random() * nnoblesM.length);
        int nesp2 = (int) (Math.random() * nnoblesM.length);
        int nvpspm = (int) (Math.random() * vpspM.length);
        int nvpspf = (int) (Math.random() * vpspF.length);
        int cCeng = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //Pasive Cause subject esp
        String pcsj[] = {"yo ", "tú ", "él ", "ella ", "eso ", "ellos ", "nosotros "};

        //Pasive Cause subject eng
        String pcsjeng[] = {"I ", "you ", "he ", "she ", "it ", "they ", "we "};

        //Pasive Cause Cause eng
        String pcCeng[] = {"have ", "get "};

        //Pasive Cause Cause eng
        String pcCesp[] = {"hago que ", "haces que ","hace que ","hace que ","hace que "
                ,"hacen que ","hacemos que "};

        switch (neg) {
            //Masculino Positivo
            case 0:
                ps1 = pcsj[0] + pcCesp[0] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps2 = pcsj[1] + pcCesp[1] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3 = pcsj[2] + pcCesp[2] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + pcCesp[3] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + pcCesp[4] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps4 = pcsj[5] + pcCesp[5] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps5 = pcsj[6] + pcCesp[6] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];
                break;
            //Masculino Negativo
            case 1:
                ps1 = pcsj[0] + "no " + pcCesp[0] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por " + nnoblesespM[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps2 = pcsj[1] + "no " + pcCesp[1] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3 = pcsj[2] + "no " + pcCesp[2] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + "no " + pcCesp[3] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + "no " + pcCesp[4] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps4 = pcsj[5] + "no " + pcCesp[5] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps5 = pcsj[6] + "no " + pcCesp[6] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];
                break;
            //Femenino Positivo
            case 2:
                ps1 = pcsj[0] + pcCesp[0] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps2 = pcsj[1] + pcCesp[1] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3 = pcsj[2] + pcCesp[2] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + pcCesp[3] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + pcCesp[4] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps4 = pcsj[5] + pcCesp[5] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps5 = pcsj[6] + pcCesp[6] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];
                break;
            //Femenino Negativo`
            case 3:
                ps1 = pcsj[0] + "no " + pcCesp[0] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps2 = pcsj[1] + "no " + pcCesp[1] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3 = pcsj[2] + "no " + pcCesp[2] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + "no " + pcCesp[3] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + "no " + pcCesp[4] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps4 = pcsj[5] + "no " + pcCesp[5] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps5 = pcsj[6] + "no " + pcCesp[6] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];
                break;

        }
    }//LR 22/04/2022

    //pasive causitive past
    public void PasiveCausePast3(){
        int neg = (int) (Math.random() * 4);
        int nesp = (int) (Math.random() * nnoblesM.length);
        int nesp2 = (int) (Math.random() * nnoblesM.length);
        int nvpspm = (int) (Math.random() * vpspM.length);
        int nvpspf = (int) (Math.random() * vpspF.length);
        int nvpengf = (int) (Math.random() * vpspF.length);
        int cCeng = (int) (Math.random() * 2);

        int radv = (int) (Math.random() * frequadv.length);

        //Pasive Cause subject esp
        String pcsj[] = {"yo ", "tú ", "él ", "ella ", "eso ", "ellos ", "nosotros "};

        //Pasive Cause subject eng
        String pcsjeng[] = {"I ", "you ", "he ", "she ", "it ", "they ", "we "};

        //Pasive Cause Cause eng
        String pcCeng[] = {"had ", "got "};

        //Pasive Cause Cause eng
        String pcCesp[] = {"hice que ", "hiciste que ","hizo que ","hizo que ","hizo que "
                ,"hicieron que ","hicimos que "};

        switch (neg) {
            //Masculino Positivo
            case 0:
                ps1 = pcsj[0] + pcCesp[0] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps2 = pcsj[1] + pcCesp[1] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3 = pcsj[2] + pcCesp[2] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + pcCesp[3] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + pcCesp[4] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps4 = pcsj[5] + pcCesp[5] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps5 = pcsj[6] + pcCesp[6] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];
                break;
            //Masculino Negativo
            case 1:
                ps1 = pcsj[0] + "no " + pcCesp[0] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por " + nnoblesespM[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps2 = pcsj[1] + "no " + pcCesp[1] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3 = pcsj[2] + "no " + pcCesp[2] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + "no " + pcCesp[3] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + "no " + pcCesp[4] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps4 = pcsj[5] + "no " + pcCesp[5] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];

                ps5 = pcsj[6] + "no " + pcCesp[6] + nnoblesespM[nesp] + "sea " + " " + vpspM[nvpspm] + "por "+ nnoblesespM[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + "don't " + " " + pcCeng[cCeng] + nnoblesM[nesp] + vpeng[nvpspm] + "by " + nnoblesM[nesp] + frequadv[radv];
                break;
            //Femenino Positivo
            case 2:
                ps1 = pcsj[0] + pcCesp[0] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps2 = pcsj[1] + pcCesp[1] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3 = pcsj[2] + pcCesp[2] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + pcCesp[3] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + pcCesp[4] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps4 = pcsj[5] + pcCesp[5] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps5 = pcsj[6] + pcCesp[6] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];
                break;
            //Femenino Negativo`
            case 3:
                ps1 = pcsj[0] + "no " + pcCesp[0] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps1eng = pcsjeng[0] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps2 = pcsj[1] + "no " + pcCesp[1] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps2eng = pcsjeng[1] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3 = pcsj[2] + "no " + pcCesp[2] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3eng = pcsjeng[2] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3ella = pcsj[3] + "no " + pcCesp[3] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3she = pcsjeng[3] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps3eso = pcsj[4] + "no " + pcCesp[4] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps3it = pcsjeng[4] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps4 = pcsj[5] + "no " + pcCesp[5] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps4eng = pcsjeng[5] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];

                ps5 = pcsj[6] + "no " + pcCesp[6] + nnoblesespF[nesp] + "sea " + " " + vpspF[nvpspf] + "por "+ nnoblesespF[nesp] + advfrequ[radv];
                ps5eng = pcsjeng[6] + "don't " + " " + pcCeng[cCeng] + nnoblesF[nesp] + vpengF[nvpspf] + "by " + nnoblesF[nesp] + frequadv[radv];
                break;

        }
    }//LR 22/04/2022

    public void supposedtopres3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que " + vn2[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you're supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él " + vnb3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he's supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella " + vnb3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she's supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso " + vnb3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it's supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que " + vn4[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they're supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que " + vn5[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we're supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no " + vn2[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no " + vnb3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no " + vnb3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no " + vnb3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no " + vn4[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no " + vn5[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que tienes que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you're supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he's supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she's supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it's supposed to ' " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que tienen que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they're supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que tenemos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we're supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no tienes que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no tiene que  " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no tienen que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no tenemos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 4:
                ps1 = "se supone que voy a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que vas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que van a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que vamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no vas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no van a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no vamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

        }
    } //LR 22/04/2022

    public void supposedtopast3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que tú " + ps2imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que " + vn4imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que " + vn5imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no " + ps2imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no " + vn4imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no " + vn5imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que tenías que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que tenían que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que teníamos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que no tenías que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb3[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no tenían que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no teníamos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que ibas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que iban a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que ibamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que no ibas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb3[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no iban a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no ibamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
        }
    } //LR 22/04/2022

    //Wish Past Simple Dif 2
    public void WishPastSimpDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish " + "I " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish " + "you " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish " + "he " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish " + "she " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish " + "it " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish " + "they " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish " + "we " + vnbp[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                break;
        }
    } //LR 22/04/2022

    public void WishPastPerfDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it had " +  vpeng[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we had " + vpeng[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I hadn´t " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú no hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you hadn´t " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he hadn´t " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she hadn´t " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it hadn´t " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they hadn´t " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we hadn´t " + vpeng[v] + nnobles[n] + frequadv[radv];

                break;


        }
    } //LR 22/04/2022

    public void WishWouldDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it would " +  vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we would " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I wouldn´t " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you wouldn´t " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he wouldn´t " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she wouldn´t " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it wouldn´t " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they wouldn´t " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we wouldn´t " + vnb[v] + nnobles[n] + frequadv[radv];

                break;



        }
    }//LR 25/04/2022

    // USED TO DIF 2
    public void UsedToDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tú solías " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "She used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos solían " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros solíamos " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We used to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tú no solías " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It didn't use to ' " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos no solían " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros no solíamos " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

        }
    }//LR 25/04/2022

    // BE USED TO DIF 2
    public void BeUsedToDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tu estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You're used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He's used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "She's used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It's used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos están acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They're used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We're used to " + vnbc[v] + nnobles[n] + frequadv[radv];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You're not used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He's not used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "She's not used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It's not used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They're not used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We're not used to " + vnbc[v] + nnobles[n] + frequadv[radv];
                break;
        }
    }//LR 25/04/2022



    // dificultad 4- igual qeu la tres pero le agregamos prep phrases
    // let frequency adverbs always be at the end with the prep phrase
    //Presentes Dif 4
    public void generarnoblespresentesimple4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps2eng = "you " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3 = "él " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps3eng = "he " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3ella = "ella " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps3she = "she " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3eso = "eso " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps3it = "it " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps4 = "ellos " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps4eng = "they " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps5 = "nosotros " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps5eng = "we " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú " + "no " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3 = "él " + "no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he " + "doesn't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3ella = "ella " + "no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she " + "doesn't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3eso = "eso " + "no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it " + "doesn't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps4 = "ellos " + "no " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps5 = "nosotros " + "no " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;


        }

    } //SV 230422
    public void GenNoblePresContDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "estoy " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I am " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I am " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "estás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you are " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you are " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "está " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he is " + vnbc[v] + nnobles[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng2 = "he is " + vnbc[v] + nnobles[n]  + prep.noblesspecial[p][p2] + advfrequ[r];

                ps3ella = "ella " + "está " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she is " + vnbc[v] + nnobles[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she2 = "she is " + vnbc[v] + nnobles[n]+ prep.noblesspecial[p][p2] + advfrequ[r];

                ps3eso = "eso " + "está " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it is " + vnbc[v] + nnobles[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3iteng2 = "it is " + vnbc[v] + nnobles[n] + prep.noblesspecial[p][p2] + advfrequ[r];

                ps4 = "ellos " + "están " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they are " + vnbc[v] + nnobles[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng2 = "they are " + vnbc[v] + nnobles[n] + prep.noblesspecial[p][p2] + advfrequ[r];

                ps5 = "nosotros " + "estamos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we are " + vnbc[v] + nnobles[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng2 = "we are " + vnbc[v] + nnobles[n] + prep.noblesspecial[p][p2] + advfrequ[r];

                break;
            case 1:
                ps1 = "yo no " + "estoy " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I'm not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I'm not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "estás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you're not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you're not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "está " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he's not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he's not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella no " + "está " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she's not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she's not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso no " + "está " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it's not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it's not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos no " + "están " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they're not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they're not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros no " + "estamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we're not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we're not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;

        }

    } //SV 230422
    public void GenNoblePresPerfDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "he " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "has " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos " + "han " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "hemos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:

                ps1 = "yo no " + "he " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps1eng = "I haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú no " + "has " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps2eng = "you haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3 = "él no " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps3eng = "he hasn't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he hasn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3ella = "ella no " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps3she = "she hasn't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she hasn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3eso = "eso no " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps3it = "it hasn't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it hasn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;


                ps4 = "ellos no " + "han " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps4eng = "they haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;


                ps5 = "nosotros no " + "hemos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps5eng = "we haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;

        }

    } //SV 230422
    public void GenPresPerfContDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "he estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "has estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you have " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "ha estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he has " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he has " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she has " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "she has " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it has " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "he has " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos " + "han estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they have " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "hemos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we have " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "has estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos no " + "han estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                break;
        }

    } //SV 230422

    //Pasados Dif 4
    public void GenPastSimpleDif4() {
        int sr = (int) (Math.random() * 2);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo " + ps1pre[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps1eng2 = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps2 = "tú " + ps2pre[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps2eng2 = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3 = "él " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3eng = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3eng2 = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3ella = "ella " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3eso = "eso " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps4 = "ellos " + vn4p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps5 = "nosotros " + vn5p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                } else {
                    ps1 = "yo " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps2 = "tú " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3 = "él " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                    ps3eng = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3eng = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3ella = "ella " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3eso = "eso " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps4 = "ellos " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps5 = "nosotros " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no " + ps1pre[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps2 = "tú " + "no " + ps2pre[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3 = "él " + "no " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3eng = "he " + "din't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3ella = "ella " + "no " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3eso = "eso " + "no " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps4 = "ellos " + "no " + vn4p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps5 = "nosotros " + "no " + vn5p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                } else {
                    ps1 = "yo " + "no " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps1eng2 = "I " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps2 = "tú " + "no " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps2eng2 = "you " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3 = "él " + "no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3eng = "he " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3eng2 = "he " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3ella = "ella " + "no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3she2 = "she " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3eso = "eso " + "no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3iteng2 = "it " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps4 = "ellos " + "no " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps4eng2 = "they " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps5 = "nosotros " + "no " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps5eng2 = "we " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                }
                break;
        }
    } //SV 260422
    public void GenNoblePastContDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "estabas " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "estaban " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "estábamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "estabas " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "estaban " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "estábamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenNoblePastPerfDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "habías " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos " + "habían " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "habíamos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "habías " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "había " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "habían " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "habíamos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we had not " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;


        }

    } //SV 260422
    public void GenPastPerfContDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "habías estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "había estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "habían estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "habías estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "había estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella no " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso no " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos no " + "habían estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we had not " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }
    } //SV 260422

    //Futuros Dif 4
    public void GenerarNoblesFuturoSimple4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + vn1f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + vn2f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + vn4f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + vn5f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "no " + vn2f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "no " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he " + "won't " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he " + "won't " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "no " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she " + "won't " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she " + "won't " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "no " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it " + "won't " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it " + "won't " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "no " + vn4f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "no " + vn5f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenNobleFutureContDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "estaré " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú " + "estarás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "estarán " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "estaremos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "estarás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "estarán " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "estaremos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenNobleFuturePerfDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "habré " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "habrás " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "habrán " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "habremos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I won't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "habrás " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "habrá " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she won't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "habrán " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "habremos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenFuturePerfContDif4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "habré estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "habrás estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "habrán estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "habremos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I won't have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "habrás estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "habrán estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "habremos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }
    } //SV 260422

    //Would Dif 4
    public void GenerarNoblesWouldSimple4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + vn1w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + vn2w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + vn3w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella "  + vn3w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso "  + vn3w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos "  + vn4w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros "  + vn5w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps1eng = "I " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no " + vn2w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps2eng = "you " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no " + vn3w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps3eng = "he " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no " + vn3w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps3she = "she " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no " + vn3w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps3it = "it " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no " + vn4w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps4eng = "they " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no " + vn5w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps5eng = "we " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422
    public void GenNobleWouldContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "tú "  + "estarías " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él "  + "estaría " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella "  + "estaría " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso "  + "estaría " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos "  + "estarían " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros "  + "estaríamos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "estarías " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "estarían " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros no " + "estaríamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] ;
                ps5eng = "we wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422
    public void GenNobleWouldPerfDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "hubieras " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "hubieran " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "hubieramos " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "hubieras " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng = "you wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "hubieran " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "hubieramos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422
    public void GenNobleWouldPerfContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "hubieras estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "hubiera estdo " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "hubieran estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "hubieramos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] ;
                ps1eng = "I wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "hubieras estado " + vnbcs[v] + nnoblesesp[n] ;
                ps2eng = "you wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "hubiera estdo " + vnbcs[v] + nnoblesesp[n] ;
                ps3eng = "he wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] ;
                ps3she = "she wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] ;
                ps3it = "it wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "hubieran estado " + vnbcs[v] + nnoblesesp[n] ;
                ps4eng = "they wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "hubieramos estado " + vnbcs[v] + nnoblesesp[n] ;
                ps5eng = "we wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422

    //could Dif 4
    public void GenerarNoblesCouldSimple4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo podria " + vnbs[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could " + vnb[v] + nnobles[n]  + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú podrias " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él podria " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella podria " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso podria " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos podrian " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podriamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no podria " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no podrias " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no podria " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no podria " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no podria " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no podrian " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no podriamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenNobleCouldContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú podrías "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos podrían "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podríamos "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no podrías " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no podrían " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no podríamos " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenNobleCouldPerfDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo pude " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú pudiste " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos pudieron " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros pudimos  " +  "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no pude " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps1eng = "I couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no pudiste " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps2eng = "you couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él no pudo " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps3eng = "he couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no pudo " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps3she = "she couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no pudo " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps3it = "it couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no pudieron " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps4eng = "they couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no pudimos " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenCouldPerfContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "we couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "we couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "they couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "they couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422

    //should Dif 4
    public void GenerarNoblesShouldSimple4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú deberías "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debería "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debería "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debería "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deberían "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros deberíamos "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "yo " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "tú " + "no deberías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos " + "no deberían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros " + "no deberíamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //SV 280422
    public void GenNobleShouldContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú deberías "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should "  + "be " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[radv]+ nnobles[n];


                ps3ella = "ella debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deberían "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros deberíamos "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no deberías " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos no deberían " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros no deberíamos " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenNobleShouldPerfDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debí "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú debiste "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debió "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debió "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debió "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos debieron "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros debimos  "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no debí " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no debiste " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you shouldn't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no debió " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no debió " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she shouldn't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv]+frequadv[r];


                ps3eso = "eso no debió " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no debieron " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no debimos " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenShouldPerfContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "debí haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "debiste haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "debieron haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "debimos haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "debieron haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422

    //might Dif 4
    public void GenerarNoblesMightSimple4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quiza " + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quiza " + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quiza " + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "quiza no " + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "quiza no " + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "quiza no " + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenNobleMightContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá "  + "estés " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá "  + "estén " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá "  + "estemos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "tú quizá no "  + "estés " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá no "  + "estén " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá no "  + "estemos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenNobleMightPerfDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá "  + "hayas " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she = "she might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá "  + "hayan " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng = "they might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá  "  + "hayamos " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "yo quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá no "  + "hayas " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá no "  + "hayan " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá no "  + "hayamos " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //SV 280422
    public void GenNobleMightPerfContDif4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá "  + "hayas estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá "  + "hayan estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;

            case 1:
                ps1 = "yo quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá no "  + "hayas estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá no "  + "hayan estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá no "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422


    //DIF 4 PD

    // can y must simp y cont
    public void GenerarNoblesCanSimple4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps1 = "yo puedo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú puedes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos pueden "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no puedo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no puedes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no pueden "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no podemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    }//PD 27/04/2022
    public void GenNobleCanContDif4(){
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    }//PD 27/04/2022

    public void GenerarNoblesMustSimple4(){
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        int radv = (int) (Math.random() * frequadv.length);
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú debes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deben "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros debemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no debo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "must not "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "must not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no debes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "must not "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "must not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "must not "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "must not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "must not "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "must not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "must not "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "must not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no deben "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "must not "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "must not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no debemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "must not "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "must not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    }//PD 27/04/2022
    public void GenNobleMustContDif4(){
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I must not "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I must not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you must not "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you must not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he must not "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he must not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she must not "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she must not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it must not "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it must not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they must not "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they must not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we must not "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we must not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    }//PD 27/04/2022

    //want to 4
    public void WantYouTo4() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);
        Intrans2 prep = new Intrans2();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he want ", "she wants ", "it want ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you doesn't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we doesn't want ", "they doesn't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "eso no quiere ", "ella no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1 = wtsjs[0] + wtobj1s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = wtsj[0] + wtobj1[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = wtsjs[1] + wtobj2s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = wtsj[1] + wtobj2[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = wtsjs[2] + wtobj3s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = wtsj[2] + wtobj3[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = wtsjs[3] + wtobj4s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = wtsj[3] + wtobj4[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = wtsjs[4] + wtobj5s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = wtsj[4] + wtobj5[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = wtsjs[6] + wtobj6s[rn2] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = wtsj[6] + wtobj6[rn2] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = wtsjs[5] + wtobj7s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = wtsj[5] + wtobj7[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = wtsjsn[0] + wtobj1s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = wtsjn[0] + wtobj1[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = wtsjsn[1] + wtobj2s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = wtsjn[1] + wtobj2[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = wtsjsn[2] + wtobj3s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = wtsjn[2] + wtobj3[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = wtsjsn[3] + wtobj4s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = wtsjn[3] + wtobj4[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = wtsjsn[4] + wtobj5s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = wtsjn[4] + wtobj5[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = wtsjsn[6] + wtobj6s[rn2] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = wtsjn[6] + wtobj6[rn2] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = wtsjsn[5] + wtobj7s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = wtsjn[5] + wtobj7[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    }//PD 27/04/2022

    //for to dificultad 4
    public void ForSubTo4() {
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);
        Intrans2 prep = new Intrans2();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1 = ftsjs[0] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = ftsj[0] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = ftsjs[1] + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = ftsj[1] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = ftsjs[2] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = ftsj[2] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = ftsjs[3] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = ftsj[3] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = ftsjs[4] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = ftsj[4] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = ftsjs[5] + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = ftsj[5] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = ftsjs[6] + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = ftsj[6] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = ftsjsn[0] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = ftsjn[0] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = ftsjsn[1] + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = ftsjn[1] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = ftsjsn[2] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = ftsjn[2] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = ftsjsn[3] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = ftsjn[3] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = ftsjsn[4] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = ftsjn[4] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = ftsjsn[5] + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = ftsjn[5] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = ftsjsn[6] + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = ftsjn[6] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    }//PD 27/04/2022

    //there be Simple

    public void supposedtopres4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you're supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él " + vnb3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he's supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella " + vnb3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she's supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso " + vnb3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it's supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they're supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we're supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no " + vnb3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no " + vnb3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no " + vnb3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que tienes que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you're supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he's supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she's supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it's supposed to ' " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que tienen que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they're supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que tenemos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we're supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no tienes que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no tiene que  " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no tienen que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no tenemos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 4:
                ps1 = "se supone que voy a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que vas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que van a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que vamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no vas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she's not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it's not supposed to ' " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no van a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no vamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we're not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

        }
    } //PD 02/05/2022

    public void supposedtopast4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que tú " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que tenías que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que tenían que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que teníamos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que no tenías que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no tenían que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no teníamos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que ibas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que iban a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que ibamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que no ibas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no iban a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no ibamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //PD 02/05/2022

    //Wish Past Simple Dif 2
    public void WishPastSimpDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish " + "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish " + "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish " + "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish " + "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish " + "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish " + "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish " + "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //PD 02/05/2022

    public void WishPastPerfDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú hubieras " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it had " +  vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos hubieran " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I hadn´t " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú no hubieras " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you hadn´t " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he hadn´t " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she hadn´t " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it hadn´t " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they hadn´t " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we hadn´t " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;


        }
    } //PD 02/05/2022

    public void WishWouldDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it would " +  vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I wouldn´t " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you wouldn´t " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he wouldn´t " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she wouldn´t " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it wouldn´t " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they wouldn´t " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we wouldn´t " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;



        }
    } //PD 02/05/2022

    // USED TO DIF 2
    public void UsedToDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tú solías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "She used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos solían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros solíamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tú no solías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It didn't use to ' " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos no solían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros no solíamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

        }
    } //PD 02/05/2022

    // BE USED TO DIF 2
    public void BeUsedToDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tu estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You're used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He's used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "She's used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It's used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos están acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They're used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We're used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You're not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He's not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "She's not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It's not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They're not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We're not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //PD 02/05/2022

    String objyo[]= {"te ","lo ", "la ","lo ", "los ", "nos "};
    String objtu[]= {"me ","lo ", "la ","lo ", "los ", "nos "};
    String objel[]= {"me ","te ", "la ","lo ", "los ", "nos "};
    String objella[]= {"me ","lo ", "te ","lo ", "los ", "nos "};
    String objeso[]= {"me ","lo ", "te ","la ", "los ", "nos "};
    String objellos[]= {"me ","lo ", "te ","lo ", "la ", "nos "};
    String objnos[]= {"lo ", "te ","lo ", "los ", "la "};

    String obji[]= {"you ","him ", "her ","it ", "them ", "us "};
    String objyou[]= {"me ","him ", "her ","it ", "them ", "us "};
    String objhe[]= {"me ","you ", "her ","it ", "them ", "us "};
    String objshe[]= {"me ","him ", "you ","it ", "them ", "us "};
    String objit[]= {"me ","him ", "you ","her ", "them ", "us "};
    String objthem[]= {"me ","him ", "you ","it ", "her ", "us "};
    String objus[]= {"him ", "you ","it ", "them ", "her "};

    String vp1 []={"acuesto ", "afieto ", "divierto ",
            "olvido ", "duermo ",  "pongo ", "baño ",
            "escondo ","como ", "quedo ", "levanto ",
            "quejo ", "marcho ", "meto a ", "muero ",
            "niego ", "dirigo a ", "acuerdo "
    };

    String vp2 []={"acuestas ", "afeitas ", "diviertes ",
            "olvidas ", "duermes ", "pones ", "bañas ",
            "escondes ","comes ", "quedas ", "levantas ",
            "quejas ", "marchas ", "metes a ", "mueres ",
            "niegas ", "diriges a ", "acuerdas "
    };
    String vp3 []={"acuesta ", "afeita ", "divierte ",
            "olvida ", "duerme ",  "pone ", "baña ",
            "esconde ","come ", "queda ", "levanta ",
            "queja ", "marcha ", "mete a ", "muere ",
            "niega ", "dirige a ", "acuerda "
    };
    String vp4 []={"acuestan ", "afeitan ", "divierten ",
            "olvidan ", "duermen ",  "ponen ", "bañan ",
            "esconden ","comen ", "quedan ", "levantan ",
            "quejan ", "marchan ", "meten a ", "mueren ",
            "niegan ", "dirigen a ", "acuerdan "
    };

    String vp5 []={"acostamos ", "afeitamos ", "divertimos ",
            "olvidamos ", "dormimos ","ponemos ", "bañamos ",
            "escondemos ","comemos ", "quedamos ", "levantamos ",
            "quejamos ", "marchamos ", "metemos a ", "morimos ",
            "negamos ", "dirigimos a ", "acordamos "
    };

    // verbos pronominativos ingl[es
    String vpe1[]={"lay down ", "shave ", "have fun " ,  "sleep ", "wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };
    String vpe2[]={"lay down ", "shave ", "have fun " ,  "sleep ","wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };
    String vpe3[]={"lays down ", "shaves ", "has fun " ,  "sleeps ","wears ",
            "showers ", "hides ", "eats ","behaves ", "stays ", "gets up ", "complaints "
            ,"leaves ", "gets in ", "dies ", "refuses ", "heads to ", "remembers "
    };
    String vpe4[]={"lay down ", "shave ", "have fun " ,  "sleep ", "wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };

    String vpe5[]={"lay down ", "shave ", "have fun " ,  "sleep ", "wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };

    String vg1[]={"enojo ", "aburro ", "confundo ", "canso ", "alegro ",
            "pierdo ", "impresiono ", "asusto ", "lleno ", "drogo ", "agito ",
            "emociono ", "averguenzo ", "deprimo ", "caso ", "embarazo "
    };
    String vg2[]={"enojas ", "aburres ", "confundes ", "cansas ", "alegras ",
            "pierdes ", "impresionas ", "asustas ", "llenas ", "drogas ", "agitas ",
            "emocionas ", "averguenzas ", "deprimes ", "casas ", "embarazas "
    };
    String vg3[]={"enoja ", "aburre ", "confunde ", "cansa ", "alegra ",
            "pierde ", "impresiona ", "asusta ", "llena ", "droga ", "agita ",
            "emociona ", "averguenza ", "deprime ", "casa ", "embaraza "
    };
    String vg4[]={"enojan ", "aburren ", "confunden ", "cansan ", "alegran ",
            "pierden ", "impresionan ", "asustan ", "llenan ", "drogan ", "agitan ",
            "emocionan ", "averguenzan ", "deprimen ", "casan ", "embarazan "
    };

    String vg5[]={"enojamos ", "aburrimos ", "confundimos ", "cansamos ", "alegramos ",
            "perdemos ", "impresionamos ", "asustamos ", "llenamos ", "drogamos ", "agitamos ",
            "emocionamos ", "avergonzamos ", "deprimimos ", "casamos ", "embarazamos "
    };

    String vgeng[]={"angry ", "bored ", "confused ", "tired ", "happy ",
            "lost ", "impressed ", "scared ", "filled ", "high ", "agitated ",
            "excited ", "embarrased ", "depressed ", "married ", "pregnant "
    };
    Intrans prep = new Intrans();
    // interferencias, 0 a 100,presente simple
    public void intporsujetops0a100(){

        switch (neg) {
            case 0:
                ps1 =  vn1[v] + nnoblesesp[n] ;
                ps1eng = "I " + vnb[v] + nnobles[n];

                ps2 = vn2[v] + nnoblesesp[n];
                ps2eng = "you " + vnb[v] + nnobles[n];

                ps3 = vn3[v] + nnoblesesp[n];
                ps3eng = "he " + vnb3[v] + nnobles[n];

                ps3ella = vn3[v] + nnoblesesp[n];
                ps3she = "she " + vnb3[v] + nnobles[n];

                ps3eso = vn3[v] + nnoblesesp[n];
                ps3it = "it " + vnb3[v] + nnobles[n];

                ps4 = vn4[v] + nnoblesesp[n];
                ps4eng = "they " + vnb[v] + nnobles[n];

                ps5 =  vn5[v] + nnoblesesp[n];
                ps5eng = "we " + vnb[v] + nnobles[n];
                break;
            case 1 :
                ps1 =  "no "+ vn1[v] + nnoblesesp[n];
                ps1eng = "I " + "don't "+ vnb[v] + nnobles[n];

                ps2 = "no "+vn2[v] + nnoblesesp[n];
                ps2eng = "you " +   "don't "+ vnb[v] + nnobles[n];

                ps3 =   "no "+   vn3[v] + nnoblesesp[n];
                ps3eng = "he " +  "doesn't "+ vnb[v] + nnobles[n];

                ps3ella =   "no "+ vn3[v] + nnoblesesp[n];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n];

                ps3eso =  "no "+ vn3[v] + nnoblesesp[n];
                ps3it = "it " + "doesn't "+ vnb[v] + nnobles[n];

                ps4 =  "no "+ vn4[v] + nnoblesesp[n];
                ps4eng = "they " + "don't " +vnb[v] + nnobles[n];

                ps5 =   "no "+  vn5[v] + nnoblesesp[n];
                ps5eng = "we " + "don't "+ vnb[v] + nnobles[n];
                break;

        }
    }  // por sujeto
    public void intporprepps0a100(){
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = prep.noblesspecial[p][p2] + vn1[v] + nnoblesesp[n] ;
                ps1eng = "I " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2]  ;

                ps2 =prep.noblesspecial[p][p2] +vn2[v] + nnoblesesp[n];
                ps2eng = "you " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3 =prep.noblesspecial[p][p2] + vn3[v] + nnoblesesp[n];
                ps3eng = "he " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3ella = prep.noblesspecial[p][p2] + vn3[v] + nnoblesesp[n];
                ps3she = "she " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3eso = prep.noblesspecial[p][p2] +vn3[v] + nnoblesesp[n];
                ps3it = "it " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps4 = prep.noblesspecial[p][p2] +vn4[v] + nnoblesesp[n];
                ps4eng = "they " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps5 =  prep.noblesspecial[p][p2] +vn5[v] + nnoblesesp[n];
                ps5eng = "we " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];
                break;
            case 1 :
                ps1 = prep.noblesspecial[p][p2] + "no "+ vn1[v] + nnoblesesp[n];
                ps1eng = "I " + "don't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps2 = prep.noblesspecial[p][p2] +"no "+vn2[v] + nnoblesesp[n];
                ps2eng = "you " +   "don't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3 = prep.noblesspecial[p][p2] +  "no "+   vn3[v] + nnoblesesp[n];
                ps3eng = "he " +  "doesn't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3ella =  prep.noblesspecial[p][p2] + "no "+ vn3[v] + nnoblesesp[n];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3eso = prep.noblesspecial[p][p2] + "no "+ vn3[v] + nnoblesesp[n];
                ps3it = "it " + "doesn't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps4 =prep.noblesspecial[p][p2] +  "no "+ vn4[v] + nnoblesesp[n];
                ps4eng = "they " + "don't " +vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps5 = prep.noblesspecial[p][p2] +  "no "+  vn5[v] + nnoblesesp[n];
                ps5eng = "we " + "don't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];
                break;

        }
    }   // por prep
    public void intporobjps0a100(){
        int i= (int)(Math.random()*objyo.length);
        int y=(int)(Math.random()*objtu.length);
        int e=(int)(Math.random()*objel.length);
        int ell=(int)(Math.random()*objella.length);
        int it=(int)(Math.random()*objeso.length);
        int th=(int)(Math.random()*objellos.length);
        int us=(int)(Math.random()* objnos.length);
        switch (neg) {
            case 0:
                ps1 =  objyo[i] +   vn1[v] ;
                ps1eng = "I " + vnb[v] + obji[i];

                ps2 = objtu[y] + vn2[v] ;
                ps2eng = "you "+ vnb[v] + objyou[y];

                ps3 = "él " + objel[e] + vn3[v] ;
                ps3eng = "he " + vnb3[v] + objhe[e];

                ps3ella = "ella " +objella[ell] + vn3[v];
                ps3she = "she " + vnb3[v] + objshe[ell];

                ps3eso = "eso " + objeso[it] +vn3[v] ;
                ps3it = "it " + vnb3[v] + objit[it];

                ps4 =objellos[th] + vn4[v] ;
                ps4eng = "they " + vnb[v] + objthem[th];

                ps5 = objnos[us] + vn5[v] ;
                ps5eng = "we " + vnb[v] + objus[us];
                break;
            case 1 :
                ps1 =  "no "+ objyo[i] +   vn1[v] ;
                ps1eng = "I " +"don´t "+ vnb[v] + obji[i];

                ps2 = "no "+objtu[y] + vn2[v] ;
                ps2eng = "you " +"don´t "+ vnb[v] + objyou[y];

                ps3 = "él " +"no "+ objel[e] + vn3[v] ;
                ps3eng = "he " +"doesn´t "+ vnb[v] + objhe[e];

                ps3ella = "ella " +"no "+objella[ell] + vn3[v];
                ps3she = "she " + "doesn´t "+vnb[v] + objshe[ell];

                ps3eso = "eso " + "no "+objeso[it] +vn3[v] ;
                ps3it = "it " + "doesn´t "+vnb[v] + objit[it];

                ps4 = "no "+objellos[th] + vn4[v] ;
                ps4eng = "they " + "don´t "+vnb[v] + objthem[th];

                ps5 =  "no "+   objnos[us] + vn5[v] ;
                ps5eng = "we " + "don´t "+vnb[v] + objus[us];
                break;

        }
    }   // por objeto
    public void intreflps0a100(){
        int control = (int)(Math.random()*2);
        int v=(int)(Math.random()*vp1.length);
        switch (control){
            case 0:
                ps1 = "me "+ vp1[v];
                ps1eng = "I "+ vpe1[v];

                ps2= "te "+ vp2[v];
                ps2eng ="you "+vpe2[v];

                ps3= "él se "+ vp3[v];
                ps3eng ="he "+vpe3[v];

                ps3ella= "ella se "+vp3[v];
                ps3she= "she "+vpe3[v];

                ps3eso= "eso se "+vp3[v];
                ps3it="it "+vpe3[v];

                ps4= "se "+vp4[v];
                ps4eng = "they "+vpe4[v];

                ps5 = "nos "+vp5[v];
                ps5eng="we "+vpe5[v];
                break;

            case 1:
                ps1 = "me "+ vg1[v];
                ps1eng = "I get "+ vgeng[v];

                ps2= "te "+ vg2[v];
                ps2eng ="you get "+vgeng[v];

                ps3= "él se "+ vg3[v];
                ps3eng ="he gets "+vgeng[v];

                ps3ella= "ella se "+vg3[v];
                ps3she= "she gets "+vgeng[v];

                ps3eso= "eso se "+vg3[v];
                ps3it="it gets "+vgeng[v];

                ps4= "se "+vg4[v];
                ps4eng = "they get "+vgeng[v];

                ps5 = "nos "+vg5[v];
                ps5eng="we get "+vgeng[v];
                break;

            case 2:
                ps1 = "yo me " + vn1[v] + " a mi mismo " ;
                ps1eng = "I " + vnb[v] + " myself ";

                ps2 = "tú te " + vn2[v] +" a ti mismo ";
                ps2eng = "you " + vnb[v] + " yourself " ;

                ps3 = "él se " + vn3[v] + " a si mismo " ;
                ps3eng = "he " + vnb3[v] + " himself ";

                ps3ella = "ella se " + vn3[v]+ " a si misma ";
                ps3she = "she " + vnb3[v] + " herself ";

                ps3eso = "eso se " + vn3[v] + " a si mismo ";
                ps3it = "it " + vnb3[v] + " itself ";

                ps4 = "ellos se " + vn4[v] + " a si mismos ";
                ps4eng = "they " + vnb[v] + " themselves ";

                ps5 = "nosotros nos " + vn5[v]+ " a nosotros mismos ";
                ps5eng = "we " + vnb[v]+ " ourselves " ;
                break;

            case 3:
                ps1 = "no me "+ vp1[v];
                ps1eng = "I don´t "+ vpe1[v];

                ps2= "no te "+ vp2[v] ;
                ps2eng ="you don´t "+vpe2[v];

                ps3= "él no se "+ vp3[v];
                ps3eng ="he doesn´t "+vpe3[v];

                ps3ella= "ella no se "+vp3[v];
                ps3she= "she doesn´t "+vpe3[v];

                ps3eso= "eso no se "+vp3[v];
                ps3it="it doesn´t "+vpe3[v];

                ps4= "no se "+vp4[v];
                ps4eng = "they don´t "+vpe4[v];

                ps5 = "no nos "+vp5[v];
                ps5eng="we don´t "+vpe5[v];
                break;

            case 4:
                ps1 = "no me "+ vg1[v];
                ps1eng = "I get "+ vgeng[v];

                ps2= "no te "+ vg2[v];
                ps2eng ="you get "+vgeng[v];

                ps3= "él no se "+ vg3[v];
                ps3eng ="he gets "+vgeng[v];

                ps3ella= "ella no se "+vg3[v];
                ps3she= "she gets "+vgeng[v];

                ps3eso= "eso no se "+vg3[v];
                ps3it="it gets "+vgeng[v];

                ps4= "no se "+vg4[v];
                ps4eng = "they get "+vgeng[v];

                ps5 = "no nos "+vg5[v];
                ps5eng="we get "+vgeng[v];
                break;

            case 5:
                ps1 = "no me " + vn1[v] + " a mi mismo " ;
                ps1eng = "I don´t " + vnb[v] + " myself ";

                ps2 = "no te " + vn2[v] +" a ti mismo ";
                ps2eng = "you don´t " + vnb[v] + " yourself " ;

                ps3 = "él no se " + vn3[v] + " a si mismo " ;
                ps3eng = "he doesn´t " + vnb3[v] + " himself ";

                ps3ella = "ella no se " + vn3[v]+ " a si misma ";
                ps3she = "she doesn´t " + vnb3[v] + " herself ";

                ps3eso = "eso no se " + vn3[v] + " a si mismo ";
                ps3it = "it doesn´t " + vnb3[v] + " itself ";

                ps4 = "ellos no se " + vn4[v] + " a si mismos ";
                ps4eng = "they don´t " + vnb[v] + " themselves ";

                ps5 = "nosotros no nos " + vn5[v]+ " a nosotros mismos ";
                ps5eng = "we don´t " + vnb[v]+ " ourselves " ;
                break;
        }



    }    // por reflexivo, incluye pronominal y get , reflx normales
    public void intporpasiva0a100(){
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:

                ps3 = "se " + vn3[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2];
                ps3eng = "he " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3she = "she " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3it = "it " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps4eng = "they " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps1eng= "one " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps5eng="we " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];


                break;
            case 1 :

                ps3 = "no se " + vn3[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2];
                ps3eng = "he doesn´t " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3she = "she doesn´t " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3it = "it doesn´t " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps4eng = "they don´t " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps1eng= "one doesn´t " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps5eng="we don´t " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                break;

        }
    } // se pasiva

    //DIF 1
    //PRESENTES
    public void GenPresSimp1() {

        switch (neg) {
            case 0:
                ps1 = "yo " + vn1[v];
                ps1eng = "I " + vnb[v];

                ps2 = "tú " + vn2[v];
                ps2eng = "you " + vnb[v];

                ps3 = "él " + vnb3[v];
                ps3eng = "he " + vnb[v];

                ps3ella = "ella " + vnb3[v];
                ps3she = "she " + vnb[v];

                ps3eso = "eso " + vnb3[v];
                ps3it = "it " + vnb[v];

                ps4 = "ellos " + vn4[v];
                ps4eng = "they " + vnb[v];

                ps5 = "nosotros " + vn5[v];
                ps5eng = "we " + vnb[v];
                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v];
                ps1eng = "I " + "don't " + vnb[v];

                ps2 = "tú " + "no " + vn2[v];
                ps2eng = "you " + "don't " + vnb[v];

                ps3 = "él " + "no " + vnb3[v];
                ps3eng = "he " + "doesn't " + vnb[v];

                ps3ella = "ella " + "no " + vnb3[v];
                ps3she = "she " + "doesn't " + vnb[v];

                ps3eso = "eso " + "no " + vnb3[v];
                ps3it = "it " + "doesn't " + vnb[v];

                ps4 = "ellos " + "no " + vn4[v];
                ps4eng = "they " + "don't " + vnb[v];

                ps5 = "nosotros " + "no " + vn5[v];
                ps5eng = "we " + "don't " + vnb[v];
                break;

        }
    }//PD 10/06/2022
    public void GenPresCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estoy " + vnbcs[v];
                ps1eng = "I " + "am " + vnbc[v];

                ps2 = "tú " + "estás " + vnbcs[v];
                ps2eng = "you " + "are " + vnbc[v];

                ps3 = "él " + "está " + vnbcs[v];
                ps3eng = "he " + "is " + vnbc[v];

                ps3ella = "ella " + "está " + vnbcs[v];
                ps3she = "she " + "is " + vnbc[v];

                ps3eso = "eso " + "está " + vnbcs[v];
                ps3it = "it " + "is " + vnbc[v];

                ps4 = "ellos " + "están " + vnbcs[v];
                ps4eng = "they " + "are " + vnbc[v];

                ps5 = "nosotros " + "estamos " + vnbcs[v];
                ps5eng = "we " + "are " + vnbc[v];
                break;

            case 1:
                ps1 = "yo " + "no " + "estoy " + vnbcs[v];
                ps1eng = "I " + "am " + "not " + vnbc[v];

                ps2 = "tú " + "no " + "estás " + vnbcs[v];
                ps2eng = "you " + "are " + "not " + vnbc[v];

                ps3 = "él " + "no " + "está " + vnbcs[v];
                ps3eng = "he " + "is " + "not " + vnbc[v];

                ps3ella = "ella " + "no " + "está " + vnbcs[v];
                ps3she = "she " + "is " + "not " + vnbc[v];

                ps3eso = "eso " + "no " + "está " + vnbcs[v];
                ps3it = "it " + "is " + "not " + vnbc[v];

                ps4 = "ellos no " + "están " + vnbcs[v];
                ps4eng = "they " + "are not " + vnbc[v];

                ps5 = "nosotros no " + "estamos " + vnbcs[v];
                ps5eng = "we " + "are not " + vnbc[v];
                break;
        }
    }//PD 10/06/2022
    public void GenPresPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he " + vpsp[v];
                ps1eng = "I " + "have " + vpeng[v];

                ps2 = "tú " + "has " + vpsp[v];
                ps2eng = "you " + "have " + vpeng[v];

                ps3 = "él " + "ha " + vpsp[v];
                ps3eng = "he " + "has " + vpeng[v];

                ps3ella = "ella " + "ha " + vpsp[v];
                ps3she = "she " + "has " + vpeng[v];

                ps3eso = "eso " + "ha " + vpsp[v];
                ps3it = "it " + "has " + vpeng[v];

                ps4 = "ellos " + "han " + vpsp[v];
                ps4eng = "they " + "have " + vpeng[v];

                ps5 = "nosotros " + "hemos " + vpsp[v];
                ps5eng = "we " + "have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "he " + vpsp[v];
                ps1eng = "I " + "haven't " + vpeng[v];

                ps2 = "tú no " + "has " + vpsp[v];
                ps2eng = "you " + "haven't " + vpeng[v];

                ps3 = "él no " + "ha " + vpsp[v];
                ps3eng = "he " + "hasn't " + vpeng[v];

                ps3ella = "ella no " + "ha " + vpsp[v];
                ps3she = "she " + "hasn't " + vpeng[v];

                ps3eso = "eso no " + "ha " + vpsp[v];
                ps3it = "it " + "hasn't " + vpeng[v];

                ps4 = "ellos no " + "han " + vpsp[v];
                ps4eng = "they " + "haven't " + vpeng[v];

                ps5 = "nosotros no " + "hemos " + vpsp[v];
                ps5eng = "we " + "haven't " + vpeng[v];

                break;
        }
    }//PD 10/06/2022
    public void GenPresPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he estado " + vnbcs[v];
                ps1eng = "I " + "have been " + vnbc[v];

                ps2 = "tú " + "has estado " + vnbcs[v];
                ps2eng = "you " + "have been " + vnbc[v];

                ps3 = "él " + "ha estado " + vnbcs[v];
                ps3eng = "he " + "has been " + vnbc[v];

                ps3ella = "ella " + "ha estado " + vnbcs[v];
                ps3she = "she " + "has been " + vnbc[v];

                ps3eso = "eso " + "ha estado " + vnbcs[v];
                ps3it = "it " + "has been " + vnbc[v];

                ps4 = "ellos " + "han estado " + vnbcs[v];
                ps4eng = "they " + "have been " + vnbc[v];

                ps5 = "nosotros " + "hemos estado " + vnbcs[v];
                ps5eng = "we " + "have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v];
                ps1eng = "I " + "haven´t been " + vnbc[v];

                ps2 = "tú no " + "has estado " + vnbcs[v];
                ps2eng = "you " + "haven´t been " + vnbc[v];

                ps3 = "él no " + "ha estado " + vnbcs[v];
                ps3eng = "he " + "has not been " + vnbc[v];

                ps3ella = "ella no " + "ha estado " + vnbcs[v];
                ps3she = "she " + "has not been " + vnbc[v];

                ps3eso = "eso no " + "ha estado " + vnbcs[v];
                ps3it = "it " + "has not been " + vnbc[v];

                ps4 = "ellos no " + "han estado " + vnbcs[v];
                ps4eng = "they " + "haven´t been " + vnbc[v];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v];
                ps5eng = "we " + "haven´t been " + vnbc[v];

                break;
        }
    }//PD 10/06/2022

    //PASADOS
    public void GenPassSimp1() {
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo " + ps1pre[v] ;
                    ps1eng = "I " + vnbp[v] ;

                    ps2 = "tú " + ps2pre[v] ;
                    ps2eng = "you " + vnbp[v] ;

                    ps3 = "él " + ps3p[v] ;
                    ps3eng = "he " + vnbp[v] ;

                    ps3ella = "ella " + ps3p[v] ;
                    ps3she = "she " + vnbp[v] ;

                    ps3eso = "eso " + ps3p[v] ;
                    ps3it = "it " + vnbp[v] ;

                    ps4 = "ellos " + vn4p[v] ;
                    ps4eng = "they " + vnbp[v] ;

                    ps5 = "nosotros " + vn5p[v] ;
                    ps5eng = "we " + vnbp[v] ;
                } else {
                    ps1 = "yo " + ps1imp[v] ;
                    ps1eng = "I " + vnbp[v] ;

                    ps2 = "tú " + ps2imp[v] ;
                    ps2eng = "you " + vnbp[v] ;

                    ps3 = "él " + ps3imp[v] ;
                    ps3eng = "he " + vnbp[v] ;

                    ps3ella = "ella " + ps3imp[v] ;
                    ps3she = "she " + vnbp[v] ;

                    ps3eso = "eso " + ps3imp[v] ;
                    ps3it = "it " + vnbp[v] ;

                    ps4 = "ellos " + vn4imp[v] ;
                    ps4eng = "they " + vnbp[v] ;

                    ps5 = "nosotros " + vn5imp[v] ;
                    ps5eng = "we " + vnbp[v] ;
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no " + ps1pre[v] ;
                    ps1eng = "I " + "didn't " + vnb[v] ;

                    ps2 = "tú " + "no " + ps2pre[v] ;
                    ps2eng = "you " + "didn't " + vnb[v] ;

                    ps3 = "él " + "no " + ps3p[v] ;
                    ps3eng = "he " + "didn't " + vnb[v] ;

                    ps3ella = "ella " + "no " + ps3p[v] ;
                    ps3she = "she " + "didn't " + vnb[v] ;

                    ps3eso = "eso " + "no " + ps3p[v] ;
                    ps3it = "it " + "didn't " + vnb[v] ;

                    ps4 = "ellos " + "no " + vn4p[v] ;
                    ps4eng = "they " + "didn't " + vnb[v] ;

                    ps5 = "nosotros " + "no " + vn5p[v] ;
                    ps5eng = "we " + "didn't " + vnb[v] ;
                } else {
                    ps1 = "yo " + "no " + ps1imp[v] ;
                    ps1eng = "I " + "didn't " + vnb[v] ;

                    ps2 = "tú " + "no " + ps2imp[v] ;
                    ps2eng = "you " + "didn't " + vnb[v] ;

                    ps3 = "él " + "no " + ps3imp[v] ;
                    ps3eng = "he " + "didn't " + vnb[v] ;

                    ps3ella = "ella " + "no " + ps3imp[v] ;
                    ps3she = "she " + "didn't " + vnb[v] ;

                    ps3eso = "eso " + "no " + ps3imp[v] ;
                    ps3it = "it " + "didn't " + vnb[v] ;

                    ps4 = "ellos " + "no " + vn4imp[v] ;
                    ps4eng = "they " + "didn't " + vnb[v] ;

                    ps5 = "nosotros " + "no " + vn5imp[v] ;
                    ps5eng = "we " + "didn't " + vnb[v] ;
                }
                break;

        }
    }//PD 10/06/2022
    public void GenPassCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaba " + vnbcs[v];
                ps1eng = "I " + "was " + vnbc[v];

                ps2 = "tú " + "estabas " + vnbcs[v];
                ps2eng = "you " + "were " + vnbc[v];

                ps3 = "él " + "estaba " + vnbcs[v];
                ps3eng = "he " + "was " + vnbc[v];

                ps3ella = "ella " + "estaba " + vnbcs[v];
                ps3she = "she " + "was " + vnbc[v];

                ps3eso = "eso " + "estaba " + vnbcs[v];
                ps3it = "it " + "was " + vnbc[v];

                ps4 = "ellos " + "estaban " + vnbcs[v];
                ps4eng = "they " + "were " + vnbc[v];

                ps5 = "nosotros " + "estabamos " + vnbcs[v];
                ps5eng = "we " + "were " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v];
                ps1eng = "I " + "wasn´t " + vnbc[v];

                ps2 = "tú no " + "estabas " + vnbcs[v];
                ps2eng = "you " + "weren´t " + vnbc[v];

                ps3 = "él no " + "estaba " + vnbcs[v];
                ps3eng = "he " + "wasn´t " + vnbc[v];

                ps3ella = "ella no " + "estaba " + vnbcs[v];
                ps3she = "she " + "wasn´t " + vnbc[v];

                ps3eso = "eso no " + "estaba " + vnbcs[v];
                ps3it = "it " + "wasn´t " + vnbc[v];

                ps4 = "ellos no " + "estaban " + vnbcs[v];
                ps4eng = "they " + "weren´t " + vnbc[v];

                ps5 = "nosotros no " + "estabamos " + vnbcs[v];
                ps5eng = "we " + "weren´t " + vnbc[v];
                break;
        }
    }//PD 10/06/2022
    public void GenPassPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "había " + vpsp[v];
                ps1eng = "I " + "had " + vpeng[v];

                ps2 = "tú " + "habías " + vpsp[v];
                ps2eng = "you " + "had " + vpeng[v];

                ps3 = "él " + "había " + vpsp[v];
                ps3eng = "he " + "had " + vpeng[v];

                ps3ella = "ella " + "había " + vpsp[v];
                ps3she = "she " + "had " + vpeng[v];

                ps3eso = "eso " + "había " + vpsp[v];
                ps3it = "it " + "had " + vpeng[v];

                ps4 = "ellos " + "habían " + vpsp[v];
                ps4eng = "they " + "had " + vpeng[v];

                ps5 = "nosotros " + "habíamos " + vpsp[v];
                ps5eng = "we " + "had " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "había " + vpsp[v];
                ps1eng = "I " + "had not " + vpeng[v];

                ps2 = "tú no " + "habías " + vpsp[v];
                ps2eng = "you " + "had not " + vpeng[v];

                ps3 = "él no " + "había " + vpsp[v];
                ps3eng = "he " + "had not " + vpeng[v];

                ps3ella = "ella no " + "había " + vpsp[v];
                ps3she = "she " + "had not " + vpeng[v];

                ps3eso = "eso no " + "había " + vpsp[v];
                ps3it = "it " + "had not " + vpeng[v];

                ps4 = "ellos no " + "habían " + vpsp[v];
                ps4eng = "they " + "had not " + vpeng[v];

                ps5 = "nosotros no " + "habíamos " + vpsp[v];
                ps5eng = "we " + "had not " + vpeng[v];

                break;
        }
    }//PD 10/06/2022
    public void GenPassPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "había estado " + vnbcs[v];
                ps1eng = "I " + "had been " + vnbc[v];

                ps2 = "tú " + "había estado " + vnbcs[v];
                ps2eng = "you " + "had been " + vnbc[v];

                ps3 = "él " + "había estado " + vnbcs[v];
                ps3eng = "he " + "had been " + vnbc[v];

                ps3ella = "ella " + "había estado " + vnbcs[v];
                ps3she = "she " + "had been " + vnbc[v];

                ps3eso = "eso " + "había estado " + vnbcs[v];
                ps3it = "it " + "had been " + vnbc[v];

                ps4 = "ellos " + "habían estado " + vnbcs[v];
                ps4eng = "they " + "had been " + vnbc[v];

                ps5 = "nosotros " + "habíamos estado " + vnbcs[v];
                ps5eng = "we " + "had been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v];
                ps1eng = "I " + "had not been " + vnbc[v];

                ps2 = "tú no " + "había estado " + vnbcs[v];
                ps2eng = "you " + "had not been " + vnbc[v];

                ps3 = "él no " + "había estado " + vnbcs[v];
                ps3eng = "he " + "had not been " + vnbc[v];

                ps3ella = "ella no " + "había estado " + vnbcs[v];
                ps3she = "she " + "had not been " + vnbc[v];

                ps3eso = "eso no " + "había estado " + vnbcs[v];
                ps3it = "it " + "had not been " + vnbc[v];

                ps4 = "ellos no " + "habían estado " + vnbcs[v];
                ps4eng = "they " + "had not been " + vnbc[v];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v];
                ps5eng = "we " + "had not been " + vnbc[v];
                break;
        }
    }//PD 10/06/2022

    //FUTUROS
    public void GenFutSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1f[v];
                ps1eng = "I " + "will " + vnb[v];

                ps2 = "tú " + vn2f[v];
                ps2eng = "you " + "will " + vnb[v];

                ps3 = "él " + vn3f[v];
                ps3eng = "he " + "will " + vnb[v];

                ps3ella = "ella " + vn3f[v];
                ps3she = "she " + "will " + vnb[v];

                ps3eso = "eso " + vn3f[v];
                ps3it = "it " + "will " + vnb[v];

                ps4 = "ellos " + vn4f[v];
                ps4eng = "they " + "will " + vnb[v];

                ps5 = "nosotros " + vn5f[v];
                ps5eng = "we " + "will " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + vn1f[v];
                ps1eng = "I " + "won't " + vnb[v];

                ps2 = "tú no " + vn2f[v];
                ps2eng = "you " + "won't " + vnb[v];

                ps3 = "él no " + vn3f[v];
                ps3eng = "he " + "won't " + vnb[v];

                ps3ella = "ella no " + vn3f[v];
                ps3she = "she " + "won't " + vnb[v];

                ps3eso = "eso no " + vn3f[v];
                ps3it = "it " + "won't " + vnb[v];

                ps4 = "ellos no " + vn4f[v];
                ps4eng = "they " + "won't " + vnb[v];

                ps5 = "nosotros no " + vn5f[v];
                ps5eng = "we " + "won't " + vnb[v];
                break;
        }
    }//PD 10/06/2022
    public void GenFutCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaré " + vnbcs[v];
                ps1eng = "I " + "will " + "be " + vnbc[v];

                ps2 = "tú " + "estarás " + vnbcs[v];
                ps2eng = "you " + "will " + "be " + vnbc[v];

                ps3 = "él " + "estará " + vnbcs[v];
                ps3eng = "he " + "will be " + vnbc[v];

                ps3ella = "ella estará " + vnbcs[v];
                ps3she = "she " + "will be " + vnbc[v];

                ps3eso = "eso estará " + vnbcs[v];
                ps3it = "it " + "will be " + vnbc[v];

                ps4 = "ellos estarán " + vnbcs[v];
                ps4eng = "they " + "will be " + vnbc[v];

                ps5 = "nosotros estarémos " + vnbcs[v];
                ps5eng = "we " + "will be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v];
                ps1eng = "I " + "won't " + "be " + vnbc[v];

                ps2 = "tú no " + "estarás " + vnbcs[v];
                ps2eng = "you " + "won't " + "be " + vnbc[v];

                ps3 = "él no " + "estará " + vnbcs[v];
                ps3eng = "he " + "won't be " + vnbc[v];

                ps3ella = "ella no estará " + vnbcs[v];
                ps3she = "she " + "won't be " + vnbc[v];

                ps3eso = "eso no estará " + vnbcs[v];
                ps3it = "it " + "won't be " + vnbc[v];

                ps4 = "ellos no estarán " + vnbcs[v];
                ps4eng = "they " + "won't be " + vnbc[v];

                ps5 = "nosotros no estarémos " + vnbcs[v];
                ps5eng = "we " + "won't be " + vnbc[v];
                break;
        }
    }//PD 10/06/2022
    public void GenFutPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré " + vpsp[v];
                ps1eng = "I " + "will have " + vpeng[v];

                ps2 = "tú " + "habrás " + vpsp[v];
                ps2eng = "you " + "will have " + vpeng[v];

                ps3 = "él " + "habrá " + vpsp[v];
                ps3eng = "he " + "will have " + vpeng[v];

                ps3ella = "ella habrá " + vpsp[v];
                ps3she = "she " + "will have " + vpeng[v];

                ps3eso = "eso habrá " + vpsp[v];
                ps3it = "it " + "will have " + vpeng[v];

                ps4 = "ellos habrán " + vpsp[v];
                ps4eng = "they " + "will have " + vpeng[v];

                ps5 = "nosotros habrémos " + vpsp[v];
                ps5eng = "we " + "will have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v];
                ps1eng = "I " + "won't have " + vpeng[v];

                ps2 = "tú no " + "habrás " + vpsp[v];
                ps2eng = "you " + "won't have " + vpeng[v];

                ps3 = "él no " + "habrá " + vpsp[v];
                ps3eng = "he " + "won't have " + vpeng[v];

                ps3ella = "ella no habrá " + vpsp[v];
                ps3she = "she " + "won't have " + vpeng[v];

                ps3eso = "eso no habrá " + vpsp[v];
                ps3it = "it " + "won't have " + vpeng[v];

                ps4 = "ellos no habrán " + vpsp[v];
                ps4eng = "they " + "won't have " + vpeng[v];

                ps5 = "nosotros no habrémos " + vpsp[v];
                ps5eng = "we " + "won't have " + vpeng[v];

                break;
        }
    }//PD 10/06/2022
    public void GenFutPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré estado " + vnbcs[v];
                ps1eng = "I " + "will have been " + vnbc[v];

                ps2 = "tú " + "habrás estado " + vnbcs[v];
                ps2eng = "you " + "will have been " + vnbc[v];

                ps3 = "él " + "habrá estado " + vnbcs[v];
                ps3eng = "he " + "will have been " + vnbc[v];

                ps3ella = "ella habrá estado " + vnbcs[v];
                ps3she = "she " + "will have been " + vnbc[v];

                ps3eso = "eso habrá estado " + vnbcs[v];
                ps3it = "it " + "will have been " + vnbc[v];

                ps4 = "ellos habrán estado " + vnbcs[v];
                ps4eng = "they " + "will have been " + vnbc[v];

                ps5 = "nosotros habrémos estado " + vnbcs[v];
                ps5eng = "we " + "will have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v];
                ps1eng = "I " + "won't have been " + vnbc[v];

                ps2 = "tú no " + "habrás estado " + vnbcs[v];
                ps2eng = "you " + "won't have been " + vnbc[v];

                ps3 = "él no " + "habrá estado " + vnbcs[v];
                ps3eng = "he " + "won't have been " + vnbc[v];

                ps3ella = "ella no habrá estado " + vnbcs[v];
                ps3she = "she " + "won't have been " + vnbc[v];

                ps3eso = "eso no habrá estado " + vnbcs[v];
                ps3it = "it " + "won't have been " + vnbc[v];

                ps4 = "ellos no habrán estado " + vnbcs[v];
                ps4eng = "they " + "won't have been " + vnbc[v];

                ps5 = "nosotros no habrémos estado " + vnbcs[v];
                ps5eng = "we " + "won't have been " + vnbc[v];
                break;
        }
    }//PD 10/06/2022

    //WOULD
    public void GenWouldSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1w[v];
                ps1eng = "I " + "would " + vnb[v];

                ps2 = "tú " + vn2w[v];
                ps2eng = "you " + "would " + vnb[v];

                ps3 = "él " + vn3w[v];
                ps3eng = "he " + "would " + vnb[v];

                ps3ella = "ella " + vn3w[v];
                ps3she = "she " + "would " + vnb[v];

                ps3eso = "eso " + vn3w[v];
                ps3it = "it " + "would " + vnb[v];

                ps4 = "ellos " + vn4w[v];
                ps4eng = "they " + "would " + vnb[v];

                ps5 = "nosotros " + vn5w[v];
                ps5eng = "we " + "would " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + vn1w[v];
                ps1eng = "I " + "wouldn't " + vnb[v];

                ps2 = "tú no " + vn2w[v];
                ps2eng = "you " + "wouldn't " + vnb[v];

                ps3 = "él no " + vn3w[v];
                ps3eng = "he " + "wouldn't " + vnb[v];

                ps3ella = "ella no " + vn3w[v];
                ps3she = "she " + "wouldn't " + vnb[v];

                ps3eso = "eso no " + vn3w[v];
                ps3it = "it " + "wouldn't " + vnb[v];

                ps4 = "ellos no " + vn4w[v];
                ps4eng = "they " + "wouldn't " + vnb[v];

                ps5 = "nosotros no " + vn5w[v];
                ps5eng = "we " + "wouldn't " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenWouldCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaría " + vnbcs[v];
                ps1eng = "I " + "would " + "be " + vnbc[v];

                ps2 = "tú " + "estarías " + vnbcs[v];
                ps2eng = "you " + "would " + "be " + vnbc[v];

                ps3 = "él " + "estaría " + vnbcs[v];
                ps3eng = "he " + "would be " + vnbc[v];

                ps3ella = "ella estaría " + vnbcs[v];
                ps3she = "she " + "would be " + vnbc[v];

                ps3eso = "eso estaría " + vnbcs[v];
                ps3it = "it " + "would be " + vnbc[v];

                ps4 = "ellos estarían " + vnbcs[v];
                ps4eng = "they " + "would be " + vnbc[v];

                ps5 = "nosotros estaríamos " + vnbcs[v];
                ps5eng = "we " + "would be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v];
                ps1eng = "I " + "wouldn't " + "be " + vnbc[v];

                ps2 = "tú no " + "estarías " + vnbcs[v];
                ps2eng = "you " + "wouldn't " + "be " + vnbc[v];

                ps3 = "él no " + "estaría " + vnbcs[v];
                ps3eng = "he " + "wouldn't be " + vnbc[v];

                ps3ella = "ella no estaría " + vnbcs[v];
                ps3she = "she " + "wouldn't be " + vnbc[v];

                ps3eso = "eso no estaría " + vnbcs[v];
                ps3it = "it " + "wouldn't be " + vnbc[v];

                ps4 = "ellos no estarían " + vnbcs[v];
                ps4eng = "they " + "wouldn't be " + vnbc[v];

                ps5 = "nosotros no estaríamos " + vnbcs[v];
                ps5eng = "we " + "wouldn't be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenWouldPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera " + vpsp[v];
                ps1eng = "I " + "would have " + vpeng[v];

                ps2 = "tú " + "hubieras " + vpsp[v];
                ps2eng = "you " + "would have " + vpeng[v];

                ps3 = "él " + "hubiera " + vpsp[v];
                ps3eng = "he " + "would have " + vpeng[v];

                ps3ella = "ella hubiera " + vpsp[v];
                ps3she = "she " + "would have " + vpeng[v];

                ps3eso = "eso hubiera " + vpsp[v];
                ps3it = "it " + "would have " + vpeng[v];

                ps4 = "ellos hubieran " + vpsp[v];
                ps4eng = "they " + "would have " + vpeng[v];

                ps5 = "nosotros hubieramos " + vpsp[v];
                ps5eng = "we " + "would have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v];
                ps1eng = "I " + "wouldn't have " + vpeng[v];

                ps2 = "tú no " + "hubieras " + vpsp[v];
                ps2eng = "you " + "wouldn't have " + vpeng[v];

                ps3 = "él no " + "hubiera " + vpsp[v];
                ps3eng = "he " + "wouldn't have " + vpeng[v];

                ps3ella = "ella no hubiera " + vpsp[v];
                ps3she = "she " + "wouldn't have " + vpeng[v];

                ps3eso = "eso no hubiera " + vpsp[v];
                ps3it = "it " + "wouldn't have " + vpeng[v];

                ps4 = "ellos no hubieran " + vpsp[v];
                ps4eng = "they " + "wouldn't have " + vpeng[v];

                ps5 = "nosotros no hubieramos " + vpsp[v];
                ps5eng = "we " + "wouldn't have " + vpeng[v];
                break;
        }
    }//PD 13/06/2022
    public void GenWouldPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera estado " + vnbcs[v];
                ps1eng = "I " + "would have been " + vnbc[v];

                ps2 = "tú " + "hubieras estado " + vnbcs[v];
                ps2eng = "you " + "would have been " + vnbc[v];

                ps3 = "él " + "hubiera estado " + vnbcs[v];
                ps3eng = "he " + "would have been " + vnbc[v];

                ps3ella = "ella hubiera estado " + vnbcs[v];
                ps3she = "she " + "would have been " + vnbc[v];

                ps3eso = "eso hubiera estado " + vnbcs[v];
                ps3it = "it " + "would have been " + vnbc[v];

                ps4 = "ellos hubieran estado " + vnbcs[v];
                ps4eng = "they " + "would have been " + vnbc[v];

                ps5 = "nosotros hubieramos estado " + vnbcs[v];
                ps5eng = "we " + "would have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v];
                ps1eng = "I " + "wouldn't have been " + vnbc[v];

                ps2 = "tú no " + "hubieras estado " + vnbcs[v];
                ps2eng = "you " + "wouldn't have been " + vnbc[v];

                ps3 = "él no " + "hubiera estado " + vnbcs[v];
                ps3eng = "he " + "wouldn't have been " + vnbc[v];

                ps3ella = "ella no hubiera estado " + vnbcs[v];
                ps3she = "she " + "wouldn't have been " + vnbc[v];

                ps3eso = "eso no hubiera estado " + vnbcs[v];
                ps3it = "it " + "wouldn't have been " + vnbc[v];

                ps4 = "ellos no hubieran estado " + vnbcs[v];
                ps4eng = "they " + "wouldn't have been " + vnbc[v];

                ps5 = "nosotros no hubieramos estado " + vnbcs[v];
                ps5eng = "we " + "wouldn't have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //COULD
    public void GenCouldSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "podría " + vnbs[v];
                ps1eng = "I " + "could " + vnb[v];

                ps2 = "tú " + "podrías " + vnbs[v];
                ps2eng = "you " + "could " + vnb[v];

                ps3 = "él " + "podría " + vnbs[v];
                ps3eng = "he " + "could " + vnb[v];

                ps3ella = "ella " + "podría " + vnbs[v];
                ps3she = "she " + "could " + vnb[v];

                ps3eso = "eso " + "podría " + vnbs[v];
                ps3it = "it " + "could " + vnb[v];

                ps4 = "ellos " + "podrían " + vnbs[v];
                ps4eng = "they " + "could " + vnb[v];

                ps5 = "nosotros " + "podríamos " + vnbs[v];
                ps5eng = "we " + "could " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "podría " + vnbs[v];
                ps1eng = "I " + "couldn't " + vnb[v];

                ps2 = "tú no " + "podrías " + vnbs[v];
                ps2eng = "you " + "couldn't " + vnb[v];

                ps3 = "él no " + "podría " + vnbs[v];
                ps3eng = "he " + "couldn't " + vnb[v];

                ps3ella = "ella no " + "podría " + vnbs[v];
                ps3she = "she " + "couldn't " + vnb[v];

                ps3eso = "eso no " + "podría " + vnbs[v];
                ps3it = "it " + "couldn't " + vnb[v];

                ps4 = "ellos no " + "podrían " + vnbs[v];
                ps4eng = "they " + "couldn't " + vnb[v];

                ps5 = "nosotros no " + "podríamos " + vnbs[v];
                ps5eng = "we " + "couldn't " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenCouldCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "podría estar " + vnbcs[v];
                ps1eng = "I " + "could " + "be " + vnbc[v];

                ps2 = "tú " + "podrías estar " + vnbcs[v];
                ps2eng = "you " + "could " + "be " + vnbc[v];

                ps3 = "él " + "podría estar " + vnbcs[v];
                ps3eng = "he " + "could be " + vnbc[v];

                ps3ella = "ella podría estar " + vnbcs[v];
                ps3she = "she " + "could be " + vnbc[v];

                ps3eso = "eso podría estar " + vnbcs[v];
                ps3it = "it " + "could be " + vnbc[v];

                ps4 = "ellos podrían estar " + vnbcs[v];
                ps4eng = "they " + "could be " + vnbc[v];

                ps5 = "nosotros podríamos estar " + vnbcs[v];
                ps5eng = "we " + "could be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "podría estar " + vnbcs[v];
                ps1eng = "I " + "couldn't " + "be " + vnbc[v];

                ps2 = "tú no " + "podrías estar " + vnbcs[v];
                ps2eng = "you " + "couldn't " + "be " + vnbc[v];

                ps3 = "él no " + "podría estar " + vnbcs[v];
                ps3eng = "he " + "couldn't be " + vnbc[v];

                ps3ella = "ella no podría estar " + vnbcs[v];
                ps3she = "she " + "couldn't be " + vnbc[v];

                ps3eso = "eso no podría estar " + vnbcs[v];
                ps3it = "it " + "couldn't be " + vnbc[v];

                ps4 = "ellos no podrían estar " + vnbcs[v];
                ps4eng = "they " + "couldn't be " + vnbc[v];

                ps5 = "nosotros no podríamos estar " + vnbcs[v];
                ps5eng = "we " + "couldn't be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenCouldPerf1() {
        switch (neg) {

            case 0:
                ps1 = "yo " + "pude haber " + vpsp[v];
                ps1eng = "I " + "could have " + vpeng[v];

                ps2 = "tú " + "pudiste haber " + vpsp[v];
                ps2eng = "you " + "could have " + vpeng[v];

                ps3 = "él " + "pudo haber " + vpsp[v];
                ps3eng = "he " + "could have " + vpeng[v];

                ps3ella = "ella pudo haber " + vpsp[v];
                ps3she = "she " + "could have " + vpeng[v];

                ps3eso = "eso pudo haber " + vpsp[v];
                ps3it = "it " + "could have " + vpeng[v];

                ps4 = "ellos pudieron haber " + vpsp[v];
                ps4eng = "they " + "could have " + vpeng[v];

                ps5 = "nosotros pudimos haber " + vpsp[v];
                ps5eng = "we " + "could have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "pude haber " + vpsp[v];
                ps1eng = "I " + "couldn't have " + vpeng[v];

                ps2 = "tú no " + "pudiste haber " + vpsp[v];
                ps2eng = "you " + "couldn't have " + vpeng[v];

                ps3 = "él no " + "pudo haber " + vpsp[v];
                ps3eng = "he " + "couldn't have " + vpeng[v];

                ps3ella = "ella no pudo haber " + vpsp[v];
                ps3she = "she " + "couldn't have " + vpeng[v];

                ps3eso = "eso no pudo haber " + vpsp[v];
                ps3it = "it " + "couldn't have " + vpeng[v];

                ps4 = "ellos no pudieron haber " + vpsp[v];
                ps4eng = "they " + "couldn't have " + vpeng[v];

                ps5 = "nosotros no pudimos haber " + vpsp[v];
                ps5eng = "we " + "couldn't have " + vpeng[v];

                break;
        }
    }//PD 13/06/2022
    public void GenCouldPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "pude haber estado " + vnbcs[v];
                ps1eng = "I " + "could have been " + vnbc[v];

                ps2 = "tú " + "pudiste haber estado " + vnbcs[v];
                ps2eng = "you " + "could have been " + vnbc[v];

                ps3 = "él " + "pudo haber estado " + vnbcs[v];
                ps3eng = "he " + "could have been " + vnbc[v];

                ps3ella = "ella pudo haber estado " + vnbcs[v];
                ps3she = "she " + "could have been " + vnbc[v];

                ps3eso = "eso pudo haber estado " + vnbcs[v];
                ps3it = "it " + "could have been " + vnbc[v];

                ps4 = "ellos pudieron haber estado " + vnbcs[v];
                ps4eng = "they " + "could have been " + vnbc[v];

                ps5 = "nosotros " + "pudimos haber estado " + vnbcs[v];
                ps5eng = "we " + "could have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v];
                ps1eng = "I " + "couldn't have been " + vnbc[v];

                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v];
                ps2eng = "you " + "couldn't have been " + vnbc[v];

                ps3 = "él no " + "pudo haber estado " + vnbcs[v];
                ps3eng = "he " + "couldn't have been " + vnbc[v];

                ps3ella = "ella no pudo haber estado " + vnbcs[v];
                ps3she = "she " + "couldn't have been " + vnbc[v];

                ps3eso = "eso no pudo haber estado " + vnbcs[v];
                ps3it = "it " + "couldn't have been " + vnbc[v];

                ps4 = "ellos no pudieron haber estado " + vnbcs[v];
                ps4eng = "they " + "couldn't have been " + vnbc[v];

                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v];
                ps5eng = "we " + "couldn't have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //SHOULD
    public void GenShouldSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debería " + vnbs[v];
                ps1eng = "I " + "should " + vnb[v];

                ps2 = "tú " + "deberías " + vnbs[v];
                ps2eng = "you " + "should " + vnb[v];

                ps3 = "él " + "debería " + vnbs[v];
                ps3eng = "he " + "should " + vnb[v];

                ps3ella = "ella " + "debería " + vnbs[v];
                ps3she = "she " + "should " + vnb[v];

                ps3eso = "eso " + "debería " + vnbs[v];
                ps3it = "it " + "should " + vnb[v];

                ps4 = "ellos " + "deberían " + vnbs[v];
                ps4eng = "they " + "should " + vnb[v];

                ps5 = "nosotros " + "deberíamos " + vnbs[v];
                ps5eng = "we " + "should " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "debería " + vnbs[v];
                ps1eng = "I " + "should not " + vnb[v];

                ps2 = "tú no " + "deberías " + vnbs[v];
                ps2eng = "you " + "should not " + vnb[v];

                ps3 = "él no " + "debería " + vnbs[v];
                ps3eng = "he " + "should not " + vnb[v];

                ps3ella = "ella no " + "debería " + vnbs[v];
                ps3she = "she " + "should not " + vnb[v];

                ps3eso = "eso no " + "debería " + vnbs[v];
                ps3it = "it " + "should not " + vnb[v];

                ps4 = "ellos no " + "deberían " + vnbs[v];
                ps4eng = "they " + "should not " + vnb[v];

                ps5 = "nosotros no " + "deberíamos " + vnbs[v];
                ps5eng = "we " + "should not " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenShouldCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debería estar " + vnbcs[v];
                ps1eng = "I " + "should " + "be " + vnbc[v];

                ps2 = "tú " + "deberías estar " + vnbcs[v];
                ps2eng = "you " + "should " + "be " + vnbc[v];

                ps3 = "él " + "debería estar " + vnbcs[v];
                ps3eng = "he " + "should be " + vnbc[v];

                ps3ella = "ella debería estar " + vnbcs[v];
                ps3she = "she " + "should be " + vnbc[v];

                ps3eso = "eso debería estar " + vnbcs[v];
                ps3it = "it " + "should be " + vnbc[v];

                ps4 = "ellos deberían estar " + vnbcs[v];
                ps4eng = "they " + "should be " + vnbc[v];

                ps5 = "nosotros deberíamos estar " + vnbcs[v];
                ps5eng = "we " + "should be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "debería estar " + vnbcs[v];
                ps1eng = "I " + "should not " + "be " + vnbc[v];

                ps2 = "tú no " + "deberías estar " + vnbcs[v];
                ps2eng = "you " + "should not " + "be " + vnbc[v];

                ps3 = "él no " + "debería estar " + vnbcs[v];
                ps3eng = "he " + "should not be " + vnbc[v];

                ps3ella = "ella no debería estar " + vnbcs[v];
                ps3she = "she " + "should not be " + vnbc[v];

                ps3eso = "eso no debería estar " + vnbcs[v];
                ps3it = "it " + "should not be " + vnbc[v];

                ps4 = "ellos no deberían estar " + vnbcs[v];
                ps4eng = "they " + "should not be " + vnbc[v];

                ps5 = "nosotros no deberíamos estar " + vnbcs[v];
                ps5eng = "we " + "should not be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenShouldPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber " + vpsp[v];
                ps1eng = "I " + "should have " + vpeng[v];

                ps2 = "tú " + "debíste haber " + vpsp[v];
                ps2eng = "you " + "should have " + vpeng[v];

                ps3 = "él " + "debío haber " + vpsp[v];
                ps3eng = "he " + "should have " + vpeng[v];

                ps3ella = "ella debío haber " + vpsp[v];
                ps3she = "she " + "should have " + vpeng[v];

                ps3eso = "eso " + "debío haber " + vpsp[v];
                ps3it = "it " + "should have " + vpeng[v];

                ps4 = "ellos debíeron haber " + vpsp[v];
                ps4eng = "they " + "should have " + vpeng[v];

                ps5 = "nosotros debímos haber " + vpsp[v];
                ps5eng = "we " + "should have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "debí haber " + vpsp[v];
                ps1eng = "I " + "should not have " + vpeng[v];

                ps2 = "tú no " + "debíste haber " + vpsp[v];
                ps2eng = "you " + "should not have " + vpeng[v];

                ps3 = "él no " + "debío haber " + vpsp[v];
                ps3eng = "he " + "should not have " + vpeng[v];

                ps3ella = "ella no debío haber " + vpsp[v];
                ps3she = "she " + "should not have " + vpeng[v];

                ps3eso = "eso no " + "debío haber " + vpsp[v];
                ps3it = "it " + "should not have " + vpeng[v];

                ps4 = "ellos no debíeron haber " + vpsp[v];
                ps4eng = "they " + "should not have " + vpeng[v];

                ps5 = "nosotros no debímos haber " + vpsp[v];
                ps5eng = "we " + "should not have " + vpeng[v];
                break;
        }
    }//PD 13/06/2022
    public void GenShouldPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber estado " + vnbcs[v];
                ps1eng = "I " + "should have been " + vnbc[v];

                ps2 = "tú " + "debiste haber estado " + vnbcs[v];
                ps2eng = "you " + "should have been " + vnbc[v];

                ps3 = "él " + "debió haber estado " + vnbcs[v];
                ps3eng = "he " + "should have been " + vnbc[v];

                ps3ella = "ella debió haber estado " + vnbcs[v];
                ps3she = "she " + "should have been " + vnbc[v];

                ps3eso = "eso debió haber estado " + vnbcs[v];
                ps3it = "it " + "should have been " + vnbc[v];

                ps4 = "ellos debieron haber estado " + vnbcs[v];
                ps4eng = "they " + "should have been " + vnbc[v];

                ps5 = "nosotros " + "debimos haber estado " + vnbcs[v];
                ps5eng = "we " + "should have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v];
                ps1eng = "I " + "should not have been " + vnbc[v];

                ps2 = "tú no " + "debiste haber estado " + vnbcs[v];
                ps2eng = "you " + "should not have been " + vnbc[v];

                ps3 = "él no " + "debió haber estado " + vnbcs[v];
                ps3eng = "he " + "should not have been " + vnbc[v];

                ps3ella = "ella no debió haber estado " + vnbcs[v];
                ps3she = "she " + "should not have been " + vnbc[v];

                ps3eso = "eso no debió haber estado " + vnbcs[v];
                ps3it = "it " + "should not have been " + vnbc[v];

                ps4 = "ellos no debieron haber estado " + vnbcs[v];
                ps4eng = "they " + "should not have been " + vnbc[v];

                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v];
                ps5eng = "we " + "should not have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //MIGHT
    public void GenMightSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá " + vn1y3subj[v];
                ps1eng = "I " + "might " + vnb[v];

                ps2 = "tú " + "quizá " + vn2subj[v];
                ps2eng = "you " + "might " + vnb[v];

                ps3 = "él " + "quizá " + vn1y3subj[v];
                ps3eng = "he " + "might " + vnb[v];

                ps3ella = "ella " + "quizá " + vn1y3subj[v];
                ps3she = "she " + "might " + vnb[v];

                ps3eso = "eso " + "quizá " + vn1y3subj[v];
                ps3it = "it " + "might " + vnb[v];

                ps4 = "ellos " + "quizá " + vn4subj[v];
                ps4eng = "they " + "might " + vnb[v];

                ps5 = "nosotros " + "quizá " + vn5subj[v];
                ps5eng = "we " + "might " + vnb[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no " + vn1y3subj[v];
                ps1eng = "I " + "might not " + vnb[v];

                ps2 = "tú " + "quizá no " + vn2subj[v];
                ps2eng = "you " + "might not " + vnb[v];

                ps3 = "él " + "quizá no " + vn1y3subj[v];
                ps3eng = "he " + "might not " + vnb[v];

                ps3ella = "ella " + "quizá no " + vn1y3subj[v];
                ps3she = "she " + "might not " + vnb[v];

                ps3eso = "eso " + "quizá no " + vn1y3subj[v];
                ps3it = "it " + "might not " + vnb[v];

                ps4 = "ellos " + "quizá no " + vn4subj[v];
                ps4eng = "they " + "might not " + vnb[v];

                ps5 = "nosotros " + "quizá no " + vn5subj[v];
                ps5eng = "we " + "might not " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenMightCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá esté " + vnbcs[v];
                ps1eng = "I " + "might " + "be " + vnbc[v];

                ps2 = "tú " + "quizá estés " + vnbcs[v];
                ps2eng = "you " + "might " + "be " + vnbc[v];

                ps3 = "él " + "quizá esté " + vnbcs[v];
                ps3eng = "he " + "might be " + vnbc[v];

                ps3ella = "ella quizá esté " + vnbcs[v];
                ps3she = "she " + "might be " + vnbc[v];

                ps3eso = "eso quizá esté " + vnbcs[v];
                ps3it = "it " + "might be " + vnbc[v];

                ps4 = "ellos quizá estén " + vnbcs[v];
                ps4eng = "they " + "might be " + vnbc[v];

                ps5 = "nosotros quizá estemos " + vnbcs[v];
                ps5eng = "we " + "might be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no esté " + vnbcs[v];
                ps1eng = "I " + "might not " + "be " + vnbc[v];

                ps2 = "tú " + "quizá no estés " + vnbcs[v];
                ps2eng = "you " + "might not " + "be " + vnbc[v];

                ps3 = "él " + "quizá no esté " + vnbcs[v];
                ps3eng = "he " + "might not be " + vnbc[v];

                ps3ella = "ella quizá no esté " + vnbcs[v];
                ps3she = "she " + "might not be " + vnbc[v];

                ps3eso = "eso quizá no esté " + vnbcs[v];
                ps3it = "it " + "might not be " + vnbc[v];

                ps4 = "ellos quizá no estén " + vnbcs[v];
                ps4eng = "they " + "might not be " + vnbc[v];

                ps5 = "nosotros quizá no estemos " + vnbcs[v];
                ps5eng = "we " + "might not be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenMightPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá haya " + vpsp[v];
                ps1eng = "I " + "might have " + vpeng[v];

                ps2 = "tú " + "quizá hayas " + vpsp[v];
                ps2eng = "you " + "might have " + vpeng[v];

                ps3 = "él " + "quizá haya " + vpsp[v];
                ps3eng = "he " + "might have " + vpeng[v];

                ps3ella = "ella quizá haya " + vpsp[v];
                ps3she = "she " + "might have " + vpeng[v];

                ps3eso = "eso " + "quizá haya " + vpsp[v];
                ps3it = "it " + "might have " + vpeng[v];

                ps4 = "ellos quizá hayan " + vpsp[v];
                ps4eng = "they " + "might have " + vpeng[v];

                ps5 = "nosotros quizá hayamos " + vpsp[v];
                ps5eng = "we " + "might have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no haya " + vpsp[v];
                ps1eng = "I " + "might not have " + vpeng[v];

                ps2 = "tú " + "quizá no hayas " + vpsp[v];
                ps2eng = "you " + "might not have " + vpeng[v];

                ps3 = "él " + "quizá no haya " + vpsp[v];
                ps3eng = "he " + "might not have " + vpeng[v];

                ps3ella = "ella quizá no haya " + vpsp[v];
                ps3she = "she " + "might not have " + vpeng[v];

                ps3eso = "eso " + "quizá no haya " + vpsp[v];
                ps3it = "it " + "might not have " + vpeng[v];

                ps4 = "ellos quizá no hayan " + vpsp[v];
                ps4eng = "they " + "might not have " + vpeng[v];

                ps5 = "nosotros quizá no hayamos " + vpsp[v];
                ps5eng = "we " + "might not have " + vpeng[v];
                break;
        }
    }//PD 13/06/2022
    public void GenMightPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá haya estado " + vnbcs[v];
                ps1eng = "I " + "might have been " + vnbc[v];

                ps2 = "tú " + "quizá hayas estado " + vnbcs[v];
                ps2eng = "you " + "might have been " + vnbc[v];

                ps3 = "él " + "quizá haya estado " + vnbcs[v];
                ps3eng = "he " + "might have been " + vnbc[v];

                ps3ella = "ella quizá haya estado " + vnbcs[v];
                ps3she = "she " + "might have been " + vnbc[v];

                ps3eso = "eso quizá haya estado " + vnbcs[v];
                ps3it = "it " + "might have been " + vnbc[v];

                ps4 = "ellos quizá hayan estado " + vnbcs[v];
                ps4eng = "they " + "might have been " + vnbc[v];

                ps5 = "nosotros " + "quizá hayamos estado " + vnbcs[v];
                ps5eng = "we " + "might have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no haya estado " + vnbcs[v];
                ps1eng = "I " + "might not have been " + vnbc[v];

                ps2 = "tú " + "quizá no hayas estado " + vnbcs[v];
                ps2eng = "you " + "might not have been " + vnbc[v];

                ps3 = "él " + "quizá no haya estado " + vnbcs[v];
                ps3eng = "he " + "might not have been " + vnbc[v];

                ps3ella = "ella quizá no haya estado " + vnbcs[v];
                ps3she = "she " + "might not have been " + vnbc[v];

                ps3eso = "eso quizá no haya estado " + vnbcs[v];
                ps3it = "it " + "might not have been " + vnbc[v];

                ps4 = "ellos quizá no hayan estado " + vnbcs[v];
                ps4eng = "they " + "might not have been " + vnbc[v];

                ps5 = "nosotros " + "quizá no hayamos estado " + vnbcs[v];
                ps5eng = "we " + "might not have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //CAN
    public void GenCanSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo " + vnbs[v];
                ps1eng = "I " + "can " + vnb[v];

                ps2 = "tú " + "puedes " + vnbs[v];
                ps2eng = "you " + "can " + vnb[v];

                ps3 = "él " + "puede " + vnbs[v];
                ps3eng = "he " + "can " + vnb[v];

                ps3ella = "ella " + "puede " + vnbs[v];
                ps3she = "she " + "can " + vnb[v];

                ps3eso = "eso " + "puede " + vnbs[v];
                ps3it = "it " + "can " + vnb[v];

                ps4 = "ellos " + "pueden " + vnbs[v];
                ps4eng = "they " + "can " + vnb[v];

                ps5 = "nosotros " + "podemos " + vnbs[v];
                ps5eng = "we " + "can " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "puedo " + vnbs[v];
                ps1eng = "I " + "can't " + vnb[v];

                ps2 = "tú no " + "puedes " + vnbs[v];
                ps2eng = "you " + "can't " + vnb[v];

                ps3 = "él no " + "puede " + vnbs[v];
                ps3eng = "he " + "can't " + vnb[v];

                ps3ella = "ella no " + "puede " + vnbs[v];
                ps3she = "she " + "can't " + vnb[v];

                ps3eso = "eso no " + "puede " + vnbs[v];
                ps3it = "it " + "can't " + vnb[v];

                ps4 = "ellos no " + "pueden " + vnbs[v];
                ps4eng = "they " + "can't " + vnb[v];

                ps5 = "nosotros no " + "podemos " + vnbs[v];
                ps5eng = "we " + "can't  " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenCanCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo estar " + vnbcs[v];
                ps1eng = "I " + "can " + "be " + vnbc[v];

                ps2 = "tú " + "puedes estar " + vnbcs[v];
                ps2eng = "you " + "can " + "be " + vnbc[v];

                ps3 = "él " + "puede estar " + vnbcs[v];
                ps3eng = "he " + "can be " + vnbc[v];

                ps3ella = "ella puede estar " + vnbcs[v];
                ps3she = "she " + "can be " + vnbc[v];

                ps3eso = "eso puede estar " + vnbcs[v];
                ps3it = "it " + "can be " + vnbc[v];

                ps4 = "ellos pueden estar " + vnbcs[v];
                ps4eng = "they " + "can be " + vnbc[v];

                ps5 = "nosotros podemos estar " + vnbcs[v];
                ps5eng = "we " + "can be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "puedo estar " + vnbcs[v];
                ps1eng = "I " + "can't " + "be " + vnbc[v];

                ps2 = "tú " + "puedes estar " + vnbcs[v];
                ps2eng = "you " + "can't " + "be " + vnbc[v];

                ps3 = "él " + "puede estar " + vnbcs[v];
                ps3eng = "he " + "can't be " + vnbc[v];

                ps3ella = "ella puede estar " + vnbcs[v];
                ps3she = "she " + "can't be " + vnbc[v];

                ps3eso = "eso puede estar " + vnbcs[v];
                ps3it = "it " + "can't be " + vnbc[v];

                ps4 = "ellos pueden estar " + vnbcs[v];
                ps4eng = "they " + "can't be " + vnbc[v];

                ps5 = "nosotros podemos estar " + vnbcs[v];
                ps5eng = "we " + "can't be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //MUST
    public void GenMustSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debo " + vnbs[v];
                ps1eng = "I " + "must " + vnb[v];

                ps2 = "tú " + "debes " + vnbs[v];
                ps2eng = "you " + "must " + vnb[v];

                ps3 = "él " + "debe " + vnbs[v];
                ps3eng = "he " + "must " + vnb[v];

                ps3ella = "ella " + "debe " + vnbs[v];
                ps3she = "she " + "must " + vnb[v];

                ps3eso = "eso " + "debe " + vnbs[v];
                ps3it = "it " + "must " + vnb[v];

                ps4 = "ellos " + "deben " + vnbs[v];
                ps4eng = "they " + "must " + vnb[v];

                ps5 = "nosotros " + "debemos " + vnbs[v];
                ps5eng = "we " + "must " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "debo " + vnbs[v];
                ps1eng = "I " + "must not " + vnb[v];

                ps2 = "tú no " + "debes " + vnbs[v];
                ps2eng = "you " + "must not " + vnb[v];

                ps3 = "él no " + "debe " + vnbs[v];
                ps3eng = "he " + "must not " + vnb[v];

                ps3ella = "ella no " + "debe " + vnbs[v];
                ps3she = "she " + "must not " + vnb[v];

                ps3eso = "eso no " + "debe " + vnbs[v];
                ps3it = "it " + "must no " + vnb[v];

                ps4 = "ellos no " + "deben " + vnbs[v];
                ps4eng = "they " + "must not " + vnb[v];

                ps5 = "nosotros no " + "debemos " + vnbs[v];
                ps5eng = "we " + "must not " + vnb[v];

                break;
        }
    }//PD 13/06/2022
    public void GenMustCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debo estar " + vnbcs[v];
                ps1eng = "I " + "must " + "be " + vnbc[v];

                ps2 = "tú " + "debes estar " + vnbcs[v];
                ps2eng = "you " + "must " + "be " + vnbc[v];

                ps3 = "él " + "debe estar " + vnbcs[v];
                ps3eng = "he " + "must be " + vnbc[v];

                ps3ella = "ella debe estar " + vnbcs[v];
                ps3she = "she " + "must be " + vnbc[v];

                ps3eso = "eso debe estar " + vnbcs[v];
                ps3it = "it " + "must be " + vnbc[v];

                ps4 = "ellos deben estar " + vnbcs[v];
                ps4eng = "they " + "must be " + vnbc[v];

                ps5 = "nosotros debemos estar " + vnbcs[v];
                ps5eng = "we " + "must be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "debo estar " + vnbcs[v];
                ps1eng = "I " + "must not " + "be " + vnbc[v];

                ps2 = "tú no " + "debes estar " + vnbcs[v];
                ps2eng = "you " + "must not " + "be " + vnbc[v];

                ps3 = "él no " + "debe estar " + vnbcs[v];
                ps3eng = "he " + "must not be " + vnbc[v];

                ps3ella = "ella no debe estar " + vnbcs[v];
                ps3she = "she " + "must not be " + vnbc[v];

                ps3eso = "eso no debe estar " + vnbcs[v];
                ps3it = "it " + "must not be " + vnbc[v];

                ps4 = "ellos no deben estar " + vnbcs[v];
                ps4eng = "they " + "must not be " + vnbc[v];

                ps5 = "nosotros no debemos estar " + vnbcs[v];
                ps5eng = "we " + "must not be " + vnbc[v];

                break;
        }
    }//PD 13/06/2022

    // non basics
    // want to dificultad 1
    public void WantYouTo1() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you doesn't want ", "he doesn't wants ", "she doesn't wants ", "it doesn't wants "
                , "we doesn't want ", "they doesn't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "eso no quiere ", "ella no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1eng = wtsj[0] + wtobj1[rn1];
                ps1 = wtsjs[0] + wtobj1s[rn1];

                ps2eng = wtsj[1] + wtobj2[rn1];
                ps2 = wtsjs[1] + wtobj2s[rn1];

                ps3eng = wtsj[2] + wtobj3[rn1];
                ps3 = wtsjs[2] + wtobj3s[rn1];

                ps3she = wtsj[3] + wtobj4[rn1];
                ps3ella = wtsjs[3] + wtobj4s[rn1];

                ps3it = wtsj[4] + wtobj5[rn1];
                ps3eso = wtsjs[4] + wtobj5s[rn1];

                ps4eng = wtsj[6] + wtobj6[rn2];
                ps4 = wtsjs[6] + wtobj6s[rn2];

                ps5eng = wtsj[5] + wtobj7[rn1];
                ps5 = wtsjs[5] + wtobj7s[rn1];
                break;
            case 1:
                ps1eng = wtsjn[0] + wtobj1[rn1];
                ps1 = wtsjsn[0] + wtobj1s[rn1];

                ps2eng = wtsjn[1] + wtobj2[rn1];
                ps2 = wtsjsn[1] + wtobj2s[rn1];

                ps3eng = wtsjn[2] + wtobj3[rn1];
                ps3 = wtsjsn[2] + wtobj3s[rn1];

                ps3she = wtsjn[3] + wtobj4[rn1];
                ps3ella = wtsjsn[3] + wtobj4s[rn1];

                ps3it = wtsjn[4] + wtobj5[rn1];
                ps3eso = wtsjsn[4] + wtobj5s[rn1];

                ps4eng = wtsjn[6] + wtobj6[rn2];
                ps4 = wtsjsn[6] + wtobj6s[rn2];

                ps5eng = wtsjn[5] + wtobj7[rn1];
                ps5 = wtsjsn[5] + wtobj7s[rn1];
                break;
        }

    }//PD 14/06/2022
    //for me to dificultad 1
    public void ForSubTo1() {
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1eng = ftsj[0] + vnb[v];
                ps1 = ftsjs[0] + vn1y3subj[v];

                ps2eng = ftsj[1] + vnb[v];
                ps2 = ftsjs[1] + vn2subj[v];

                ps3eng = ftsj[2] + vnb[v];
                ps3 = ftsjs[2] + vn1y3subj[v];

                ps3she = ftsj[3] + vnb[v];
                ps3ella = ftsjs[3] + vn1y3subj[v];

                ps3it = ftsj[4] + vnb[v];
                ps3eso = ftsjs[4] + vn1y3subj[v];

                ps4eng = ftsj[5] + vnb[v];
                ps4 = ftsjs[5] + vn4subj[v];

                ps5eng = ftsj[6] + vnb[v];
                ps5 = ftsjs[6] + vn5subj[v];
                break;
            case 1:
                ps1eng = ftsjn[0] + vnb[v];
                ps1 = ftsjsn[0] + vn1y3subj[v];

                ps2eng = ftsjn[1] + vnb[v];
                ps2 = ftsjsn[1] + vn2subj[v];

                ps3eng = ftsjn[2] + vnb[v];
                ps3 = ftsjsn[2] + vn1y3subj[v];

                ps3she = ftsjn[3] + vnb[v];
                ps3ella = ftsjsn[3] + vn1y3subj[v];

                ps3it = ftsjn[4] + vnb[v];
                ps3eso = ftsjsn[4] + vn1y3subj[v];

                ps4eng = ftsjn[5] + vnb[v];
                ps4 = ftsjsn[5] + vn4subj[v];

                ps5eng = ftsjn[6] + vnb[v];
                ps5 = ftsjsn[6] + vn5subj[v];
                break;
        }
    }//PD 14/06/2022

    //there be Simple
    public void ThereBe1(){
        Intrans it = new Intrans();

        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there is ","there are ",
        };

        //subject in spanish
        String tbsjs[] = {
                "hay ", "hay ",
        };

        //subject in eng negative
        String tbsjn[] = {
                "there is no ","there are no ",
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no hay ", "no hay ",
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];


                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];


                break;
        }

    }//PD 14/06/2022
    //there be pasado
    public void ThereBePast1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there was ","there were "
        };

        //subject in spanish
        String tbsjs[] = {
                "había ","había "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there was no ","there were no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no había ","no había "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }


    }//PD 14/06/2022
    //there be past perf
    public void ThereBePastPerf1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there has to be ","there have to be "
        };

        //subject in spanish
        String tbsjs[] = {
                "tiene que haber ","tiene que haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there has to be no ","there have to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no tiene que haber ","no tiene que haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there be Continous
    public void ThereBeContinuous1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there is going to be ","there are going to be "
        };

        //subject in spanish
        String tbsjs[] = {
                "va a haber ","van a haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there is going to be no ","there are going to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no va a haber ","no van a haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there be Past Continous
    public void ThereBePastContinuous1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there was going to be ","there were going to be  "
        };

        //subject in spanish
        String tbsjs[] = {
                "iba a haber ","iban a haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there was going to be no ","there were going to be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no iba a haber ","no iban a haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[1] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[1] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there be Could
    public void ThereCouldBe1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there could be "
        };

        //subject in spanish
        String tbsjs[] = {
                "podría haber ","podrían haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there could be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no podría haber ","no podrían haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there be Should
    public void ThereShouldBe1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there should be "
        };

        //subject in spanish
        String tbsjs[] = {
                "debería haber ","deberían haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there should be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no debería haber ","no deberían haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there be Would
    public void ThereWouldBe1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there would be "
        };

        //subject in spanish
        String tbsjs[] = {
                "habría ","habrían "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there would be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no habría ","no habrían "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there be Will
    public void ThereWillBe1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there will be "
        };

        //subject in spanish
        String tbsjs[] = {
                "habrá ","habrán "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there will be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no habrá ","no habrán "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there must be
    public void ThereMustBe1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there must be "
        };

        //subject in spanish
        String tbsjs[] = {
                "debe haber ","deben haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there must be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no debe haber ","no deben haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022
    //there can be
    public void ThereCanBe1(){
        Intrans it = new Intrans();
        int rnsome = (int) (Math.random() * it.some.length);
        int rnpome = (int) (Math.random() * it.pome.length);
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String tbsj[] = {
                "there can be "
        };

        //subject in spanish
        String tbsjs[] = {
                "puede haber ","pueden haber "
        };

        //subject in eng negative
        String tbsjn[] = {
                "there can be no "
        };

        //subject in spanish negative
        String tbsjsn[] = {
                "no puede haber ","no pueden haber "
        };

        switch (neg){
            case 0:
                ps1 = tbsjs[0] + "un " + it.soms[rnsome];
                ps1eng = tbsj[0] + "a " + it.some[rnsome];

                ps2 = tbsjs[1] + it.poms[rnpome];
                ps2eng = tbsj[0] + it.pome[rnpome];
                break;
            case 1:
                ps1 = tbsjsn[0] + "un " + it.soms[rnsome];
                ps1eng = tbsjn[0] + "a " + it.some[rnsome];

                ps2 = tbsjsn[1] + it.poms[rnpome];
                ps2eng = tbsjn[0] + it.pome[rnpome];
                break;
        }
    }//PD 14/06/2022

    //SUPOSSED TO
    public void SupposedToPres1() {
        int vc = (int) (Math.random() * 6);
        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v];
                ps1eng = "I'm supposed to " + vnb[v];

                ps2 = "Se supone que " + vn2[v];
                ps2eng = "you're supposed to " + vnb[v];

                ps3 = "Se supone que él " + vnbs[v];
                ps3eng = "he's supposed to " + vnb[v];

                ps3ella = "Se supone que ella " + vnbs[v];
                ps3she = "she's supposed to " + vnb[v];

                ps3eso = "Se supone que eso " + vnbs[v];
                ps3it = "it's supposed to " + vnb[v];

                ps4 = "se supone que " + vn4[v];
                ps4eng = "they're supposed to " + vnb[v];

                ps5 = "se supone que " + vn5[v];
                ps5eng = "we're supposed to " + vnb[v];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v];
                ps1eng = "I'm not supposed to " + vnb[v];

                ps2 = "se supone que no " + vn2[v];
                ps2eng = "you're not supposed to " + vnb[v];

                ps3 = "se supone que él no " + vnbs[v];
                ps3eng = "he's not supposed to " + vnb[v];

                ps3ella = "se supone que ella no " + vnbs[v];
                ps3she = "she's not supposed to " + vnb[v];

                ps3eso = "se supone que eso no " + vnbs[v];
                ps3it = "it's not supposed to  " + vnb[v];

                ps4 = "se supone que no " + vn4[v];
                ps4eng = "they're not supposed to " + vnb[v];

                ps5 = "se supone que no " + vn5[v];
                ps5eng = "we're not supposed to " + vnb[v];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v];
                ps1eng = "I'm supposed to " + vnb[v];

                ps2 = "se supone que tienes que " + vnbs[v];
                ps2eng = "you're supposed to " + vnb[v];

                ps3 = "se supone que él tiene que " + vnbs[v];
                ps3eng = "he's supposed to " + vnb[v];

                ps3ella = "se supone que ella tiene que " + vnbs[v];
                ps3she = "she's supposed to " + vnb[v];

                ps3eso = "se supone que eso tiene que " + vnbs[v];
                ps3it = "it's supposed to  " + vnb[v];

                ps4 = "se supone que tienen que " + vnbs[v];
                ps4eng = "they're supposed to " + vnb[v];

                ps5 = "se supone que tenemos que " + vnbs[v];
                ps5eng = "we're supposed to " + vnb[v];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v];
                ps1eng = "I'm not supposed to " + vnb[v];

                ps2 = "se supone que no tienes que " + vnbs[v];
                ps2eng = "you're not supposed to " + vnb[v];

                ps3 = "se supone que él no tiene que  " + vnbs[v];
                ps3eng = "he's not supposed to " + vnb[v];

                ps3ella = "se supone que ella no tiene que " + vnbs[v];
                ps3she = "she's not supposed to " + vnb[v];

                ps3eso = "se supone que eso no tiene que " + vnbs[v];
                ps3it = "it's not supposed to  " + vnb[v];

                ps4 = "se supone que no tienen que " + vnbs[v];
                ps4eng = "they're not supposed to " + vnb[v];

                ps5 = "se supone que no tenemos que " + vnbs[v];
                ps5eng = "we're not supposed to " + vnb[v];
                break;

            case 4:
                ps1 = "se supone que voy a " + vnbs[v];
                ps1eng = "I'm supposed to " + vnb[v];

                ps2 = "se supone que vas a " + vnbs[v];
                ps2eng = "you're supposed to " + vnb[v];

                ps3 = "se supone que él va a " + vnbs[v];
                ps3eng = "he's supposed to " + vnb[v];

                ps3ella = "se supone que ella va a " + vnbs[v];
                ps3she = "she's supposed to " + vnb[v];

                ps3eso = "se supone que eso va a " + vnbs[v];
                ps3it = "it's supposed to " + vnb[v];

                ps4 = "se supone que van a " + vnbs[v];
                ps4eng = "they're supposed to " + vnb[v];

                ps5 = "se supone que vamos a " + vnbs[v];
                ps5eng = "we're supposed to " + vnb[v];

                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v];
                ps1eng = "I'm not supposed to " + vnb[v];

                ps2 = "se supone que no vas a " + vnbs[v];
                ps2eng = "you're not supposed to " + vnb[v];

                ps3 = "se supone que él no va a " + vnbs[v];
                ps3eng = "he's not supposed to " + vnb[v];

                ps3ella = "se supone que ella no va a " + vnbs[v];
                ps3she = "she's not supposed to " + vnb[v];

                ps3eso = "se supone que eso no va a " + vnbs[v];
                ps3it = "it's not supposed to  " + vnb[v];

                ps4 = "se supone que no van a " + vnbs[v];
                ps4eng = "they're not supposed to " + vnb[v];

                ps5 = "se supone que no vamos a " + vnbs[v];
                ps5eng = "we're not supposed to " + vnb[v];
                break;

        }
    }//PD 15/06/2022
    public void SupposedToPast1() {
        int neg = (int) (Math.random() * 2);

        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v];
                ps1eng = "I was supposed to " + vnb[v];

                ps2 = "Se supone que tú " + ps2imp[v];
                ps2eng = "you were supposed to " + vnb[v];

                ps3 = "Se supone que él " + ps3imp[v];
                ps3eng = "he was supposed to " + vnb3[v];

                ps3ella = "Se supone que ella " + ps3imp[v];
                ps3she = "she was supposed to " + vn3[v];

                ps3eso = "Se supone que eso " + ps3imp[v];
                ps3it = "it was supposed to " + vn3[v];

                ps4 = "se supone que " + vn4imp[v];
                ps4eng = "they were supposed to " + vnb[v];

                ps5 = "se supone que " + vn5imp[v];
                ps5eng = "we were supposed to " + vnb[v];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v];
                ps1eng = "I wasn't supposed to " + vnb[v];

                ps2 = "se supone que no " + ps2imp[v];
                ps2eng = "you weren't supposed to " + vnb[v];

                ps3 = "se supone que él no " + ps3imp[v];
                ps3eng = "he wasn't supposed to " + vnb[v];

                ps3ella = "se supone que ella no " + ps3imp[v];
                ps3she = "she wasn't supposed to " + vnb[v];

                ps3eso = "se supone que eso no " + ps3imp[v];
                ps3it = "it wasn't supposed to " + vnb[v];

                ps4 = "se supone que no " + vn4imp[v];
                ps4eng = "they weren't supposed to " + vnb[v];

                ps5 = "se supone que no " + vn5imp[v];
                ps5eng = "we weren't supposed to " + vnb[v];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v];
                ps1eng = "I was supposed to " + vnb[v];

                ps2 = "Se supone que tenías que " + vnbs[v];
                ps2eng = "you were supposed to " + vnb[v];

                ps3 = "Se supone que él tenía que " + vnbs[v];
                ps3eng = "he was supposed to " + vnb3[v];

                ps3ella = "Se supone que ella tenía que " + vnbs[v];
                ps3she = "she was supposed to " + vn3[v];

                ps3eso = "Se supone que eso tenía que " + vnbs[v];
                ps3it = "it was supposed to " + vn3[v];

                ps4 = "se supone que tenían que " + vnbs[v];
                ps4eng = "they were supposed to " + vnb[v];

                ps5 = "se supone que teníamos que " + vnbs[v];
                ps5eng = "we were supposed to " + vnb[v];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v];
                ps1eng = "I wasn't supposed to " + vnb[v];

                ps2 = "Se supone que no tenías que " + vnbs[v];
                ps2eng = "you weren't supposed to " + vnb[v];

                ps3 = "Se supone que él no tenía que " + vnbs[v];
                ps3eng = "he wasn't supposed to " + vnb3[v];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v];
                ps3she = "she wasn't supposed to " + vn3[v];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v];
                ps3it = "it wasn't supposed to " + vn3[v];

                ps4 = "se supone que no tenían que " + vnbs[v];
                ps4eng = "they weren't supposed to " + vnb[v];

                ps5 = "se supone que no teníamos que " + vnbs[v];
                ps5eng = "we weren't supposed to " + vnb[v];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v];
                ps1eng = "I was supposed to " + vnb[v];

                ps2 = "Se supone que ibas a " + vnbs[v];
                ps2eng = "you were supposed to " + vnb[v];

                ps3 = "Se supone que él iba a " + vnbs[v];
                ps3eng = "he was supposed to " + vnb3[v];

                ps3ella = "Se supone que ella iba a " + vnbs[v];
                ps3she = "she was supposed to " + vn3[v];

                ps3eso = "Se supone que eso iba a " + vnbs[v];
                ps3it = "it was supposed to " + vn3[v];

                ps4 = "se supone que iban a " + vnbs[v];
                ps4eng = "they were supposed to " + vnb[v];

                ps5 = "se supone que ibamos a " + vnbs[v];
                ps5eng = "we were supposed to " + vnb[v];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v];
                ps1eng = "I wasn't supposed to " + vnb[v];

                ps2 = "Se supone que no ibas a " + vnbs[v];
                ps2eng = "you weren't supposed to " + vnb[v];

                ps3 = "Se supone que él no iba a " + vnbs[v];
                ps3eng = "he wasn't supposed to " + vnb3[v];

                ps3ella = "Se supone que ella no iba a " + vnbs[v];
                ps3she = "she wasn't supposed to " + vn3[v];

                ps3eso = "Se supone que eso no iba a " + vnbs[v];
                ps3it = "it wasn't supposed to " + vn3[v];

                ps4 = "se supone que no iban a " + vnbs[v];
                ps4eng = "they weren't supposed to " + vnb[v];

                ps5 = "se supone que no ibamos a " + vnbs[v];
                ps5eng = "we weren't supposed to " + vnb[v];
                break;
        }
    }//PD 15/06/2022

    //Wish Past Simple
    public void WishPastSimp1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v];
                ps1eng = "I wish " + "I " + vnbp[v];

                ps2 = "Ojalá tú " + ps2wish[v];
                ps2eng = "I wish " + "you " + vnbp[v];

                ps3 = "Ojalá él " + ps3wish[v];
                ps3eng = "I wish " + "he " + vnbp[v];

                ps3ella = "Ojalá ella " + ps3wish[v];
                ps3she = "I wish " + "she " + vnbp[v];

                ps3eso = "Ojalá eso " + ps3wish[v];
                ps3it = "I wish " + "it " + vnbp[v];

                ps4 = "Ojalá ellos " + ps4wish[v];
                ps4eng = "I wish " + "they " + vnbp[v];

                ps5 = "Ojalá nosotros " + ps5wish[v];
                ps5eng = "I wish " + "we " + vnbp[v];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v];
                ps1eng = "I wish I didn't " + vnb[v];

                ps2 = "Ojalá tú no " + ps2wish[v];
                ps2eng = "I wish you didn't " + vnb[v];

                ps3 = "Ojalá él no " + ps3wish[v];
                ps3eng = "I wish he didn't " + vnb[v];

                ps3ella = "Ojalá ella no " + ps3wish[v];
                ps3she = "I wish she didn't " + vnb[v];

                ps3eso = "Ojalá eso no " + ps3wish[v];
                ps3it = "I wish it didn't " + vnb[v];

                ps4 = "Ojalá ellos no " + ps4wish[v];
                ps4eng = "I wish they didn't " + vnb[v];

                ps5 = "Ojalá nosotros no " + ps5wish[v];
                ps5eng = "I wish we didn't " + vnb[v];

                break;
        }
    }//PD 15/06/2022
    public void WishPastPerf1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v];
                ps1eng = "I wish I had " + vpeng[v];

                ps2 = "Ojalá tú hubieras " + vpsp[v];
                ps2eng = "I wish you had " + vpeng[v];

                ps3 = "Ojalá él hubiera " + vpsp[v];
                ps3eng = "I wish he had " + vpeng[v];

                ps3ella = "Ojalá ella hubiera " + vpsp[v];
                ps3she = "I wish she had " + vpeng[v];

                ps3eso = "Ojalá eso hubiera " + vpsp[v];
                ps3it = "I wish it had " +  vpeng[v];

                ps4 = "Ojalá ellos hubieran " + vpsp[v];
                ps4eng = "I wish they had " + vpeng[v];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v];
                ps5eng = "I wish we had " + vpeng[v];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v];
                ps1eng = "I wish I hadn´t " + vpeng[v];

                ps2 = "Ojalá tú no hubieras " + vpsp[v];
                ps2eng = "I wish you hadn´t " + vpeng[v];

                ps3 = "Ojalá él no hubiera " + vpsp[v];
                ps3eng = "I wish he hadn´t " + vpeng[v];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v];
                ps3she = "I wish she hadn´t " + vpeng[v];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v];
                ps3it = "I wish it hadn´t " + vpeng[v];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v];
                ps4eng = "I wish they hadn´t " + vpeng[v];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v];
                ps5eng = "I wish we hadn´t " + vpeng[v];

                break;


        }
    }//PD 15/06/2022
    public void WishWould1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v];
                ps1eng = "I wish I would " + vnb[v];

                ps2 = "Ojalá tú " + ps2wish[v];
                ps2eng = "I wish you would " + vnb[v];

                ps3 = "Ojalá él " + ps3wish[v];
                ps3eng = "I wish he would " + vnb[v];

                ps3ella = "Ojalá ella " + ps3wish[v];
                ps3she = "I wish she would " + vnb[v];

                ps3eso = "Ojalá eso " + ps3wish[v];
                ps3it = "I wish it would " +  vnb[v];

                ps4 = "Ojalá ellos " + ps4wish[v];
                ps4eng = "I wish they would " + vnb[v];

                ps5 = "Ojalá nosotros " + ps5wish[v];
                ps5eng = "I wish we would " + vnb[v];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v];
                ps1eng = "I wish I wouldn´t " + vnb[v];

                ps2 = "Ojalá tú no " + ps2wish[v];
                ps2eng = "I wish you wouldn´t " + vnb[v];

                ps3 = "Ojalá él no " + ps3wish[v];
                ps3eng = "I wish he wouldn´t " + vnb[v];

                ps3ella = "Ojalá ella no " + ps3wish[v];
                ps3she = "I wish she wouldn´t " + vnb[v];

                ps3eso = "Ojalá eso no " + ps3wish[v];
                ps3it = "I wish it wouldn´t " + vnb[v];

                ps4 = "Ojalá ellos no " + ps4wish[v];
                ps4eng = "I wish they wouldn´t " + vnb[v];

                ps5 = "Ojalá nosotros no " + ps5wish[v];
                ps5eng = "I wish we wouldn´t " + vnb[v];

                break;



        }
    }//PD 15/06/2022

    // USED TO
    public void UsedTo1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v];
                ps1eng = "I used to " + vnb[v];

                ps2 = "Tú solías " + vnbs[v];
                ps2eng = "You used to " + vnb[v];

                ps3 = "Él solía " + vnbs[v];
                ps3eng = "He used to " + vnb[v];

                ps3ella = "Ella solía " + vnbs[v];
                ps3she = "She used to " + vnb[v];

                ps3eso = "Eso solía " + vnbs[v];
                ps3it = "It used to " + vnb[v];

                ps4 = "Ellos solían " + vnbs[v];
                ps4eng = "They used to " + vnb[v];

                ps5 = "Nosotros solíamos " + vnbs[v];
                ps5eng = "We used to " + vnb[v];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v];
                ps1eng = "I didn't use to " + vnb[v];

                ps2 = "Tú no solías " + vnbs[v];
                ps2eng = "You didn't use to " + vnb[v];

                ps3 = "Él no solía " + vnbs[v];
                ps3eng = "He didn't use to " + vnb[v];

                ps3ella = "Ella no solía " + vnbs[v];
                ps3she = "she didn't use to " + vnb[v];

                ps3eso = "Eso no solía " + vnbs[v];
                ps3it = "It didn't use to  " + vnb[v];

                ps4 = "Ellos no solían " + vnbs[v];
                ps4eng = "They didn't use to " + vnb[v];

                ps5 = "Nosotros no solíamos " + vnbs[v];
                ps5eng = "We didn't use to " + vnb[v];
                break;

        }
    }//PD 15/06/2022
    // BE USED TO
    public void BeUsedTo1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v];
                ps1eng = "I'm used to " + vnbc[v];

                ps2 = "Tu estás acostumbrado a " + vnbs[v];
                ps2eng = "You're used to " + vnbc[v];

                ps3 = "Él está acostumbrado a " + vnbs[v];
                ps3eng = "He's used to " + vnbc[v];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v];
                ps3she = "She's used to " + vnbc[v];

                ps3eso = "Eso está acostumbrado a " + vnbs[v];
                ps3it = "It's used to " + vnbc[v];

                ps4 = "Ellos están acostumbrados a " + vnbs[v];
                ps4eng = "They're used to " + vnbc[v];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v];
                ps5eng = "We're used to " + vnbc[v];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v];
                ps1eng = "I'm not used to " + vnbc[v];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v];
                ps2eng = "You're not used to " + vnbc[v];

                ps3 = "Él no está acostumbrado a " + vnbs[v];
                ps3eng = "He's not used to " + vnbc[v];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v];
                ps3she = "She's not used to " + vnbc[v];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v];
                ps3it = "It's not used to " + vnbc[v];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v];
                ps4eng = "They're not used to " + vnbc[v];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v];
                ps5eng = "We're not used to " + vnbc[v];
                break;
        }
    }//PD 15/06/2022

}


