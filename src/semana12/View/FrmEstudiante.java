package semana12.View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import semana12.Controller.EstudianteCtrl;
import semana12.Model.Entity.Estudiante;

public class FrmEstudiante extends javax.swing.JFrame {

  private EstudianteCtrl estudianteCtrl;

  public FrmEstudiante() {
    initComponents();
    this.setLocationRelativeTo(null);
    estudianteCtrl = new EstudianteCtrl();

    DefaultTableModel model = (DefaultTableModel) tbEstudiante.getModel();
    cargarEstudiantesEnTabla(model);
  }

  private void cargarEstudiantesEnTabla(DefaultTableModel model) {
    estudianteCtrl.listarEstudiantes(model);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    txtCodigo = new javax.swing.JTextField();
    txtApeMaterno = new javax.swing.JTextField();
    txtApePaterno = new javax.swing.JTextField();
    txtEdad = new javax.swing.JTextField();
    cboGenero = new javax.swing.JComboBox<String>();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tbEstudiante = new javax.swing.JTable();
    jPanel2 = new javax.swing.JPanel();
    btnNuevo = new javax.swing.JButton();
    btnAgregar = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();
    btnModificar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
    jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setText("Código:");

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel4.setText("Ape. Paterno:");

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel5.setText("Edad:");

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel6.setText("Nombre:");

    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel7.setText("Ape. Materno:");

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel8.setText("Género:");

    txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

    txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

    txtApeMaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

    txtApePaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

    txtEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

    cboGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    cboGenero.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "- Seleccionar -" }));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(cboGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel3)
          .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5)
          .addComponent(txtApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8)
          .addComponent(txtApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7))
        .addContainerGap(26, Short.MAX_VALUE))
    );

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel2.setText("Administrador de Estudiantes");

    tbEstudiante.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    jScrollPane2.setViewportView(tbEstudiante);

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

    btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnNuevo.setText("Nuevo");
    btnNuevo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNuevoActionPerformed(evt);
      }
    });

    btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnAgregar.setText("Agregar");
    btnAgregar.setToolTipText("");
    btnAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarActionPerformed(evt);
      }
    });

    btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnModificar.setText("Modificar");
    btnModificar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnModificarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jScrollPane2)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(15, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(jLabel2)
        .addGap(10, 10, 10)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(15, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if (camposLlenos() && esNumeroEntero(txtEdad.getText())) {
      String codigo = txtCodigo.getText();
      String apellidoPaterno = txtApePaterno.getText();
      String apellidoMaterno = txtApeMaterno.getText();
      String nombre = txtNombre.getText();
      int edad = Integer.parseInt(txtEdad.getText());
      String genero = cboGenero.getSelectedItem().toString();

      Estudiante estudiante = new Estudiante();
      estudiante.setCodigo(codigo);
      estudiante.setNombre(nombre);
      estudiante.setApellidoPaterno(apellidoPaterno);
      estudiante.setApellidoMaterno(apellidoMaterno);
      estudiante.setEdad(edad);
      estudiante.setGenero(genero);

      estudianteCtrl.modificarEstudiante(estudiante);
    } else {
      JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos y asegúrese de que la Edad sea un número entero.", "Campos Incompletos o Incorrectos", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnModificarActionPerformed

  private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    Limpiar();
  }//GEN-LAST:event_btnNuevoActionPerformed

  private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    if (camposLlenos() && esNumeroEntero(txtEdad.getText())) {
      String codigo = txtCodigo.getText();
      String apellidoPaterno = txtApePaterno.getText();
      String apellidoMaterno = txtApeMaterno.getText();
      String nombre = txtNombre.getText();
      int edad = Integer.parseInt(txtEdad.getText());
      String genero = cboGenero.getSelectedItem().toString();

      Estudiante estudiante = new Estudiante();
      estudiante.setCodigo(codigo);
      estudiante.setNombre(nombre);
      estudiante.setApellidoPaterno(apellidoPaterno);
      estudiante.setApellidoMaterno(apellidoMaterno);
      estudiante.setEdad(edad);
      estudiante.setGenero(genero);

      estudianteCtrl.agregarEstudiante(estudiante);
    } else {
      JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos y asegúrese de que la Edad sea un número entero.", "Campos Incompletos o Incorrectos", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnAgregarActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed

  private void Limpiar() {
    txtCodigo.setText("");
    txtNombre.setText("");
    txtApePaterno.setText("");
    txtApeMaterno.setText("");
    txtEdad.setText("");
    cboGenero.setSelectedIndex(0);
    txtCodigo.setFocusable(true);
  }

  private boolean esNumeroEntero(String texto) {
    try {
      Integer.parseInt(texto);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  private boolean camposLlenos() {
    return !txtCodigo.getText().isEmpty()
      && !txtNombre.getText().isEmpty()
      && !txtApePaterno.getText().isEmpty()
      && !txtApeMaterno.getText().isEmpty()
      && !txtEdad.getText().isEmpty()
      && cboGenero.getSelectedIndex() != 0;
  }

  public static void main(String args[]) {

    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrmEstudiante().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAgregar;
  private javax.swing.JButton btnModificar;
  private javax.swing.JButton btnNuevo;
  private javax.swing.JButton btnSalir;
  private javax.swing.JComboBox<String> cboGenero;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable tbEstudiante;
  private javax.swing.JTextField txtApeMaterno;
  private javax.swing.JTextField txtApePaterno;
  private javax.swing.JTextField txtCodigo;
  private javax.swing.JTextField txtEdad;
  private javax.swing.JTextField txtNombre;
  // End of variables declaration//GEN-END:variables
}
