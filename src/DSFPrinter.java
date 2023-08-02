import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DSFPrinter {

    public static void DSFPrint(Node1 start){

        //Initializacion
        Stack<Node1> stack = new Stack<>();
        Set<Node1> seems = new HashSet<>();
        stack.push(start);

        System.out.println("Starting DSF printer");
        while(!stack.isEmpty()){
            Node1 node = stack.pop();

            //proccess
            if(!seems.contains(node)){
               seems.add(node);
               System.out.println("Reading node: "+node.name );
            }
            //Continue with child
            for(Node1 node1: node.getNeighbors()){
                if(!seems.contains(node1)) {
                    stack.push(node1);
                }
            }

        }

    }
}
