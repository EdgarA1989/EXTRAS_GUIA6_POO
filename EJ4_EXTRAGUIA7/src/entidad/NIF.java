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
public class NIF {
    private String letra;
    private Integer DNI;

    public NIF() {
    }

    public NIF(String letra, Integer DNI) {
        this.letra = letra;
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "NIF{" + "letra=" + letra + ", DNI=" + DNI + '}';
    }
    
    
}
