/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo88.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoAdatos.AlumnoData;
import universidad.AccesoAdatos.InscripcionData;
import universidad.AccesoAdatos.MateriaData;
import universidad.Entidades.Alumnos;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;

/**
 *
 * @author Lourdes
 */
public class ActualizacionNotas extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo=new DefaultTableModel();
    private AlumnoData aluData= new AlumnoData();
    private ArrayList<Alumnos> ListarAlumnos;
    private ArrayList<Materia> obtenerMateriaCursadas;
    private ArrayList<Inscripcion> obtenerInscripciones;
    private InscripcionData inscripcionData = new InscripcionData();
    private MateriaData materiaData= new MateriaData();
    private Inscripcion ins=new Inscripcion();

    /**
     * Creates new form ActualizacionNotas
     */
    public ActualizacionNotas() {
        initComponents();
        armarCabecera();
        cargarAlumnos();
        ListarAlumnos = (ArrayList<Alumnos>) aluData.listarAlumnos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carga de Notas");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un alumno");

        jcAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnoActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbGuardar)
                                        .addGap(101, 101, 101)
                                        .addComponent(jbSalir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)
                                        .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jbGuardar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnoActionPerformed
        // Seleccion de alumno
        Alumnos alum=(Alumnos)jcAlumno.getSelectedItem();
        ins.setAlumno(alum);
        borrarFilas();
        obtenerInscripciones=(ArrayList)inscripcionData.obtenerInscripcionPorAlumno(alum.getIdAlumno());
        for(Inscripcion ins:obtenerInscripciones){
            modelo.addRow(new Object[]{ins.getMateria().getIdMateria(),ins.getMateria().getNombre(),ins.getNota()});
        }
    }//GEN-LAST:event_jcAlumnoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // GUARDAR
        try{
        double nota;
        Materia materia;
        
        Alumnos alumno = (Alumnos) jcAlumno.getSelectedItem();
        int fila = jtTabla.getSelectedRow();
        
        System.out.println(fila);
        if(fila >=0){
            materia=materiaData.buscarMateria((int) modelo.getValueAt(fila,0));
            
            Double x=Double.parseDouble((String)modelo.getValueAt(fila, 2));
            nota=Double.valueOf(x);
            ins.setMateria(materia);
            ins.setNota(nota);
            Inscripcion inscr = new Inscripcion(alumno, materia, 2);
            inscripcionData.actualizarNota(ins);
            JOptionPane.showMessageDialog(this, "Nota actualizada");
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una materia");
        }
        }catch (NumberFormatException n) {
            //VALIDAR CODIGO
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero válido ");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumnos> jcAlumno;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Nota");
    jtTabla.setModel(modelo);
}
 public void cargarAlumnos(){
    for(Alumnos alu : aluData.listarAlumnos()){
        jcAlumno.addItem(alu);}
}
     private void borrarFilas(){
    int filas= jtTabla.getRowCount()-1;
    
    for(int f=filas;f>=0; f--){
        modelo.removeRow(f);
    }
     }
}






