package peluqueriacanina.igu;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import peluqueriacanina.logica.Controladora;
import javax.swing.table.DefaultTableModel;
import peluqueriacanina.logica.Mascota;

public class VerDataos extends javax.swing.JFrame {
    Controladora control = null;

   
      public VerDataos() {
          
      control = new Controladora();
        initComponents();
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peluqueriacanina/igu/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peluqueriacanina/igu/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          if (tablaMascotas.getRowCount() > 0) {
   if (tablaMascotas.getSelectedRow() != -1) {
           int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
      ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                this.dispose();
   }
   else {
         mostrarMensaje ("No seleccionó ninguna mascota", "Error", "Error al eliminar");
   }
        }
        else {
            mostrarMensaje ("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
          
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaMascotas.getRowCount() > 0) {
   if (tablaMascotas.getSelectedRow() != -1) {
    int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
       try {
           control.borrarMascota(num_cliente);
       } catch (Exception ex) {
           System.getLogger(VerDataos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
    
            //aviso al usuario que borró correctamente
        mostrarMensaje ("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
        cargarTabla();
    }
    else {
         mostrarMensaje ("No seleccionó ninguna mascota", "Error", "Error al eliminar");
   }
        }
        else {
            mostrarMensaje ("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }

                        
                
    }//GEN-LAST:event_btnEliminarActionPerformed
public void cargarTabla() {
    // 1. Declarar e instanciar el modelo de tabla
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }; // <-- Aquí termina la definición de la clase anónima (línea 137)

    // 2. Definir los nombres de las columnas
    // 2. Definir los nombres de las columnas
String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.", "Dueño", "Celular"};
modeloTabla.setColumnIdentifiers(titulos);

// 3. Asignar el modelo a la JTable
tablaMascotas.setModel(modeloTabla);
List<Mascota> listaMascotas = control.TraerMascotas();

if (listaMascotas != null) {
    for (Mascota masco : listaMascotas) {
        Object[] objeto = {
            masco.getNum_cliente(), 
            masco.getNombre(),
            masco.getColor(), 
            masco.getRaza(), 
            masco.getAlergico(), 
            masco.getAtencion_especial(),
            masco.getUnDuenio().getNombre(), 
            masco.getUnDuenio().getCel_duenio()
                
               /* modeloTabla.addRow(objeto);*/
        };
        ((DefaultTableModel) modeloTabla).addRow(objeto);
    }
  /* tablaMascotas.setModel(modeloTabla); */
        }
    

}

public void mostrarMensaje (String mensaje, String tipo, String titulo) {
    JOptionPane optionPane = new JOptionPane(mensaje);
    if (tipo.equals("Info")) {
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    }
    else if (tipo.equals("Error")) {
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
    }
    JDialog dialog = optionPane.createDialog(titulo);
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);

}
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

}
