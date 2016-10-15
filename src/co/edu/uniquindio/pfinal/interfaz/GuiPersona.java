package co.edu.uniquindio.pfinal.interfaz;

//import co.edu.uniquindio.pfinal.variables.Persona;
//import co.edu.uniquindio.pfinal.variables.Empresa;
import co.edu.uniquindio.pfinal.extras.Excepcion;
import co.edu.uniquindio.pfinal.extras.PanelFondo1;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GuiPersona extends javax.swing.JInternalFrame {

//    private Empresa miEmpresa;
    private boolean controlRetorno = false;

    private int resultado;
    private ImageIcon imagenPersona;
//    private Persona persona;
    private int enrutador;

//    public GuiPersona(Empresa emp, Persona persona1, int opc, int enrutador) {
    public GuiPersona() {
        initComponents();

        PanelFondo1 F = new PanelFondo1();
        this.add(F, BorderLayout.CENTER);
        this.pack();

        this.setVisible(true);
        this.enrutador = enrutador;
//        persona = persona1;
//        miEmpresa = emp;

        //Mostramos los botones de guardar y escondemos los de modificar
        btModificar.setVisible(false);
        // Esta opc es para poder manejar 2 ventanas en una sola
        // Si la opcion es diferente de 1, quiere decir que va a agregar persona
        // Si la opcion es 1, quiere decir que va a modificar la persona
//        if (opc == 1) {
            // Aqui enviamos los datos de la persona a los JTextField
//            jTxtCedula.setText(persona.getCedula());
//            jtApellido.setText(persona.getApellido());
//            jtNombre.setText(persona.getNombre());
//            jtDireccion.setText(persona.getDireccion());
//            jtEmail.setText(persona.getEmail());
//            String ganancia = "" + persona.getGananciasPorHijos();
//            jtTelefono.setText(persona.getTelefono());
//            jtPw.setText(persona.getContrasena());
//            jLblFoto.setIcon(persona.getFoto());

            // Escondemos los botones de agregar
            btGuardar.setVisible(false);
            btModificar.setVisible(true);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblFoto = new javax.swing.JLabel();
        btCargarFoto = new javax.swing.JButton();
        btAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtEdad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        btModificar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCBox = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Persona");

        jLblFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblFoto.setText("Foto");
        jLblFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btCargarFoto.setText("Cargar Foto");
        btCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargarFotoActionPerformed(evt);
            }
        });

        btAtras.setText("Cerrar");
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edad:");

        jTxtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtEdadKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtNombreMousePressed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtApellidoMousePressed(evt);
            }
        });
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");

        jtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtTelefonoMousePressed(evt);
            }
        });
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("F.Nacimiento:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email:");

        jtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtEmailMousePressed(evt);
            }
        });
        jtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEmailKeyTyped(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo:");

        jRadioButton1.setText("Masculino");

        jRadioButton2.setText("Femenino");

        jCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MES", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jTextField1.setText("AÑO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCargarFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtTelefono)
                            .addComponent(jtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCargarFoto)
                    .addComponent(btGuardar)
                    .addComponent(btModificar)
                    .addComponent(btAtras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtEdadKeyTyped
//        miEmpresa.espaciosVacios(evt, jTxtEdad);
    }//GEN-LAST:event_jTxtEdadKeyTyped

    private void jtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreMousePressed
//        if (evt.getClickCount() == 2) {
//
//            jtApellido.setEnabled(false);
//            jtNombre.setEnabled(true);
//            jtDireccion.setEnabled(false);
//            jtEmail.setEnabled(false);
//            jtTelefono.setEnabled(false);
//            jtPw.setEnabled(false);
//        }
    }//GEN-LAST:event_jtNombreMousePressed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
//        miEmpresa.espaciosVacios(evt, jtNombre);
//        miEmpresa.noTeclearNumeros(evt);
//        miEmpresa.noteclearCaracteres(evt);
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtApellidoMousePressed
//        if (evt.getClickCount() == 2) {
//
//            jtApellido.setEnabled(true);
//            jtNombre.setEnabled(false);
//            jtDireccion.setEnabled(false);
//            jtEmail.setEnabled(false);
//            jtTelefono.setEnabled(false);
//            jtPw.setEnabled(false);
//        }
    }//GEN-LAST:event_jtApellidoMousePressed

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
//        miEmpresa.espaciosVacios(evt, jtApellido);
//        miEmpresa.noTeclearNumeros(evt);
//        miEmpresa.noteclearCaracteres(evt);
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTelefonoMousePressed
//        if (evt.getClickCount() == 2) {
//
//            jtApellido.setEnabled(false);
//            jtNombre.setEnabled(false);
//            jtDireccion.setEnabled(false);
//            jtEmail.setEnabled(false);
//            jtTelefono.setEnabled(true);
//            jtPw.setEnabled(false);
//        }
    }//GEN-LAST:event_jtTelefonoMousePressed
//
    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
