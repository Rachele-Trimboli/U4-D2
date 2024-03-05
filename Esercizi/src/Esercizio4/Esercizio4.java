package Esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero intero da cui vuoi iniziare il conto alla rovescia");
        int num = scanner.nextInt();
        contoAllaRovescia(num);
    }

    public static void contoAllaRovescia(int num){
        for (int i=num; i>=0; i--){
            System.out.println(i);
        }
    }
}
