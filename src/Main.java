import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //int array[][] = { {1},{3},{5}};

        int array[][] = { {1,3,5,7},{10,11,16,20},{23,30,34,50}};

        //int array[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       //int array[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        //System.out.println("result:"+sol.searchMatrix(array,10));

        /*
        SortColors sortColors = new SortColors();
        int a[] = {1,0};

        System.out.println("result: sort Color");
        sortColors.sortColors(a);

        MinWindow minWindow = new MinWindow();
        System.out.println("result:"+minWindow.minWindow("ADOBECODEBANC", "ABC"));



        DSFPrinter.DSFPrint(Graph.getGraph());
        BSFPrinter.BSFPrint(Graph.getGraph());



        int array[] = {1,3,3,7,5,5,7};
        System.out.println("result:"+XSortToFindTheUnique.singleNumber(array));

        Node node = new Node(1);

        Node node2 = new Node(2);

        node.next = node2;
        node.random = node;

        node2.random= node;

        Node result = CopyLinkedList.copyRandomList(node);



        //List<String> words = List.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");

        List<String> words = List.of("leet","code");

        System.out.println("Result" +CheckWordRecursiveV2LettCode.wordBreak("leetcode", words));
        //https://leetcode.com/problems/word-break/editorial/


        char [][] islas = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};

        System.out.println("Islams Result: " +contandoIslas.numIslands(islas));



        int[] numbers = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};

        System.out.println("SubArray check Result: " +SubArrayCheck.numSubarrayProductLessThanK(numbers,19));


        String valuesInArray[]={"LA macarena joya","joya es tu dia","que hermoso dia","dia pasa aca","aca es bueno", "dia sin nada"};

        List sings = new ArrayList(Arrays.asList(valuesInArray));
        List<String> result = SearchLargestList.largestList(sings,"joya es tu dia");
        System.out.println("The largest list is: " );

        for(String row: result){
            System.out.println(row);

        }
        */
        int[] numbers = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        int result = CompassTest1.countPairThatSum(numbers,13);
        System.out.println("The Result : "+result );

        int result2 = CompassTest1V2.countPairThatSum(numbers,13);
        System.out.println("The Result : "+result2 );

    }
}