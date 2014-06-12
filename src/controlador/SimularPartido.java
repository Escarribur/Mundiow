/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import modelo.*;
import java.lang.Math;
        
/**
 *
 * @author Escar
 */
public class SimularPartido {
    public static int[]  simularPartido(Cancha cancha, Pelota pelota, int formacionA, int formacionB){
        int[] equipoGanador= new int[2]; 
        int comienza=(int)(Math.random()*2+1); //1 o 2
        //Primer tiempo
        if (comienza==1){
            cancha.getEquipoX(0).getJugadorX(0).setTieneBalon(true);
            cancha.getEquipoX(0).setAtacante();
            cancha.getEquipoX(0).setLocal(true);
            cancha.getEquipoX(1).setLocal(false);
        }else{
            cancha.getEquipoX(1).getJugadorX(0).setTieneBalon(true);
            cancha.getEquipoX(1).setAtacante();
            cancha.getEquipoX(1).setLocal(true);
            cancha.getEquipoX(0).setLocal(false);

        }
        
        cancha.getEquipoX(0).setFormacion(formacionA);
        cancha.getEquipoX(1).setFormacion(formacionB);
        AsignarPosiciones.asigPos(cancha,0,1,formacionA,formacionB,cancha.getEquipoX(0).isLocal(), cancha.getEquipoX(1).isLocal() ); // posiciones iniciales 
       
       if (comienza==1){
            pelota= new Pelota(cancha.getEquipoX(0).getJugadorX(0).getPosX(),cancha.getEquipoX(0).getJugadorX(0).getPosY(),true);
       }else{
            pelota= new Pelota(cancha.getEquipoX(1).getJugadorX(0).getPosX(),cancha.getEquipoX(1).getJugadorX(0).getPosY(),true);    
                
        }
        for(int i=0;i<45;i++){
            //System.out.println("TURNO "+i);
            AsignarOp.asignar(cancha);
            SimularTurno.turno(cancha, pelota);
            
        }
        
        
        //SegundoTiempo tiempo
        if (comienza!=1){
            cancha.getEquipoX(0).getJugadorX(0).setTieneBalon(true);
            cancha.getEquipoX(0).setAtacante();
            cancha.getEquipoX(0).setLocal(true);
            cancha.getEquipoX(1).setLocal(false);
        }else{
            cancha.getEquipoX(1).getJugadorX(0).setTieneBalon(true);
            cancha.getEquipoX(1).setAtacante();
            cancha.getEquipoX(1).setLocal(true);
            cancha.getEquipoX(0).setLocal(false);

        }
        
        cancha.getEquipoX(0).setFormacion(formacionA);
        cancha.getEquipoX(1).setFormacion(formacionB);
        AsignarPosiciones.asigPos(cancha,0,1,formacionA,formacionB,cancha.getEquipoX(0).isLocal(), cancha.getEquipoX(1).isLocal() ); // posiciones iniciales 
       if (comienza!=1){
            pelota= new Pelota(cancha.getEquipoX(0).getJugadorX(0).getPosX(),cancha.getEquipoX(0).getJugadorX(0).getPosY(),true);
       }else{
            pelota= new Pelota(cancha.getEquipoX(1).getJugadorX(0).getPosX(),cancha.getEquipoX(1).getJugadorX(0).getPosY(),true);    
                
        }
        for(int i=45;i<400;i++){
            //System.out.println("TURNO "+i);
            AsignarOp.asignar(cancha);
            SimularTurno.turno(cancha, pelota);
            
        }
        
        
        if(cancha.getEquipoX(0).getGoles()>cancha.getEquipoX(1).getGoles()){
            equipoGanador[0]=0;
            equipoGanador[1]=1;
            cancha.getEquipoX(0).setPuntos(cancha.getEquipoX(0).getPuntos()+3);
        }else{
            if(cancha.getEquipoX(1).getGoles()>cancha.getEquipoX(0).getGoles()){
                 equipoGanador[0]=1;
                 equipoGanador[1]=0;
                         
                         
                 cancha.getEquipoX(1).setPuntos(cancha.getEquipoX(1).getPuntos()+3);
            }else{
                equipoGanador[0]=2;
                cancha.getEquipoX(0).setPuntos(cancha.getEquipoX(0).getPuntos()+1);
                cancha.getEquipoX(1).setPuntos(cancha.getEquipoX(1).getPuntos()+1);
            }
        }
        return equipoGanador;
    }
}
