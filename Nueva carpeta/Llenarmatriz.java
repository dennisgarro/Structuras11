import java.util.Scanner;

public class Llenarmatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la dimension");
        int n = sc.nextInt();
        metodos Metodos = new metodos();
        int[][] m = new int[n][n];
        obj[][] Mo = new obj[n][n];
        m = Metodos.llenarMatriz(m);
        Metodos.Mostrar(m);
        System.out.println("vamos a mostrar la matriz objetual");
        Mo = Metodos.llenarMatriz(Mo);
        Metodos.Mostrar(Mo);

    }

    
}
