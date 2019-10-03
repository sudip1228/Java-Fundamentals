package map_project;

import java.util.*;

public class map_runner {

	public static void main(String[] args) {
		//Map<Integer,String> m= Map.of(1,"mango",2,"orange",3,"apple");
		//Map<Integer,String> k= new HashMap<Integer,String>(m);
		Map<Integer,String> s= new HashMap<Integer,String>();			/*map does not extends the collection interface.So, it has different methods 
																	than other collections interface.
																				
																	All other collection interface extends from collections.
		
		 																			*/
		Map<Integer,String> sj= new LinkedHashMap<Integer,String>();
		Map<Integer,String> bn= new TreeMap<Integer,String>();
		
		
		sj.put(1, "apple");
		sj.put(2, "grapes");
		sj.put(4, "guava");
		sj.put(3, "banana");
		System.out.println(sj);
		System.out.println(sj.containsKey(2));
		System.out.println(sj.containsValue("banana"));

		
		s.put(1, "apple");
		s.put(2, "grapes");
		s.put(3, "guava");
		s.put(4, "banana");
		System.out.println(s);
		System.out.println(s.containsKey(2));
		System.out.println(s.containsValue("banana"));
		System.out.println(s.containsValue("orange"));
		
		
		bn.put(1, "apple");
		bn.put(2, "grapes");
		bn.put(4, "guava");
		bn.put(3, "banana");
	
		System.out.println(bn);
		
		
		System.out.println("hash map is random order: ");
		//1st way
		for(Map.Entry<Integer,String> e:s.entrySet()) {
			System.out.println("key= "+e.getKey()+" value= "+e.getValue());
		}
		for(Map.Entry<Integer,String> e:sj.entrySet()) {
			System.out.println("key= "+e.getKey()+" value= "+e.getValue());
		}
		for(Map.Entry<Integer,String> e:bn.entrySet()) {
			System.out.println("key= "+e.getKey()+" value= "+e.getValue());
		}
		/*  
		//2nd way
		
		// using keySet() for iteration over keys 
        for (Integer name : s.keySet())  {
            System.out.println("key: " + name); 
        }
        // using values() for iteration over keys 
        for (String url : s.values())  {
            System.out.println("value: " + url); 
        }
        
       
        //3rd way
        
        Iterator<Map.Entry<Integer, String>> itr = s.entrySet().iterator(); 
        
        while(itr.hasNext()) 
        { 
             Map.Entry<Integer, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
       
        //4th way
        
        // looping over keys 
        for (Integer name : s.keySet())  
        { 
            // search  for value 
            String url = s.get(name); 
            System.out.println("Key = " + name + ", Value = " + url); 
        } 
        
        
        //5th way
        
        s.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v)); 
	}*/

}
}
