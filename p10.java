import java.util.Scanner;
public class p10 
{    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la dimensión de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Declarar las matrices
        String[][] matriz = new String[n][n];
        int[][] matrizDigitos = new int[n][n];

        // Llenar la matriz y contar los dígitos en cada posición
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextLine();
                matrizDigitos[i][j] = 0; // Inicializar el contador de dígitos
                
                // Contar los dígitos sin usar char
                String valor = matriz[i][j];
                int longitud = valor.length();
                for (int k = 0; k < longitud; k++) {
                    if (valor.substring(k, k + 1).matches("[0-9]")) { 
                        matrizDigitos[i][j]++;
                    }
                }
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar la matriz de cantidad de dígitos
        System.out.println("\nMatriz de Cantidad de Dígitos:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizDigitos[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
    

