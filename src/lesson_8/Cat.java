package lesson_8;
public class Cat {
    public String name;
    public String color;
    public int age;
    public void meow() {
        System.out.println(name + " мяукнул");
    }
    public void info() {
        System.out.println("Кота зовут " + name + " его возраст: " + age);
    }
}