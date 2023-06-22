package Ex01;

public class Test {
	public static void main(String[] args) {
		String lineSepString = System.lineSeparator();
		// 시스템 줄바꿈 문자열을 반환하는 ,java클래스의 공용 정적 메소드
		// 텍스트 파일에서 줄바꿈할때 사용되는 개행문자를 검색하는 
		// 플랫폼 독립적인 방법을 제공
		// \r\n
		System.out.println("Hello"+ lineSepString + "java");
	}
}
