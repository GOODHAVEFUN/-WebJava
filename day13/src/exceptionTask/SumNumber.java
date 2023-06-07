package exceptionTask;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		// 2분 ~ 12분 쉬는시간
		// 12분 ~ 25분까지 풀기

		// 1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하기
		// 숫자가 아닌 값이 입력될 경우 잘못된 입력입니다 라는 예외메시지 출력후
		// 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		try {
			int number = sc.nextInt();
			int result = 0;

			for (int i = 1; i <= number; i++) {
				result += i;
			}
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못된입력");
		} finally {
			sc.close();// Scanner 객체가 사용한 이스템 리소스를 반환하고
			// 메모리 누수 문제를 방지하기위해 작성함
		}

	}
}