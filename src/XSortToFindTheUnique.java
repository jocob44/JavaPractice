public class XSortToFindTheUnique {

    public static int singleNumber(int[] nums) {
        // easily solved with XOR; when the same number is XORed, the result is 0.
        // just loop through the elements and XOR them; the non repeating number remains.

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
