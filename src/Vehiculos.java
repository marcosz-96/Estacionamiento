import java.time.LocalDateTime;

public class Vehiculos {
    private String marca;
    private String modelo;
    private String patente;
    private PropietarioVehiculo propietario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    
    public Vehiculos (String marca, String modelo, String patente, PropietarioVehiculo propietario){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.propietario = propietario;
        this.horaEntrada = LocalDateTime.now(); 
    }
    
    public void RegistrarSalida(){
        this.horaSalida = LocalDateTime.now();
    }
    
    public LocalDateTime getHoraEntrada(){
        return horaEntrada;
    }
    
    public LocalDateTime getHoraSalida(){
        return horaSalida;
    }
    
    public String getPatente(){
        return patente;
    }
    @Override
    public String toString(){
        return "Vehiculo [Marca: " + marca + ", Modelo: " + modelo + ", Patente: " + patente + ", " + propietario + 
                ", Hoda de entrada: " + horaEntrada + " Hora de salida: " + horaSalida + "]";
    }
}
