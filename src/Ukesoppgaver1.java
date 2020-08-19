public class Ukesoppgaver1 {
    public static void main(String[] args){
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
