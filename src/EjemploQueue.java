import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EjemploQueue {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.offer("Elemento 1");
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");

        System.out.println("Cola: " + cola);

        // Obtener y eliminar el primer elemento de la cola
        String primerElemento = cola.poll();
        System.out.println("Primer elemento: " + primerElemento);
        System.out.println("Cola después de poll(): " + cola);

        // Obtener el primer elemento de la cola sin eliminarlo
        String primerElementoSinEliminar = cola.peek();
        System.out.println("Primer elemento sin eliminar: " + primerElementoSinEliminar);
        System.out.println("Cola después de peek(): " + cola);

        // Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿La cola está vacía? " + estaVacia);

        // Obtener el tamaño de la cola
        int tamaño = cola.size();
        System.out.println("Tamaño de la cola: " + tamaño);
    }
}
