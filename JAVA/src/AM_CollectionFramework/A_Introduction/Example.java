package AM_CollectionFramework.A_Introduction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);


        // using Iterable
        System.out.println("Iterating using Iterable");
        Iterator<Integer> valuesIterator = values.iterator();
        while(valuesIterator.hasNext()){
            int value = valuesIterator.next();
            System.out.println(value);
            if(value == 3){
                valuesIterator.remove();
            }
        }

        // using for each loop
        System.out.println("Iterating using For each loop");
        for(int value : values){
            System.out.println(value);
        }

        // using for each method
        System.out.println("Iterating using for each method");
        values.forEach((Integer value) -> System.out.println(value));
    }
}
