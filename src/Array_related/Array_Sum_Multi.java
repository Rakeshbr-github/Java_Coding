package Array_related;

public class Array_Sum_Multi {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int sum=sumArray(a);
		System.out.println(sum);
		int mult=multiply(5,10);
		System.out.println(mult);
	}

	private static int multiply(int i, int j) {
             int k=1;
             int sum=0;
             while(k<=j)
             {
            	 sum=sum+i; 
            	 k++;
             }
		return sum;
	}

	private static int sumArray(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
