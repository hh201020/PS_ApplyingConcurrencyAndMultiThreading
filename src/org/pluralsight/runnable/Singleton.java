package org.pluralsight.runnable;

public class Singleton {
	private static Object key = new Object();
	private static volatile Singleton instance;
	private Singleton(){}
	
	public static synchronized Singleton getInstance() {
		if(instance != null){
			return instance;
		}
		synchronized(key) {
			if(instance != null){
				instance = new Singleton();
			}
			return instance;
		}
	}
}
