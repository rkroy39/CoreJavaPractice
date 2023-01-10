package basicprograms;

class A
{ 	
int a=5;
 	void print() {
 	System.out.println("inside print A");
 	}
	public static void main(String[] args) {
		System.out.println("Inside A");
	}
}

class B extends A
{ 
	int y;
	void print() {
		System.out.println("inside print B");
	}
	public static void main(String[] args) {
		A obj=new B();
		obj.print();
		obj.a=10;
		System.out.println("Inside B "+obj.a);
	}
}
public class BasicPrograms extends B {
	public static void main(String[] args) {
		B ab=new B();
		ab.main(args);
		System.out.println("Hello World");
	}

}
