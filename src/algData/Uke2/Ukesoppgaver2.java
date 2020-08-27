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

    //I Java 1.5 ble det innført en ny type for-løkke - en såkalt for-alle-løkke. Se Programkode 1.2.1 d).
    // Den må du lære deg hvis du ikke allerede kan den. Se f.eks. Vedlegg E.

    public static void main(String[] args){
        char[] bokstaver = {'A','B','C','D','E','F','G','H','I','J'};  // 10 bokstaver

        char[] d = Arrays.copyOfRange(c,4,8);           // en kopi av c[4:8>
        for (char k : d) System.out.print(k + " ");     // kopien d skrives ut

        // Utskrift: E F G H
    }

}
