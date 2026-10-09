import java.util.*;

class Car {
   String name;
     Car(String name) {
       this.name = name;
    }
 
    public String toString() {
         return name;
     }
 }

public class ArrayListkDemo {

    public static void main(String[] args) {
      
//        // 1. Creating ArrayList int
    	ArrayList<Integer> my_list = new ArrayList<>();
      ArrayList<String> list = new ArrayList<>();
//        
      System.out.println("Empty List: " + my_list);
//
//
//        // 2. Adding Elements
        listname.add();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Strawberry");
        System.out.println("After Adding: " + list);
//       
//        // 3. Adding Element at Specific Index
        list.add(1, "Orange");
        System.out.println("After Adding at index 1: " + list);
//
//        // 4. Accessing Elements
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 2: " + list.get(2));
//
//
//        // 5. Updating Element
        list.set(2, "Pineapple");
        System.out.println("After Updating index 2: " + list);
//
//
//        // 6. Removing Elements
        list.remove(1); // remove by index
        System.out.println("After Removing index 1: " + list);
//
        list.remove("B"); // remove by value
        list.remove("Banana");
        System.out.println("After Removing Banana: " + list);
//
//
//        // 7. Checking Size
        System.out.println("Size of list: " + list.size());
//
//
//        // 8. Loop using for loop
        System.out.println("Using for loop:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
////
////
////        // 9. Loop using for-each loop
        System.out.println("Using for-each loop:");
        for(String i : list) {
           System.out.println(i);
        }
//
//
//        // 10. Checking if element exists
       if(list.contains("Apple")) {
         System.out.println("Apple exists in the list");
       }
       else {
        	System.out.println("not found");
        }
////
////
//        // 11. Clearing list
        list.clear();
        System.out.println("After clearing: " + list);


        // 12. ArrayList with Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i<n; i++) {
        	int a = scan.nextInt();
        	numbers.add(a);
        }

        System.out.println("Integer List: " + numbers);


        // 13. ArrayList with Objects
        ArrayList<Car> cars = new ArrayList<>();
        Car s = new Car("Rahim");
//
        cars.add(s);
        cars.add(new Car("Karim"));
        cars.add(new Car("Nusrat"));
//
        System.out.println("Student List:");
//
        for(Car s1 : cars) {
            System.out.println(s1);
        }
    }
}
