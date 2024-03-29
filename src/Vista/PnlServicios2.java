/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PnlServicios2 extends javax.swing.JPanel {

    /**
     * Creates new form PnlServicios2
     */
    public PnlServicios2() {
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

        pnlFondo2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaServicios = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarServicios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaSugerencia = new javax.swing.JTextArea();
        btnEnviarSugerencia = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        pnlFondo2.setBackground(new java.awt.Color(0, 102, 204));

        txtaServicios.setColumns(20);
        txtaServicios.setRows(5);
        jScrollPane1.setViewportView(txtaServicios);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUESTROS SERVICIOS");

        btnMostrarServicios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMostrarServicios.setText("Mostar Servicios Disponibles");
        btnMostrarServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarServiciosMouseClicked(evt);
            }
        });
        btnMostrarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarServiciosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Envie un servicio sugerido por el cliente:");

        txtaSugerencia.setColumns(20);
        txtaSugerencia.setRows(5);
        jScrollPane2.setViewportView(txtaSugerencia);

        btnEnviarSugerencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEnviarSugerencia.setText("Enviar sugerencia");
        btnEnviarSugerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarSugerenciaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/nuevoservicios.png.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlFondo2Layout = new javax.swing.GroupLayout(pnlFondo2);
        pnlFondo2.setLayout(pnlFondo2Layout);
        pnlFondo2Layout.setHorizontalGroup(
            pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo2Layout.createSequentialGroup()
                .addGroup(pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondo2Layout.createSequentialGroup()
                        .addGroup(pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondo2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))
                            .addGroup(pnlFondo2Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondo2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(btnMostrarServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(pnlFondo2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviarSugerencia)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(380, 380, 380))
        );
        pnlFondo2Layout.setVerticalGroup(
            pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo2Layout.createSequentialGroup()
                .addGroup(pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(btnMostrarServicios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondo2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addGroup(pnlFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondo2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnEnviarSugerencia))
                    .addGroup(pnlFondo2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarSugerenciaActionPerformed
        // TODO add your handling code here:
        String nombreArchivo = "Sugerencias";
        String carpeta = System.getProperty("user.dir");
        String direccionCompleta = carpeta + "/" + "Sugerencias" + ".txt";
        FileWriter ubicacion = null;
        try {
            JOptionPane.showMessageDialog(pnlFondo2, 
                    "Sugerencia guardada en sus archivos");
            JOptionPane.showMessageDialog(pnlFondo2, 
                    "Si desea registrar la reserva, vaya primero"
                            + " al apartado cliente");
            ubicacion = new FileWriter(direccionCompleta);
        } catch (IOException ex) {
            /*Logger(Archivos.class.log(Level.SEVERE,null,ex);*/
        }
        try {
            BufferedWriter escritor = new BufferedWriter(ubicacion);
            escritor.write(txtaSugerencia.getText());
            escritor.close();
        } catch (Exception ex) {
          
        }
    }//GEN-LAST:event_btnEnviarSugerenciaActionPerformed

    private void btnMostrarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarServiciosActionPerformed
        // TODO add your handling code here:
        txtaServicios.setText(leerTxt(
                "Servicios.txt"));

    }//GEN-LAST:event_btnMostrarServiciosActionPerformed

    private void btnMostrarServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarServiciosMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnMostrarServiciosMouseClicked
    public String leerTxt(String direccion) {
    String texto = "";
    try {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String temp= "";
        String bfRead;
        while ((bfRead = bf.readLine()) != null) {
            temp = temp + bfRead + "\n"; // Agregar salto de línea
        }
        texto = temp;   
    } catch(Exception e) {
        
    }
    return texto;


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarSugerencia;
    private javax.swing.JButton btnMostrarServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlFondo2;
    private javax.swing.JTextArea txtaServicios;
    private javax.swing.JTextArea txtaSugerencia;
    // End of variables declaration//GEN-END:variables
}
