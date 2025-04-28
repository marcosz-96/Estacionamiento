public class PropietarioVehiculo {
    private String nombre;
    private int numContacto;
    
    public PropietarioVehiculo(String nombre, int numContacto){
        this.nombre = nombre;
        this.numContacto = numContacto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int numContacto(){
        return numContacto;
    }
    
    @Override
    public String toString(){
        return "Dueño del vehiculo: [Nombre: " + nombre + ", Contacto: " + numContacto + "]";
    }
}
