package accessModifier;

public class Main2 {

	public static void main(String[] args) {
		
		B b = new B();
		
		System.out.println(b.var1);
		System.out.println(b.var2);
		System.out.println(b.var3);
//		System.out.println(b.var4); private때문에 오류발생
		
		b.method1();
		b.method2();
		b.method3();
	}
}
