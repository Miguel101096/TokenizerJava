/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturatarjeta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class SeleccionarNumCuenta {

    public String numCuentaCedula() {
        StringTokenizer tokens;
        String numero_cedula = "";
        String numero_cuenta = "";
        String nombre = "";

        try {

            FileReader fr = new FileReader("dataTarjeta.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;

            while ((cadena = br.readLine()) != null) {
                tokens = new StringTokenizer(cadena, "++");
                while (tokens.hasMoreElements()) {
                    numero_cedula = tokens.nextToken();
                    numero_cuenta = tokens.nextToken();
                    nombre = tokens.nextToken();
                    String cedula = "1111111";
                    String nombreUSER = "Miguel";
                    if (cedula.equals(numero_cedula)) {
                        System.out.println(cedula + " + " + numero_cuenta);
                    }
                    System.out.println("\n" + numero_cedula);
                    System.out.println("\n" + numero_cuenta);
                    System.out.println("\n" + nombre);

                }
            }

        } catch (Exception e) {
        }
        return numero_cuenta;

    }

    public String numCuentaNombre() {
        StringTokenizer tokens;
        String numero_cedula = "";
        String numero_cuenta = "";
        String nombre = "";

        try {

            FileReader fr = new FileReader("dataTarjeta.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;

            while ((cadena = br.readLine()) != null) {
                tokens = new StringTokenizer(cadena, "++");
                while (tokens.hasMoreElements()) {
                    numero_cedula = tokens.nextToken();
                    numero_cuenta = tokens.nextToken();
                    nombre = tokens.nextToken();
                    String cedula = "1111111";
                    String nombreUSER = "Miguel";
                    if (nombre.equals(nombreUSER)) {
                        System.out.println(nombre + " + " + numero_cuenta);
                    }
                    System.out.println("\n" + numero_cedula);
                    System.out.println("\n" + numero_cuenta);
                    System.out.println("\n" + nombre);

                }
            }

        } catch (Exception e) {
        }
        return numero_cuenta;
    }

}
