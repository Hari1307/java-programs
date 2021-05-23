// all pair shotest path problem
class floydwarshal 
{
    final static int INF = 9999, n = 4;
    void print(int z[][])
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(z[i][j] == INF)
                {
                    System.out.print("INF ");
                }
                else
                System.out.print(z[i][j]+ " ");
            }
            System.out.println();
            
        }
    }
    void perform(int a[][])
    {
        int z [][] = new int[n][n];

        for(int v = 0 ; v < n ; v++)
        {
            for(int g = 0 ; g < n ; g++)
            {
                z[v][g] = a[v][g];
            }
        }

        for(int k = 0 ; k < n ; k++)
        {
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j < n ; j++)
                {
                    if(z[i][k] + z[k][j] < z[i][j])
                      {
                            z[i][j] = z[i][k] + z[k][j];
                      } 
                }
                
            }
        }
        System.out.println("the changed array or graph is : ");
        print(z);
    }
    public static void main(String[] args) {
        int a [][] = {{ 0, 3, INF, 7 }, 
                      { 8, 0, 2, INF }, 
                      { 5, INF, 0, 1 }, 
                      { 2, INF, INF, 0 }
                     }; 
        floydwarshal f =  new floydwarshal();
        System.out.println("the original array or graph : ");
        f.print(a);
        System.out.println();
        f.perform(a);       
    }
}
