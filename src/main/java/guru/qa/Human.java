package guru.qa;

import java.util.List;

public class Human {

    private static final String staticName = "Human";
    private final String name;
    private final int age;
    private final boolean isCute;

    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }


    static void sayHello() {
        System.out.println("Hello, " + staticName + "!!!!!");
    }

    void sayHelloNonStatic() {
        System.out.println("Hello, " + this.name + "!!!!!");
    }

    public Human incrementAge() {
        return new Human(
                this.name,
                (this.age + 1),
                this.isCute
        );
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public boolean isCute() {
        return isCute;
    }

    void printSomeValues(int i, String str, List<String> list) {
        i = 100;
        list.add("selenide");
        System.out.println("int: " + i +
                ", string: "
                + str.toUpperCase() +
                ", list: " +
                list);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }
}
