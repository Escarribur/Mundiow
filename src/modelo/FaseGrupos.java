/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Escar
 */
public class FaseGrupos {
    Grupo[] grupos=new Grupo[8];
    Equipo[] ganadores=new Equipo[16];
    
    public FaseGrupos(Grupo uno,Grupo dos,Grupo tres,Grupo cuatro,Grupo cinco, Grupo seis, Grupo siete, Grupo ocho) {
        grupos[0]=uno;
        grupos[1]=dos;
        grupos[2]=tres;
        grupos[3]=cuatro;
        grupos[4]=cinco;
        grupos[5]=seis;
        grupos[6]=siete;
        grupos[7]=ocho;
    }

    public Grupo getGrupos(int i) {
        return grupos[i];
    }

    public void setGrupos(Grupo grupos, int i) {
        this.grupos[i] = grupos;
    }

    public Equipo getGanadores(int i) {
        return ganadores[i];
    }

    public void setGanadores(Equipo ganadores, int i) {
        this.ganadores[i] = ganadores;
    }
    
    public void setGanadorAuto(){ // usar cuando esten listo todos los grupos
        this.ganadores[0]=grupos[0].getEquipoGanador1();
        this.ganadores[1]=grupos[0].getEquipoGanador2();
        this.ganadores[2]=grupos[1].getEquipoGanador1();
        this.ganadores[3]=grupos[1].getEquipoGanador2();
        this.ganadores[4]=grupos[2].getEquipoGanador1();
        this.ganadores[5]=grupos[2].getEquipoGanador2();
        this.ganadores[6]=grupos[3].getEquipoGanador1();
        this.ganadores[7]=grupos[3].getEquipoGanador2();
        this.ganadores[8]=grupos[4].getEquipoGanador1();
        this.ganadores[9]=grupos[4].getEquipoGanador2();
        this.ganadores[10]=grupos[5].getEquipoGanador1();
        this.ganadores[11]=grupos[5].getEquipoGanador2();
        this.ganadores[12]=grupos[6].getEquipoGanador1();
        this.ganadores[13]=grupos[6].getEquipoGanador2();
        this.ganadores[14]=grupos[7].getEquipoGanador1();
        this.ganadores[15]=grupos[7].getEquipoGanador2();
    }
    
    
    
    
    
}
