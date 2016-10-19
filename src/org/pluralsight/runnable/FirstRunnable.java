package org.pluralsight.runnable;

public class FirstRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("I am running in " + Thread.currentThread().getName());
		};
		
		Thread t = new Thread(runnable);
		t.setName("My Thread ");
		//t.run();
		t.start();

	}

}
