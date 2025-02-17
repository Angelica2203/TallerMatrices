public class p7 
{
    public void punto7 (int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatrizManual(d);
        m.MostratMatrizOriginal(M);
        int pos = 0, neg = 0, cero = 0;
        for (int i = 0; i < M.length; i++) 
        {
            for (int j = 0; j < M.length; j++) 
            {
                if(M[i][j] > 0)
                    pos++;
                else if(M[i][j] < 0)
                    neg++;
                else
                    cero++;
                
            }  
        }
        System.out.println("Cantidad de numeros positivos: " + pos);
        System.out.println("Cantidad de numeros negativos: " + neg);
        System.out.println("Cantidad de numeros que son cero: " + cero);

    }
    
    
}
