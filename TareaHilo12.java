public abstract class TareaHilo12 implements Runnable{
    
    Avion avion;
    RegistroPendientes registroPendientes;
    
    public TareaHilo12(){
        
    }
    
    public void run(){
    
        while(!avion.getUnaButacaDisponible().equals(null)){
            Butaca butaca = avion.getUnaButacaDisponible();
            avion.butacaOcupada(butaca);
            registroPendientes.guardarButaca(butaca);
        }
    }
}