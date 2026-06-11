package Array_related;

import java.util.Arrays;

public class CompareArrayindexes_storeMatchingElements {

	public static void main(String[] args) {
		int[] a= {4,1,7,5};
		int[] b= {6,4,3,7};
		int[] c=dupelement(a,b);

		System.out.println(Arrays.toString(c));
		System.out.println("My Print statment");
	}
	public static int[] dupelement(int[] a,int[] b)
	{
		int[] c=new int[Math.min(a.length,b.length)];
		int k=0;
		for(int i=0;i<a.length;i++ )
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[k++]=a[i];
				}
			}
		}
		return Arrays.copyOf(c,k);

	}

}
