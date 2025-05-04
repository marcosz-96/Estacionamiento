import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("<===Bienvenido al Programa Gestion de Vehiculos!===>");
        System.out.print("Ingrese la capacidad de la cochera: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine(); // Se utiliza siempre despues de ingresar un NUMERO
        
        Cochera cochera = new Cochera(capacidad);
        
        while(true){
            System.out.print("\n1: Ingresar vehiculo");
            System.out.print("2: Retirar vehiculos");
            System.out.print("3: Ver estado de la cochera");
            System.out.print("4: Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese la patente: ");
                    String patente = scanner.nextLine();
                    System.out.print("Ingrese el numero de contacto");
                    String numContacto = scanner.nextLine();
                    
                    // Cargamos los datos en la clase vehiculos con datos del propietario.
                    Vehiculos vehiculos = new Vehiculos(marca, modelo, patente, numContacto);
                    cochera.estacionaVehiculo(vehiculos);
                    break;
                case 2:
                    System.out.println("Ingrese la patente del vahiculo que se retira: ");
                    String salePatente = scanner.nextLine();
                    cochera.retiraVehiculo(salePatente);
                    break;
                case 3:
                    cochera.mostrarEstado();
                    break;
                case 4:
                    System.out.println("Ha salido del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Ingrese una opción del menú");
            }
        }
    }
}
