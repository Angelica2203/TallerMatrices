public class p6 
{
    public void ColumFilaVector ( int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatriz(d);
        m.MostratMatrizOriginal(M);
        int [] vect = new int[d*d];
        int [] sumFi = m.sumafila(M);
        int [] sumCo = m.sumaColumna(M); 

        for (int i = 0; i < vect.length; i++) 
        {
            if (i < d)
                vect[i] = sumFi[i];
            else 
                vect[i] = sumCo[i - d];
        }
        System.out.println("Vector de suma de filas y columnas");
        for (int i = 0; i < vect.length; i++) 
            System.out.print(" - " + vect[i]);
            
        

        

        
    }
    
}
