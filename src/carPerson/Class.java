package carPerson;

import carPerson.Car;

public class Class {

public static void main(String[] args) {
        Car c1 = new Car("Audi", 2020);
        Car c2 = new Car("BMW", 2003);
        Person person = new Person("Shankar");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(person.getName());
        }
        }