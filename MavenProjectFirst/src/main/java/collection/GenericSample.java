package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> r = new ArrayList<String>();
		// add - to add an element
		r.add("Red");
		r.add("Green");
		r.add("Yelolow");
		r.add("Blue");
		System.out.println(r);
		// set-provide the index and the value to set in that index
		r.set(2, "Gold");
		System.out.println(r + "yellow replaced with gold");
		// indexOf-shows only the first occurrence
		System.out.println(r.indexOf("Red"));
		r.add("Red");
		System.out.println(r);
		System.out.println(r.indexOf("Red"));
		// lastIndexOf-last Occurrence
		System.out.println(r.lastIndexOf("Red"));
		//remove
		r.remove(0);
		System.out.println(r);
		r.remove("Green");
		System.out.println(r);
		//get
		System.out.println(r.get(2));
		//contains
		System.out.println(r.contains("Gold"));
		System.out.println(r.contains("Whiy"));
		//isEmpty
		System.out.println(r.isEmpty());
		if(r.isEmpty()) {
			System.out.println("List is empty");
		}else {
			System.out.println("List is NOT empty");
		}
		//size
		System.out.println(r.size());
		for(int i =0;i<r.size();i++) {
			System.out.println(r.get(i));
		}
		//forEach
		for(String l:r) {
			System.out.println(l);
		}
	}

}


