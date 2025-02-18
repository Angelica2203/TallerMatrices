import java.util.Scanner;

public class Principal //Menu
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        System.out.println("Ingrese el punto que requiere visualizar del 1 al 11: ");
        opt = sc.nextInt();
        Metodos m = new Metodos();//utiliza los metodos de esa clase 
        int d = m.SolicitarDimension();
        switch (opt) 
        {
            case 1:
                p1 punto1 = new p1();
                punto1.sumarMatriz(d);
                break;
            case 2:
                p2 punto2 = new p2();
                punto2.PosMayor(d);
                break;
            case 3:
                p3 punto3 = new p3();
                punto3.sumasFilasYColumnas(d);
                break;
            case 4:
                p4 punto4 = new p4();
                punto4.NumMayEIndi(d);
                break;
            case 5:
                p5 punto5 = new p5();
                punto5.vector(d);
                break;
            case 6:
                p6 punto6 = new p6();
                punto6.ColumFilaVector(d);
                break;
            case 7:
                p7 punto7 = new p7();
                punto7.punto7(d);
                break;
            case 8:
                p8 punto8 = new p8();
                punto8.punto8(d);
                break;
            case 9:
                p9 punto9 = new p9();
                punto9.punto9(d);
                break;
            case 11:
                p11 punto11 = new p11();
                punto11.punto11();
                break;
            
        
            default:
                System.out.println("Pagina en mantenimiento :)");
                break;
        }
        
    }
    
}

