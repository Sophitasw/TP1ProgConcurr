import java.util.ArrayList;
/**
 * La clase RegistroPendientes representa la clase registro
 * 
 */
public class RegistroPendientes{
    
    ArrayList<Butaca> butacas;
    
    public RegistroPendientes(){
        butacas = new ArrayList<>();
    }
    
    public void guardarButaca(Butaca butaca){
        butacas.add(butaca);
    }
}
