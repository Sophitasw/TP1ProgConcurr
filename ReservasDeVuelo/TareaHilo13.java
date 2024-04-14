public abstract class TareaHilo13 implements Runnable{
    
    Avion avion;
    RegistroPendientes registroPendientes;
    
    public TareaHilo13(){
        
    }
    
    public void run(){
        
        while(!avion.getUnaButacaDisponible().equals(null)){
            Butaca butaca = avion.getUnaButaca();
            while(butaca.getDisponible()){
                avion.butacaOcupada(butaca);
                registroPendientes.guardarButaca(butaca);
            }
        }
    }
}