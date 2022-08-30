/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_extraguia7;

import entidad.Meses;
import java.util.Scanner;
import servicio.ServicioMeses;

/**
 *
 * @author EANDRADA
 */
public class EJ5_EXTRAGUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMeses serviciomeses = new ServicioMeses();
        serviciomeses.llenarArreglo();
        serviciomeses.mesSecreto();

        serviciomeses.juego();

    }

}
