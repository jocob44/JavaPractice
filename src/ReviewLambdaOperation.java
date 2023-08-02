import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ReviewLambdaOperation {

    public static class Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        public String toString() {
            return name + " (" + age + ") - " + city;
        }
    }


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "New York"));
        people.add(new Person("Bob", 30, "London"));
        people.add(new Person("Charlie", 20, "Paris"));
        people.add(new Person("David", 40, "Tokyo"));
        people.add(new Person("Emma", 35, "New York"));


        List<Person> newYorkPeople = people.stream()
                .filter(person -> person.getCity().equals("New York"))
                .collect(Collectors.toList());

        newYorkPeople.forEach(System.out::println);

        // Output: [Alice (25) - New York, Emma (35) - New York]

        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        AtomicInteger a = new AtomicInteger();
        names.forEach(l -> a.addAndGet(l.length()));

        // Output: [Alice, Bob, Charlie, David, Emma]

        List<Person> firstTwoPeople = people.stream()
                .limit(2)
                .collect(Collectors.toList());

        // Output: [Alice (25) - New York, Bob (30) - London]

        List<Person> skipFirstTwo = people.stream()
                .skip(2)
                .collect(Collectors.toList());

        // Output: [Charlie (20) - Paris, David (40) - Tokyo, Emma (35) - New York]

        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        // Output: [Charlie (20) - Paris, Alice (25) - New York, Bob (30) - London, Emma (35) - New York, David (40) - Tokyo]

        int totalAges = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);

        // Output: 150 -- forma más correctar de acumular para no lidear con problemas de concurrencia

    }


}
