package basicprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProblems_001 {
	
	void iterationByEntrySet() {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "Gaurav");
		map.put("2", "Saurabh");
		map.put("3", "Ram");
		
		System.out.println("Map >>>> "+map);
		System.out.println("Map as EntrySet >>>"+map.entrySet());
		System.out.println("Iteration by entryset");
		for(Map.Entry m :map.entrySet()) {
			
			System.out.println( "Key "+m.getKey()+" its value "+m.getValue());
			
		}
		
	}
	
	void iterationByIterator() {
		  Map<String,String> gfg = new HashMap<String,String>();
	      
	        // enter name/url pair
	        gfg.put("GFG", "geeksforgeeks.org");
	        gfg.put("Practice", "practice.geeksforgeeks.org");
	        gfg.put("Code", "code.geeksforgeeks.org");
	        gfg.put("Quiz", "www.geeksforgeeks.org");
	          
	        // using iterators
	        Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();
	          
	        while(itr.hasNext())
	        {
	             Map.Entry<String, String> entry = itr.next();
	             System.out.println("Key = " + entry.getKey() + 
	                                 ", Value = " + entry.getValue());
	        }
	    }
	
	void iteration() {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "Gaurav");
		map.put("2", "Saurabh");
		map.put("3", "Ram");
		map.put("4", "Raman");
		//map.put("5", "Ramani");
		
		System.out.println("Map >>>> "+map);
		System.out.println("Map as EntrySet >>>"+map.entrySet());
		System.out.println("Iteration by Iterator");
		Set s=map.entrySet();
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			System.out.println("itr.next()>>>>>>>"+itr.next());
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

	public static void main(String[] args) {
		
		HashMapProblems_001 hash=new HashMapProblems_001();
		//hash.iterationByEntrySet();
		//hash.iterationByIterator();
        hash.iteration();
		
		
	}
}
