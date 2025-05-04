public class Lugar {
    private int numero;
    private Disponibilidad estacionamiento;
    
    public Lugar(int numero){
        this.numero = numero;
        this.estacionamiento = new Disponibilidad();
    }
    
    public boolean isOcupado(){
        return !estacionamiento.isDisponible();
    }
    
    public int getNumero(){
        return numero;
    }
    
    public Vehiculos getVehiculos(){
        return estacionamiento.getVehiculo();
    }
    
    public void entraVehiculo(Vehiculos vehiculos){
        if(estacionamiento.isDisponible()){
            estacionamiento.usarLugar(vehiculos);
            System.out.println("Vehiculo estacionado en el lugar " + numero);
        }else{
            System.out.println("El lugar " + numero + "ya esta ocupado.");
        }
    }
    
    public Vehiculos saleVehiculo(){
        if(!estacionamiento.isDisponible()){
            Vehiculos retiraVehiculo = estacionamiento.getVehiculo();
            estacionamiento.liberarLugar();
            return saleVehiculo();
        }else{
            System.out.println("El lugar " + numero + "esta vacio.");
            return null;
        }
    }
    
    @Override
    public String toString(){
        return "Lugar " + numero + " - " + estacionamiento.toString();
    }
}
