public class p9 
{
    public void punto9(int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatriz(d);
        m.MostratMatrizOriginal(M);
        int my = m.mayorMatriz(M);//Punto a
        int mn = m.menorMatriz(M);//punto b
        int []posMy = m.PosicionMayor(M);
        int []posMn = m.PosicionMenor(M);
        System.out.println("El numero mayor de la matriz es: " + my + ", en la posicion: [" + posMy[0] + ", " + posMy[1] + "]");
        System.out.println("El numero menor de la matriz es: " + mn + ", en la posicion: [" + posMn[0] + ", " + posMn[1] + "]");
        //Punto c
        System.out.println("Numeros de la columna donde se encuentra el mayor valor:");
        for (int i = 0; i < d; i++) 
        {
            System.out.println(" - " + M[i][posMy[1]]);
        }
        //Punto d
        System.out.println("Numeros de la fila donde se encuentra el maximo valor:");
        for (int j = 0; j < posMn.length; j++) 
        {
            System.out.print( " - " + M[posMy[0]][j]);
        }
    }
    
}
