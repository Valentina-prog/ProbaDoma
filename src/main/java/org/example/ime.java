package org.example;

 public class ime {

     public static String insertString(
             String originalString,
             String stringToBeInserted,
             int index)
     {
         String newString = originalString.substring(0, index + 1)
                 + stringToBeInserted + originalString.substring(index +1);

         return newString;
     }





}
