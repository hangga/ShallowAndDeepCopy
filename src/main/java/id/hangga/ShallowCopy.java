package id.hangga;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        String[] friends = {"Alice", "Bob", "Charlie"};
        Person originalPerson = new Person("David", friends);

        Person copiedPerson = new Person(originalPerson.getName(), originalPerson.getFriends());
        copiedPerson.getFriends()[0] = "Eve";

        System.out.println("Original Person's Friends: " + Arrays.toString(originalPerson.getFriends()));
        System.out.println("Copied Person's Friends: " + Arrays.toString(copiedPerson.getFriends()));
    }
}
