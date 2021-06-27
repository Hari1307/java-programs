public class mcmul{
    static int chaincost(int p[] , int n)
    {
        int min,j;
        int m[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++)
        m[i][i] = 0;

        for(int d = 1 ; d < n - 1 ; d++)
        {
            for(int i = 1 ; i < n - d ; i++)
            {
                j = i + d;
                if(j == n)
                {
                    continue;
                }
                m[i][j] = Integer.MAX_VALUE;
                for(int k = i ; k <= j - 1 ; k++)
                {
                    min = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    
                    if(min < m[i][j])
                    {
                        m[i][j] = min;
                    }
                }
            }
           
        }
        for(int i = 1 ; i < n ; i++)
        {
            for(int c =  1 ; c < n ; c++)
            {
                System.out.print(m[i][c]+"\t ");
            }
            System.out.println();
        }
        return m[1][n-1];
    }
    public static void main(String[] args) {
        int p[] = {5,4,6,2,7};
        int n = p.length;
        System.out.println("minimum cost of the multiplication is : "+chaincost(p,n));
    }
    
}
