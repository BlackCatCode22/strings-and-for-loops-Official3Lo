public class StringsAndForLoops {
    public static void main(String[] args){
        String phrase = "Sit Academy"; // 0 is S " " is 3 y is 10 - sequence?
        String phrase2 = "Stringo";
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

        int myLoopControlVariable = 0;

        while (myLoopControlVariable <=12){
            System.out.println("My control variable is: " + myLoopControlVariable);
            myLoopControlVariable++;
        }

        String[] myStrArray = {"this", "that", "the other"};
        int[] myIntegerArray = {22,33,12,15,7,1};

        for (int i = 1; i <=2; i++){
            System.out.println("myStringArray[" + i + "] = " + myStrArray[i]);
            System.out.println("myIntArray[" + i + "] = " + myIntegerArray[i]);
        }
    }
}
        /*String [] friends = {"Jim", "Jackie", "NoL"};
        for(int i = 1; i <=friends.length; i++){
        System.out.println(friends[i]);
        friends[2];
         */