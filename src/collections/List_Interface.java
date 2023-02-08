package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class List_Interface {
	
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		//Adding data with or without indexes
		list.add(1);
		list.add(2);
		System.out.println("add(2) Before index given "+list);

		list.add(1,3);
		System.out.println("add(1,3) After index given "+list);

		List<Integer> list1=new ArrayList<Integer>();
		list1.add(0, 8);
		//Adding list in another list with/without index
		list1.addAll(1, list);
		System.out.println("addAll() After index given and new list "+list1);
		
		// Removes element from index 1
		list1.remove(0);
		System.out.println("remove(0) After index given and new list "+list1);
		list1.remove(0);

		System.out.println("remove(0) After index given and new list "+list1);
		
		// Printing at specific location
		System.out.println("get(1) Printing at specific location "+list1.get(1));
		
		// Replace 0th element with 5  in List
      
		list1.set(0, 5);
		System.out.println("set(0, 5) Replace 0th element with 5  in List "+list1);

//Iteration of list
		list1.addAll(1, list);
		System.out.println("New  List for iteration "+list1);

		
		// Using  for loop for iteration
		System.out.println("for loop iteration" );
        for (int i = 0; i < list1.size(); i++) {
  
            // Using get() method to
            // access particular element
        	
            System.out.print(" "+list1.get(i) + " ");
        
        }
		System.out.println("" );

     // Using for-each loop for iteration
		System.out.println("for-each loop for iteration" );

        for (Integer str : list1)
  
            System.out.print(str + " ");
        
        
    	int n = 5;
    	Scanner sc=new Scanner(System.in);
    	List<Integer> v = new Vector<Integer>(n);
    	for (int i = 0; i <= n; i++) {
           System.out.println("Inside loop");
    		
    		System.out.println("Enter your number");
    		Integer a=sc.nextInt();
    		v.add(i,a);
    		
    	}
        sc.close();
        System.out.print("vector list"+v);
    }

		
	

}
