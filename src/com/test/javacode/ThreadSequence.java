package com.test.javacode;

public class ThreadSequence implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(" Run method started :" +i);
		}
		
	}
	
	public static void main(String[] args) {
		ThreadSequence s=new ThreadSequence();
		Thread T1=new Thread();
		Thread T2=new Thread();
		Thread T3=new Thread();
		T1.start();
		try {
			System.out.println("Thread T1 started");
			T1.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		T2.start();
		try {
			System.out.println("Thread T2 started");
			T2.join();
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		T3.start();
		try {
			System.out.println("Thread T3 started");
			T3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	

	}

	
		
	}


