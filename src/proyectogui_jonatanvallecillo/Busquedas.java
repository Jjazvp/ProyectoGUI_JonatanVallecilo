package proyectogui_jonatanvallecillo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Busquedas extends javax.swing.JPanel {

    static DefaultTableModel tabla = new DefaultTableModel();
    static ArrayList <Estudiante> estudiantes;
    
    public Busquedas(ArrayList <Estudiante> estudiantes){
        initComponents();
        this.estudiantes = estudiantes;
        
        String atributos [] = {"Cuenta", "Codigo", "Año", "Seccion"};
        tabla.setColumnIdentifiers(atributos);
        
        Tabla.setModel(tabla);
    }
    
    public static void yo(ArrayList <Estudiante> estudiantes){
        Estudiante estudiante = new Estudiante();
        String nc = estudiante.getNumeroCuenta();
        JOptionPane.showMessageDialog(null, nc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BarraDeBusqueda = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese la búqueda que desea");

        BarraDeBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        BarraDeBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BarraDeBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        BarraDeBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraDeBusquedaActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(51, 51, 255));
        Buscar.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorder(null);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("cuenta, codigo, año, seccion*");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addComponent(BarraDeBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraDeBusqueda)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        tabla.setRowCount(0);
        Tabla.setModel(tabla);
        String busqueda = BarraDeBusqueda.getText();
        String atributo = "";
        String operacion = "";
        String valor = "";
        
        int cont = 0;
        for(int i = 0; i < busqueda.length(); i++){
            if(busqueda.charAt(i) != ' ' && cont == 0){
                atributo += busqueda.charAt(i);
            }else if(busqueda.charAt(i) == ' ' && cont == 0){
                cont ++;
            }else if(busqueda.charAt(i) != ' ' && cont == 1){
                operacion += busqueda.charAt(i);
            }else if(busqueda.charAt(i) == ' ' && cont == 1){
                cont ++;
            }else if(busqueda.charAt(i) != ' ' && cont == 2){
                valor += busqueda.charAt(i);
            }else if(busqueda.charAt(i) == ' ' && cont == 2){
                cont ++;
            }
        }
        
        if(atributo.equals("cuenta") && valor.length() == 8){
            if(operacion.equals("=")){
                igual(estudiantes, atributo, valor);
            }else if(operacion.equals("!=")){
                desigual(estudiantes, atributo, valor);
            }else{
                JOptionPane.showMessageDialog(null, "Parametro invalido.* Intente de nuevo.");
            }
        }else if(atributo.equals("codigo") && valor.length() == 6){
            if(operacion.equals("=")){
                igual(estudiantes, atributo, valor);
            }else if(operacion.equals("!=")){
                desigual(estudiantes, atributo, valor);
            }else{
                JOptionPane.showMessageDialog(null, "Parametro invalido.* Intente de nuevo.");
            }
        }else if(atributo.equals("año") && valor.length() == 4){
            if(operacion.equals("=")){
                igual(estudiantes, atributo, valor);
            }else if(operacion.equals("!=")){
                desigual(estudiantes, atributo, valor);
            }else{
                JOptionPane.showMessageDialog(null, "Parametro invalido.* Intente de nuevo.");
            }
        }else if(atributo.equals("seccion") && valor.length() == 3){
            if(operacion.equals("=")){
                igual(estudiantes, atributo, valor);
            }else if(operacion.equals("!=")){
                desigual(estudiantes, atributo, valor);
            }else{
                JOptionPane.showMessageDialog(null, "Parametro invalido.* Intente de nuevo.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Parametro invalido.* Intente de nuevo.");
            BarraDeBusqueda.setText("");
        }
        
        BarraDeBusqueda.setText("");
    }//GEN-LAST:event_BuscarActionPerformed

    public static void igual(ArrayList estudiantes, String atributo, String valor){
        Estudiante estudiante = new Estudiante();
        
        int valor2 = 0;
        String codletras = "";
        String codletras2 = "";
        int codnumeros = 0;
        if(atributo.equals("codigo")){
            codletras = valor.substring(0, 2);
            codletras2 = codletras.toUpperCase();
            codnumeros = Integer.parseInt(valor.substring(3, 5));
        }else{
            valor2 = Integer.parseInt(valor);
        }
        
        for(int i = 0; i < estudiantes.size(); i++){
            estudiante = (Estudiante) estudiantes.get(i);
            
            String codletras3 = " ";
            String codletras4 = "";
            int codnumeros2 = 1;
            if(atributo.equals("codigo")){
                codletras3 = estudiante.getCodigoClase().substring(0, 2);
                codletras4 = codletras3.toUpperCase();
                codnumeros2 = Integer.parseInt(estudiante.getCodigoClase().substring(3, 5));
            }
            
            if(estudiante.getNumeroCuenta().equals(valor) || estudiante.getCodigoClase().equals(valor) || estudiante.getAño() == valor2 || estudiante.getNumSec() == valor2
                    || (codletras2.equals(codletras4) && (codnumeros == codnumeros2))){
                tabla.addRow(new Object[]{
                    estudiante.getNumeroCuenta(), estudiante.getCodigoClase(), estudiante.getAño(), estudiante.getNumSec()
                });
                Tabla.setModel(tabla);
            }
        }
    }
    
    public static void desigual(ArrayList estudiantes, String atributo, String valor){
        Estudiante estudiante = new Estudiante();
        
        int valor2 = 0;
        String codletras = "";
        int codletras2 = 0;
        int codnumeros = 0;
        if(atributo.equals("codigo")){
            codletras = valor.substring(0, 2);
            char carac = ' ';
            for(int i = 0; i < codletras.length(); i++){
                carac = codletras.charAt(i);
                codletras2 = (int) carac;
            }
            codnumeros = Integer.parseInt(valor.substring(3, 5));
        }else{
            valor2 = Integer.parseInt(valor);
        }
        
        int cuenta = 0;
        for(int i = 0; i < estudiantes.size(); i++){
            estudiante = (Estudiante) estudiantes.get(i);
            
            String codletras3 = " ";
            String codletras4 = "";
            int codletras5 = 0;
            int codnumeros2 = 1;
            if(atributo.equals("codigo")){
                codletras3 = estudiante.getCodigoClase().substring(0, 2);
                codletras4 = codletras3.toUpperCase();
                char carac = ' ';
                for(int j = 0; j < codletras4.length(); j++){
                    carac = codletras4.charAt(i);
                    codletras5 += (int) carac;
                }
                codnumeros2 = Integer.parseInt(estudiante.getCodigoClase().substring(3, 5));
            }
            
            cuenta = Integer.parseInt(estudiante.getNumeroCuenta()); 
            if(cuenta != valor2 && atributo.equals("cuenta")){
                tabla.addRow(new Object[]{
                    estudiante.getNumeroCuenta(), estudiante.getCodigoClase(), estudiante.getAño(), estudiante.getNumSec()
                });
                Tabla.setModel(tabla);
            }else if((codletras2 != codletras5 && codnumeros != codnumeros2) && atributo.equals("codigo")){
                tabla.addRow(new Object[]{
                    estudiante.getNumeroCuenta(), estudiante.getCodigoClase(), estudiante.getAño(), estudiante.getNumSec()
                });
                Tabla.setModel(tabla);
            }else if(estudiante.getAño() != valor2 && atributo.equals("año")){
                tabla.addRow(new Object[]{
                    estudiante.getNumeroCuenta(), estudiante.getCodigoClase(), estudiante.getAño(), estudiante.getNumSec()
                });
                Tabla.setModel(tabla);
            }else if(estudiante.getNumSec() != valor2 && atributo.equals("seccion")){
                tabla.addRow(new Object[]{
                    estudiante.getNumeroCuenta(), estudiante.getCodigoClase(), estudiante.getAño(), estudiante.getNumSec()
                });
                Tabla.setModel(tabla);
            }
        }
    }
    
    private void BarraDeBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraDeBusquedaActionPerformed
        
    }//GEN-LAST:event_BarraDeBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraDeBusqueda;
    private javax.swing.JButton Buscar;
    private static javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
