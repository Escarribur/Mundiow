package modelo;

/**
 *
 * @author Escar
 */
public class Grupo {
    String letra;
    Equipo [] equipos=new Equipo[4];
    Equipo equipoGanador1, equipoGanador2;

    public Grupo(String letra) {
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Equipo getEquipos(int i) {
        return equipos[i];
    }

    public void setEquipos(Equipo equipo, int i) {
        this.equipos[i] = equipo;
    }

    public Equipo getEquipoGanador1() {
        return equipoGanador1;
    }

    public void setEquipoGanador1(Equipo equipoGanador1) {
        this.equipoGanador1 = equipoGanador1;
    }

    public Equipo getEquipoGanador2() {
        return equipoGanador2;
    }

    public void setEquipoGanador2(Equipo equipoGanador2) {
        this.equipoGanador2 = equipoGanador2;
    }
    
    
}
