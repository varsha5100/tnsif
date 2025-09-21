package com.tnsif.sixth;

public class StringOperations {

    public static void main(String[] args) {

       
        System.out.println("--- String Operations ---");
        String str = "Hello";
        System.out.println("Original String: " + str);

        str = str + " World";
        System.out.println("Concatenated String: " + str);

        
        System.out.println("Substring (index 6 to end): " + str.substring(6));

        System.out.println("\n--- StringBuffer Operations ---");
        StringBuffer sBuffer = new StringBuffer("Java");
        System.out.println("Original StringBuffer: " + sBuffer);

       
        sBuffer.append(" Programming");
        System.out.println("Appended StringBuffer: " + sBuffer);

      
        sBuffer.insert(5, "Great ");
        System.out.println("Inserted StringBuffer: " + sBuffer);

    
        sBuffer.replace(0, 4, "Advanced");
        System.out.println("Replaced StringBuffer: " + sBuffer);

   
        sBuffer.delete(8, 14); // Deletes "Great "
        System.out.println("Deleted StringBuffer: " + sBuffer);

      
        sBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + sBuffer);

  
        System.out.println("\n--- StringBuilder Operations ---");
        StringBuilder sBuilder = new StringBuilder("Performance");
        System.out.println("Original StringBuilder: " + sBuilder);

       
        sBuilder.append(" Test");
        System.out.println("Appended StringBuilder: " + sBuilder);

        sBuilder.insert(0, "High ");
        System.out.println("Inserted StringBuilder: " + sBuilder);

        sBuilder.deleteCharAt(4); 
        System.out.println("Deleted char in StringBuilder: " + sBuilder);
    }
}