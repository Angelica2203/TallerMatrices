import java.util.Scanner;

public class Metodos 
{
    public int[][] llenarMatriz( int d )
    {
        int[][] matriz = new int[d][d];
        for( int i = 0; i < matriz.length; i ++)
        {
            for( int j = 0; j < matriz.length; j ++)
            {
                matriz[i][j] = (int) (Math.random() * 500 + 1);
            }

        }
        return matriz;
    }
    public int sumaMatriz( int ma[][])
    {
        int acum = 0;
        for( int i = 0; i < ma.length; i ++)
        {
            for( int j = 0; j < ma.length; j ++)
            {
                acum += ma[i][j];
            }
        }
        return acum;
    }
    public int SolicitarDimension()
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz: ");
        n = sc.nextInt();
        return n;
    }

    public void MostratMatrizOriginal(int [][]m)
    {
        for( int i = 0; i < m.length; i ++)
        {
            for( int j = 0; j < m.length; j ++)
            {
                System.out.print(" - " + m[i][j]);
            }
            System.out.println();
        }
    }
    public int [] PosicionMayor (int [][]m)
    {
        int my = m[0][0];
        int []pos = new int[2];
        for( int i = 0; i < m.length; i ++)
        {
            for( int j = 0; j < m.length; j ++)
            {
                if (m[i][j] > my) 
                {
                    my = m[i][j];
                    pos[0] = i;
                    pos[1] = j;   
                }
            }
        }
        return pos;
    }
    public int [] PosicionMenor (int [][]m)
    {
        int mn = m[0][0];
        int []pos = new int[2];
        for( int i = 0; i < m.length; i ++)
        {
            for( int j = 0; j < m.length; j ++)
            {
                if (m[i][j] < mn) 
                {
                    mn = m[i][j];
                    pos[0] = i;
                    pos[1] = j;   
                }
            }
        }
        return pos;
    }
    public int[] sumafila( int [][]m)
    {
        int [] suma = new int[m.length];
        for( int i = 0; i < m.length; i++)
        {
            int acum = 0;
            for(int j = 0; j < m.length; j++)
            {
                acum += m[i][j];
            }
            suma[i] = acum;
        }
        return suma;
    }
    public int[] sumaColumna( int [][]m)
    {
        int [] suma = new int[m.length];
        for( int j = 0; j < m.length; j++)
        {
            int acum = 0;
            for(int i = 0; i < m.length; i++)
            {
                acum += m[i][j];
            }
            suma[j] = acum;
        }
        return suma;
    }
    public int[][] llenarMatrizManual( int d )
    {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[d][d];
        for( int i = 0; i < matriz.length; i ++)
        {
            for( int j = 0; j < matriz.length; j ++)
            {
                System.out.println("Ingrese el numero: ");
                matriz[i][j] = sc.nextInt();
            }

        }
        return matriz;
    }
    public int mayorMatriz (int [][]m)
    {
        int my = m[0][0];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            { 
                if(m[i][j] > my)
                    my = m[i][j];                
            } 
        }
        return my;
    }
    public int menorMatriz (int [][]m)
    {
        int mn = m[0][0];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            { 
                if(m[i][j] < mn)
                    mn = m[i][j];                
            } 
        }
        return mn;
    }


}
