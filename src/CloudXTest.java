import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class CloudXTest {
    public static void main(String[] args) {
        int[] case1 = new int[]{1, 31, 5, 5, 5, 27, 12, 26, 31, 12, 26, 3};
        assertEquals(getUniqueSum(case1), 31);

        int[] case2= new int[]{2,5,5,25,25,1,2,8,31,8};
        assertEquals(getUniqueSum(case2), 32);
        System.out.println("SUCCESS!!");
    }

    private static <T> void assertEquals(T actual, T expected) {
        if (!Objects.equals(actual, expected))
            throw new IllegalStateException(String.format("Expected value: <%s> but was: <%s>", expected, actual));
    }

    // Given an array of numbers, return the sum of the numbers that appear only once.
    private static Integer getUniqueSum(int[] array) {
        // CODE GOES HERE
        Map<Integer,Integer> auxMap = new HashMap<>();

        Set<Integer> uniqueNumbers = new HashSet<>();

        for(Integer num:array){
            if(auxMap.containsKey(num)){
                uniqueNumbers.remove(num);
            }else{
                auxMap.put(num,1);
                uniqueNumbers.add(num);
            }
        }
        AtomicReference<Integer> result = new AtomicReference<>(0);
        uniqueNumbers.stream().forEach(a -> result.updateAndGet(v -> v + a));
        return result.get();
    }
}
