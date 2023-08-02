import java.util.List;

public class CheckWordRecursiveV3 {

    public static boolean wordBreak(String s, List<String> wordDict) {

        int maxLeng = 0;

        Trie dictionary = new Trie();
        
        for( String word: wordDict){
           dictionary.insert(word);
            if(word.length()>maxLeng){
                maxLeng = word.length();
            }
        }

       return wordBreak(s, dictionary, maxLeng);
    }

    public static boolean wordBreak(String s, Trie wordDict, int maxLeng) {


        System.out.println("Procesing work: "+s);
        for( int i = 0; i<=maxLeng && i<=s.length(); i++){

            if(wordDict.search(s.substring(0,i))){
                String newString = s.substring(i,s.length());
                if(newString.isEmpty()){
                    return true;
                }
                if(wordBreak(newString, wordDict,maxLeng)) return true;
            }
        }
        return false;
    }
}
