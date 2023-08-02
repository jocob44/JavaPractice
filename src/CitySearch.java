import java.util.Arrays;
import java.util.List;

public class CitySearch {

    public static void main(String[] args) {


        List<String> cities = Arrays.asList("Las Palmas", "Pamplona", "Palencia", "Palma de Mallorca", "Ponferrada", "Calella de Palafrugell");

        String toFind = "palma";
        printMache(cities,toFind);
    }

    public static void printMache(List<String> cities, String toFind) {


        for (int i = 0; i < toFind.length(); i++) {

            innerPrintMache(cities,toFind.substring(0,i+1));
        }
    }

    public static void innerPrintMache(List<String> cities, String toFind) {

        String result = toFind + ":";

        for (String word : cities) {
            if (word.toLowerCase().contains(toFind.toLowerCase())) {
                result = result + " " + word + ",";
            }
        }

        System.out.println(result);

    }

    /*Output:

    p: Las Palmas, Pamplona, Palencia, Palma de Mallorca, Ponferrada, Calella de Palafrugell

    pa: Las Palmas, Pamplona, Palencia, Palma de Mallorca, Calella de Palafrugell

    pal: Las Palmas, Palencia, Palma de Mallorca, Calella de Palafrugell

    palm: Las Palmas, Palma de Mallorca

    palma: Las Palmas, Palma de Mallorca*/



}



