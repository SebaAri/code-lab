
package igu;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    int contSorteos = 1, minimo , maximo;
    Random numRandom;
    String mes;
    
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtcantidadDeGanadores = new javax.swing.JTextField();
        btnCerrarSorteo = new javax.swing.JButton();
        btnSortear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblGanadores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGanadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Sorteador Supermercado");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito128x128.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Mes:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad de ganadores:");

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Datos del sorteo:");

        txtcantidadDeGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadDeGanadoresActionPerformed(evt);
            }
        });

        btnCerrarSorteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar64x64.png"))); // NOI18N
        btnCerrarSorteo.setText("CERRAR SORTEO");
        btnCerrarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSorteoActionPerformed(evt);
            }
        });

        btnSortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sorteo64x64.jpg"))); // NOI18N
        btnSortear.setText("SORTEAR");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbMes, 0, 64, Short.MAX_VALUE)
                    .addComponent(txtcantidadDeGanadores))
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel5)
                    .addContainerGap(233, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(285, Short.MAX_VALUE)
                    .addComponent(btnSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcantidadDeGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnCerrarSorteo)
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel5)
                    .addContainerGap(267, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(btnSortear)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );

        lblGanadores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGanadores.setText("Ganadores: ");

        tblGanadores.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posición", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGanadores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblGanadores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblGanadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcantidadDeGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadDeGanadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadDeGanadoresActionPerformed

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        if (!txtcantidadDeGanadores.getText().equals("")) {
        int cantGan = Integer.parseInt(txtcantidadDeGanadores.getText());
        
        if (contSorteos<=cantGan) {
        
        String mes;
        String max;
        mes = (String)cmbMes.getSelectedItem();
        String min = "01";
        
         if(mes.equals("02")){
             max = "28";
         }
         else {
             if (mes.equals("11")|| mes.equals("06") || mes.equals("04") || mes.equals("09")){
               max = "30";  
             }
          else {
               max = "31";  
             }         
                 }
        
         numRandom = new Random();
          minimo = Integer.parseInt(min);
          maximo = Integer.parseInt(max);
         //int randomDia = numRandom.nextInt(maximo - minimo + 1)+minimo;
         //int randomTicket =numRandom.nextInt(9999-0001+1)+0001;
         
         //String numeroSorteado = agregarCeros(randomDia, mes, randomTicket);
         
         String numeroSorteado = sortear(maximo, minimo, mes);
         
         boolean esta = buscarRepetido(numeroSorteado);
         
         if (esta == false) {
         
        agregarValorATabla(contSorteos, numeroSorteado);
         
contSorteos++;
         }
         else {
             while (esta == true){
             numeroSorteado = sortear(maximo, minimo, mes);
             esta = buscarRepetido(numeroSorteado);
             
         }
             if (esta == false){
             agregarValorATabla(contSorteos, numeroSorteado);
             contSorteos++;
    }
         }
        }
        else {
    JOptionPane.showMessageDialog(rootPane, "Ya se alcanzó la cantidad de ganadores");
}
}
    else {
        JOptionPane.showMessageDialog(rootPane, "Es necesario completar la cantidad de ganadores");
    }
        }

    


         public String agregarCeros(int randomDia, String mes, int randomTicket) {

        int largoString = (Integer.toString(randomDia)).length();

        //agregar los 0 al día
        String numeroSorteado;
        if (largoString == 2) {
            numeroSorteado = randomDia + mes;
        } else {
            numeroSorteado = "0" + randomDia + mes;
        }

        //agregar los 0 al ticket
        largoString = (Integer.toString(randomTicket)).length();
        if (largoString == 3) {
            numeroSorteado = numeroSorteado + "0" + randomTicket;
        }
        else {
            if (largoString == 2) {
                numeroSorteado = numeroSorteado + "00" + randomTicket;
            }
            else {
                if (largoString == 1) {
                    numeroSorteado = numeroSorteado + "000" + randomTicket;
                }
                else {
                    numeroSorteado = numeroSorteado + randomTicket;
                }
            }
        }

        return numeroSorteado;
    
        
    }//GEN-LAST:event_btnSortearActionPerformed

    private void btnCerrarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSorteoActionPerformed
        
       if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente finalizar el sorteo?",
               "Finalización del sorteo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
         txtcantidadDeGanadores.setText("");
         cmbMes.setSelectedIndex(0);
         
         DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();
        /* for (int i=modelo.getRowCount()-1; i>-1; i--) {
               modelo.removeRow(i);
    }*/modelo.setRowCount(0);
         contSorteos = 1;
}
    }//GEN-LAST:event_btnCerrarSorteoActionPerformed





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSorteo;
    private javax.swing.JButton btnSortear;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGanadores;
    private javax.swing.JTable tblGanadores;
    private javax.swing.JTextField txtcantidadDeGanadores;
    // End of variables declaration//GEN-END:variables

    private boolean buscarRepetido(String numeroSorteado) {
        boolean esta = false;
    DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();

    for (int f=0; f<modelo.getRowCount(); f++) {
        for (int c=0; c<modelo.getColumnCount(); c++) {

            if(modelo.getValueAt(f, c).equals(numeroSorteado)) {
                esta = true;
                break;
            }
        }
        }
        return esta;
    }

public String sortear(int maximo, int minimo, String mes) { // Recibir variables necesarias como parámetros o pasarlas a nivel de clase
        Random numRandom = new Random();
        
        // Sorteamos
        int randomDia = numRandom.nextInt(maximo - minimo + 1) + minimo;
        int randomTicket = numRandom.nextInt(9999 - 0001 + 1) + 0001;

        String numeroSorteado = agregarCeros(randomDia, mes, randomTicket);
        
        return numeroSorteado; // Retornar el valor generado
    }


   public void agregarValorATabla (int contSorteo, String numeroSorteado) {

   DefaultTableModel modelo = (DefaultTableModel)tblGanadores.getModel();
         Object[] objeto = {contSorteos,numeroSorteado};
         modelo.addRow(objeto);
   }
}

