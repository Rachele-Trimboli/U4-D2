package Esercizio3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola o una frase");
        String stringaInput = scanner.nextLine();
        stringaSplit(stringaInput);


    }

    public static void stringaSplit(String str){
        if (Objects.equals(str, ":q")){

            System.out.println("Hai inserito :q che è un carattere non ammesso");
        }else{
            String[] parts =  str.split("");
            System.out.println(Arrays.toString(parts));
        }

    }
}
