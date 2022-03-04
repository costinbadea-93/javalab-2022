package citiredinconsola;

import java.util.Scanner;

/**
 *Necula Narcis
 *Sasu Alexandru
 * Predescu Denisa
 * Tabacaru Andrei
 * Grosu Ilinca
 *Pascu Adrian
 * Kayed Amar
 * Dina Andrei(*)
 * Vasiliu Miruna
 * Ciurescu Andreea
 * Alex Serafim
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
