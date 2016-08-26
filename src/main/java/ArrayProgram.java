
public class ArrayProgram {
	
	public static void main(String[] args) {
		B[] items = new B[10]; 
		A[] itemsA = items;
		itemsA[0] = new C();
		System.out.println(items[0]);
	}

}

class A{
	
}

class B extends A{}

class C extends A{}
