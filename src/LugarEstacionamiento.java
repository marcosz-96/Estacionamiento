public class LugarEstacionamiento {
    private int numero;
    private Vehiculos vehiculos;
    
    public LugarEstacionamiento(int numero){
        this.numero = numero;
        this.vehiculos = null;
    }
    
    public void estacionar(Vehiculos vehiculos){
        this.vehiculos = vehiculos;
    }
    
    public boolean isOcupado(){
        return vehiculos != null;
    }
    
    public int getNumero(){
        return numero;
    }
    
    @Override
    public String toString(){
        return "Lugar: " + numero + (isOcupado() ? " - Ocupado: " + vehiculos : " - Libre");
    }
}
