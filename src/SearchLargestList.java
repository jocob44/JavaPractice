import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SearchLargestList {


    public static LinkedList<String> largestList(List<String> sings, String firstSing){

        String[] wordsFirstSing = firstSing.split(" ");
        sings.remove(firstSing);

        int current_max_length = 0;
        LinkedList<String> subList = new LinkedList<>();
        for(String sing: sings){
            if(sing.startsWith(wordsFirstSing[wordsFirstSing.length-1])){
                LinkedList<String> candidateSubList = largestList(new ArrayList<>(sings),sing);
                if(candidateSubList.size()> current_max_length){
                    current_max_length = candidateSubList.size();
                    subList = candidateSubList;
                }
            }
        }

        subList.addFirst(firstSing);

        return subList;
    }
}
