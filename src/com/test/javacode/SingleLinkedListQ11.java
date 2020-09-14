package com.test.javacode;

import java.util.LinkedList;

public class SingleLinkedListQ11 {

	public static void main(String[] args) {
	   LinkedList<String> llist=new LinkedList<String>();
	   llist.add("steve");
	   llist.add("carl");
	   llist.add("john");
	   llist.add("james");
	   System.out.println("The LinkedList of an array is:" +llist);
	   
	   llist.remove(2);
	   System.out.println("Linked list after deleting the element :" +llist);
	   

	}

}
