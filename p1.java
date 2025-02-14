public class p1 
{
    public void sumarMatriz(int n)
    {
        Metodos m = new Metodos();
        int[][] ma = m.llenarMatriz(n);
        int suma = m.sumaMatriz(ma);
        System.out.println("La suma de la matriz es: " + suma);
    }
}
