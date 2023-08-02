import java.util.Arrays;

//Problem: Given an unordered array containing duplicates and negatives, I needed to count all
//      the different pairs of elements that add up to a given number.
public class CompassTest1 {

    public static int countPairThatSum(int[] array, int num) {

        int result = 0;

        //sort the array to break then
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            int temSum = num - 1;
            int j = i + 1;
            while (temSum <= num && j < array.length) {
                temSum = array[i] + array[j];
                if (temSum == num) {
                    result++;
                }
                j++;
            }
        }
        return result;
    }
}
