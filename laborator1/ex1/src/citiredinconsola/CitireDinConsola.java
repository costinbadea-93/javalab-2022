package citiredinconsola;

import java.util.Scanner;

/**
 *Necula Narcis(*) 4
 *Sasu Alexandru 4
 * Predescu Denisa 5
 * Tabacaru Andrei 4
 * Grosu Ilinca 3
 * Pascu Adrian 3
 * Kayed Amar
 * Dina Andrei(*) 5
 * Vasiliu Miruna 3
 * Ciurescu Andreea 5
 * Alex Serafim 5
 * Lazar Stefania 2
 * Oprea Ana 4
 * Ilie Tudor 2
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
