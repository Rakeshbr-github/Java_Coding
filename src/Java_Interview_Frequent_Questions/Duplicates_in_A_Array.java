package Java_Interview_Frequent_Questions;

public class Duplicates_in_A_Array {

	public static void main(String[] args) {

		int a[]= {1,2,5,4,5,6};
		int arrlen=a.length;
		for(int i=0;i<arrlen;i++)
		{
			for(int j=i+1;j<arrlen;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i] + " Duplicate value in the array");
				}
			}
			
			
			
		}
		}
	}


