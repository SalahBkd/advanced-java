package com.salahbkd.advanced.concurrency;

public class TestNotifyViaEmail {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		// starting a thread
		Thread thread = new Thread(new NotifyViaEmail());
		thread.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// interrupting a thread
		thread.interrupt();
		
		// joining a thread
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
		
		
	}
}
