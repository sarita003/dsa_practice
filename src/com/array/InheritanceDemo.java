package com.array;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		a.display();
	}

}

class A{
	void display() {
		System.out.println("Class A");
	}
}

class B extends A{
	void display() {
		System.out.println("Class B");
	}
}


class C extends B{
	void display() {
		super.display();
		System.out.println("Class C");
	}
}