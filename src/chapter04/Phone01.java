package chapter04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Phone01 {

	public static void main(String[] args) {
		try {
			// 파일 객체 (1)파일이 잇는지 없는지 미리 인지 (2)파일 정보를 미리 뽑아올 수 있다.
			File file = new File("Phone.txt"); // FileNotFoundException 을 미리
												// 감지하는 기능이 있다.
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			} // 미리 파일이 잇는지 없는지 인지
				// file information
			System.out.println("*********파일 정보**********");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss")
					.format(new Date(file.lastModified()))); // lastModified는
																// 198x 년부터 그리니치
																// 천문대에서 시작된 초를
																// 반환한다
			System.out.println();

			System.out.println("*********전화번호 리스트**********");

			FileInputStream fis = new FileInputStream(file); // 빨대
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 보조스트림

			BufferedReader br = new BufferedReader(isr);

			String line;
			int index = 1;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t");
				while (st.hasMoreElements()) {
					String token = st.nextToken();
					if (index == 1) {
						System.out.print("이름:" + token);
					} else if (index == 2) {
						System.out.print("\t전화번호:" + token);
					} else {
						System.out.print("-" + token);
					}
					index++;

				}
				System.out.println();
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
