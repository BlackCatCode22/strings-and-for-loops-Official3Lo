import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("+-------------------+\n"
                            +"|    SIT Program    |\n"
                            +"+-------------------+\n");

        //Data variable
        String phrase = "Sit Academy";
        String phrase2= "University";

        //String modifier (Can implement stringbuilder too.)
        System.out.println("String Modifier:"
                            +"\n=================");
        System.out.println(phrase.indexOf("A"));
        System.out.println(phrase.substring(0,phrase.indexOf(" ")));
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.trim());
        System.out.println(phrase.concat(phrase2));
        System.out.println(phrase.length());
        System.out.println(phrase.contains("Sit"));
        System.out.println(phrase.contains("dog"));
        System.out.println(phrase.charAt(4));
        System.out.println("\n");

        //while-loop control
        int myLoopControlVariable = 0;

        System.out.println("\nControl Variable List:"
                            +"\n=======================");
        while(myLoopControlVariable <=12){
            System.out.println("My control variable is: "+myLoopControlVariable);
            myLoopControlVariable++;
        }

        //For-loop + Array implementation
        System.out.println("\n");

        String[] myStrArray = {"This","that", "the other", "the hunter","the word"};
        int[] myIntegerArray={22,33,12,15,7,1};

        for(int i=0;i<5;i++){
            System.out.println("myStringArray["+i+"] = "+myStrArray[i]);
            System.out.println("myIntArray["+i+"] = "+myIntegerArray[i]);
        }
    }
}


        /*String [] friends = {"Jim", "Jackie", "NoL"};
        for(int i = 1; i <=friends.length; i++){
        System.out.println(friends[i]);
        friends[2];
         */
