package com.sampleprograms.java;

public class sampleString {
	public static void main(String[] args) {
		String str = "  Hello Java  ";
        String another = "hello java";
        
        System.out.println("Length: " + str.length());
        System.out.println("Char at 2: " + str.charAt(2));
        System.out.println("substring from 6: " + str.substring(6));
        System.out.println("substring 2 to 7: " + str.substring(2, 7));
        System.out.println("concat: " + str.concat(" World"));
        
        System.out.println("Equals: " + str.equals(another));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(another));
        System.out.println("Compare To: " + str.compareTo(another));
        System.out.println("Compare To Ignore Case: " + str.compareToIgnoreCase(another));
        
        System.out.println("To Lower Case: " + str.toLowerCase());
        System.out.println("To Upper Case: " + str.toUpperCase());
        
        System.out.println("index of 'J': " + str.indexOf('J'));
        System.out.println("index of \"Java\": " + str.indexOf("Java"));
        System.out.println("last Index of \"a\": " + str.lastIndexOf("a"));
        System.out.println("Contains \"Java\": " + str.contains("Java"));
        System.out.println("Starts with \"  He\": " + str.startsWith("  He"));
        System.out.println("Ends with \"Java  \": " + str.endsWith("Java  "));
        
        
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Replace 'a' with 'x': " + str.replace('a', 'x'));
        System.out.println("Replace \"Java\" with \"World\": " + str.replace("Java", "World"));
        System.out.println("ReplaceAll \"\\s\" with \"-\": " + str.replaceAll("\\s", "-"));
        System.out.println("ReplaceFirst \"\\s\" with \"*\": " + str.replaceFirst("\\s", "*"));
        
        char[] charArray = str.toCharArray();
        System.out.print("Characters in 'str': ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("String.valueOf(123): " + numberStr);
	}
}
