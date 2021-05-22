public class quicksort
{
    int p(int q[] , int l , int h)
    {
        int start = l;
        int end = h;
        int pivot = q[l];
        while(start < end)
        {
            while(q[start] < pivot)
            {
                start++;
            }
            while(q[end] > pivot)
            {
                end--;
            }
            
            if(start < end)
            {
                int temp = q[start];
                q[start] = q[end];
                q[end] = temp;
            }

        }

        int g = q[end];
        q[end] = pivot;
        pivot = g;

        return end;
    }
    void sort(int z[] , int lower , int h)
    {
        if(lower <  h)
        {
            int location = p(z , lower , h);
            sort(z , lower , location - 1);
            sort(z , location + 1, h);
        }
    }
    public static void main(String[] args)
    {
        int a[] = {45,5,1,4,7,57,47,22,8,3};
        quicksort d = new quicksort();
        d.print(a);
        d.sort(a, 0, a.length-1);
        d.print(a);
    }
    void print(int a[])
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
