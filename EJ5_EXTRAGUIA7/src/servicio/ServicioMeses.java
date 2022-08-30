/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class ServicioMeses {

    Meses arreglo = new Meses();
    Scanner leer = new Scanner(System.in);

    public void llenarArreglo() {
        String[] arregloaux = new String [arreglo.getCalendario().length];
        for (int i = 0; i < arreglo.getCalendario().length; i++) {
            switch (i) {
                case 0:
                    arregloaux[i] = "enero";
                    break;
                case 1:
                    arregloaux[i] = "febrero";
                    break;
                case 2:
                    arregloaux[i] = "marzo";
                    break;
                case 3:
                    arregloaux[i] = "abril";
                    break;
                case 4:
                    arregloaux[i] = "mayo";
                    break;
                case 5:
                    arregloaux[i] = "junio";
                    break;
                case 6:
                    arregloaux[i] = "julio";
                    break;
                case 7:
                    arregloaux[i] = "agosto";
                    break;
                case 8:
                    arregloaux[i] = "septiembre";
                    break;
                case 9:
                    arregloaux[i] = "octubre";
                    break;
                case 10:
                    arregloaux[i] = "noviembre";
                    break;
                case 11:
                    arregloaux[i] = "diciembre";
                    break;

            }
        }
        arreglo.setCalendario(arregloaux);
    }

    public void mesSecreto() {
        arreglo.setMessecreto(arreglo.getCalendario()[(int) (Math.random()*11)]);
    }

    public void juego() {
        String respuesta;
        System.out.println("BIENVENIDO AL JUEGOOOOOO");
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        respuesta = leer.next();
        while (!respuesta.equals(arreglo.getMessecreto())) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            respuesta = leer.next();
        }
        System.out.println("FELICIDADES HA ACERTADO!!!!!!");
    }
}