//        miEmpresa.espaciosVacios(evt, jtTelefono);
//        miEmpresa.noTeclearLetras(evt);
//        miEmpresa.noteclearCaracteres(evt);
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
//        try {
//            String cedula = jTxtEdad.getText();
//            if (cedula.equals("")) {
//                throw new NullPointerException("La casilla esta vacia");
//            }
//            String password = jtPw.getText();
//            if (password.equals("")) {
//                throw new NullPointerException("La casilla esta vacia");
//            }
//            String nombre = jtNombre.getText();
//            if (nombre.equals("")) {
//                throw new NullPointerException("La casilla esta vacia");
//            }
//            String apellido = jtApellido.getText();
//            if (apellido.equals("")) {
//                throw new NullPointerException("La casilla esta vacia");
//            }
//            String direccion = jtDireccion.getText();
//            if (direccion.equals("")) {
//                throw new NullPointerException("La casilla esta vacia");
//            }
//            String telefono = jtTelefono.getText();
//            if (telefono.equals("")) {
//                throw new NullPointerException("La casilla esta vacia");
//            }
//            String email = jtEmail.getText();
//            if (email.equals("")) {
//                throw new NullPointerException("La casilla esta vacia");
//            }
//
//            if (imagenPersona != null) {
//                System.out.println("Entro a 1");
//                Persona per = new Persona(cedula, nombre, apellido, password, email,
//                        direccion, telefono, 0, imagenPersona);
//                System.out.println("Entro a 2");
//                if (persona == null) {
//                    System.out.println("Entro a 3");
//                    boolean guardar = miEmpresa.guardarPersona(per, null);
//                    if (guardar) {
//                        miEmpresa.mostrarMensaje("Se ha agregado ");
//                        persona = per;
//                        controlRetorno = true;
//                        this.dispose();
//                    }
//                } else {
//                    boolean guardar = miEmpresa.guardarPersona(per, persona.getCedula());
//                    if (guardar) {
//                        controlRetorno = true;
//                        jTxtEdad.setText("");
//                        jtApellido.setText("");
//                        jtNombre.setText("");
//                        jtDireccion.setText("");
//                        jtEmail.setText("");
//                        jtTelefono.setText("");
//                        jtPw.setText("");
//                        jLblFoto.setIcon(null);
//                        miEmpresa.mostrarMensaje("Se ha agregado el Vinculado");
//                    }
//
//                    jTxtEdad.setText("");
//                    jtApellido.setText("");
//                    jtNombre.setText("");
//                    jtDireccion.setText("");
//                    jtEmail.setText("");
//                    jtTelefono.setText("");
//                    jtPw.setText("");
//                    jLblFoto.setIcon(null);
//                    miEmpresa.mostrarMensaje("Se ha agregado el Vinculado");
//
//                }
//
//            } else {
//                throw new NullPointerException("Ingrese una imagen");
//            }
//
//        } catch (NullPointerException npe) {
//            miEmpresa.mostrarMensajeError(npe.getMessage());
//        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void jtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmailMousePressed
//        if (evt.getClickCount() == 2) {
//
//            jtApellido.setEnabled(false);
//            jtNombre.setEnabled(false);
//            jtDireccion.setEnabled(false);
//            jtEmail.setEnabled(true);
//            jtTelefono.setEnabled(false);
//            jtPw.setEnabled(false);
//        }
    }//GEN-LAST:event_jtEmailMousePressed

    private void jtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEmailKeyTyped
//        miEmpresa.espaciosVacios(evt, jtPw);
    }//GEN-LAST:event_jtEmailKeyTyped

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
//        try {
//
//            String id = jTxtEdad.getText();
//            String nombre = jtNombre.getText();
//            String apellido = jtApellido.getText();
//            String direccion = jtDireccion.getText();
//            String telefono = jtTelefono.getText();
//            String pw = jtPw.getText();
//            String email = jtEmail.getText();
//            ImageIcon foto = imagenPersona;
//            Persona p = new Persona(id, nombre, apellido, pw, email,
//                    direccion, telefono, 0, foto);
//            miEmpresa.editarPersona(persona.getCedula(), p);
//
//        } catch (Exception ex) {
//            miEmpresa.mostrarMensajeError(ex.getMessage());
//
//        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargarFotoActionPerformed

        GuiFoto cf = new GuiFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg", "png", "jpge");
        cf.jfcCargarFoto.setFileFilter(filtro);
        resultado = cf.jfcCargarFoto.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {
            String nombreImagen = cf.jfcCargarFoto.getSelectedFile().getPath();
            String lugarImagen = cf.jfcCargarFoto.getSelectedFile().toString();
            jLblFoto.setIcon(new ImageIcon(nombreImagen));
            ImageIcon icon = new ImageIcon(nombreImagen);
            Image imagen = icon.getImage();
            Image moImagen = imagen.getScaledInstance(174, 214, java.awt.Image.SCALE_DEFAULT);
            ImageIcon nuevaImagen = new ImageIcon(moImagen);
            jLblFoto.setText(null);
            jLblFoto.setIcon(nuevaImagen);
            imagenPersona = nuevaImagen;

        }
    }//GEN-LAST:event_btCargarFotoActionPerformed

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
//        try {
//            if (!controlRetorno && miEmpresa.getArbol().getRaiz() == null) {
//                throw new Excepcion("DEBE DE REGISTRARSE PARA PODER SALIR DE ESTA VENTANA");
//            } else {
//                Empresa empre = new Empresa();
//                if (enrutador == 0) {
//                    GuiAdmin guiAdmin = new GuiAdmin(empre, persona);
//                    this.dispose();
//                    GUIPpal.jEscritorio.add(guiAdmin);
//                    guiAdmin.toFront();
//                    guiAdmin.setVisible(true);
//
//                } else if (enrutador == 1) {
//                    GuiUsuario guiUsuario = new GuiUsuario(miEmpresa, persona);
//                    this.dispose();
//                    GUIPpal.jEscritorio.add(guiUsuario);
//                    guiUsuario.toFront();
//                    guiUsuario.setVisible(true);
//                }
//            }
//        } catch (Excepcion mi) {
//            miEmpresa.mostrarMensajeError(mi.getMessage());
//        } catch (Exception e) {
//            miEmpresa.mostrarMensajeError(e.getMessage());
//        }
    }//GEN-LAST:event_btAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btCargarFoto;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox<String> jCBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblFoto;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtEdad;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
