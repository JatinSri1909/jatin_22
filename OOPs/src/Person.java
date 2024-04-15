/*Write a Java program to create a class called "Person" with a name and age attribute.
 *Create two instances of the "Person" class, set their attributes using the constructor,
 * and print their name and age. */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jatin", 19);
        Person person2 = new Person("Mahesh", 21);

        System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.getAge());
        System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
    }
}
