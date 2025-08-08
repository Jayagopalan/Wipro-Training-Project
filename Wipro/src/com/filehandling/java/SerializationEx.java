package com.filehandling.java;

import java.io.*;


class Student implements Serializable {
 int id;
 String name;
 String password;

 public Student(int id, String name, String password) {
     this.id = id;
     this.name = name;
     this.password = password;
 }
}

public class SerializationEx {
 public static void main(String[] args) {
     Student s1 = new Student(101, "Alex", "Pass123");

     
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
         out.writeObject(s1);
         System.out.println("Object has been serialized");
     } catch (IOException e) {
         e.printStackTrace();
     }

     
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
         Student s2 = (Student) in.readObject();
         System.out.println("Object has been deserialized");
         System.out.println("ID: " + s2.id);
         System.out.println("Name: " + s2.name);
         System.out.println("Password: " + s2.password);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
