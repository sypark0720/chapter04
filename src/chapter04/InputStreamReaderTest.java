package chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("utf8.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 보조스트림

			int data = -1;
			while ((data = isr.read()) != -1) {
				System.out.println((char) data);

//				// ms949
//				FileInputStream fis2 = new FileInputStream("ms949.txt");
//				InputStreamReader isr2 = new InputStreamReader(fis2, "MS949"); // 보조스트림
//
//				while ((data = isr2.read()) != -1) {
//					System.out.println((char) data);

				}

				isr.close();


		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
