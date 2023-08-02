import java.util.*;

public class RetrieveWordOfNumber {

    static Map<String, List<String>> mapping;

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();


        letterCombinationsInner(digits,result,"");

        if(result.size() == 1){
            result.clear();
        }

        return result;


    }

    private static void letterCombinationsInner(String digits,List<String> result, String currentWord) {

      if(digits.isEmpty()){
          result.add(currentWord);
      }else{

          for(String letter: getMapping().get(digits.substring(0,1))){
              String lastDigits = digits.substring(1);
              letterCombinationsInner(lastDigits,result,currentWord+letter);
          }
      }

    }
    private static Map<String, List<String>> getMapping() {

        mapping = new HashMap<>();

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        mapping.put("2", list);
        list = new ArrayList();
        list.add("d");
        list.add("e");
        list.add("f");
        mapping.put("3", list);
        list = new ArrayList();
        list.add("g");
        list.add("h");
        list.add("i");
        mapping.put("4", list);
        list = new ArrayList();
        list.add("j");
        list.add("k");
        list.add("l");
        mapping.put("5", list);
        list = new ArrayList();
        list.add("m");
        list.add("n");
        list.add("o");
        mapping.put("6", list);
        list = new ArrayList();
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        mapping.put("7", list);
        list = new ArrayList();
        list.add("t");
        list.add("u");
        list.add("v");
        mapping.put("8", list);
        list = new ArrayList();
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        mapping.put("9", list);


        return mapping;
    }
}
