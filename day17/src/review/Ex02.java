package review;

import java.util.Scanner;
import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열 입력:");
//		String str = sc.nextLine();
//
//		System.out.println("찾을 특정 문자 입력:");
//		char str2 = sc.nextLine().charAt(0);
//
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == str2) {
//				count++;
//			}
//		}
//		System.out.println(str2+"문자등장횟수" + count);

		// 프레임워크사용
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.println("특정문자 입력 : ");
		char str2 = sc.next().charAt(0);

		// 문자 등장 횟수를 지정할 HashMap 생성
		HashMap<Character, Integer> map = new HashMap<>();

		// 입력된 문자열 순회 등장 횟수 세기
		for (char c : str.toCharArray()) {
			// toCharArray() 메소드는 문자 배열로 반환하는 메소드
			// 이미 등장
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				// 처음 등장
				map.put(c, 1);
			}
		}

		int count = getStr(map, str2);
		System.out.println(str2 + " 등장 횟수 : " + count);
	}

	// 저장된 특정 문자의 등장 횟수를 반환하는 메소드
	public static int getStr(HashMap<Character, Integer> map, char str2) {
		if (map.containsKey(str2)) {
			return map.get(str2);
		}
		return 0;

	}
}
