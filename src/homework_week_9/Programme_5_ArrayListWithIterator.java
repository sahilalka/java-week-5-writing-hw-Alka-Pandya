package homework_week_9;

import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {

    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("WATERMELON");
        fruitList.add("STRAWBERRY");
        fruitList.add("BLUEBERRY");
        fruitList.add("CRANBERRY");
        fruitList.add("GRAPEFRUIT");
        fruitList.add("CHERRY");
        fruitList.add("TOMATO");
        fruitList.add("PINAAPLE");
        fruitList.add("GRAPE");

        ListIterator<String>iterator = fruitList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() +  "  , ");
        }
    }


}
