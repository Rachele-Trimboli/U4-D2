package Esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String stringaInserita = scanner.nextLine();
        pariDispari(stringaInserita);

        System.out.println("Inserisci un'anno per sapere se è bisestile o no");
        int anno = Integer.parseInt(scanner.nextLine());
        annoBisestile(anno);

    }

    public static void pariDispari(String str){
        if(str.length() % 2 == 0){
            System.out.println("numero di caratteri pari");
        } else{
            System.out.println("numero di caratteri dispari");
        }
    }

    public static void annoBisestile(int anno){
        if (anno % 4 == 0){
            System.out.println(true + "L'anno inserito è bisestile");
        } else if(anno % 100 ==0 && anno % 400 == 0){
            System.out.println(true + " L'anno inserito è bisestile perchè è divisibile per 100 e per 400");
        }else {
            System.out.println("L'anno inserito non è bisestile");
        }
    }
}
