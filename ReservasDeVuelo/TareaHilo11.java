public abstract class TareaHilo11 implements Runnable{
    
    Avion avion;
    RegistroPendientes registroPendientes;
    
    public TareaHilo11(){
    }
    
    public void run(){
        while(!avion.getUnaButacaDisponible().equals(null)){
            Butaca butaca = avion.getUnaButacaDisponible();
            avion.butacaOcupada(butaca);
            registroPendientes.guardarButaca(butaca);
        }
    }
}