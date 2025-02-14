public class p2 
{
    public void PosMayor(int d)
    {
        Metodos m = new Metodos();
        int[][] M = m.llenarMatriz(d);
        int []pos = m.PosicionMayor(M);
        m.MostratMatrizOriginal(M);
        System.out.println("La posicion del numero mayor es: [" + pos[0] + ", " + pos[1] + "]");
    }
}
