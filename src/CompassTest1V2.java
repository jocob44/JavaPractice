import java.util.Arrays;
import java.util.HashMap;

//Problem: Given an unordered array containing duplicates and negatives, I needed to count all
//      the different pairs of elements that add up to a given number.
public class CompassTest1V2 {

    /* Java implementation of simple method to find count of
pairs with given sum*/



// This code is contributed by Gaurav Miglani

    public static int countPairThatSum(int[] arr, int sum) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < arr.length; i++) {

            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;
    }
}
