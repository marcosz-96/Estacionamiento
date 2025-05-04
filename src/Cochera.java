class Cochera {
    private Lugar[] lugares;

    public Cochera(int capacidad) {
        lugares = new Lugar[capacidad];
        for (int i = 0; i < capacidad; i++) {
            lugares[i] = new Lugar(i + 1);
        }
    }

    public void estacionaVehiculo(Vehiculos vehiculos) {
        for (Lugar lugar : lugares) {
            if (!lugar.isOcupado()) {
                lugar.entraVehiculo(vehiculos);
                return;
            }
        }
        System.out.println("No hay lugares disponibles.");
    }

    public void retiraVehiculo(String patente) {
        for (Lugar lugar : lugares) {
            if (lugar.isOcupado() && lugar.getVehiculos().getPatente().equals(patente)) {
                Vehiculos vehiculoRetirado = lugar.saleVehiculo();
                System.out.println("Vehículo retirado: " + vehiculoRetirado);
                return;
            }
        }
        System.out.println("Vehículo no registrado.");
    }

    public void mostrarEstado() {
        for (Lugar lugar : lugares) {
            System.out.println(lugar);
        }
    }
}
