import java.util.Arrays;
import java.util.List;

public class SpliteatorEnLamdas {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Hola", "Mundo", "en", "Java");


            lista.stream()
                    .spliterator()
                    .forEachRemaining(System.out::println);

    }
}