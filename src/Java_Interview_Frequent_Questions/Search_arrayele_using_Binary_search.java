package Java_Interview_Frequent_Questions;


public class Search_arrayele_using_Binary_search {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,7,8,9,10};
		
		int key=5;
		int l=0;
		int h=a.length-1;
		boolean flag=false;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==key)
			{
				System.out.println("Number found After binary search..."); 
				flag=true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
			}
			if(a[m]>key) 
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Number not found after binary search...");
		}
		
	}

}
