/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.view;

import br.com.lbottino.sitel.dao.HeaderV2DAO;
import br.com.lbottino.sitel.dao.ResumoV2DAO;
import br.com.lbottino.sitel.model.HeaderV2;
import br.com.lbottino.sitel.model.ResumoV2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        pnlUploadFatura = new javax.swing.JPanel();
        tfFilePath = new javax.swing.JTextField();
        rdbFebrabamV2 = new javax.swing.JRadioButton();
        rdbFebrabamV3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lblFilePath = new javax.swing.JLabel();
        btnOpenFile = new javax.swing.JButton();
        lblContrato = new javax.swing.JLabel();
        cbContrato = new javax.swing.JComboBox();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mbPrincipal = new javax.swing.JMenuBar();
        mFinanceiro = new javax.swing.JMenu();
        mFatura = new javax.swing.JMenu();
        miUploadFatura = new javax.swing.JMenuItem();
        mConfiguracao = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 800));

        pnlUploadFatura.setBackground(new java.awt.Color(234, 234, 234));
        pnlUploadFatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191), 2));

        tfFilePath.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        btnGroupFebrabam.add(rdbFebrabamV2);
        rdbFebrabamV2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        rdbFebrabamV2.setText("Febrabam V2");

        btnGroupFebrabam.add(rdbFebrabamV3);
        rdbFebrabamV3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        rdbFebrabamV3.setText("Febrabam V3");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel2.setText("Selecione a versão do layout  Febrabam");

        lblFilePath.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        lblFilePath.setText("Arquivo");

        btnOpenFile.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        btnOpenFile.setText("Abrir Arquivo");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        lblContrato.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        lblContrato.setText("Selecione o contrato da fatura");

        cbContrato.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        cbContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitle.setText("Upload de Fatura");

        javax.swing.GroupLayout pnlUploadFaturaLayout = new javax.swing.GroupLayout(pnlUploadFatura);
        pnlUploadFatura.setLayout(pnlUploadFaturaLayout);
        pnlUploadFaturaLayout.setHorizontalGroup(
            pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                        .addGroup(pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                                .addComponent(tfFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOpenFile))
                            .addComponent(rdbFebrabamV2)
                            .addComponent(rdbFebrabamV3)
                            .addComponent(jLabel2)
                            .addComponent(lblContrato)
                            .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFilePath))
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUploadFaturaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlUploadFaturaLayout.setVerticalGroup(
            pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUploadFaturaLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblTitle)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbFebrabamV2)
                .addGap(18, 18, 18)
                .addComponent(rdbFebrabamV3)
                .addGap(18, 18, 18)
                .addComponent(lblContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFilePath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUploadFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenFile))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        mbPrincipal.setBackground(new java.awt.Color(234, 234, 234));

        mFinanceiro.setForeground(new java.awt.Color(1, 1, 1));
        mFinanceiro.setText("Financeiro");
        mFinanceiro.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        mbPrincipal.add(mFinanceiro);

        mFatura.setForeground(new java.awt.Color(1, 1, 1));
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

        mConfiguracao.setForeground(new java.awt.Color(1, 1, 1));
        mConfiguracao.setText("Configuração");
        mConfiguracao.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        mbPrincipal.add(mConfiguracao);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(pnlUploadFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUploadFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miUploadFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUploadFaturaActionPerformed
        pnlUploadFatura.setVisible(true);
    }//GEN-LAST:event_miUploadFaturaActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        final JFileChooser fileChooser = new JFileChooser();

        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                readFatura(fileChooser);
            } catch (IOException ex) {
                Logger.getLogger(FRMPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(FRMPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }

    }//GEN-LAST:event_btnOpenFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupFebrabam;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JComboBox cbContrato;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenu mConfiguracao;
    private javax.swing.JMenu mFatura;
    private javax.swing.JMenu mFinanceiro;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miUploadFatura;
    private javax.swing.JPanel pnlUploadFatura;
    private javax.swing.JRadioButton rdbFebrabamV2;
    private javax.swing.JRadioButton rdbFebrabamV3;
    private javax.swing.JTextField tfFilePath;
    // End of variables declaration//GEN-END:variables

    private void hideComponents() {
        pnlUploadFatura.setVisible(false);
    }

    private void readFatura(JFileChooser fileChooser) throws IOException, ParseException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileChooser.getSelectedFile().getAbsolutePath()));
            tfFilePath.setText(fileChooser.getSelectedFile().getAbsolutePath());

            processFatura(bufferedReader);

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FRMPrincipal.class.getName()).log(Level.SEVERE, e.getMessage(), e);
        }

    }

    private void processFatura(BufferedReader bufferedReader) throws ParseException {
        String line;
        try {
            line = bufferedReader.readLine();
            System.out.println(line.substring(164, 168));
            if (line.substring(164, 168).equals("V3R0")) {

            } else {
                while (line != null) {
                    if (line.substring(0, 1).equals("0")) {
                        buildHeaderV2(line);
                    } else if (line.substring(0, 1).equals("1")) {
                        buildResumo(line);
                    }
                    line = bufferedReader.readLine();
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(FRMPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buildHeaderV2(String header) throws ParseException {
        HeaderV2 headerV2 = new HeaderV2();
        headerV2.setCodTipoRegistro(header.substring(0, 1));
        headerV2.setCodControleGravacao(header.substring(1, 13));
        headerV2.setDtaGeracaoArq(parseToDate(header.substring(13, 21)));
        headerV2.setNomOperadora(header.substring(21, 36));
        headerV2.setNomUf(header.substring(36, 38));
        headerV2.setCodCliente(header.substring(38, 52));
        headerV2.setNomCliente(header.substring(52, 93));
        headerV2.setCodCgcCliente(header.substring(93, 108));
        headerV2.setCodIdentContaUnica(header.substring(108, 123));
        headerV2.setMesAnoRef(header.substring(123, 129));
        headerV2.setDtaVencimento(parseToDate(header.substring(133, 141)));
        headerV2.setDtaEmissao(parseToDate(header.substring(141, 149)));

        System.out.println(headerV2.toString());

    }

    private void buildResumo(String resumo) throws ParseException {
        ResumoV2 resumoV2 = new ResumoV2();

        resumoV2.setCodTipoRegistro(resumo.substring(0, 1));
        resumoV2.setCodControleGravacao(resumo.substring(1, 13));
        resumoV2.setCodIdentContaUnica(resumo.substring(13, 28));
        resumoV2.setMesAnoRef(resumo.substring(28, 38));
        resumoV2.setDtaVencimento(parseToDate(resumo.substring(38, 46)));
        resumoV2.setDtaEmissao(parseToDate(resumo.substring(46, 54)));
        resumoV2.setCodIdentUnicoRecurso(resumo.substring(54, 79));
        resumoV2.setCodCnlRecursoRef(Integer.parseInt(resumo.substring(79, 84)));
        resumoV2.setNomLocalidade(resumo.substring(84, 109));
        resumoV2.setCodDdd(resumo.substring(109, 111));
        resumoV2.setCodTelefone(resumo.substring(111, 121));
        resumoV2.setCodTipoServico(resumo.substring(121, 125));
        resumoV2.setDesTipoServico(resumo.substring(125, 160));
        resumoV2.setNomRecurso(resumo.substring(160, 175));
        resumoV2.setCodDegrau(resumo.substring(175, 177));
        resumoV2.setQtdVelocidade(resumo.substring(177, 182));
        resumoV2.setCodUnVelocidadeRecurso(resumo.substring(182, 186));
        resumoV2.setDtaInicioAss(parseToDate(resumo.substring(186, 194)));
        resumoV2.setDtaFimAss(parseToDate(resumo.substring(194, 202)));
        resumoV2.setDtaInicioServico(parseToDate(resumo.substring(202, 210)));
        resumoV2.setDtaFimServico(parseToDate(resumo.substring(210, 218)));
        resumoV2.setCodUnConsumo(resumo.substring(218, 223));
        resumoV2.setQtdConsumo(Integer.parseInt(resumo.substring(223, 230)));
        resumoV2.setCodSinalValConsumo(resumo.charAt(230));
        resumoV2.setValConsumo(parseToBigDecimal(resumo.substring(231, 244)));
        resumoV2.setCodSinalAss(resumo.charAt(244));
        resumoV2.setValAssinatura(parseToBigDecimal(resumo.substring(245, 258)));
        resumoV2.setPctAliquota(resumo.substring(258, 260));
        resumoV2.setCodSinalIcms(resumo.charAt(260));
        resumoV2.setValIcms(parseToBigDecimal(resumo.substring(261, 274)));
        resumoV2.setCodSinalValTotalOutrosImpostos(resumo.charAt(274));
        resumoV2.setValTotalImpostos(parseToBigDecimal(resumo.substring(275, 288)));
        resumoV2.setCodNotaFiscal(resumo.substring(288, 300));
        resumoV2.setCodSinalValConta(resumo.charAt(300));
        resumoV2.setValConta(parseToBigDecimal(resumo.substring(301, 314)));

        System.out.println(resumoV2.toString());

    }

    private Date parseToDate(String dateFormat) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy" + "-" + "MM" + "-" + "dd");
        if (!dateFormat.equals("00000000")) {
            String year = dateFormat.substring(0, 4);
            String month = dateFormat.substring(4, 6);
            String day = dateFormat.substring(6, 8);
            Date date = format.parse(year + "-" + month + "-" + day);
            return date;
        }
        return null;

    }

    private BigDecimal parseToBigDecimal(String bigDecimalFormat) {
        String beforeComma = bigDecimalFormat.substring(0, 11);
        String afterComma = bigDecimalFormat.substring(11, 13);

        BigDecimal bigDecimal = new BigDecimal(beforeComma + "." + afterComma);

        return bigDecimal;
    }

}
