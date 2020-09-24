package algData.Uke2;
import algData.Tabell;

import java.util.Arrays;

public class Ukesoppgaver2 {

    //1.2.1 Oppgave 1
    //Lag to min-metoder (metoder som finner posisjonen til den minste verdien) tilsvarende de to maks-metodene i
    //Programkode 1.2.1 b) og 1.2.1 c). Legg dem i samleklassen Tabell. Se Avsnitt 1.2.2.

    /*public static void main(String[] args){
        int [] a = {2, 4, 5, 76, 23, 21, 32, 21, 56};

        int minimum = Tabell.min(a, 2, 4);

        System.out.println(minimum);
    }*/

    //1.2.1 Oppgave 5
    //I Java 1.5 ble det innført en ny type for-løkke - en såkalt for-alle-løkke. Se Programkode 1.2.1 d).
    // Den må du lære deg hvis du ikke allerede kan den. Se f.eks. Vedlegg E.

    /*public static void main(String[] args){
        char[] bokstaver = {'A','B','C','D','E','F','G','H','I','J'};  // 10 bokstaver

        char[] kopiAvUrval = Arrays.copyOfRange(bokstaver,4,8);           // en kopi av c[4:8>
        for (char element : kopiAvUrval) System.out.print(element + " ");     // kopien d skrives ut

        // Utskrift: E F G H
    }*/

    //1.2.2 Oppgave 1
    //Se class Tabell

    //1.2.2 Oppgave 2
    //Se 1.2.1 oppgave 1

    //1.2.2 Oppgave 3
    /*public static void main(String[] args){
        char [] c = {'E', 'F', 'T'};
        Tabell.byttNy(c, 1, 2);
        System.out.println(c);
    }*/

    //1.2.2 Oppgave 4
    //Lag metoden public static void skriv(int[] a, int fra, int til). Den skal skrive ut tallene i intervallet a[fra:til>
    // til konsollet - alle på én linje og et mellomrom mellom hvert tall. Ikke mellomrom og ikke linjeskift etter siste verdi.
    // Lag så metoden public static void skriv(int[] a). Den skal skrive ut hele tabellen - alle på én linje, en blank mellom hvert tall.
    // Ikke mellomrom og ikke linjeskift etter siste verdi. Legg begge metodene i samleklassen Tabell.

    /*public static void main(String[] args){
        int [] a = {2, 4, 54, 21, 56, 32, 1, 6};
        Tabell.skriv(a, 3, 6);
    }*/

    /*public static void main(String[] args){
        int [] a = {3, 4, 56, 23, 45};
        Tabell.skriv(a);
    }*/

    //1.2.2 Oppgave 5
    //Lag to skrivln-metoder. De skal ha samme signatur og fungere på samme måte som de to skriv-metodene i Oppgave 4 ,
    // men utskriften skal avsluttes med et linjeskift. Legg begge metodene i samleklassen Tabell.
    /*public static void main(String[] args){
        int [] a = {2, 4, 54, 21, 56, 32, 1, 6};
        Tabell.skrivln(a, 3, 6);
        Tabell.skrivln(a);
    }*/

    //1.2.3 Oppgave 1
    //Legg metodene Programkode 1.2.3 a) og 1.2.3 d), inn i samleklassen Tabell.

    //1.2.3 Oppgave 2
    //Sett deg inn i (se kildekoden) metoden rangeCheck() i Arrays.

    //1.2.3 Oppgave 3
    //Gjør om maks-metoden i Programkode 1.2.1 b), som du nå skal ha lagt inn i class Tabell, slik at parameterverditesten
    // blir erstattet med Programkode 1.2.3 b) og c). Lag så et testprogram der maks-metoden inngår (bruk main i class Program),
    // men med parameterverdier som du vet vil føre til at unntak kastes. Velg verdier slik at du får frem alle de mulige feilmeldingstypene.

    /*public static void main(String[] args) {
        int [] a = {4, 5, 34, 23, 67, 43};
        int i = Tabell.maksNy(a, 3, 7);
        System.out.println(i);
    }*/

    //1.2.3 Oppgave 4
    //	Gå videre fra Oppgave 3. Dvs. lag også kode som tester parameteren a og som gir en fornuftig feilmelding hvis a er null.
    /*public static void main(String[] args) {
        int [] a = null;
        int i = Tabell.maksNy(a, 3, 7);
        System.out.println(i);
    }*/

    //1.2.3 Oppgave 5
    // I Oppgave 5, 6 og 7 i Avsnitt 1.2.2 skulle det lages metoder som arbeidet i et halvåpent intervall.
    // Bruk metoden fratilKontroll() til å sjekke at intervallene er lovlige.
    /*public static void main(String[] args) {
        int[] a = {2, 4, 54, 21, 56, 32, 1, 6};
        Tabell.skrivln(a, 3, 9);
    }*/

