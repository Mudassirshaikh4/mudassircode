package com.lambda.eight;

public class threadexample {

	public static void main(String[] args) {
	
	Runnable threads=()->{
		
	for(int a=1;a<=10;a++) {	
	System.out.println(a);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	};

	Thread t=new Thread(threads);
	t.setName("mudassir");
	t.start();
	
	Runnable thread1=()->{
		
		for(int u=1;u<=10;u++)
		{
			System.out.println(u*3);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread thread2=new Thread(thread1);
	thread2.start();
	}
}
