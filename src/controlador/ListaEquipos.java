package controlador;
import modelo.*;
/**
 *
 * @author Escar
 */
public class ListaEquipos {
    int n=32;//numero de equipos base datos
    Equipo[] equipos= new Equipo [n]; 
   public void ListaEquipos(){
        for (int i=0;i<n;i++){
            this.equipos[i]=CreadorEquipos.crear(i);
        }
    }   

    public Equipo getEquipos(int i) {
        return equipos[i];
    }
   
}

