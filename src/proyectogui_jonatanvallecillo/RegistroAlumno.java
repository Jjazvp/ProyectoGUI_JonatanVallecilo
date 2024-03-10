package proyectogui_jonatanvallecillo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroAlumno extends javax.swing.JPanel {

    ArrayList <Estudiante> estudiantes;

    public RegistroAlumno(ArrayList <Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
        initComponents();
    }
    
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textClase = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textAño = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textSeccion = new javax.swing.JTextField();
        Matricular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese número de cuenta.");

        textCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese código de clase. Ej.: LCP104");

        textClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel4.setText("Ingrese año de matrícula.");

        textAño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese número de sección.");

        textSeccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        Matricular.setBackground(new java.awt.Color(51, 51, 255));
        Matricular.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        Matricular.setForeground(new java.awt.Color(255, 255, 255));
        Matricular.setText("Matricular");
        Matricular.setBorder(null);
        Matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Matricular, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textClase)
                        .addComponent(textAño)
                        .addComponent(textSeccion)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Matricular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registra tus clases");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricularActionPerformed
        String numcuenta = textCuenta.getText();
        String codclase = textClase.getText();
        String año = textAño.getText();
        String numsec = textSeccion.getText();
        
        if(textCuenta.getText().isEmpty() || textClase.getText().isEmpty() || textAño.getText().isEmpty() || textSeccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar.* Intente de nuevo.");
            textCuenta.setText("");
            textClase.setText("");
            textAño.setText("");
            textSeccion.setText("");
        }else{
            
            int cont = 0;
            char carac = ' ';
            int num = 0;
            for(int i = 0; i < numcuenta.length(); i++){
                carac = numcuenta.charAt(i);
                num = (int) carac - 48;

                if((num >= 0) && num <= 10){
                    cont ++;
                }
            }
            
            if(numcuenta.length() == 8 && cont == 8){
                
                int cont1 = 0;
                int cont2 = 0;
                char caracter = ' ';
                String nuevocod = "";
                if(codclase.length() == 6){
                    for(int i = 0; i < codclase.length(); i++){
                        carac = codclase.charAt(i);
                        num = (int) carac;
                        if(num >= 97 && num <= 122 && (i == 0 || i == 1 || i == 2)){
                            nuevocod += carac;
                            nuevocod = nuevocod.toUpperCase();
                            cont1 ++;
                        }else if(num >= 48 && num <= 57 && (i == 3 || i == 4 || i == 5)){
                            cont2 ++;
                            nuevocod += carac;
                        }else if(num >= 65 && num <= 90){
                            nuevocod += carac;
                        }
                        num = (int) carac - 48;
                    }
                }
                
                if(cont1 == 3 && cont2 == 3){
                    if(año.length() == 4 && año.charAt(0) == '2' && año.charAt(1) == '0'){
                        
                        int cont3 = 0;
                        if(numsec.length() == 3){
                            for(int i = 0; i < numsec.length(); i++){
                                carac = numsec.charAt(i);
                                num = (int) carac;
                                if(num >= 48 && num <= 57){
                                    cont3 ++;
                                }
                            }
                        }
                        
                        if(cont3 == 3){
                            JOptionPane.showMessageDialog(null, "El estudiante se ha logrado matricular exitosamente.");
                            Estudiante estudiante = new Estudiante();

                            estudiante.setNumeroCuenta(textCuenta.getText());
                            estudiante.setCodigoClase(nuevocod);
                            estudiante.setAño(Integer.parseInt(textAño.getText().toString()));
                            estudiante.setNumSec(Integer.parseInt(textSeccion.getText().toString()));
                            estudiantes.add(estudiante);

                            textCuenta.setText("");
                            textClase.setText("");
                            textAño.setText("");
                            textSeccion.setText("");
                        }else{
                            JOptionPane.showMessageDialog(null, "Seccion invalida.* Intente de nuevo.");
                            textCuenta.setText("");
                            textClase.setText("");
                            textAño.setText("");
                            textSeccion.setText("");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Año invalido.* Intente de nuevo.");
                        textCuenta.setText("");
                        textClase.setText("");
                        textAño.setText("");
                        textSeccion.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Codigo de clase invalido.* Intente de nuevo.");
                        textCuenta.setText("");
                        textClase.setText("");
                        textAño.setText("");
                        textSeccion.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El numero de cuenta es invalido.* Intente de nuevo.");
                textCuenta.setText("");
                textClase.setText("");
                textAño.setText("");
                textSeccion.setText("");
            }
        }
    }//GEN-LAST:event_MatricularActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Matricular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textAño;
    private javax.swing.JTextField textClase;
    private javax.swing.JTextField textCuenta;
    private javax.swing.JTextField textSeccion;
    // End of variables declaration//GEN-END:variables
}
