import java.util.Arrays;
import java.util.Random;

public class Ukesoppgaver1 {
    /*public static void main(String[] args){
        int [] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int minIndex = min(a);
        System.out.println(minIndex);
    }

    public static int min(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] <= a[m]) m = i;
        }
        return m;
    }
}
 */
// 1.1.3
// 5.Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene
// til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du
// returnere tabellen b definert ved:   int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?

 /*public static void main(String[] args){
        int [] a = {2, 5, 45, 32, 6, 16, 22};

        int [] minMaks = minMaks(a);
        System.out.println("Positionen till det största och minsta talet är index " + Arrays.toString(minMaks));
    }*/

    public static int[] maks1(int[] a) {
        int min = 0, minste = a[0];
        int max = 0, storste = a[0];

        int m = 0;

        for(int i = 1; i < a.length; i++){ //1 + n + n-1
            m = a[i];

            if(m < minste){ // 1 * n-1
                minste = m;
                min = i;
            }
            if (m > storste){ // 1 * n-1
                storste = m;
                max = i;
            }
        }
        return new int [] {min, max};
    }

// 6. Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode long fak(int n) som regner ut n! .
// Hvor mange multiplikasjoner utføres i metoden?

  /*  public static void main(String[] args){
        int val = 6;

        long resultat = fak(val);

        System.out.println(resultat);



    }

    public static long fak(int n) {
        long resultat = n;

        for (int i = 1; i < n; i++) {
            resultat *= i;
        }

        return resultat;
    }
    //Antall multiplikasjoner i metoden är n-1
    */

  //1. Hvor mange grunnleggende operasjoner utfører Programkode 1.1.4 hvis tabellen a inneholder
    // i) 10, 5, 7, 2, 9, 1, 3, 8, 4, 6
    // ii) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    public static int maks2(int[] a)
    {
        int m = 0;               // (i) 1 ) (ii) 1 )
        int maksverdi = a[0];    // (i) 2 ) (ii) 2 )

        for (int i = 1; i < a.length; i++) // (i) 1 + 10 + 9 ) (ii) 1 + 10 + 9 )
            if (a[i] > maksverdi) // (i) 2 * 9 ) (ii) 2 * 9 )
        {
            maksverdi = a[i];     // (i) 0 ) (ii) 2 * 9 )
            m = i;                // (i) 0 ) (ii) 1 * 9 )
        }
        return m;   // (i) 1 ) (ii) 1 )

        //Svar oppgave i) 42
        //Svar oppgave ii) 69
    }

    //1.Sje kk at Programkode 1.1.5 gir korrekte resultater. Hva skjer hvis a har lengde 1 og hva hvis a er tom (lengde 0).
    // Se også Avsnitt 1.1.7.

  /*  public static void main(String[] args){
        int [] a = {5, 6, 4, 23, 43, 13, 89};

        int max = maks(a);
        System.out.println(max);
    } */

    public static int maks3(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks
    // Ja koden gir korrekte resultater. Om arrayet har ett element blir svaret 0 och om arrayet är tomt får du ett exception.

  //Oppgave 1.1.10 1. Utvid class Program og gjør om main-metoden slik som det bes om i Programkode 1.1.10. Kjør programmet!
    // Du kan endre tidsforbruket ved å endre tabellstørrelse og antall gjentagelser. Lag f.eks. tabellen være dobbelt så stor (n = 200_000).

    // 1. Metoden bytt fra Programkode 1.1.8 d) skal inn her
    // 2. Metoden randPerm fra Programkode 1.1.8 e) skal inn her
    // 3. Metoden antallMaks fra Programkode 1.1.9 a) skal inn her

    public static void main(String[] args)   // hovedprogram
    {
        int n = 100_000, antall = 2_000; // tabellstørrelse og gjentagelser
        long tid = 0;                    // for tidsmåling
        int a[] = randPerm(n);           // en permutasjon av 1, . .  n

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) kostnader(a);
        tid = System.currentTimeMillis() - tid;    // medgått tid
        System.out.println("Faste kostnader: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) maks1(a);  // Programkode 1.1.2
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks1-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) maks2(a);  // Programkode 1.1.4
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks2-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) maks3(a);  // Programkode 1.1.5
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks3-metoden: " + tid + " millisek");
    }

    public static int kostnader(int[] a)  // legges i class Program
    {
        int m = 0;
        for (int i = 1; i < a.length; i++) {}  // en tom blokk
        return m;
    }

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }

    //Svar maks3 går fortest av de vi har jobbet med
}