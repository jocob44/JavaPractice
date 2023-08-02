public class MatrixDiagonals {

    public static void main(String args[]) {
        Character[][] matrix = {
                {'1', 'A', '5', '7', 'B', 'N'},
                {'2', 'B', '6', '8', 'K', 'R'},
                {'5', 'Q', 'N', '3', 'B', '1'}
        };

        //Expected result: 1 A2 5B5 76Q B8N NK3 RB 1
        System.out.println(getDiagonals(matrix));
    }

    //Given an m x n matrix of characters, return a String which contains the
    //concatenation of all the matrix’s diagonals, from top to bottom, right to
    //left
    private static String getDiagonals(Character[][] matrix) {

        if(matrix == null || matrix.length == 0){
            return "";
        }

        String result = "";
        int nColumns = matrix[0].length;
        int mRows = matrix.length;
        for(int i = 0;i<nColumns;i++){
            result = result + getDiagonalOfFirstRow(matrix,i)+ " ";


        }
        for(int i = 1;i<mRows;i++){
            result = result + getDiagonalOfLastColumn(matrix,i)+ " ";

        }
        return result;
    }

    private static String getDiagonalOfLastColumn(Character[][] matrix, int row) {
        int nColumns = matrix[0].length;
        int mRows = matrix.length;
        String result = "";

        for(int auxRow = row, auxColumn = nColumns-1 ; auxRow<mRows && auxColumn>=0;auxRow++,auxColumn--){
            result = result + matrix[auxRow][auxColumn];
        }
        return result;
    }

    private static String getDiagonalOfFirstRow(Character[][] matrix, int column) {

        int mRows = matrix.length;
        String result = "";
        int auxColumn = column;
        for(int row = 0; row<mRows && auxColumn>=0;row++,auxColumn--){
            result = result + matrix[row][auxColumn];
        }
        return result;
    }
}
