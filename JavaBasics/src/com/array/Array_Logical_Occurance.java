package com.array;

public class Array_Logical_Occurance {

	public void findOccurance(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean isVisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] == a[k]) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " " + count);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 4, 1, 3, 6, 4, 4 };

		Array_Logical_Occurance al = new Array_Logical_Occurance();

		al.findOccurance(a);

	}

}
