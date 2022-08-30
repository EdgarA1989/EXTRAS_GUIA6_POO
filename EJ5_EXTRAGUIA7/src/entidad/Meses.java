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
public class Meses {

    private String[] calendario = new String[12];
    private String messecreto;

    public Meses() {
    }

    public Meses(String[] calendario, String messecreto) {
        this.calendario = calendario;
        this.messecreto = messecreto;
    }

    public String[] getCalendario() {
        return calendario;
    }

    public String getMessecreto() {
        return messecreto;
    }

    public void setCalendario(String[] calendario) {
        this.calendario = calendario;
    }

    public void setMessecreto(String messecreto) {
        this.messecreto = messecreto;
    }

}
