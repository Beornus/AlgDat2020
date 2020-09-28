package algData;

import algData.Uke1.Ukesoppgaver1;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell     // Samleklasse for tabellmetoder
{
    private Tabell() {}   // privat standardkonstruktør - hindrer instansiering

    // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    //Ny metode bytt(char[] c, int i, int j) 1.2.2 Oppgave 3
    public static void byttNy(char[] c, int i, int j){
        char temp = c[i]; c[i] = c[j]; c[j] = temp;
    }

    // Metoden randPerm(int n)                   Programkode 1.1.8 e)
    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            Ukesoppgaver1.bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }
    // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)
    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    // Metoden min(int[] a, int fra, int til)   Programkode 1.2.1 b)
    public static int min(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int minverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] < minverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                minverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)
    public static int maks(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maksNy(int[] a, int fra, int til)
    {
        if(a == null) throw new NullPointerException("Arrayet " + a + " er tomt");
        fratilKontroll(a.length,fra,til);

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }
    // Metoden min(int[] a)                     Programkode 1.2.1 c)
    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }                                      // min-metodene - se Oppgave 1 i Avsnitt 1.2.1

    // Metoden maks(int[] a)                     Programkode 1.2.1 c)
    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }

    public static void skriv(int[] a, int fra, int til){
        int[] kopiAvUrval = Arrays.copyOfRange(a,fra,til);           // en kopi av c[4:8>
        for (int element : kopiAvUrval) System.out.print(element + " ");
    }

    public static void skriv(int[] a){
        for(int element : a) System.out.print(element + " ");
    }

    public static void skrivln(int[] a, int fra, int til){
        fratilKontroll(a.length, fra, til);
        int[] kopiAvUrval = Arrays.copyOfRange(a,fra,til);           // en kopi av c[4:8>
        for (int element : kopiAvUrval) System.out.println(element + " ");
    }

    public static void skrivln(int[] a){
        for(int element : a) System.out.print(element + " ");
        System.out.println();
    }

    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }
    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static int[] nestMaks2(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // längden på tabellen

        if (n < 2) throw   // om tabellen har mindre än två element så kastar den undantag
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m är indexpositionen till tabellens största värde.
        int nm;           // nm ska innehålla värdet av tabellens näst största värde.

        bytt(a, m, 0); // Använder byttmetoden på tabellen a, och byter m med index 0, dvs m kommer först i tabellen.

        nm = maks(a, 1, n); //Nu kan vi gå genom resten av tabellen för att hitta det näst största talet

        if (m == nm)
            nm = 0; //Om det största talet är likt det näst största talet så sätter vi näst största talet till 0(?)

        bytt(a, 0, m); //Byter tillbaka värdena i tabellen så att de ligger där de låg i starten.

        return new int[]{m, nm};      // returnerar ett nytt array med m i posisjon 0 , nm i posisjon 1

    }

    public static int[] nestMaks3(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // Längden på tabellen

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        bytt(a, m, n-1); //Byter på m och n-1(tabellens sista index) för att lägga det största talet längst bak.

        nm = maks(a, 0, n-1); //hittar det näst största värdet mellan index 0 och den sista indexen.

        if(m == nm) nm = n-1; //Om det största värdet är likt det näst största likt n-1(?)

        bytt(a, n-1, m); //Byter tillbaks elementen

        return new int[] {m,nm};      // Returnerar ett nytt array med m i posisjon 0 , nm i posisjon 1
    }
    //1.3.1 a
    public static void snu(int[] a, int v, int h)  // snur intervallet a[v:h]
    {
        while (v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a, int v)  // snur fra og med v og ut tabellen
    {
        snu(a, v, a.length - 1);
    }

    public static void snu(int[] a)  // snur hele tabellen
    {
        snu(a, 0, a.length - 1);
    }
    //1.3.1b
    public static boolean nestePermutasjon(int[] a)
    {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--;   // går mot venstre
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) j--;                 // stopper når a[j] > a[i]
        bytt(a,i,j); snu(a,i + 1);               // bytter og snur

        return true;                             // en ny permutasjon
    }
}