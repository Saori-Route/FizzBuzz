package hello.java;
public class java3課題 {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i += 1) {
		  System.out.println(FizzBuzz(i));
	    }
    }
   static String FizzBuzz(int num) {
	   if(num % 3 == 0 && num % 5 == 0)
		   return num +":FizzBuzz";
	   else if(num % 3 == 0 && num % 5 != 0)
		   return num +":Fizz";
	   else if(num % 3 != 0 && num % 5 == 0)
		   return num +":Buzz";
	   else
		   return num + ":";



   }



}
