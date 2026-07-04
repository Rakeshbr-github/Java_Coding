package Java_Interview_Frequent_Questions;

public class Second_Largest_Array_element {

    public static void main(String[] args) {
        int[] a={2,3,4,5,7,1};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(a[a.length-2]);
    }
}
