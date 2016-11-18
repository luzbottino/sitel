/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.view;

import br.com.lbottino.sitel.service.ThreadUpload;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author pig
 */
public class FRMPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FRMPrincipal
     */
    public FRMPrincipal() {
        initComponents();
        hideComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupFebrabam = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        pnlUploadFatura = new javax.swing.JPanel();
        tfFilePath = new javax.swing.JTextField();
        lblFilePath = new javax.swing.JLabel();
        btnOpenFile = new javax.swing.JButton();
        lblContrato = new javax.swing.JLabel();
        cbContrato = new javax.swing.JComboBox();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSubmit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mbPrincipal = new javax.swing.JMenuBar();
        mFinanceiro = new javax.swing.JMenu();
        mFatura = new javax.swing.JMenu();
        miUploadFatura = new javax.swing.JMenuItem();
        mConfiguracao = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(20, 67, 122));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(800, 654));

        pnlUploadFatura.setBackground(new java.awt.Color(254, 254, 254));
        pnlUploadFatura.setBorder(null);
        pnlUploadFatura.setForeground(new java.awt.Color(128, 134, 226));

        tfFilePath.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        lblFilePath.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        lblFilePath.setForeground(new java.awt.Color(118, 118, 118));
        lblFilePath.setText("Arquivo");

        btnOpenFile.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOpenFile.setText("Abrir Arquivo");
        btnOpenFile.setPreferredSize(new java.awt.Dimension(120, 30));
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        lblContrato.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        lblContrato.setForeground(new java.awt.Color(118, 118, 118));
        lblContrato.setText("Selecione o contrato da fatura");

        cbContrato.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        cbContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(148, 146, 154));
        lblTitle.setText("Upload de Fatura");

        jSeparator1.setForeground(new java.awt.Color(186, 185, 188));

        btnSubmit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSubmit.setText("Gravar");
        btnSubmit.setPreferredSize(new java.awt.Dimension(120, 30));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(186, 185, 188));

        javax.swing.GroupLayout pnlUploadFaturaLayout = new javax.swing.GroupLayout(pnlUploadFatura);
        pnlUploadFatura.setLayout(pnlUploadFaturaLayout);
        pnlUploadFaturaLayout.setHorizontalGroup(
            pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                        .addGroup(pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUploadFaturaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitle))
                            .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                                .addGroup(pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContrato)
                                    .addComponent(lblFilePath)
                                    .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 183, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                        .addGroup(pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUploadFaturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlUploadFaturaLayout.setVerticalGroup(
            pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lblTitle)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblFilePath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(pnlUploadFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUploadFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254), 3));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/luis/develop/lab/swing/sitel-app/sitel/images/logos/2-logo-tst.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        mbPrincipal.setBackground(new java.awt.Color(254, 254, 254));
        mbPrincipal.setForeground(new java.awt.Color(254, 254, 254));
        mbPrincipal.setPreferredSize(new java.awt.Dimension(275, 30));

        mFinanceiro.setBackground(new java.awt.Color(205, 205, 205));
        mFinanceiro.setForeground(new java.awt.Color(82, 88, 92));
        mFinanceiro.setText("Financeiro");
        mFinanceiro.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        mbPrincipal.add(mFinanceiro);

        mFatura.setBackground(new java.awt.Color(205, 205, 205));
        mFatura.setForeground(new java.awt.Color(82, 88, 92));
        mFatura.setText("Fatura");
        mFatura.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        miUploadFatura.setText("Upload de Fatura");
        miUploadFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUploadFaturaActionPerformed(evt);
            }
        });
        mFatura.add(miUploadFatura);

        mbPrincipal.add(mFatura);

        mConfiguracao.setBackground(new java.awt.Color(205, 205, 205));
        mConfiguracao.setForeground(new java.awt.Color(82, 88, 92));
        mConfiguracao.setText("Configuração");
        mConfiguracao.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        mbPrincipal.add(mConfiguracao);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miUploadFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUploadFaturaActionPerformed

        pnlUploadFatura.setVisible(true);
    }//GEN-LAST:event_miUploadFaturaActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            tfFilePath.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }else{
            fileChooser = null;
        }

    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            if (fileChooser != null) {
                readFatura(fileChooser);
            }else{
                JOptionPane.showMessageDialog(this, "Abra o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FRMPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(FRMPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private JFileChooser fileChooser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupFebrabam;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenu mConfiguracao;
    private javax.swing.JMenu mFatura;
    private javax.swing.JMenu mFinanceiro;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miUploadFatura;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlUploadFatura;
    private javax.swing.JTextField tfFilePath;
    // End of variables declaration//GEN-END:variables

    private void hideComponents() {
        pnlUploadFatura.setVisible(false);
    }

    private void readFatura(JFileChooser fileChooser) throws IOException, ParseException {

        String path = fileChooser.getSelectedFile().getAbsolutePath();

        new Thread(new ThreadUpload(path)).start();

    }
}
