package abstractTest;

//추상클래스 => 추상 메소드 1개이상 와야한다 , 일반 메소드 사용 가능
abstract public class ClassA {
	abstract void method1();

	void method2() {
		System.out.println("메소드2 실행");
	}
}
