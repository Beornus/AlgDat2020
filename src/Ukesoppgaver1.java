import java.util.Arrays;

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
    }

    public static int[] minMaks(int[] a) {
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
    }*/

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

 /*   public static int maks(int[] a)
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
  */

    //1.Sje kk at Programkode 1.1.5 gir korrekte resultater. Hva skjer hvis a har lengde 1 og hva hvis a er tom (lengde 0).
    // Se også Avsnitt 1.1.7.

    public static void main(String[] args){
        int [] a = {5, 6, 4, 23, 43, 13, 89};

        int max = maks(a);
        System.out.println(max);
    }

    public static int maks(int[] a)  // versjon 3 av maks-metoden
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
}