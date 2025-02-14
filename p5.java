public class p5 
{
    public void vector(int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatriz(d);
        m.MostratMatrizOriginal(M);
        int [] vect = new int[d*d];
        for( int i = 0; i < M.length; i++ )
        {
            for(int j = 0; j < M.length; j++)
            {
                vect[i * d + j] = M[i][j];
            }
        } 
        for( int i = 0; i < vect.length; i++)
            System.out.print(" - " + vect[i] );
    }
    
}
