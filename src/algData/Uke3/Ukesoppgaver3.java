package algData.Uke3;

import algData.Tabell;

import java.util.Arrays;

public class Ukesoppgaver3 {

    //1.3.1 Uppgift 1
    //Legg metodene fra Programkode 1.3.1 a) og Programkode 1.3.1 b) i samleklassen Tabell.

    //1.3.1 Uppgift 2
    //Gitt flg. permutasjoner av tallene fra 1 til 6:
    // a) 2 3 6 1 4 5, b) 2 3 6 1 5 4, c) 2 3 1 6 5 4, d) 2 3 6 5 4 1 og e) 2 6 5 4 3 1.
    // Finn, for hver av dem, den neste i leksikografisk rekkefølge. Bruk så metoden nestePermutasjon som fasit.

    //a) 2 3 6 1 5 4 Rätt b) 2 3 6 4 1 5 Rätt c) 2 3 4 1 5 6 Rätt d) 2 4 1 3 5 6 Rätt e) 3 1 2 4 5 6 Rätt

    /*public static void main(String[] args){
        int [] a = {2,3,6,1,4,5}, b = {2,3,6,1,5,4}, c = {2,3,1,6,5,4}, d = {2,3,6,5,4,1}, e = {2,6,5,4,3,1};

        Tabell.nestePermutasjon(a);
        System.out.println("a = " + Arrays.toString(a));
        Tabell.nestePermutasjon(b);
        System.out.println("b = " + Arrays.toString(b));
        Tabell.nestePermutasjon(c);
        System.out.println("c = " + Arrays.toString(c));
        Tabell.nestePermutasjon(d);
        System.out.println("d = " + Arrays.toString(d));
        Tabell.nestePermutasjon(e);
        System.out.println("e = " + Arrays.toString(e));
    }*/

    //1.3.1 Uppgift 3
    //Skriv opp de 10 første permutasjonene som kommer etter 3 1 4 9 7 10 8 6 5 2 leksikografisk. Bruk metoden nestePermutasjon som fasit.

    //Facit
    //3 1 4 9 8 2 5 6 7 10 Rätt
    //3 1 4 9 8 2 5 6 10 7 Rätt
    //3 1 4 9 8 2 5 10 6 7 Fel 3 1 4 9 8 2 5 7 6 10
    //3 1 4 9 8 2 5 10 7 6 Fel 3 1 4 9 8 2 5 7 10 6
    //3 1 4 9 8 2 10 5 6 7 Fel 3 1 4 9 8 2 5 10 6 7
    //3 1 4 9 8 2 10 5 7 6 Fel 3 1 4 9 8 2 5 10 7 6
    //3 1 4 9 8 2 10 7 5 6 Fel 3 1 4 9 8 2 6 5 7 10
    //3 1 4 9 8 2 10 7 6 5 Fel 3 1 4 9 8 2 6 5 10 7
    //3 1 4 9 8 10 2 5 6 7 Fel 3 1 4 9 8 2 6 7 5 10
    //3 1 4 9 8 10 2 5 7 6 Fel 3 1 4 9 8 2 6 7 10 5

    /*public static void main(String[] args){
        int [] a = {3,1,4,9,7,10,8,6,5,2};
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
    }*/

    //1.3.2 Uppgift 1
    //Hvor mange inversjoner har premutasjonen 3 5 4 7 6 8 1 2 9 10 ?

    //Svar: 14 stycken inversjoner.

    //1.3.4 Uppgift 1
    //I Figur 1.3.4 d) er det gjort tre iterasjoner. Hva blir det etter i) 5 og ii) 7 iterasjoner.

    //Svar: i) 3 4 5 6 7 19 21 23 10 14 15 11 16 17 8 ii) 3 4 5 6 7 8 10 23 21 14 15 11 16 17 19

    //1.3.4 Uppgift 3
    //Legg metoden i Programkode 1.3.4 a) inn i samleklassen Tabell. Pass på at du da allerede har metodene bytt() og min() der.
    //Se også Oppgave 1 i Avsnitt 1.2.1. Sjekk så at Programkode 1.3.4 b) virker.

    /*public static void main (String[] args){
        //int [] a = {7,5,9,2,10,4,1,8,6,3};
        int [] a = new int [10000];
        int i;
        for(i =0; i < a.length; i++){
            a[i] = (int)(Math.random()*100);
        }
        Tabell.utvalgssortering(a);
        Tabell.snu(a);
        Tabell.skriv(a);
    }*/

    //1.3.4 Uppgift 5
    //Utvalgssortering i Programkode 1.3.4 a) bruker to hjelpemetoder. Det er mest vanlig å kode den uten hjelpemetoder. Søk på internett.
    //Bruk «selection sort» som søkeord. Lag så din egen versjon (uten hjelpemetoder)!
    //Hvor lang tid bruker den for en tilfeldig tabell med 100000 verdier? Er den bedre enn den fra Programkode 1.3.4 a)?

