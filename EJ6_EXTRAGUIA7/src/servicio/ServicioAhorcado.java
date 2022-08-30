/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Ahorcado;
import entidad.Jugada;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);
    Ahorcado juego = new Ahorcado();
    Jugada jugada1 = new Jugada();

    public void crearJuego() {
        System.out.println("Ingrese la palabra del juego");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de posibilidades que tiene el jugador");
        juego.setJugadasmaximas(leer.nextInt());
        String[] arregloaux = new String[palabra.length()];
        String[] jugadaaux = new String[palabra.length()];
        for (int i = 0; i < arregloaux.length; i++) {
            arregloaux[i] = palabra.substring(i, i+1);
            jugadaaux[i] = "_ ";
        }
        juego.setPalabra(arregloaux);
        juego.setLetrasencontradas(0);
        jugada1.setJugada1(jugadaaux);
    }

    public void longitud() {
        System.out.println("La palabra que debemos buscar contiene: " + juego.getPalabra().length + "Letras");
    }

    public void buscarLetra() {
        System.out.println("Ingrese una letra");
        boolean condicion = false;
        String [] jugadaaux = jugada1.getJugada1();
        String letra = leer.next();
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (letra.equals(juego.getPalabra()[i])) {
                jugadaaux[i] = letra;
                condicion = true;
                juego.setLetrasencontradas(juego.getLetrasencontradas() + 1);
            }
        }
        jugada1.setJugada1(jugadaaux);
        if (condicion == false) {
            System.out.println("La letra ingreseda no se encuentra en la palabra");
            juego.setJugadasmaximas(juego.getJugadasmaximas() - 1);
        }
        System.out.println(Arrays.toString(jugada1.getJugada1()));
    }

    public void encontradas() {
        System.out.println("Han sido en contradas: " + juego.getLetrasencontradas() + " letras.");
        System.out.println("Faltan encontrar: " + (juego.getPalabra().length - juego.getLetrasencontradas()) + " letras.");
    }

    public void intentos() {
        System.out.println("Le quedan " + juego.getJugadasmaximas() + " intentos.");
    }

    public void juego() {
        int opcion=0;
        while (opcion != 5) {
            opcion = menu();
            switch (opcion) {
                
                case 1:
                    crearJuego();
                    break;
                case 2:
                    buscarLetra();
                    break;
                case 3:
                    encontradas();
                    break;
                case 4:
                    intentos();
                    break;
                 case 5:
                    System.out.println("FINALIZO EL PROGRAMA");
                    break;
                
            }
            if (Arrays.deepEquals(juego.getPalabra(), jugada1.getJugada1())){
                System.out.println("Felicidades encontraste la palabra");
                break;
            }
            if (juego.getJugadasmaximas()==0){
                System.out.println("GAME OVER se terminaron los intentos");
                break;
            }
        }
       
    }

    public int menu() {
        System.out.println("Bienvenido al juego Ahorcado");
        System.out.println("1-Crear Juego");
        System.out.println("2-Ingrese una letra");
        System.out.println("3-Ver letras ingresadas y faltantes");
        System.out.println("4-Ver cantidad de intentos que quedan");
        System.out.println("5-Salir");

        int opcion = leer.nextInt();
        return opcion;
    }
}
