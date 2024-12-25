package org.example;

public class Person {
    // Add the fields
    private String name;
    private int age;
    private String address;

    // Add the constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Add the getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Add the toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    // Add the equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && address.equals(person.address);
    }

    // Add the hashCode method
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + address.hashCode();
        return result;
    }

    // Add the main method
    public static void main(String[] args) {
        // Create a new object of the class
        Person person = new Person("John", 30, "123 Main St");

        // Call the method
        System.out.println(person);

        // Create a new object of the class
        Person person2 = new Person("Jane", 25, "456 Elm St");

        // Create a mouse pointer change listener
        System.out.println(person2);
    }

    // Add the mouse pointer change listener
    public void mousePointerChangeListener() {
        // Add your code here
    }

    // Add the method
    public void method() {
        // Add your code here
    }

    // Add the method
    public void method2() {
        // Add your code here
    }
}
