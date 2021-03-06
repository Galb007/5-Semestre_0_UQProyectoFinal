/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.pfinal.interfaz;

import co.edu.uniquindio.pfinal.extras.PanelFondo1;
import co.edu.uniquindio.pfinal.variables.Persona;
import co.edu.uniquindio.pfinal.variables.Empresa;
import java.awt.BorderLayout;

/**
 *
 * @author GALB007
 */
public class GuiUsuario extends javax.swing.JInternalFrame {

    private GuiPersona guiPersona;
    private GuiCompra guiCompra;
    private final Empresa miEmpresa;
    private final Persona persona;
    private final boolean estado;

    public GuiUsuario(Empresa e, Persona p) {
        initComponents();

        PanelFondo1 F = new PanelFondo1();
        this.add(F, BorderLayout.CENTER);
        this.pack();

        this.miEmpresa = e;
        this.persona = p;
        estado = persona.isIsActivo();

        setVisible(true);
        JTEstado.setEditable(false);

        actualizarEStado();
        jlImagen.setIcon(persona.getFoto());

        miEmpresa.calcularGanacias(this.persona);
        jLblNomb.setEnabled(false);
        jLblNomb.setText(persona.getNombre().toUpperCase() + " " + persona.getApellido().toUpperCase());
    }

    private void actualizarEStado() {
        if (estado) {
            JTEstado.setText("Activo");
        } else {
            JTEstado.setText("Inactivo");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlImagen = new javax.swing.JLabel();
        jLblNomb = new javax.swing.JLabel();
        jBtnCerrar = new javax.swing.JButton();
        JTEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnComprar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnArbol = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuario");

        jlImagen.setText("                     Imagen");
        jlImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLblNomb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblNomb.setForeground(new java.awt.Color(255, 255, 255));
        jLblNomb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblNomb.setText("Nombre");

        jBtnCerrar.setText("Cerrar");
        jBtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarActionPerformed(evt);
            }
        });

        JTEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADO:");

        jToggleButton1.setText("Estado");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jBtnAgregar.setText("Agregar Usuario");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnComprar.setText("Comprar");
        jBtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComprarActionPerformed(evt);
            }
        });

        jBtnModificar.setText("Modificar Datos");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnArbol.setText("Arbol");
        jBtnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnComprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnComprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnArbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCerrar))
                    .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarActionPerformed
        GUIPpal guiPpal = new GUIPpal();
        this.dispose();
    }//GEN-LAST:event_jBtnCerrarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        boolean estado2 = persona.isIsActivo();
        if (estado2) {
            boolean desactivar = miEmpresa.darDebaja(persona.getCedula());
            if (desactivar) {
                miEmpresa.mostrarMensaje("Se desvinculo");
                JTEstado.setText("INACTIVO");
            }
        } else {
            boolean reactivar = miEmpresa.reactivarPersona(persona.getCedula());
            if (reactivar) {
                miEmpresa.mostrarMensaje("Se vinculo");
                JTEstado.setText("ACTIVO");
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        guiPersona = new GuiPersona(miEmpresa, persona, 0, 1);
        this.dispose();
        GUIPpal.jEscritorio.add(guiPersona);
        guiPersona.toFront();
        guiPersona.setVisible(true);
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComprarActionPerformed
        guiCompra = new GuiCompra(miEmpresa, this.persona, 1);
        this.dispose();
        GUIPpal.jEscritorio.add(guiCompra);
        guiCompra.toFront();
        guiCompra.setVisible(true);
    }//GEN-LAST:event_jBtnComprarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        guiPersona = new GuiPersona(miEmpresa, persona, 1, 1);
        this.dispose();
        GUIPpal.jEscritorio.add(guiPersona);
        guiPersona.toFront();
        guiPersona.setVisible(true);
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnArbolActionPerformed
        GuiArbol guiArbol = new GuiArbol(miEmpresa, persona, persona);
        this.dispose();
        GUIPpal.jEscritorio.add(guiArbol);
        guiArbol.toFront();
        guiArbol.setVisible(true);
    }//GEN-LAST:event_jBtnArbolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTEstado;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnArbol;
    private javax.swing.JButton jBtnCerrar;
    private javax.swing.JButton jBtnComprar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblNomb;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jlImagen;
    // End of variables declaration//GEN-END:variables
}
