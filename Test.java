public class Test {

    public static void main(String[] args) {

        int[] input = {0, 1, 1, 0, 0, 1, 0, 1, 1, 0};

        List<Integer> aux = new ArrayList();
        int count = 0;

        for(int val: input){
            if(val !=0){

                aux.add(val);
            }else{
                count++;
            }
        }
        int[] result = new int[args.length]
        for(int i= 0;i<count;i++){
            result[i]=0;
        }
        for(int i= count;i<args.length;i++) {
            result[i]=aux.get(count-i);
        }

        for(int val: result){
            System.out.println(val);
        }

    }

}
