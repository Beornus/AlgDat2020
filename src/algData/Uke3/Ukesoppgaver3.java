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


}
