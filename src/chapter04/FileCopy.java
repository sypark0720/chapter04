package chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream( "dogs.jpg"); //실행이 되면 chapter04 directory에서 실행된다.
			FileOutputStream fos = new FileOutputStream("dogs.jpg");
			
			int data = -1;
			while((data = fis.read())== -1){
				fos.write(data);
				}
			
			fis.close();
			fos.close();
			 
		}catch (IOException e) {
				e.printStackTrace();
		} 
		
	}

}
