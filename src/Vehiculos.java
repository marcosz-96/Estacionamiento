public class Vehiculos {
    private String marca;
    private String modelo;
    private int patente;
    
    public Vehiculos (String marca, String modelo, int patente){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    
    @Override
    public String toString(){
        return "Vehiculo [Maca: " + marca + ", Modelo: " + modelo + ", Patente: " + patente + "]";
    }
}
