class demo
{
    void merge(int temp[] , int l , int mid , int h)
    {
        int i = l;
        int j = mid+1;
        int k = 0;
        int total = h-l+1;
        int t[] = new int[total];
        while(i <= mid && j <= h)
        {
            if(temp[i] < temp[j])
            {
                t[k++] = temp[i++];
            }
            else
            {
                t[k++] = temp[j++];
            }
        } 
        while(i<= mid)//for remaining arrays 
        {
            t[k++] = temp[i++];
        }
        while(j <= h)
        {
            t[k++] = temp[j++];
        }
        for(int z = 0 ; z < total ; z++)
        {
            temp[z+l] = t[z];
        }
    }
    void sort(int a[] , int l , int h)
    {
        if (l < h)
        {
            int mid = (l+h)/2;
            sort(a,l,mid);
            sort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    void print(int p[])
    {
        for(int i = 0 ; i < p.length ; i++)
        {
            System.out.print(p[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {5,1,3,6,4,7,8,2};
        demo d = new demo();
        d.print(a);
        d.sort(a, 0, a.length-1);
        d.print(a);

    }
}