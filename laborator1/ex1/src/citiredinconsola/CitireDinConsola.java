package citiredinconsola;

import java.util.Scanner;

/**
 *Necula Narcis(*) 3
 *Sasu Alexandru 3
 * Predescu Denisa 3
 * Tabacaru Andrei 3
 * Grosu Ilinca 2
 * Pascu Adrian 2
 * Kayed Amar
 * Dina Andrei(*) 3
 * Vasiliu Miruna 2
 * Ciurescu Andreea 3
 * Alex Serafim 3
 * Lazar Stefania
 * Oprea Ana 2
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
