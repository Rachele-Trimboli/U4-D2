package Esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String stringaInserita = scanner.nextLine();
        pariDispari(stringaInserita);
    }

    public static void pariDispari(String str){
        if(str.length() % 2 == 0){
            System.out.println("numero di caratteri pari");
        } else{
            System.out.println("numero di caratteri dispari");
        }
    }
}
