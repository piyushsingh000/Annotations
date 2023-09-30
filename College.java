package LearnAnnotation;

public class College {
	public static void main(String args[]) {
		A obj = new B();
		obj.name();
		
	}

}
class A {
	public void name() {
		System.out.println("My name is Piyush");
	}
}
class B extends A{
@Override
	public void name() {
		System.out.println("My name is Piyush2");
	}
}