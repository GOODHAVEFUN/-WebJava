package staticTest;

public class StaticTest {
	public static void main(String[] args) {
			StaticTest st =new StaticTest();
	}

	void iMethod1() {
		System.out.println("인스턴스 메소드 1 실행");
	}
	void iMethod2() {
		System.out.println("인스턴스 메소드 2 실행");
	}
	
	static void sMethod1() {
		System.out.println("스태틱 메소드 1 실행");
		iMethod1
	}
	static void sMethod2() {
		System.out.println("스태틱 메소드 2 실행");
	}
}
