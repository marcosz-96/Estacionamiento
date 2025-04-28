public class LugarEstacionamiento {
    private int numero;
    private Vehiculos vehiculos;
    
    public LugarEstacionamiento(int numero){
        this.numero = numero;
        this.vehiculos = null;
    }
    
    public void estacionar(Vehiculos vehiculos){
        this.vehiculos = vehiculos;
    }
    
    public boolean isOcupado(){
        return vehiculos != null;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public Vehiculos getVehiculos(){
        return vehiculos;
    }
    
    public Vehiculos retiraVehiculo(){
        Vehiculos vehiculoRetirado = this.vehiculos;
        this.vehiculos.RegistrarSalida();
        this.vehiculos = null;
        return vehiculoRetirado;
    }
    
    @Override
    public String toString(){
        return "Lugar: [Numero: " + numero + ", Vehiculo: " + (vehiculos != null ? vehiculos: "Libre") + "]";
    }
}
