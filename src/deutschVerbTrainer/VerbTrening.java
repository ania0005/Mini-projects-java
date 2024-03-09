package deutschVerbTrainer;

import java.util.*;

class VerbTrening {
    private List<Verb> verbs;
    private Random random;
    private Scanner scanner;

    public VerbTrening() {
        this.verbs = new ArrayList<>();
        this.random = new Random();
        this.scanner = new Scanner(System.in);

        verbs.add(new Verb("backen", "buk", "gebacken", "печь"));
        verbs.add(new Verb("befehlen", "befahl", "hat befohlen", "приказывать"));
        verbs.add(new Verb("beginnen", "begann", "hat begonnen", "начинать"));
        verbs.add(new Verb("beißen", "biss", "hat gebissen", "кусать"));
        verbs.add(new Verb("bergen", "barg", "hat geborgen", "спасать, извлекать"));
        verbs.add(new Verb("bersten", "barst", "ist geborsten", "лопаться"));
        verbs.add(new Verb("biegen", "bog", "hat gebogen", "гнуть"));
        verbs.add(new Verb("bieten", "bot", "hat geboten", "предлагать"));
        verbs.add(new Verb("binden", "band", "hat gebunden", "связывать"));
        verbs.add(new Verb("bitten", "bat", "hat gebeten", "просить"));
        verbs.add(new Verb("blasen", "blies", "hat geblasen", "дуть"));
        verbs.add(new Verb("empfangen", "empfing", "hat empfangen", "получать"));
        verbs.add(new Verb("empfehlen", "empfahl", "hat empfohlen", "рекомендовать"));
        verbs.add(new Verb("erlöschen", "erlosch", "ist erloschen", "гаснуть"));
        verbs.add(new Verb("erschrecken", "erschrak", "ist erschrocken", "пугаться"));
        verbs.add(new Verb("essen", "aß", "hat gegessen", "есть"));
        verbs.add(new Verb("fahren", "fuhr", "ist/hat gefahren", "ехать, водить"));
        verbs.add(new Verb("fallen", "fiel", "ist gefallen", "падать"));
        verbs.add(new Verb("fangen", "fing", "hat gefangen", "ловить"));
        verbs.add(new Verb("fechten", "focht", "hat gefochten", "фехтовать"));
        verbs.add(new Verb("finden", "fand", "hat gefunden", "находить"));
        verbs.add(new Verb("flechten", "flocht", "hat geflochten", "плести"));
        verbs.add(new Verb("fliegen", "flog", "ist geflogen", "летать"));
        verbs.add(new Verb("fliehen", "floh", "ist geflohen", "бежать"));
        verbs.add(new Verb("fließen", "floss", "ist geflossen", "течь"));
        verbs.add(new Verb("fressen", "fraß", "hat gefressen", "жрать (о животных)"));
        verbs.add(new Verb("frieren", "fror", "hat gefroren", "мёрзнуть"));
        verbs.add(new Verb("gären", "gor", "hat gegoren", "бродить (о вине)"));
        verbs.add(new Verb("gebären", "gebar", "hat geboren", "рожать"));
        verbs.add(new Verb("geben", "gab", "hat gegeben", "давать"));
        verbs.add(new Verb("gedeihen", "gedieh", "ist gediehen", "процветать, быть в благосостоянии"));
        verbs.add(new Verb("gehen", "ging", "ist gegangen", "идти"));
        verbs.add(new Verb("gelingen", "gelang", "ist gelungen", "удаваться, удаться"));
        verbs.add(new Verb("gelten", "galt", "hat gegolten", "иметь силу, быть действительным"));
        verbs.add(new Verb("genesen", "genas", "ist genesen", "выздоравливать"));
        verbs.add(new Verb("genießen", "genoss", "hat genossen", "наслаждаться"));
        verbs.add(new Verb("geschehen", "geschah", "ist geschehen", "происходить"));
        verbs.add(new Verb("gewinnen", "gewann", "hat gewonnen", "выигрывать"));
        verbs.add(new Verb("gießen", "goss", "hat gegossen", "лить"));
        verbs.add(new Verb("gleichen", "glich", "hat geglichen", "походить, быть похожим"));
        verbs.add(new Verb("gleiten", "glitt", "ist geglitten", "скользить"));
        verbs.add(new Verb("graben", "grub", "hat gegraben", "копать"));
        verbs.add(new Verb("greifen", "griff", "hat gegriffen", "хватать, брать"));
        verbs.add(new Verb("haben", "hatte", "hat gehabt", "иметь"));
        verbs.add(new Verb("halten", "hielt", "hat gehalten", "держать"));
        verbs.add(new Verb("hängen", "hing", "hat gehangen", "висеть"));
        verbs.add(new Verb("hauen", "hieb", "hat gehauen", "рубить"));
        verbs.add(new Verb("heben", "hob", "hat gehoben", "поднимать"));
        verbs.add(new Verb("heißen", "hieß", "hat geheißen", "звать, называть"));
        verbs.add(new Verb("helfen", "half", "hat geholfen", "помогать"));
        verbs.add(new Verb("kennen", "kannte", "hat gekannt", "знать, быть знакомым"));
        verbs.add(new Verb("klingen", "klang", "hat geklungen", "звучать"));
        verbs.add(new Verb("kneifen", "kneifte", "hat gekneift", "щипать, ущипнуть"));
        verbs.add(new Verb("kommen", "kam", "ist gekommen", "приходить, приезжать"));
        verbs.add(new Verb("können", "konnte", "hat gekonnt", "мочь, уметь"));
        verbs.add(new Verb("kriechen", "kroch", "ist gekrochen", "ползти"));
        verbs.add(new Verb("laden", "lud", "hat geladen", "грузить, приглашать"));
        verbs.add(new Verb("lassen", "ließ", "hat gelassen", "позволять, оставлять"));
        verbs.add(new Verb("laufen", "lief", "ist gelaufen", "бежать, бегать"));
        verbs.add(new Verb("leiden", "litt", "hat gelitten", "страдать"));
        verbs.add(new Verb("leihen", "lieh", "hat geliehen", "одалживать"));
        verbs.add(new Verb("lesen", "las", "hat gelesen", "читать"));
        verbs.add(new Verb("liegen", "lag", "hat gelegen", "лежать"));
        verbs.add(new Verb("löschen", "löschte", "hat gelöscht", "тушить, гасить"));
        verbs.add(new Verb("lügen", "log", "hat gelogen", "врать"));
        verbs.add(new Verb("mahlen", "mahlte", "hat gemahlen", "молоть"));
        verbs.add(new Verb("meiden", "mied", "hat gemieden", "избегать"));
        verbs.add(new Verb("melken", "molk", "hat gemolken", "доить"));
        verbs.add(new Verb("messen", "maß", "hat gemessen", "измерять"));
        verbs.add(new Verb("mißlingen", "mißlang", "ist mißlungen", "проваливаться, не удаваться"));
        verbs.add(new Verb("mögen", "mochte", "hat gemocht", "любить, желать"));
        verbs.add(new Verb("müssen", "musste", "hat gemusst", "долженствовать, быть вынужденным"));
        verbs.add(new Verb("nehmen", "nahm", "hat genommen", "брать"));
        verbs.add(new Verb("nennen", "nannte", "hat genannt", "называть"));
        verbs.add(new Verb("pfeifen", "pfiff", "hat gepfiffen", "свистеть, свистеть в свисток"));
        verbs.add(new Verb("preisen", "pries", "hat gepriesen", "хвалить, прославлять"));
        verbs.add(new Verb("quellen", "quoll", "ist gequollen", "вздуваться, выпирать"));
        verbs.add(new Verb("raten", "riet", "hat geraten", "советовать"));
        verbs.add(new Verb("reiben", "rieb", "hat gerieben", "тереть"));
        verbs.add(new Verb("reißen", "riss", "hat gerissen", "рвать, разрывать"));
        verbs.add(new Verb("reiten", "ritt", "ist geritten", "ездить верхом"));
        verbs.add(new Verb("rennen", "rannte", "ist gerannt", "бежать"));
        verbs.add(new Verb("riechen", "roch", "hat gerochen", "пахнуть"));
        verbs.add(new Verb("ringen", "rang", "hat gerungen", "бороться, кольцевать"));
        verbs.add(new Verb("rinnen", "rann", "ist geronnen", "течь, стекать"));
        verbs.add(new Verb("rufen", "rief", "hat gerufen", "кричать, звать"));
        verbs.add(new Verb("salzen", "salzte", "hat gesalzen", "солить"));
        verbs.add(new Verb("saufen", "soff", "hat gesoffen", "пить (животные)"));
        verbs.add(new Verb("saugen", "sog", "hat gesogen", "сосать, всасывать"));
        verbs.add(new Verb("schaffen", "schuf", "hat geschaffen", "создавать, достигать"));
        verbs.add(new Verb("scheiden", "schied", "hat geschieden", "разделять, уходить (о смерти)"));
        verbs.add(new Verb("scheinen", "schien", "hat geschienen", "светить, казаться"));
        verbs.add(new Verb("schelten", "schalt", "hat gescholten", "ругать, бранить"));
        verbs.add(new Verb("scheren", "schor", "hat geschoren", "стричь (волосы, шерсть)"));
        verbs.add(new Verb("schieben", "schob", "hat geschoben", "толкать, двигать"));
        verbs.add(new Verb("schießen", "schoss", "hat geschossen", "стрелять, пускать"));
        verbs.add(new Verb("schlafen", "schlief", "hat geschlafen", "спать"));
        verbs.add(new Verb("schlagen", "schlug", "hat geschlagen", "бить, ударять"));
        verbs.add(new Verb("schleichen", "schlich", "hat geschlichen", "красться"));
        verbs.add(new Verb("schleifen", "schliff", "hat geschliffen", "точить, шлифовать"));
        verbs.add(new Verb("schließen", "schloss", "hat geschlossen", "закрывать, заключать"));
        verbs.add(new Verb("schlingen", "schlang", "hat geschlungen", "обматывать, завивать"));
        verbs.add(new Verb("schmeißen", "schmiss", "hat geschmissen", "бросать, швырять"));
        verbs.add(new Verb("schmelzen", "schmolz", "hat geschmolzen", "плавить, таять"));
        verbs.add(new Verb("schneiden", "schnitt", "hat geschnitten", "резать, нарезать"));
        verbs.add(new Verb("schreiben", "schrieb", "hat geschrieben", "писать"));
        verbs.add(new Verb("schreien", "schrie", "hat geschrien", "кричать"));
        verbs.add(new Verb("schreiten", "schritt", "hat geschritten", "идти, шагать"));
        verbs.add(new Verb("schweigen", "schwieg", "hat geschwiegen", "молчать"));
        verbs.add(new Verb("schwellen", "schwoll", "hat geschwollen", "опухать, набухать"));
        verbs.add(new Verb("schwimmen", "schwamm", "ist geschwommen", "плыть"));
        verbs.add(new Verb("schwinden", "schwand", "ist geschwunden", "исчезать, уменьшаться"));
        verbs.add(new Verb("schwingen", "schwang", "hat geschwungen", "махать, колебаться"));
        verbs.add(new Verb("schwören", "schwor", "hat geschworen", "клясться, давать клятву"));
        verbs.add(new Verb("sehen", "sah", "hat gesehen", "видеть"));
        verbs.add(new Verb("sein", "war", "ist gewesen", "быть"));
        verbs.add(new Verb("senden", "sandte", "hat gesandt", "посылать, передавать (по радио, телевидению)"));
        verbs.add(new Verb("singen", "sang", "hat gesungen", "петь"));
        verbs.add(new Verb("sinken", "sank", "ist gesunken", "тонуть, опускаться"));
        verbs.add(new Verb("sinnen", "sann", "hat gesonnen", "размышлять, обдумывать"));
        verbs.add(new Verb("sitzen", "saß", "hat gesessen", "сидеть"));
        verbs.add(new Verb("sollen", "sollte", "hat gesollt", "долженствовать, быть обязанным"));
        verbs.add(new Verb("speien", "spie", "hat gespien", "плевать"));
        verbs.add(new Verb("spinnen", "spann", "hat gesponnen", "прясть, ткать; чудить"));
        verbs.add(new Verb("sprechen", "sprach", "hat gesprochen", "говорить, разговаривать"));
        verbs.add(new Verb("sprießen", "spross", "hat gesprossen", "пускать ростки, прорастать"));
        verbs.add(new Verb("springen", "sprang", "ist gesprungen", "прыгать, скакать"));
        verbs.add(new Verb("stechen", "stach", "hat gestochen", "жалить, колоть"));
        verbs.add(new Verb("stehen", "stand", "hat gestanden", "стоять"));
        verbs.add(new Verb("stehlen", "stahl", "hat gestohlen", "красть"));
        verbs.add(new Verb("steigen", "stieg", "ist gestiegen", "подниматься, восходить"));
        verbs.add(new Verb("sterben", "starb", "ist gestorben", "умирать"));
        verbs.add(new Verb("stinken", "stank", "hat gestunken", "вонять"));
        verbs.add(new Verb("stoßen", "stieß", "hat gestoßen", "толкать, ударять"));
        verbs.add(new Verb("streichen", "strich", "hat gestrichen", "красить, мазать, разглаживать"));
        verbs.add(new Verb("streiten", "stritt", "hat gestritten", "спорить, ссориться"));
        verbs.add(new Verb("tragen", "trug", "hat getragen", "нести, нести на себе, выносить"));
        verbs.add(new Verb("treffen", "traf", "hat getroffen", "встречать, попадать (в цель)"));
        verbs.add(new Verb("treiben", "trieb", "hat getrieben", "гнать, выгонять, заниматься (делом)"));
        verbs.add(new Verb("treten", "trat", "hat getreten", "топтать, наступать"));
        verbs.add(new Verb("trinken", "trank", "hat getrunken", "пить"));
        verbs.add(new Verb("trügen", "trug", "hat getrogen", "обманывать, вводить в заблуждение"));
        verbs.add(new Verb("tun", "tat", "hat getan", "делать"));
        verbs.add(new Verb("verderben", "verdarb", "hat verdorben", "портить, разлагать"));
        verbs.add(new Verb("verdrießen", "verdross", "hat verdrossen", "раздражать, огорчать"));
        verbs.add(new Verb("vergessen", "vergaß", "hat vergessen", "забывать"));
        verbs.add(new Verb("verlieren", "verlor", "hat verloren", "терять"));
        verbs.add(new Verb("verzeihen", "verzieh", "hat verziehen", "прощать"));
        verbs.add(new Verb("wachsen", "wuchs", "ist gewachsen", "расти, увеличиваться"));
        verbs.add(new Verb("wägen", "wog", "hat gewogen", "взвешивать, взвешиваться"));
        verbs.add(new Verb("waschen", "wusch", "hat gewaschen", "мыть, стирать"));
        verbs.add(new Verb("weichen", "wich", "ist gewichen", "уступать, отступать, избегать"));
        verbs.add(new Verb("weisen", "wies", "hat gewiesen", "указывать, направлять"));
        verbs.add(new Verb("wenden", "wandte", "hat gewandt", "поворачивать, обращать"));
        verbs.add(new Verb("werben", "warb", "hat geworben", "вербовать, завлекать"));
        verbs.add(new Verb("werden", "wurde", "ist geworden", "становиться, делаться"));
        verbs.add(new Verb("werfen", "warf", "hat geworfen", "бросать, метать"));
        verbs.add(new Verb("wiegen", "wog", "hat gewogen", "взвешивать, взвешиваться"));
        verbs.add(new Verb("winden", "wand", "hat gewunden", "скручивать, вить"));
        verbs.add(new Verb("wissen", "wusste", "hat gewusst", "знать"));
        verbs.add(new Verb("wollen", "wollte", "hat gewollt", "хотеть"));
        verbs.add(new Verb("ziehen", "zog", "hat gezogen", "тянуть, влечь, двигаться"));
        verbs.add(new Verb("zwingen", "zwang", "hat gezwungen", "принуждать, заставлять"));
    }

