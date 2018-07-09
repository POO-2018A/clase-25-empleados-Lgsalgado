
package empleados;

import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Empleado extends javax.swing.JFrame {
    
//String que me permita crear la matriz empleados con sus atributos    
 String [][] empleado;
    DefaultTableModel tblModelEmpleados;
       List<Empleados> listaEmpleados = new ArrayList<Empleados>();
       
     //Strings que contenga los datos del combo Box
  String[] listaCargos = new String[]{
    "Asistente","Contador","Chofer","Gerente","Supervisor"
    };
    DefaultComboBoxModel listaCargosModel = new DefaultComboBoxModel(listaCargos);
   
   
    
    public Empleado() {
        initComponents();
        //composicion de la tabla
         String titulosColumnasEmpleados[]= new String []{
            "Nombre","Apellido","Cargo"
        };
         //inicializacion de los datos que resiviran las tablas y el combobox
        tblModelEmpleados = new DefaultTableModel(empleado,titulosColumnasEmpleados);
        tblLista.setModel(tblModelEmpleados );
        cmbCargos.setModel(listaCargosModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEmpleados = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbCargos = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        cmbFiltroCargos = new javax.swing.JComboBox<>();
        lblFiltrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre");

        jLabel1.setText("Apellido");

        jLabel2.setText("Cargo");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cmbCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargosActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("INGRESO DE  TRABAJADORES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btnAgregar)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pnlEmpleados.addTab("INGRESO TRABAJADORES", jPanel1);

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLista);

        cmbFiltroCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Gerente", "Contador", "Bodeguero", "Secretario/a", "Chofer" }));
        cmbFiltroCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroCargosActionPerformed(evt);
            }
        });

        lblFiltrado.setText("FILTRAR POR CARGOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblFiltrado)
                        .addGap(47, 47, 47)
                        .addComponent(cmbFiltroCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltroCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pnlEmpleados.addTab("NOMINA ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(pnlEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(pnlEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cargo = cmbCargos.getSelectedItem().toString();
       
          if(nombre.equals("")||apellido.equals("")){ //comparacion para que todos los campos esten llenos
              JOptionPane.showMessageDialog(rootPane, "Debe ingresar todos los campos");
          }else{
            Empleados nuevoEmpleado = new Empleados(nombre,apellido,cargo);//arreglo para la acumulacion de empleados
                JOptionPane.showMessageDialog (rootPane, "Se registró exitosamente a: "+nuevoEmpleado.getNombre()+" "+nuevoEmpleado.getApellido());
                listaEmpleados.add(nuevoEmpleado);
                //impresion en la tabla
                tblModelEmpleados.addRow(new String[]{nuevoEmpleado.getNombre(),nuevoEmpleado.getApellido(),nuevoEmpleado.getCargo()});
                
//seteo de campos para volver a ingresar
                txtNombre.setText("");
                txtApellido.setText("");
 

          }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbFiltroCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroCargosActionPerformed
        //en el combo box para la impresion de todos los cargos los modifico directo
        String filtro = cmbFiltroCargos.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tblFiltro = new TableRowSorter<DefaultTableModel>(tblModelEmpleados);
        tblLista.setRowSorter(tblFiltro);
        
        
        //comparacion con cada atributo del combo o si me pide todos generales
        if(!filtro.equals("Todos")){
            tblFiltro.setRowFilter(RowFilter.regexFilter(filtro,2));
        }else{
            tblLista.setRowSorter(tblFiltro);
        }
    }//GEN-LAST:event_cmbFiltroCargosActionPerformed

    private void cmbCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargosActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbCargos;
    private javax.swing.JComboBox<String> cmbFiltroCargos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltrado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTabbedPane pnlEmpleados;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
