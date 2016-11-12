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
 * @author pig
 */
@Entity
@Table(name = "TRAILLER_V2")
public class TraillerV2 implements Serializable{

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
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_VENCIMENTO")
    private Date dtaVencimento;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_EMISSAO")
    private Date dtaEmissao;
    @Column(name = "QTD_REGISTRO")
    private Integer qtdRegistros;
    @Column(name = "QTD_LINHA_TELEFONICA")
    private Integer qtdLinhasTelefonicas;
    @Column(name = "COD_SINAL_TOTAL")
    private char codSinalTotal;
    @Column(name = "VAL_TOTAL", precision = 11, scale = 2)
    private BigDecimal valTotal;

    public TraillerV2() {
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

    public Integer getQtdRegistros() {
        return qtdRegistros;
    }

    public void setQtdRegistros(Integer qtdRegistros) {
        this.qtdRegistros = qtdRegistros;
    }

    public Integer getQtdLinhasTelefonicas() {
        return qtdLinhasTelefonicas;
    }

    public void setQtdLinhasTelefonicas(Integer qtdLinhasTelefonicas) {
        this.qtdLinhasTelefonicas = qtdLinhasTelefonicas;
    }

    public char getCodSinalTotal() {
        return codSinalTotal;
    }

    public void setCodSinalTotal(char codSinalTotal) {
        this.codSinalTotal = codSinalTotal;
    }

    public BigDecimal getValTotal() {
        return valTotal;
    }

    public void setValTotal(BigDecimal valTotal) {
        this.valTotal = valTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TraillerV2 other = (TraillerV2) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TraillerV2{" + "codTipoRegistro=" + codTipoRegistro + ", codControleGravacao=" + codControleGravacao + ", codIdentContaUnica=" + codIdentContaUnica + ", dtaVencimento=" + dtaVencimento + ", dtaEmissao=" + dtaEmissao + ", qtdRegistros=" + qtdRegistros + ", qtdLinhasTelefonicas=" + qtdLinhasTelefonicas + ", codSinalTotal=" + codSinalTotal + ", valTotal=" + valTotal + '}';
    }

}
