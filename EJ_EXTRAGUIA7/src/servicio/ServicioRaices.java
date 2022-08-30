/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Raices;

/**
 *
 * @author EANDRADA
 */
public class ServicioRaices {

    //Raices ecuacion;
    
    public double getDiscriminante(Raices ecuacion) {
      
        double discriminante = Math.pow(ecuacion.getB() , 2) - (4 * ecuacion.getA() * ecuacion.getC());
        return discriminante;
    }

    public boolean tieneRaices(double discriminante) {
        boolean condicion = false;
        if (discriminante >= 0) {
            condicion = true;
        }
        return condicion;
    }

    public boolean tieneRaiz(double discriminante) {
        boolean condicion = false;
        if (discriminante == 0) {
            condicion = true;
        }
        return condicion;
    }

    public void obtenerRaices(Raices ecuacion) {
        boolean condicion;
        double discriminante = getDiscriminante(ecuacion);
        condicion = tieneRaices(discriminante);
        if (condicion == true) {
            System.out.println((-ecuacion.getB())+(Math.sqrt(discriminante))/2);
            System.out.println((-ecuacion.getB())-(Math.sqrt(discriminante))/2);
        }
    }

    public void obtenerRaiz(Raices ecuacion) {
        boolean condicion;
        double discriminante = getDiscriminante(ecuacion);
        condicion = tieneRaiz(discriminante);
        if (condicion == true) {
            System.out.println(Math.sqrt(discriminante));
        }
    }

    public void calcular(Raices ecuacion) {
        double discriminante = getDiscriminante(ecuacion);
        boolean a = tieneRaices(discriminante);
        boolean b = tieneRaiz(discriminante);
        obtenerRaices(ecuacion);
        obtenerRaiz(ecuacion);
        if (a == false && b == false) {
            System.out.println("No existe solucion");
        }
    }
}
