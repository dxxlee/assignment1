package Assignment;
//если записать по отдельности методы и вместе классы
public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person1 human = new Person1("Daniel", 17);
        human.printDetails();
        Person1 human2 = new Person1("Kyle", 19);
        human2.printDetails();
    }
}
