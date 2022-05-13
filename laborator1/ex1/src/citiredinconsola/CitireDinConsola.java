package citiredinconsola;

import java.util.Scanner;

/**
 *Necula Narcis(*) 7
 * Sasu Alexandru 7
 * Predescu Denisa 8
 * Tabacaru Andrei 4
 * Grosu Ilinca 3
 * Pascu Adrian 5
 * Kayed Amar
 * Dina Andrei(*) 5
 * Vasiliu Miruna 5
 * Ciurescu Andreea 8
 * Alex Serafim 7
 * Lazar Stefania 2
 * Oprea Ana 5
 * Ilie Tudor 3
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
