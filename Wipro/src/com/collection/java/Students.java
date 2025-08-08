package com.collection.java;

import java.util.Objects;

class Students {
    String name;
    int id;

    // Constructor
    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overriding equals() to check logical equality
    @Override
    public boolean equals(Object obj) {
        // Step 1: Check if both references point to the same object
        if (this == obj) return true;

        // Step 2: Check if obj is actually a Students object
        if (!(obj instanceof Students)) return false;

        // Step 3: Typecast obj to Students
        Students s = (Students) obj;

        // Step 4: Compare actual data
        return this.id == s.id && this.name.equals(s.name);
    }

    // Overriding hashCode() so equal objects give the same hash
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    // To display student info nicely
    @Override
    public String toString() {
        return name + " (" + id + ")";
    }

    // Main method to test
    public static void main(String[] args) {
        Students s1 = new Students("John", 101);
        Students s2 = new Students("John", 101);
        Students s3 = new Students("Mike", 102);

        // Testing equals()
        System.out.println("s1.equals(s2) → " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3) → " + s1.equals(s3)); // false

        // Testing hashCode()
        System.out.println("s1.hashCode() → " + s1.hashCode());
        System.out.println("s2.hashCode() → " + s2.hashCode());
        System.out.println("s3.hashCode() → " + s3.hashCode());
    }
}
