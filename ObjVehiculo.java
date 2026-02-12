public class ObjVehiculo {
    private String Marca;
    private String Tipo;
    private int Cilindraje;
    private Double PagoAnt;
    private Double PagoAct;
    private int NCelda;
    
    public ObjVehiculo(String marca, String tipo, int cilindraje, Double pagoAnt, Double pagoAct, int nCelda) {
        Marca = marca;
        Tipo = tipo;
        Cilindraje = cilindraje;
        PagoAnt = pagoAnt;
        PagoAct = pagoAct;
        NCelda = nCelda;
    }
    
    public ObjVehiculo() {
    }

    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public Double getPagoAnt() {
        return PagoAnt;
    }
    public void setPagoAnt(Double pagoAnt) {
        PagoAnt = pagoAnt;
    }
    public Double getPagoAct() {
        return PagoAct;
    }
    public void setPagoAct(Double pagoAct) {
        PagoAct = pagoAct;
    }
    public int getNCelda() {
        return NCelda;
    }
    public void setNCelda(int nCelda) {
        NCelda = nCelda;
    }
    
}
