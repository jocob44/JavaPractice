import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteatorExample {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("en");
        lista.add("Java");

        Spliterator<String> spliterator = lista.spliterator();

        Spliterator<String> spliteratorb = spliterator.trySplit();

        // Recorriendo los elementos con un Spliterator
        spliterator.forEachRemaining(System.out::println);

        Spliterator<String> spliteratorc = spliterator.trySplit();

        // Recorriendo los elementos con un Spliterator
        spliteratorb.tryAdvance(System.out::println);

        // Recorriendo los elementos con un Spliterator
        if(spliteratorc != null) spliteratorc.tryAdvance(System.out::println);
    }
}
