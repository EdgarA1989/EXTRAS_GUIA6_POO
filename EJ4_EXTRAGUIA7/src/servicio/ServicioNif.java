/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class ServicioNif {

    Scanner leer = new Scanner(System.in);
    NIF persona = new NIF();

    public void crearNif() {
        System.out.println("Ingrese el numero de documento");
        persona.setDNI(leer.nextInt());
        String [] vector = llenarVector();
        int resto = persona.getDNI() % 23;
        persona.setLetra(vector[resto]);
        
    }

    public String[] llenarVector() {
        String[] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return vector;
    }
    

    public void mostrar(){
        System.out.println(persona.getDNI()+"-"+ persona.getLetra());
    }
}
