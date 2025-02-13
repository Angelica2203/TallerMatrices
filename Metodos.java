public class Metodos 
{
    public int[][] LlenarMatriz( int [][] m)
    {
        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m.length; j++)
            {
                m[i][j] = (int)(Math.random() * 100 + 1); 
            }
        }
        return m;
    }
    
}
