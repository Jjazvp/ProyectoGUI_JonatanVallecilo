package proyectogui_jonatanvallecillo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
    
    ArrayList <Estudiante> estudiantes = new ArrayList <Estudiante>();
    
    public Registro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Inicio = new javax.swing.JButton();
        Busquedas = new javax.swing.JButton();
        Conteo = new javax.swing.JButton();
        RegistrarAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setMinimumSize(new java.awt.Dimension(392, 408));
        contenedor.setPreferredSize(new java.awt.Dimension(392, 408));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido jaguar!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui_jonatanvallecillo/hawie.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(102, 102, 102))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        Inicio.setBackground(new java.awt.Color(0, 0, 102));
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui_jonatanvallecillo/unitec_logo.jpg"))); // NOI18N
        Inicio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        Busquedas.setBackground(new java.awt.Color(0, 0, 102));
        Busquedas.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        Busquedas.setForeground(new java.awt.Color(255, 255, 255));
        Busquedas.setText("Búsquedas");
        Busquedas.setBorder(null);
        Busquedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedasActionPerformed(evt);
            }
        });

        Conteo.setBackground(new java.awt.Color(0, 0, 102));
        Conteo.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        Conteo.setForeground(new java.awt.Color(255, 255, 255));
        Conteo.setText("Conteo");
        Conteo.setBorder(null);
        Conteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConteoActionPerformed(evt);
            }
        });

        RegistrarAlumno.setBackground(new java.awt.Color(0, 0, 102));
        RegistrarAlumno.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        RegistrarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarAlumno.setText("Registrar Alumno");
        RegistrarAlumno.setBorder(null);
        RegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Busquedas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Conteo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(RegistrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Busquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Conteo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAlumnoActionPerformed
        RegistroAlumno regAlum = new RegistroAlumno(estudiantes);
        regAlum.setSize(391,408);
        regAlum.setLocation(0,0);
        
        contenedor.removeAll();
        contenedor.add(regAlum);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_RegistrarAlumnoActionPerformed

    private void BusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedasActionPerformed
        Busquedas busquedas = new Busquedas(estudiantes);
        busquedas.setSize(391,408);
        busquedas.setLocation(0,0);
        
        contenedor.removeAll();
        contenedor.add(busquedas);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_BusquedasActionPerformed

    private void ConteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConteoActionPerformed
        ArrayList <String> cuentas1 = new ArrayList <String>();
        ArrayList <String> cuentas2 = new ArrayList <String>();
        for(int i = 0; i < estudiantes.size(); i++){
            Estudiante estudiante1 = estudiantes.get(i);
            cuentas1.add(estudiante1.getNumeroCuenta());
            cuentas2.add(estudiante1.getNumeroCuenta());
        }
        
        int size = cuentas2.size();
        int conteo = 0;
        String mensaje= "";
        String numcuenta1 = "";
        String numcuenta2 = "";
        
        if(cuentas1.size() > 0){
            for(int i = 0; i < cuentas1.size(); i++){
                numcuenta1 = cuentas1.get(i);
                conteo = 0;
                
                if(size > 0){
                    for(int j = 0; j < size; j++){
                        numcuenta2 = cuentas2.get(j);
                        if(numcuenta1.equals(numcuenta2)){
                            cuentas2.remove(j);
                            conteo ++;
                            j --;
                            size --;
                        }
                    }

                    if(conteo > 0){
                        mensaje += cuentas1.get(i)+" - "+conteo+"\n";
                    }
                }
            }
            
            JOptionPane.showMessageDialog(null,mensaje);
        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos, no hay datos registrados aun.");
        }
    }//GEN-LAST:event_ConteoActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        RegInicio inicio = new RegInicio();
        inicio.setSize(391,408);
        inicio.setLocation(0,0);
        
        contenedor.removeAll();
        contenedor.add(inicio);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_InicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busquedas;
    private javax.swing.JButton Conteo;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton RegistrarAlumno;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
