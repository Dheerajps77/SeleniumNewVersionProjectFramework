package Aug2024;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.Set;

public class CommonElementsInArrayOrArrayList {

	public static void commonElementsUsingDifferentApproach() {
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
			arrayList.add(34);
			arrayList.add(35);
			arrayList.add(45);
			arrayList.add(21);
			arrayList.add(65);
			arrayList.add(24);

			arrayList1.add(34);
			arrayList1.add(351);
			arrayList1.add(435);
			arrayList1.add(21);
			arrayList1.add(65);
			arrayList1.add(124);

			Set<Integer> integer1 = new HashSet<Integer>(arrayList);
			Set<Integer> integer2 = new HashSet<Integer>(arrayList1);
			integer1.retainAll(integer2);
			for (int value : integer1) {
				System.out.println(value);
			}
		} catch (Exception e) {

			throw e;
		}
	}

	public static void commonElements() {
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
			ArrayList<Integer> commonValue = new ArrayList<Integer>();

			arrayList.add(34);
			arrayList.add(35);
			arrayList.add(45);
			arrayList.add(21);
			arrayList.add(65);
			arrayList.add(24);

			arrayList1.add(34);
			arrayList1.add(351);
			arrayList1.add(435);
			arrayList1.add(21);
			arrayList1.add(65);
			arrayList1.add(124);

			if (arrayList.size() == arrayList1.size()) {
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).equals(arrayList1.get(i))) {
						// commonValue.add(arrayList.get(i));
						System.out.println(arrayList.get(i));
					}
				}
			} else {
				System.out.println("The size of 2 arraylist values are different");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		commonElementsUsingDifferentApproach();

	}

}
