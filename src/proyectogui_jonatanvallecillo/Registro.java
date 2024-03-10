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

        jDialog1 = new javax.swing.JDialog();
        contenedor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Inicio = new javax.swing.JButton();
        Busquedas = new javax.swing.JButton();
        Conteo = new javax.swing.JButton();
        RegistrarAlumno = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setMinimumSize(new java.awt.Dimension(392, 408));
        contenedor.setPreferredSize(new java.awt.Dimension(392, 408));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui_jonatanvallecillo/hawie.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido jaguar!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
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
                    .addComponent(RegistrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(Conteo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, Short.MAX_VALUE)
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
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAlumnoActionPerformed
        RegistroAlumno regAlum = new RegistroAlumno(estudiantes);
        regAlum.setSize(472,408);
        regAlum.setLocation(0,0);
        
        contenedor.removeAll(); //Insertar la interfaz de la clase RegistrarAlumno dentro del panel de Registro
        contenedor.add(regAlum); //Insertar la interfaz de la clase RegistrarAlumno dentro del panel de Registro
        contenedor.revalidate(); //Insertar la interfaz de la clase RegistrarAlumno dentro del panel de Registro
        contenedor.repaint(); //Insertar la interfaz de la clase RegistrarAlumno dentro del panel de Registro
    }//GEN-LAST:event_RegistrarAlumnoActionPerformed

    private void BusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedasActionPerformed
        Busquedas busquedas = new Busquedas(estudiantes);
        busquedas.setSize(472,408);
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
        inicio.setSize(472,408);
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
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
