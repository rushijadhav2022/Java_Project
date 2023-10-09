package com.hashmap;

import java.util.*;

public class HashmapDemo6 {

	public static void main(String[] args) {
		HashMap<String,Integer>hs=new HashMap<>();
		ArrayList<String> name = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter colour name");
		for (int i = 0; i <= 5; i++) {
			name.add(sc.next());
		}

		System.out.println(name);

		for (int i = 0; i < name.size(); i++) {
			boolean isPresent = true;
			int count = 1;
			for (int k = i - 1; k >= 0; k--) {
				if (name.get(i).equals(name.get(k))) {
					isPresent = false;
					break;
				}

			}
			if (isPresent == true) {
				for (int j = i + 1; j < name.size(); j++) {
					if (name.get(i).equals(name.get(j))) {
						count++;
					}

				}
				if (count >=1) {
					//System.out.println(name.get(i) + " " + count);
					hs.put(name.get(i),count);
				}
			}

		}
		
		for(Map.Entry<String,Integer> c : hs.entrySet())
		{
			System.out.print(c+" ");
		}
		
		
		

	}
}
