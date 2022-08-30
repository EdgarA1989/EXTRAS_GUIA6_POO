/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author EANDRADA
 */
public class Ahorcado {
    private  String [] palabra;
    private int jugadasmaximas;
    private int letrasencontradas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int jugadasmaximas, int letrasencontradas) {
        this.palabra = palabra;
        this.jugadasmaximas = jugadasmaximas;
        this.letrasencontradas = letrasencontradas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getJugadasmaximas() {
        return jugadasmaximas;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setJugadasmaximas(int jugadasmaximas) {
        this.jugadasmaximas = jugadasmaximas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

   
}
