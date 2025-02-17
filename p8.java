public class p8 
{
    public void punto8(int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatriz(d);
        m.MostratMatrizOriginal(M);
        int [] sumafila = m.sumafila(M);
        int nm = 0, imy = 0;

        for (int i = 0; i < sumafila.length; i++)
        {
            if (sumafila[i] > nm) 
            {
                nm = sumafila[i];
                imy = i;
            }
        }
        System.out.println("La fila con la mayor suma es la : " + imy );
    }
    
}
