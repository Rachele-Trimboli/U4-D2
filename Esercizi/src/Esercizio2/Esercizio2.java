package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3");
        int numeroInserito = scanner.nextInt();
        numeroLettere(numeroInserito);


    }

    public static void numeroLettere(int numero){
        switch(numero){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Non riesntra in nessuno dei casi precedenti");
        }
    }
}
