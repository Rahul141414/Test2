package Selenium_Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> maps = new HashMap<Integer,String>();
		maps.put(01, "Rahul");
		maps.put(02, "Madhav");
		maps.put(03, "Ravindra");
		maps.put(03, "Shubham");
		for(Entry<Integer, String> w:maps.entrySet()) {
			System.out.println(w.getKey()+" "+w.getValue());
		}
	}

}
