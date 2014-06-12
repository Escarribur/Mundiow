
package controlador;
import modelo.*;
/**
 *
 * @author Escar
 */
public class SimularFaseGrupos {
    public static void simular(FaseGrupos fase){
        for (int i=0;i<8;i++){
            for(int j=1; j<4;j++){ // partidos equipo 0 sin repetir
                Cancha partido1= new Cancha();
                Pelota pelota1= new Pelota();
                partido1.setEquipos(fase.getGrupos(i).getEquipos(0), 0);
                partido1.setEquipos(fase.getGrupos(i).getEquipos(j), 1);
                //setear formacion en algun momento
                SimularPartido.simularPartido(partido1, pelota1, fase.getGrupos(i).getEquipos(0).getFormacion(), fase.getGrupos(i).getEquipos(j).getFormacion());
            }
            for(int j=2;j<4;j++){ // partidos equipo 1 sin repetir
                Cancha partido1= new Cancha();
                Pelota pelota1= new Pelota();
                partido1.setEquipos(fase.getGrupos(i).getEquipos(1), 0);
                partido1.setEquipos(fase.getGrupos(i).getEquipos(j), 1);
                //setear formacion en algun momento
                SimularPartido.simularPartido(partido1, pelota1, fase.getGrupos(i).getEquipos(1).getFormacion(), fase.getGrupos(i).getEquipos(j).getFormacion());
            }
            for(int j=3;j<4;j++){ // partidos equipo 2 y 3 sin repetir (for de bonito :B)
                Cancha partido1= new Cancha();
                Pelota pelota1= new Pelota();
                partido1.setEquipos(fase.getGrupos(i).getEquipos(2), 0);
                partido1.setEquipos(fase.getGrupos(i).getEquipos(j), 1);
                //setear formacion en algun momento
                SimularPartido.simularPartido(partido1, pelota1, fase.getGrupos(i).getEquipos(2).getFormacion(), fase.getGrupos(i).getEquipos(j).getFormacion());
            
            }
            
            //setear equipos ganadores falta
        }
    }
}
