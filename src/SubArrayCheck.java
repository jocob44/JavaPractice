import java.util.Arrays;

class SubArrayCheck {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int result = 0;

        Arrays.binarySearch(nums,k);

        for(int i = 1; i <= nums.length; i++){

            // checking with windows of size i
            long current = 1;
            for(int j = 0; j<i; j++){

                current *= nums[j];



            }
            if(current<k) {
                result++;
                System.out.println("Adding before loop with: i "+ i + "current"+  current );
            }
            for(int z = i; z<nums.length; z++){

                current = current / nums[z-i];
                current = current * nums[z];
                if(current<k) {
                    result++;
                    System.out.println("Adding in loop with: i "+ i +"z "+z );
                }
            }

        }
        return result;
    }
}
