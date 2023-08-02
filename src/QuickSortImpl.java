import java.util.Arrays;

public class QuickSortImpl {


    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Array original: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int principio, int fin) {
        if (principio < fin) {
            int pivotIndex = partition(array, principio, fin);

            quickSort(array, principio, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, fin);
        }
    }

    /*
        Genera la particion, luego de acomodar al pivote que originalmente estaba al final de arreglo
     */
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int indexMenorActual = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                indexMenorActual++;
                swap(array, indexMenorActual, j);
            }
        }

        swap(array, indexMenorActual + 1, high);

        return indexMenorActual + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
