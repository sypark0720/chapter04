package chapter04;

public class Test {

	public static void main(String[] args) {
		String s3 = "hello";
		String s4 = "hello";
		System.out.println(s3==s4);
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		

	}

}
