import java.util.ArrayList;
public class Avion
{
    Butaca butaca;
    ArrayList<Butaca> butacas;
    public Avion(){
        butacas = new ArrayList<Butaca>();
        for(Integer i = 0; i<100; i++){
            butacas.add(butaca = new Butaca(i+1));
        }
    }
    
    public void butacaOcupada(Butaca butaca){
        butaca.setOcupado();
    }
    
    public void butacaDescartada(Butaca butaca){
        butaca.setDescartado();
    }
    
    public void butacaCheckeada(Butaca butaca){
        butaca.setChecked();
    }
    
    /*
    public Butaca getUnaButaca(){
        return butacas.get();
    }
    */
   
    public Butaca getUnaButacaDisponible(){
        for(Butaca butaca : butacas){
            if(verificarDisponible(butaca)){
                return butaca;
            }
        }
        return null;
    }
    
    public Boolean verificarDisponible(Butaca butaca){
        return butaca.getDisponible();
    }
    
    public Butaca getUnaButacaOcupada(){
        for(Butaca butaca : butacas){
            if(verificarOcupado(butaca)){
                return butaca;
            }
        }
        return null;
    }
    
    public Boolean verificarOcupado(Butaca butaca){
        return butaca.getOcupado();
    }
    
    public Butaca getUnaButacaChecked(){
        for(Butaca butaca : butacas){
            if(verificarChecked(butaca)){
                return butaca;
            }
        }
        return null;
    }
    
    public Boolean verificarChecked(Butaca butaca){
        return butaca.getChecked();
    }
}