public class Disponibilidad {
    private Vehiculos vehiculos;
    private boolean disponible;
    
    public Disponibilidad(){
        this.vehiculos = null;
        this.disponible = false;
    }
    
    public boolean isDisponible(){
        return !disponible;
    }
    
    public void usarLugar(Vehiculos vehiculos){
        this.vehiculos = vehiculos;
        this.disponible = true;
    }
    
    public void liberarLugar(){
        if(vehiculos != null){
            vehiculos.registrarSalida();
        }
        this.vehiculos = null;
        this.disponible = false;
    }
    
    public Vehiculos getVehiculo(){
        return vehiculos;
    }
    
    @Override
    public String toString(){
        if(disponible){
            return "Lugar utilizado por: " + vehiculos.toString();
        }else{
            return "Lugar disponible";
        }
    }
}
