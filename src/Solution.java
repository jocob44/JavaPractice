public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] start = new int[2];
        int[] end = new int[2];
        int[] mid = new int[2];
        start[0]= 0; start[1]=0;
        end[0] = rows-1;
        end[1] = cols -1;
        mid[0] = rows-1;
        mid[1] = cols -1;

        if(rows*cols <4){
            return linealSearch(start,matrix,cols,rows, target);
        }
        while(!isAfterOrEqual(start,end)){

            //calculate mid

            int midVal = calculateMid(start,end,mid,cols,rows);

            if(midVal <= 1){
                return linealSearch(start,matrix,cols,rows, target);
            }

            //check is Found or recalculate indexes;
            if(matrix[mid[0]][mid[1]] == target){
                return true;
            } else if (matrix[mid[0]][mid[1]] > target){
                // end is mid -1
                setPrev(mid,end,cols,rows);

            } else{
                // first is mid + 1
                setNext(mid,start,cols,rows);

            }

        }


        return (matrix[start[0]][start[1]] == target);

    }

    private boolean linealSearch(int[] start, int[][] matrix, int n, int m, int target) {


        for(int i= 0; i<3; i++){
            if(start[0]<m && start[1]<n) {
                if (matrix[start[0]][start[1]] == target) {
                    return true;
                }
                setNext(start, start, n, m);
            }
        }
        return false;
    }

    private boolean isAfterOrEqual(int[] a, int[] b){

        if(a[0] >b[0] || (a[0] == b[0] && a[1] > b[1] ) || (a[0] == b[0] && a[1] == b[1] )) return true;

        return false;
    }

    private int calculateMid(int[] start, int[] end, int[] mid, int cols, int rows){
        int midVal;
        if(start[0] == end[0] && start[1] == end[1] ){
            mid[0] = start[0];
            mid[1] = start[1];

            return 1;

        }else {
            midVal = (start[0] * cols + start[1] + end[0] * cols + end[1]) / 2;
            System.out.println("Calculate Mid: " + midVal);
            mid[0] = midVal / cols;
            if (mid[0] > rows - 1) {
                mid[0] = rows - 1;
            }
            System.out.println("Calculate xMid: " + mid[0]);
            mid[1] = midVal % cols;
            if (mid[1] > cols - 1) {
                mid[1] = cols - 1;
            }
            System.out.println("Calculate yMid: " + mid[1]);
        }

        return midVal;
    }
    private void setPrev(int[] point, int[]  result,  int n, int m){

        if(point[1]>0){
            result[0] = point[0]; result[1] = point[1]-1;
        }else {
            result[0] = point[0]-1; result[1] = n-1;
        }

    }
    private void setNext(int[] point, int[]  result,  int n, int m){

        if(point[1]<n-1){
            result[0] = point[0]; result[1] = point[1]+1;
        }else {
            result[0] = point[0]+1; result[1] = 0;
        }

    }

}