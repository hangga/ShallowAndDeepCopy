package id.hangga;

public class Person {
    private String name;
    private String[] friends;

    public Person(String name, String[] friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public String[] getFriends() {
        return friends;
    }
}
