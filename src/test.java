import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {

     public static void main(String[] args) {


         List<Integer> input1 = new ArrayList<Integer>();
         input1.add(10);
         input1.add(3);
         input1.add(8);
         input1.add(1);
         input1.add(7);

        Integer result1 = input1.stream().sorted(Comparator.reverseOrder()).limit(2).min(Comparator.naturalOrder()).get();


        int[] input = {0, 1, 1, 0, 0, 1, 0, 1, 1, 0};

        List<Integer> aux = new ArrayList<>();
        int count = 0;

        for(int val: input){
            if(val !=0){

                aux.add(val);
            }else{
                count++;
            }
        }
        int[] result = new int[input.length];
        for(int i= 0;i<count;i++){
            result[i]=0;
        }
        for(int i=count;i<input.length;i++) {
            result[i]=aux.get(i-count);
        }

        for(int val: result){
            System.out.println(val);
        }
    }
}
