/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioinformatica;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author cballen
 */
public class Alineacion {
    
    private int[][] matrizPuntaje = {{10, -1, -3, -4}, {-1, 7, -5, -3}, {-3, -5, 9, 0}, {-4, -3, 0, 8}};
    
    private ArrayList<String> scrore = new ArrayList<>();
    private ArrayList<String> secuencia1 = new ArrayList<>();
    private ArrayList<String> secuencia2 = new ArrayList<>();
    private String[][] matrizPrincipal;
    int hueco = -5;
    int scroreTotal = 0;
    
    public Alineacion() {
        scrore.add("A");
        scrore.add("G");
        scrore.add("C");
        scrore.add("T");
    }
    
    public String alineacion(String secuencia1, String secuencia2) {
        int filas = secuencia1.length() + 2; // se suma una posicion para ajustarla en la matriz
        int columnas = secuencia2.length() + 2;
        int contador = 0, contador1 = 0;
        
        matrizPrincipal = new String[filas][columnas];

        //Acomodar las cadenas en la matriz  
        for (int i = 2; i < filas; i++) {
            matrizPrincipal[i][0] = String.valueOf(secuencia1.toCharArray()[i - 2]);
        }
        
        for (int j = 2; j < columnas; j++) {
            matrizPrincipal[0][j] = String.valueOf(secuencia2.toCharArray()[j - 2]);
        }

        // Acomodar los valores de -5
        for (int i = 2; i < filas; i++) {
            contador = contador - 5;
            matrizPrincipal[i][1] = String.valueOf(contador);
        }
        
        for (int j = 2; j < columnas; j++) {
            contador1 = contador1 - 5;
            matrizPrincipal[1][j] = String.valueOf(contador1);
        }
        
        String matriz[][] = movimientos(matrizPrincipal, filas, columnas);
        construirCamino(matriz, columnas, filas); // Retroceso
        return mostrar(matriz, columnas, filas);
        
    }
    
    public String[][] movimientos(String[][] matrizPrincipal, int filas, int columnas) {
        
        String fila;
        String columna;
        
        for (int i = 0; i < filas; i++) {
            fila = matrizPrincipal[i][0];
            for (int j = 0; j < columnas; j++) {
                Integer diag, izq, arriba, mayor;
                columna = matrizPrincipal[0][j];
                
                if (fila != null && columna != null) {
                    try {
                        diag = Integer.parseInt(matrizPrincipal[i - 1][j - 1]);
                    } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                        diag = 0;
                    }
                    diag = diag + matrizPuntaje[scrore.indexOf(fila)][scrore.indexOf(columna)];
                    izq = Integer.parseInt(matrizPrincipal[i][j - 1]) + hueco;
                    arriba = Integer.parseInt(matrizPrincipal[i - 1][j]) + hueco;
                    mayor = numeroMayor(izq, arriba, diag);
                    matrizPrincipal[i][j] = mayor.toString();
                }
            }
        }
        return matrizPrincipal;
    }
    
    public void construirCamino(String[][] matriz, int columnas, int filas) {
        
        Integer ScoreDiag = 0, ScoreUp = 0, ScoreLeft = 0, Score, S;
        int i = columnas, j = filas;
        
        String caracterFila, caracterColum;
        
        while (i > 2 && j > 2) {

            ScoreDiag = (matriz[j - 2][i - 2]) == null ? 0 : Integer.parseInt((matriz[j - 2][i - 2]));        
            Score = Integer.parseInt(matriz[j - 1][i - 1]);
            ScoreUp = Integer.parseInt(matriz[j - 1][i - 2]);
            ScoreLeft = Integer.parseInt(matriz[j - 2][i - 1]);
//            System.out.println("Diag "+ScoreDiag+" Up "+ScoreUp+" Left "+ScoreLeft );
            caracterColum = matrizPrincipal[j - 1][0];
            caracterFila = matrizPrincipal[0][i - 1];
            S = matrizPuntaje[scrore.indexOf(caracterColum)][scrore.indexOf(caracterFila)];
//            System.out.println("Scrore " + Score + " ScroreDiag " + (ScoreDiag + S));
            if (Score.equals(ScoreDiag + S)) {
                secuencia1.add(matrizPrincipal[j - 1][0]);
                secuencia2.add(matrizPrincipal[0][i - 1]);
                scroreTotal += S;
                i = i - 1;
                j = j - 1;
                
            } else if (Score.equals(ScoreLeft + hueco)) {
                secuencia1.add(matrizPrincipal[j - 1][0]);
                secuencia2.add("-");
                scroreTotal += hueco;
                j = j - 1;
            } else if (Score.equals(ScoreUp + hueco)) {
                secuencia1.add("-");
                secuencia2.add(matrizPrincipal[0][i - 1]);
                scroreTotal += hueco;
                i = i - 1;
            }
        }
        
        while (i > 2) {
            scroreTotal += hueco;
            secuencia1.add("-");
            secuencia2.add(matrizPrincipal[0][i - 1]);
            i = i - 1;
            
        }
        
        while (j > 2) {
            scroreTotal += hueco;
            secuencia1.add(matrizPrincipal[j - 1][0]);
            secuencia2.add("-");
            j = j - 1;
            
        }
        Collections.reverse(secuencia1);
        Collections.reverse(secuencia2);
        System.out.println();
        System.out.println(secuencia1.toString());
        System.out.println(secuencia2.toString());
        System.out.println("Score Total " + scroreTotal);
        
    }
    
    public String mostrar(String[][] matriz, int columnas, int filas) {
        String salida = "";
        for (int i = 0; i < columnas; i++) {
            System.out.print("\n");
            for (int j = 0; j < filas; j++) {
                salida += matriz[j][i] + "\t";
                System.out.print(matriz[j][i] + "\t");   
            }
            salida += "\n";
        }
        return salida;
    }
    
    public Integer numeroMayor(Integer izq, Integer arriba, Integer diag) {
        
        if (diag > izq) {
            if (diag > arriba) {
                return diag;
            } else {
                return arriba;
            }
        } else if (izq > arriba) {
            return izq;
        } else {
            return arriba;
        }
    }

    public int getScroreTotal() {
        return scroreTotal;
    }

    public void setScroreTotal(int scroreTotal) {
        this.scroreTotal = scroreTotal;
    }

    public ArrayList<String> getSecuencia1() {
        return secuencia1;
    }

    public void setSecuencia1(ArrayList<String> secuencia1) {
        this.secuencia1 = secuencia1;
    }

    public ArrayList<String> getSecuencia2() {
        return secuencia2;
    }

    public void setSecuencia2(ArrayList<String> secuencia2) {
        this.secuencia2 = secuencia2;
    }
    
    
    
}
