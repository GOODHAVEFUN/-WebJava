package castingTest2;

public class Animal {
	// 필드
	int age;
	String name;

	// 메소드-> 자식 클래스에서 반드시 재정의 해야함
	void crying() {
		System.out.println("울어");
	}

}
