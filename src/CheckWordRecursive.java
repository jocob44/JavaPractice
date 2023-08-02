import java.util.List;

public class CheckWordRecursive {

     public static boolean wordBreak(String s, List<String> wordDict) {


        System.out.println("Processing work: "+s);
        for( String word: wordDict){
            if(s.startsWith(word)){
                String newString = s.substring(word.length(),s.length());
                if(newString.isEmpty()){
                    return true;
                }
                if(wordBreak(newString, wordDict)) return true;
            }
        }
        return false;
    }
}
