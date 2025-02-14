public class p4 
{
    public void NumMayEIndi(int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatriz(d);
        m.MostratMatrizOriginal(M);
        int [] sumaco = m.sumaColumna(M);
        int nm = 0, imy = 0;

        for (int i = 0; i < sumaco.length; i++)
        {
            if (sumaco[i] > nm) 
            {
                nm = sumaco[i];
                imy = i;
            }
        }
        System.out.println("La columna con la mayor suma es la : " + imy + ", con una suma de: " + nm);
    }
    
}