    public void startTrening() {

        System.out.println("\nДобро пожаловать в тренажер неправельных глаголов!");

        while (true) {
            System.out.println();
            System.out.println("Cделайте выбор:");
            System.out.println("1 - начать трренировку");
            System.out.println("2 - выйти");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера ввода . После ввода числа с клавиатуры метод nextInt() оставляет
                // в буфере новую строку, которая перехватывается nextLine() в следующей итерации. Для решения этой
                // проблемы можно добавить дополнительный вызов nextLine() после nextInt() для "поглощения"
                // символа новой строки.

                switch (choice) {
                    case 1:
                        performExecise();
                        break;
                    case 2:
                        System.out.println("До свидания! Спасибо за тренировку!");
                        return;
                    default:
                        System.out.println("Неверный ввод. Повторите выбор.\n");
                }
            } catch (InputMismatchException e) {  //Ошибка выдается сканером, чтобы указать, что полученный токен не
                // соответствует шаблону ожидаемого типа или что токен находится вне диапазона ожидаемого типа.
                System.out.println("Ошибка ввода! Введите число.\n");
                scanner.nextLine();  // Очистка буфера ввода, чтобы избежать зацикливания при некорректном вводе
            }
        }
    }

    public void performExecise() {

        int randomIndex = random.nextInt(verbs.size());
        Verb verb = verbs.get(randomIndex);

        System.out.println("Поставте глагол в форму Präteritum - " + verb.getInfinitive());
        System.out.print("Ответ: ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase(verb.getPrateritumForm())) {
            System.out.println();
            System.out.println("Верно! Значение: " + verb.getTranslate());
        } else {
            System.out.println();
            System.out.println("Не верно! Правильный ответ: " + verb.getPrateritumForm() + ". Значение: " + verb.getTranslate());
        }

        System.out.println();
        System.out.println("Поставте глагол в форму Perfekt - " + verb.getInfinitive());
        System.out.print("Ответ: ");
        String answer1 = scanner.nextLine();


        if (answer1.equalsIgnoreCase(verb.getPerfectForm())) {
            System.out.println("Верно! Значение: " + verb.getTranslate());
        } else {
            System.out.println("Не верно! Правильный ответ: " + verb.getPerfectForm());
        }
    }
}
