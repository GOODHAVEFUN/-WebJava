package fileTest.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class FileTest3 {
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test3.txt")));
		bw.write("테스트세번째입니다");
		// 버퍼를 비운다 -> 버퍼에 있는 데이터를 전송한다 flash()
//		bw.flush();
		bw.close();
		// close()를 하면 flush()적용이 진행된다

		BufferedReader br = new BufferedReader(new FileReader(new File("test3.txt")));
		System.out.println(br.readLine());
	}
}
