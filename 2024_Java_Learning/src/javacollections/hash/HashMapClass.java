package javacollections.hash;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {
	
	//Time: O(N), Space: O(N)
	public static void findMajorityElements(int arr[]) {
		//Find element present more than n/3 times
		int n = arr.length;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i : arr) {
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i, 1);
		}
		
		for(Integer i : hm.keySet()) {
			if(hm.get(i) > n/3)
				System.out.print(i + " ");
		}
	}
	
	//Get Itinerary (path from source to destination)
	public static void getItinerary(HashMap<String, String> hm) {
		/*
		"Chennai", "Bengaluru"
		"Mumbai", "Delhi"
		"Goa", "Chennai"
		"Delhi", "Goa"
		
		Approach:
		Starting city will be a city which is not present in 'value' side.
		
		Implementation:
		Create a set of all values of HashMap and save as a HashSet.
		Now, fetch key of HashMap which doesn't exist in HashSet; it will be starting city, say 'city'.
		Next, proceed to print the 'city' and fetch whether 'value' of this 'city' key exists.
		Further, re-assign the 'city' key as the 'value' associated to this city.
		Keep finding 'value' of each 'city' key till HashMap contains the 'key' i.e. key=value pair exists 
		*/
		HashSet<String> hs = new HashSet<>(hm.values());
		String city = "";
		
		for(String s : hm.keySet()) {
			if(!hs.contains(s)) {
				city = s;
				break;
			}
		}
		
		System.out.print(city);
		
		while(hm.containsKey(city)) {
			city = hm.get(city);
			System.out.print(" -> " + city);
		}
	}

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		hm.put(5, 7);
		hm.put(2, 46);
		hm.put(5, 12);
		hm.put(3, 12);
		hm.put(6, 19);

		System.out.println(hm.put(6, 55));
		System.out.println(hm);
		System.out.println(hm.get(5));
		hm.remove(3);
		System.out.println(hm);
		hm.put(1, 6);
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(4));
		
		//Searching
        if(hm.containsKey(5))
           System.out.println("key is present in the map");
        
        //Iteration (1)
       for(Map.Entry<Integer, Integer> e : hm.entrySet())
           System.out.println(e.getKey() + " " + e.getValue());
   
       //Iteration (2)
       Set<Integer> keys = hm.keySet();
       for(Integer key : keys)  //for(Integer key : hm.keySet()) can be used directly
           System.out.println(key+ " " + hm.get(key));
        
       //Iteration (3)
       Iterator itr = hm.keySet().iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		
		//Simple
		for(Integer key : hm.keySet())
			System.out.println(key+ " " + hm.get(key));
		System.out.println();
		
		int arr[] = {1,3,2,5,1,3,1,5,1};
		findMajorityElements(arr);
		System.out.println();
		int arr2[] = {1,2};
		findMajorityElements(arr2);
		System.out.println();
		
		HashMap<String, String> cityHM = new HashMap<>();
		cityHM.put("Chennai", "Bengaluru");
		cityHM.put("Mumbai", "Delhi");
		cityHM.put("Goa", "Chennai");
		cityHM.put("Delhi", "Goa");
		
		getItinerary(cityHM);
	}
}