package Vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;

/**
 *
 * @author Victor
 */
public class PersonaIG extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoPersona
     */
    public PersonaIG() {
        initComponents();
        mTabla =(DefaultTableModel) tblPersonas.getModel();
    }
    
    public String getId(){
        return txtId.getText().trim();
    }
    
    public String getNombre(){
        return txtNombre.getText().trim();
    }
    
    public int getEdad(){
        return Integer.parseInt(txtEdad.getText().trim());
    }
    
    public char getSexo(){
        return cmbSexo.getSelectedItem().toString().charAt(0);
    }
    
    public String getDepar(){
        return cmbDepar.getSelectedItem().toString();
    }
    
    public String getCiudad(){
        return cmbCiudad.getSelectedItem().toString();
    }
    
    public void limpiarTabla (){
        //mTabla.setRowCount(0);
        for(int i=mTabla.getRowCount()-1; i>=0 ; i--){
            mTabla.removeRow(i);
        }
    }
    
    public void cargarPersonas(ArrayList<Persona> listPersonas){
        limpiarTabla();
        for(int i= 0; i < listPersonas.size(); i++){
            mTabla.addRow(new Object[]{
            listPersonas.get(i).getId(),
            listPersonas.get(i).getNombre(),
            listPersonas.get(i).getEdad(),
            listPersonas.get(i).getSexo(),
            listPersonas.get(i).getDepartamento(),
            listPersonas.get(i).getCiudad_O()});
        }
    }
    
    public void addListenerBtnNuevo(ActionListener listenPersona){
        btnNuevo.addActionListener(listenPersona);
    }
    
    public void addListenerBtnModificar(ActionListener listenPersona){
        btnModificar.addActionListener(listenPersona);
    }
    
    public void addListenerBtnBorrar(ActionListener listenPersona){
        btnBorrar.addActionListener(listenPersona);
    }
    
    public void nuevoAction (){
       revisaDatos();
    }
    
    public void cancelarAction (){
        btnBorrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnNuevo.setText("Nuevo");
        btnNuevo.setActionCommand("nuevo");
        txtId.setEnabled(true);
        tblPersonas.clearSelection();
        limpiarDatos();
    }
    
    public void modificarAction (){
        
    }
    
    public void borrarAction (){
        
    }
    
    public boolean revisaDatos(){
        if (txtNombre.getText().replaceAll(" ", "").isEmpty()||txtId.getText().replaceAll(" ", "").isEmpty()||
                txtEdad.getText().replaceAll(" ", "").isEmpty()|| cmbDepar.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Datos incompletos, por favor llene todos lo campos");
            return false;
        }
        return true;
    }
    
    public void gestionMensajes(String mensaje, String titulo, int icono){
         JOptionPane.showMessageDialog(this,mensaje, titulo, icono);
    }
    
    public void limpiarDatos(){
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        cmbSexo.setSelectedIndex(0);
        cmbDepar.setSelectedIndex(0);
        cmbCiudad.setSelectedIndex(0);
        txtNombre.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblCiudadO = new javax.swing.JLabel();
        lblDeparta = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        cmbDepar = new javax.swing.JComboBox<>();
        cmbCiudad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Persona");

        panDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Persona"));

        lblNombre.setText("Nombre:");

        lblId.setText("Documento:");

        lblSexo.setText("Sexo:");

        lblEdad.setText("Edad:");

        lblCiudadO.setText("Ciudad:");

        lblDeparta.setText("Departamento:");

        cmbSexo.setEditable(true);
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        cmbDepar.setEditable(true);
        cmbDepar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amazonas", "Antioquia", "Arauca", "Atlántico", "Bolívar", "Boyacá", "Caldas", "Caquetá", "Casanare", "Cauca", "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Guainía", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "San Andrés y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada" }));
        cmbDepar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDeparItemStateChanged(evt);
            }
        });

        cmbCiudad.setEditable(true);
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cualquier ciudad" }));

        javax.swing.GroupLayout panDatosLayout = new javax.swing.GroupLayout(panDatos);
        panDatos.setLayout(panDatosLayout);
        panDatosLayout.setHorizontalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblId)
                    .addComponent(lblDeparta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addComponent(cmbDepar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCiudadO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCiudad, 0, 164, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                        .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panDatosLayout.createSequentialGroup()
                                .addComponent(txtId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEdad))
                            .addComponent(txtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panDatosLayout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEdad))))
                .addContainerGap())
        );
        panDatosLayout.setVerticalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeparta)
                        .addComponent(cmbDepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCiudadO)))
                .addGap(36, 36, 36))
        );

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Edad", "Sexo", "Departamento", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonas.getTableHeader().setReorderingAllowed(false);
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonas);
        if (tblPersonas.getColumnModel().getColumnCount() > 0) {
            tblPersonas.getColumnModel().getColumn(1).setMinWidth(200);
            tblPersonas.getColumnModel().getColumn(2).setMaxWidth(60);
            tblPersonas.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        btnNuevo.setText("Nuevo");

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);

        btnBorrar.setText("Eliminar");
        btnBorrar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addGap(27, 27, 27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMouseClicked
        int sel = tblPersonas.getSelectedRow();
        if(sel == -1){
            if(tblPersonas.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"No hay registros");
            }
        }else {
            txtId.setText(tblPersonas.getValueAt(sel, 0).toString());
            txtId.setEnabled(false);
            txtNombre.setText(tblPersonas.getValueAt(sel, 1).toString());
            txtEdad.setText(tblPersonas.getValueAt(sel, 2).toString());
            cmbSexo.setSelectedItem(tblPersonas.getValueAt(sel, 3).toString());
            cmbDepar.setSelectedItem(tblPersonas.getValueAt(sel, 4).toString());
            cmbCiudad.setSelectedItem(tblPersonas.getValueAt(sel, 5).toString());
            btnModificar.setEnabled(true);
            btnBorrar.setEnabled(true);
            btnNuevo.setText("Cancelar");
            btnNuevo.setActionCommand("cancelar");
        }
    }//GEN-LAST:event_tblPersonasMouseClicked

    private void cmbDeparItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDeparItemStateChanged
        int sel = cmbDepar.getSelectedIndex();
    }//GEN-LAST:event_cmbDeparItemStateChanged



    
    private DefaultComboBoxModel mCiudad;
    private DefaultTableModel mTabla;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbDepar;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiudadO;
    private javax.swing.JLabel lblDeparta;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JPanel panDatos;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
