import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8);

        /**
         * -numerele pare
         * -patratul numarului par este
         * -afisare in consola
         */
        Predicate<Integer> predicate = n -> n%2 == 0;
        Function<Integer, String> function = n -> "Patratul numarului par " + n + " este " + (n*n);
        Consumer<String> consumer = s -> System.out.println(s);
        l1.stream()
                .filter(predicate)
                .map(function)
                .forEach(consumer);

        l1.stream()
                .filter(n -> n%2 == 0)
                .map(Main::mult)
                .forEach(System.out::println);

        /**
         * Consumer
         * Supplier
         * Predicate
         * BiPredicate
         * Function
         * BiFunction
         * UnaryOperator
         * BinaryOperator
         */
    }

    public static Integer mult(Integer n) {
        return n *n;
    }
}
