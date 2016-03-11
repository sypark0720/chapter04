package chapter04;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		File file = new File("phone.txt");
		try {
			Scanner scanner = new Scanner(file);
			
			// 파일 객체 (1)파일이 잇는지 없는지 미리 인지 (2)파일 정보를 미리 뽑아올 수 있다.
						File file1 = new File("Phone.txt"); // FileNotFoundException 을 미리
															// 감지하는 기능이 있다.
						if (file1.exists() == false) {
							System.out.println("파일이 존재하지 않습니다.");
							return;
						} // 미리 파일이 잇는지 없는지 인지
			
			System.out.println("*********파일 정보**********");
			System.out.println(file1.getAbsolutePath());
			System.out.println(file1.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss")
					.format(new Date(file1.lastModified()))); // lastModified는
																// 198x 년부터 그리니치
																// 천문대에서 시작된 초를
																// 반환한다
			System.out.println();

			System.out.println("*********전화번호 리스트**********");
			while(scanner.hasNext()){
				String name = scanner.next();
				int num01 = scanner.nextInt();
				int num02 = scanner.nextInt();
				int num03 = scanner.nextInt();
				
				System.out.println("이름: "+ name + "\t\t" + "전화번호: " + num01 +"-" + num02 + "-"+ num03);
			}
					
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
