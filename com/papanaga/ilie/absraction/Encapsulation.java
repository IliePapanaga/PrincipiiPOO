package com.papanaga.ilie.absraction;

public class Encapsulation {
    private class Human {
        private String name;
        private short age;
        private String etnity;

        public Human(String name, short age, String etnity) {
            this.name = name;
            this.age = age;
            this.etnity = etnity;
        }

        public String getName() {
            return name;
        }

        public short getAge() {
            return age;
        }

        public String getEtnity() {
            return etnity;
        }
    }

    public void Ilie() {
        Human ilie = new Human("Ilie", (short)14, "undefined");
        System.out.println("Name - " + ilie.getName() + "\nAge - " + ilie.getAge() + "\nEtnity - " + ilie.getEtnity());
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.Ilie();
    }
}