    /*public static void main (String[] args){
        int [] a = new int [10000];
        int i;
        for(i =0; i < a.length; i++){
            a[i] = (int)(Math.random()*100);
        }

        for (i = 0; i < a.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < a.length; j++){
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        for(i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }*/

    //Den använder 1s 654 ms för en tillfällig tabell med 10 000 värden.
    //1.3.4a använder 1s 616 ms så den är lite snabbare.

    //1.3.4 Uppgift 9
    //Lag metoden public static void utvalgssortering(int[] a, int fra, int til). Den skal sortere intervallet a[fra:til>. Pass på at du tester lovligheten til intervallet!

    /*public static void utvalgssortering(int[] a, int fra, int til){
        Tabell.fratilKontroll(a.length, fra, til); //Använder metoden från-tillkontroll för att testa lovligheten på tabellen.

        for (int i = fra; i < til; i++){ //Loopar igenom hela tabellen
            Tabell.bytt(a, i, Tabell.min(a, i, til)); //Använder bytt-metoden för att byta plats på i och det resterande minsta värdet i tabellen efter varje runda.
        }
    }

    public static void main(String[] args) {
        int [] a = {3,4,6,1,7,2,8};
        utvalgssortering(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }*/

    //1.3.4 Uppgift 10
    //En sorteringsalgoritme kalles stabil hvis like verdier har samme innbyrdes rekkefølge etter sorteringen som de hadde før. Er utvalgssortering stabil?

    //Svar: Nej, utvalgssortering är inte stabil, då man kan ha två lika värden som blir flyttade bakom varandra vid förekomsten av ett ännu mindre tal efter dem i tabellen.

    //1.3.4 Uppgift 11
    //Ta utgangspunkt i den versjonen av utvalgssortering som står i Programkode 1.3.4 a). Men gjør ingen ombytting i det tilfellet samme verdi vil bli byttet med seg selv.
    //Det vil påføre algoritmen en ekstra kostnad siden det må gjøres en sammenligning hver gang, men spare arbeidet med unødvendige ombyttinger.
    // Finn ut, ved å bruke tilfeldige permutsajoner, hvor mange ganger det skjer at en verdi ville ha blitt byttet med seg selv.
    // Spesielt hvis tabellen allerede er sortert, byttes en verdi med seg i hver iterasjon.
    // Kanskje du klarer å finne en formel for det gjennomsnittlige antall ganger en verdi vil bli byttet med seg selv? Vil det lønne seg å ha denne ekstra testen?

    /*public static void utvalgssortering(int[] a)
    {
        int antalBytt = 0; //En räknare som håller koll på antal bytningar.
        for (int i = 0; i < a.length - 1; i++) { //loopar igenom hela tabellen
            int min = Tabell.min(a, i, a.length); //Hittar minsta värdet i tabellen.
            if(min != i) { //Om minstavärdet inte är samma som i så byter vi plats på i och minsta värdet och plussar på räknaren med 1.
                Tabell.bytt(a, i, min);
                antalBytt++;
            }
        }
    }*/

    //Det lönar sig inte att ha denna testen då m = i händer så relativt sällan.

    //1.3.5 Uppgift 2
    //Sjekk at metoden lineærsøk gir korrekt returverdi hvis det søkes etter en verdi som er mindre enn den minste i tabellen.
    //Hva skjer hvis tabellen er tom, dvs. a.length = 0? La a være tabellen i Figur 1.3.5 a).
    //Hva blir returverdiene fra lineærsøk hvis vi søker etter 2, 15, 16, 40 og 41?

    /*public static int linearsok(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = 0; for( ; a[i] < verdi; i++);  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }

    public static void main(String[] args) {
        int [] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};
        //int [] a = {};
        int resultat = linearsok(a, 41);
        System.out.println(resultat);
    }*/

    //Om vi säker efter ett värde som är mindre än a[i] så startar aldrig for-lökken och vi får resultatet -1
    //Om tabellen är noll returnerar den -1.
    //2 = -1, 15 = -6, 16 = 5, 40 = 14, 41 = -16

    //1.3.5 Uppgift 3
    //Hvis verdi forekommer flere ganger i tabellen a, vil posisjonen til den første av dem (fra venstre) bli returnert.
    //Lag en versjon av lineærsøk der det er posisjonen til den siste av dem som returneres. Gjør det f.eks. ved å lete motsatt vei, dvs. fra høyre mot venstre.

    /*public static int linearsok(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi < a[0]) //Om längden på tabellen är 0 eller värdet är mindre än a[0] så returnerar vi -1 då värdet är mindre än det minsta.
            return -1;

        int i = a.length-1; for( ; a[i] > verdi; i--); //Startar lökken på sista index och går neråt med en så länge a[i] är större än värdet.

        return verdi == a[i] ? i : -(i + 2);  //Om värdet är samma som a[i] så returnerar vi i, annars returnerar vi i + 2 eftersom vi startade på det sista värdet i tabellen.
    }
    public static void main(String[] args) {
        int [] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};
        int resultat = linearsok(a, 34);
        System.out.println(resultat);
    }*/

}
