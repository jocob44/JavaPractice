import java.io.*;

public class BuKMxTestStandarInput
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input);


        String[] words = input.split(" ");

        StringBuffer buffer = new StringBuffer();

        for(String str: words){
            String aux = str.toUpperCase();

            if(aux.length()>1){
                String aux2 = aux.substring(1).toUpperCase();

                String aux3 = aux.substring(0,1).toLowerCase();
                aux = aux3 +aux2;
            }else {
                aux =aux.toLowerCase();
            }

            buffer.append(aux);
            buffer.append(" ");

        }

        System.out.println(buffer.toString());
    }
}
