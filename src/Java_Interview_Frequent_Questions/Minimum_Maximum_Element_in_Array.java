package Java_Interview_Frequent_Questions;

public class Minimum_Maximum_Element_in_Array {

	public static void main(String[] args) {

		int a[]= {10,20,40,80,60};
		 int arraylen=a.length;
		 
		 
		 int max=a[0];
		 for(int i=1;i<arraylen;i++)
		 {
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		 }
		 System.out.println(max + " is the maximum value in the array..");
		
		 
		 int min=a[0];
		 for(int i=1;i<arraylen;i++)
		 {
			 if(a[i]<min)
			 {
				 min=a[i];
			 }
		 }
		 System.out.println(min + " is the minimum value in the array..");

	}

}
