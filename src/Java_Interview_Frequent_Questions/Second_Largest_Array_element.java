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
        second_largest_element(a);
    }


    public static void second_largest_element(int[] a)
    {
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                second_largest=largest;
                largest=a[i];
            }
            else if (a[i]>second_largest && a[i]!=largest)
            {
                second_largest=a[i];
            }
        }
        System.out.println("The second largest element in the given array is :" +second_largest);
    }
}
