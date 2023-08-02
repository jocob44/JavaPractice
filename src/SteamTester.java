import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SteamTester {

    public static void main(String[] args) {
        Set<Integer> inmutableSet = Collections.unmodifiableSet(Set.of(1,2,3,4,5,6));

        Set<Integer> auxSet = new HashSet<>();

        // si no se ejecuta operadores terminales, el steam no es ejecutado.

        Set<Integer> result = inmutableSet.stream().peek(auxSet::add).filter(a->a % 2 ==0).collect(Collectors.toSet());

        System.out.println(auxSet);

        System.out.println(result);


    }


}
