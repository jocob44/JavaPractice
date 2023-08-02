import java.util.*;

public class BSFPrinter {

    public static void BSFPrint(Node1 start){

        //Initializacion
        Queue<Node1> stack = new LinkedList<>();
        Set<Node1> seems = new HashSet<>();
        stack.add(start);
        System.out.println("Starting BSF printer");
        while(!stack.isEmpty()){
            Node1 node = stack.poll();

            //proccess
            if(!seems.contains(node)){
               seems.add(node);
               System.out.println("Reading node: "+node.name );
            }
            //Continue with child
            for(Node1 node1: node.getNeighbors()){
                if(!seems.contains(node1)) {
                    stack.offer(node1);
                }
            }

        }

    }
}
