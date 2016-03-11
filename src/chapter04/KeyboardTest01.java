package chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;

public class KeyboardTest01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("utf8.txt");
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8"); // 보조스트림
			
			BufferedReader br = new BufferedReader(isr);
			
			String line;
				while ((line = br.readLine()) != null) {
				System.out.println((line));

			}

			br.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
