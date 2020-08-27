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
        int [] a = {2, 3, 5, 6};
        int [] b = Tabell.nestMaks2(a);
        System.out.println(Arrays.toString(b));
    }*/

    //1.2.4 Oppgave 3
    //Som i Oppgave 2, men bytt om slik at den største havner bakerst. Obs. Det blir et spesialtilfelle her når den nest
    //største verdien ligger bakerst i tabellen. Pass på at det tilfellet behandles rett.

    public static void main(String[] args) {
        int [] a = {2, 3, 5, 6};
        int [] b = Tabell.nestMaks3(a);
        System.out.println(Arrays.toString(b));
    }
}
