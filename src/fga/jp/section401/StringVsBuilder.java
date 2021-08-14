package fga.jp.section401;

public class StringVsBuilder {
    public static void main(String[] args) {
        //create a new StringBuilder object named str
        StringBuilder str = new StringBuilder("Test immutability");
        //create a new String object named str2
        String str2 = "Test immutability";

        //Display the identifying hashCodes for each object
        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());

        //change the values stored in each object
        str.replace(0, str.length(), "HelloWorld");
        str2="HelloWorld";

        //Display the identifying hashCodes for each object
        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());
    }//end method main
}//end class StringVsBuilder
