/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.service;

import br.com.lbottino.sitel.model.BilheteV2;
import br.com.lbottino.sitel.model.EnderecoV2;
import br.com.lbottino.sitel.model.HeaderV2;
import br.com.lbottino.sitel.model.ResumoV2;
import br.com.lbottino.sitel.model.ServicoV2;
import br.com.lbottino.sitel.view.FRMPrincipal;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.ProgressMonitorInputStream;

/**
 *
 * @author luis
 */
public class ThreadUpload implements Runnable {

    private static String path;

    public ThreadUpload(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        try {
            processaFatura();

        } catch (ParseException ex) {
            Logger.getLogger(ThreadUpload.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThreadUpload.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ThreadUpload.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void processaFatura() throws ParseException, FileNotFoundException, IOException {

        InputStream inputStream = new BufferedInputStream(new ProgressMonitorInputStream(new JFrame(), "Lendo " + path, new FileInputStream(path)));
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        String line;

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

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
                    } else if (line.substring(0, 1).equals("2")) {
                        buildEndereco(line);
                    } else if (line.substring(0, 1).equals("3")) {
                        buildBilhete(line);
                    } else if (line.substring(0, 1).equals("4")) {
                        buildServico(line);
                    }

                    line = bufferedReader.readLine();
                }
                bufferedReader.close();
                inputStream.close();
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

        //System.out.println(headerV2.toString());
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
        resumoV2.setValConsumo(parseToBigDecimalVal(resumo.substring(231, 244)));
        resumoV2.setCodSinalAss(resumo.charAt(244));
        resumoV2.setValAssinatura(parseToBigDecimalVal(resumo.substring(245, 258)));
        resumoV2.setPctAliquota(resumo.substring(258, 260));
        resumoV2.setCodSinalIcms(resumo.charAt(260));
        resumoV2.setValIcms(parseToBigDecimalVal(resumo.substring(261, 274)));
        resumoV2.setCodSinalValTotalOutrosImpostos(resumo.charAt(274));
        resumoV2.setValTotalImpostos(parseToBigDecimalVal(resumo.substring(275, 288)));
        resumoV2.setCodNotaFiscal(resumo.substring(288, 300));
        resumoV2.setCodSinalValConta(resumo.charAt(300));
        resumoV2.setValConta(parseToBigDecimalVal(resumo.substring(301, 314)));

        //System.out.println(resumoV2.toString());
    }

    private void buildEndereco(String endereco) {
        EnderecoV2 enderecoV2 = new EnderecoV2();

        enderecoV2.setCodTipoRegistro(endereco.substring(0, 1));
        enderecoV2.setCodControleGravacao(endereco.substring(1, 13));
        enderecoV2.setCodIdentUnicoRecurso(endereco.substring(13, 38));
        enderecoV2.setCodDdd(endereco.substring(38, 40));
        enderecoV2.setCodTelefone(endereco.substring(40, 50));
        enderecoV2.setNomRecurso(endereco.substring(50, 65));
        enderecoV2.setCodCnlEnderecoA(endereco.substring(65, 70));
        enderecoV2.setNomLocalidadeA(endereco.substring(70, 90));
        enderecoV2.setCodUfLocalidadeA(endereco.substring(90, 92));
        enderecoV2.setDescEnderecoA(endereco.substring(92, 122));
        enderecoV2.setNumEnderecoA(endereco.substring(122, 127));
        enderecoV2.setDescComplementoA(endereco.substring(127, 137));
        enderecoV2.setDescBairroA(endereco.substring(137, 157));
        enderecoV2.setCodCnlEnderecoB(endereco.substring(157, 162));
        enderecoV2.setNomLocalidadeB(endereco.substring(162, 182));
        enderecoV2.setCodUfLocalidadeB(endereco.substring(182, 184));
        enderecoV2.setDescEnderecoB(endereco.substring(184, 214));
        enderecoV2.setNumEnderecoB(endereco.substring(214, 219));
        enderecoV2.setDescComplementoB(endereco.substring(219, 229));
        enderecoV2.setDescBairroB(endereco.substring(229, 249));

        //System.out.println(enderecoV2.toString());
    }

    private void buildBilhete(String bilhete) throws ParseException {
        BilheteV2 bilheteV2 = new BilheteV2();

        bilheteV2.setCodTipoRegistro(bilhete.substring(0, 1));
        bilheteV2.setCodControleGravacao(bilhete.substring(1, 13));
        bilheteV2.setDtaVencimento(parseToDate(bilhete.substring(13, 21)));
        bilheteV2.setDtaEmissao(parseToDate(bilhete.substring(21, 29)));
        bilheteV2.setCodIdentUnicoRecurso(bilhete.substring(29, 54));
        bilheteV2.setCodCnlRecursoRef(Integer.parseInt(bilhete.substring(54, 59)));
        bilheteV2.setCodDdd(bilhete.substring(59, 61));
        bilheteV2.setCodTelefone(bilhete.substring(61, 71));
        bilheteV2.setNomRecurso(bilhete.substring(71, 86));
        bilheteV2.setCodDegrau(bilhete.substring(86, 88));
        bilheteV2.setDtaLigacao(parseToDate(bilhete.substring(88, 96)));
        bilheteV2.setCodCnlDestino(Integer.parseInt(bilhete.substring(96, 98)));
        bilheteV2.setNomLocalidadeDestino(bilhete.substring(101, 126));
        bilheteV2.setCodUfDestino(bilhete.substring(126, 128));
        bilheteV2.setCodInternacionalNacional(bilhete.substring(128, 130));
        bilheteV2.setCodOperadora(bilhete.substring(130, 132));
        bilheteV2.setDescOperadora(bilhete.substring(132, 152));
        bilheteV2.setCodPaisDestino(bilhete.substring(152, 155));
        bilheteV2.setCodAreaDdd(bilhete.substring(155, 159));
        bilheteV2.setCodTelefoneDestino(bilhete.substring(159, 169));
        bilheteV2.setCodConjugadoNumOrigem(bilhete.substring(169, 171));
        bilheteV2.setNumDuracaoLigacao(parseToBigDecimalDuration(bilhete.substring(171, 177)));
        bilheteV2.setNomCategoria(bilhete.substring(177, 180));
        bilheteV2.setDescCategoria(bilhete.substring(180, 230));
        bilheteV2.setHorLigacao(parseToHour(bilhete.substring(230, 236)));
        bilheteV2.setCodTipoChamada(bilhete.substring(236, 237));
        bilheteV2.setCodGrupoHorarioTarifario(bilhete.substring(237, 238));
        bilheteV2.setDescGrupoHorarioTarifario(bilhete.substring(238, 263));
        bilheteV2.setCodDegrauLigacao(Integer.parseInt(bilhete.substring(263, 265)));
        bilheteV2.setCodSinalValLigacao(bilhete.charAt(265));
        bilheteV2.setValAliquotaIcms(parseToBigDecimalPercent(bilhete.substring(266, 271)));
        bilheteV2.setValLigacaoComImposto(parseToBigDecimalVal(bilhete.substring(271, 284)));
        bilheteV2.setCodClasseServico(Integer.parseInt(bilhete.substring(284, 289)));

        //System.out.println(bilheteV2.toString());
    }

    private void buildServico(String servico) throws ParseException {
        ServicoV2 servicoV2 = new ServicoV2();
        
        //servicoV2.set(servico.substring(0, 0));
        servicoV2.setCodTipoRegistro(servico.substring(0, 1));
        servicoV2.setCodControleGravacao(servico.substring(1, 13));
        servicoV2.setDtaVencimento(parseToDate(servico.substring(13, 21)));
        servicoV2.setDtaEmissao(parseToDate(servico.substring(21, 29)));
        servicoV2.setCodIdentUnicoRecurso(servico.substring(29, 54));
        servicoV2.setCodCnlRecursoRef(Integer.parseInt(servico.substring(54, 59)));
        servicoV2.setCodDdd(servico.substring(59, 61));
        servicoV2.setCodTelefone(servico.substring(61, 71));
        servicoV2.setNomRecurso(servico.substring(71, 86));
        servicoV2.setDtaServico(parseToDate(servico.substring(86, 94)));
        servicoV2.setCodCnlDestino(Integer.parseInt(servico.substring(94, 99)));
        servicoV2.setNomLocalidadeDestino(servico.substring(99, 124));
        servicoV2.setCodUfDestino(servico.substring(124, 126));
        servicoV2.setCodInternacionalNacional(servico.substring(126, 128));
        servicoV2.setCodOperadora(servico.substring(128, 130));
        servicoV2.setDescOperadora(servico.substring(130, 150));
        servicoV2.setCodPaisDestino(servico.substring(150, 153));
        servicoV2.setCodAreaDdd(servico.substring(153, 157));
        servicoV2.setCodTelefoneDestino(servico.substring(157, 167));
        servicoV2.setCodConjugadoNumDestino(servico.substring(167, 169));
        servicoV2.setNumDuracaoLigacao(parseToBigDecimalDuration(servico.substring(169, 175)));               
        //servicoV2.set(servico.substring(0, 0));
        
        System.out.println(servicoV2.toString());
        
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

    private Date parseToHour(String hourFormat) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH" + ":" + "mm" + ":" + "ss");
        if (!hourFormat.equals("000000")) {
            String hour = hourFormat.substring(0, 2);
            String minute = hourFormat.substring(2, 4);
            String seconds = hourFormat.substring(4, 6);
            Date date = format.parse(hour + ":" + minute + ":" + seconds);
            return date;
        }
        return null;
    }

    private BigDecimal parseToBigDecimalVal(String bigDecimalFormat) {
        String beforeComma = bigDecimalFormat.substring(0, 11);
        String afterComma = bigDecimalFormat.substring(11, 13);

        BigDecimal bigDecimal = new BigDecimal(beforeComma + "." + afterComma);

        return bigDecimal;
    }

    private BigDecimal parseToBigDecimalDuration(String bigDecimalFormat) {
        String beforeComma = bigDecimalFormat.substring(0, 5);
        String afterComma = bigDecimalFormat.substring(5, 6);

        BigDecimal bigDecimal = new BigDecimal(beforeComma + "." + afterComma);

        return bigDecimal;
    }

    private BigDecimal parseToBigDecimalPercent(String bigDecimalFormat) {
        String beforeComma = bigDecimalFormat.substring(0, 3);
        String afterComma = bigDecimalFormat.substring(3, 5);

        BigDecimal bigDecimal = new BigDecimal(beforeComma + "." + afterComma);

        return bigDecimal;
    }


}
