import java.util.LinkedList;
import java.util.Deque;
import java.util.Stack;

public class EjemploLinkedListStack {
    public static void main(String[] args) {
        //Stack<String> stack = new Stack<>();
        Deque<String> stack = new LinkedList<>();
        // Push (agregar elementos) a la pila
        stack.push("Elemento 1");
        stack.push("Elemento 2");
        stack.push("Elemento 3");

        System.out.println("Pila: " + stack);

        // Pop (obtener y eliminar) elementos de la pila
        String elemento1 = stack.pop();
        String elemento2 = stack.pop();

        System.out.println("Elemento 1: " + elemento1);
        System.out.println("Elemento 2: " + elemento2);
        System.out.println("Pila después de pop(): " + stack);

        // Obtener el elemento superior de la pila sin eliminarlo
        String elementoSuperior = stack.peek();
        System.out.println("Elemento superior: " + elementoSuperior);
        System.out.println("Pila después de peek(): " + stack);

        // Verificar si la pila está vacía
        boolean estaVacia = stack.isEmpty();
        System.out.println("¿La pila está vacía? " + estaVacia);

        // Obtener el tamaño de la pila
        int tamaño = stack.size();
        System.out.println("Tamaño de la pila: " + tamaño);
    }
}
