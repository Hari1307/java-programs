class multistage
{
    public static void main(String[] args) {
        int stages = 4;
        int n = 8; 
        int cost[9],d[9],path[stages];
        int c[9][9]={};
        
        cost[n] = 0;
        for(int i = n-1 ; i >= 1 ; i--)
        {
            for(k = i+1 ; k <= n ; k++)
            {
                if(c[i][k] != 0 && c[i][k] + cost[k] < min)
                {
                   min = c[i][k] + cost[k];
                   d[i] = k;
                }
            }
            cost[i] = min;
        }

        path[1] = 1;
        path[stages] = n;
        for(int i = 2 ; i < stages ; i++)
        {
            path[i] = d[p[i]];
        }

        System.out.println("the minimum path is : ");
        for(int i = 1 ; i <= stages ; i++)
        {
            System.out.print(path[i]+" ");
        }
    }
}