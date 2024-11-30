package org.example;

public class Task1 {
    public static void main(String[] args) {
    Student student = new Student("Ramil" , 18 , "AZ0101") ;
    student.displayInfo();


}}
class Person{
    String name;
    int age;
    Person(String name , int age ){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name : "+ name + " Age : " + age);
    }
}
class Student extends Person {
    String studentId;
    Student(String name, int age , String studentId) {
        super(name, age);
        this.studentId=studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student id :" + studentId);
    }
}