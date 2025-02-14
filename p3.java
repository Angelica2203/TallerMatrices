public class p3 
{
    public void sumasFilasYColumnas(int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatriz(d);
        m.MostratMatrizOriginal(M);
        int [] sumafi = m.sumafila(M);
        for (int i = 0; i < sumafi.length; i++)
        {
            System.out.println("La suma de la fila " + i + " es: " + sumafi[i]);
        }        

        int [] sumaco = m.sumaColumna(M);
        for (int j = 0; j < sumaco.length; j++)
        {
            System.out.println("La suma de la columna " + j + " es: " + sumaco[j]);
        } 

    } 
}
