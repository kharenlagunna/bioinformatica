/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioinformatica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author cballen
 */
public class Lectura {

    boolean first = true;
    String cadenas[];
    String line = "";
    String sqcia1 = "";
    String sqcia2 = "";

    public String[] lectura(String rutaArchivo) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new File(rutaArchivo))) {
            while (sc.hasNextLine()) {
                line += sc.nextLine().trim();
            }
        }
        cadenas = line.substring(1).split(">");

        sqcia1 = cadenas[0];
        sqcia1 = sqcia1.substring(sqcia1.indexOf("1") + 1);
        sqcia2 = cadenas[1];
        sqcia2 = sqcia2.substring(sqcia2.indexOf("2") + 1);
        cadenas[0] = sqcia1;
        cadenas[1] = sqcia2;
        return cadenas;
    }
}
