/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luis
 */
@Entity
@Table(name = "RESUMO_V2")
public class ResumoV2 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COD_TIP_REG", length = 1)
    private String codTipoRegistro;
    @Column(name = "COD_CONTROLE_GRAVACAO", length = 12)
    private String codControleGravacao;
    @Column(name = "COD_IDENT_CONTA_UNICA", length = 15)
    private String codIdentContaUnica;
    @Column(name = "MES_ANO_REF", length = 10)
    private String mesAnoRef;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_VENCIMENTO")
    private Date dtaVencimento;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_EMISSAO")
    private Date dtaEmissao;
    @Column(name = "COD_IDENT_UNICO_RECURSO", length = 25)
    private String codIdentUnicoRecurso;
    @Column(name = "COD_CNL_RECURSO_REF", precision = 5)
    private Integer codCnlRecursoRef;
    @Column(name = "NOM_LOCALIDADE", length = 25)
    private String nomLocalidade;
    @Column(name = "COD_DDD", length = 2)
    private String codDdd;
    @Column(name = "COD_TELEFONE", length = 10)
    private String codTelefone;
    @Column(name = "COD_TIPO_SERVICO", length = 4)
    private String codTipoServico;
    @Column(name = "DES_TIPO_SERVICO", length = 35)
    private String desTipoServico;
    @Column(name = "NOM_RECURSO", length = 15)
    private String nomRecurso;
    @Column(name = "COD_DEGRAU", length = 2)
    private String codDegrau;
    @Column(name = "QTD_VELOCIDADE", length = 5)
    private String qtdVelocidade;
    @Column(name = "COD_UN_VELOCIDADE_RECURSO", length = 4)
    private String codUnVelocidadeRecurso;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_INICIO_ASS")
    private Date dtaInicioAss;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_FIM_ASS")
    private Date dtaFimAss;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_INICIO_SERVICO")
    private Date dtaInicioServico;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_FIM_SERVICO")
    private Date dtaFimServico;
    @Column(name = "COD_UN_CONSUMO", length = 5)
    private String codUnConsumo;
    @Column(name = "QTD_CONSUMO", precision = 7)
    private Integer qtdConsumo;
    @Column(name = "COD_SINAL_VAL_CONSUMO", length = 1)
    private char codSinalValConsumo;
    @Column(name = "VAL_CONSUMO", precision = 11, scale = 2)
    private BigDecimal valConsumo;
    @Column(name = "COD_SINAL_ASS", length = 1)
    private char codSinalAss;
    @Column(name = "VAL_ASS", precision = 11, scale = 2)
    private BigDecimal valAssinatura;
    @Column(name = "PCT_ALIQUOTA", length = 2)
    private String pctAliquota;
    @Column(name = "COD_SINAL_ICMS", length = 1)
    private char codSinalIcms;
    @Column(name = "VAL_ICMS", precision = 11, scale = 2)
    private BigDecimal valIcms;
    @Column(name = "COD_SINAL_VAL_TOTAL_OUTROS_IMPOSTOS", length = 1)
    private char codSinalValTotalOutrosImpostos;
    @Column(name = "VAL_TOTAL_IMPOSTOS", precision = 11, scale = 2)
    private BigDecimal valTotalImpostos;
    @Column(name = "COD_NOTA_FISCAL", length = 12)
    private String codNotaFiscal;
    @Column(name = "COD_SINAL_VAL_CONTA", length = 1)
    private char codSinalValConta;
    @Column(name = "VAL_CONTA", precision = 11, scale = 2)
    private BigDecimal valConta;

    public ResumoV2() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodTipoRegistro() {
        return codTipoRegistro;
    }

    public void setCodTipoRegistro(String codTipoRegistro) {
        this.codTipoRegistro = codTipoRegistro;
    }

    public String getCodControleGravacao() {
        return codControleGravacao;
    }

    public void setCodControleGravacao(String codControleGravacao) {
        this.codControleGravacao = codControleGravacao;
    }

    public String getCodIdentContaUnica() {
        return codIdentContaUnica;
    }

    public void setCodIdentContaUnica(String codIdentContaUnica) {
        this.codIdentContaUnica = codIdentContaUnica;
    }

    public Date getDtaVencimento() {
        return dtaVencimento;
    }

    public void setDtaVencimento(Date dtaVencimento) {
        this.dtaVencimento = dtaVencimento;
    }

    public Date getDtaEmissao() {
        return dtaEmissao;
    }

    public void setDtaEmissao(Date dtaEmissao) {
        this.dtaEmissao = dtaEmissao;
    }

    public String getCodIdentUnicoRecurso() {
        return codIdentUnicoRecurso;
    }

    public void setCodIdentUnicoRecurso(String codIdentUnicoRecurso) {
        this.codIdentUnicoRecurso = codIdentUnicoRecurso;
    }

    public Integer getCodCnlRecursoRef() {
        return codCnlRecursoRef;
    }

    public void setCodCnlRecursoRef(Integer codCnlRecursoRef) {
        this.codCnlRecursoRef = codCnlRecursoRef;
    }

    public String getNomLocalidade() {
        return nomLocalidade;
    }

    public void setNomLocalidade(String nomLocalidade) {
        this.nomLocalidade = nomLocalidade;
    }

    public String getCodDdd() {
        return codDdd;
    }

    public void setCodDdd(String codDdd) {
        this.codDdd = codDdd;
    }

    public String getCodTelefone() {
        return codTelefone;
    }

    public void setCodTelefone(String codTelefone) {
        this.codTelefone = codTelefone;
    }

    public String getCodTipoServico() {
        return codTipoServico;
    }

    public void setCodTipoServico(String codTipoServico) {
        this.codTipoServico = codTipoServico;
    }

    public String getDesTipoServico() {
        return desTipoServico;
    }

    public void setDesTipoServico(String desTipoServico) {
        this.desTipoServico = desTipoServico;
    }

    public String getNomRecurso() {
        return nomRecurso;
    }

    public void setNomRecurso(String nomRecurso) {
        this.nomRecurso = nomRecurso;
    }

    public String getCodDegrau() {
        return codDegrau;
    }

    public void setCodDegrau(String codDegrau) {
        this.codDegrau = codDegrau;
    }

    public String getQtdVelocidade() {
        return qtdVelocidade;
    }

    public void setQtdVelocidade(String qtdVelocidade) {
        this.qtdVelocidade = qtdVelocidade;
    }

    public String getCodUnVelocidadeRecurso() {
        return codUnVelocidadeRecurso;
    }

    public void setCodUnVelocidadeRecurso(String codUnVelocidadeRecurso) {
        this.codUnVelocidadeRecurso = codUnVelocidadeRecurso;
    }

    public Date getDtaInicioAss() {
        return dtaInicioAss;
    }

    public void setDtaInicioAss(Date dtaInicioAss) {
        this.dtaInicioAss = dtaInicioAss;
    }

    public Date getDtaFimAss() {
        return dtaFimAss;
    }

    public void setDtaFimAss(Date dtaFimAss) {
        this.dtaFimAss = dtaFimAss;
    }

    public Date getDtaInicioServico() {
        return dtaInicioServico;
    }

    public void setDtaInicioServico(Date dtaInicioServico) {
        this.dtaInicioServico = dtaInicioServico;
    }

    public Date getDtaFimServico() {
        return dtaFimServico;
    }

    public void setDtaFimServico(Date dtaFimServico) {
        this.dtaFimServico = dtaFimServico;
    }

    public String getCodUnConsumo() {
        return codUnConsumo;
    }

    public void setCodUnConsumo(String codUnConsumo) {
        this.codUnConsumo = codUnConsumo;
    }

    public Integer getQtdConsumo() {
        return qtdConsumo;
    }

    public void setQtdConsumo(Integer qtdConsumo) {
        this.qtdConsumo = qtdConsumo;
    }

    public char getCodSinalValConsumo() {
        return codSinalValConsumo;
    }

    public void setCodSinalValConsumo(char codSinalValConsumo) {
        this.codSinalValConsumo = codSinalValConsumo;
    }

    public BigDecimal getValConsumo() {
        return valConsumo;
    }

    public void setValConsumo(BigDecimal valConsumo) {
        this.valConsumo = valConsumo;
    }

    public char getCodSinalAss() {
        return codSinalAss;
    }

    public void setCodSinalAss(char codSinalAss) {
        this.codSinalAss = codSinalAss;
    }

    public BigDecimal getValAssinatura() {
        return valAssinatura;
    }

    public void setValAssinatura(BigDecimal valAssinatura) {
        this.valAssinatura = valAssinatura;
    }

    public String getPctAliquota() {
        return pctAliquota;
    }

    public void setPctAliquota(String pctAliquota) {
        this.pctAliquota = pctAliquota;
    }

    public char getCodSinalIcms() {
        return codSinalIcms;
    }

    public void setCodSinalIcms(char codSinalIcms) {
        this.codSinalIcms = codSinalIcms;
    }

    public BigDecimal getValIcms() {
        return valIcms;
    }

    public void setValIcms(BigDecimal valIcms) {
        this.valIcms = valIcms;
    }

    public char getCodSinalValTotalOutrosImpostos() {
        return codSinalValTotalOutrosImpostos;
    }

    public void setCodSinalValTotalOutrosImpostos(char codSinalValTotalOutrosImpostos) {
        this.codSinalValTotalOutrosImpostos = codSinalValTotalOutrosImpostos;
    }

    public BigDecimal getValTotalImpostos() {
        return valTotalImpostos;
    }

    public void setValTotalImpostos(BigDecimal valTotalImpostos) {
        this.valTotalImpostos = valTotalImpostos;
    }

    public String getCodNotaFiscal() {
        return codNotaFiscal;
    }

    public void setCodNotaFiscal(String codNotaFiscal) {
        this.codNotaFiscal = codNotaFiscal;
    }

    public char getCodSinalValConta() {
        return codSinalValConta;
    }

    public void setCodSinalValConta(char codSinalValConta) {
        this.codSinalValConta = codSinalValConta;
    }

    public BigDecimal getValConta() {
        return valConta;
    }

    public void setValConta(BigDecimal valConta) {
        this.valConta = valConta;
    }

    public String getMesAnoRef() {
        return mesAnoRef;
    }

    public void setMesAnoRef(String mesAnoRef) {
        this.mesAnoRef = mesAnoRef;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ResumoV2 other = (ResumoV2) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResumoV2{" + "codTipoRegistro=" + codTipoRegistro + ", codControleGravacao=" + codControleGravacao + ", codIdentContaUnica=" + codIdentContaUnica + ", mesAnoRef=" + mesAnoRef + ", dtaVencimento=" + dtaVencimento + ", dtaEmissao=" + dtaEmissao + ", codIdentUnicoRecurso=" + codIdentUnicoRecurso + ", codCnlRecursoRef=" + codCnlRecursoRef + ", nomLocalidade=" + nomLocalidade + ", codDdd=" + codDdd + ", codTelefone=" + codTelefone + ", codTipoServico=" + codTipoServico + ", desTipoServico=" + desTipoServico + ", nomRecurso=" + nomRecurso + ", codDegrau=" + codDegrau + ", qtdVelocidade=" + qtdVelocidade + ", codUnVelocidadeRecurso=" + codUnVelocidadeRecurso + ", dtaInicioAss=" + dtaInicioAss + ", dtaFimAss=" + dtaFimAss + ", dtaInicioServico=" + dtaInicioServico + ", dtaFimServico=" + dtaFimServico + ", codUnConsumo=" + codUnConsumo + ", qtdConsumo=" + qtdConsumo + ", codSinalValConsumo=" + codSinalValConsumo + ", valConsumo=" + valConsumo + ", codSinalAss=" + codSinalAss + ", valAssinatura=" + valAssinatura + ", pctAliquota=" + pctAliquota + ", codSinalIcms=" + codSinalIcms + ", valIcms=" + valIcms + ", codSinalValTotalOutrosImpostos=" + codSinalValTotalOutrosImpostos + ", valTotalImpostos=" + valTotalImpostos + ", codNotaFiscal=" + codNotaFiscal + ", codSinalValConta=" + codSinalValConta + ", valConta=" + valConta + '}';
    }

}
