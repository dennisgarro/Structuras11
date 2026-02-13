import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjVehiculo[][] LlenarMatriz(ObjVehiculo[][] M) {
        int ncelda = 1;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                ObjVehiculo o = new ObjVehiculo();
                System.out.println("Ingrese la marca del vehiculo");
                o.setMarca(sc.next());
                System.out.println("Ingrese el tipo vehiculo");
                o.setTipo(sc.next());
                System.out.println("Ingrese el cilindraje ");
                o.setCilindraje(sc.nextInt());
                if (o.getCilindraje() > 1000 && o.getCilindraje() < 1600) {
                    o.setPagoAnt(150.000);
                } else if (o.getCilindraje() >= 1600 && o.getCilindraje() < 2000) {
                    o.setPagoAnt(200.000);
                } else {
                    o.setPagoAnt(250.000);
                }
                o.setNCelda(ncelda);
                ncelda++;
                M[i][j] = o;
            }
        }

        return M;
    }

    public ObjVehiculo[][] CalcularPetrico23(ObjVehiculo[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j].setPagoAct(M[i][j].getPagoAnt() * 1.23);
            }
        }
        return M;
    }

    public void MostrarCeldas(ObjVehiculo[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.println("Marca: " + M[i][j].getMarca());
                System.out.println("Tipo: " + M[i][j].getTipo());
                System.out.println("Cilindraje: " + M[i][j].getCilindraje());
                System.out.println("Pago Anterior: " + M[i][j].getPagoAnt());
                System.out.println("Pago Actual: " + M[i][j].getPagoAct());
                System.out.println("Numero Celda: " + M[i][j].getNCelda());
                System.out.println("-------------------------------------------");

            }
        }
    }
}
