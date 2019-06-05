/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioinformatica;

import java.io.FileNotFoundException;
import javax.swing.JTextField;

/**
 *
 * @author cballen
 */
public class BioInformatica {

    public String cadenas[] = null;
    public Lectura lectura = new Lectura();
    public Alineacion alineacion = new Alineacion();

    public BioInformatica(String rutaArchivo) throws FileNotFoundException {
        procesarArchivo(rutaArchivo);
    }

    private void procesarArchivo(String archivo) throws FileNotFoundException {
        try {
            cadenas = lectura.lectura(archivo);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print(e);
        }
        if (!cadenas[0].isEmpty() && !cadenas[1].isEmpty()) {
            alineacion.alineacion(cadenas[0], cadenas[1]);
        }
    }
}
