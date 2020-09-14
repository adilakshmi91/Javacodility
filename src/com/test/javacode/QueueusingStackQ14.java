package com.test.javacode;

import java.util.Stack;

public class QueueusingStackQ14 {
	private Stack stack1=new Stack<>();
	private Stack stack2=new Stack<>();
	   public void enqueue(int element) {
		      stack1.push(element);
		      System.out.println(element + " inserted");
		   }
		   public void dequeue() {
		      if(stack2.isEmpty()) {
		         while (!stack1.isEmpty()) {
		            stack2.push(stack1.pop());
		         }
		      }
		      System.out.println(stack2.pop() + " removed");
		   }
		   public static void main(String args[]) {
		      QueueusingStackQ14 test = new QueueusingStackQ14();
		      test.enqueue(10);
		      test.enqueue(50);
		      test.enqueue(100);
		      test.dequeue();
		   }
		}


