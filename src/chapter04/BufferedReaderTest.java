package chapter04;

import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReaderTest {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("/./src"); // chapter4의 위치
			BufferedReader br = new BufferedReader(fr);

			int index = 1;
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(index + ":" + line); // 개행을 빠진다.
				index++;
			}

			br.close(); // 보조만 닫아도 다 닫힌다.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
