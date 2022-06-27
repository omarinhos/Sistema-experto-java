package vistas;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelos.Lista;
import modelos.Persona;
import modelos.Repertorio;
import modelos.Report;
import modelos.Respuestas;
import modelos.Resultados;
import servicios.IRegistroPersonas;
import servicios.IResultado;
import servicios.RegistroPersonaImp;
import servicios.ResultadoImp;

public class Main extends javax.swing.JFrame {

    IRegistroPersonas registro;
    Repertorio repertorio;
    Lista lista;

    Respuestas respuestas;

    IResultado resultado;
    Resultados arreglos;

    DefaultListModel<String> model1;
    DefaultListModel<String> model2;

    public Main() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        registro = new RegistroPersonaImp();
        repertorio = new Repertorio();
        lista = new Lista();

        resultado = new ResultadoImp();
        arreglos = new Resultados();

        model1 = new DefaultListModel<String>();
        model2 = new DefaultListModel<String>();

        lista1.setModel(model1);
        lista2.setModel(model2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Apellidos");

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombres");

        jLabel3.setText("Edad");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        btnProcesar.setText("Registrar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/3319965_avatar_doctor_human_man_occupation_icon (2).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("PREDIAGNOSTICO DE DIABETES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Registro", jPanel3);

        lista1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista1);

        lista2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lista2);

        jLabel6.setText("Apellidos");

        jLabel8.setText("Nombres");

        jLabel9.setText("Edad");

        jLabel10.setText("Porcentaje");

        jLabel11.setText("Tiene Diabetes");

        jLabel12.setText("Fecha");

        jLabel13.setText("Respuestas");

        jButton1.setText("Actualizasr Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar Archivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jTabbedPane4.addTab("Reporte", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        String apellidos;
        String nombre;
        int edad;
        int porcentaje;
        String tieneDiabetes;
        int puntos = 0;
        respuestas = new Respuestas();

        try {
            if (!txtNombres.getText().isEmpty() && !txtEdad.getText().isEmpty() && !txtApellidos.getText().isEmpty()) {

                for (String pregunta : arreglos.getPreguntas()) {
                    String opcion = (String) JOptionPane.showInputDialog(null, pregunta, "Elegir",
                            JOptionPane.QUESTION_MESSAGE, null, arreglos.getFrecuencia(), 
                            arreglos.getFrecuencia()[0]);
                    puntos += resultado.respuesta(opcion);
                    respuestas.agregarRespuesta(opcion);
                }

                lista.agregarRespuestas(respuestas);

                apellidos = txtApellidos.getText();
                nombre = txtNombres.getText();
                edad = Integer.parseInt(txtEdad.getText());
                porcentaje = resultado.porcentaje(puntos);
                tieneDiabetes = resultado.tieneDiabetes(porcentaje);

                registro.registroPersonas(new Persona(nombre, apellidos, edad, porcentaje, tieneDiabetes),
                        repertorio, lista);

                if (porcentaje > 50) {
                    JOptionPane.showMessageDialog(null, "Usted tiene presuntos sintomas de diabetes. \nLe"
                            + " recomendamos acercarse a un doctor y realizar los examenes");
                } else {
                    JOptionPane.showMessageDialog(null, "Usted no presenta sintomas de diabetes. \nLe"
                            + " recomendamos acercarse a un doctor y realizar los examenes para "
                            + "un diagnostico oompleto.");
                }

                model1.clear();
                for (int i = 0; i < repertorio.getRepertorio().size(); i++) {
                    model1.addElement(repertorio.getRepertorio().get(i).getApellidos() + " - "
                            + repertorio.getRepertorio().get(i).getNombres() + " - "
                            + repertorio.getRepertorio().get(i).getEdad() + " - "
                            + repertorio.getRepertorio().get(i).getPorcentaje() + "% - "
                            + repertorio.getRepertorio().get(i).getTieneDiabetes() + " - "
                            + repertorio.getRepertorio().get(i).getDate());
                }

            } else {
                JOptionPane.showMessageDialog(null, "LLenar los campos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccionar una opcion");
        }

        txtApellidos.setText("");
        txtNombres.setText("");
        txtEdad.setText("");

    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void lista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista1MouseClicked
        int x = lista1.getSelectedIndex();
        model2.removeAllElements();
        for (int i = 0; i < respuestas.getRespuestas().size(); i++) {
            model2.addElement(lista.getListas().get(x).getRespuestas().get(i));
        }
    }//GEN-LAST:event_lista1MouseClicked

    public int nuevosPuntos(ArrayList<String> r) {
        int puntos = 0;
        for (int i = 0; i < r.size(); i++) {
            puntos += resultado.respuesta(r.get(i));
        }
        return puntos;
    }

    private void lista2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista2MouseClicked

        try {
            int i = lista2.getSelectedIndex();
            int j = lista1.getSelectedIndex();

            String opcion = (String) JOptionPane.showInputDialog(null, arreglos.getPreguntas()[i], "Elegir",
                    JOptionPane.QUESTION_MESSAGE, null, arreglos.getFrecuencia(), arreglos.getFrecuencia()[0]);

            lista.getListas().get(j).editarRespuestas(opcion, i);
            repertorio.getRepertorio().get(j).setPorcentaje(resultado.porcentaje(nuevosPuntos(
                    lista.getListas().get(j).getRespuestas())));
            repertorio.getRepertorio().get(j).setTieneDiabetes(resultado.tieneDiabetes(
                    repertorio.getRepertorio().get(j).getPorcentaje())
            );

            //Solo Actualiza las listas 
            int x = lista1.getSelectedIndex();
            model2.removeAllElements();
            for (int k = 0; k < respuestas.getRespuestas().size(); k++) {
                model2.addElement(lista.getListas().get(x).getRespuestas().get(k));
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_lista2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model1.clear();
        for (int i = 0; i < repertorio.getRepertorio().size(); i++) {
            model1.addElement(repertorio.getRepertorio().get(i).getApellidos() + " - "
                    + repertorio.getRepertorio().get(i).getNombres() + " - "
                    + repertorio.getRepertorio().get(i).getEdad() + " - "
                    + repertorio.getRepertorio().get(i).getPorcentaje() + "% - "
                    + repertorio.getRepertorio().get(i).getTieneDiabetes() + " - "
                    + repertorio.getRepertorio().get(i).getDate());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Report report = new Report();
        report.setNameFile("reporte");
        report.setExtension("txt");
        report.setTitle(":: REPORTE ::");
        String contentReport = "Apellidos - Nombres - Edad - Porcentaje - Tiene Diabetes - Fecha\n\n";

        for (int i = 0; i < repertorio.getRepertorio().size(); i++) {
            contentReport += (repertorio.getRepertorio().get(i).getApellidos() + " - "
                    + repertorio.getRepertorio().get(i).getNombres() + " - "
                    + repertorio.getRepertorio().get(i).getEdad() + " - "
                    + repertorio.getRepertorio().get(i).getPorcentaje() + "% - "
                    + repertorio.getRepertorio().get(i).getTieneDiabetes() + " - "
                    + repertorio.getRepertorio().get(i).getDate());

            contentReport += "\n:: RESPUESTAS:: \n";
            for (int j = 0; j < respuestas.getRespuestas().size(); j++) {
                contentReport += (lista.getListas().get(i).getRespuestas().get(j)) + "\n";
            }
            contentReport += "------------------------------------------------------------\n\n";
        }

        report.setContent(contentReport);
        report.makeReport();
        System.out.println("Reporte generado");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
