/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioinformatica.visual;

import bioinformatica.BioInformatica;
import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author fanny
 */
public class PantallaAlgortimo extends javax.swing.JFrame {

    /**
     * Creates new form PantallaAlgortimo
     */
    Style estiloRojo, estiloVerde, estiloAzul,estiloBlanco;

    public PantallaAlgortimo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSalida = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        txtRuta = new javax.swing.JTextField();
        btnprocesar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaSalida.setColumns(20);
        txtAreaSalida.setRows(5);
        jScrollPane1.setViewportView(txtAreaSalida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 800, 140));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 530, 380));

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 420, 30));

        btnprocesar.setText("Procesar");
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnprocesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 110, 30));

        btnSeleccionar.setText("Seleccionar ");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 100, 30));

        lblTitulo.setBackground(new java.awt.Color(240, 240, 242));
        lblTitulo.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        lblTitulo.setText("Procesamiento de Cadenas");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        txtScore.setEditable(false);
        txtScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScoreActionPerformed(evt);
            }
        });
        getContentPane().add(txtScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 90, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Score");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 60, 30));

        jLabel2.setText("Adjunte un archivo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 30));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(988, 922));
        jScrollPane2.setVerifyInputWhenFocusTarget(false);

        jTextPane1.setBackground(new java.awt.Color(254, 242, 242));
        jTextPane1.setToolTipText("");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane1.setMinimumSize(new java.awt.Dimension(66, 20));
        jTextPane1.setPreferredSize(new java.awt.Dimension(866, 820));
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 800, 120));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 430));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtRuta.setText(filename);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
        // TODO add your handling code here:
        Style color = null;
        StyleContext sc = creaEstilos();
        try {
            // TODO add your handling code here:
            BioInformatica bioInformatica = new BioInformatica(txtRuta.getText());
            txtScore.setText(Integer.toString(bioInformatica.alineacion.getScroreTotal()));

            setTextAreaSecuencia1(bioInformatica.alineacion.getSecuencia1());
            txtAreaSalida.append("\n");
            setTextAreaSecuencia2(bioInformatica.alineacion.getSecuencia2());
            
             

            DefaultStyledDocument doc = new DefaultStyledDocument(sc);
            color = cambioColor("Blanco");
            for (int i = 0; i < (8*bioInformatica.alineacion.getSecuencia1().size()); i++) {
                doc.insertString(doc.getLength(), "O" , color);

            }
            doc.insertString(doc.getLength(), "\n", color);
            
            /*Inicio de construcción de la primera cadena*/
            jTextPane1.setStyledDocument(doc);
            for (int i = 0; i < bioInformatica.alineacion.getSecuencia1().size(); i++) {
                if (bioInformatica.alineacion.getSecuencia1().get(i).equals(bioInformatica.alineacion.getSecuencia2().get(i))) {
                    color = cambioColor("Verde");
                } else {
                    if (bioInformatica.alineacion.getSecuencia1().get(i).equals("-")
                            || bioInformatica.alineacion.getSecuencia2().get(i).equals("-")) {
                        color = cambioColor("Rojo");
                    } else {
                        color = cambioColor("Azul");
                    }
                }

                doc.insertString(doc.getLength(), bioInformatica.alineacion.getSecuencia1().get(i) + "\t", color);
                jTextPane1.setStyledDocument(doc);
            }

            doc.insertString(doc.getLength(), "\n", null);
            jTextPane1.setStyledDocument(doc);
            
            for (int i = 0; i < bioInformatica.alineacion.getSecuencia2().size(); i++) {
                doc.insertString(doc.getLength(), "|\t", null);
                jTextPane1.setStyledDocument(doc);
            }
            
            doc.insertString(doc.getLength(), "\n", null);
            jTextPane1.setStyledDocument(doc);
            
            
            for (int i = 0; i < bioInformatica.alineacion.getSecuencia2().size(); i++) {
                if (bioInformatica.alineacion.getSecuencia1().get(i).equals(bioInformatica.alineacion.getSecuencia2().get(i))) {
                    color = cambioColor("Verde");
                } else {
                    if (bioInformatica.alineacion.getSecuencia1().get(i).equals("-")
                            || bioInformatica.alineacion.getSecuencia2().get(i).equals("-")) {
                        color = cambioColor("Rojo");
                    } else {
                        color = cambioColor("Azul");
                    }
                }

                doc.insertString(doc.getLength(), bioInformatica.alineacion.getSecuencia2().get(i) + "\t", color);
                jTextPane1.setStyledDocument(doc);
            }

            jTextPane1 = new JTextPane(doc);
            
            jTextArea2.append(bioInformatica.getSalida());

        } catch (BadLocationException | FileNotFoundException ex) {
            Logger.getLogger(PantallaAlgortimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnprocesarActionPerformed

    public Style cambioColor(String color) {
        Style estilo = null;

        if (color.equals("Rojo")) {
            estilo = estiloRojo;
        } else if (color.equals("Azul")) {
            estilo = estiloAzul;
        } else if (color.equals("Verde")) {
            estilo = estiloVerde;
        } else if (color.equals("Blanco")) {
            estilo = estiloBlanco;
        }
//        jTextPane1.setCharacterAttributes(estilo, false);
        return estilo;
    }

    private StyleContext creaEstilos() {
        StyleContext sc = new StyleContext();

        estiloRojo = sc.addStyle(null, null);
        StyleConstants.setForeground(estiloRojo, Color.red);

        estiloVerde = sc.addStyle(null, null);
        StyleConstants.setForeground(estiloVerde, Color.green);
        
        estiloAzul = sc.addStyle(null, null);
        StyleConstants.setForeground(estiloAzul, Color.blue);
        
        estiloBlanco = sc.addStyle(null, null);
        StyleConstants.setForeground(estiloBlanco, Color.WHITE);

        return (sc);
    }

    private void setTextAreaSecuencia1(ArrayList<String> secuencia1) {
        for (String datoSecuencia : secuencia1) {
            if (datoSecuencia.endsWith("?")) {
                setForeground(Color.red);
            }
            txtAreaSalida.append(datoSecuencia + "\t");
        }

    }

    private void setTextAreaSecuencia2(ArrayList<String> secuencia2) {
        for (String datoSecuencia : secuencia2) {
            txtAreaSalida.append(datoSecuencia + "\t");
        }

    }
    private void txtScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtScoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaAlgortimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAlgortimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAlgortimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAlgortimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAlgortimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnprocesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaSalida;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
