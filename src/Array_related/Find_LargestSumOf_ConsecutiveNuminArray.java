package Array_related;

public class Find_LargestSumOf_ConsecutiveNuminArray {

    public static void main(String[] args)
    {
        int[] a={4,5,6,2,9,5};

        int greatestsum=0;
        int index1=0;
        int index2=0;
        for(int i=0;i<a.length-1;i++)
        {
            int num=a[i]+a[i+1];
            if(num>greatestsum)
            {
                greatestsum=num;
                 index1 = i;
                 index2 = i + 1;
            }

        }
        System.out.println("Maximum Sum: " + greatestsum);
        System.out.println("Indices: " + index1 + ", " + index2);
    }
    }

