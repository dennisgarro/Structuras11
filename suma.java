import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, result = 0;
        System.out.println("Por favor Ingrese n1");
        n1 = sc.nextInt();
        System.out.println("Ingrese el numero2");
        n2 = sc.nextInt();
        result = n1 + n2;
        System.out.println("la suma es: " + result);
    }
}
