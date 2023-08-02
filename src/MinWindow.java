import java.util.HashMap;
import java.util.Map;

public class MinWindow {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map=new HashMap();
        for(int i=0;i<t.length();i++){
            Character c=t.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int indexToTest=0;
        int matched=map.size();
        int minSize=Integer.MAX_VALUE;
        int startIndex=0;
        for(int goblalIteration=0;goblalIteration<s.length();goblalIteration++){
            Character rChar=s.charAt(goblalIteration);

            if(map.containsKey(rChar)){
                map.put(rChar, map.get(rChar)-1);
                //incluyendo esta letra se cumple condición
                if(map.get(rChar)==0) matched--;
            }
            //revisando cuales de las primeras letras iniciales sobra
            while(indexToTest<=goblalIteration && matched==0){
                if(minSize>goblalIteration-indexToTest+1){
                    minSize=goblalIteration-indexToTest+1;
                    startIndex=indexToTest;
                }
                Character lChar=s.charAt(indexToTest);
                if(map.containsKey(lChar)){
                    map.put(lChar, map.get(lChar)+1);
                    if(map.get(lChar)>0) matched++;
                }
                indexToTest++;
            }
        }
        return minSize==Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex+minSize);
    }
}