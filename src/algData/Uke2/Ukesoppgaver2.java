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

    public static void main(String[] args) {
        int [] a = {4, 5, 34, 23, 67, 43};
        int i = Tabell.maksNy(a, 3, 5);
        System.out.println(i);
    }
}
