package com.test.javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniquesortQ4 {

	public static void main(String[] args) {

		List<Integer> arrlist = Arrays.asList(5, 2, 7, 4, 1);
		Collections.sort(arrlist);
		for (Integer arr : arrlist) {
			System.out.println("after sorting arraylist: " + arr);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new value to array:");
		int input = sc.nextInt();
		if (arrlist.contains(input)) {
			System.out.println("Value already exists in list");
		} else

		{
			List<Integer> addedList = new ArrayList<Integer>();
			addedList.addAll(arrlist);

			addedList.add(Integer.valueOf(input));

			System.out.println("list doesn't contain value entered. Size after add : " + addedList.size());
		}

	}

}
