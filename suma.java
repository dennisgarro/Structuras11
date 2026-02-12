import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, result = 0;
        System.out.println("Por favor Ingrese el numero 1 que desea ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el numero 2 que desea ");
        n2 = sc.nextInt();
        result = n1 + n2;
        System.out.println("la suma de los dos numeros es: " + result);
    }
}
