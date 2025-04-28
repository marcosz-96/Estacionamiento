import java.util.ArrayList;
import java.util.List;

public class Cochera {
    private List<LugarEstacionamiento> lugares;
    
    public Cochera(int capacidad){
        lugares = new ArrayList<>(capacidad);
        for (int i = 0; i < capacidad; i++){
            lugares.add(new LugarEstacionamiento(i + 1));
        }
    }
    
    public void estacionandoVehiculo(Vehiculos vehiculos){
        for (LugarEstacionamiento lugar : lugares){
            if(!lugar.isOcupado()){
                lugar.estacionar(vehiculos);
                System.out.println("Vehiculo estacionado en el lugar: " + lugar.getNumero());
                return;
            }
        }
        System.out.println("No hay lugares disponibles.");
    }
    
    public void mostrarEstadoEstacionamiento(){
        for (LugarEstacionamiento lugar : lugares){
            System.out.println(lugar);
        }
    }
}
