package instructiunidecontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InstructiuniDeControl {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        for(int i = 0; i < l1.size(); i ++) {
            System.out.println("Se afiseaza >>>" + l1.get(i));
        }

        for(Integer i : l1){
            System.out.println("Se afiseaza >>>" + i);
        }

        l1.forEach(e -> System.out.println(e));

        l1.forEach(System.out::println);


    }
}
