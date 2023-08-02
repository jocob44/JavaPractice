public class SortColors {
    public void sortColors(int[] nums) {

        int n = nums.length;
        boolean sorted = false;
        int i = 1;
        while(!sorted && i<n ){
            sorted = true;
            for(int j= 0; j<n-i; j++){

                if(nums[j]>nums[j+1]){
                    sorted = false;
                    int aux = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = aux;
                }
            }
            i++;
        }

        for(int a: nums){
            System.out.println("value: "+a);
        }

    }
}