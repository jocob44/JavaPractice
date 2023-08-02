import java.util.*;
import java.util.function.Consumer;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        assertEquals(getFirstUniqueCharacter("java"), 'j');
        assertEquals(getFirstUniqueCharacter("aviation"), 'v');
        assertEquals(getFirstUniqueCharacter("edreamsodigeo"), 'r');
        assertEquals(getFirstUniqueCharacter("pineapple"), 'i');
        assertEquals(getFirstUniqueCharacter("sausage"), 'u');
        assertEquals(getFirstUniqueCharacter("hello"), 'h');
        assertEquals(getFirstUniqueCharacter("swiss won"), 'i');
        assertEquals(getFirstUniqueCharacter(" "), ' ');
        assertEquals(getFirstUniqueCharacter("yay yay"), ' ');
        assertEquals(getFirstUniqueCharacter("qwertyuiopasdfghjklmnbvcxzlkjhgfdsapoiuytrewq"), 'm');
        assertThrowable(FirstUniqueCharacter::getFirstUniqueCharacter, null, IllegalArgumentException.class);
        assertThrowable(FirstUniqueCharacter::getFirstUniqueCharacter, "", IllegalArgumentException.class);
        assertThrowable(FirstUniqueCharacter::getFirstUniqueCharacter, "qwertyuioppoiuytrewq", IllegalArgumentException.class);
        assertThrowable(FirstUniqueCharacter::getFirstUniqueCharacter, "     ", IllegalArgumentException.class);
        System.out.println("SUCCESS!");
    }

    private static <T> void assertEquals(T actual, T expected) {
        if (!Objects.equals(actual, expected))
            throw new IllegalStateException(String.format("Expected value: <%s> but was: <%s>", expected, actual));
    }

    private static <T extends Throwable> void assertThrowable(Consumer<String> consumer, String value, Class<T> clazz) {
        try {
            consumer.accept(value);
        } catch (Throwable e) {
            if (clazz.isInstance(e)) return;
            throw new IllegalStateException(String.format("Expected exception: <%s> but was: <%s>", clazz.getSimpleName(), e.getClass().getSimpleName()));
        }
        throw new IllegalStateException(String.format("Expected exception: <%s> but no expcetion was thrown", clazz.getSimpleName()));
    }

    //This method takes a string and returns the first unique character
    public static char getFirstUniqueCharacter(String value) {

        if(value == null || value.isEmpty()) {
         throw new IllegalArgumentException();
        }

        List<String> candites = new ArrayList<>();
        Set<String> reppeted =  new HashSet<>();

        String[] letters = value.split("");

        for(String letter: letters){

            if(reppeted.contains(letter)) {
                candites.remove(letter);
            }else{
                reppeted.add(letter);
                candites.add(letter);
            }

        }

        if(candites.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return candites.get(0).charAt(0);
    }
}
