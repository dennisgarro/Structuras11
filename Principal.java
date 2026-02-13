import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimesion cuadrada de las celdas ");
        n = sc.nextInt();
        ObjVehiculo[][] M = new ObjVehiculo[n][n];
        Metodos c = new Metodos();
        M = c.LlenarMatriz(M);
        M = c.CalcularPetrico23(M);
        c.MostrarCeldas(M);
    }
}
