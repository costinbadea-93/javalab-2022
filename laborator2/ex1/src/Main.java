import singleton.SingletonsService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Declarare
         */
            int [] arr = {1,2,3,7,8,5};
//            int [][] arr2 = {
//                    {1,2,3},
//                    {4,5,6}
//            };

//        int [][][][][] arr3 ={};

        // array-urile au o dimensiune fixa
//        int[] arr4 = new int[0];




        /**
         * Parcurgere
         */
        for(int i = 0; i < arr.length; i ++) {
            System.out.println("Elem : " + arr[i]);
        }

        for(int i : arr) {
            System.out.println("Elem : " + i);
        }

        Arrays.stream(arr)
                .forEach(System.out::println);





        /**
         * Pasarea array-urilor ca parametrii in functii ( var-args)
         */

        m2(1, 2, 4,6,7,8,9,90,0,45);


        /**
         * Adaugare elemente in array
         */
        SingletonsService singletonsService = SingletonsService.getInstance();
        int [] arr5 = new int[0];
        arr5 = singletonsService.add(arr5,6);
        arr5 = singletonsService.add(arr5,8);
        arr5 = singletonsService.add(arr5,4);
        arr5 = singletonsService.add(arr5,6);
        System.out.println(Arrays.toString(arr5));

        Animal a1 = new Animal("Bobita");
        System.out.println(a1);

        /**
         *  !NOTA folositi clasa Arrays
         */

        int [] arr6 = {4,5,7,2,3};
        Arrays.sort(arr6); // [2,3,4,5,7]
        System.out.println(Arrays.binarySearch(arr6,6));
        /**
         * daca elementul nu exista binnarySearch => (-(insertion point) -1)
         */

        Animal an1 = new Animal("C1");
        Animal an2 = new Animal("A1");
        Animal an3 = new Animal("B1");
        Animal [] arr7 = {an1,an2,an3};
//        AnimalComparator animalComparator = new AnimalComparator();
        Comparator<Animal> animalComparator = (o1,o2) -> o1.getNume().compareTo(o2.getNume());
        Arrays.sort(arr7,animalComparator);
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.binarySearch(arr7,an1,animalComparator));


        /**
         * Singleton Pattern
         */
//        SingletonsService singletonsService = SingletonsService.getInstance();



        //Cuvinte anagrame
        //ITALIA
        //ALIATI
        String s1 = "ITALIA";
        String s2 = "ALIAT";

        System.out.println("Is anagram???? =>" + isAnagram(s1,s2));

    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String [] s1Data = s1.split("");
        String [] s2Data = s2.split("");
        System.out.println(Arrays.toString(s1Data));
        System.out.println(Arrays.toString(s2Data));
        Arrays.sort(s1Data);
        Arrays.sort(s2Data);
        return Arrays.equals(s1Data, s2Data);
    }

    public static void m1(int n, int [] arr){
        System.out.println("n = " + n);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void m2(int n, int... arr){
        System.out.println("n = " + n);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static int [] add(int [] arr, int elem){
        int [] tmp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i ++) {
            tmp[i] = arr[i];
        }
//        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length -1] = elem;

        return tmp;
    }

}


//class AnimalComparator implements Comparator<Animal> {
//    @Override
//    public int compare(Animal o1, Animal o2) {
//        return o1.getNume().compareTo(o2.getNume());
//    }
//}

class Animal {
    private String nume;

    public Animal(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