    //1.2.4 Oppgave 1
    //	Legg nestMaks-metoden fra Programkode 1.2.4 a) i samleklassen Tabell. Legg så Programkode 1.2.4 b) inn i main-metoden i klassen
    //	Program og sjekk at du får rett svar. Obs. Du får andre svar enn det som eksempelutskriften i Programkode 1.2.4 b) viser siden
    //	metoden randPerm gir nye permutasjoner hver gang den kalles.
    /*public static void main(String[] args) {
        int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
        int[] b = Tabell.nestMaks(a);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

        Tabell.skrivln(a);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);

        // Eksempel på en utskrift:

        // 12 16 15 6 10 8 9 2 14 19 5 18 20 13 3 7 11 1 4 17
        // Størst(20) har posisjon 12, nest størst(19) har posisjon 9
    }*/

    //1.2.4 Oppgave 2
    //Lag en versjon av nestmaks-metoden der du bytter om slik at den største kommer forrest. Dermed kan letingen etter den nest
    // største starte i posisjon 1. Pass på og bytt tilbake før metoden avslutter slik at tabellen kommer tilbake i sin
    // originale tilstand. Obs. Det blir et spesialtilfelle her når den nest største verdien ligger forrest i tabellen.
    // Pass på at det tilfellet behandles rett.

    /*public static void main(String[] args) {
        int [] a = {7, 2, 3, 5, 6};
        int [] b = Tabell.nestMaks2(a);
        System.out.println(Arrays.toString(b));
    }*/

    //1.2.4 Oppgave 3
    //Som i Oppgave 2, men bytt om slik at den største havner bakerst. Obs. Det blir et spesialtilfelle her når den nest
    //største verdien ligger bakerst i tabellen. Pass på at det tilfellet behandles rett.

    /*public static void main(String[] args) {
        int [] a = {2, 3, 5, 6, 8};
        int [] b = Tabell.nestMaks3(a);
        System.out.println(Arrays.toString(b));
    }*/

    //1.2.4 Oppgave 4
    //Idéen i Oppgave 3 kan utvides til å bli en sorteringsalgoritme. Finn først den største og bytt om slik at den kommer bakerst.
    // Finn så den største i det intervallet som ikke har med den siste og bytt om slik at den kommer nest bakerst.
    // Finn så den største i intervallet som ikke har med de to siste og bytt om slik at den kommer på tredje bakerst. Osv.
    // Lag metoden public static void sortering(int[] a) med dette som idé.

    /*public static void sortering(int[] a){
        for(int i=a.length; i>1; --i){ //Går igenom en forlökke som startar på det sista elementen och går baklänges.
            int m = Tabell.maks(a); //Hittar maxvärdet i tabellen.
            Tabell.bytt(a, i-1, m); //Byter ut maxvärdet mot i-1 så att det går nedåt.
        }
    }*/

    //1.2.6 Uppgift 1
    //	Sjekk at versjonen av nestMaks-metoden i Programkode 1.2.5 a) utfører nøyaktig 2n − 3 sammenligninger når tabellen er sortert.

    /*public static int[] nestMaks(int[] a) // ny versjon
    {
        int n = a.length;     // tabellens lengde
        if (n < 2) throw      // må ha minst to verdier
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = 0;      // m er posisjonen til største verdi
        int nm = 1;     // nm er posisjonen til nest største verdi

        // bytter om m og nm hvis a[1] er større enn a[0]
        if (a[1] > a[0]) { m = 1; nm = 0; } //En sammenligning här (1)

        int maksverdi = a[m];                // største verdi
        int nestmaksverdi = a[nm];           // nest største verdi

        for (int i = 2; i < n; i++)
        {
            if (a[i] > nestmaksverdi) //Denna sammenligningen är alltid sann i det värsta tillfället (n-2)
            {
                if (a[i] > maksverdi) //Denna sammenligningen är alltid sann i det värsta tillfället (n-2)
                {
                    nm = m;
                    nestmaksverdi = maksverdi;     // ny nest størst

                    m = i;
                    maksverdi = a[m];              // ny størst
                }
                else
                {
                    nm = i;
                    nestmaksverdi = a[nm];         // ny nest størst
                }
            }
        } // for

        return new int[] {m,nm};    // n i posisjon 0, nm i posisjon 1

        //När vi har 1 sammenligning + (n-2) + (n-2) så får vi 2n - 4 + 3 = 2n-3

    }*/

    //1.2.6 Uppgift 2
    //For hvilke tabeller bruker metoden færrest mulig sammenligninger?

    //Det blir minst antal sammenligningar när det två största talen ligger först i tabellen.

    //1.2.6 Uppgift 3
    //Er det noen forskjell på gjennomsnittlig effektivitet, effektiviteten i det mest ugunstige tilfellet og effektiviteten
    // i det beste tilfellet for maks-metoden, dvs. for den metoden som finner posisjonen til den største verdien i en tabell?

