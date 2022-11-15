package MyPractice;

import java.util.Scanner;

public class ArthmeticOperation {

	public static void main(String[] args) {

		int a;
		int b;
		System.out.println("Enter two number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);


	}

}
