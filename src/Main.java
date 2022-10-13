import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random();
        int[] tab = new int[100];
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        //Wypełnianie tabliczy losowymi liczbami całkowitymi
        for (int i=0; i<tab.length; i++)
            tab[i] = generator.nextInt(100) ;
        //Sortowanie tablicy malejaco
        MergeSort sort = new MergeSort();
        sort.sort(tab, 0, tab.length-1);

        //Wypisanie posortowanej tablicy
        System.out.println("Posortowana tablica: ");
        for (int i=0; i<tab.length; i++)
            System.out.print(tab[i] + " ");

        System.out.println("\nJakiej liczby szukasz? Podaj: ");
        try{
            x = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("\nWprowadzono nieprawidlowe dane.");
            return;
        }


        System.out.println("\nSzukam liczby " + x);
        if (search(tab, x) == true)
            System.out.println("Znalazlem liczbe");
                    else
            System.out.println("Niestety nie ma takiej liczby w tablicy");            ;

    }

    private static boolean search(int[] numbers, int x) {

        if (numbers[0] < x)
            return false;
        if (numbers[numbers.length - 1] > x)
            return false;
        int start = 0;
        int stop = numbers.length - 1;
        int m = 0;

        do {
            m = (start + stop) / 2;
            if (numbers[m] == x)
                return true;
            else if (numbers[m] < x) {
                stop = m - 1;
            }
            else {
                start = m + 1;
            }
        } while (start <= stop);
        return false;
    }
}