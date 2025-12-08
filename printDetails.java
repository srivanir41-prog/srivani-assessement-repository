package com; 
class Printer {
    void printDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void printDetails(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {

        Printer obj = new Printer();
        obj.printDetails("Srivani", 23);
        obj.printDetails(23, "Srivani");
    }
}
