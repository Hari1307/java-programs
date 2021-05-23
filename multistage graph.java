class multistage
{
    public static void main(String[] args) {
        int stages = 4 , min;
        int n = 8; 
        int cost[] = new int[9];
        int d[]  = new int[9];
        int path[] = new int[5];
        int c[][] = {{0,0,0,0,0,0,0,0,0},
                     {0,0,2,1,3,0,0,0,0},
                     {0,0,0,0,0,2,3,0,0},
                     {0,0,0,0,0,6,7,0,0},
                     {0,0,0,0,0,6,8,9,0},
                     {0,0,0,0,0,0,0,0,6},
                     {0,0,0,0,0,0,0,0,4},
                     {0,0,0,0,0,0,0,0,5},
                     {0,0,0,0,0,0,0,0,0}
                    };
        
        cost[n] = 0;
        for(int i = n-1 ; i >= 1 ; i--)
        {
            min = 32767;
            for(int k = i+1 ; k <= n ; k++)
            {
                if(c[i][k] != 0 && (c[i][k] + cost[k]) < min)
                {
                   min = c[i][k] + cost[k];
                   d[i] = k;
                }
            }
            cost[i] = min;
            
        }

        path[1] = 1;
        path[stages] = n;
        for(int z = 2 ; z < stages ; z++)
        {
            path[z] = d[path[z-1]];
        }

        System.out.println("the minimum path is : ");
        for(int i = 1 ; i <= stages ; i++)
        {
            System.out.print(path[i]+" ");
        }
        System.out.println();
        System.out.println("the cost is : ");
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(cost[i]+" ");
        }
        System.out.println();
        System.out.println("the intermediate vertex is : ");
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(d[i]+" ");
        }
    }
}