    /*public static int maks(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;
        int maksverdi = a[fra];

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi) //Den a sammenligningen är alltid sann i värsta tillfället (n-1) I bästa tillfället så måste det också göras (n-1) sammanligningar.
            {
                m = i;
                maksverdi = a[m];
            }
        }
        return m;
    }*/

    //1.2.8 Uppgift 1
    //Et «møte» er det samme som en sammenligning. Hvor mange sammenligninger trengs for å gjennomføre en turnering med 16 deltagere slik som i Figur 1.2.8 a)?
    // Hva med 8 deltagere? Hva med 2k deltagere der k er et positivt heltall.

    //I en turnering med 16 deltagare så blir det 15 möten (n-1). I en turnering med 8 deltagare så blir det 7 möten (n-1).
    //I en turnering med 2k deltagare så blir det 2k-1 möten.

    //1.2.8 Uppgift 2
    //Tegn et turneringstre slik som i Figur 1.2.8 a) for tilfellene:
    // a) 3, 15, 8, 11, 13, 9, 10, 5 og
    // b) 10, 17, 13, 16, 17, 8, 12, 15, 9, 15, 16, 15, 10, 13, 14, 17.

    //a)                  (15)
    //            (15)            (13)
    //        (15)    (11)    (13)    (10)
    //      (3)(15) (8)(11) (13)(9) (10)(5)

    // b)                               (17)
    //                 (17)                             (17)
    //        (17)             (17)             (16)              (17)
    //   (17)     (16)     (17)    (15)     (15)    (16)     (10)     (17)
    // (10)(17) (13)(16) (17)(8) (12)(15) (9)(15) (16)(15) (10)(13) (14)(17)

    //1.2.8 Uppgift 3
    //Bruk de samme 16 verdiene som i Figur 1.2.8 a). Lag en turnering for å finne minst verdi.

    //                                (5)
    //               (5)                                (10)
    //       (5)              (23)              (15)             (10)
    //   (9)     (5)     (23)     (26)     (15)     (18)     (16)     (10)
    // (9)(21) (5)(25) (27)(23) (26)(28) (17)(15) (19)(18) (16)(20) (14)(10)

    //1.2.9 Uppgift 1
    //Finn antall noder i Figur 1.2.8 a)? Hvor mange er bladnoder? Hvor mange er indre noder?

    //Antal noder totalt = 31 st.
    //Bladnoder = 16 st
    //Inre noder = 15 st

    //1.2.9 Uppgift 2
    //Hvor mange noder er det på nivå k (k = 0, 1, 2, . . ) i et turneringstre av den typen som Figur 1.2.8 a) viser?

    //eftersom nivåerna startar under rotnoden så är det 2 noder på nivå 1, 4 på nivå 2, 8 på nivå 3 osv.
    //Generellt sätt så kan man då skriva att antal noder på nivå k är 2 upphöjt i k.

    //1.2.9 Uppgift 3
    //Anta at antall deltagere n i en turnering er på formen n = 2k, dvs. n = 1, 2, 4, 8, osv.
    // Finn svarene på flg. spørsmål uttrykt ved n: Hvor mange noder får turneringstreet? Hvilken høyde får treet?
    // Hvor mange er bladnoder og hvor mange er indre noder? Hvor mange sammenligninger utføres i turneringen?

    //Antal noder i trädet blir 2n-1.
    //Höjden på trädet blir log2n = 2 upphöjt i ? = n. Eftersom deltagarantalet ökar för varje nivå med att dubblas.
    //Antal bladnoder blir n.
    //Antal inre noder blir n-1 vilket är samma som antalet sammenligninger.

    //1.2.10 Uppgift 1
    //Tegn et turneringstre, slik som i Figur 1.2.10 c), skriv opp de som vinneren har slått ut og finn den nest største verdien for flg. tre samlinger av tall:

    //a) 10, 17, 13, 16, 17, 8, 12, 15, 9, 15
    //  Det är 10 tal dvs att det är 10*2 -1 antal noder = 19.
    //                            (17)
    //                 (17)                (17)
    //           (15)        (17)     (16)     (17)
    //       (15)    (15)  (10)(17) (13)(16) (17)(8)
    //    (12)(15) (9)(15)

    //Eftersom vi räknar med det första största talet från vänster så har vinnaren slagit ut 10, 15 och 17.

    //b) 5, 11, 7, 13, 2, 9, 10, 8, 3, 14, 6, 12
    // Det är 12 tal dvs 12*2-1 noder = 23
    //                              (14)
    //               (14)                     (13)
    //       (10)            (14)         (11)    (13)
    //   (9)     (10)    (14)   (12)    (5)(11) (7)(13)
    //  (2)(9) (10)(8) (3)(14) (6)(12)

    //vinnaren slog ut 3, 12, 10, 13



}
