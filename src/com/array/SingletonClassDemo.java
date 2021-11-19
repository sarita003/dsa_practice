package com.array;

public class SingletonClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("Hashcode of s1 is " + s1.hashCode());
		System.out.println("Hashcode of s2 is " + s2.hashCode());
	}

}

class Singleton {
	private static Singleton singleton = null;
	private String s;

	private Singleton() {
		s = "Singleton Class Constructor";
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}