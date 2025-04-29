import java.util.ArrayList;
import java.util.List;

class Cochera {
    private LugarEstacionamiento[] lugares;

    public Cochera(int capacidad) {
        lugares = new LugarEstacionamiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            lugares[i] = new LugarEstacionamiento(i + 1);
        }
    }

    public void estacionarVehiculo(Vehiculos vehiculos) {
        for (LugarEstacionamiento lugar : lugares) {
            if (!lugar.isOcupado()) {
                lugar.estacionar(vehiculos);
                System.out.println("Vehículo estacionado en el lugar " + lugar.getNumero());
                return;
            }
        }
        System.out.println("No hay lugares disponibles.");
    }

    public void seRetiraVehiculo(String patente) {
        for (LugarEstacionamiento lugar : lugares) {
            if (lugar.isOcupado() && lugar.getVehiculos().getPatente().equals(patente)) {
                Vehiculos vehiculoRetirado = lugar.seRetiraVehiculo();
                System.out.println("Vehículo retirado: " + vehiculoRetirado);
                return;
            }
        }
        System.out.println("Vehículo no registrado.");
    }

    public void mostrarEstado() {
        for (LugarEstacionamiento lugar : lugares) {
            System.out.println(lugar);
        }
    }
}
