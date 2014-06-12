package mundial;

import controlador.*;
import modelo.*;
import vista.*;

/**
 * Integrates Nicolas Olivares, Joaquin Villagra, Luis Tapia
 * @author Escar
 */

public class Mundial 
{
    public static void main(String[] args) {
        
        //prueba
        ListaEquipos equipos=new ListaEquipos();
        equipos.ListaEquipos();
        Cancha prueba1=new Cancha();
        prueba1.setEquipos(equipos.getEquipos(0), 0);
        prueba1.setEquipos(equipos.getEquipos(1), 1);
        Pelota pelota= new Pelota();
        int termina[];
       termina=SimularPartido.simularPartido(prueba1, pelota, 9, 9);
        if(termina[0]!=2){
            System.out.println("El Equipo: "+prueba1.getEquipoX(termina[0]).getNombre()+" gano el partido con "+prueba1.getEquipoX(termina[0]).getGoles()+" gol y "+prueba1.getEquipoX(termina[1]).getNombre()+" "+prueba1.getEquipoX(termina[1]).getGoles()); //9 formacion inicial
        }else{
            System.out.println(" empate con "+prueba1.getEquipoX(0).getGoles());
        }
        
        //VerPos.ver(prueba1);
        
     
    }
          
}
