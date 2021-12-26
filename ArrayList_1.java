package array;

//importing ArrayList
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
    public static void main(String[] args) {
        System.out.println("ArrayList");

        //declaration of ArrayList
        ArrayList<Integer> myList = new ArrayList<>();
        
        //adding elements to ArrayList
        myList.add(3);
        myList.add(5);
        myList.add(-9);
        myList.add(0);

        //printing ArrayList
        System.out.println("Your ArrayList is: "+myList);

        //ensuring capacity of ArrayList 
        myList.ensureCapacity(5);

        //adding at certain index
        myList.add(1,99);   //at index 1 adds 99 in myList
        System.out.println("ArrayList after adding a new element: "+myList);

        //exchanging existing element in list with new element
        myList.set(2, 404);
        System.out.println("ArrayList after changing an existing element to a new element: "+myList);

        //removing elements from ArrayList
        myList.remove(3);   //removes element at index 3
        System.out.println("ArrayList after removing an element: "+myList);

        //getting size of list
        int sizeOfList = myList.size();
        System.out.println("Size of ArrayList is: "+sizeOfList);

        //looping through ArrayList
        System.out.println("Looping through ArrayList: ");
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        //sorting ArrayList
        //Collections class method sort() is used for sorting ArrayList
        //for using Collections class methods, first import java.util.Collections;
        Collections.sort(myList);
        System.out.println("Sorted ArrayList is: "+myList);

    }
}