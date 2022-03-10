package citiredinconsola;

import java.util.Scanner;

/**
 *Necula Narcis(*) 2
 *Sasu Alexandru 2
 * Predescu Denisa 2
 * Tabacaru Andrei 2
 * Grosu Ilinca 2
 * Pascu Adrian 2
 * Kayed Amar
 * Dina Andrei(*) 2
 * Vasiliu Miruna 2
 * Ciurescu Andreea 2
 * Alex Serafim 2
 * Lazar Stefania
 * Oprea Ana
 * Ilie Tudor
 */
public class CitireDinConsola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc1 = new Scanner("Scanner");

        System.out.println("Inroduceti numere de la tastatura: ");

        while (true){
            int n = sc.nextInt();
            System.out.println("Ati introdus: " + n);

            if(n == 0){
                break;
            }
        }

        /**
         *  se vor citi de la tastatura 2 numere intregi
         *  si un operator(+, -, *, /)
         *  in functie de operatorul ales, se va afisa rezultatul
         */
    }
}
