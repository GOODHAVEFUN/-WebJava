package array;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 10칸 짜리 배열 선언 후 for문 이용해1~10까지의 값 넣
		//
//		int[] arr1 = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//			arr1[i]=i;
//			System.out.println(arr1[i]);
//		}
		int[] arData = new int[10];

		System.out.println(arData); // 참조값

		for (int i = 0; i < arData.length; i++) {
			arData[i] = i + 1;
			System.out.println(arData[i]);
		}
		//for each문
		for(int i : arData) {
			System.out.println(i);
		}

	}

}
