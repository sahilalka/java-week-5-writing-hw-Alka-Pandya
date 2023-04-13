package homework_week_9;


import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop.
 */
public class ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("RED");
        colourList.add("BLUE");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");

        for (String s  :  colourList){
            System.out.println(colourList  +  " , ");




        }

    }
}