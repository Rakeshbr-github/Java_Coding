package Java_Interview_Frequent_Questions;

public class Swapping_of_Two_Numbers {

	public static void main(String[] args) {

		int a=10,b=20;
		
//		Logic 1  - using third variable
//		System.out.println("Before swapping the numbers value of a is " + a+ " and value of b is " +b);
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swapping the numbers value of a is " + a+ " and value of b is " +b);
//		System.out.println();
		
//		Logic 2 - using +&- Without using third variable 
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swapping a =" +a+ " and b=" +b );
		
//		Logic 3 - Use * and / without using third variable -in this a and b value must not be 0
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After swapping a =" +a+ " and b=" +b);
		
		
//		Logic 4- Single statement
		b=a+b-(a=b);
		System.out.println("After swapping a=" +a+ " and b="+b);

		
	}

}
