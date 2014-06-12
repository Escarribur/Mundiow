package controlador;

import modelo.*;

/**
 *
 * @author Escar
 * 
 *  CreadorPartidos sera el que se encargue de llamar desde los archivos a los equipos y jugadores
 */

public class CreadorEquipos {
    public static Equipo crear(int  wo){
        
        Equipo teams;
        
            String[][] holi=Leer.leer("texto"+wo);
            Jugador[] players=new Jugador[11];
            for(int i=1; i<12;i++){
               players[i-1]=new Jugador(holi[i][0],Integer.parseInt(holi[i][1]),Integer.parseInt(holi[i][2]),Integer.parseInt(holi[i][3]),Integer.parseInt(holi[i][4]),Integer.parseInt(holi[i][5]),Integer.parseInt(holi[i][6]),Integer.parseInt(holi[i][7]));
                
            }
            teams= new Equipo(holi[0][0]);
             for(int i=0;i<11; i++){
                teams.setJugadores(players[i], i);
            }
            
        
        
    
    return teams;//nombres pls 
    }
}
