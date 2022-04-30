/*
Scrivi un programma che istanziato un vettore di interi di 5 posizioni chieda all'utilizzatore di inserire un numero in
 una posizione specificata; gestire l'eventualità che vengano violati i limiti dell'array .
 */

import java.util.Scanner;

public class Prova {
    public static void main (String []args){
        int v[] = new int [5];
        System.out.println("Inserisci l'indice: ");
        int i = getNum();
        System.out.println("Inserisci il valore: ");
        int n = getNum();
        try{
            insValore(v, i, n);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static int getNum () {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    public static void insValore(int v[], int i, int n) throws IndexOutOfBound{
            if (i > 4)
                throw new IndexOutOfBound();
            else
                v[i] = n;
    }
}
