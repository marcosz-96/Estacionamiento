import java.time.LocalDateTime;
import java.util.Scanner;

public class Vehiculos {
    private String marca;
    private String modelo;
    private String patente;
    private String numContacto;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    
    public Vehiculos (String marca, String modelo, String patente, String numContacto){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.numContacto = numContacto;
        this.horaEntrada = LocalDateTime.now(); 
    }
    
    public void registrarSalida(){
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
    
    public String getNumContacto(){
        return numContacto;
    }
    @Override
    public String toString(){
        return "Vehiculo [Marca: " + marca + ", Modelo: " + modelo + ", Patente: " + patente +
                ", Contacto: " + numContacto +
                ", Hoda de entrada: " + horaEntrada + " Hora de salida: " + horaSalida + "]";
    }
}
