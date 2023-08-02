import java.util.*;

public class OrdenarHashMap {
    /**
     * Se debe recibir un arreglo con identificadores de producto por un lado y como segundo parametro un arreglo de arreglo de long que representan las vendtas
     * de cirtos productos, se debe returnar 3 codigos de productos con las mejores ventas en un arreglo de String, el promedio de ventas de cada producto es unico.
     */

    public static void main(String[] args) {

        String[] codes = {"1","2","3","4"};

        float[][] sales = {
                {1f,1f,1f},
                {2f,2f,2f},
                {3f,3f,3f},
                {4f,4f,4f}
        };
        String[] result = procesarProductos(codes,sales);
        System.out.println("Result IS");
        for(String val: result){
            System.out.println(val);
        }
        return;
    }

    public static String[] procesarProductos(String[] codes, float[][] sales){

        String[] result = new String[3];

        Map<Float,String> map = new TreeMap<>(Comparator.reverseOrder());
        int index = 0;
        for(float[] values:sales) {

             map.put(getTotal(values),codes[index]);
             index ++;
        }
        Collection<String> c = map.values(); //obtain an Iterator for Collection Iterator itr = c.iterator();

        Iterator<String> it = c.iterator();

        for(int i=0; i<3 && it.hasNext();i++){
            result[i] = it.next();
        }
        return result;
        // alternativa Use iterator to display the keys and associated values
        // System.out.println("Map Values Before: ");
        // Set keys = map.keySet();
        // for (Iterator i = keys.iterator(); i.hasNext();){
        //      Integer key = (Integer) i.next();
        //      String value = (String) map.get(key);
        //      System.out.println(key + " = " + value);
        //      }

       // Fuente: https://www.iteramos.com/pregunta/34652/como-iterar-sobre-un-treemap

    }

    private static float getTotal(float[] sales){

        float aux = 0l;

       for(float val: sales){
           aux += val;
       }
        return aux;
    }
}
