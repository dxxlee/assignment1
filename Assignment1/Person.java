package Assignment1;

public class Person {
    public String name;
    public int age;
    void setValues(String name, int age){
        this.name = name;
        this.age = age;
    }

    void getValues(){
        System.out.println("Name: " + name + " " + "\n" + "Age: " + age);
    }
}

