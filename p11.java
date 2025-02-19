import java.util.Scanner;

public class p11 
{
    public void punto11()
    {
        Metodos m = new Metodos();
        double[][] M = m.LlenarMatrizParalelo();
        m.mostrarMatrizParalelo(M);
        double[] prome = m.promediofila(M);//punto a
        for (int i = 0; i < prome.length; i++) 
        {
            System.out.println("El promedio de la persona " + (i + 1) + " es de: " + prome[i]);
        }
        //punto b
        Scanner sc = new Scanner(System.in);
        int f = 0;
        System.out.println("Ingrese en cual nota quiere ver que estudiante tuvo la mayor calificacion:  ");
        f = sc.nextInt();
        double maxNot = M[0][f -1];
        for (int i = 0; i < M.length; i++) 
        {
            if (M[i][f - 1] > maxNot) 
                maxNot = M[i][f - 1];

        }
        //System.out.println("La mayor calificación en la nota " + f + " es: " + maxNot);
        System.out.println("Estudiantes con la mayor calificación en la nota " + f + " son: " );
        for (int i = 0; i < M[0].length; i++) 
        {
            if (M[i][f - 1] == maxNot) 
            {
                System.out.println("Estudiante # " + (i + 1));
            }
        }
        //punto d
        double my = prome[0];
        for (int i = 0; i < prome.length; i++) 
        {
            if (prome[i] > my)
                my = prome[i];
            
        }
        System.out.println("El promedio mayor es: " + my);
    }
    
}
