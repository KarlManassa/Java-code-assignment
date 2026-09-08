package Session8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        /*
         * Set
         * HashSet - LinkedHashSet - TreeSet
         */
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Orange");
        // fruits.add(100);
        fruits.remove("Pineapple");

        System.out.println("Set size: " + fruits.size());
        System.out.println("Set elements: " + fruits);

        //  var i = fruits.iterator();
        //  while (i.hasNext()) {
        //      System.out.println(i.next());
        //  }

        //  for (String fruit : fruits) {
        //  System.out.println(fruit);
        //  }

        //  fruits.forEach(System.out::println);
    }

    public static void listDemo() {
        /*
         * List
         * ArrayList - LinkedList - Vector - Stack
         */
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Orange");

        //  fruits.remove("Pineapple");
        //  fruits.clear();

        System.out.println(fruits.size());
        System.out.println(fruits);

        //  var i = fruits.iterator();
        //  while (i.hasNext()) {
        //      System.out.println(i.next());
        //  }

        //  for (String fruit : fruits) {
        //  System.out.println(fruit);
        //  }

        //  fruits.forEach(System.out::println);
    }

    public static void queueDemo() {
        /*
         * Queue
         * LinkedList - PriorityQueue
         */
        Queue fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        System.out.println(fruits.remove());
        System.out.println(fruits.remove());
        System.out.println(fruits.size());
        System.out.println(fruits);

        //  var i = fruits.iterator();
        //  while (i.hasNext()) {
        //      System.out.println(i.next());
        //  }

        //  for (String fruit : fruits) {
        //  System.out.println(fruit);
        //  }

        //  fruits.forEach(System.out::println);
    }

    public static void mapDemo() {
        /*
         * Map
         * HashMap - LinkedHashMap - TreeMap
         */
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Orange", 100);
        fruits.put("Apple", 200);
        fruits.put("Banana", 300);
        fruits.put("Pineapple", 400);
        fruits.putIfAbsent("Orange", 50);
        // fruits.clear();

        System.out.println(fruits.size());
        System.out.println(fruits);

        //  for (var fruit : fruits.entrySet()) {
        //  System.out.println("The number of calories of fruit " + fruit.getKey() + " is " + fruit.getValue());
        //  }

        fruits.forEach((x, y) -> System.out.println("The number of calories of fruit " + x + " is " + y));
    }
}