public class knapsack01 {
    public static void main(String[] args) {
        int p[] = new int[] {0,1,2,5,6};
        int wt[] = new int[] {0,2,3,4,5};
        int m = 8;
        int n = 4;
        int k[][] = new int[n + 1][m + 1];
        
        
        for(int i = 0 ; i <= n ; i++)
        {
            for(int w = 0 ; w <= m ; w++)
            {
                if(i == 0 || w == 0)
                {
                    k[i][w] = 0;
                }
                else if(wt[i] <= w)
                {
                    k[i][w] = Math.max(k[i-1][w - wt[i]] + p[i] , k[i-1][w]);
                }
                else
                {
                    k[i][w] = k[i-1][w];
                }
            }
        }

        System.out.println("the final answer is : "+k[n][m]);

        System.out.println("\nthe table after the operation of the insertion in the table : ");
        for(int i = 0 ; i <= n ; i++)
        {
            for(int j = 0 ; j <= m ; j++)
            {
                System.out.print(k[i][j]+" ");
            }
            System.out.println();
        }
        int a = n;
        int b = m;

        System.out.println("\nthe elements which are included in the knapsack are : ");
        while(a > 0 && b >= 0)
        {
            if(k[a][b] == k[a-1][b])
            {
                System.out.print("the element at weight of index "+a+" is 0 ");
                a--;
            }
            else{
                System.out.print("the element at weight of index "+a+" is 1");
                b -= wt[a];
                a--;
            }
            System.out.println();
        }
    }
    
}
