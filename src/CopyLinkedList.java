import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class CopyLinkedList {
    public static Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        //
        Map<Node, Integer> originalPositions = new HashMap();
        Map<Integer, Node> indexNewNodes = new HashMap();

        Stack<Node> stack = new Stack<>();

        int currentPosition = 0;
        originalPositions.put(head, currentPosition);
        Node auxNode = head;
        stack.push(auxNode);

        //Know the position of each  Node
        while (auxNode.next != null) {
            currentPosition++;
            auxNode = auxNode.next;
            originalPositions.put(auxNode, currentPosition);
            stack.push(auxNode);
        }

        //the last node of linked list
        Node prevNode = new Node(stack.pop().val);
        indexNewNodes.put(currentPosition, prevNode);
        currentPosition--;

        //Assigning next in reverse order
        while (!stack.isEmpty()) {
            auxNode = stack.pop();
            Node newNode = new Node(auxNode.val);
            newNode.next = prevNode;
            prevNode = newNode;
            indexNewNodes.put(currentPosition, prevNode);
            currentPosition--;
        }

        Node newHead = prevNode;
        //Assigning Random using maps as auxiliary structure
        Node newAuxNode = newHead;
        auxNode = head;


        //Know the position of each  Node
        while (auxNode != null) {
            auxNode = auxNode.next;
            int originalRandomPosition = originalPositions.get(auxNode.random);
            newAuxNode.random = indexNewNodes.get(originalRandomPosition);
            newAuxNode = newAuxNode.next;

        }

       return newHead;

    }
}