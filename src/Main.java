import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la capacidad del estacionamiento: ");
        int capacidad = scanner.nextInt();
        
        Cochera cochera = new Cochera(capacidad);
        
        while(true){
            System.out.println("\n1: Ingresa vehiculo");
            System.out.println("2: Ver disponibilidad del estacionamiento");
            System.out.println("3: Salir");
            System.out.println("Seleccione una opcion");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese la patente: ");
                    int patente = scanner.nextInt();
                    
                    Vehiculos vehiculos = new Vehiculos(marca, modelo, patente);
                    cochera.estacionandoVehiculo(vehiculos);
                    break;
                case 2:
                    cochera.mostrarEstadoEstacionamiento();
                    break;
                case 3:
                    System.out.println("Ha salido del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Ingrese una opción del menú");
            }
        }
    }
}
