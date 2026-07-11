package Array_related;

public class Duplicates_in_A_Array {

	public static void main(String[] args) {


//		for printing all duplicates
//		for(int i=0;i<arrlen;i++)
//		{
//			for(int j=i+1;j<arrlen;j++)
//			{
//				if(a[i]==a[j])
//				{
//					System.out.println(a[i] + " Duplicate value in the array");
//				}
//			}
//		}

		int[] a = {1,2,3,4,2,2,5,6,6};
		int arrlen=a.length;
//		for printing only once for duplicate elements
		for (int i = 0; i < a.length; i++) {
			boolean duplicateFound = false;
			boolean alreadyPrinted = false;
			// Check if already printed
			for (int k = 0; k < i; k++) {
				if (a[i] == a[k]) {
					alreadyPrinted = true;
					break;
				}
			}

			if (alreadyPrinted)
				continue;
			// Check duplicate ahead
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					duplicateFound = true;
					break;
				}
			}
			if (duplicateFound) {
				System.out.print(a[i] +",");
			}
		}




		}
	}


