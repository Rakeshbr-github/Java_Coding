package Java_Interview_Frequent_Questions;

//Prime number
//1)If the number>1
//2)If number is divisible by 1 or itself only

import java.util.Scanner;

public class Check_prime_number_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		}
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is a Prime Number");
		}
		else
		{
			System.out.println(num + " is Not a Prime Number");

		}



	}
	}


