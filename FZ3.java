package hello.java;
import java.util.Scanner;

public class FZ3 {
	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

	     if(a % 3 == 0 && a % 5 == 0)
		   System.out.println("FizzBuzz");
	     else if(a% 3 == 0 && a % 5 != 0)
		   System.out.println("Fizz");
	     else if(a % 3 != 0 && a % 5 == 0)
		   System.out.println("Buzz");
	     else
		   System.out.println(":");



       }



}
