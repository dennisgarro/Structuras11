public class metodos {
    public  int[][] llenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 200 + 1);
            }
        }
        return m;
    }

    public  void Mostrar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" " + m[i][j]);
            }
            System.out.println();

        }
    }

    public  obj[][] llenarMatriz(obj[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                obj o = new obj();
                o.setDato((int) (Math.random() * 200 + 1));
                m[i][j] = o;
            }
        }
        return m;
    }

    public  void Mostrar(obj[][] m) {
        System.out.println("vamos a mostrar la matriz Objetual");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" " + m[i][j].getDato());
            }
            System.out.println();

        }
    }
}
