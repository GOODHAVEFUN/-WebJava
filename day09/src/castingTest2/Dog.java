package castingTest2;

public class Dog extends Animal {

	public Dog(String string) {
		// TODO Auto-generated constructor stub
	}

	// 메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("멍멍");
	}

	void walk() {
		System.out.println("산책가자");
	}

}
